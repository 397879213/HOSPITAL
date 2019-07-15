/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMT.Handler;

import BMT.BO.CompoundingBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Pacslink
 */
public class CompoundingHandler {

    public boolean updateCompoundStock(CompoundingBO compounding) {
        String query
                = " UPDATE " + Database.DCMS.storeWiseItems + "\n"
                + " SET QTY  = '" + compounding.getQuantity()+ "'\n"
                + " WHERE STORE_ID = '" + compounding.getStoreId() + "'"
                + " AND ITEM_ID = '" + compounding.getCompoundId()+ "'";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean updateAdditiveOfCompound(List<CompoundingBO> listCompounding) {
        boolean ret = true;

        for (int i = 0; i < listCompounding.size(); i++) {
            CompoundingBO compounding = listCompounding.get(i);

            String query
                    = " UPDATE " + Database.DCMS.storeWiseItems + "\n"
                    + " SET QTY  = QTY -  " + compounding.getUnitQuantity() + "\n"
                    + " WHERE STORE_ID = '" + compounding.getStoreId() + "'"
                    + " AND ITEM_ID = '" + compounding.getAdditiveId()+ "'";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
    
    public boolean updateItemQuantity(CompoundingBO compounding) {
        String query
                = " UPDATE " + Database.DCMS.storeWiseItems + "\n"
                + " SET QTY  = '" + compounding.getQuantity()+ "',\n"
                + " UNIT_QUANTITY  = '" + compounding.getUnitQuantity()+ "',\n"
                + " SALE_PRICE  = '" + compounding.getUnitCost()+ "'\n"
                + " WHERE STORE_ID = '" + compounding.getStoreId() + "'"
                + " AND ITEM_ID = '" + compounding.getItemId()+ "'";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean compoundAdditiveMaster(CompoundingBO comp) {

        String[] columns = {Database.DCMS.compoundAdditive,
            "STORE_ID", "COMPOUND_ID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("STORE_ID", "'" + comp.getStoreId() + "'");
        map.put("COMPOUND_ID", "'" + comp.getCompoundId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean compoundAdditiveDetail(List<CompoundingBO> listComp) {

        String[] columns = {Database.DCMS.compoundAdditiveDetail,
            "COMPOUND_ID", "ADDITIVE_ID", "VOLUME_USED", "TYPE_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listComp.size(); i++) {
            CompoundingBO comp = listComp.get(i);
            HashMap map = new HashMap();
            map.put("COMPOUND_ID", "'" + comp.getCompoundId() + "'");
            map.put("ADDITIVE_ID", "'" + comp.getAdditiveId() + "'");
            map.put("VOLUME_USED", "'" + comp.getVolumeUsed() + "'");
            map.put("TYPE_ID", "'" + comp.getTypeId() + "'");

            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }
    // ALSO DO SWI ASK
    public boolean updateCompoundPrice(CompoundingBO compounding) {
        String query
                = " UPDATE " + Database.DCMS.item + "\n"
                + " SET SALE_PRICE  = '" + compounding.getTotalAmount()+ "'\n"
                + " WHERE ID = '" + compounding.getCompoundId()+ "'";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean updateCompoundPriceInSWI(CompoundingBO compounding) {
        String query
                = " UPDATE " + Database.DCMS.storeWiseItems + "\n"
                + " SET SALE_PRICE  = '" + compounding.getTotalAmount()+ "'\n"
                + " WHERE STORE_ID = '" + compounding.getStoreId()+ "'"
                + " AND ITEM_ID = '" + compounding.getCompoundId()+ "'";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public List<CompoundingBO> selectDesignation(String compoundId,
            String storeId) {

        String[] selectColumns = {"-", "COMPOUND_ID", "ADDITIVE_ID",
            "VOLUME_USED", "ADDITIVE_NAME", "QTY"};

        String query
                = "SELECT CA.COMPOUND_ID, CAD.ADDITIVE_ID,                      \n"
                + " CAD.VOLUME_USED, SWI.QTY, ITM.DESCRIPTION ADDITIVE_NAME     \n"
                + "FROM " + Database.DCMS.compoundAdditive + " CA,             \n"
                + Database.DCMS.compoundAdditiveDetail + " CAD,       \n"
                + Database.DCMS.storeWiseItems + " SWI,              \n"
                + Database.DCMS.item + " ITM                         \n"
                + " WHERE CA.COMPOUND_ID = '" + compoundId + "'                 \n"
                + " AND SWI.STORE_ID = '" + storeId + "'                        \n"
                + " AND CA.COMPOUND_ID = CAD.COMPOUND_ID                        \n"
                + " AND ITM.ID = CAD.ADDITIVE_ID                                \n"
                + " AND CAD.ADDITIVE_ID = SWI.ITEM_ID                           \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<CompoundingBO> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            CompoundingBO setCompound = new CompoundingBO();

            setCompound.setCompoundId(map.get("COMPOUND_ID").toString());
            setCompound.setAdditiveId(map.get("ADDITIVE_ID").toString());
            setCompound.setAdditiveDescription(map.get("ADDITIVE_NAME").toString());
            setCompound.setVolumeUsed(map.get("VOLUME_USED").toString());
            setCompound.setQuantity(map.get("QTY").toString());
            list.add(setCompound);
        }
        return list;
    }
}

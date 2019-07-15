/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMT.Controller;

import BMT.BO.CompoundingBO;
import BMT.Handler.CompoundingHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Pacslink
 */
public class CompoundingController {
    CompoundingHandler hdlCompounding = new CompoundingHandler();
    
    public boolean updateCompoundStock(CompoundingBO compounding, 
            List<CompoundingBO> listCompounding) {
        boolean ret = hdlCompounding.updateCompoundStock(compounding);
        if(ret){
            ret = hdlCompounding.updateAdditiveOfCompound(listCompounding);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    //updateItemQuantity
    
     public boolean updateItemQuantity(CompoundingBO compounding) {
        boolean ret = hdlCompounding.updateItemQuantity(compounding);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean InsertCompounding(CompoundingBO compo, 
            List<CompoundingBO> list) {
        boolean ret = hdlCompounding.compoundAdditiveMaster(compo);
        if (ret) {
            ret = hdlCompounding.compoundAdditiveDetail(list);
        }
        if (ret) {
            ret = hdlCompounding.updateCompoundPrice(compo);
        }
        if (ret) {
            ret = hdlCompounding.updateCompoundPriceInSWI(compo);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<CompoundingBO> selectDesignation(String compoundId,
            String storeId) {
        return hdlCompounding.selectDesignation(compoundId, storeId);
    }
}

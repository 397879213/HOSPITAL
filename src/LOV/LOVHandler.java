/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOV;

import BO.MedicineOrderEntry;
import BO.OrderData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.SetupTableColumns;

/**
 *
 * @author Owne
 */
public class LOVHandler {

    public List selectItem(String description,
            String type, String searchType, String storeId, String clientId,
            boolean selectBlockedItems) {
        String[] columns = {"", "ID", "ITEMNAME", "GENERIC", "ITEMTYPE",
            "SALEPRICE", "STOCK_QUANTITY"};

        String query
                = "SELECT                                           \n"
                + " I.ID ID,                                        \n"
                + " I.DESCRIPTION ITEMNAME,                         \n"
                + " GEN.DESCRIPTION GENERIC,                        \n"
                + " ITMTYP.DESCRIPTION  ITEMTYPE,                   \n"
                + " I.SALE_PRICE SALEPRICE,                         \n"
                + " SWI.QTY STOCK_QUANTITY                          \n"
                + " FROM                                            \n"
                + Database.DCMS.item + " I,                         \n"
                + Database.DCMS.storeWiseItems + " SWI,             \n"
                + Database.DCMS.definitionTypeDetail + " GEN,       \n"
                + Database.DCMS.definitionTypeDetail + " ITMTYP     \n"
                + " WHERE I.ID = SWI.ITEM_ID                        \n"
                + " AND SWI.IS_SALE = 'Y'                           \n"
                + " AND GEN.ID = I.GENERIC_ID                       \n"
                + " AND ITMTYP.ID = I.ITEM_TYPE_ID                  \n"
                + " AND SWI.STORE_ID = " + storeId + "              \n";

        if (selectBlockedItems) {
            query += " AND I.ID NOT IN (SELECT CPT_ITEM_ID FROM "
                    + Database.DCMS.clientWiseBlockedItems
                    + " WHERE CLIENT_ID = '" + clientId + "' "
                    + " AND ITEM_TYPE = '" + Constants.itemOrder + "' )";
        }

        if (type.equals("DESCRIPTION") && searchType.equalsIgnoreCase("ITEM")) {
            query += " AND UPPER(I.DESCRIPTION) LIKE '" + description.toUpperCase() + "%'      \n";
        }

        if (type.equals("DESCRIPTION") && searchType.equals("Generic")) {
            query += " AND UPPER(GEN.DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'      \n";
        }

        if (type.equals("ID")) {
            query += " AND I.ID = " + description;
        }

        List lst = Constants.dao.selectDatainList(query, columns);
        List lstItem = new ArrayList();
        for (int i = 0; i < lst.size(); i++) {
            HashMap map = (HashMap) lst.get(i);
            MedicineOrderEntry pO = new MedicineOrderEntry();
            pO.setItemId((String) map.get("ID"));
            pO.setItemDescription((String) map.get("ITEMNAME"));
            pO.setGenericId((String) map.get("GENERIC"));
            pO.setItemType((String) map.get("ITEMTYPE"));
            pO.setSalePrice((String) map.get("SALEPRICE"));
            pO.setStockQuantity((String) map.get("STOCK_QUANTITY"));
            lstItem.add(pO);
        }
        return lstItem;
    }

    public Vector CPTLovData(String cpt, String col, String clientId, String gender) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "CONTRACT_STATUS", "DELIVERY_TIME",
            "STAT_COST", "MULTIPLE_CPT_STATUS", "TIME", "LOCATION_TIME", "REPORT_NAME",
            "REMARKS_REQUIRED", "QUESTIONAIRE_ID", "HISTORY_REQUIRED",
            "PERFORMING_PHYSICIAN_REQ", "CLIENT_STAT_COST"};

        String query = " SELECT CWC.CPT_ID, SECTION_ID, DEPARTMENT_ID, CRT.DESCRIPTION TIME,\n"
                + " CPT.DESCRIPTION,  NVL(LWC.DELIVERY_TIME , '7:00PM') DELIVERY_TIME  ,   \n"
                + " CPT.COST COST, CWC.CONTRACT_STATUS,  CPT.STAT_COST , "
                + " CWC.STAT_COST CLIENT_STAT_COST,  \n"
                + " CWC.TEST_LIMIT, CWC.CONTRACT_PRICE,             \n"
                + " NVL(MPC.DESCRIPTION, 'N') MULTIPLE_CPT_STATUS,  \n"
                + " NVL(LWC.TIME, '0')LOCATION_TIME,                \n"
                + " NVL(CRN.DESCRIPTION , '10') REPORT_NAME,                    \n"
                + " NVL(OHQ.DESCRIPTION, ' ') QUESTIONAIRE_ID,                \n"
                + " NVL(OHR.DESCRIPTION, 'N') HISTORY_REQUIRED,     \n"
                + " NVL(PPR.DESCRIPTION , 'N') PERFORMING_PHYSICIAN_REQ,  \n"
                + " NVL(ORR.DESCRIPTION, 'N') REMARKS_REQUIRED      \n"
                + " FROM  "
                + Database.DCMS.CPT + ", \n"
                + Database.DCMS.locWiseCPTReportTiming + "  LWC,        \n"
                + Database.DCMS.setupColumnDetail + "  SCD,             \n"
                + Database.DCMS.setupColumnDetail + "  MPC,             \n"
                + Database.DCMS.setupColumnDetail + "  CRN,             \n"
                + Database.DCMS.setupColumnDetail + "  ORR,             \n"
                + Database.DCMS.setupColumnDetail + "  OHQ,             \n"
                + Database.DCMS.setupColumnDetail + "  PPR,             \n"
                + Database.DCMS.setupColumnDetail + "  OHR,             \n"
                + Database.DCMS.definitionTypeDetail + "  CRT,          \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE CWC.CPT_ID = CPT.CPT_ID                       \n"
                + " AND CWC.CPT_ID = LWC.CPT_ID                         \n"
                + " AND LWC.LOCATION_ID = '" + Constants.locationId + "'\n"
                + " AND CPT.ACTIVE = 'Y'                                \n"
                + " AND CPT.REPORT_TIME  = CRT.ID                       \n"
                + " AND CWC.CLIENT_ID = CLT.ID                          \n"
                + " AND CLT.ACTIVE = 'Y'                                \n"
                + " AND CWC.ACTIVE = 'Y'                                \n"
                + " AND ORR.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND ORR.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.orderRemarksRequired + " \n"
                + " AND SCD.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND SCD.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.cptOrderTime + " \n"
                + " AND CPT.CPT_ID = OHQ.TABLE_ROW_ID                   \n"
                + " AND OHQ.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.sendSMSStatus + " \n"
                + " AND CPT.CPT_ID = OHR.TABLE_ROW_ID                   \n"
                + " AND OHR.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.historyRequired + " \n"
                + " AND CPT.CPT_ID = PPR.TABLE_ROW_ID                   \n"
                + " AND PPR.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.performingPhysicianRequired + " \n"
                + " AND MPC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND MPC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.multipleCPTOrder + " \n"
                + " AND CRN.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND CRN.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.reportName + " \n"
                + " AND CWC.CLIENT_ID = '" + clientId + "'              \n";

        if (!Constants.selectedServices.isEmpty()) {
            String services = "'";
            for (int i = 0; i < Constants.selectedServices.size(); i++) {
                services += Constants.selectedServices.get(i) + "','";
            }
            services += "0'";
            query += " AND CWC.CPT_ID NOT IN (" + services + ") \n";
        }

        String selectedCpts = "'";
        for (int i = 0; i < DisplayLOV.orders.size(); i++) {
            OrderData data = (OrderData) DisplayLOV.orders.get(i);
            selectedCpts += data.getCptId() + "','";
        }
        selectedCpts += "0"+gender.toUpperCase()+"'";
        query += " AND CWC.CPT_ID NOT IN (SELECT NOT_ALLOWED_CPT FROM "
                + Database.DCMS.cptWiseNotCpt + " WHERE CPT_ID IN (" + selectedCpts + ")) \n";

        //query += " AND CWC.CPT_ID NOT IN (" ++ ")\n";
        if (col.equalsIgnoreCase("CPT_ID")) {
            query += " AND UPPER(CPT.CPT_ID)='" + cpt.toUpperCase() + "' \n";
        } else {
            query += " AND UPPER(CPT." + col + ")  LIKE '%" + cpt.toUpperCase() + "%' \n";
        }
        if (!Constants.cptOrderTime.equalsIgnoreCase("A")) {
            query += " AND SCD.DESCRIPTION IN ('A', '" + Constants.cptOrderTime + "') \n";
        }
        query += " ORDER BY CPT.DESCRIPTION ";

        Vector records = Constants.dao.selectData(query, columns);
        Vector cpts = new Vector();
        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setCptReportTime(map.get("TIME").toString());
            order.setReportDeliveryTime(" " + map.get("DELIVERY_TIME").toString());
            order.setLocationReportTime(map.get("LOCATION_TIME").toString());
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            order.setStatCost(map.get("STAT_COST").toString());
            order.setHistoryQuestionaireTypeId(map.get("QUESTIONAIRE_ID").toString());
            order.setHistoryRequired(map.get("HISTORY_REQUIRED").toString());
            order.setPerformingPhysicianRequired(map.get("PERFORMING_PHYSICIAN_REQ").toString());
            order.setTestLimit(map.get("TEST_LIMIT").toString());
            order.setRemarksRequired(map.get("REMARKS_REQUIRED").toString());
            order.setMultipleCptOrders(map.get("MULTIPLE_CPT_STATUS").toString());
            order.setContractStatus(map.get("CONTRACT_STATUS").toString());
            order.setReportName(map.get("REPORT_NAME").toString());
            order.setContractPrice(map.get("CONTRACT_PRICE").toString());
            String clientStateCost = map.get("CLIENT_STAT_COST").toString();
            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                order.setOriginalPrice(order.getContractPrice());
                order.setStatCost(clientStateCost);
            }
            order.setPrice(order.getOriginalPrice());
            cpts.add(order);
        }
        return cpts;
    }

    public Vector OPDCPTLovData(String cpt, String col) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID"};

        String query = "SELECT CPT_ID, SECTION_ID, DEPARTMENT_ID, \n"
                + " DESCRIPTION, CPT.COST COST FROM  \n"
                + Database.DCMS.CPT + "         \n"
                + " WHERE CPT.ACTIVE = 'Y'      \n";

        if (col.equalsIgnoreCase("CPT_ID")) {
            query += " AND UPPER(CPT.CPT_ID)='" + cpt.toUpperCase() + "' \n";
        } else {
            query += " AND UPPER(CPT." + col + ")  LIKE '%" + cpt.toUpperCase() + "%' \n";
        }
        query += " ORDER BY CPT.SECTION_ID   \n";

        Vector records = Constants.dao.selectData(query, columns);
        Vector cpts = new Vector();
        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setPerformingContractId(utilities.TypeDetailId.contractGeneral);
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            cpts.add(order);
        }//
        return cpts;
    }

    public Vector clientCPTLovData(String cpt, String col, String clientId) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "CONTRACT_STATUS",
            "STAT_COST", "MULTIPLE_CPT_STATUS"};

        String query = " SELECT CWC.CPT_ID, SECTION_ID, DEPARTMENT_ID, "
                + " CPT.DESCRIPTION, CPT.COST COST, CWC.CONTRACT_STATUS, CPT.STAT_COST,"
                + " CWC.TEST_LIMIT, CWC.CONTRACT_PRICE, MPC.DESCRIPTION MULTIPLE_CPT_STATUS "
                + " FROM  "
                + Database.DCMS.CPT + ", \n"
                + Database.DCMS.setupColumnDetail + "  SCD,             \n"
                + Database.DCMS.setupColumnDetail + "  MPC,             \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE  CWC.CPT_ID = CPT.CPT_ID                      \n"
                + " AND CPT.ACTIVE = 'Y'                                \n"
                + " AND CWC.CLIENT_ID = CLT.ID                          \n"
                + " AND CLT.ACTIVE = 'Y'                                \n"
                + " AND CWC.ACTIVE = 'Y'                                \n"
                + " AND SCD.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND SCD.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.cptOrderTime + " \n"
                + " AND MPC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND MPC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.multipleCPTOrder + " \n"
                + " AND CWC.CLIENT_ID = '" + clientId + "'              \n";

        if (col.equalsIgnoreCase("CPT_ID")) {
            query += " AND UPPER(CPT.CPT_ID)='" + cpt.toUpperCase() + "' \n";
        } else {
            query += " AND UPPER(CPT." + col + ")  LIKE '%" + cpt.toUpperCase() + "%' \n";
        }
        if (!Constants.cptOrderTime.equalsIgnoreCase("A")) {
            query += " AND SCD.DESCRIPTION IN ('A', '" + Constants.cptOrderTime + "') \n";
        }
        query += " ORDER BY CPT.DESCRIPTION ";

        Vector records = Constants.dao.selectData(query, columns);
        Vector cpts = new Vector();
        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            order.setStatCost(map.get("STAT_COST").toString());
            order.setTestLimit(map.get("TEST_LIMIT").toString());
            order.setMultipleCptOrders(map.get("MULTIPLE_CPT_STATUS").toString());
            order.setContractStatus(map.get("CONTRACT_STATUS").toString());
            order.setContractPrice(map.get("CONTRACT_PRICE").toString());

            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                order.setOriginalPrice(order.getContractPrice());
            }
            order.setPrice(order.getOriginalPrice());
            cpts.add(order);
        }
        return cpts;
    }

    public Vector allCPTLovData(String cpt, String col) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "CONTRACT_STATUS",
            "STAT_COST", "MULTIPLE_CPT_STATUS"};

        String query = " SELECT CPT.CPT_ID, SECTION_ID, DEPARTMENT_ID, "
                + " CPT.DESCRIPTION, CPT.COST COST, 'N' CONTRACT_STATUS, CPT.STAT_COST,"
                + " 'N' TEST_LIMIT, CPT.COST  CONTRACT_PRICE, MPC.DESCRIPTION "
                + " MULTIPLE_CPT_STATUS FROM  "
                + Database.DCMS.CPT + ", \n"
                + Database.DCMS.setupColumnDetail + "  MPC              \n"
                + " WHERE CPT.ACTIVE = 'Y'                              \n"
                + " AND MPC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND MPC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.multipleCPTOrder + " \n";

        if (col.equalsIgnoreCase("CPT_ID")) {
            query += " AND UPPER(CPT.CPT_ID)='" + cpt.toUpperCase() + "' \n";
        } else {
            query += " AND UPPER(CPT." + col + ")  LIKE '%" + cpt.toUpperCase() + "%' \n";
        }
        query += " ORDER BY CPT.DESCRIPTION ";

        Vector records = Constants.dao.selectData(query, columns);
        Vector cpts = new Vector();
        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            order.setStatCost(map.get("STAT_COST").toString());
            order.setTestLimit(map.get("TEST_LIMIT").toString());
            order.setMultipleCptOrders(map.get("MULTIPLE_CPT_STATUS").toString());
            order.setContractStatus(map.get("CONTRACT_STATUS").toString());
            order.setContractPrice(map.get("CONTRACT_PRICE").toString());

            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                order.setOriginalPrice(order.getContractPrice());
            }
            order.setPrice(order.getOriginalPrice());
            cpts.add(order);
        }
        return cpts;
    }

    public Vector HospitalCptLovData(String cpt, String col, String clientId, String price) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "CONTRACT_STATUS",
            "STAT_COST", "MULTIPLE_CPT_STATUS", "TIME", "LOCATION_TIME", "REPORT_NAME"};

        String query = " SELECT CWC.CPT_ID, SECTION_ID, DEPARTMENT_ID, CRT.DESCRIPTION TIME,"
                + " CPT.DESCRIPTION, CPT.COST COST, CWC.CONTRACT_STATUS, CPT.STAT_COST,"
                + " CWC.TEST_LIMIT, CWC.CONTRACT_PRICE, NVL(MPC.DESCRIPTION, 'N') MULTIPLE_CPT_STATUS,"
                + " NVL(LWC.TIME, '0')LOCATION_TIME, CRN.DESCRIPTION REPORT_NAME FROM  "
                + Database.DCMS.CPT + ", \n"
                + Database.DCMS.locWiseCPTReportTiming + "  LWC,        \n"
                + Database.DCMS.setupColumnDetail + "  SCD,             \n"
                + Database.DCMS.setupColumnDetail + "  MPC,             \n"
                + Database.DCMS.setupColumnDetail + "  OLI,             \n"
                + Database.DCMS.setupColumnDetail + "  CRN,             \n"
                + Database.DCMS.definitionTypeDetail + "  CRT,          \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE  CWC.CPT_ID = CPT.CPT_ID                      \n"
                + " AND CWC.CPT_ID = LWC.CPT_ID                         \n"
                + " AND LWC.LOCATION_ID = '" + Constants.locationId + "'\n"
                + " AND CPT.ACTIVE = 'Y'                                \n"
                + " AND CPT.REPORT_TIME  = CRT.ID                       \n"
                + " AND CWC.CLIENT_ID = CLT.ID                          \n"
                + " AND CLT.ACTIVE = 'Y'                                \n"
                + " AND CWC.ACTIVE = 'Y'                                \n"
                + " AND SCD.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND SCD.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.cptOrderTime + " \n"
                + " AND MPC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND MPC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.multipleCPTOrder + " \n"
                + " AND CRN.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND OLI.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.orderLevelInvoice + " \n"
                + " AND OLI.TABLE_ROW_ID = CPT.CPT_ID  \n"
                + " AND OLI.DESCRIPTION = 'Y' \n"
                + " AND CRN.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.reportName + " \n"
                + " AND CWC.CLIENT_ID = '" + clientId + "'              \n";

        if (col.equalsIgnoreCase("CPT_ID")) {
            query += " AND CPT.CPT_ID='" + cpt.toUpperCase() + "' \n";
        } else {
            query += " AND UPPER(CPT." + col + ")  LIKE '%" + cpt.toUpperCase() + "%' \n";
        }
        if (!Constants.cptOrderTime.equalsIgnoreCase("A")) {
            query += " AND SCD.DESCRIPTION IN ('A', '" + Constants.cptOrderTime + "') \n";
        }
        if (price.equalsIgnoreCase("Y")) {
            query += " AND CPT.COST ='-1'              \n";
        } else if (price.equalsIgnoreCase("N")) {
            query += " AND CPT.COST >5.5                \n";
        }

        query += " ORDER BY CPT.DESCRIPTION ";

        Vector records = Constants.dao.selectData(query, columns);
        Vector cpts = new Vector();
        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setCptReportTime(map.get("TIME").toString());
            order.setLocationReportTime(map.get("LOCATION_TIME").toString());
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            order.setStatCost(map.get("STAT_COST").toString());
            order.setTestLimit(map.get("TEST_LIMIT").toString());
            order.setMultipleCptOrders(map.get("MULTIPLE_CPT_STATUS").toString());
            order.setContractStatus(map.get("CONTRACT_STATUS").toString());
            order.setReportName(map.get("REPORT_NAME").toString());
            order.setContractPrice(map.get("CONTRACT_PRICE").toString());

            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                order.setOriginalPrice(order.getContractPrice());
            }
            order.setPrice(order.getOriginalPrice());
            cpts.add(order);
        }
        return cpts;
    }

    public List selectOrderItem(String completeOrderNo) {
        String c[] = {"-", "ITEM_ID", "DESCRIPTION", "UNIT_PRICE", "QUANTITY"};

        String query
                = "SELECT                                                   \n"
                + " ODM.ITEM_ID,                                            \n"
                + " ITM.DESCRIPTION,                                        \n"
                + " ODM.UNIT_PRICE,                                         \n"
                + " ODM.ORDER_QTY QUANTITY                                  \n"
                + " FROM                                                    \n"
                + Database.DCMS.item + " ITM,                               \n"
                + Database.DCMS.medicineOrderDetail + " ODM,                \n"
                + Database.DCMS.orderMaster + " OM                         \n"
                + " WHERE OM.COMPLETE_ORDER_NO = '" + completeOrderNo + "'\n"
                + " AND ITM.ID = ODM.ITEM_ID                                \n"
                + " AND ODM.COMPLETE_ORDER_NO = OM.COMPLETE_ORDER_NO        \n";

        Vector vec = Constants.dao.selectData(query, c);
        List lstItem = new ArrayList();
        if (vec.size() > 0) {
            for (int i = 0; i < vec.size(); i++) {
                HashMap hashRow = (HashMap) vec.get(i);
                OrderData det = new OrderData();
                det.setCptId((String) hashRow.get("ITEM_ID"));
                det.setCptDescription((String) hashRow.get("DESCRIPTION"));
                det.setDispenseQuantity(Integer.parseInt((String) hashRow.get("QUANTITY")));
                det.setOriginalPrice((String) hashRow.get("UNIT_PRICE"));
                lstItem.add(det);
            }
        }
        return lstItem;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.LTU;

import BO.LTU.DialysisBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class DialysisHandler {
    
    public List<DialysisBO> selectDialysis(String con, String odi) {

        String colums[] = {"-", "PATIENT_ID", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", 
            "DATE_OF_FIRST_DIALYSIS", "ANGIO_ACCESS", "VACCINATION_1", "VACCINATION_2", 
            "VACCINATION_3", "BOOSTER", "DATE_OF_DIALYSIS", "TIME_OF_DIALYSIS", 
            "PRE_DIAL_WEIGHT", "POST_DIAL_WEIGHT", "MECHINE_NO", "SYMPTOMS", 
            "PRE_BP", "POST_BP"};
        
        String query = " SELECT COMPLETE_ORDER_NO,              \n"
                + "        ORDER_DETAIL_ID,                     \n"
                + "        DATE_OF_FIRST_DIALYSIS,              \n"
                + "        ANGIO_ACCESS,                        \n"
                + "        VACCINATION_1,                       \n"
                + "        VACCINATION_2,                       \n"
                + "        VACCINATION_3,                       \n"
                + "        BOOSTER,                             \n"
                + "        DATE_OF_DIALYSIS,                    \n"
                + "        TIME_OF_DIALYSIS,                    \n"
                + "        PRE_DIAL_WEIGHT,                     \n"
                + "        POST_DIAL_WEIGHT,                    \n"
                + "        MECHINE_NO,                          \n"
                + "        SYMPTOMS,                            \n"
                + "        PRE_BP,                              \n"
                + "        POST_BP FROM                         \n"
                + Database.DCMS.dialysisMaster + "              \n"
                + " WHERE PATIENT_ID = '"+ con +"'              \n"
                + "   AND REFERENCE_ID = '"+ odi +"'            \n";
 
        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<DialysisBO> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            DialysisBO objParameter = new DialysisBO();
            
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setDateOfFirstDialysis(map.get("DATE_OF_FIRST_DIALYSIS").toString());
            objParameter.setAngioAccess(map.get("ANGIO_ACCESS").toString());
            objParameter.setVaccination1(map.get("VACCINATION_1").toString());
            objParameter.setVaccination2(map.get("VACCINATION_2").toString());
            objParameter.setVaccination3(map.get("VACCINATION_3").toString());
            objParameter.setBooster(map.get("BOOSTER").toString());
            objParameter.setDateOfDialysis(map.get("DATE_OF_DIALYSIS").toString());
            objParameter.setTimeOfDialysis(map.get("TIME_OF_DIALYSIS").toString());
            objParameter.setPreDialysisWeight(map.get("PRE_DIAL_WEIGHT").toString());
            objParameter.setPostDialysisWeight(map.get("POST_DIAL_WEIGHT").toString());
            objParameter.setMechineNo(map.get("MECHINE_NO").toString());
            objParameter.setSymptomsId(map.get("SYMPTOMS").toString());
            objParameter.setPreBp(map.get("PRE_BP").toString());
            objParameter.setPostBp(map.get("POST_BP").toString());
            objParameter.setCrtdBy(map.get("CRTD_BY").toString());
            objParameter.setCrtdDate(map.get("CRTD_DATE").toString());
            objParameter.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }
    
    public boolean insertDialysis(DialysisBO objSave) {

        String columns[] = {Database.DCMS.dialysisMaster, "PATIENT_ID", 
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "DATE_OF_FIRST_DIALYSIS", 
            "ANGIO_ACCESS", "VACCINATION_1", "VACCINATION_2", "VACCINATION_3", 
            "BOOSTER", "DATE_OF_DIALYSIS", "TIME_OF_DIALYSIS", "PRE_DIAL_WEIGHT", 
            "POST_DIAL_WEIGHT", "MECHINE_NO", "SYMPTOMS", "PRE_BP", "POST_BP",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo()+ "'");
        insertMap.put("ORDER_DETAIL_ID", "'" + objSave.getOrderDetailId()+ "'");
        insertMap.put("DATE_OF_FIRST_DIALYSIS", "'" + objSave.getDateOfFirstDialysis()+ "'");
        insertMap.put("ANGIO_ACCESS", "'" + objSave.getAngioAccess()+ "'");
        insertMap.put("VACCINATION_1", "'" + objSave.getVaccination1()+ "'");
        insertMap.put("VACCINATION_2", "'" + objSave.getVaccination2()+ "'");
        insertMap.put("VACCINATION_3", "'" + objSave.getVaccination3()+ "'");
        insertMap.put("BOOSTER", "'" + objSave.getBooster()+ "'");
        insertMap.put("DATE_OF_DIALYSIS", "'" + objSave.getDateOfDialysis()+ "'");
        insertMap.put("TIME_OF_DIALYSIS", "'" + objSave.getTimeOfDialysis()+ "'");
        insertMap.put("PRE_DIAL_WEIGHT", "'" + objSave.getPreDialysisWeight()+ "'");
        insertMap.put("POST_DIAL_WEIGHT", "'" + objSave.getPostDialysisWeight()+ "'");
        insertMap.put("MECHINE_NO", "'" + objSave.getMechineNo()+ "'");
        insertMap.put("SYMPTOMS", "'" + objSave.getSymptomsId()+ "'");
        insertMap.put("PRE_BP", "'" + objSave.getPreBp()+ "'");
        insertMap.put("POST_BP", "'" + objSave.getPostBp()+ "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", "SYSDATE");
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }
    
    public boolean insertDialysisItemDetail(DialysisBO objSave) {

        String columns[] = {Database.DCMS.dialysisItemDetail,
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "ITEM_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo()+ "'");
        insertMap.put("ORDER_DETAIL_ID", "'" + objSave.getOrderDetailId()+ "'");
        insertMap.put("ITEM_ID", "'" + objSave.getItemId()+ "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", "SYSDATE");
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }
    
    public boolean updateDialysis(DialysisBO objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.dialysisMaster + " SET   \n"
         + "DATE_OF_FIRST_DIALYSIS  = '" + objUpdate.getDateOfFirstDialysis() + "', \n"
        + "ANGIO_ACCESS  = '" + objUpdate.getAngioAccess() + "',      \n"
        + "VACCINATION_1  = '" + objUpdate.getVaccination1() + "',    \n"
        + "VACCINATION_2  = '" + objUpdate.getVaccination2() + "',    \n"
        + "VACCINATION_3  = '" + objUpdate.getVaccination3() + "',    \n"
        + "BOOSTER  = '" + objUpdate.getBooster() + "',                \n"
        + "DATE_OF_DIALYSIS  = '" + objUpdate.getDateOfDialysis() + "',\n"
        + "TIME_OF_DIALYSIS  = '" + objUpdate.getTimeOfDialysis() + "',\n"
        + "PRE_DIAL_WEIGHT  = '" + objUpdate.getPreDialysisWeight() + "',\n"
        + "POST_DIAL_WEIGHT  = '" + objUpdate.getPostDialysisWeight() + "',\n"
        + "MECHINE_NO  = '" + objUpdate.getMechineNo() + "',            \n"
        + "SYMPTOMS  = '" + objUpdate.getSymptomsId() + "',             \n"
        + "PRE_BP  = '" + objUpdate.getPreBp() + "',                    \n"
        + "POST_BP  = '" + objUpdate.getPostBp() + "',                  \n"
        + "WHERE COMPLETE_ORDER_NO = '"+ objUpdate.getCompleteOrderNo()+"' \n"
        + "AND ORDER_DETAIL_ID = '"+ objUpdate.getOrderDetailId()+"'    \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
}

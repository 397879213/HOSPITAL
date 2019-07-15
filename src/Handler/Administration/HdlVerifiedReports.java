/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Administration;

import BO.Administration.BOVerifiedReports;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Raheel Ansari
 */
public class HdlVerifiedReports {
    
    public List<BOVerifiedReports> selectCptWiseReports(String cptId, 
            String toDate, String fromDate){
    
        String columns[] = {"","PATIENT_ID", "FULL_NAME", "LAB_NO", "SECTION_ID", 
                                    "SECTION_NAME", "VERIFIED_DATE"};
        
        String query = "SELECT PRM.PATIENT_ID       PATIENT_ID,             \n"
                + " PAT.FULL_NAME                   FULL_NAME,              \n"
                + " PRM.LAB_NO                      LAB_NO,                 \n"
                + " PRM.SECTION_ID                  SECTION_ID,             \n"
                + " SEC.DESCRIPTION                 SECTION_NAME,           \n"
                + " TO_CHAR(TRUNC (PRM.VERIFIED_DATE), 'DD-MM-YY') VERIFIED_DATE \n"
                + " FROM "+ Database.DCMS.pathologyResultMaster  +" PRM,    \n"
                + Database.DCMS.section + " SEC,                            \n"
                + Database.DCMS.patient + " PAT                             \n"
                + " WHERE PRM.CPT_ID = '" + cptId + "'                      \n"
                + " AND PRM.VERIFIED_DATE BETWEEN '" + toDate + 
                "' AND '" + fromDate + "'                                   \n" 
                + " AND PRM.ORDER_STATUS_ID = 12                            \n"
                + " AND PRM.PATIENT_ID = PAT.PATIENT_ID                     \n"
                + " AND PRM.SECTION_ID = SEC.SECTION_ID                     \n";
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
        System.out.println(" Data : " + listmap.size());
         List<BOVerifiedReports> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BOVerifiedReports objData = new BOVerifiedReports();
            
            objData.setPatId(map.get("PATIENT_ID").toString());
            objData.setPatName(map.get("FULL_NAME").toString());
            objData.setLabNo(map.get("LAB_NO").toString());
            objData.setSectionId(map.get("SECTION_ID").toString());
            objData.setSectionName(map.get("SECTION_NAME").toString());
            objData.setReportDate(map.get("VERIFIED_DATE").toString());
            
            lisVerRep.add(objData);
        }
        
        return lisVerRep;
    }
    
    public List<BOVerifiedReports>  selectPatReport_Verified(String patID, String labNo){
    
        String columns [] = {"","PATIENT_ID", "PATIENT_NAME", "CPT_NAME", "STATUS",
                                "REPORT_DATE", "LAB_NO", "DEPARTMENT"};
        
        String query = " SELECT OD.PATIENT_ID       PATIENT_ID ,             \n"
                + " PAT.FULL_NAME                   PATIENT_NAME,            \n"
                + " CPT.DESCRIPTION                 CPT_NAME,                \n"
                + " STATUS.DESCRIPTION              STATUS,                  \n"
                + " TO_CHAR(TRUNC (OD.REPORT_DATE), 'DD-MM-YY') REPORT_DATE, \n"
                + " PRM.LAB_NO                      LAB_NO,                  \n"
                + " DEPT.DESCRIPTION                DEPARTMENT               \n"
                + " FROM " + Database.DCMS.orderDetail + " OD,               \n"
                + Database.DCMS.CPT +" CPT,                                  \n"
                + Database.DCMS.invoiceDetail + " IVD,                       \n"
                + Database.DCMS.definitionTypeDetail + " DEPT,               \n"
                + Database.DCMS.patient + " PAT,                             \n"
                + Database.DCMS.pathologyResultMaster + " PRM,               \n"
                + Database.DCMS.definitionTypeDetail + " STATUS              \n";
        
                if(!patID.equalsIgnoreCase("") && patID != null){
                query +=" WHERE OD.PATIENT_ID = '" + patID + "'             \n";}
                
                if(!labNo.equalsIgnoreCase("") && labNo != null){
                query +=" WHERE PRM.LAB_NO = '" + labNo + "'             \n";}
                
                query +=" AND OD.ORDER_STATUS_ID = '12'                            \n"
                + " AND OD.CPT_ID = CPT.CPT_ID                               \n"
                + " AND OD.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + "AND OD.COMPLETE_ORDER_NO = IVD.COMPLETE_ORDER_NO          \n"
                + " AND IVD.DEPARTMENT_ID = DEPT.ID                          \n"
                + " AND IVD.CPT_ID = OD.CPT_ID                               \n"
                + " AND OD.ORDER_STATUS_ID = STATUS.ID                       \n"
                + " AND OD.PATIENT_ID = PRM.PATIENT_ID                       \n";
        
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BOVerifiedReports> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BOVerifiedReports objData = new BOVerifiedReports();
            
            objData.setPatId(map.get("PATIENT_ID").toString());
            objData.setPatName(map.get("PATIENT_NAME").toString());
            objData.setCptName(map.get("CPT_NAME").toString());
            objData.setOrderStatus(map.get("STATUS").toString());
            objData.setReportDate(map.get("REPORT_DATE").toString());
            objData.setLabNo(map.get("LAB_NO").toString());
            objData.setDepartment(map.get("DEPARTMENT").toString());
            
            lisVerRep.add(objData);
        }
        
        return lisVerRep;
    }
    
    
        public List<BOVerifiedReports>  selectPatReport_All(String patID, String labNo){
    
        String columns [] = {"","PATIENT_ID", "PATIENT_NAME", "CPT_NAME", "STATUS",
                                 "LAB_NO", "DEPARTMENT"};
        
        String query = " SELECT OD.PATIENT_ID       PATIENT_ID ,             \n"
                + " PAT.FULL_NAME                   PATIENT_NAME,            \n"
                + " CPT.DESCRIPTION                 CPT_NAME,                \n"
                + " STATUS.DESCRIPTION              STATUS,                  \n"
                + " PRM.LAB_NO                      LAB_NO,                  \n"
                + " DEPT.DESCRIPTION                DEPARTMENT               \n"
                + " FROM " + Database.DCMS.orderDetail + " OD,               \n"
                + Database.DCMS.CPT +" CPT,                                  \n"
                + Database.DCMS.invoiceDetail + " IVD,                       \n"
                + Database.DCMS.definitionTypeDetail + " DEPT,               \n"
                + Database.DCMS.patient + " PAT,                             \n"
                + Database.DCMS.pathologyResultMaster + " PRM,               \n"
                + Database.DCMS.definitionTypeDetail + " STATUS              \n";
        
                if(!patID.equalsIgnoreCase("")){
                query +=" WHERE OD.PATIENT_ID = '" + patID + "'             \n";}
                
//                if(!labNo.equalsIgnoreCase("")){
//                query +=" WHERE PRM.LAB_NO = '" + labNo + "'                \n";}
//                
                query += "AND OD.CPT_ID = CPT.CPT_ID                         \n"
                + " AND OD.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + "AND OD.COMPLETE_ORDER_NO = IVD.COMPLETE_ORDER_NO          \n"
                + " AND IVD.DEPARTMENT_ID = DEPT.ID                          \n"
                + " AND IVD.CPT_ID = OD.CPT_ID                               \n"
                + " AND OD.ORDER_STATUS_ID = STATUS.ID                       \n"
                + " AND OD.PATIENT_ID = PRM.PATIENT_ID                       \n";
        
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BOVerifiedReports> lisVerRep = new ArrayList();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BOVerifiedReports objData = new BOVerifiedReports();
            
            objData.setPatId(map.get("PATIENT_ID").toString());
            objData.setPatName(map.get("PATIENT_NAME").toString());
            objData.setCptName(map.get("CPT_NAME").toString());
            objData.setOrderStatus(map.get("STATUS").toString());
            objData.setLabNo(map.get("LAB_NO").toString());
            objData.setDepartment(map.get("DEPARTMENT").toString());
            
            lisVerRep.add(objData);
        }
        
        return lisVerRep;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Development.Handler;

import Development.BO.DailyServicesBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Raheel Ansari
 */
public class DailyServicesHandler {
    
    public List<DailyServicesBO> locWiseDept(String locId, String fromDate, String toDate){
    
        String columns[] = {"-","DEP_ID","DEP_NAME","DEP_WISE_COUNT"};
        
        String query = " SELECT DEP.DESCRIPTION DEP_NAME, DEP.ID DEP_ID,        \n"
                + " COUNT(IVM.PATIENT_ID) DEP_WISE_COUNT FROM                   \n" 
                + Database.DCMS.invoiceDetail        + " IVD,                   \n"
                + Database.DCMS.invoiceMaster        + " IVM,                   \n"
                + Database.DCMS.definitionTypeDetail + " DEP                    \n";
                if(fromDate.length() != 0 && toDate.length() != 0){
                    query += " WHERE IVM.TRN_DATE BETWEEN '" + fromDate + "' AND"
                            + " '"+ toDate +"'                                  \n";
                }else{
                    query += " WHERE IVM.TRN_DATE > SYSDATE - 1                 \n";
                }
                query += " AND IVM.LOCATION_ID = '" + locId + "'                \n" 
                + "  AND IVM.INVOICE_NO = IVD.INVOICE_NO                        \n"
                + "  AND IVD.DEPARTMENT_ID = DEP.ID                             \n"
                + "  GROUP BY DEP.DESCRIPTION, DEP.ID                           \n";
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<DailyServicesBO> lisData = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            DailyServicesBO objBO = new DailyServicesBO();
            
            objBO.setDepartmentId(map.get("DEP_ID").toString());
            objBO.setDepartmentName(map.get("DEP_NAME").toString());
            objBO.setDepWiseCount(map.get("DEP_WISE_COUNT").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
    
    public List<DailyServicesBO> deptWiseSec(String deptId, String locId, 
            String fromDate, String toDate){
    
        String columns[] = {"-","SECTION_ID","DESCRIPTION", "NO_OF_SERVICES"};
        
        String query = " SELECT SEC.SECTION_ID, SEC.DESCRIPTION,                \n"
                + " COUNT(IVM.PATIENT_ID) NO_OF_SERVICES FROM                   \n"
                + Database.DCMS.invoiceDetail   + " IVD,                        \n"
                + Database.DCMS.invoiceMaster   + " IVM,                        \n"
                + Database.DCMS.section         + " SEC                         \n";
                if(fromDate.length() != 0 && toDate.length() != 0){
                    query += " WHERE IVD.TRN_DATE BETWEEN '" + fromDate + "' AND"
                            + " '"+ toDate +"'                                  \n";
                }else{
                    query += " WHERE IVD.TRN_DATE > SYSDATE - 1                 \n";
                }
                query += " AND IVM.LOCATION_ID = '" + locId + "'                \n"
                + " AND IVD.DEPARTMENT_ID      = '" + deptId + "'               \n"
                + " AND IVM.INVOICE_NO = IVD.INVOICE_NO                         \n"
                + " AND IVD.DEPARTMENT_ID = SEC.DEPARTMENT_ID                   \n"
                + " AND IVD.SECTION_ID = SEC.SECTION_ID                         \n"
                + " GROUP BY SEC.SECTION_ID, SEC.DESCRIPTION                    \n";
                
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
         List<DailyServicesBO> lisData = new ArrayList<>();
        for (int i =0; i < listmap.size(); i++){
            HashMap map = (HashMap) listmap.get(i);                              
            DailyServicesBO objBO = new DailyServicesBO();
            
            objBO.setSectionId(map.get("SECTION_ID").toString());
            objBO.setSectionName(map.get("DESCRIPTION").toString());
            objBO.setNoOfServices(map.get("NO_OF_SERVICES").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
    
    
    public List<DailyServicesBO> sectionWiseServices(String secId, 
                    String fromDate, String toDate){
    
        String columns[] = {"-","COUNT_CPT_ID", "CPT_NAME", "CPT_ID"};
        
        String query = " SELECT COUNT(IVD.CPT_ID)   COUNT_CPT_ID,            \n"
                + " CP.DESCRIPTION                  CPT_NAME,                \n"
                + " CP.CPT_ID                       CPT_ID                   \n"
                + " FROM " + Database.DCMS.CPT +" CP,                        \n"
                + Database.DCMS.invoiceDetail +" IVD                         \n"
                + " WHERE CP.SECTION_ID = '" + secId + "'                    \n"
                + " AND IVD.TRN_DATE BETWEEN '" + fromDate + 
                "' AND '" + toDate + "'                                    \n"
                + " AND IVD.CPT_ID = CP.CPT_ID                               \n"
                + " GROUP BY CP.DESCRIPTION, CP.CPT_ID                       \n"
                + " ORDER BY CP.DESCRIPTION                                  \n";
                
    
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<DailyServicesBO> lisData = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            DailyServicesBO objBO = new DailyServicesBO();
            
            objBO.setCountCptId(map.get("COUNT_CPT_ID").toString());
            objBO.setCptId(map.get("CPT_ID").toString());
            objBO.setCptName(map.get("CPT_NAME").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
    
    public List<DailyServicesBO> cptWisePatInfo(DailyServicesBO objds){
    
        String columns[] = {"-","PATIENT_ID","FULL_NAME", "CPT_NAME", "STATUS_ID",
                            "STATUS", "TRN_DATE"};
        
        String query = " SELECT  IVM.PATIENT_ID  PATIENT_ID,                    \n"
                + " PAT.FULL_NAME               FULL_NAME,                      \n"
                + " CP.DESCRIPTION              CPT_NAME,                       \n"
                + " IVD.STATUS_ID          STATUS_ID,                           \n"
                + " STS.DESCRIPTION             STATUS,                         \n"
                + " TO_CHAR(IVM.TRN_DATE, 'DD-MON-YYYY')  TRN_DATE              \n"
                + " FROM " + Database.DCMS.invoiceMaster +" IVM,                \n"
                + Database.DCMS.CPT +" CP,                                      \n"
                + Database.DCMS.invoiceDetail +" IVD,                           \n"
                + Database.DCMS.patient +" PAT,                                 \n"
                + Database.DCMS.definitionTypeDetail +" STS                     \n";
                if(objds.getFromDate().length() != 0 && objds.getToDate().length() != 0){
                    query += " WHERE IVD.TRN_DATE BETWEEN '" + objds.getFromDate() 
                            + "' AND" + " '"+ objds.getToDate() +"'             \n";
                }else{
                    query += " WHERE IVD.TRN_DATE > SYSDATE - 1                 \n";
                }
                query += " AND IVD.DEPARTMENT_ID = '" + objds.getDepartmentId() + "' \n"
                + " AND IVD.SECTION_ID = '" + objds.getSectionId() + "'         \n"
                + " AND IVD.CPT_ID = '" + objds.getCptId() + "'                 \n"
                + " AND IVM.INVOICE_NO = IVD.INVOICE_NO                         \n"
                + " AND IVM.PATIENT_ID = PAT.PATIENT_ID                         \n"
                + " AND IVD.CPT_ID = CP.CPT_ID                                  \n"
                + " AND IVD.STATUS_ID = STS.ID                                  \n"
                + " ORDER BY IVD.STATUS_ID                                      \n";
                
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
         List<DailyServicesBO> lisData = new ArrayList<>();
            
        for (int i =0; i < listmap.size(); i++){
            HashMap map = (HashMap) listmap.get(i);                              
            DailyServicesBO objBO = new DailyServicesBO();
            
            objBO.setPatientId(map.get("PATIENT_ID").toString());
            objBO.setPatientName(map.get("FULL_NAME").toString());
            objBO.setCptName(map.get("CPT_NAME").toString());
            objBO.setStatusId(map.get("STATUS_ID").toString());
            objBO.setStatusName(map.get("STATUS").toString());
            objBO.setTrnDate(map.get("TRN_DATE").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
            
    
}

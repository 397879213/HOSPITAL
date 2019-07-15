/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Administration;

import BO.Administration.BODailyServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Raheel Ansari
 */
public class HdlDailyServices {
    
    public List<BODailyServices> locWiseDept(String locId){
    
        String columns[] = {"-","ID","DESCRIPTION"};
        
        String query = " SELECT LWD.DEPARTMENT_ID ID ,"
                + " DPT.DESCRIPTION   DESCRIPTION "
                + " FROM " + Database.DCMS.locationWiseDepartment +" LWD,   \n"
                + Database.DCMS.definitionTypeDetail + " DPT                \n"
                + " WHERE LWD.LOCATION_ID = '" + locId + "'                 \n"
                + " AND LWD.DEPARTMENT_ID = DPT.ID                          \n" 
                + "  ORDER BY LWD.ID                                        \n";
     
    
    
    
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BODailyServices> lisData = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BODailyServices objBO = new BODailyServices();
            
            objBO.setDepartmentId(map.get("ID").toString());
            objBO.setDepartmentName(map.get("DESCRIPTION").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
    
    public List<BODailyServices> deptWiseSec(String deptId){
    
        String columns[] = {"-","ID","DESCRIPTION"};
        
        String query = " SELECT SC.SECTION_ID ID,                   \n"
                + " SC.DESCRIPTION DESCRIPTION                      \n"
                + " FROM " + Database.DCMS.section +" SC            \n"
                + " WHERE SC.DEPARTMENT_ID = '" + deptId + "'       \n"
                + "  ORDER BY SC.SECTION_ID                         \n";
     
    
    
    
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BODailyServices> lisData = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BODailyServices objBO = new BODailyServices();
            
            objBO.setSectionId(map.get("ID").toString());
            objBO.setSectionName(map.get("DESCRIPTION").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
    
    
    public List<BODailyServices> sectionWiseServices(String secId, 
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
              
         List<BODailyServices> lisData = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BODailyServices objBO = new BODailyServices();
            
            objBO.setCountCptId(map.get("COUNT_CPT_ID").toString());
            objBO.setCptId(map.get("CPT_ID").toString());
            objBO.setCptName(map.get("CPT_NAME").toString());
            lisData.add(objBO);
        }
        
        return lisData;
    }
    
    public List<BODailyServices> cptWisePatInfo(String cptId, 
                    String fromDate, String toDate){
    
        String columns[] = {"-","PATIENT_ID","FULL_NAME", "CPT_NAME", "STATUS_ID",
                            "STATUS", "TRN_DATE"};
        
        String query = " SELECT  OM.PATIENT_ID  PATIENT_ID,                 \n"
                + " PAT.FULL_NAME               FULL_NAME,                  \n"
                + " CP.DESCRIPTION              CPT_NAME,                   \n"
                + " OD.ORDER_STATUS_ID          STATUS_ID,                  \n"
                + " STS.DESCRIPTION             STATUS,                     \n"
                + " OD.TRN_DATE                 TRN_DATE                    \n"
                + " FROM " + Database.DCMS.orderDetail +" OD,               \n"
                + Database.DCMS.CPT +" CP,                                  \n"
                + Database.DCMS.orderMaster +" OM,                          \n"
                + Database.DCMS.patient +" PAT,                             \n"
                + Database.DCMS.definitionTypeDetail +" STS                 \n"
                + " WHERE CP.CPT_ID = '" + cptId + "'                       \n"
                
                + " AND OM.TRN_DATE BETWEEN '" + fromDate + 
                "' AND '" + toDate + "'                                     \n"
                
                //+ " AND OD.TRN_DATE > SYSDATE - 1                           \n"
                + " AND OD.COMPLETE_ORDER_NO = OM.COMPLETE_ORDER_NO         \n"
                + " AND OM.PATIENT_ID = PAT.PATIENT_ID                      \n"
                + " AND OD.CPT_ID = CP.CPT_ID                               \n"
                + " AND OD.ORDER_STATUS_ID = STS.ID                         \n"
                + " ORDER BY OD.ORDER_STATUS_ID                             \n";
     
    
    
    
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BODailyServices> lisData = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BODailyServices objBO = new BODailyServices();
            
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

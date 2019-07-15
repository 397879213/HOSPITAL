 
package Development.Handler;

import Development.BO.VerifiedReportsBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

/**
 *
 * @author Raheel Ansari
 */
public class VerifiedReportsHandler {
    
    public List<VerifiedReportsBO> selectCptWiseReports(VerifiedReportsBO ObjVer){
    
        String columns[] = {"","PATIENT_ID", "FULL_NAME", "SECTION_ID", 
                                    "SECTION_NAME", "VERIFIED_DATE"};
        
        String query = "SELECT PAT.PATIENT_ID       PATIENT_ID,                 \n"
                + " PAT.FULL_NAME                   FULL_NAME,                  \n"
                + " ORD.SECTION_ID                  SECTION_ID,                 \n"
                + " SEC.DESCRIPTION                 SECTION_NAME,               \n"
                + " TO_CHAR(TRUNC (ORD.REPORT_DATE), 'DD-MM-YY') VERIFIED_DATE  \n"
                + " FROM "+ Database.DCMS.orderDetail  +" ORD,                  \n"
                + Database.DCMS.section + " SEC,                                \n"
                + Database.DCMS.patient + " PAT                                 \n"
                + " WHERE ORD.TRN_DATE BETWEEN '" + ObjVer.getFromDate() + 
                "' AND '" + ObjVer.getToDate() + "'                             \n"
                + " AND ORD.DEPARTMENT_ID = " + ObjVer.getDepartmentId()+ "     \n"
                + " AND ORD.CPT_ID = '" + ObjVer.getCptId() + "'                \n"
                + " AND ORD.ORDER_STATUS_ID = "+ Status.verified +"             \n"
                + " AND ORD.PATIENT_ID = PAT.PATIENT_ID                         \n"
                + " AND ORD.SECTION_ID = SEC.SECTION_ID                         \n";
        System.out.println(query    );
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
        System.out.println(" Data : " + listmap.size());
         List<VerifiedReportsBO> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            HashMap map = (HashMap) listmap.get(i);                              
            VerifiedReportsBO objData = new VerifiedReportsBO();
            
            objData.setPatId(map.get("PATIENT_ID").toString());
            objData.setPatName(map.get("FULL_NAME").toString());
            objData.setSectionId(map.get("SECTION_ID").toString());
            objData.setSectionName(map.get("SECTION_NAME").toString());
            objData.setReportDate(map.get("VERIFIED_DATE").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }
    
    public List<VerifiedReportsBO>  selectPatReport_Verified(String patID, String PatientName){
    
        String columns [] = {"","PATIENT_ID", "PATIENT_NAME", "CPT_NAME", "STATUS",
                                "REPORT_DATE", "DEPARTMENT"};
        
        String query = " SELECT OD.PATIENT_ID       PATIENT_ID ,             \n"
                + " PAT.FULL_NAME                   PATIENT_NAME,            \n"
                + " CPT.DESCRIPTION                 CPT_NAME,                \n"
                + " STATUS.DESCRIPTION              STATUS,                  \n"
                + " NVL(TO_CHAR(TRUNC (OD.REPORT_DATE), 'DD-MM-YY'), ' ') REPORT_DATE, \n"
                + " DEPT.DESCRIPTION                DEPARTMENT               \n"
                + " FROM " + Database.DCMS.orderDetail + " OD,               \n"
                + Database.DCMS.CPT +" CPT,                                  \n"
                + Database.DCMS.invoiceDetail + " IVD,                       \n"
                + Database.DCMS.definitionTypeDetail + " DEPT,               \n"
                + Database.DCMS.patient + " PAT,                             \n"
                + Database.DCMS.definitionTypeDetail + " STATUS              \n"
                + " WHERE OD.ORDER_STATUS_ID = '"+ Status.verified +"'       \n";
        
                if(patID.length() != 0){
                query +=" AND OD.PATIENT_ID = '" + patID + "'                \n";}
                
                if(PatientName.length() != 0){
                query +=" AND PAT.FULL_NAME LIKE '%" + PatientName + "%'     \n";}
                
                query +=" AND OD.CPT_ID = CPT.CPT_ID                         \n"
                + " AND OD.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + " AND OD.COMPLETE_ORDER_NO = IVD.COMPLETE_ORDER_NO         \n"
                + " AND OD.ORDER_DETAIL_ID = IVD.ORDER_DETAIL_ID         \n"
                + " AND IVD.DEPARTMENT_ID = DEPT.ID                          \n"
                + " AND IVD.CPT_ID = OD.CPT_ID                               \n"
                + " AND OD.ORDER_STATUS_ID = STATUS.ID                       \n"
                + " ORDER BY  OD.REPORT_DATE                                 \n";
        System.out.println(query);
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<VerifiedReportsBO> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            VerifiedReportsBO objData = new VerifiedReportsBO();
            
            objData.setPatId(map.get("PATIENT_ID").toString());
            objData.setPatName(map.get("PATIENT_NAME").toString());
            objData.setCptName(map.get("CPT_NAME").toString());
            objData.setOrderStatus(map.get("STATUS").toString());
            objData.setReportDate(map.get("REPORT_DATE").toString());
            objData.setDepartmentDescription(map.get("DEPARTMENT").toString());
            
            lisVerRep.add(objData);
        }
        
        return lisVerRep;
    }
    
    
        public List<VerifiedReportsBO>  selectPatReport_All(String patID, 
                String PatientName){
    
        String columns [] = {"","PATIENT_ID", "PATIENT_NAME", "CPT_NAME", "STATUS",
                                "REPORT_DATE", "DEPARTMENT"};
        
        String query = " SELECT OD.PATIENT_ID       PATIENT_ID ,             \n"
                + " PAT.FULL_NAME                   PATIENT_NAME,            \n"
                + " CPT.DESCRIPTION                 CPT_NAME,                \n"
                + " STATUS.DESCRIPTION              STATUS,                  \n"
                + " NVL(TO_CHAR(TRUNC (OD.REPORT_DATE), 'DD-MM-YY'), ' ') REPORT_DATE, \n"
                + " DEPT.DESCRIPTION                DEPARTMENT               \n"
                + " FROM " + Database.DCMS.orderDetail + " OD,               \n"
                + Database.DCMS.CPT +" CPT,                                  \n"
                + Database.DCMS.invoiceDetail + " IVD,                       \n"
                + Database.DCMS.definitionTypeDetail + " DEPT,               \n"
                + Database.DCMS.patient + " PAT,                             \n"
                + Database.DCMS.definitionTypeDetail + " STATUS              \n"
                + " WHERE OD.ORDER_STATUS_ID != '"+ Status.verified +"'      \n";
        
                if(patID.length() != 0){
                query +=" AND OD.PATIENT_ID = '" + patID + "'                   \n";}
                
                if(PatientName.length() != 0){
                query +=" AND PAT.FULL_NAME LIKE '%" + PatientName + "%'       \n";}
                
                query +=" AND OD.CPT_ID = CPT.CPT_ID                            \n"
                + " AND OD.PATIENT_ID = PAT.PATIENT_ID                          \n"
                + " AND OD.COMPLETE_ORDER_NO = IVD.COMPLETE_ORDER_NO            \n"
                + " AND OD.ORDER_DETAIL_ID = IVD.ORDER_DETAIL_ID            \n"
                + " AND IVD.DEPARTMENT_ID = DEPT.ID                             \n"
                + " AND IVD.CPT_ID = OD.CPT_ID                                  \n"
                + " AND OD.ORDER_STATUS_ID = STATUS.ID                          \n"
                + " ORDER BY  OD.REPORT_DATE                                    \n";
        System.out.println(query);
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
         List<VerifiedReportsBO> lisVerRep = new ArrayList<>();
        
         for (int i =0; i < listmap.size(); i++){
            HashMap map = (HashMap) listmap.get(i);                              
            VerifiedReportsBO objData = new VerifiedReportsBO();
            objData.setPatId(map.get("PATIENT_ID").toString());
            objData.setPatName(map.get("PATIENT_NAME").toString());
            objData.setCptName(map.get("CPT_NAME").toString());
            objData.setOrderStatus(map.get("STATUS").toString());
            objData.setReportDate(map.get("REPORT_DATE").toString());
            objData.setDepartmentDescription(map.get("DEPARTMENT").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }
}

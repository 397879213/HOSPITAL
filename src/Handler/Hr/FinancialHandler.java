/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Hr;

import BO.Hr.FinancialSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Pacslink
 */
public class FinancialHandler {
    
    public List<FinancialSupport> getFinancialInfo(String patientId){
      
        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "OCCUPATION",
            "AGE", "GENDER_ID", "GENDER", "CONTACT_NO", "ADDRESS",
            "JOB","SALARY", "CHILDRENS","LOCATION_ID", "LOCATION",
            "OCCUPATION","CNIC","REMARKS","CRTD_BY","CRTD_DATE","CRTD_TERMINAL_ID"};
        
        String query = "SELECT FS.PATIENT_ID           PATIENT_ID,          \n"
                + " NVL(PAT.FULL_NAME, ' ')            FULL_NAME,           \n"
                + " NVL(PAT.LOCATION_ID, ' ')          LOCATION_ID,         \n"
                + " NVL(LOC.DESCRIPTION, ' ')          LOCATION,            \n"
                + " NVL(PAT.AGE, ' ')                  AGE,                 \n"
                + " PAT.GENDER_ID                      GENDER_ID,           \n"
                + " DTD.DESCRIPTION                    GENDER,              \n"
                + " NVL(PAT.CONTACT_NO, ' ')           CONTACT_NO,          \n"
                + " NVL(PAT.ADDRESS, ' ')              ADDRESS,             \n"
                + " NVL(PAT.FATHER_NAME, ' ')          FATHER_NAME,         \n"
                + " NVL(FS.JOB,'')                     JOB,                 \n"
                + " NVL(FS.SALARY,'')                  SALARY,              \n"
                + " NVL(FS.CHILDRENS,'')               CHILDRENS,           \n"
                + " NVL(FS.OCCUPATION,'')              OCCUPATION,          \n"
                + " NVL(FS.CNIC,'')                    CNIC,                \n"
                + " NVL(FS.REMARKS,'')                 REMARKS,             \n"
                + " FS.CRTD_BY                         CRTD_BY,             \n"
                + " TO_CHAR(FS.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,           \n"
                + " FS.CRTD_TERMINAL_ID,               CRTD_TERMINAL_ID     \n"
//                + " FROM "+ Database.DCMS.patientFsInfo +" FS,              \n"
                +   Database.DCMS.patient +"               PAT,             \n"
                +   Database.DCMS.location +"              LOC,             \n"
                +   Database.DCMS.definitionTypeDetail +"  DTD              \n"
                + " WHERE FS.PATIENT_ID = PAT.PATIENT_ID                    \n"
                + " AND PAT.LOCATION_ID = LOC.ID                            \n"
                + " AND PAT.GENDER_ID = DTD.ID                              \n"
                + " AND FS.PATIENT_ID = '" +patientId+ "'                     \n";
        
         List<HashMap> lis = Constants.dao.selectDatainList(query, columns);
         
         List<FinancialSupport> vecDC = new ArrayList<>();
            for (HashMap map : lis) {
            FinancialSupport objFS = new FinancialSupport();
            objFS.setPatientId(map.get("PATIENT_ID").toString());
            objFS.setPatientName(map.get("FULL_NAME").toString());
            objFS.setGenderId(map.get("GENDER_ID").toString());
            objFS.setGenderDescription(map.get("GENDER").toString());
            objFS.setLocationId(map.get("LOCATION_ID").toString());
            objFS.setLocationDescription(map.get("LOCATION").toString());
            objFS.setAge(map.get("AGE").toString());
            objFS.setContactNo(map.get("CONTACT_NO").toString());
            objFS.setCnic(map.get("CNIC").toString());
            objFS.setRemarks(map.get("REMARKS").toString());
            objFS.setPresentAddress(map.get("ADDRESS").toString());
            objFS.setJob(map.get("JOB").toString());
            objFS.setSalary(map.get("SALARY").toString());
            objFS.setChildrens(map.get("CHILDRENS").toString());
            objFS.setOccupation(map.get("OCCUPATION").toString());
            vecDC.add(objFS);
        }
        
        return vecDC;
    }
    
//    public boolean insertFinance(FinancialSupport fs){
//        
//        String[] columns = {Database.DCMS.patientFsInfo,"PATIENT_ID",
//            "JOB","SALARY", "CHILDRENS","OCCUPATION","CNIC","REMARKS","CRTD_BY",
//            "CRTD_TERMINAL_ID"};
//        
//        HashMap fObj = new HashMap();
//        
//        fObj.put("PATIENT_ID", "'"+ fs.getPatientId()+"'");
//        fObj.put("JOB", "'"+ fs.getJob()+"'");
//        fObj.put("SALARY", "'"+ fs.getSalary()+"'");
//        fObj.put("CHILDRENS", "'"+ fs.getChildrens()+"'");
//        fObj.put("OCCUPATION", "'"+ fs.getOccupation()+"'");
//        fObj.put("CNIC", "'"+ fs.getCnic()+"'");
//        fObj.put("REMARKS", "'"+ fs.getRemarks()+"'");
//        fObj.put("CRTD_BY", "'" + Constants.userId + "'");
//        fObj.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
//        
//        Vector vec = new Vector();
//        vec.add(fObj);
//        
//        return Constants.dao.insertData(vec, columns);
//    }
//    
//    public boolean UpdateTemplate(HrLetter Objhr){
//        
//       String query
//                = "UPDATE " + Database.DCMS.hrEmployeeLetter + "\n SET "
//                + "STATUS_ID = '" + Objhr.getLetterStatus() + "' ,"
//                + "TEMPLATES = '" + Objhr.getHrTemplates() + "'"
//                + "WHERE TEMP_TYPE_ID  = '" + Objhr.getLeaveType()  + "'";
//       
//       return Constants.dao.executeUpdate(query, true);
//    }
}

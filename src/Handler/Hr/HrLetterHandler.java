/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Hr;

import BO.Hr.HrLetter;
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
public class HrLetterHandler {
    
    public HrLetter FetchEmpById(String EmpId){
        
        String[] columns = {"-","EMPLOYEE_ID","FULL_NAME","DEPARTMENT",
            "GENDER","AGE","LOCATION"};
        
        String query = "SELECT NVL(HR.EMPLOYEE_ID,'') EMPLOYEE_ID,           \n"
                +"NVL(HR.FULL_NAME,'') FULL_NAME,                            \n"
                +"NVL(DEPT.DESCRIPTION,'') DEPARTMENT,                       \n"
                +"NVL(GEND.DESCRIPTION,'') GENDER,                           \n"
                +"NVL(TRUNC(MONTHS_BETWEEN(SYSDATE, HR.DOB)/12),'0') AGE,    \n"
                +"NVL(LOC.DESCRIPTION,'') LOCATION                           \n"
                +" FROM "+ Database.DCMS.hrEmployee +" HR,                   \n"
                + Database.DCMS.definitionTypeDetail +" DEPT,                \n"
                + Database.DCMS.definitionTypeDetail +" GEND,                \n"
                + Database.DCMS.location +" LOC                              \n"
                +" WHERE HR.EMPLOYEE_ID = '"+EmpId+"'                        \n"
                +"AND DEPT.ID = HR.DEPARTMENT_ID                             \n"
                +"AND LOC.ID = HR.LOCATION_ID                                \n" 
                +"AND HR.GENDER_ID = GEND.ID";
        
         List<HashMap> lis = Constants.dao.selectDatainList(query, columns);
         HrLetter objHr = new HrLetter();
        
        for (int i =0; i < lis.size(); i++){
            
            HashMap map = (HashMap) lis.get(0);
            objHr.setEmpId(map.get("EMPLOYEE_ID").toString());
            objHr.setFulName(map.get("FULL_NAME").toString());
            objHr.setDepartment(map.get("DEPARTMENT").toString());
            objHr.setGender(map.get("GENDER").toString());
            objHr.setAge(map.get("AGE").toString());
            objHr.setLocation(map.get("LOCATION").toString());
        }
        
        return objHr;
    }
    
//    public boolean insertLetter(HrLetter hrLetter){
//        
//        String[] columns = {Database.DCMS.hrEmployeeLetter,"EMP_ID","TEMP_TYPE_ID"};
//        
//        HashMap letterMap = new HashMap();
//        
//        letterMap.put("EMP_ID", "'"+ hrLetter.getEmpId() +"'");
//        letterMap.put("TEMP_TYPE_ID", "'"+ hrLetter.getLeaveType() +"'");
//        
//        Vector vec = new Vector();
//        vec.add(letterMap);
//        
//        return Constants.dao.insertData(vec, columns);
//    }
    
//    public boolean UpdateTemplate(HrLetter Objhr){
//        
//       String query
//                = " UPDATE " + Database.DCMS.hrEmployeeLetter + "\n SET "
//                + "STATUS_ID = '" + Objhr.getLetterStatus() + "' ,"
//                + "TEMPLATES = '" + Objhr.getHrTemplates() + "'"
//                + " WHERE TEMP_TYPE_ID  = '" + Objhr.getLeaveType()  + "'";
//       
//       return Constants.dao.executeUpdate(query, true);
//    }
}

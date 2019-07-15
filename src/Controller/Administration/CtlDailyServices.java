/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Administration;

import BO.Administration.BODailyServices;
import Handler.Administration.HdlDailyServices;
import java.util.List;

/**
 *
 * @author Raheel Ansari
 */
public class CtlDailyServices {
    
    HdlDailyServices objHdl = new HdlDailyServices();
    
    public List<BODailyServices> locWiseDept(String locId){
    
        return objHdl.locWiseDept(locId);
    }
    
    public List<BODailyServices> deptWiseSec(String deptId){
    
        return objHdl.deptWiseSec(deptId);
    }
    
    public List<BODailyServices> sectionWiseServices(String secId, 
                    String fromDate, String toDate){
    
        return objHdl.sectionWiseServices(secId, fromDate, toDate);
    }
    
    public List<BODailyServices> cptWisePatInfo(String cptId, 
                    String fromDate, String toDate){
    
        return objHdl.cptWisePatInfo(cptId, fromDate, toDate);
    }
}

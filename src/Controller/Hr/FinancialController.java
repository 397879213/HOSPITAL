/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Hr;

import BO.Hr.FinancialSupport;
import Handler.Hr.FinancialHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Pacslink
 */
public class FinancialController {
    
    FinancialHandler hdlFinancial = new FinancialHandler();
    
    public List<FinancialSupport> SearchEmpById(String patientId){
        return hdlFinancial.getFinancialInfo(patientId);
    }
    
//    public boolean insertFinance(FinancialSupport fs){
//        
//        boolean ret = hdlFinancial.insertFinance(fs);
//        
//        if(ret){
//            Constants.dao.commitTransaction();
//        }
//        
//        return ret;
//    }
//    
//    public boolean UpdateTemplate(HrLetter hrLetter){
//        return hdlHr.UpdateTemplate(hrLetter);
//    }
    
    
}

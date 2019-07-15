/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Hr;

import BO.Hr.HrLetter;
import Handler.Hr.HrLetterHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Pacslink
 */
public class HrLetterController {
    
    HrLetterHandler hdlHr = new HrLetterHandler();
    
    public HrLetter SearchEmpById(String EmpId){
        return hdlHr.FetchEmpById(EmpId);
    }
    
//    public boolean insertLetter(HrLetter hrLetter){
//        
//        boolean ret = hdlHr.insertLetter(hrLetter);
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

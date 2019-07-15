/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.LTU;

import BO.LTU.DialysisBO;
import Handler.LTU.DialysisHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class DialysisController {
    
    DialysisHandler hdlDialysis = new DialysisHandler();
    
    public List<DialysisBO> selectDialysis(String con,
            String odi) {
        return hdlDialysis.selectDialysis(con, odi);
    }
    
    public boolean insertDialysis(DialysisBO objSave) {
        boolean ret = hdlDialysis.insertDialysis(objSave);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateDialysis(DialysisBO objUpdate) {
        boolean ret = hdlDialysis.updateDialysis(objUpdate);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}

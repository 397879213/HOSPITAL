/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.IpdMedicinePlanBO;
import Handler.Hospital.IpdMedicinePlanHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Adeel
 */
public class IpdMedicinePlanController {
    
    IpdMedicinePlanHandler hdlIpdMedPlan = new IpdMedicinePlanHandler();
            
    public List<IpdMedicinePlanBO> selectIpdMedcinePlan(String patientId,
            String admissionNo, String status) {
        return hdlIpdMedPlan.selectIpdMedcinePlan(patientId, admissionNo, status);
    }
    
    public boolean insertIpdMedicinePlan(IpdMedicinePlanBO imp) {
        boolean ret = hdlIpdMedPlan.insertIpdMedicinePlan(imp);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateDiscontinueMedicine(List<String> listImp, 
            IpdMedicinePlanBO objUpdate,String active ) {
        boolean ret = hdlIpdMedPlan.updateDiscontinueMedicine(listImp, objUpdate, 
                active);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}

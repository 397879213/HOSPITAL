/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentOnDischarge.Controller;

import TreatmentOnDischarge.BO.TreatmentOnDischarge;
import TreatmentOnDischarge.Handler.TreatmentOnDischrageHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class TreatmentOnDischrageController {
    
    TreatmentOnDischrageHandler hdlTreatmentOnDischrage = new TreatmentOnDischrageHandler();
    public List<TreatmentOnDischarge> selectTreatmentOnDischrage(String patientId,
            String admissionNumber) {
        return hdlTreatmentOnDischrage.selectTreatmentOnDischrage(patientId, admissionNumber);
    }
    
    public List<TreatmentOnDischarge> selectTreatmentOnDischrageDetail(String patientId,
            String admissionNumber, String actionId) {
        return hdlTreatmentOnDischrage.selectTreatmentOnDischrageDetail(patientId, 
                admissionNumber, actionId);
    }
    
    public boolean insertTreatmentOnDischrage(TreatmentOnDischarge objSave) {
        boolean ret = hdlTreatmentOnDischrage.insertTreatmentOnDischrage(objSave);
//        if(ret){
//            ret = hdlTreatmentOnDischrage.deleteTreatmentOnDischrageDetail(objSave);
//        }
//        if(ret){
//            ret = hdlTreatmentOnDischrage.insertTreatmentOnDischrageDetail(objSave);
//        }
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateTreatmentOnDischrage(TreatmentOnDischarge objUpdate) {
        boolean ret = hdlTreatmentOnDischrage.updateTreatmentOnDischrage(objUpdate);
//        if(ret){
//            ret = hdlTreatmentOnDischrage.deleteTreatmentOnDischrageDetail(objUpdate);
//        }
//        if(ret){
//            ret = hdlTreatmentOnDischrage.insertTreatmentOnDischrageDetail(objUpdate);
//        }
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertTreatmentOnDischrageDetail(TreatmentOnDischarge objSave) {
        boolean ret = hdlTreatmentOnDischrage.insertTreatmentOnDischrageDetail(objSave);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteTreatmentOnDischrageDetail(TreatmentOnDischarge objSave) {
        boolean ret = hdlTreatmentOnDischrage.deleteTreatmentOnDischrageDetail(objSave);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertTreatmentOnDischrageHistory(TreatmentOnDischarge objSave) {
        boolean ret = hdlTreatmentOnDischrage.insertTreatmentOnDischrageHistory(objSave);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}

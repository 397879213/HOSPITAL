/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.Controller;

import Antenatal.BO.GynaeParameter;
import Antenatal.Handler.GynaeParameterHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class GynaeParameterController {
    
    GynaeParameterHandler hdlGayneeParameter = new GynaeParameterHandler();
    
    public List<GynaeParameter> selectGayneeParameter(String patientId,
            String referenceNumber, String pregnancyVisitId) {
        return hdlGayneeParameter.selectGayneeParameter(patientId, referenceNumber,
                pregnancyVisitId);
    }
    
    public boolean insertGayneeParameters(GynaeParameter objSave) {
        boolean ret = hdlGayneeParameter.insertGayneeParameters(objSave);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateGayneeParameters(GynaeParameter objUpdate) {
        boolean ret = hdlGayneeParameter.updateGayneeParameters(objUpdate);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean fetchRecord(GynaeParameter objUpdate) {
        boolean ret = hdlGayneeParameter.fetchRecord(objUpdate);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}

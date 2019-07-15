/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.Controller;

import Antenatal.BO.AntenatalPatientInfo;
import Antenatal.Handler.AntenatalPatientInfoHandler;
import java.util.List;
import utilities.Constants;

 
public class AntenatalPatientInfoController {
    
    AntenatalPatientInfoHandler hdlAntenatalPatientInfo = new AntenatalPatientInfoHandler();
    
    public String selectPregnancyVisitId(String patientId) {
        return hdlAntenatalPatientInfo.selectPregnancyVisitId(patientId);
    }
    
    public List<AntenatalPatientInfo> selectAntenatalPatientInfo(String patientId,
            String referenceNumber, String pregnancyVisitId) {
        return hdlAntenatalPatientInfo.selectAntenatalPatientInfo(patientId, 
                referenceNumber, pregnancyVisitId);
    }
    
    public boolean insertAntenatalPatientInfo(AntenatalPatientInfo objSave) {
        boolean ret = hdlAntenatalPatientInfo.insertAntenatalPatientInfo(objSave);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateAntenatalPatientInfo(AntenatalPatientInfo objUpdate) {
        boolean ret = hdlAntenatalPatientInfo.updateAntenatalPatientInfo(objUpdate);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}

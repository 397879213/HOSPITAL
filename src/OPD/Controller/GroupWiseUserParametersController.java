/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Controller;

import BO.Patient;
import OPD.Handler.GroupWiseUserParametersHandler;
import java.util.List;

/**
 *
 * @author raheelansari
 */
public class GroupWiseUserParametersController {
 
    GroupWiseUserParametersHandler hdlUserParameters = new GroupWiseUserParametersHandler();
    public List<Patient> selectPatientInfo(String patientId) {
        return hdlUserParameters.selectPatientInfo(patientId);
    }
}

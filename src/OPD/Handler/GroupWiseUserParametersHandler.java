/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Handler;

import BO.Patient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class GroupWiseUserParametersHandler { //GroupWiseUserParameters
    
    public List<Patient> selectPatientInfo(String patientId) {
        String[] column = {"-", "PATIENT_ID", "FULL_NAME", "AGE", "GENDER_ID",
                            "GENDER"};
        String query
                = " SELECT PAT.PATIENT_ID,                                      \n"
                + " PAT.FULL_NAME,                                              \n"
                + " ROUND((SYSDATE - PAT.Dob)/365)  AGE,                        \n"
                + " PAT.GENDER_ID,                                              \n"
                + " GEN.DESCRIPTION    GENDER             FROM                  \n"
                + Database.DCMS.patient + " PAT,                                \n"
                + Database.DCMS.definitionTypeDetail + " GEN                    \n"
                + " WHERE PAT.PATIENT_ID ='" + patientId + "'                   \n"
                + " AND PAT.GENDER_ID = GEN.ID                                  \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, column);
        List<Patient> Listreferral = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            Patient patientObj = new Patient();

            patientObj.setPatientId(map.get("PATIENT_ID").toString());
            patientObj.setFullName(map.get("FULL_NAME").toString());
            patientObj.setAge(map.get("AGE").toString());
            patientObj.setGenderId(map.get("GENDER_ID").toString());
            patientObj.setGenderDescription(map.get("GENDER").toString());
            Listreferral.add(patientObj);
        }
        return Listreferral;
    }
}

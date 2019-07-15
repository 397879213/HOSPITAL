/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BO.Setup.OpdInformationBO;
import Handler.OpdInformationHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Danish
 */
public class OpdInfoController {

    OpdInformationHandler objHdl = new OpdInformationHandler();

    public List<OpdInformationBO> searchEmployeeData(String plNo) {
        return objHdl.searchEmployeeData(plNo);
    }

    public List<OpdInformationBO> searchPatientVisits(String patientId) {
        return objHdl.searchPatientVisits(patientId);
    }

    public List<OpdInformationBO> searchVisitMedicine(String visitNo) {
        return objHdl.searchVisitMedicine(visitNo);
    }

    public boolean insertPatientNotess(OpdInformationBO patientNotes) {

        boolean ret = objHdl.insertPatientNotess(patientNotes);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.remoteRollBack();
        }
        return ret;
    }
}

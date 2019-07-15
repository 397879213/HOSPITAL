package Controller;

import BO.Patient;
import Handler.PatientHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.PrintJasperReport;
import utilities.Reports;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import utilities.Status;

@ManagedBean
@ViewScoped

/**
 *
 * @author Sibtain
 */
public class PatientController implements java.io.Serializable {

    public PatientHandler hdlPatient = new PatientHandler();

    public Patient searchPatient(String patientId) {
        return hdlPatient.searchPatient(patientId);
    }

    public String selectpatientPicture(String patientId) {

        return hdlPatient.getPatientPicture(patientId);

    }

    public Vector searchPatient(Patient patient) {
        return (Vector) hdlPatient.generalSearchPatient(patient);
    }

    public int selectAdmissionNo(String currentPatientId) {

        String[] cols = {"", "ADMISSION_NO"};

        String query = " SELECT ID ADMISSION_NO FROM " + Database.DCMS.patientAdmission
                + " WHERE PATIENT_ID = '" + currentPatientId + "' \n";

        int admissionNo = 0;
        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        if (!list.isEmpty()) {
            admissionNo = Integer.parseInt(list.get(0).get("ADMISSION_NO").toString());
        }

        return admissionNo;
    }

    public boolean checkAdmittedPatientStatus(String patientId) {

        boolean ret = true;
        String[] cols = {"", "ORDER_STATUS_ID"};
        String query = "SELECT ORDER_STATUS_ID FROM "
                + Database.DCMS.patientAdmission + " "
                + " WHERE PATIENT_ID = '" + patientId + "'";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        if (list.isEmpty()) {
            return true;
        }
        String status = list.get(0).get("ORDER_STATUS_ID").toString();

        if (!status.equalsIgnoreCase(Status.admitted)) {
            ret = false;
        }
        return ret;
    }
}

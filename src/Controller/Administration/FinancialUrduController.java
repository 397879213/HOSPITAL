package Controller.Administration;

import BO.Patient;
import Handler.FinancialUrduHandler;
import Handler.PatientHandler;
import java.util.List;

public class FinancialUrduController {

    FinancialUrduHandler hdlzakat = new FinancialUrduHandler();
    FinancialUrduHandler hdlPatient = new FinancialUrduHandler();

//    public List<Patient> searchPatient(String patientId) {
//        return hdlzakat.searchPatient(patientId);
//    }
    
    public Patient searchPatient(String patientId) {
        return hdlPatient.searchPatient(patientId);
    }


    
}



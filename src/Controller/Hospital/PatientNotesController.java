/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.PatientNotes;
import BO.MedicineOrderEntry;
import Handler.Hospital.PatientNotesHandler;
import java.util.List;
import utilities.Constants;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

/**
 * @author pacslink
 */
public class PatientNotesController implements java.io.Serializable {

    PatientNotesHandler hdlPatientNotes = new PatientNotesHandler();

    public boolean insertPatientNotes(PatientNotes notes) {

        boolean ret;
        List<PatientNotes> listNote = hdlPatientNotes.selectPatientNotesStatus(notes, "N");

        if (listNote.isEmpty()) {
            ret = hdlPatientNotes.insertPatientNotes(notes);
        } else {
            ret = hdlPatientNotes.updatePatientNote(notes);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<PatientNotes> selectPatientNotes(PatientNotes note) {

        return hdlPatientNotes.selectPatientNotes(note);
    }

    public List<PatientNotes> selectPatientNotesStatus(PatientNotes note,
            String isFinal) {
        return hdlPatientNotes.selectPatientNotesStatus(note, isFinal);
    }

    public List<MedicineOrderEntry> selectPatientMedications(String patientId,
            String crtdBy, String fromDate, String toDate, String admissionNo,
            String itemId) {

        return hdlPatientNotes.selectPatientMedicationOrders(patientId,
                crtdBy, fromDate, toDate, admissionNo, itemId);
    }

    public String selectPatientClient(String patientId) {
        return hdlPatientNotes.selectPatientClient(patientId);
    }
    
//    ///ADDENDUM CONTROLLER
//     public boolean insertPatientAddendumNotes(PatientNotes notes) {
//
//        boolean ret;
//        List<PatientNotes> listNote = hdlPatientNotes.selectPatientNotesStatus(notes, "N");
//
//        if (listNote.isEmpty()) {
//            ret = hdlPatientNotes.insertPatientAddendumNotes(notes);
//        } else {
//            ret = hdlPatientNotes.updatePatientNote(notes);
//        }
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        } else {
//            Constants.dao.rollBack();
//        }
//        return ret;
//    }
     
     
      public List<PatientNotes> selectPatientAddendumNotes(PatientNotes notes) {

        return hdlPatientNotes.selectPatientAddendumNotes(notes);
    }

    
    
}

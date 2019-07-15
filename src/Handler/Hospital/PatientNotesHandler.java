/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;

import BO.Hospital.PatientNotes;
import BO.MedicineOrderEntry;
import BO.Patient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import javax.faces.bean.ManagedBean;
import utilities.Status;

@ManagedBean
/**
 *
 * @author PACSLINK
 */

public class PatientNotesHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public boolean insertPatientNotes(PatientNotes notes) {
        String[] columns = {Database.DCMS.patientNotes, "ID", "NOTE_REF_ID",
            "PATIENT_ID", "NOTE_TYPE_ID", "NOTES", "ORDER_LOCATION_ID", "IS_FINAL",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        notes.setId(key.generatePrimaryKey(Keys.patientNotes, false));
        HashMap patNote = new HashMap();
        patNote.put("ID", "'" + notes.getId() + "'");
        patNote.put("NOTE_REF_ID", "'" + notes.getNoteReferenceId() + "'");
        patNote.put("PATIENT_ID", "'" + notes.getPatientId() + "'");
        patNote.put("NOTE_TYPE_ID", "'" + notes.getNoteTypeId() + "'");
        patNote.put("NOTES", "'" + notes.getNotes().trim() + "'");
        patNote.put("ORDER_LOCATION_ID", "'" + notes.getOrderLocationId() + "'");
        patNote.put("IS_FINAL", "'" + notes.getIsFinal() + "'");
        patNote.put("CRTD_DATE", "" + Constants.today + "");
        patNote.put("CRTD_BY", "'" + notes.getCrtdBy() + "'");
        patNote.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List listMember = new ArrayList();
        listMember.add(patNote);
        return Constants.dao.insertData(listMember, columns);
    }

    public List<PatientNotes> selectPatientNotes(PatientNotes note) {

        String colums[] = {"-", "ID", "PATIENT_ID", "NOTES", "ORDER_LOCATION_ID",
            "ORDER_LOCATION_DESCRIPTION", "IS_FINAL", "CRTD_BY", "CRTD_DATE",
            "NOTES_BY", "NOTE_TYPE_ID", "NOTE_TYPE"};

        String query = " SELECT  NOTES.ID,                                  \n"
                + " NOTES.PATIENT_ID            PATIENT_ID,                 \n"
                + " NVL(NOTES.NOTES,' ')        NOTES,                      \n"
                + " NOTES.IS_FINAL              IS_FINAL,                   \n"
                + " NOTES.ORDER_LOCATION_ID     ORDER_LOCATION_ID,          \n"
                + " NOTES.ORDER_LOCATION_ID     ORDER_LOCATION_ID,          \n"
                + " NOTES.NOTE_TYPE_ID          NOTE_TYPE_ID,               \n"
                + " NTI.DESCRIPTION             NOTE_TYPE,                  \n"
                + " DTD.DESCRIPTION             ORDER_LOCATION_DESCRIPTION, \n"
                + " TO_CHAR(NOTES.CRTD_DATE, 'DD-MON-YY')    CRTD_DATE,     \n"
                + " NVL(NOTES.FINAL_BY, NOTES.CRTD_BY)  CRTD_BY,            \n"
                + " USR.NAME                                 NOTES_BY       \n"
                + " FROM                                                    \n"
                + Database.DCMS.patientNotes + "                   NOTES,   \n"
                + Database.DCMS.patient + "                        PAT,     \n"
                + Database.DCMS.definitionTypeDetail + "           DTD,     \n"
                + Database.DCMS.definitionTypeDetail + "           NTI,     \n"
                + Database.DCMS.users + "                          USR      \n"
                + " WHERE NOTES.PATIENT_ID IN (SELECT MERGE_PATIENT_ID FROM "
                + Database.DCMS.mergePatient + " WHERE PATIENT_ID = '" + note.getPatientId() + "')  \n"
                + " AND  NOTES.PATIENT_ID = PAT.PATIENT_ID                  \n";

        if (!note.getNoteTypeId().isEmpty()) {
            query += " AND NOTES.NOTE_TYPE_ID = '" + note.getNoteTypeId() + "' \n";
        }
        if (!(note.getFromDate().isEmpty()) && !(note.getToDate().isEmpty())) {
            query += " AND TRUNC(NOTES.CRTD_DATE) BETWEEN TO_DATE('" + note.getFromDate()
                    + "','DD-MON-YY') " + " AND TO_DATE('" + note.getToDate() + "','DD-MON-YY')\n";
        }
        if (!note.getNotesBy().isEmpty()) {
            query += " AND NVL(NOTES.FINAL_BY, NOTES.CRTD_BY) = '" + note.getNotesBy() + "'  \n";
        }

        query += " AND NVL(NOTES.FINAL_BY, NOTES.CRTD_BY) = USR.USER_NAME   \n"
                + " AND NOTES.NOTE_TYPE_ID = NTI.ID                     \n"
                + " AND NOTES.ORDER_LOCATION_ID = DTD.ID                \n"
                + " AND NOTES.IS_FINAL = '" + note.getIsFinal() + "'    \n"
                + " AND NOTES.ACTIVE = 'Y'"
                + " ORDER BY CRTD_DATE ";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<PatientNotes> lisNotes = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            HashMap map = lis.get(i);
            PatientNotes patNote = new PatientNotes();
            patNote.setId(map.get("ID").toString());
            patNote.setPatientId(map.get("PATIENT_ID").toString());
            patNote.setOrderLocationId(map.get("ORDER_LOCATION_ID").toString());
            patNote.setOrderLocationDescription(map.get("ORDER_LOCATION_DESCRIPTION").toString());
            patNote.setNotes(map.get("NOTES").toString());
            patNote.setNoteTypeId(map.get("NOTE_TYPE_ID").toString());
            patNote.setNoteType(map.get("NOTE_TYPE").toString());
            patNote.setNotesBy(map.get("NOTES_BY").toString());
            patNote.setNotesDate(map.get("CRTD_DATE").toString());
            patNote.setIsFinal(map.get("IS_FINAL").toString());
            patNote.setCrtdBy(map.get("CRTD_BY").toString());
            lisNotes.add(patNote);
        }
        return lisNotes;
    }

    public List<PatientNotes> selectPatientNotesStatus(PatientNotes note,
            String isFinal) {

        String colums[] = {"-", "ID", "PATIENT_ID", "NOTES", "ORDER_LOCATION_ID",
            "IS_FINAL", "CRTD_BY", "CRTD_DATE", "NOTE_TYPE", "NOTE_TYPE_ID"};

        String query = " SELECT  NOTES.ID       ID,                         \n"
                + " NOTES.PATIENT_ID            PATIENT_ID,                 \n"
                + " NVL(NOTES.NOTES,' ')        NOTES,                      \n"
                + " NOTES.IS_FINAL              IS_FINAL,                   \n"
                + " NOTES.NOTE_TYPE_ID          NOTE_TYPE_ID,               \n"
                + " NTI.DESCRIPTION             NOTE_TYPE,                  \n"
                + " NOTES.ORDER_LOCATION_ID  ORDER_LOCATION_ID,             \n"
                + " TO_CHAR(NOTES.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,        \n"
                + " NOTES.CRTD_BY                         CRTD_BY           \n"
                + " FROM  "
                + Database.DCMS.patientNotes + "  NOTES,                    \n"
                + Database.DCMS.definitionTypeDetail + "  NTI               \n"
                + " WHERE NOTES.PATIENT_ID = '" + note.getPatientId() + "'  \n"
                + " AND NOTES.NOTE_TYPE_ID = NTI.ID                         \n"
                + " AND NOTES.CRTD_BY = '" + note.getCrtdBy() + "'          \n"
                + " AND NOTES.IS_FINAL = '" + isFinal + "'                  \n"
                + " AND NOTES.ACTIVE = 'Y'                                  \n";
        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<PatientNotes> lisNotes = new ArrayList<>();

        for (int i = 0; i < lis.size(); i++) {
            HashMap map = lis.get(i);
            PatientNotes patNote = new PatientNotes();
            patNote.setId(map.get("ID").toString());
            patNote.setPatientId(map.get("PATIENT_ID").toString());
            patNote.setOrderLocationId(map.get("ORDER_LOCATION_ID").toString());
            patNote.setNotes(map.get("NOTES").toString());
            patNote.setNoteTypeId(map.get("NOTE_TYPE_ID").toString());
            patNote.setNoteType(map.get("NOTE_TYPE").toString());
            patNote.setNotesDate(map.get("CRTD_DATE").toString());
            patNote.setIsFinal(map.get("IS_FINAL").toString());
            patNote.setCrtdBy(map.get("CRTD_BY").toString());
            lisNotes.add(patNote);
        }
        return lisNotes;
    }

    public boolean updatePatientNote(PatientNotes patNote) {
        String query
                = " UPDATE " + Database.DCMS.patientNotes
                + " SET NOTES = '" + patNote.getNotes().trim() + "',    \n"
                + " IS_FINAL = '" + patNote.getIsFinal() + "',          \n"
                + " FINAL_BY = '" + patNote.getNoteFinalBy() + "',      \n"
                + " FINAL_DATE = SYSDATE,                               \n"
                + " FINAL_TERMINAL_ID = '" + Constants.terminalId + "'  \n"
                + " WHERE ID = '" + patNote.getId() + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public List<MedicineOrderEntry> selectPatientMedicationOrders(
            String patientId, String crtdBy, String fromDate, String toDate,
            String admissionNo, String itemId) {

        String colums[] = {"-", "COMPLETE_ORDER_NO", "ITEM_DESCRIPTION",
            "TIME", "INSTRUCTIONS", "DURATION", "QUANTITY", "ORDER_DATE",
            "ORDER_BY"};

        String query = " SELECT ODM.COMPLETE_ORDER_NO   COMPLETE_ORDER_NO,  \n"
                + "   ITM.DESCRIPTION         ITEM_DESCRIPTION,             \n"
                + "   ODM.TIME                TIME,                         \n"
                + "   ODM.INSTRUCTIONS        INSTRUCTIONS,                 \n"
                + "   ODM.DURATION            DURATION,                     \n"
                + "   ODM.DISPENSE_QTY        QUANTITY,                     \n"
                + "   NVL(ODM.CRTD_DATE,'DD-MON-YY')ORDER_DATE,             \n"
                + "   ODM.CRTD_BY             ORDER_BY                      \n"
                + "   FROM                                                  \n"
                + Database.DCMS.medicineOrderDetail + "ODM,                 \n"
                + Database.DCMS.orderMaster + "        OM,                  \n"
                + Database.DCMS.item + "               ITM                  \n"
                + " WHERE OM.PATIENT_ID = '" + patientId + "'               \n"
                + " AND ODM.ORDER_STATUS_ID = '" + Status.invoiced + "'     \n"
                + " AND OM.ORDER_TYPE_ID = '" + Constants.medicineOrderType + "'\n"
                + " AND OM.PATIENT_ID = ODM.PATIENT_ID                      \n"
                + " AND OM.COMPLETE_ORDER_NO = ODM.COMPLETE_ORDER_NO";

        if (!admissionNo.isEmpty()) {
            query += " AND OM.ADMISSION_NO ='" + admissionNo + "'           \n";
        }
        if (!itemId.isEmpty()) {
            query += " AND ITM.ID = '" + itemId + "'                \n";
        }
        if (!(fromDate.isEmpty()) && !(toDate.isEmpty())) {
            query += " AND TRUNC(OM.ORDER_DATE) BETWEEN TO_DATE('" + fromDate + "','DD-MON-YY') "
                    + " AND TO_DATE('" + toDate + "','DD-MON-YY')\n";
        }
        query += " AND ODM.ITEM_ID = ITM.ID ";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<MedicineOrderEntry> lisItems = new ArrayList<>();

        for (int i = 0; i < lis.size(); i++) {
            HashMap map = lis.get(i);
            MedicineOrderEntry patItem = new MedicineOrderEntry();
            patItem.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            patItem.setItemDescription(map.get("ITEM_DESCRIPTION").toString());
            patItem.setDoseTimeDescription(map.get("TIME").toString());
            patItem.setDoseQtyDescription(map.get("INSTRUCTIONS").toString());
            patItem.setDuration(map.get("DURATION").toString());
            patItem.setQuantity(map.get("QUANTITY").toString());
            patItem.setOrderDate(map.get("ORDER_DATE").toString());
            patItem.setCrtdBy(map.get("ORDER_BY").toString());
            lisItems.add(patItem);
        }
        return lisItems;
    }

    public String selectPatientClient(String patientId) {

        String colums[] = {"-", "CLIENT_ID"};
        String query = " SELECT  PAT.CLIENT_ID CLIENT_ID          \n"
                + "   FROM                                        \n"
                + Database.DCMS.patient + "PAT                    \n"
                + " WHERE PAT.PATIENT_ID = '" + patientId + "'    \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        HashMap map = lis.get(0);
        Patient pat = new Patient();
        pat.setClientId(map.get("CLIENT_ID").toString());

        return pat.getClientId();
    }
    
//   public boolean insertPatientAddendumNotes(PatientNotes notes) {
//        String[] columns = {Database.DCMS.patientAddendumNotes,"PATIENT_NOTE_ID",
//            "ID", "NOTES", "ORDER_LOCATION_ID", "IS_FINAL", "CRTD_DATE",
//            "CRTD_BY", "CRTD_TERMINAL_ID"};
//
//        notes.setId(key.generatePrimaryKey(Keys.patientNotes, false));
//        HashMap patNote = new HashMap();
//        patNote.put("PATIENT_NOTE_ID", "'" + notes.getId() + "'");
//        patNote.put("ID", "'" + notes.getId() + "'");
//        patNote.put("NOTES", "'" + notes.getNotes().trim() + "'");
//        patNote.put("ORDER_LOCATION_ID", "'" + notes.getOrderLocationId() + "'");
//        patNote.put("IS_FINAL", "'" + notes.getIsFinal() + "'");
//        patNote.put("CRTD_DATE", "" + Constants.today + "");
//        patNote.put("CRTD_BY", "'" + notes.getCrtdBy() + "'");
//        patNote.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
//        List listMember = new ArrayList();
//        listMember.add(patNote);
//        return Constants.dao.insertData(listMember, columns);
//    }
   

   public List<PatientNotes> selectPatientAddendumNotes(PatientNotes note) {

        String colums[] = {"-", "PATIENT_NOTE_ID", "ID", "NOTES", "IS_FINAL",
            "ORDER_LOCATION_ID", "CRTD_BY", "CRTD_DATE", 
            "CRTD_TERMINAL_ID", "FINAL_BY","FINAL_TERMINAL_ID","FINAL_DATE",
            "NOTE_REF_ID"};

        String query = " SELECT  NOTES.PATIENT_NOTE_ID,                     \n"
                + " NOTES.ID                    ID,                         \n"
                + " NVL(NOTES.NOTES,' ')        NOTES,                      \n"
                + " NOTES.IS_FINAL              IS_FINAL,                   \n"
                + " NOTES.ORDER_LOCATION_ID     ORDER_LOCATION_ID,          \n"
                + " NOTES.CRTD_BY               CRTD_BY,                    \n"
                + " TO_CHAR(NOTES.CRTD_DATE, 'DD-MON-YY')    CRTD_DATE,     \n"
                + " NOTES.CRTD_TERMINAL_ID      CRTD_TERMINAL_ID,           \n"
                + " NOTES.FINAL_BY              FINAL_BY,           \n"
                + " NOTES.FINAL_TERMINAL_ID     FINAL_TERMINAL_ID,          \n"
                + " NOTES.FINAL_DATE            FINAL_DATE,                 \n"
                + " NOTES.NOTE_REF_ID           NOTE_REF_ID                 \n"
                + " FROM                                                    \n"
//                + Database.DCMS.patientAddendumNotes + "           NOTES,   \n"
                + Database.DCMS.definitionTypeDetail + "           DTD      \n"
                + " WHERE DTD.ID = NOTES.ORDER_LOCATION_ID                  \n"
                + " AND NOTES.ACTIVE = 'Y'                                  \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<PatientNotes> lisAddendumNotes = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            HashMap map = lis.get(i);
            PatientNotes patNote = new PatientNotes();
            patNote.setPatientNoteId(map.get("PATIENT_NOTE_ID").toString());
            patNote.setId(map.get("ID").toString());
            patNote.setNotes(map.get("NOTES").toString());
            patNote.setIsFinal(map.get("IS_FINAL").toString());
            patNote.setOrderLocationId(map.get("ORDER_LOCATION_ID").toString());
            patNote.setCrtdBy(map.get("CRTD_BY").toString());
            patNote.setCrtdDate(map.get("CRTD_DATE").toString());
            patNote.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            patNote.setFinalBy(map.get("FINAL_BY").toString());
            patNote.setFinalDate(map.get("FINAL_DATE").toString());
            patNote.setFinalTerminalId(map.get("FINAL_TERMINAL_ID").toString());
            patNote.setNotesBy(map.get("NOTE_REF_ID").toString());
            
            lisAddendumNotes.add(patNote);
        }
        return lisAddendumNotes;
    }
    

}



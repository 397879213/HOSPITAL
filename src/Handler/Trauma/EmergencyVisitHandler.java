/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Trauma;

import BO.Trauma.EmergencyVisit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Sequences;

/**
 *
 * @author Pacslink
 */
public class EmergencyVisitHandler {

    GenerateKeys key = new GenerateKeys();

    String[] EmerColumns = {"-", "PATIENT_ID", "FULL_NAME", "AGE",
        "CONTACT_NO", "MLC_STATUS", "TEMPERATURE", "PULSE", "FBS", "RBS",
        "SYSTOLIC", "DIASTOLIC", "COMPLAINTS", "TREATMENT_PLAN",
        "EMERGENCY_UNIT", "TRANSFERRED_DATE",
        "TRANSFERRED_TERMINAL_ID", "IS_VITAL_FINAL", "VITAL_FINAL_BY",
        "VITAL_FINAL_DATE", "VITAL_FINAL_TERMINAL_ID", "ID", "COMMENTS",
        "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "GENDER", "MLC_DATE", "MLC_TERMINAL_ID"};

    String generalQuery
            = " SELECT EPV.ID,  EPV.PATIENT_ID      PATIENT_ID,             \n"
            + " PAT.FULL_NAME                       FULL_NAME,              \n"
            + " NVL(PAT.AGE, ' ')                   AGE,                    \n"
            + " DTD.DESCRIPTION                     GENDER,                 \n"
            + " NVL(PAT.CONTACT_NO, ' ')            CONTACT_NO,             \n"
            + " EPV.MLC_STATUS                      MLC_STATUS,             \n"
            + " NVL(EPV.TEMPERATURE, ' ')           TEMPERATURE,            \n"
            + " NVL(EPV.PULSE, ' ')                 PULSE,                  \n"
            + " NVL(EPV.FBS, ' ')                   FBS,                    \n"
            + " NVL(EPV.RBS, ' ')                   RBS,                    \n"
            + " NVL(EPV.SYSTOLIC, ' ')              SYSTOLIC,               \n"
            + " NVL(EPV.DIASTOLIC, ' ')             DIASTOLIC,              \n"
            + " NVL(EPV.COMPLAINTS, ' ')            COMPLAINTS,             \n"
            + " NVL(EPV.TREATMENT_PLAN, ' ')        TREATMENT_PLAN,         \n"
            + " NVL(ETU.DESCRIPTION, ' ')           EMERGENCY_UNIT,         \n"
            + " NVL(ETU.DESCRIPTION, ' ')           EMERGENCY_UNIT,         \n"
            + " TO_CHAR(EPV.TRANSFERRED_DATE,'DD-MON-YY')  TRANSFERRED_DATE,\n"
            + " EPV.TRANSFERRED_TERMINAL_ID         TRANSFERRED_TERMINAL_ID,\n"
            + " EPV.IS_VITAL_FINAL                  IS_VITAL_FINAL,         \n"
            + " VFB.NAME                            VITAL_FINAL_BY,         \n"
            + " TO_CHAR(EPV.VITAL_FINAL_DATE,'DD-MON-YY') VITAL_FINAL_DATE, \n"
            + " EPV.VITAL_FINAL_TERMINAL_ID         VITAL_FINAL_TERMINAL_ID,\n"
            + " EPV.ID                              ID,                     \n"
            + " EPV.COMMENTS                        COMMENTS,               \n"
            + " TO_CHAR(EPV.MLC_DATE,'DD-MON-YY')   MLC_DATE,               \n"
            + " EPV.MLC_TERMINAL_ID                 MLC_TERMINAL_ID,        \n"
            + " LOC.DESCRIPTION                     LOCATION_DES,           \n"
            + " MLC.NAME                            MLC_BY,                 \n"
            + " EPV.CRTD_BY                         CRTD_BY,                \n"
            + " TO_CHAR(EPV.CRTD_DATE ,'DD-MON-YY') CRTD_DATE,              \n"
            + " EPV.CRTD_TERMINAL_ID                CRTD_TERMINAL_ID        \n"
            + " FROM "
            + Database.DCMS.emergencyPendingVisit + " EPV,                  \n"
            + Database.DCMS.patient + " PAT,                                \n"
            + Database.DCMS.users + " USR,                                  \n"
            + Database.DCMS.users + " MLC,                                  \n"
            + Database.DCMS.users + " TRC,                                  \n"
            + Database.DCMS.users + " VFB,                                  \n"
            + Database.DCMS.location + " LOC,                               \n"
            + Database.DCMS.definitionTypeDetail + " ETU,                   \n"
            + Database.DCMS.definitionTypeDetail + " DTD                    \n";

    //NVL SELECTION IS MISSING
    //PATIENT INFORMATION IS MISSING
    //TRANSFER_BY IS MISSING
    //Following table are missing in general query 
    //USERS CRD FOR CRTD BY JOINS
    //USERS TRF FOR TRANSFEREED BY JOINS
    String generalJoin
            = " AND EPV.PATIENT_ID = PAT.PATIENT_ID  \n"
            + " AND EPV.EMERGENCY_UNIT_ID = ETU.ID   \n"
            + " AND NVL (EPV.MLC_BY , 'GENERAL') = MLC.USER_NAME \n"
            + " AND NVL (EPV.TRANSFERRED_BY , 'GENERAL') = TRC.USER_NAME "
            + " AND NVL (EPV.VITAL_FINAL_BY , 'GENERAL') = VFB.USER_NAME "
            + " AND EPV.CRTD_BY = USR.USER_NAME      \n"
            + " AND EPV.LOCATION_ID = LOC.ID         \n"
            + " AND PAT.GENDER_ID = DTD.ID           \n";

    public boolean insertEmergencyVisit(String patientId) {

        String[] columns = {Database.DCMS.emergencyPendingVisit, "ID",
            "PATIENT_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap mapEmer = new HashMap();
        mapEmer.put("ID", Sequences.traumaVisitId);
        mapEmer.put("PATIENT_ID", "'" + patientId + "'");
        mapEmer.put("CRTD_BY", "'" + Constants.userId + "'");
        mapEmer.put("CRTD_TERMIAL_ID", "'" + Constants.terminalId + "'");

        List listItem = new ArrayList();
        listItem.add(mapEmer);
        boolean ret = Constants.dao.insertData(listItem, columns);

        if (ret) {
            columns[0] = Database.DCMS.emergencyPendingVisit;
            ret = Constants.dao.insertData(listItem, columns);
        }
        return ret;

    }

    public List<EmergencyVisit> selectPendingByPatient(String patientId) {

        String query = generalQuery
                + " WHERE EPV.PATIENT_ID = '" + patientId + "'         \n"
                + generalJoin + " ORDER BY EPV.PATIENT_ID ";

        return setPatient(Constants.dao.selectData(query, EmerColumns));
    }

    public List<EmergencyVisit> selectPendingByTraumaUnit(String EmergencyUnitId) {

        String query = generalQuery
                + " WHERE EPV.EMERGENCY_UNIT_ID = '" + EmergencyUnitId + "' \n"
                + generalJoin + " ORDER BY ID ";

        return setPatient(Constants.dao.selectData(query, EmerColumns));
    }

    public boolean updatePendingComplaints(EmergencyVisit com) {
        String query
                = " UPDATE " + Database.DCMS.emergencyPendingVisit + "\n"
                + " SET COMPLAINTS  = '" + com.getComplaints().replaceAll("'", "''") + "', \n"
                + " TREATMENT_PLAN  = '" + com.getTreatment().replaceAll("'", "''") + "' \n"
                + " WHERE EPV.PATIENT_ID = '" + com.getPatientId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updatePendingVitals(EmergencyVisit vital) {
        String query
                = " UPDATE " + Database.DCMS.emergencyPendingVisit + "\n"
                + " SET PULSE  = '" + vital.getPulse().replaceAll("'", "''") + "', \n"
                + " TEMPERATURE  = '" + vital.getTemperature().replaceAll("'", "''") + "', \n"
                + " FBS  = '" + vital.getFbs().replaceAll("'", "''") + "', \n"
                + " RBS  = '" + vital.getRbs().replaceAll("'", "''") + "', \n"
                + " SYSTOLIC  = '" + vital.getSystolic().replaceAll("'", "''") + "', \n"
                + " DIASTOLIC  = '" + vital.getDiastolic().replaceAll("'", "''") + "' \n"
                + " WHERE ID = '" + vital.getId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    //COMPLETE THIS LIST FOR PATIENT INFO AND OTHER THINGS
    public List setPatient(List list) {

        List<EmergencyVisit> ListEmer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(0);
            EmergencyVisit obj = new EmergencyVisit();
            obj.setId(map.get("ID").toString());
            obj.setPatientId(map.get("PATIENT_ID").toString());
            obj.setFullName(map.get("FULL_NAME").toString());
            obj.setAge(map.get("AGE").toString());
            obj.setGender(map.get("GENDER").toString());
            obj.setContactNo(map.get("CONTACT_NO").toString());
            obj.setMlcStatus(map.get("MLC_STATUS").toString());
            obj.setTemperature(map.get("TEMPERATURE").toString());
            obj.setPulse(map.get("PULSE").toString());
            obj.setPatientVisitId(map.get("ID").toString());
            obj.setFbs(map.get("FBS").toString());
            obj.setRbs(map.get("RBS").toString());
            obj.setSystolic(map.get("SYSTOLIC").toString());
            obj.setDiastolic(map.get("DIASTOLIC").toString());
            obj.setComplaints(map.get("COMPLAINTS").toString());
            obj.setTreatment(map.get("TREATMENT_PLAN").toString());
            obj.setEmergencyUnit(map.get("EMERGENCY_UNIT").toString());
            obj.setTransferredDate(map.get("TRANSFERRED_DATE").toString());
            obj.setTransferredTerminalId(map.get("TRANSFERRED_TERMINAL_ID").toString());
            obj.setIsVitalFinal(map.get("IS_VITAL_FINAL").toString());
            obj.setVitalFinalDate(map.get("VITAL_FINAL_DATE").toString());
            obj.setVitalFinalTerminalId(map.get("VITAL_FINAL_TERMINAL_ID").toString());
            obj.setComments(map.get("COMMENTS").toString());
            obj.setMlcDate(map.get("MLC_DATE").toString());
            obj.setMlcTerminalId(map.get("MLC_TERMINAL_ID").toString());
            obj.setEmergencyUnit(map.get("EMERGENCY_UNIT").toString());
            obj.setCrtdBy(map.get("CRTD_BY").toString());
            obj.setCrtdDate(map.get("CRTD_DATE").toString());
            obj.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            ListEmer.add(obj);
        }
        return ListEmer;
    }

    String generalQueryPerformed
            = " SELECT EPV.PATIENT_ID               PATIENT_ID,           \n"
            + " PAT.FULL_NAME                       FULL_NAME,            \n"
            + " NVL(PAT.AGE, ' ')                   AGE,                  \n"
            + " PAT.GENDER_ID                       GENDER_ID,            \n"
            + " DTD.DESCRIPTION                     GENDER,               \n"
            + " NVL(PAT.CONTACT_NO, ' ')            CONTACT_NO,           \n"
            + " NVL(EPV.MLC_STATUS, ' ')            MLC_STATUS,           \n"
            + " EPV.EMERGENCY_UNIT_ID               EMERGENCY_UNIT_ID,    \n"
            + " NVL(EPR.TEMPERATURE, ' ')           TEMPERATURE,          \n"
            + " NVL(EPR.PULSE, ' ')                 PULSE,                \n"
            + " NVL(EPR.FBS, ' ')                   FBS,                  \n"
            + " NVL(EPR.RBS, ' ')                   RBS,                  \n"
            + " NVL(EPR.SYSTOLIC, ' ')              SYSTOLIC,             \n"
            + " NVL(EPR.DIASTOLIC, ' ')             DIASTOLIC,            \n"
            + " NVL(EPR.COMPLAINTS, ' ')            COMPLAINTS,           \n"
            + " NVL(EPR.TREATMENT_PLAN, ' ')        TREATMENT_PLAN,       \n"
            + " NVL(ETU.DESCRIPTION, ' ')           TREATMENT_UNIT,       \n"
            + " NVL(DD.TYPE, ' ')                   DISCHARGE_TYPE        \n"
            + " EPR.CRTD_BY                         CRTD_BY,              \n"
            + " TO_CHAR(EPR.CRTD_DATE ,'DD-MON-YY') CRTD_DATE,            \n"
            + " EPR.CRTD_TERMINAL_ID                CRTD_TERMINAL_ID      \n"
            + " FROM " + Database.DCMS.emergencyPerformedVisit + " EPR,   \n"
            + Database.DCMS.patient + " PAT,                              \n"
            + Database.DCMS.users + " USR,                                \n"
            + Database.DCMS.definitionTypeDetail + " ETU                  \n"
            + Database.DCMS.definitionTypeDetail + " DTD                  \n"
            + Database.DCMS.definitionTypeDetail + " DD                   \n";

    String generalJoinPerformed
            = " AND EPR.PATIENT_ID = PAT.PATIENT_ID  \n"
            + " AND EPR.MEDICAL_UNIT_ID = ETU.ID     \n"
            + " AND EPR.CRTD_BY = USR.USER_NAME      \n"
            + " AND PAT.GENDER_ID = DTD.ID           \n"
            + " AND MEDICAL_UNIT_ID = DD.ID          \n";

    public boolean insertEmergencyVisitPerformed(String patientId) {

        String[] columns = {Database.DCMS.emergencyPerformedVisit, "ID",
            "PATIENT_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap mapEmer = new HashMap();
        mapEmer.put("ID", Sequences.traumaVisitId);
        mapEmer.put("PATIENT_ID", "'" + patientId + "'");
        mapEmer.put("CRTD_BY", "'" + Constants.userId + "'");
        mapEmer.put("CRTD_TERMIAL_ID", "'" + Constants.terminalId + "'");

        List listItem = new ArrayList();
        listItem.add(mapEmer);
        boolean ret = Constants.dao.insertData(listItem, columns);

        if (ret) {
            columns[0] = Database.DCMS.emergencyPerformedVisit;
            ret = Constants.dao.insertData(listItem, columns);
        }
        return ret;

    }

    public List<EmergencyVisit> selectPerformedByPatient(String patientId) {

        String query = generalQuery
                + " WHERE EPR.PATIENT_ID = '" + patientId + "'"
                + generalJoin + " ORDER BY EPV.ID ";

        return setPatient(Constants.dao.selectData(query, EmerColumns));
    }

    public List<EmergencyVisit> selectPerformedByTraumaUnit(String MedicalUnitId) {

        String query = generalQuery
                + " WHERE EPR.MEDICAL_UNIT_ID = '" + MedicalUnitId + "' \n"
                + generalJoin + " ORDER BY EPV.ID ";

        return setPatient(Constants.dao.selectData(query, EmerColumns));
    }

    public boolean updatePerformedDischargeType(EmergencyVisit patientType) {
        String query
                = " UPDATE " + Database.DCMS.emergencyPerformedVisit + "\n"
                + " SET MEDICAL_UNIT_ID  = '" + patientType.getEmergencyUnit().replaceAll("'", "''") + "' \n"
                + " WHERE EPR.MEDICAL_UNIT_ID = DD.ID";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updatePerformedVitals(EmergencyVisit vital) {
        String query
                = " UPDATE " + Database.DCMS.emergencyPerformedVisit + "\n"
                + " SET PULSE = '" + vital.getPulse().replaceAll("'", "''") + "', \n"
                + " FBS  = '" + vital.getFbs().replaceAll("'", "''") + "', \n"
                + " RBS  = '" + vital.getRbs().replaceAll("'", "''") + "', \n"
                + " SYSTOLIC  = '" + vital.getSystolic().replaceAll("'", "''") + "', \n"
                + " DIASTOLIC  = '" + vital.getDiastolic().replaceAll("'", "''") + "' \n"
                + " WHERE EPR.ID = '" + vital.getId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updatePerformedComplaints(EmergencyVisit com) {
        String query
                = " UPDATE " + Database.DCMS.emergencyPerformedVisit + "\n"
                + " SET COMPLAINTS  = '" + com.getComplaints().replaceAll("'", "''") + "', \n"
                + " TREATMENT_PLAN  = '" + com.getTreatment().replaceAll("'", "''") + "' \n"
                + " WHERE EPR.PATIENT_ID = '" + com.getPatientId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

//    
//    public boolean saveDischargeComments(EmergencyVisit patientDischarge,
//            String action, PatientAdmission admission) {
//
//        String query
//                = " UPDATE " + Database.DCMS.patientDischarge + "\n"
//                + " SET DISCHARGE_TYPE_ID  = '" + patientDischarge.getDischargeTypeId() + "', \n"
//                + " SUMMARY = '" + patientDischarge.getSummary().replaceAll("'", "''") + "',\n"
//                + " INVESTIGATIONS = '" + patientDischarge.getInvestigation().replaceAll("'", "''") + "',\n"
//                + " ADVICE = '" + patientDischarge.getAdvice().replaceAll("'", "''") + "',\n"
//                + " NEXT_VISIT = '" + patientDischarge.getNextVisit().replaceAll("'", "''") + "',\n"
//                + " DIAGNOSIS = '" + patientDischarge.getDiagnosisName().replaceAll("'", "''") + "'\n"
//                + " WHERE ADMISSION_NO = '" + patientDischarge.getAdmissionNo() + "'";
//
//        boolean ret = Constants.dao.executeUpdate(query, false);
//
//        if (ret) {
//            query = " UPDATE " + Database.DCMS.patientAdmission + "\n"
//                    + " SET DISCHARGE_CERTIFICATE  = '" + action + "' \n"
//                    + " WHERE ID =  " + patientDischarge.getAdmissionNo() + " \n";
//            ret = Constants.dao.executeUpdate(query, false);
//        }
//        if (ret && action.equalsIgnoreCase("Y")) {
//
//            ret = ctlOrderhandler.insertOrderActions(admission.getCompleteOrderNo(),
//                    admission.getOrderDetailId(), Actions.dischargedCertificatePreparedBy);
//        }
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//
//        }
//        if (!ret) {
//            ret = false;
//            Constants.dao.rollBack();
//
//        }
//        return ret;
//    }
}

package Handler.Hospital;

import BO.Hospital.PatientAdmission;
import BO.OrderData;
//import Handler.OrderHandler;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import utilities.Actions;
import utilities.CPTReportingFormats;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Locations;
import utilities.Status;

public class PatientAdmissionHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public boolean insertDummayPatientRequest(List<OrderData> listAdmissionRequest) {

        String[] cols = {"", "PATIENT_ID"};

        OrderData data = listAdmissionRequest.get(0);
        String query = "SELECT PATIENT_ID FROM "
                + Database.DCMS.patientAdmission
                + " WHERE PATIENT_ID = '" + data.getPatientId() + "'";
        if (!Constants.dao.selectData(query, cols).isEmpty()) {
            return true;
        }
        PatientAdmission admission = new PatientAdmission();
        try {
            admission.setPatientId(data.getPatientId());
            admission.setCompleteOrderNo(data.getCompleteOrderNo());
            admission.setOrderDetailId(data.getOrderDetailId());
            admission.setReferringPhysicianId(data.getReferringDoctorId());
            admission.setPrimaryPhysicianId(data.getPerformingPhysicianId());
            admission.setAttendingPhysicianId(data.getPerformingPhysicianId());
            //admission.setAdmissionDiagnosisId(TypeDetailId.defineDiagnosis);
            DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date = new Date();
            admission.setAdmissionProposedDate(dateFormat.format(date).toUpperCase());
        } catch (Exception ex) {
            return false;
        }
        boolean ret = insertAdmissionRequest(admission);
        if (ret) {
            ret = insertAdmissionHistory(admission);
        }
        return ret;
    }

    public boolean insertAdmissionRequest(PatientAdmission adr) {
        String[] columns = {Database.DCMS.patientAdmission, "COMPLETE_ORDER_NO",
            "ORDER_DETAIL_ID", "ORDER_STATUS_ID", "REFERRING_PHYSICIAN_ID",
            "PRIMARY_PHYSICIAN_ID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID",
            "PROPOSED_DATE", "PATIENT_ID", "ID", "LOCATION_ID", "GA_REQUIRED",
            "ATTENDING_PHYSICIAN_ID", "SURGERY_DATE", "CPT_ID"};

        adr.setAdmissionNo(key.generatePrimaryKey(Keys.admissionRequest, false));
        HashMap adreq = new HashMap();
        adreq.put("ID", "'" + adr.getAdmissionNo() + "'");
        adreq.put("PATIENT_ID", "'" + adr.getPatientId() + "'");
        adreq.put("COMPLETE_ORDER_NO", "'" + adr.getCompleteOrderNo() + "'");
        adreq.put("ORDER_DETAIL_ID", "'" + adr.getOrderDetailId() + "'");
        adreq.put("CPT_ID", "'" + adr.getCptId() + "'");
        adreq.put("GA_REQUIRED", "'" + adr.getGARequired() + "'");
        adreq.put("ORDER_STATUS_ID", "'" + Status.admissionRequest + "'");
        adreq.put("REFERRING_PHYSICIAN_ID", "'" + adr.getReferringPhysicianId() + "'");
        adreq.put("ATTENDING_PHYSICIAN_ID", "'" + adr.getAttendingPhysicianId() + "'");
        adreq.put("PRIMARY_PHYSICIAN_ID", "'" + adr.getPrimaryPhysicianId() + "'");
        adreq.put("PROPOSED_DATE", "'" + adr.getAdmissionProposedDate() + "'");
        adreq.put("SURGERY_DATE", "'" + adr.getSurgeryDate() + "'");
        adreq.put("LOCATION_ID", "'" + Locations.dowHospital + "'");
        adreq.put("CRTD_DATE", "" + Constants.today + "");
        adreq.put("CRTD_BY", "'" + Constants.userId + "'");
        adreq.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List listMember = new ArrayList();
        listMember.add(adreq);
        return Constants.dao.insertData(listMember, columns);
    }

    public boolean insertAdmissionHistory(PatientAdmission adr) {

        String[] columns = {Database.DCMS.patientAdmissionHistory,
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "ORDER_STATUS_ID", "ID",
            "REFERRING_PHYSICIAN_ID", "PRIMARY_PHYSICIAN_ID", "PATIENT_ID",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "PROPOSED_DATE",
            "LOCATION_ID", "ADMISSION_DIAGNOSIS", "ATTENDING_PHYSICIAN_ID",
            "CPT_ID"};

        List listMember = new ArrayList();
        try {
            HashMap adreq = new HashMap();
            adreq.put("ID", "'" + adr.getAdmissionNo() + "'");
            adreq.put("PATIENT_ID", "'" + adr.getPatientId() + "'");
            adreq.put("COMPLETE_ORDER_NO", "'" + adr.getCompleteOrderNo() + "'");
            adreq.put("ORDER_DETAIL_ID", "'" + adr.getOrderDetailId() + "'");
            adreq.put("CPT_ID", "'" + adr.getCptId() + "'");
            adreq.put("ORDER_STATUS_ID", "'" + Status.admissionRequest + "'");
            adreq.put("ATTENDING_PHYSICIAN_ID", "'" + adr.getAttendingPhysicianId() + "'");
            adreq.put("REFERRING_PHYSICIAN_ID", "'" + adr.getReferringPhysicianId() + "'");
            adreq.put("ADMISSION_DIAGNOSIS", "'" + adr.getAdmissionDiagnosis() + "'");
            adreq.put("PRIMARY_PHYSICIAN_ID", "'" + adr.getPrimaryPhysicianId() + "'");
            adreq.put("PROPOSED_DATE", "'" + adr.getAdmissionProposedDate() + "'");
            adreq.put("LOCATION_ID", "'" + Constants.locationId + "'");
            adreq.put("CRTD_DATE", "" + Constants.today + "");
            adreq.put("CRTD_BY", "'" + Constants.userId + "'");
            adreq.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            listMember.add(adreq);
        } catch (Exception ex) {
            return false;
        }
        return Constants.dao.insertData(listMember, columns);
    }

    public PatientAdmission selectPatientAdmission(String patientId) {
        String[] columns = {Database.DCMS.patientAdmission,
            "PRIMARY_PHYSICIAN_ID", "PROPOSED_DATE", "REFERING_PHYSICIAN_ID",
            "REQUESTED_BY", "PRIMARY_PHYSICIAN_NAME", "REFERRING_PHYSICIAN_NAME",
            "REQUESTED_BY_NAME", "ATTENDING_PHYSICIAN_ID", "STATUS", "ADMISSION_NO",
            "ORDER_STATUS_ID", "CPT", "CPT_DESC", "SUG_DATE", "GA_REQUIRED"};

        String query = "SELECT                                            \n"
                + " PA.PRIMARY_PHYSICIAN_ID PRIMARY_PHYSICIAN_ID,         \n"
                + " PRI.NAME PRIMARY_PHYSICIAN_NAME,PA.ID ADMISSION_NO,   \n"
                + " ATTENDING_PHYSICIAN_ID, STS.DESCRIPTION STATUS,       \n"
                + " PA.REFERRING_PHYSICIAN_ID REFERING_PHYSICIAN_ID,      \n"
                + " TO_CHAR(NVL(PA.SURGERY_DATE, SYSDATE) , 'DD-MON-YY')SUG_DATE, \n"
                + " REF.DOCTOR_NAME REFERRING_PHYSICIAN_NAME,             \n"
                + " NVL(PA.CPT_ID,'GENERAL')CPT, CPT.DESCRIPTION CPT_DESC,\n"
                + " PA.CRTD_BY REQUESTED_BY, PA.ORDER_STATUS_ID,          \n"
                + " REQ.NAME  REQUESTED_BY_NAME, PA.GA_REQUIRED,          \n"
                + " TO_CHAR(NVL(PA.PROPOSED_DATE , PA.CRTD_DATE) , 'DD-MON-YY') \n"
                + " PROPOSED_DATE  FROM \n"
                + Database.DCMS.patientAdmission + " PA,                  \n"
                + Database.DCMS.users + " PRI,                            \n"
                + Database.DCMS.definitionTypeDetail + " STS,             \n"
                + Database.DCMS.doctor + " REF,                           \n"
                + Database.DCMS.CPT + " CPT,                              \n"
                + Database.DCMS.users + " REQ                             \n"
                + " WHERE  PA.PATIENT_ID ='" + patientId + "'\n"
                + " AND PA.PRIMARY_PHYSICIAN_ID = PRI.USER_NAME           \n"
                + " AND NVL(PA.CPT_ID, 'GENERAL') = CPT.CPT_ID            \n"
                + " AND PA.CRTD_BY  = REQ.USER_NAME                       \n"
                + " AND PA.ORDER_STATUS_ID  = STS.ID                      \n"
                + " AND PA.REFERRING_PHYSICIAN_ID = REF.DOCTOR_ID         \n";

        return this.selectVectorPatientAdmissionData(query, columns);

    }

    private PatientAdmission selectVectorPatientAdmissionData(String query, String[] columns) {
        List vec = Constants.dao.selectData(query, columns);
        PatientAdmission patAdd = null;
        if (!vec.isEmpty()) {
            HashMap map = (HashMap) vec.get(0);
            patAdd = new PatientAdmission();
            patAdd.setReferringPhysicianId((String) map.get("REFERING_PHYSICIAN_ID"));
            patAdd.setReferringPhysicianName((String) map.get("REFERRING_PHYSICIAN_NAME"));
            patAdd.setPrimaryPhysicianId((String) map.get("PRIMARY_PHYSICIAN_ID"));
            patAdd.setPrimaryPhysicianName((String) map.get("PRIMARY_PHYSICIAN_NAME"));
            patAdd.setAdmissionNo((String) map.get("ADMISSION_NO"));
            patAdd.setSurgeryDate((String) map.get("SUG_DATE"));
            patAdd.setGARequired(map.get("GA_REQUIRED").toString());
            patAdd.setAdmissionProposedDate((String) map.get("PROPOSED_DATE"));
            patAdd.setOrderStatusDescription((String) map.get("STATUS"));
            patAdd.setOrderStatusId((String) map.get("ORDER_STATUS_ID"));
            patAdd.setPrimaryPhysicianName((String) map.get("PRIMARY_PHYSICIAN_NAME"));
            patAdd.setCptId((String) map.get("CPT"));
            patAdd.setCptDescription((String) map.get("CPT_DESC"));
            patAdd.setRequestedBy((String) map.get("REQUESTED_BY"));
            patAdd.setRequestedName((String) map.get("REQUESTED_BY_NAME"));

        }
        return patAdd;
    }

    String patientAdmissioncolums[] = {"-", "ID", "PATIENT_ID", "FULL_NAME", "AGE",
        "PRIMARY_PHYSICIAN_ID", "PROPOSED_DATE", "REFERRING_PHYSICIAN_ID",
        "GENDER_DESCRIPTION", "ADMITTED_DATE", "DESCRIPTION_STATUS",
        "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "IS_SAVED", "WARD_ID", "SURGERY_DATE",
        "REFERRING_PHYSICIAN_NAME", "PRIMARY_PHYSICIAN_NAME", "BED_ID",
        "ORDER_STATUS_ID", "ADMISSION_REMARKS", "ADMITTED_BY", "ADMITTED_DATE",
        "ADMITTED_TERMINAL_ID", "REQUESTED_BY", "REQUESTED_DATE", "IS_DISCHARGE",
        "REQUESTED_TERMINAL_ID", "ADMISSION_TYPE_ID", "ADMISSION_TYPE",
        "WARD", "BED", "ROOM_TYPE_ID", "ROOM_TYPE", "ADMISSION_DIAGNOSIS",
        "DIAGNOSIS_REMARKS", "ATTENDING_PHYSICIAN_ID", "ATTENDING_PHYSICIAN_NAME",
        "PHARMACY_CREDIT", "DIAGNOSTIC_CREDIT", "PHARMACY_SERVICE",
        "MINIMUM_ADVANCE", "CLIENT_NAME", "TRANSACTION_TYPE", "CLIENT_ID"};

    String generalQuery = " SELECT  ADR.ID,                             \n"
            + " ADR.PATIENT_ID             PATIENT_ID,                  \n"
            + " PAT.FULL_NAME              FULL_NAME,                   \n"
            + " ADR.ATTENDING_PHYSICIAN_ID ATTENDING_PHYSICIAN_ID,      \n"
            + " USRA.NAME                  ATTENDING_PHYSICIAN_NAME,    \n"
            + " ADR.PRIMARY_PHYSICIAN_ID   PRIMARY_PHYSICIAN_ID,        \n"
            + " DTD.DESCRIPTION            DESCRIPTION_STATUS,          \n"
            + " ADR.REFERRING_PHYSICIAN_ID REFERRING_PHYSICIAN_ID,      \n"
            + " ADR.IS_DISCHARGE           IS_DISCHARGE,                \n"
            + " GEN.DESCRIPTION            GENDER_DESCRIPTION,          \n"
            + " PAT.AGE                    AGE,                         \n"
            + " ADR.ADMISSION_TYPE_ID      ADMISSION_TYPE_ID,           \n"
            + " ADT.DESCRIPTION            ADMISSION_TYPE,              \n"
            + " ADR.ROOM_TYPE_ID           ROOM_TYPE_ID,                \n"
            + " ART.DESCRIPTION            ROOM_TYPE,                   \n"
            + " ADR.COMPLETE_ORDER_NO      COMPLETE_ORDER_NO,           \n"
            + " ADR.ORDER_DETAIL_ID        ORDER_DETAIL_ID,             \n"
            + " USRR.DOCTOR_NAME           REFERRING_PHYSICIAN_NAME,    \n"
            + " USRP.NAME                  PRIMARY_PHYSICIAN_NAME,      \n"
            + " ADR.IS_SAVED               IS_SAVED,                    \n"
            + " ADR.ORDER_STATUS_ID        ORDER_STATUS_ID,             \n"
            + " ADR.CRTD_BY                REQUESTED_BY,                \n"
            + " ADR.CRTD_TERMINAL_ID       REQUESTED_TERMINAL_ID,       \n"
            + " NVL(ADR.ADMITTED_BY, ' ')  ADMITTED_BY,                 \n"
            + " ADR.BED_ID                 BED_ID,                      \n"
            + " ADR.WARD_ID                WARD_ID,                     \n"
            + " BED.DESCRIPTION            BED,                         \n"
            + " CLT.ID                     CLIENT_ID,                   \n"
            + " CLT.DESCRIPTION            CLIENT_NAME,                 \n"
            + " CLT.TRANSACTION_TYPE       TRANSACTION_TYPE,            \n"
            + " WRD.DESCRIPTION            WARD,                        \n"
            + " WRD.MINIMUM_ADVANCE        MINIMUM_ADVANCE,             \n"
            + " NVL(ADR.ADMITTED_TERMINAL_ID, ' ')   ADMITTED_TERMINAL_ID,\n"
            + " NVL(ADR.ADMISSION_REMARKS, '  ') ADMISSION_REMARKS,     \n"
            + " TO_CHAR(ADR.PROPOSED_DATE, 'DD-MON-YY')PROPOSED_DATE,   \n"
            + " TO_CHAR(ADR.SURGERY_DATE , 'DD-MON-YY')SURGERY_DATE,    \n"
            + " TO_CHAR(ADR.CRTD_DATE, 'DD-MON-YY')REQUESTED_DATE,      \n"
            + " NVL(TO_CHAR(ADR.ADMITTED_DATE, 'DD-MON-YY HH12:MI AM'),' ') ADMITTED_DATE,\n"
            + " NVL(ADR.DIAGNOSIS_REMARKS,' ')            DIAGNOSIS_REMARKS      ,\n"
            + " ADR.PHARMACY_CREDIT              PHARMACY_CREDIT        ,\n"
            + " ADR.DIAGNOSTIC_CREDIT            DIAGNOSTIC_CREDIT      ,\n"
            + " ADR.PHARMACY_SERVICE             PHARMACY_SERVICE       ,\n"
            + " NVL(ADR.ADMISSION_DIAGNOSIS,' ' )       ADMISSION_DIAGNOSIS \n"
            + " FROM                                                \n"
            + Database.DCMS.patientAdmission + "     ADR,           \n"
            + Database.DCMS.gender + "               GEN,           \n"
            + Database.DCMS.patient + "              PAT,           \n"
            + Database.DCMS.ward + "                 WRD,           \n"
            + Database.DCMS.client + "               CLT,           \n"
            + Database.DCMS.bed + "                  BED,           \n"
            + Database.DCMS.definitionTypeDetail + " DTD,           \n"
            + Database.DCMS.definitionTypeDetail + " ADT,           \n"
            + Database.DCMS.definitionTypeDetail + " ART,           \n"
            + Database.DCMS.doctor + "               USRR,          \n"
            + Database.DCMS.users + "                USRA,          \n"
            + Database.DCMS.users + "                USRP           \n";

    String generalJoin = " AND ADR.PATIENT_ID = PAT.PATIENT_ID      \n"
            + " AND PAT.GENDER_ID = GEN.ID                          \n"
            + " AND PAT.CLIENT_ID= CLT.ID                           \n"
            + " AND ADR.ORDER_STATUS_ID = DTD.ID                    \n"
            + " AND ADR.ROOM_TYPE_ID = ART.ID                       \n"
            + " AND NVL(ADR.ADMISSION_TYPE_ID, "
            + Constants.definitionSelect + ") = ADT.ID              \n"
            + " AND ADR.PRIMARY_PHYSICIAN_ID = USRP.USER_NAME       \n"
            + " AND ADR.ATTENDING_PHYSICIAN_ID = USRA.USER_NAME     \n"
            + " AND ADR.WARD_ID = WRD.ID                            \n"
            + " AND ADR.BED_ID = BED.ID                             \n"
            + " AND ADR.REFERRING_PHYSICIAN_ID =USRR.DOCTOR_ID      \n";

    public List setadmissionInfo(List lis) {

        List vecRequest = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            HashMap map = (HashMap) lis.get(i);
            BO.Hospital.PatientAdmission adreq = new BO.Hospital.PatientAdmission();
            adreq.setAdmissionNo(map.get("ID").toString());
            adreq.setPatientId(map.get("PATIENT_ID").toString());
            adreq.setFullName(map.get("FULL_NAME").toString());
            adreq.setAge(map.get("AGE").toString());
            adreq.setGenderDescription(map.get("GENDER_DESCRIPTION").toString());
            adreq.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            adreq.setClientTransactionType(map.get("TRANSACTION_TYPE").toString());
            adreq.setClientName(map.get("CLIENT_NAME").toString());
            adreq.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
            adreq.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            adreq.setOrderStatusDescription(map.get("DESCRIPTION_STATUS").toString());
            adreq.setAdmissionDiagnosis(map.get("ADMISSION_DIAGNOSIS").toString());
            adreq.setDiagnosisRemarks(map.get("DIAGNOSIS_REMARKS").toString());
            adreq.setAdmissionTypeDescription(map.get("ADMISSION_TYPE").toString());
            adreq.setAdmissionTypeId(map.get("ADMISSION_TYPE_ID").toString());
            adreq.setRoomTypeDescription(map.get("ROOM_TYPE").toString());
            adreq.setRoomTypeId(map.get("ROOM_TYPE_ID").toString());
            adreq.setMinimumAdvance((String) map.get("MINIMUM_ADVANCE"));
            adreq.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            adreq.setPrimaryPhysicianName(map.get("PRIMARY_PHYSICIAN_NAME").toString());
            adreq.setAttendingPhysicianId(map.get("ATTENDING_PHYSICIAN_ID").toString());
            adreq.setAttendingPhysicianName(map.get("ATTENDING_PHYSICIAN_NAME").toString());
            adreq.setReferringPhysicianId(map.get("REFERRING_PHYSICIAN_ID").toString());
            adreq.setReferringPhysicianName(map.get("REFERRING_PHYSICIAN_NAME").toString());
            adreq.setAdmissionProposedDate(map.get("PROPOSED_DATE").toString());
            adreq.setIsDischarge(map.get("IS_DISCHARGE").toString());
            adreq.setRequestedBy(map.get("REQUESTED_BY").toString());
            adreq.setRequestedTerminalId(map.get("REQUESTED_TERMINAL_ID").toString());
            adreq.setRequestedDate(map.get("REQUESTED_DATE").toString());
            adreq.setAdmittedBy(map.get("ADMITTED_BY").toString());
            adreq.setAdmittedTerminalId(map.get("ADMITTED_TERMINAL_ID").toString());
            adreq.setAdmittedDate(map.get("ADMITTED_DATE").toString());
            adreq.setAdmissionRemarks(map.get("ADMISSION_REMARKS").toString().trim());
            adreq.setWardNo(map.get("WARD_ID").toString());
            adreq.setWardDescription(map.get("WARD").toString());
            adreq.setBedNo(map.get("BED_ID").toString());
            adreq.setBedDescription(map.get("BED").toString());
            adreq.setClientId(map.get("CLIENT_ID").toString());
            adreq.setIsSaved(map.get("IS_SAVED").toString());
            adreq.setSurgeryDate((String) map.get("SURGERY_DATE"));
            adreq.setPharmacyCredit((String) map.get("PHARMACY_CREDIT"));
            adreq.setDiagnosticCredit((String) map.get("DIAGNOSTIC_CREDIT"));
            adreq.setPharmacyService((String) map.get("PHARMACY_SERVICE"));

            vecRequest.add(adreq);
        }
        return vecRequest;
    }

    public List selectAdmittedPatientByStatus(String status) {

        String query = generalQuery
                + " WHERE ";
        if (!status.equalsIgnoreCase("")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        query += generalJoin;

        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public List selectAdmittedPatientByPatientId(String status, String patientId) {
        String query = generalQuery
                + " WHERE 1=1";
        if (!status.equalsIgnoreCase("ALL")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (!patientId.isEmpty()) {
            query += " AND ADR.PATIENT_ID='" + patientId + "'\n";
        }
        query += generalJoin;
        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public List selectAdmittedPatientByDate(String status, String fromDate, String toDate, String searchDate) {  //searchDate P for proposed date and r for requested

        String query = generalQuery
                + " WHERE ";
        if (!status.equalsIgnoreCase("")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (fromDate.length() != 0 && toDate.length() != 0) {
            if (searchDate.equalsIgnoreCase("P")) {
                query += " AND TRUNC(ADR.PROPOSED_DATE) BETWEEN '" + fromDate + "' AND '" + toDate + "'\n";
            }
            if (searchDate.equalsIgnoreCase("R")) {
                query += " AND TRUNC(ADR.CRTD_DATE) BETWEEN '" + fromDate + "' AND '" + toDate + "'\n";
            }
        }
        query += generalJoin;

        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public List selectAdmittedPatientByReferingPhysican(String status, String referingPhysicanId) {
        String query = generalQuery
                + " WHERE ";
        if (!status.equalsIgnoreCase("")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (!referingPhysicanId.isEmpty()) {
            query += " AND ADR.REFERRING_PHYSICIAN_ID='" + referingPhysicanId + "'\n";
        }
        query += generalJoin;
        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public List selectAdmittedPatientByAttendingPhysican(String status, String attendingPhysicanId) {
        String query = generalQuery
                + " WHERE ";
        if (!status.equalsIgnoreCase("")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (!attendingPhysicanId.isEmpty()) {
            query += " AND ADR.PRIMARY_PHYSICIAN_ID='" + attendingPhysicanId + "'\n";
        }
        query += generalJoin;
        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public List selectAdmittedPatientByPatientName(String status, String patientName) {
        String query = generalQuery
                + " WHERE ";
        if (!status.equalsIgnoreCase("")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (!patientName.isEmpty()) {
            query += " AND UPPER(PAT.FULL_NAME) LIKE '%" + patientName.toUpperCase() + "%'\n";
        }
        query += generalJoin;
        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }
//    String status, String searchDate,
//            String fromDate, String toDate, String referingPhysicanId,
//            String attendingPhysicanId, String patientId, String patientStatus,
//            String patientName

    public List selectAdmittedPatientByreferingPhysican(String status, String referingPhysicanId) {
        String query = generalQuery
                + " WHERE ";
        if (!status.equalsIgnoreCase("")) {
            query += "  ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (!referingPhysicanId.isEmpty()) {
            query += " AND ADR.REFERRING_PHYSICIAN_ID='" + referingPhysicanId + "'\n";
        }
        query += generalJoin;
        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public List selectAdmissionRequest(String status, String searchDate,
            String fromDate, String toDate, String referingPhysicanId,
            String attendingPhysicanId, String patientId, String patientName) {
        String query = generalQuery
                + " WHERE 1=1";
        if (!status.equalsIgnoreCase("ALL")) {
            query += "  AND ADR.ORDER_STATUS_ID = '" + status + "' \n";
        }
        if (!patientId.isEmpty()) {
            query += " AND ADR.PATIENT_ID='" + patientId + "'\n";
        }
        if (fromDate.length() != 0 && toDate.length() != 0) {
            if (searchDate.equalsIgnoreCase("P")) {
                query += " AND TRUNC(ADR.PROPOSED_DATE) BETWEEN '" + fromDate + "' AND '" + toDate + "'\n";
            }
            if (searchDate.equalsIgnoreCase("R")) {
                query += " AND TRUNC(ADR.CRTD_DATE) BETWEEN '" + fromDate + "' AND '" + toDate + "'\n";
            }
        }
        if (!referingPhysicanId.isEmpty()) {
            query += " AND ADR.REFERRING_PHYSICIAN_ID='" + referingPhysicanId + "'\n";
        }
        if (!attendingPhysicanId.isEmpty()) {
            query += " AND ADR.PRIMARY_PHYSICIAN_ID='" + attendingPhysicanId + "'\n";
        }
        if (!patientName.isEmpty()) {
            query += " AND UPPER(PAT.FULL_NAME) LIKE '%" + patientName.toUpperCase() + "%'\n";
        }
        query += generalJoin;
        return setadmissionInfo(Constants.dao.selectData(query, patientAdmissioncolums));
    }

    public boolean deletePatientAdmission(String admissionNo) {
        String query
                = " DELETE FROM " + Database.DCMS.patientAdmission + "\n"
                + " WHERE ID = '" + admissionNo + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean isPatientDischargeRequest(String patientId) {

        String colums[] = {"-", "ID"};

        String query = " SELECT ID FROM " + Database.DCMS.patientAdmission
                + " WHERE PATIENT_ID = '" + patientId + "' \n"
                + " AND ORDER_STATUS_ID = '" + Status.dischargeRequest + "' \n";
        return Constants.dao.selectDatainList(query, colums).isEmpty();

    }

    public String selectPatientAdmissionNo(String patientId) {
        String colums[] = {"-", "ID"};

        String query = " SELECT ID FROM " + Database.DCMS.patientAdmission
                + " WHERE PATIENT_ID = '" + patientId + "' \n";
        List list = Constants.dao.selectDatainList(query, colums);
        String admissionNo = "0";
        if (!list.isEmpty()) {
            admissionNo = (((HashMap) list.get(0)).get("ID")).toString();
        }
        return admissionNo;
    }

    public List selectBedWard(String admissionId) {

        String colums[] = {"-", "BED_ID", "WARD_ID", "WARD_DESCRIPTION",
            "BED_DESCRIPTION", "REFERRING_PHYSICIAN_ID", "REFERRING_PHYSICIAN_NAME",
            "ADMISSION_TYPE_ID", "ADMISSION_TYPE_DESCRIPTION"};

        String query = " SELECT  ADR.BED_ID     BED_ID,                     \n"
                + " ADR.WARD_ID                 WARD_ID,                    \n"
                + " WRD.DESCRIPTION             WARD_DESCRIPTION,           \n"
                + " BED.DESCRIPTION             BED_DESCRIPTION,            \n"
                + " ADR.REFERRING_PHYSICIAN_ID  REFERRING_PHYSICIAN_ID,     \n"
                + " DOC.DOCTOR_NAME             REFERRING_PHYSICIAN_NAME,   \n"
                + " ADR.ADMISSION_TYPE_ID       ADMISSION_TYPE_ID,          \n"
                + " DTD.DESCRIPTION             ADMISSION_TYPE_DESCRIPTION  \n"
                + " FROM                                                \n"
                + Database.DCMS.patientAdmission + "           ADR,     \n"
                + Database.DCMS.ward + "                       WRD,     \n"
                + Database.DCMS.doctor + "                     DOC,     \n"
                + Database.DCMS.definitionTypeDetail + "       DTD,     \n"
                + Database.DCMS.bed + "                        BED      \n"
                + " WHERE ADR.ID = '" + admissionId + "'                \n"
                + "  AND ADR.REFERRING_PHYSICIAN_ID = DOC.DOCTOR_ID     \n"
                + "  AND  ADR.BED_ID = BED.ID                           \n"
                + "  AND ADR.WARD_ID = WRD.ID                           \n"
                + "  AND ADR.ADMISSION_TYPE_ID = DTD.ID";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<BO.Hospital.PatientAdmission> vecRequest = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            HashMap map = lis.get(i);
            BO.Hospital.PatientAdmission adreq = new BO.Hospital.PatientAdmission();
            adreq.setBedNo(map.get("BED_ID").toString());
            adreq.setWardNo(map.get("WARD_ID").toString());
            adreq.setWardDescription(map.get("WARD_DESCRIPTION").toString());
            adreq.setBedDescription(map.get("BED_DESCRIPTION").toString());
            adreq.setReferringPhysicianId(map.get("REFERRING_PHYSICIAN_ID").toString());
            adreq.setReferringPhysicianName(map.get("REFERRING_PHYSICIAN_NAME").toString());
            adreq.setAdmissionTypeId(map.get("ADMISSION_TYPE_ID").toString());
            adreq.setAdmissionTypeDescription(map.get("ADMISSION_TYPE_DESCRIPTION").toString());

            vecRequest.add(adreq);
        }
        return vecRequest;
    }

    public boolean insertAdmissionUpdateHistory(PatientAdmission adr) {
        String[] columns = {Database.DCMS.admissionUpdateHistory,
            "ORDER_STATUS_ID", "REFERRING_PHYSICIAN_ID", "PRIMARY_PHYSICIAN_ID",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "ID", "WARD_ID", "BED_ID",
            "ADMISSION_TYPE_ID", "ADMISSION_REMARKS", "ADMISSION_DIAGNOSIS",
            "DIAGNOSIS_REMARKS", "PHARMACY_CREDIT", "DIAGNOSTIC_CREDIT",
            "PHARMACY_SERVICE"};

        if (adr.getOrderStatusId().equalsIgnoreCase(Status.admissionRequest)) {
            return true;
        }
        HashMap adreq = new HashMap();
        adreq.put("ID", "'" + adr.getAdmissionNo() + "'");
        adreq.put("WARD_ID", "'" + adr.getWardNo() + "'");
        adreq.put("BED_ID", "'" + adr.getBedNo() + "'");
        adreq.put("ADMISSION_TYPE_ID", "'" + adr.getAdmissionTypeId() + "'");
        adreq.put("ADMISSION_REMARKS", "'" + adr.getAdmissionRemarks().replaceAll("'", "''") + "'");
        adreq.put("ORDER_STATUS_ID", "'" + adr.getOrderStatusId() + "'");
        adreq.put("REFERRING_PHYSICIAN_ID", "'" + adr.getReferringPhysicianId() + "'");
        adreq.put("PRIMARY_PHYSICIAN_ID", "'" + adr.getPrimaryPhysicianId() + "'");
        adreq.put("ADMISSION_DIAGNOSIS", "'" + adr.getAdmissionDiagnosis().replaceAll("'", "''") + "'");
        adreq.put("DIAGNOSIS_REMARKS", "'" + adr.getDiagnosisRemarks().replaceAll("'", "''") + "'");
        adreq.put("PHARMACY_CREDIT", "'" + adr.getPharmacyCredit() + "'");
        adreq.put("DIAGNOSTIC_CREDIT", "'" + adr.getDiagnosticCredit() + "'");
        adreq.put("PHARMACY_SERVICE", "'" + adr.getPharmacyService() + "'");
        adreq.put("CRTD_DATE", "" + Constants.today + "");
        adreq.put("CRTD_BY", "'" + Constants.userId + "'");
        adreq.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List listMember = new ArrayList();
        listMember.add(adreq);
        return Constants.dao.insertData(listMember, columns);
    }

    public boolean insertInPatientStatusHistory(PatientAdmission status) {

        String[] columns = {Database.DCMS.inpatientStatusHistory, "ORDER_STATUS_ID",
            "REFERRING_PHYSICIAN_ID", "PRIMARY_PHYSICIAN_ID", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID", "ID",
            "WARD_ID", "BED_ID",
            "ADMISSION_TYPE_ID", "ADMISSION_REMARKS", "ADMISSION_DIAGNOSIS", "DIAGNOSIS_REMARKS"};
        status.setPatientId(key.generatePrimaryKey(Keys.inpatientStatusHistory, false));
        HashMap patNote = new HashMap();
        patNote.put("ID", "'" + status.getAdmissionNo() + "'");
        patNote.put("ORDER_STATUS_ID", "'" + status.getOrderStatusId() + "'");
        patNote.put("REFERRING_PHYSICIAN_ID", "'" + status.getReferringPhysicianId() + "'");
        patNote.put("PRIMARY_PHYSICIAN_ID", "'" + status.getPrimaryPhysicianId() + "'");
        patNote.put("WARD_ID", "'" + status.getWardNo() + "'");
        patNote.put("BED_ID", "'" + status.getBedNo() + "'");
        patNote.put("ADMISSION_TYPE_ID", "'" + status.getAdmissionTypeId() + "'");
        patNote.put("ADMISSION_REMARKS", "'" + status.getAdmissionRemarks() + "'");
        patNote.put("ADMISSION_DIAGNOSIS", "'" + status.getAdmissionDiagnosis() + "'");
        patNote.put("DIAGNOSIS_REMARKS", "'" + status.getDiagnosisRemarks() + "'");
        patNote.put("CRTD_DATE", "" + Constants.today + "");
        patNote.put("CRTD_BY", "'" + Constants.userId + "'");
        patNote.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List listMember = new ArrayList();
        listMember.add(patNote);
        return Constants.dao.insertData(listMember, columns);
    }

    public String selectWardCPTID(String wardId) {
        String colums[] = {"-", "ID"};

        String query = " SELECT VISIT_CPT_ID ID FROM " + Database.DCMS.ward
                + " WHERE ID = '" + wardId + "' \n";
        List list = Constants.dao.selectDatainList(query, colums);
        String cptId = "0";
        if (!list.isEmpty()) {
            cptId = (((HashMap) list.get(0)).get("ID")).toString();
        }
        return cptId;
    }

    public boolean insertPatientDischarge(String admissionNo) {

        String[] columns = {Database.DCMS.patientDischarge, "ADMISSION_NO"};
        HashMap map = new HashMap();
        map.put("ADMISSION_NO", "'" + admissionNo + "'");
        List vec = new ArrayList();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);
    }

    public boolean insertAdmitPatientInvoices(OrderData data) {

        String[] columns = {Database.DCMS.inpatientInvoices, "PATIENT_ID",
            "ADMISSION_NO", "INVOICE_NO", "TOTAL_AMOUNT", "CRTD_BY",
            "CRTD_TERMINAL_ID", "CLIENT_ID", "LOCATION_ID"};

        HashMap map = new HashMap();
        map.put("PATIENT_ID", "'" + data.getPatientId() + "'");
        map.put("ADMISSION_NO", "'" + data.getAdmissionNumber() + "'");
        map.put("CLIENT_ID", "'" + data.getClientId() + "'");
        map.put("INVOICE_NO", "'" + data.getInvoiceNo() + "'");
        map.put("TOTAL_AMOUNT", "'" + data.getTotalAmount() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("LOCATION_ID", "'" + Constants.locationId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    

    public List<String> selectUserAttachedStores(HashMap hash, String userId) {

        String[] columns = {"-", "ID", "STORE"};

        String query = " SELECT UAR.USER_ACCESS_RIGHT_ID ID,    \n"
                + " STR.DESCRIPTION STORE FROM                  \n"
                + Database.DCMS.userAccessRights + " UAR,       \n"
                + Database.DCMS.store + " STR     \n"
                + " WHERE UAR.ACTION_ID = " + Actions.userAttachedStoreWiseId + " \n"
                + " AND UAR.USER_ID = '" + userId + "'      \n"
                + " AND UAR.USER_ACCESS_RIGHT_ID = STR.ID   \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<String> listStore = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            listStore.add((map.get("STORE").toString()));
            hash.put(map.get("STORE").toString(),
                    map.get("ID").toString());
        }
        return listStore;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;

import BO.Hospital.PatientAdmission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.SelectionQuery;
import utilities.Status;

/**
 *
 * @author ATHAR
 */
public class InpatientBillHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public List<PatientAdmission> selectAdmittedPatient(String status,
            String patientId, String primaryPhysicianId, String wardId) {

        String colums[] = {"-", "ID", "PATIENT_ID", "FULL_NAME", "AGE",
            "PRIMARY_PHYSICIAN_ID", "PROPOSED_DATE", "REFERRING_PHYSICIAN_ID",
            "GENDER_DESCRIPTION", "ADMITTED_DATE", "DESCRIPTION_STATUS",
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "IS_SAVED", "ORDER_STATUS_ID",
            "PRIMARY_PHYSICIAN_NAME", "CLIENT_ID", "REFERRING_PHYSICIAN_NAME",
            "WARD_NAME", "WARD_ID", "BED_ID", "BED_NAME", "VISIT_CPT_ID",
            "ATTENDING_PHYSICIAN_ID", "ATTENDING_PHYSICIAN_NAME", "PATIENT_STATUS_ID",
            "CLIENT_NAME", "TRANSACTION_TYPE", "DISCHARGE_CERTIFICATE", "DISCHARGE_TYPE_ID"};

        String query = " SELECT  ADR.ID, PAT.PATIENT_STATUS_ID,             \n"
                + " ADR.PATIENT_ID                 PATIENT_ID,              \n"
                + " PAT.FULL_NAME                  FULL_NAME,               \n"
                + " ADR.IS_SAVED                   IS_SAVED,                \n"
                + " ADR.DISCHARGE_TYPE_ID          DISCHARGE_TYPE_ID,       \n"
                + " ADR.PRIMARY_PHYSICIAN_ID       PRIMARY_PHYSICIAN_ID,    \n"
                + " ADR.REFERRING_PHYSICIAN_ID     REFERRING_PHYSICIAN_ID,  \n"
                + " ADR.WARD_ID                    WARD_ID,                 \n"
                + " ADR.DISCHARGE_CERTIFICATE      DISCHARGE_CERTIFICATE,   \n"
                + " WRD.DESCRIPTION                WARD_NAME,               \n"
                + " WRD.VISIT_CPT_ID               VISIT_CPT_ID,            \n"
                + " ADR.ATTENDING_PHYSICIAN_ID ATTENDING_PHYSICIAN_ID,      \n"
                + " USAT.NAME                   ATTENDING_PHYSICIAN_NAME,   \n"
                + " ADR.BED_ID                     BED_ID,                  \n"
                + " BED.DESCRIPTION                BED_NAME,                \n"
                + " CLT.DESCRIPTION                CLIENT_NAME,             \n"
                + " CLT.TRANSACTION_TYPE           TRANSACTION_TYPE,        \n"
                + " DTD.DESCRIPTION                DESCRIPTION_STATUS,      \n"
                + " GEN.DESCRIPTION                GENDER_DESCRIPTION,      \n"
                + " PAT.AGE                        AGE,                     \n"
                + " ADR.COMPLETE_ORDER_NO          COMPLETE_ORDER_NO,       \n"
                + " ADR.ORDER_DETAIL_ID            ORDER_DETAIL_ID,         \n"
                + " ADR.ORDER_STATUS_ID            ORDER_STATUS_ID,         \n"
                + " USRP.NAME                      PRIMARY_PHYSICIAN_NAME,  \n"
                + " USRR.DOCTOR_NAME               REFERRING_PHYSICIAN_NAME,\n"
                + " PAT.CLIENT_ID                  CLIENT_ID,               \n"
                + " TO_CHAR(ADR.PROPOSED_DATE, 'DD-MON-YY')  PROPOSED_DATE, \n"
                + " NVL(TO_CHAR(ADR.ADMITTED_DATE, 'DD-MON-YY HH12:MI:AM'),' ')ADMITTED_DATE \n"
                + " FROM                                              \n"
                + Database.DCMS.patientAdmission + "        ADR,      \n"
                + Database.DCMS.gender + "                  GEN,      \n"
                + Database.DCMS.patient + "                 PAT,      \n"
                + Database.DCMS.definitionTypeDetail + "    DTD,      \n"
                + Database.DCMS.client + "                   CLT,     \n"
                + Database.DCMS.users + "                   USRP,     \n"
                + Database.DCMS.ward + "                    WRD,      \n"
                + Database.DCMS.bed + "                     BED,      \n"
                + Database.DCMS.doctor + "                  USRR,     \n"
                + Database.DCMS.users + "                   USAT      \n"
                + " WHERE ADR.ORDER_STATUS_ID IN (" + status + ")     \n"
                + " AND ADR.LOCATION_ID IN  (" + SelectionQuery.selectUserWiseLocation()
                + ") \n";

        if (!patientId.isEmpty()) {
            query += " AND ADR.PATIENT_ID = '" + patientId + "'        \n";
        }
        if (!primaryPhysicianId.isEmpty()) {
            query += "  AND ADR.PRIMARY_PHYSICIAN_ID ='" + primaryPhysicianId + "' \n";
        }
        if (!wardId.isEmpty()) {
            query += " AND ADR.WARD_ID = '" + wardId + "'               \n";
        }
         if (!status.isEmpty()) {
            query += " AND ADR.ORDER_STATUS_ID IN (" + status + ")               \n";
        }

        query += " AND ADR.PATIENT_ID = PAT.PATIENT_ID                 \n"
                + " AND PAT.CLIENT_ID = CLT.ID                          \n"
                + " AND ADR.PRIMARY_PHYSICIAN_ID = USRP.USER_NAME       \n"
                + " AND ADR.REFERRING_PHYSICIAN_ID = USRR.DOCTOR_ID     \n"
                + " AND ADR.ATTENDING_PHYSICIAN_ID =USAT.USER_NAME      \n"
                + " AND ADR.BED_ID = BED.ID                             \n"
                + " AND ADR.WARD_ID = WRD.ID                            \n"
                + " AND PAT.GENDER_ID = GEN.ID                          \n"
                + " AND ADR.ORDER_STATUS_ID = DTD.ID                    \n"
                + " ORDER BY ADR.ID DESC";

        return setAdmissionList(Constants.dao.selectDatainList(query, colums));

    }

    public List<PatientAdmission> selectPatientAdmissionHistory(String patientId) {

        String colums[] = {"-", "ID", "PATIENT_ID", "FULL_NAME", "PRIMARY_PHYSICIAN_ID",
            "REFERRING_PHYSICIAN_ID", "AGE", "GENDER_DESCRIPTION", "ADMITTED_BY",
            "ADMITTED_DATE", "DESCRIPTION_STATUS", "COMPLETE_ORDER_NO", "CLIENT_ID",
            "ORDER_DETAIL_ID", "DISCHARGE_DATE", "PRIMARY_PHYSICIAN_NAME", "PATIENT_STATUS_ID",
            "REFERRING_PHYSICIAN_NAME", "DISCHARGE_BY", "ORDER_STATUS_ID", "DISCHARGE_TYPE_ID",
            "WARD_NAME", "WARD_ID", "BED_ID", "BED_NAME", "VISIT_CPT_ID", "ATTENDING_PHYSICIAN_ID",
            "ATTENDING_PHYSICIAN_NAME", "CLIENT_NAME", "TRANSACTION_TYPE"};

        String query = " SELECT  ADR.ID, PAT.PATIENT_STATUS_ID,             \n"
                + " ADR.PATIENT_ID                 PATIENT_ID,              \n"
                + " PAT.FULL_NAME                  FULL_NAME,               \n"
                + " TO_CHAR(ADR.DISCHARGE_DATE, 'DD-MON-YY HH12:MI:SS AM')DISCHARGE_DATE, \n"
                + " ADR.PRIMARY_PHYSICIAN_ID PRIMARY_PHYSICIAN_ID,          \n"
                + " ADR.ORDER_STATUS_ID            ORDER_STATUS_ID,         \n"
                + " ADR.WARD_ID                    WARD_ID,                 \n"
                + " ADR.DISCHARGE_TYPE_ID          DISCHARGE_TYPE_ID,       \n"
                + " ADR.ATTENDING_PHYSICIAN_ID ATTENDING_PHYSICIAN_ID,      \n"
                + " USAT.NAME                   ATTENDING_PHYSICIAN_NAME,   \n"
                + " WRD.DESCRIPTION                WARD_NAME,               \n"
                + " ADR.BED_ID                     BED_ID,                  \n"
                + " WRD.VISIT_CPT_ID               VISIT_CPT_ID,            \n"
                + " BED.DESCRIPTION                BED_NAME,                \n"
                + " CLT.DESCRIPTION                CLIENT_NAME,             \n"
                + " CLT.TRANSACTION_TYPE           TRANSACTION_TYPE,        \n"
                + " DTD.DESCRIPTION                DESCRIPTION_STATUS,      \n"
                + " ADR.REFERRING_PHYSICIAN_ID     REFERRING_PHYSICIAN_ID,  \n"
                + " GEN.DESCRIPTION                GENDER_DESCRIPTION,      \n"
                + " PAT.AGE                        AGE,                     \n"
                + " ADR.COMPLETE_ORDER_NO          COMPLETE_ORDER_NO,       \n"
                + " ADR.DISCHARGE_BY               DISCHARGE_BY,            \n"
                + " ADR.ADMITTED_BY                ADMITTED_BY,             \n"
                + " ADR.ORDER_DETAIL_ID            ORDER_DETAIL_ID,         \n"
                + " USRP.NAME                      PRIMARY_PHYSICIAN_NAME,  \n"
                + " USRR.DOCTOR_NAME               REFERRING_PHYSICIAN_NAME,\n"
                + " PAT.CLIENT_ID                  CLIENT_ID,               \n"
                + " TO_CHAR(ADR.ADMITTED_DATE, 'DD-MON-YY')ADMITTED_DATE    \n"
                + " FROM                                                \n"
                + Database.DCMS.patientAdmissionHistory + " ADR,        \n"
                + Database.DCMS.gender + "                  GEN,        \n"
                + Database.DCMS.patient + "                 PAT,        \n"
                + Database.DCMS.client + "                 CLT,         \n"
                + Database.DCMS.definitionTypeDetail + "    DTD,        \n"
                + Database.DCMS.users + "                   USRP,       \n"
                + Database.DCMS.ward + "                    WRD,        \n"
                + Database.DCMS.bed + "                     BED,        \n"
                + Database.DCMS.doctor + "                  USRR,       \n"
                + Database.DCMS.users + "                   USAT        \n"
                + " WHERE ADR.PATIENT_ID = '" + patientId + "'          \n"
                + " AND PAT.CLIENT_ID = CLT.ID                          \n"
                + " AND ADR.ORDER_STATUS_ID = " + Status.discharged + "  \n"
                + " AND ADR.PATIENT_ID = PAT.PATIENT_ID                 \n"
                + " AND ADR.PRIMARY_PHYSICIAN_ID = USRP.USER_NAME       \n"
                + " AND ADR.REFERRING_PHYSICIAN_ID = USRR.DOCTOR_ID     \n"
                + " AND ADR.ATTENDING_PHYSICIAN_ID =USAT.USER_NAME      \n"
                + " AND ADR.BED_ID = BED.ID                             \n"
                + " AND ADR.WARD_ID = WRD.ID                            \n"
                + " AND PAT.GENDER_ID = GEN.ID                          \n"
                + " AND ADR.ORDER_STATUS_ID = DTD.ID                    \n"
                + " ORDER BY ADR.ID DESC";

        return setAdmissionList(Constants.dao.selectDatainList(query, colums));

    }

    private List setAdmissionList(List<HashMap> listData) {

        List<PatientAdmission> vecRequest = new ArrayList<>();
        for (int i = 0; i < listData.size(); i++) {
            HashMap map = listData.get(i);
            PatientAdmission adreq = new PatientAdmission();
            adreq.setAdmissionNo(map.get("ID").toString());
            adreq.setPatientId(map.get("PATIENT_ID").toString());
            adreq.setFullName(map.get("FULL_NAME").toString());
            adreq.setPatientStatusId(map.get("PATIENT_STATUS_ID").toString());
            adreq.setDischargeDate((String) map.get("DISCHARGE_DATE"));
            adreq.setAttendingPhysicianId(map.get("ATTENDING_PHYSICIAN_ID").toString());
            adreq.setAttendingPhysicianName(map.get("ATTENDING_PHYSICIAN_NAME").toString());
            adreq.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            adreq.setDischargeTypeId((String) map.get("DISCHARGE_TYPE_ID"));
            adreq.setPrimaryPhysicianName(map.get("PRIMARY_PHYSICIAN_NAME").toString());
            adreq.setAdmissionProposedDate((String) map.get("PROPOSED_DATE"));
            adreq.setAdmittedDate(map.get("ADMITTED_DATE").toString());
            adreq.setReferringPhysicianId(map.get("REFERRING_PHYSICIAN_ID").toString());
            adreq.setReferringPhysicianName(map.get("REFERRING_PHYSICIAN_NAME").toString());
            adreq.setWardNo(map.get("WARD_ID").toString());
            adreq.setWardDescription(map.get("WARD_NAME").toString());
            adreq.setVisitCPTId(map.get("VISIT_CPT_ID").toString());
            adreq.setClientTransactionType((String) map.get("TRANSACTION_TYPE"));
            adreq.setClientName((String) map.get("CLIENT_NAME"));
            adreq.setBedNo(map.get("BED_ID").toString());
            adreq.setBedDescription(map.get("BED_NAME").toString());
            adreq.setAge(map.get("AGE").toString());
            adreq.setGenderDescription(map.get("GENDER_DESCRIPTION").toString());
            adreq.setOrderStatusDescription(map.get("DESCRIPTION_STATUS").toString());
            adreq.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            adreq.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            adreq.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
            adreq.setIsSaved((String) map.get("IS_SAVED"));
            adreq.setDischargeBy((String) map.get("DISCHARGE_BY"));
            adreq.setAdmittedBy((String) map.get("ADMITTED_BY"));
            adreq.setDischargeCertificate((String) map.get("DISCHARGE_CERTIFICATE"));

            adreq.setClientId(map.get("CLIENT_ID").toString());
            vecRequest.add(adreq);
        }
        return vecRequest;
    }

    public List<PatientAdmission> selectOrderAdmittedPatient(
            String patientId, String admissionNo,
            String wardId, String orderBy, String storeId) {

        String colums[] = {"-", "PATIENT_ID", "FULL_NAME", "AGE", "COMPLETE_ORDER_NO",
            "GENDER_DESCRIPTION", "ORDER_BY", "ORDER_DATE", "ADMISSION_NO",
            "WARD_DESCRIPTION", "BED_DESCRIPTION", "CUSTOMER_ID", "ADMISSION_STATUS"
        };
        String query = " SELECT  OM.PATIENT_ID     PATIENT_ID,              \n"
                + " PAT.FULL_NAME                  FULL_NAME,               \n"
                + " GEN.DESCRIPTION                GENDER_DESCRIPTION,      \n"
                + " PAT.AGE                        AGE,                     \n"
                + " USR.NAME                       ORDER_BY,                \n"
                + " ADR.ORDER_STATUS_ID            ADMISSION_STATUS,        \n"
                + " OM.COMPLETE_ORDER_NO           COMPLETE_ORDER_NO,       \n"
                + " WRD.DESCRIPTION                WARD_DESCRIPTION,        \n"
                + " BED.DESCRIPTION                BED_DESCRIPTION,         \n"
                + " TO_CHAR(OM.ORDER_DATE,'DD-MON-YY HH12:MI AM')ORDER_DATE,\n"
                + " OM.ADMISSION_NO               ADMISSION_NO             ,\n"
                + " OM.CUSTOMER_ID                CUSTOMER_ID               \n"
                + " FROM                                              \n"
                + Database.DCMS.patientAdmission + "        ADR,      \n"
                + Database.DCMS.gender + "                  GEN,      \n"
                + Database.DCMS.patient + "                 PAT,      \n"
                + Database.DCMS.users + "                   USR,      \n"
                + Database.DCMS.orderMaster + "               OM,     \n"
                + Database.DCMS.ward + "               WRD,           \n"
                + Database.DCMS.bed + "               BED             \n"
                + " WHERE OM.COMPLETE_ORDER_NO IN (\n"
                + " SELECT ODM.COMPLETE_ORDER_NO FROM \n"
                + Database.DCMS.medicineOrderDetail + "         ODM,     \n"
                + Database.DCMS.patientAdmission + "            PAD      \n"
                + " WHERE ODM.PATIENT_ID = PAD.PATIENT_ID                \n"
                + " AND ODM.STORE_ID = " + storeId + "                    \n"
                + " AND PAD.ORDER_STATUS_ID = '" + Status.admitted + "'  \n"
                + " AND ODM.ORDER_STATUS_ID= '" + Status.ordered + "'    \n"
                + " )"
                + " AND  OM.ORDER_TYPE_ID = '" + Constants.itemOrder + "' \n"
                + " AND ADR.PATIENT_ID = PAT.PATIENT_ID                   \n"
                + " AND PAT.GENDER_ID = GEN.ID                            \n"
                + " AND OM.PATIENT_ID = ADR.PATIENT_ID                    \n"
                + " AND ADR.ID =   OM.ADMISSION_NO                        \n"
                + " AND ADR.WARD_ID = WRD.ID                              \n"
                + " AND USR.USER_NAME = OM.ORDER_BY                       \n"
                + " AND ADR.BED_ID = BED.ID                               \n";
        if (!patientId.isEmpty()) {
            query += " AND ADR.PATIENT_ID = '" + patientId + "'               \n"
                    + "AND ADR.ID = '" + admissionNo + "'           \n";
        }
        if (!orderBy.isEmpty()) {
            query += " AND OM.ORDER_BY = '" + orderBy + "'               \n";
        }
        if (!wardId.isEmpty()) {
            query += " AND ADR.WARD_ID = '" + wardId + "'               \n";
        }
        query += " ORDER BY OM.ORDER_DATE DESC";

        List<HashMap> listData = Constants.dao.selectDatainList(query, colums);
        List<PatientAdmission> vecRequest = new ArrayList<>();
        for (int i = 0; i < listData.size(); i++) {
            HashMap map = listData.get(i);
            PatientAdmission adreq = new PatientAdmission();
            adreq.setAdmissionNo(map.get("ADMISSION_NO").toString());
            adreq.setPatientId(map.get("PATIENT_ID").toString());
            adreq.setFullName(map.get("FULL_NAME").toString());
            adreq.setAge(map.get("AGE").toString());
            adreq.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            adreq.setOrderStatusId(map.get("ADMISSION_STATUS").toString());
            adreq.setGenderDescription(map.get("GENDER_DESCRIPTION").toString());
            adreq.setOrderBy(map.get("ORDER_BY").toString());
            adreq.setOrderDate(map.get("ORDER_DATE").toString());
            adreq.setWardDescription(map.get("WARD_DESCRIPTION").toString());
            adreq.setBedDescription(map.get("BED_DESCRIPTION").toString());
            adreq.setCustomerId(map.get("CUSTOMER_ID").toString());
            vecRequest.add(adreq);
        }
        return vecRequest;
    }

    public boolean insertDeathCertificate(PatientAdmission selectedPatient) {

        String[] cols = {Database.DCMS.deathCertificate, "PATIENT_ID", "ADMISSION_NO",
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};
        HashMap mapAmountLimit = new HashMap();
        mapAmountLimit.put("PATIENT_ID", "'" + selectedPatient.getPatientId() + "'");
        mapAmountLimit.put("ADMISSION_NO", "'" + selectedPatient.getAdmissionNo() + "'");
        mapAmountLimit.put("COMPLETE_ORDER_NO", "'" + selectedPatient.getCompleteOrderNo() + "'");
        mapAmountLimit.put("ORDER_DETAIL_ID", "'" + selectedPatient.getOrderDetailId() + "'");
        mapAmountLimit.put("CRTD_BY", "'" + Constants.userId + "'");
        mapAmountLimit.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listItem = new ArrayList();
        listItem.add(mapAmountLimit);
        return Constants.dao.insertData(listItem, cols);
    }
}

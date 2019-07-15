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

public class PatientDischargeStatusHandler {

    public List<PatientAdmission> selectFinancialDischargePatient(String status,
            String patientId, String primaryPhysicianId, String wardId) {

        String colums[] = {"-", "ID", "PATIENT_ID", "FULL_NAME", "AGE",
            "PRIMARY_PHYSICIAN_ID", "PROPOSED_DATE", "REFERRING_PHYSICIAN_ID",
            "GENDER_DESCRIPTION", "ADMITTED_DATE", "ADMITTED_BY", "DESCRIPTION_STATUS",
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "IS_SAVED", "ORDER_STATUS_ID",
            "PRIMARY_PHYSICIAN_NAME", "CLIENT_ID", "REFERRING_PHYSICIAN_NAME",
            "WARD_NAME", "WARD_ID", "BED_ID", "BED_NAME", "ATTENDING_PHYSICIAN_ID",
            "ATTENDING_PHYSICIAN_NAME", "DISCHARGE_DATE", "DISCHARGE_BY",
            "DISCHARGE_TYPE", "DISPLAY_DISCHARGE_DATE", "DISCHARGE_TYPE_ID"};

        String query = " SELECT  ADR.ID,                                    \n"
                + " ADR.PATIENT_ID                 PATIENT_ID,              \n"
                + " PAT.FULL_NAME                  FULL_NAME,               \n"
                + " ADR.IS_SAVED                   IS_SAVED,                \n"
                + " ADR.PRIMARY_PHYSICIAN_ID       PRIMARY_PHYSICIAN_ID,    \n"
                + " ADR.REFERRING_PHYSICIAN_ID     REFERRING_PHYSICIAN_ID,  \n"
                + " ADR.DISCHARGE_TYPE_ID          DISCHARGE_TYPE_ID,       \n"
                + " ADR.WARD_ID                    WARD_ID,                 \n"
                + " WRD.DESCRIPTION                WARD_NAME,               \n"
                + " ADR.BED_ID                     BED_ID,                  \n"
                + " ADR.ATTENDING_PHYSICIAN_ID ATTENDING_PHYSICIAN_ID,      \n"
                + " USAT.NAME                   ATTENDING_PHYSICIAN_NAME,   \n"
                + " BED.DESCRIPTION                BED_NAME,                \n"
                + " DTD.DESCRIPTION                DESCRIPTION_STATUS,      \n"
                + " TYP.DESCRIPTION                DISCHARGE_TYPE,          \n"
                + " GEN.DESCRIPTION                GENDER_DESCRIPTION,      \n"
                + " PAT.AGE                        AGE,                     \n"
                + " ADR.COMPLETE_ORDER_NO          COMPLETE_ORDER_NO,       \n"
                + " ADR.ORDER_DETAIL_ID            ORDER_DETAIL_ID,         \n"
                + " ADR.ORDER_STATUS_ID            ORDER_STATUS_ID,         \n"
                + " USRP.NAME                      PRIMARY_PHYSICIAN_NAME,  \n"
                + " USRR.DOCTOR_NAME               REFERRING_PHYSICIAN_NAME,\n"
                + " PAT.CLIENT_ID                  CLIENT_ID,               \n"
                + " TO_CHAR(ADR.PROPOSED_DATE, 'DD-MON-YY')  PROPOSED_DATE, \n"
                + " ADR.ADMITTED_BY                ADMITTED_BY,             \n"
                + " ADR.DISCHARGE_BY               DISCHARGE_BY,             \n"
                + " TO_CHAR(ADR.DISCHARGE_DATE, 'DD-MON-YY') DISCHARGE_DATE,\n"
                + " TO_CHAR(ADR.DISPLAY_DISCHARGE_DATE, 'DD-MON-YY') DISPLAY_DISCHARGE_DATE,\n"
                + " NVL(TO_CHAR(ADR.ADMITTED_DATE, 'DD-MON-YY HH12:MI AM'),' ') ADMITTED_DATE \n"
                + " FROM                                              \n"
                + Database.DCMS.patientAdmissionHistory + "        ADR,      \n"
                + Database.DCMS.gender + "                  GEN,      \n"
                + Database.DCMS.patient + "                 PAT,      \n"
                + Database.DCMS.definitionTypeDetail + "    DTD,      \n"
                + Database.DCMS.definitionTypeDetail + "    TYP,      \n"
                + Database.DCMS.users + "                   USRP,     \n"
                + Database.DCMS.ward + "                    WRD,      \n"
                + Database.DCMS.bed + "                     BED,      \n"
                + Database.DCMS.doctor + "                  USRR,     \n"
                + Database.DCMS.users + "                   USAT      \n"
                + " WHERE ADR.ORDER_STATUS_ID IN (" + status + ")     \n";

        if (!patientId.isEmpty()) {
            query += " AND ADR.PATIENT_ID = '" + patientId + "'        \n";
        }
        if (!primaryPhysicianId.isEmpty()) {
            query += "  AND ADR.PRIMARY_PHYSICIAN_ID ='" + primaryPhysicianId + "' \n";
        }
        if (!wardId.isEmpty()) {
            query += " AND ADR.WARD_ID = '" + wardId + "'               \n";
        }

        query += " AND ADR.PATIENT_ID = PAT.PATIENT_ID                 \n"
                + " AND ADR.PRIMARY_PHYSICIAN_ID = USRP.USER_NAME       \n"
                + " AND ADR.ATTENDING_PHYSICIAN_ID =USAT.USER_NAME      \n"
                + " AND ADR.REFERRING_PHYSICIAN_ID = USRR.DOCTOR_ID     \n"
                + " AND ADR.BED_ID = BED.ID                             \n"
                + " AND ADR.WARD_ID = WRD.ID                            \n"
                + " AND ADR.DISCHARGE_TYPE_ID = TYP.ID                  \n"
                + " AND PAT.GENDER_ID = GEN.ID                          \n"
                + " AND ADR.ORDER_STATUS_ID = DTD.ID                    \n"
                + " ORDER BY ADR.ID DESC";
        //   System.err.println(""+query);
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
            adreq.setDischargeDate((String) map.get("DISCHARGE_DATE"));
            adreq.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            adreq.setPrimaryPhysicianName(map.get("PRIMARY_PHYSICIAN_NAME").toString());
            adreq.setAttendingPhysicianId(map.get("ATTENDING_PHYSICIAN_ID").toString());
            adreq.setDischargeTypeId((String) map.get("DISCHARGE_TYPE_ID"));
            adreq.setAttendingPhysicianName(map.get("ATTENDING_PHYSICIAN_NAME").toString());
            adreq.setAdmissionProposedDate((String) map.get("PROPOSED_DATE"));
            adreq.setAdmittedDate(map.get("ADMITTED_DATE").toString());
            adreq.setReferringPhysicianId(map.get("REFERRING_PHYSICIAN_ID").toString());
            adreq.setReferringPhysicianName(map.get("REFERRING_PHYSICIAN_NAME").toString());
            adreq.setWardNo(map.get("WARD_ID").toString());
            adreq.setWardDescription(map.get("WARD_NAME").toString());
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
            adreq.setDischargeDate((String) map.get("DISCHARGE_DATE"));
            adreq.setAdmittedBy((String) map.get("ADMITTED_BY"));

            adreq.setDisplayDischargeDate((String) map.get("DISPLAY_DISCHARGE_DATE"));
            adreq.setDischargeTypeDescription((String) map.get("DISCHARGE_TYPE"));
            adreq.setClientId(map.get("CLIENT_ID").toString());
            vecRequest.add(adreq);
        }
        return vecRequest;
    }
}

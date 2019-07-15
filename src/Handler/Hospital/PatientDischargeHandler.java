package Handler.Hospital;

import BO.Hospital.DischargePatient;
import BO.Hospital.DischargePatientDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;

public class PatientDischargeHandler {

    public DischargePatient searchPatientAdmitted(String admissionNo) {

        String[] columns = {"", "ADMISSION_NO", "BED_ID", "FIRST_NAME",
            "STATUS_DESCRIPTION", "ORDER_STATUS_ID", "DISCHARGE_TYPE_ID",
            "BED_DESCRIPTION", "DISCHARGE_TYPE", "SUMMARY",
            "INVESTIGATIONS", "ADVICE", "NEXT_VISIT", "DIAGNOSIS", "PATIENT_ID"};

        String query = "SELECT PD.ADMISSION_NO,P.FIRST_NAME ,\n"
                + " PA.PATIENT_ID PATIENT_ID, PA.BED_ID,DTD.DESCRIPTION \n"
                + " STATUS_DESCRIPTION, PA.ORDER_STATUS_ID, \n"
                + " PD.DISCHARGE_TYPE_ID DISCHARGE_TYPE_ID, \n"
                + " DT.DESCRIPTION DISCHARGE_TYPE, \n"
                + " NVL(PD.SUMMARY, ' ')SUMMARY, \n"
                + " NVL(PD.INVESTIGATIONS,' ')INVESTIGATIONS, \n"
                + " NVL(PD.ADVICE, ' ')ADVICE, \n"
                + " NVL(PD.NEXT_VISIT,' ')NEXT_VISIT, \n"
                + " NVL(PD.DIAGNOSIS,' ') DIAGNOSIS,\n"
                + " B.DESCRIPTION BED_DESCRIPTION  FROM         \n"
                + Database.DCMS.patientDischarge + " PD,        \n"
                + Database.DCMS.patientAdmission + " PA,        \n"
                + Database.DCMS.definitionTypeDetail + " DT,    \n"
                + Database.DCMS.patient + " P,                  \n"
                + Database.DCMS.bed + " B,                      \n"
                + Database.DCMS.definitionTypeDetail + " DTD    \n"
                + " WHERE PD.ADMISSION_NO='" + admissionNo + "' \n"
                + " AND PA.ID = PD.ADMISSION_NO                 \n"
                + " AND PA.PATIENT_ID = P.PATIENT_ID            \n"
                + " AND PA.ORDER_STATUS_ID = DTD.ID             \n"
                + " AND PD.DISCHARGE_TYPE_ID = DT.ID            \n"
                + " AND B.ID= PA.BED_ID                         \n";

        List <HashMap>vec = Constants.dao.selectData(query, columns);

        if (vec.isEmpty()) {
            return null;
        }
        DischargePatient patientDetail = new DischargePatient();
        HashMap map = vec.get(0);
        patientDetail.setAdmissionNo((String) map.get("ADMISSION_NO"));
        patientDetail.setFullName((String) map.get("FIRST_NAME"));
        patientDetail.setBedNo((String) map.get("BED_ID"));
        patientDetail.setOrderStatusDescription((String) map.get("STATUS_DESCRIPTION"));
        patientDetail.setOrderStatusId((String) map.get("ORDER_STATUS_ID"));
        patientDetail.setBedDescription((String) map.get("BED_DESCRIPTION"));
        patientDetail.setAdvice((String) map.get("ADVICE"));
        patientDetail.setDiagnosisName((String) map.get("DIAGNOSIS"));
        patientDetail.setDischargeType((String) map.get("DISCHARGE_TYPE"));
        patientDetail.setDischargeTypeId((String) map.get("DISCHARGE_TYPE_ID"));
        patientDetail.setSummary((String) map.get("SUMMARY"));
        patientDetail.setInvestigation((String) map.get("INVESTIGATIONS"));
        patientDetail.setNextVisit((String) map.get("NEXT_VISIT"));
        patientDetail.setPatientId((String) map.get("PATIENT_ID"));
        patientDetail.setAdmissionNo(admissionNo);
        return patientDetail;

    }

    public boolean updatePatientDischarge(DischargePatient patientDischarge) {
        String query
                = " UPDATE " + Database.DCMS.patientDischarge + "\n"
                + " SET DISCHARGE_TYPE_ID  = '" + patientDischarge.getDischargeTypeId().replaceAll("'", "''") + "', \n"
                + " SUMMARY = '" + patientDischarge.getSummary().replaceAll("'", "''") + "',\n"
                + " INVESTIGATIONS = '" + patientDischarge.getInvestigation().replaceAll("'", "''")+ "',\n"
                + " ADVICE = '" + patientDischarge.getAdvice().replaceAll("'", "''") + "',\n"
                + " NEXT_VISIT = '" + patientDischarge.getNextVisit().replaceAll("'", "''") + "',\n"
                + " DIAGNOSIS = '" + patientDischarge.getDiagnosisName().replaceAll("'", "''") + "',\n"
                + " DISCHARGE_BY = '" + Constants.userId + "', \n"
                + " DISCHARGE_DATE  = SYSDATE, \n"
                + " DISCHARGE_TERMINAL_ID = '" + Constants.terminalId + "'\n"
                + " WHERE ADMISSION_NO = '" + patientDischarge.getAdmissionNo() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean insertCptItemPatientDischarge(DischargePatientDetail patientDischargeDetail) {

        String[] columnsAppForm = {Database.DCMS.dischargeDetail,
            "ADMISSION_NO", "MED_CPT_ID", "MED_CPT_DESC", "TYPE", "REMARKS"};

        HashMap map = new HashMap();
        map.put("ADMISSION_NO", "'" + patientDischargeDetail.getAdmissionNo() + "'");
        map.put("MED_CPT_ID", "'" + patientDischargeDetail.getCptItemId() + "'");
        map.put("MED_CPT_DESC", "'" + patientDischargeDetail.getCptItemDescription() + "'");
        map.put("TYPE", "'" + patientDischargeDetail.getType() + "'");
        map.put("REMARKS", "'" + patientDischargeDetail.getRemarks() + "'");

        Vector vec = new Vector();
        vec.add(map);

        return Constants.dao.insertData(vec, columnsAppForm);

    }

    public List<DischargePatientDetail> searchDischargeCptItem(String admissionNo) {

        String[] columns = {"", "ADMISSION_NO", "MED_CPT_DESC", "TYPE", "REMARKS", "ROWID"};

        String query = "SELECT ADMISSION_NO,MED_CPT_DESC ,\n"
                + "TYPE,"
                + "NVL(REMARKS,'-') REMARKS,ROWID FROM \n"
                + Database.DCMS.dischargeDetail + "  \n"
                + "WHERE ADMISSION_NO='" + admissionNo + "'\n"
                + "AND TYPE='CPT'\n";

        List vec = Constants.dao.selectData(query, columns);

            List<DischargePatientDetail> dpd = new ArrayList<>();
            for (int i = 0; i < vec.size(); i++) {
                DischargePatientDetail patientDetail = new DischargePatientDetail();
                HashMap map = (HashMap) vec.get(i);
                patientDetail.setAdmissionNo((String) map.get("ADMISSION_NO"));
                patientDetail.setCptItemDescription((String) map.get("MED_CPT_DESC"));
                patientDetail.setType((String) map.get("TYPE"));
                patientDetail.setRemarks((String) map.get("REMARKS"));
                patientDetail.setRowIndex((String) map.get("ROWID"));
                dpd.add(patientDetail);
            }
            return dpd;
       
    }

    public List<DischargePatientDetail> searchDetailDischargeItem(String admissionNo) {

        String[] columns = {"", "ADMISSION_NO", "MED_CPT_DESC", "TYPE",
            "REMARKS", "ROWID"};

        String query = " SELECT ADMISSION_NO, MED_CPT_DESC, TYPE, ROWID, "
                + " NVL(REMARKS,' ') REMARKS FROM "
                + Database.DCMS.dischargeDetail + "  \n"
                + " WHERE ADMISSION_NO ='" + admissionNo + "' \n"
                + " AND TYPE='MED'  \n";

        List vec = Constants.dao.selectData(query, columns);
        List<DischargePatientDetail> dpd = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            DischargePatientDetail patientDetail = new DischargePatientDetail();
            HashMap map = (HashMap) vec.get(i);
            patientDetail.setAdmissionNo((String) map.get("ADMISSION_NO"));
            patientDetail.setCptItemDescription((String) map.get("MED_CPT_DESC"));
            patientDetail.setType((String) map.get("TYPE"));
            patientDetail.setRemarks((String) map.get("REMARKS"));
            patientDetail.setRowIndex((String) map.get("ROWID"));
            dpd.add(patientDetail);
        }
        return dpd;
    }

    public boolean deleteCptItemPatientDischarge(DischargePatientDetail patientDischargeDetail) {

        String query = "DELETE FROM "
                + Database.DCMS.dischargeDetail + " DD "
                + "WHERE DD.ADMISSION_NO='" + patientDischargeDetail.getAdmissionNo() + "' "
                + "AND DD.TYPE='" + patientDischargeDetail.getType() + "'"
                + "AND ROWID='" + patientDischargeDetail.getRowIndex() + "'";

        return Constants.dao.executeUpdate(query, false);

    }
}

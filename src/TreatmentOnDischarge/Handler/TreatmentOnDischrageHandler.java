/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentOnDischarge.Handler;

import TreatmentOnDischarge.BO.TreatmentOnDischarge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class TreatmentOnDischrageHandler {

    public List<TreatmentOnDischarge> selectTreatmentOnDischrage(String patientId,
            String admissionNumber) {

        String colums[] = {"-", "ADMISSION_NO", "PATIENT_ID", "HISTORY", "PAST_HISTORY",
            "DRUG_HX", "ALLERGIES", "ADDITIVES", "REMARKS", "ANALGESTICS",
            "ANTIBIOTICS", "ASTURE_REVENAL", "TOTAL_LEAVES", "FROM_DATE", "TO_DATE",
            "PROCEDURE_ID", "PROCEDURE_DESCRIPTION", "DIAGNOSIS_ID", "DIAGNOSIS_DESCRIPTION",
            "DATE_OF_SURGERY", "PRIMARY_PHYSICIAN_ID", "PRIMARY_PHYSICIAN_NAME",
            "FINDINGS", "POST_OF_COMPLICATION", "DRAINS", "BLOOD_LOSS", "SUTURS",
            "HP", "DAY_FROM_DATE", "DAY_TO_DATE", "DAY_DATE_OF_SURGERY",
            "CRTD_BY_NAME", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query = " SELECT TOD.ADMISSION_NO,                            \n"
                + " TOD.PATIENT_ID,                                          \n"
                + " NVL(TOD.HISTORY, ' ' ) HISTORY,                          \n"
                + " NVL(TOD.PAST_HISTORY, ' ' ) PAST_HISTORY,                \n"
                + " NVL(TOD.DRUG_HX ,' ' ) DRUG_HX,                          \n"
                + " NVL(TOD.ALLERGIES ,' ' ) ALLERGIES,                      \n"
                + " NVL(TOD.ADDITIVES, ' ' ) ADDITIVES,                      \n"
                + " NVL(TOD.REMARKS,' ' ) REMARKS,                           \n"
                + " NVL(TOD.ANALGESTICS,' ' ) ANALGESTICS,                   \n"
                + " NVL(TOD.ANTIBIOTICS,' ' ) ANTIBIOTICS,                   \n"
                + " NVL(TOD.ASTURE_REVENAL,' ' ) ASTURE_REVENAL,             \n"
                + " NVL(TOD.TOTAL_LEAVES, ' ' ) TOTAL_LEAVES,                \n"
                + " NVL(TO_CHAR(TOD.FROM_DATE, 'DD-MON-YY'), ' ') FROM_DATE, \n"
                + " NVL(ROUND(TOD.FROM_DATE - SYSDATE  )+1, 0)    DAY_FROM_DATE, \n"
                + " NVL(TO_CHAR(TOD.TO_DATE, 'DD-MON-YY'), ' ')  TO_DATE,   \n"
                + " NVL(ROUND(TOD.TO_DATE - SYSDATE  )+1, 0)      DAY_TO_DATE,   \n"
                + " NVL(TOD.PROCEDURE_ID, ' ') PROCEDURE_ID,                 \n"
                + " NVL(CPT.DESCRIPTION, ' ')  PROCEDURE_DESCRIPTION,        \n"
                + " NVL(TOD.DIAGNOSIS_ID, ' ') DIAGNOSIS_ID,                 \n"
                + " NVL(DIAG.DESCRIPTION, ' ') DIAGNOSIS_DESCRIPTION,        \n"
                + " NVL(TO_CHAR(TOD.DATE_OF_SURGERY, 'DD-MON-YY HH24:MI:SS'), ' ')"
                + " DATE_OF_SURGERY,                                            \n"
                + " NVL(ROUND(TOD.DATE_OF_SURGERY - SYSDATE  )+1, 0) DAY_DATE_OF_SURGERY,  \n"
                + " NVL(TOD.PRIMARY_PHYSICIAN_ID, ' ') PRIMARY_PHYSICIAN_ID, \n"
                + " NVL(PHY.NAME, ' ')             PRIMARY_PHYSICIAN_NAME,   \n"
                + " NVL(TOD.FINDINGS, ' ') FINDINGS,                         \n"
                + " NVL(TOD.POST_OF_COMPLICATION, ' ') POST_OF_COMPLICATION, \n"
                + " NVL(TOD.DRAINS, ' ') DRAINS,                             \n"
                + " NVL(TOD.BLOOD_LOSS, ' ') BLOOD_LOSS,                     \n"
                + " NVL(TOD.SUTURS, ' ') SUTURS,                             \n"
                + " NVL(TOD.HP, ' ')        HP,                              \n"
                + " NVL(USR.NAME, ' ')      CRTD_BY_NAME,                    \n"
                + " NVL(TOD.CRTD_BY, ' ') CRTD_BY,                           \n"
                + " NVL(TO_CHAR(TOD.CRTD_DATE, 'DD-MON-YY'), ' ') CRTD_DATE, \n"
                + " NVL(TOD.CRTD_TERMINAL_ID, ' ') CRTD_TERMINAL_ID FROM     \n"
                + Database.DCMS.treatmentOnDischarge + "  TOD,               \n"
                + Database.DCMS.CPT + " CPT,                                 \n"
                + Database.DCMS.users + " PHY,                               \n"
                + Database.DCMS.users + " USR,                               \n"
                + Database.DCMS.definitionTypeDetail + "DIAG                 \n"
                + " WHERE TOD.PATIENT_ID = '" + patientId + "'               \n"
                + " AND TOD.ADMISSION_NO = '" + admissionNumber + "'         \n"
                + " AND NVL(TOD.CRTD_BY, 'GENERAL') = NVL(USR.USER_NAME, 'GENERAL')  \n"
                + " AND NVL(TOD.PRIMARY_PHYSICIAN_ID, 'GENERAL') = NVL(PHY.USER_NAME, 'GENERAL')  \n"
                + " AND NVL(TOD.PROCEDURE_ID, 'GENERAL') = NVL(CPT.CPT_ID, 'GENERAL')             \n"
                + " AND NVL(TOD.DIAGNOSIS_ID, '-1') = NVL(DIAG.ID, '-1')    \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<TreatmentOnDischarge> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            TreatmentOnDischarge objParameter = new TreatmentOnDischarge();
            objParameter.setAdmissionNo(map.get("ADMISSION_NO").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setHistory(map.get("HISTORY").toString());
            objParameter.setPastHistory(map.get("PAST_HISTORY").toString());
            objParameter.setDrudHx(map.get("DRUG_HX").toString());
            objParameter.setAllergies(map.get("ALLERGIES").toString());
            objParameter.setAdditives(map.get("ADDITIVES").toString());
            objParameter.setRemarks(map.get("REMARKS").toString());
            objParameter.setAnalgestics(map.get("ANALGESTICS").toString());
            objParameter.setAntibiotics(map.get("ANTIBIOTICS").toString());
            objParameter.setAstureRevenal(map.get("ASTURE_REVENAL").toString());
            objParameter.setTotalLeaves(map.get("TOTAL_LEAVES").toString());
            objParameter.setFromDate(map.get("FROM_DATE").toString());
            objParameter.setToDate(map.get("TO_DATE").toString());
            objParameter.setDiagnosisId(map.get("DIAGNOSIS_ID").toString());
            objParameter.setDiagnosisDescription(map.get("DIAGNOSIS_DESCRIPTION").toString());
            objParameter.setProcedureId(map.get("PROCEDURE_ID").toString());
            objParameter.setProcedureDescription(map.get("PROCEDURE_DESCRIPTION").toString());
            objParameter.setDateOfSurgery(map.get("DATE_OF_SURGERY").toString());
            objParameter.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            objParameter.setPrimaryPhysicianName(map.get("PRIMARY_PHYSICIAN_NAME").toString());
            objParameter.setFindings(map.get("FINDINGS").toString());
            objParameter.setPostOfComplication(map.get("POST_OF_COMPLICATION").toString());
            objParameter.setDrains(map.get("DRAINS").toString());
            objParameter.setBloodLoss(map.get("BLOOD_LOSS").toString());
            objParameter.setSuturs(map.get("SUTURS").toString());
            objParameter.setHP(map.get("HP").toString());
            objParameter.setDayFromDate(map.get("DAY_FROM_DATE").toString());
            objParameter.setDayToDate(map.get("DAY_TO_DATE").toString());
            objParameter.setDayDateOfSurgery(map.get("DAY_DATE_OF_SURGERY").toString());
            objParameter.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            objParameter.setCrtdBy(map.get("CRTD_BY").toString());
            objParameter.setCrtdDate(map.get("CRTD_DATE").toString());
            objParameter.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }

    public List<TreatmentOnDischarge> selectTreatmentOnDischrageDetail(String patientId,
            String admissionNumber, String actionId) {

        String colums[] = {"-", "ADMISSION_NO", "PATIENT_ID", "DETAIL_ID", "DESCRIPTION",
            "ACTION_ID", "EVENT_ID", "CRTD_USER", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query = " SELECT TOD.ADMISSION_NO,                           \n"
                + "        TOD.PATIENT_ID,                                  \n"
                + "        TOD.DETAIL_ID,                                 \n"
                + "        DTD.DESCRIPTION,                                 \n"
                + "        TOD.ACTION_ID,                                 \n"
                + "        TOD.EVENT_ID,                                 \n"
                + "        USR.NAME     CRTD_USER,                       \n"
                + "        TOD.CRTD_BY,                                     \n"
                + " TO_CHAR(TOD.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,      \n"
                + " TOD.CRTD_TERMINAL_ID FROM                           \n"
                + Database.DCMS.treatmentOnDischargeDetail + "  TOD,              \n"
                + Database.DCMS.definitionTypeDetail + "  DTD,                            \n"
                + Database.DCMS.users + " USR                            \n"
                + " WHERE TOD.PATIENT_ID = '" + patientId + "'                \n"
                + " AND TOD.ADMISSION_NO = '" + admissionNumber + "'          \n"
                + " AND TOD.ACTION_ID = '" + actionId + "'          \n"
                + " AND TOD.DETAIL_ID = DTD.ID                       \n"
                + " AND TOD.CRTD_BY = USR.USER_NAME                         \n"
                + " ORDER BY DTD.DESCRIPTION";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<TreatmentOnDischarge> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            TreatmentOnDischarge objParameter = new TreatmentOnDischarge();
            objParameter.setAdmissionNo(map.get("ADMISSION_NO").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setDetailId(map.get("DETAIL_ID").toString());
            objParameter.setDetailDescription(map.get("DESCRIPTION").toString());
            objParameter.setActionId(map.get("ACTION_ID").toString());
            objParameter.setEventId(map.get("EVENT_ID").toString());
            objParameter.setCrtdByName(map.get("CRTD_USER").toString());
            objParameter.setCrtdBy(map.get("CRTD_BY").toString());
            objParameter.setCrtdDate(map.get("CRTD_DATE").toString());
            objParameter.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }

    public boolean insertTreatmentOnDischrage(TreatmentOnDischarge objSave) {

        String[] columns = {Database.DCMS.treatmentOnDischarge,
            "ADMISSION_NO", "PATIENT_ID", "HISTORY", "PAST_HISTORY", "DRUG_HX",
            "ALLERGIES", "ADDITIVES", "REMARKS", "ANALGESTICS", "ANTIBIOTICS",
            "ASTURE_REVENAL", "FROM_DATE", "TO_DATE", "TOTAL_LEAVES", "PROCEDURE_ID",
            "DIAGNOSIS_ID", "BLOOD_LOSS", "DRAINS", "HP", "SUTURS", "FINDINGS",
            "POST_OF_COMPLICATION", "DATE_OF_SURGERY", "PRIMARY_PHYSICIAN_ID",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("ADMISSION_NO", "'" + objSave.getAdmissionNo() + "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("HISTORY", "'" + objSave.getHistory().replaceAll("'", "''") + "'");
        insertMap.put("PAST_HISTORY", "'" + objSave.getPastHistory().replaceAll("'", "''") + "'");
        insertMap.put("DRUG_HX", "'" + objSave.getDrudHx().replaceAll("'", "''") + "'");
        insertMap.put("ALLERGIES", "'" + objSave.getAllergies().replaceAll("'", "''") + "'");
        insertMap.put("ADDITIVES", "'" + objSave.getAdditives().replaceAll("'", "''") + "'");
        insertMap.put("REMARKS", "'" + objSave.getRemarks().replaceAll("'", "''") + "'");
        insertMap.put("ANALGESTICS", "'" + objSave.getAnalgestics().replaceAll("'", "''") + "'");
        insertMap.put("ANTIBIOTICS", "'" + objSave.getAntibiotics().replaceAll("'", "''") + "'");
        insertMap.put("ASTURE_REVENAL", "'" + objSave.getAstureRevenal().replaceAll("'", "''") + "'");
        insertMap.put("FROM_DATE", "'" + objSave.getFromDate() + "'");
        insertMap.put("TO_DATE", "'" + objSave.getToDate() + "'");
        insertMap.put("TOTAL_LEAVES", "'" + objSave.getTotalLeaves() + "'");
        insertMap.put("PROCEDURE_ID", "'" + objSave.getProcedureId() + "'");
        insertMap.put("DIAGNOSIS_ID", "'" + objSave.getDiagnosisId() + "'");
        insertMap.put("BLOOD_LOSS", "'" + objSave.getBloodLoss().replaceAll("'", "''") + "'");
        insertMap.put("DRAINS", "'" + objSave.getDrains().replaceAll("'", "''") + "'");
        insertMap.put("HP", "'" + objSave.getHP().replaceAll("'", "''") + "'");
        insertMap.put("SUTURS", "'" + objSave.getSuturs().replaceAll("'", "''") + "'");
        insertMap.put("FINDINGS", "'" + objSave.getFindings().replaceAll("'", "''") + "'");
        insertMap.put("POST_OF_COMPLICATION", "'" + objSave.getPostOfComplication().replaceAll("'", "''") + "'");
        insertMap.put("DATE_OF_SURGERY", "'" + objSave.getDateOfSurgery() + "'");
        insertMap.put("PRIMARY_PHYSICIAN_ID", "'" + objSave.getPrimaryPhysicianId() + "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", "SYSDATE");
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean insertTreatmentOnDischrageDetail(TreatmentOnDischarge objSave) {

        String[] columns = {Database.DCMS.treatmentOnDischargeDetail,
            "ADMISSION_NO", "PATIENT_ID", "DETAIL_ID", "ACTION_ID", "EVENT_ID",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("ADMISSION_NO", "'" + objSave.getAdmissionNo() + "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("DETAIL_ID", "'" + objSave.getDetailId() + "'");
        insertMap.put("ACTION_ID", "'" + objSave.getActionId() + "'");
        insertMap.put("EVENT_ID", "'" + objSave.getEventId() + "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", "SYSDATE");
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean insertTreatmentOnDischrageHistory(TreatmentOnDischarge objSave) {

        String[] columns = {Database.DCMS.treatmentOnDischargeHistory,
            "ADMISSION_NO", "PATIENT_ID", "RECALL_BY", "RECALL_DATE", "RECALL_TERMINAL_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("ADMISSION_NO", "'" + objSave.getAdmissionNo() + "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("RECALL_BY", "'" + Constants.userId + "'");
        insertMap.put("RECALL_DATE", "SYSDATE");
        insertMap.put("RECALL_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean updateTreatmentOnDischrage(TreatmentOnDischarge objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.treatmentOnDischarge + "\n SET "
                + "HISTORY  = '" + objUpdate.getHistory().replaceAll("'", "''") + "',  \n"
                + "PAST_HISTORY  = '" + objUpdate.getPastHistory().replaceAll("'", "''") + "',  \n"
                + "DRUG_HX  = '" + objUpdate.getDrudHx().replaceAll("'", "''") + "',  \n"
                + "ALLERGIES  = '" + objUpdate.getAllergies().replaceAll("'", "''") + "',  \n"
                + "ADDITIVES  = '" + objUpdate.getAdditives().replaceAll("'", "''") + "',  \n"
                + "REMARKS  = '" + objUpdate.getRemarks().replaceAll("'", "''") + "',  \n"
                + "ANALGESTICS  = '" + objUpdate.getAnalgestics().replaceAll("'", "''") + "',  \n"
                + "ANTIBIOTICS  = '" + objUpdate.getAntibiotics().replaceAll("'", "''") + "',  \n"
                + "ASTURE_REVENAL  = '" + objUpdate.getAstureRevenal().replaceAll("'", "''") + "',  \n"
                + "FROM_DATE  = '" + objUpdate.getFromDate() + "',  \n"
                + "TO_DATE  = '" + objUpdate.getToDate() + "',  \n"
                + "TOTAL_LEAVES  = '" + objUpdate.getTotalLeaves() + "',  \n"
                + "PROCEDURE_ID  = '" + objUpdate.getProcedureId() + "',  \n"
                + "DIAGNOSIS_ID  = '" + objUpdate.getDiagnosisId() + "',  \n"
                + "BLOOD_LOSS  = '" + objUpdate.getBloodLoss().replaceAll("'", "''") + "',  \n"
                + "DRAINS  = '" + objUpdate.getDrains().replaceAll("'", "''") + "',  \n"
                + "HP  = '" + objUpdate.getHP().replaceAll("'", "''") + "',  \n"
                + "SUTURS  = '" + objUpdate.getSuturs().replaceAll("'", "''") + "',  \n"
                + "FINDINGS  = '" + objUpdate.getFindings().replaceAll("'", "''") + "',  \n"
                + "POST_OF_COMPLICATION  = '" + objUpdate.getPostOfComplication().replaceAll("'", "''") + "',  \n"
                + "DATE_OF_SURGERY  = '" + objUpdate.getDateOfSurgery() + "',  \n"
                + "PRIMARY_PHYSICIAN_ID  = '" + objUpdate.getPrimaryPhysicianId() + "',  \n"
                + "UPTD_BY  = '" + Constants.userId + "',  \n"
                + "UPTD_DATE = SYSDATE , \n"
                + "UPTD_TERMINAL_ID  = '" + Constants.terminalId + "'  "
                + "WHERE ADMISSION_NO  = '" + objUpdate.getAdmissionNo() + "'  \n"
                + "AND PATIENT_ID  = '" + objUpdate.getPatientId() + "'  \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean deleteTreatmentOnDischrageDetail(TreatmentOnDischarge objDel) {

        String query
                = " DELETE FROM " + Database.DCMS.treatmentOnDischargeDetail + "\n "
                + "WHERE PATIENT_ID  = '" + objDel.getPatientId() + "'      \n"
                + "AND ADMISSION_NO  = '" + objDel.getAdmissionNo() + "'    \n"
                + "AND ACTION_ID  = '" + objDel.getActionId() + "'          \n"
                + "AND DETAIL_ID  = '" + objDel.getDetailId() + "'          \n";

        return Constants.dao.executeUpdate(query, false);
    }

}

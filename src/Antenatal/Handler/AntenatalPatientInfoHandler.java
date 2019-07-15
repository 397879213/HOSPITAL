/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.Handler;

import Antenatal.BO.AntenatalPatientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Pacslink
 */
public class AntenatalPatientInfoHandler {

    public List<AntenatalPatientInfo> selectAntenatalPatientInfo(String patientId,
            String referenceNumber, String pregnancyVisitId) {

        String colums[] = {"-", "PREGNANCY_VISIT_ID","PATIENT_ID", "REFERENCE_ID", "HUSBAND_NAME", "EDUCATION_ID",
            "DEPARTMENT", "EDUCATION", "YEARS_MARRIED", "OCCUPATION", "CONGENTAL_ANAMOLY",
            "FAMILY_HISTORY", "MEDICAL_SURGICAL_HISTORY", "DRUG_ALLERGY", "YEARS_MARRIED_DAY",
            "GPE_POLLAR", "BREAST", "THYROID", "VARICOSE_VEINS", "G", "P", "A",
            "MC", "CONTRACEPTION", "IS_FINAL", "CRTD_BY", "CRTD_DATE", "CRTD_NAME",
            "CRTD_TERMINAL_ID", "FINAL_BY", "FINAL_DATE", "FINAL_TERMINAL_ID",
            "FINAL_NAME", "LMP", "EDD", "RISK_FACTOR", "RISK_FACTOR_REMARKS"};

        String query = " SELECT API.PREGNANCY_VISIT_ID,                         \n"
                + " API.PATIENT_ID,                                             \n"
                + " NVL(API.REFERENCE_ID, ' ')      REFERENCE_ID,               \n"
                + " NVL(API.HUSBAND_NAME, ' ')      HUSBAND_NAME,               \n"
                + " NVL(API.DEPARTMENT, ' ')        DEPARTMENT,                 \n"
                + " NVL(API.EDUCATION, ' ')         EDUCATION_ID,               \n"
                + " EDU.DESCRIPTION                 EDUCATION,                  \n"
                + " NVL(TO_CHAR(API.YEARS_MARRIED, 'DD-MON-YY'), ' ') YEARS_MARRIED,\n"
                + " NVL(ROUND(API.YEARS_MARRIED - (SYSDATE+1)), 0) YEARS_MARRIED_DAY, \n"
                + " NVL(API.OCCUPATION, ' ')        OCCUPATION,                 \n"
                + " NVL(API.CONGENTAL_ANAMOLY, ' ') CONGENTAL_ANAMOLY,          \n"
                + " NVL(API.FAMILY_HISTORY, ' ')    FAMILY_HISTORY,             \n"
                + " NVL(API.MEDICAL_SURGICAL_HISTORY, ' ') MEDICAL_SURGICAL_HISTORY,\n"
                + " NVL(API.DRUG_ALLERGY, ' ')     DRUG_ALLERGY,                \n"
                + " NVL(API.GPE_POLLAR, ' ')       GPE_POLLAR,                  \n"
                + " NVL(API.BREAST, ' ')           BREAST,                      \n"
                + " NVL(API.THYROID, ' ')          THYROID ,                    \n"
                + " NVL(API.VARICOSE_VEINS, ' ')   VARICOSE_VEINS,       \n"
                + " NVL(API.G, ' ')       G,                             \n"
                + " NVL(API.P, ' ')       P,                             \n"
                + " NVL(API.A, ' ')       A,                             \n"
                + " NVL(API.MC, ' ')      MC,                            \n"
                + " NVL(API.CONTRACEPTION, ' ')     CONTRACEPTION,       \n"
                + " TO_CHAR(API.LMP, 'DD-MON-YY')   LMP,                 \n"
                + " TO_CHAR(API.EDD, 'DD-MON-YY')   EDD,                        \n"
                + " NVL(API.RISK_FACTOR, ' ')       RISK_FACTOR,                \n"
                + " NVL(API.RISK_FACTOR_REMARKS, ' ') RISK_FACTOR_REMARKS,      \n"
                + " NVL(API.IS_FINAL, ' ')          IS_FINAL,                   \n"
                + " CRTD_USR.NAME                   CRTD_NAME,                  \n"
                + " API.CRTD_BY,                                                \n"
                + " TO_CHAR(API.CRTD_DATE, 'DD-MON-YY')   CRTD_DATE,            \n"
                + " API.CRTD_TERMINAL_ID,                                       \n"
                + " NVL(FINAL_USR.NAME, ' ')        FINAL_NAME,                 \n"
                + " NVL(API.FINAL_BY, ' ')           FINAL_BY,                  \n"
                + " NVL(TO_CHAR(API.FINAL_DATE, 'DD-MON-YY'), ' ') FINAL_DATE,  \n"
                + " NVL(API.FINAL_TERMINAL_ID, ' ')  FINAL_TERMINAL_ID  FROM    \n"
                + Database.DCMS.antenatalPatientInfo + "  API,                  \n"
                + Database.DCMS.definitionTypeDetail + "  EDU,                  \n"
                + Database.DCMS.users + "  CRTD_USR,                            \n"
                + Database.DCMS.users + "  FINAL_USR                            \n"
                + " WHERE PATIENT_ID = '" + patientId + "'                      \n"
                + " AND API.PREGNANCY_VISIT_ID = " + pregnancyVisitId + "       \n";
        if (referenceNumber.length() != 0) {
            query += "   AND REFERENCE_ID = '" + referenceNumber + "'           \n";
        }
        query += "   AND API.CRTD_BY = CRTD_USR.USER_ID                         \n"
                + "  AND API.EDUCATION = EDU.ID                         \n"
                + "  AND NVL(API.FINAL_BY, '" + Constants.userId + "' ) = "
                + "NVL(FINAL_USR.USER_ID , '" + Constants.userId + "' )  \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<AntenatalPatientInfo> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            AntenatalPatientInfo objParameter = new AntenatalPatientInfo();

            objParameter.setPregnancyVisitId(map.get("PREGNANCY_VISIT_ID").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setReferenceId(map.get("REFERENCE_ID").toString());
            objParameter.setHusbandName(map.get("HUSBAND_NAME").toString());
            objParameter.setDepartment(map.get("DEPARTMENT").toString());
            objParameter.setEducation(map.get("EDUCATION").toString());
            objParameter.setEducationId(map.get("EDUCATION_ID").toString());
            objParameter.setYearsMarried(map.get("YEARS_MARRIED").toString());
            objParameter.setYearsMarriedDay(map.get("YEARS_MARRIED_DAY").toString());
            objParameter.setOccupation(map.get("OCCUPATION").toString());
            objParameter.setCongentalAnamoly(map.get("CONGENTAL_ANAMOLY").toString());
            objParameter.setFamilyHistory(map.get("FAMILY_HISTORY").toString());
            objParameter.setMedicalSurgicalHistory(map.get("MEDICAL_SURGICAL_HISTORY").toString());
            objParameter.setDrugAllergy(map.get("DRUG_ALLERGY").toString());
            objParameter.setGprPollar(map.get("GPE_POLLAR").toString());
            objParameter.setBreast(map.get("BREAST").toString());
            objParameter.setThyroid(map.get("THYROID").toString());
            objParameter.setVaricoseVeins(map.get("VARICOSE_VEINS").toString());
            objParameter.setDrugAllergy(map.get("DRUG_ALLERGY").toString());
            objParameter.setG(map.get("G").toString());
            objParameter.setP(map.get("P").toString());
            objParameter.setA(map.get("A").toString());
            objParameter.setMC(map.get("MC").toString());
            objParameter.setContraception(map.get("CONTRACEPTION").toString());
            objParameter.setLMP(map.get("LMP").toString());
            objParameter.setEDD(map.get("EDD").toString());
            objParameter.setRiskFactor(map.get("RISK_FACTOR").toString());
            objParameter.setRiskFactorRemarks(map.get("RISK_FACTOR_REMARKS").toString());
            objParameter.setIsFinal(map.get("IS_FINAL").toString());
            objParameter.setCrtdBy(map.get("CRTD_BY").toString());
            objParameter.setCrtdDate(map.get("CRTD_DATE").toString());
            objParameter.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            objParameter.setFinalBy(map.get("FINAL_BY").toString());
            objParameter.setFinalDate(map.get("FINAL_DATE").toString());
            objParameter.setFinalTerminalId(map.get("FINAL_TERMINAL_ID").toString());
            objParameter.setFinalUser(map.get("FINAL_NAME").toString());
            objParameter.setCrtdUser(map.get("CRTD_NAME").toString());

            listParameter.add(objParameter);
        }
        return listParameter;
    }

    public boolean insertAntenatalPatientInfo(AntenatalPatientInfo objSave) {

        String columns[] = {Database.DCMS.antenatalPatientInfo, "PREGNANCY_VISIT_ID",
            "PATIENT_ID", "REFERENCE_ID",
            "HUSBAND_NAME", "DEPARTMENT", "EDUCATION", "YEARS_MARRIED", "OCCUPATION",
            "CONGENTAL_ANAMOLY", "FAMILY_HISTORY", "MEDICAL_SURGICAL_HISTORY",
            "DRUG_ALLERGY", "GPE_POLLAR", "BREAST", "THYROID", "VARICOSE_VEINS",
            "G", "P", "A", "MC", "CONTRACEPTION", "LMP", "EDD", "RISK_FACTOR",
            "RISK_FACTOR_REMARKS", "IS_FINAL", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID", "FINAL_BY", "FINAL_DATE", "FINAL_TERMINAL_ID"}; // "LMP", "EDD", "RISK_FACTOR", "RISK_FACTOR_REMARKS"

        HashMap insertMap = new HashMap();
        insertMap.put("PREGNANCY_VISIT_ID", "( SELECT NVL(MAX(PREGNANCY_VISIT_ID), '1') "
                + "PREGNANCY_VISIT_ID FROM "+ Database.DCMS.antenatalPatientInfo +" )");
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("REFERENCE_ID", "'" + objSave.getReferenceId() + "'");
        insertMap.put("HUSBAND_NAME", "'" + objSave.getHusbandName() + "'");
        insertMap.put("DEPARTMENT", "'" + objSave.getDepartment() + "'");
        insertMap.put("EDUCATION", "'" + objSave.getEducationId() + "'");
        insertMap.put("YEARS_MARRIED", "'" + objSave.getYearsMarried() + "'");
        insertMap.put("OCCUPATION", "'" + objSave.getOccupation() + "'");
        insertMap.put("CONGENTAL_ANAMOLY", "'" + objSave.getCongentalAnamoly() + "'");
        insertMap.put("FAMILY_HISTORY", "'" + objSave.getFamilyHistory() + "'");
        insertMap.put("MEDICAL_SURGICAL_HISTORY", "'" + objSave.getMedicalSurgicalHistory() + "'");
        insertMap.put("DRUG_ALLERGY", "'" + objSave.getDrugAllergy() + "'");
        insertMap.put("GPE_POLLAR", "'" + objSave.getGprPollar() + "'");
        insertMap.put("BREAST", "'" + objSave.getBreast() + "'");
        insertMap.put("THYROID", "'" + objSave.getThyroid() + "'");
        insertMap.put("VARICOSE_VEINS", "'" + objSave.getVaricoseVeins() + "'");
        insertMap.put("G", "'" + objSave.getG() + "'");
        insertMap.put("P", "'" + objSave.getP() + "'");
        insertMap.put("A", "'" + objSave.getA() + "'");
        insertMap.put("MC", "'" + objSave.getMC() + "'");
        insertMap.put("CONTRACEPTION", "'" + objSave.getContraception() + "'");
        insertMap.put("LMP", "TO_DATE('" + objSave.getLMP() + "', 'DD-MON-YY')");
        insertMap.put("EDD", "TO_DATE('" + objSave.getEDD() + "', 'DD-MON-YY')");
        insertMap.put("RISK_FACTOR", "'" + objSave.getRiskFactor() + "'");
        insertMap.put("RISK_FACTOR_REMARKS", "'" + objSave.getRiskFactorRemarks().replaceAll("'", "''") + "'");
        insertMap.put("IS_FINAL", "'" + objSave.getIsFinal() + "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", Constants.today);
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        insertMap.put("FINAL_BY", "'" + objSave.getFinalBy() + "'");
        insertMap.put("FINAL_DATE", objSave.getFinalDate());
        insertMap.put("FINAL_TERMINAL_ID", "'" + objSave.getFinalTerminalId() + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean updateAntenatalPatientInfo(AntenatalPatientInfo objUpdate) {

        String query
                = "UPDATE " + Database.DCMS.antenatalPatientInfo + " SET  \n"
                + "HUSBAND_NAME= '" + objUpdate.getHusbandName() + "',    \n"
                + "DEPARTMENT= '" + objUpdate.getDepartment() + "',       \n"
                + "EDUCATION= '" + objUpdate.getEducationId() + "',       \n"
                + "YEARS_MARRIED= '" + objUpdate.getYearsMarried() + "',  \n"
                + "OCCUPATION= '" + objUpdate.getOccupation() + "',       \n"
                + "CONGENTAL_ANAMOLY= '" + objUpdate.getCongentalAnamoly() + "',\n"
                + "FAMILY_HISTORY= '" + objUpdate.getFamilyHistory() + "',\n"
                + "MEDICAL_SURGICAL_HISTORY= '" + objUpdate.getMedicalSurgicalHistory() + "',\n"
                + "DRUG_ALLERGY= '" + objUpdate.getDrugAllergy() + "',     \n"
                + "GPE_POLLAR= '" + objUpdate.getGprPollar() + "',         \n"
                + "BREAST= '" + objUpdate.getBreast() + "',                \n"
                + "THYROID= '" + objUpdate.getThyroid() + "',              \n"
                + "VARICOSE_VEINS= '" + objUpdate.getVaricoseVeins() + "', \n"
                + "G= '" + objUpdate.getG() + "',                          \n"
                + "P= '" + objUpdate.getP() + "',                          \n"
                + "A= '" + objUpdate.getA() + "',                          \n"
                + "MC= '" + objUpdate.getMC() + "',                        \n"
                + "CONTRACEPTION= '" + objUpdate.getContraception() + "',  \n"
                + "LMP= '" + objUpdate.getLMP().toUpperCase() + "',        \n"
                + "EDD= '" + objUpdate.getEDD().toUpperCase() + "',        \n"
                + "RISK_FACTOR= '" + objUpdate.getRiskFactor() + "',       \n"
                + "RISK_FACTOR_REMARKS= '" + objUpdate.getRiskFactorRemarks().replaceAll("'", "''") + "',\n"
                + "IS_FINAL= '" + objUpdate.getIsFinal() + "',             \n"
                + "FINAL_BY= '" + objUpdate.getFinalBy() + "',             \n"
                + "FINAL_DATE = " + objUpdate.getFinalDate() + ",          \n"
                + "FINAL_TERMINAL_ID = '" + objUpdate.getFinalTerminalId() + "'\n"
                + "WHERE PATIENT_ID = '" + objUpdate.getPatientId() + "'  \n"
                + "AND REFERENCE_ID = '" + objUpdate.getReferenceId() + "' \n"
                + "AND PREGNANCY_VISIT_ID = '" + objUpdate.getPregnancyVisitId()+ "' \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public String selectPregnancyVisitId(String patientId) {

        String columns[] = {"-", "ID"};

        String query = " SELECT MAX(PREGNANCY_VISIT_ID) ID FROM                 \n"
                + Database.DCMS.antenatalPatientInfo + "                        \n"
                + "WHERE PATIENT_ID = '" + patientId + "'                       \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        return listmap.get(0).get("ID").toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.Handler;

import Antenatal.BO.AntenatalVisitsBo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author ADMIN
 */
public class AntenatalVisitHandler {

    public boolean insertAntenatalVisits(AntenatalVisitsBo objAntenatal) {
        String[] columns = {Database.DCMS.antenatalVisitHistory,"PREGNANCY_VISIT_ID",
            "PATIENT_ID", "REFERENCE_ID", "BLOOD_PRESSURE_DIASTOLIC",
            "BLOOD_PRESSURE_SYSTOLIC", "WEIGHT", "WEEKS_BY_DATES", "FUNDAL_HEIGHT",
            "LIE", "PRESENTATION", "OEDEMA", "NEXT_VISIT",  "USG_ED",
              "FOETAL_HEART", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID", "ADVISED", "FINAL_BY", "FINAL_DATE",
            "FINAL_TERMINAL_ID", "IS_FINAL"};

        HashMap mapVisits = new HashMap();

        mapVisits.put("PREGNANCY_VISIT_ID", "'" + objAntenatal.getPregnancyVisitId()+ "'");
        mapVisits.put("PATIENT_ID", "'" + objAntenatal.getPatientId() + "'");
        mapVisits.put("REFERENCE_ID", "'" + objAntenatal.getReferenceId() + "'");
        mapVisits.put("USG_ED", "'" + objAntenatal.getUsgEd() + "'");
        mapVisits.put("BLOOD_PRESSURE_DIASTOLIC", "'"
                + objAntenatal.getBloodPressureDiastolic() + "'");
        mapVisits.put("BLOOD_PRESSURE_SYSTOLIC", "'"
                + objAntenatal.getBloodPressureSystolic() + "'");
        mapVisits.put("WEIGHT", "'" + objAntenatal.getWeight() + "'");
        mapVisits.put("WEEKS_BY_DATES", "'" + objAntenatal.getWeeksByDates() + "'");
        mapVisits.put("FUNDAL_HEIGHT", "'" + objAntenatal.getFundalHeight() + "'");
        mapVisits.put("FOETAL_HEART", "'" + objAntenatal.getFoetalHeart() + "'");
        mapVisits.put("LIE", "'" + objAntenatal.getLie() + "'");
        mapVisits.put("PRESENTATION", "'" + objAntenatal.getPresentation() + "'");
        mapVisits.put("OEDEMA", "'" + objAntenatal.getOedema() + "'");
        mapVisits.put("IS_FINAL", "'" + objAntenatal.getIsFinal() + "'");
        mapVisits.put("NEXT_VISIT", "'" + objAntenatal.getNextVisitDate() + "'");
        mapVisits.put("CRTD_DATE", Constants.today);
        mapVisits.put("CRTD_BY", "'" + Constants.userId + "'");
        mapVisits.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        mapVisits.put("ADVISED", "'" + objAntenatal.getAdvised() + "'");
        mapVisits.put("FINAL_BY", "'" + objAntenatal.getFinalBy() + "'");
        mapVisits.put("FINAL_DATE", objAntenatal.getFinalDate());
        mapVisits.put("FINAL_TERMINAL_ID", "'" + objAntenatal.getFinalTerminalId() + "'");

        List vec = new ArrayList();
        vec.add(mapVisits);
        return Constants.dao.insertData(vec, columns);

    }

    public List<AntenatalVisitsBo> searchVisits(String referenceId, String patientId,
            String fromDate, String toDate, String isFinal, String pregnancyVisitId) {

        String[] columns = {Database.DCMS.patientVitalSigns, "PREGNANCY_VISIT_ID",
            "PATIENT_ID", "PATIENT_NAME", "REFERENCE_ID", "BLOOD_PRESSURE_SYSTOLIC",
            "BLOOD_PRESSURE_DIASTOLIC", "WEIGHT", "WEEKS_BY_DATES", 
            "USG_ED", "FUNDAL_HEIGHT", "LIE", "PRESENTATION",
            "FOETAL_HEART", "CRTD_NAME", "OEDEMA", "NEXT_VISIT_DATE","NEXT_VISIT_DAY",
            "ADVISED", "IS_FINAL", "CRTD_TERMINAL_ID", "FINAL_BY", "FINAL_DATE",
            "FINAL_TERMINAL_ID", "FINAL_NAME"};

        String query
                = " SELECT RAV.PREGNANCY_VISIT_ID,                           \n"
                + " RAV.PATIENT_ID                          PATIENT_ID,      \n"
                + " PAT.FULL_NAME                           PATIENT_NAME,    \n"
                + " RAV.REFERENCE_ID                        REFERENCE_ID,    \n"
                + " RAV.USG_ED                              USG_ED,          \n"
                + " NVL(RAV.BLOOD_PRESSURE_SYSTOLIC, ' ')   BLOOD_PRESSURE_SYSTOLIC,\n"
                + " NVL(RAV.BLOOD_PRESSURE_DIASTOLIC, ' ')  BLOOD_PRESSURE_DIASTOLIC,\n"
                + " NVL(RAV.WEIGHT, ' ')                    WEIGHT,          \n"
                + " NVL(RAV.WEEKS_BY_DATES, ' ')            WEEKS_BY_DATES,  \n"
                + " NVL(RAV.FUNDAL_HEIGHT, ' ')             FUNDAL_HEIGHT,   \n"
                + " NVL(RAV.LIE, ' ')                       LIE ,            \n"
                + " NVL(RAV.PRESENTATION, ' ')              PRESENTATION,    \n"
                + " NVL(RAV.FOETAL_HEART, ' ')              FOETAL_HEART,    \n"
                + " NVL(RAV.OEDEMA, ' ')                    OEDEMA ,         \n"
                + " NVL(TO_CHAR(RAV.NEXT_VISIT, 'DD-MON-YY'), ' ') NEXT_VISIT_DATE, \n"
                + " ROUND(RAV.NEXT_VISIT - SYSDATE  )+1     NEXT_VISIT_DAY,     \n"
                + " NVL(ADVISED, ' ')                       ADVISED,            \n"
                + " RAV.CRTD_BY                             CRTD_BY,            \n"
                + " URS.NAME                                CRTD_NAME,          \n"
                + " NVL(TO_CHAR(RAV.CRTD_DATE, 'DD-MON-YY'), ' ')CRTD_DATE,     \n"
                + " RAV.CRTD_TERMINAL_ID                    CRTD_TERMINAL_ID,   \n"
                + " NVL(RAV.FINAL_BY , ' ' )                FINAL_BY ,          \n"
                + " NVL(FINAL_URS.NAME ,' ')               FINAL_NAME ,         \n"
                + " NVL(TO_CHAR(RAV.FINAL_DATE, 'DD-MON-YY DD:MI:SS'), ' ')FINAL_DATE,\n"
                + " NVL(RAV.FINAL_TERMINAL_ID, ' ')         FINAL_TERMINAL_ID,  \n"
                + " NVL(RAV.IS_FINAL, ' ')                  IS_FINAL            \n"
                + " FROM "
                + Database.DCMS.antenatalVisitHistory + " RAV,                  \n"
                + Database.DCMS.patient + " PAT  ,                              \n"
                + Database.DCMS.users + " URS    ,                              \n"
                + Database.DCMS.users + " FINAL_URS                             \n"
                + " WHERE RAV.PATIENT_ID = '" + patientId + "'                  \n"
                + " AND RAV.PREGNANCY_VISIT_ID = " + pregnancyVisitId + "       \n";
        if (referenceId.length() != 0) { // 
            query += " AND RAV.REFERENCE_ID = '" + referenceId + "' \n";
        }
        if (isFinal.length() != 0) { // 
            query += " AND RAV.IS_FINAL = '" + isFinal + "' \n";
        }
        if (fromDate.length() != 0 && toDate.length() != 0) { // referenceId
            query += " AND TRUNC(RAV.FINAL_DATE) BETWEEN '" + fromDate + "' AND '"
                    + toDate + "' \n";
        }
        query += " AND RAV.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + " AND URS.USER_NAME = RAV.CRTD_BY                          \n"
                +"AND NVL(FINAL_URS.USER_NAME, 'PLC') = NVL(RAV.FINAL_BY, 'PLC')\n";
        
        System.out.println(query);
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<AntenatalVisitsBo> listVisit = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            AntenatalVisitsBo selectobj = new AntenatalVisitsBo();

            selectobj.setPregnancyVisitId((String) map.get("PREGNANCY_VISIT_ID"));
            selectobj.setPatientId((String) map.get("PATIENT_ID"));
            selectobj.setPatientName((String) map.get("PATIENT_NAME"));
            selectobj.setReferenceId((String) map.get("REFERENCE_ID"));
            selectobj.setUsgEd((String) map.get("USG_ED"));
            selectobj.setBloodPressureSystolic((String) map.get("BLOOD_PRESSURE_SYSTOLIC"));
            selectobj.setBloodPressureDiastolic((String) map.get("BLOOD_PRESSURE_DIASTOLIC"));
            selectobj.setWeight((String) map.get("WEIGHT"));
            selectobj.setWeeksByDates((String) map.get("WEEKS_BY_DATES"));
            selectobj.setFundalHeight((String) map.get("FUNDAL_HEIGHT"));
            selectobj.setLie((String) map.get("LIE"));
            selectobj.setPresentation((String) map.get("PRESENTATION"));
            selectobj.setFoetalHeart((String) map.get("FOETAL_HEART"));
            selectobj.setOedema((String) map.get("OEDEMA"));
            selectobj.setNextVisitDate((String) map.get("NEXT_VISIT_DATE"));
            selectobj.setNextVisitDay((String) map.get("NEXT_VISIT_DAY"));
            selectobj.setAdvised((String) map.get("ADVISED"));
            selectobj.setIsFinal((String) map.get("IS_FINAL"));
            selectobj.setUserName((String) map.get("CRTD_NAME"));
            selectobj.setCrtdDate((String) map.get("CRTD_DATE"));
            selectobj.setFinalBy((String) map.get("FINAL_BY"));
            selectobj.setFinalName((String) map.get("FINAL_NAME"));
            selectobj.setFinalDate((String) map.get("FINAL_DATE"));
            selectobj.setFinalTerminalId((String) map.get("FINAL_TERMINAL_ID"));

            listVisit.add(selectobj);
        }
        return listVisit;
    }

    public boolean updateAntenatalVisits(AntenatalVisitsBo objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.antenatalVisitHistory + " SET \n"
                + "BLOOD_PRESSURE_SYSTOLIC = '" + objUpdate.getBloodPressureSystolic() + "', \n"
                + "BLOOD_PRESSURE_DIASTOLIC  = '" + objUpdate.getBloodPressureDiastolic() + "', \n"
                + "WEIGHT  = '" + objUpdate.getWeight() + "',                \n"
                + "WEEKS_BY_DATES  = '" + objUpdate.getWeeksByDates() + "',  \n"
                + "FUNDAL_HEIGHT  = '" + objUpdate.getFundalHeight() + "',   \n"
                + "LIE  = '" + objUpdate.getLie() + "',                      \n"
                + "PRESENTATION  = '" + objUpdate.getPresentation() + "' ,   \n"
                + "FOETAL_HEART  = '" + objUpdate.getFoetalHeart() + "'   ,  \n"
                + "OEDEMA  = '" + objUpdate.getOedema() + "',                \n"
                + "NEXT_VISIT  = '" + objUpdate.getNextVisitDate() + "',     \n"
                + "ADVISED  = '" + objUpdate.getAdvised() + "',              \n"
                + "IS_FINAL  = '" + objUpdate.getIsFinal()+ "',              \n"
                + "FINAL_BY  = '" + objUpdate.getFinalBy()+ "',              \n"
                + "FINAL_DATE  = " + objUpdate.getFinalDate()+ ",            \n"
                + "FINAL_TERMINAL_ID  = '" + objUpdate.getFinalTerminalId()+ "'\n"
                + "WHERE PATIENT_ID = '" + objUpdate.getPatientId() + "'     \n"
                + "AND REFERENCE_ID = '" + objUpdate.getReferenceId() + "'   \n"
                + "AND PREGNANCY_VISIT_ID = '" + objUpdate.getPregnancyVisitId()+ "' \n";

        return Constants.dao.executeUpdate(query, false);
    }
}

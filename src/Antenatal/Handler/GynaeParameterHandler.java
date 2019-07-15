/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.Handler;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import Antenatal.BO.GynaeParameter;

/**
 *
 * @author raheelansari
 */
public class GynaeParameterHandler {

    public List<GynaeParameter> selectGayneeParameter(String patientId,
            String referenceNumber, String pregnancyVisitId) {

        String colums[] = {"-", "PREGNANCY_VISIT_ID","PATIENT_ID", "REFERENCE_ID", 
            "LMP", "EDD","FETUS", "FCA", "HEAD_CIRCUMFERENCE", "AC", "LIE", "PRESENTATION",
            "AFI", "BIPARIETAL_DIAMETER", "LIQUOR", "AMNIOTIC_FLUID_VOLUME", "PLACENTA",
            "GESTATION_SAC", "NUCHAL_TRANSLUCENCY","CORD", "GRADE", "CERVIX", 
            "EDD_DATE", "REMARKS", "IS_FINAL","CRTD_BY","CRL","FEMUR_LENGTH",
            "CRTD_NAME", "CRTD_BY","CRTD_TERMINAL_ID", "CRTD_DATE", "FINAL_NAME", 
            "FINAL_TERMINAL_ID", "FINAL_BY", "FINAL_DATE"};

        String query = " SELECT GP.PREGNANCY_VISIT_ID,                       \n"
                + " GP.PATIENT_ID,                                           \n"
                + "   GP.REFERENCE_ID                 REFERENCE_ID,          \n"
                + "   NVL(GP.LMP, ' ')                LMP,                   \n"
                + "   NVL(GP.EDD, ' ')                EDD,                   \n"
                + "   NVL(GP.FETUS, ' ')              FETUS,                 \n"
                + "   NVL(GP.FCA, ' ')                FCA,                   \n"
                + "   NVL(GP.HEAD_CIRCUMFERENCE, ' ') HEAD_CIRCUMFERENCE,    \n"
                + "   NVL(GP.AC, ' ')                 AC,                    \n"
                + "   NVL(GP.LIE, ' ')   LIE,                                \n"
                + "   NVL(GP.PRESENTATION, ' ')       PRESENTATION,          \n"
                + "   NVL(GP.AFI, ' ')                AFI,                   \n"
                + "   NVL(GP.BIPARIETAL_DIAMETER, ' ')BIPARIETAL_DIAMETER,   \n"
                + "   NVL(GP.FEMUR_LENGTH, ' ')       FEMUR_LENGTH,          \n"
                + "   NVL(GP.LIQUOR, ' ')             LIQUOR,                \n"
                + "   NVL(GP.AMNIOTIC_FLUID_VOLUME, ' ') AMNIOTIC_FLUID_VOLUME,\n"
                + "   NVL(GP.PLACENTA, ' ')           PLACENTA,              \n"
                + "   NVL(GP.CRL, ' ')                CRL,                   \n"
                + "   NVL(GP.GESTATION_SAC, ' ')      GESTATION_SAC,         \n"
                + "   NVL(GP.NUCHAL_TRANSLUCENCY, ' ')NUCHAL_TRANSLUCENCY,   \n"
                + "   NVL(GP.CORD, ' ')               CORD,                  \n"
                + "   NVL(GP.GRADE, ' ')              GRADE,                 \n"
                + "   NVL(GP.CERVIX, ' ')             CERVIX,                \n"
                + "   NVL(TO_CHAR(GP.EDD_DATE, 'DD-MON-YY'), ' ') EDD_DATE,  \n"
                + "   NVL(GP.REMARKS, ' ')            REMARKS,               \n"
                + "   GP.IS_FINAL                    IS_FINAL,               \n"
                + "   GP.CRTD_BY                     CRTD_BY,                \n"
                + "   GP.CRTD_TERMINAL_ID            CRTD_TERMINAL_ID,       \n"
                + "   USR.NAME                       CRTD_NAME ,             \n"
                + "   TO_CHAR(GP.CRTD_DATE, 'DD-MON-YY')CRTD_DATE,           \n"
                + "   NVL(GP.FINAL_BY, ' ')          FINAL_BY,               \n"
                + "   NVL(GP.FINAL_TERMINAL_ID, ' ') FINAL_TERMINAL_ID,      \n"
                + "   NVL(FINAL.NAME, ' ')           FINAL_NAME ,            \n"
                + "   NVL(TO_CHAR(GP.FINAL_DATE, 'DD-MON-YY'), ' ') FINAL_DATE FROM \n"
                + Database.DCMS.OBSGYNUltrasound + "  GP,                     \n"
                + Database.DCMS.users + "             USR,                   \n"
                + Database.DCMS.users + "             FINAL                  \n"
                + " WHERE PATIENT_ID = '" + patientId + "'                   \n"
                + " AND PREGNANCY_VISIT_ID = '" + pregnancyVisitId + "'      \n";
        if (referenceNumber.length() != 0) {
            query += " AND REFERENCE_ID = '" + referenceNumber + "'          \n";
        }
        query += " AND GP.CRTD_BY = USR.USER_NAME                            \n"
              + "  AND NVL(GP.FINAL_BY, '"+ Constants.userId +"') = "
              + "  NVL(FINAL.USER_NAME, '"+ Constants.userId +"')            \n"
              + "  ORDER BY TO_CHAR(GP.FINAL_DATE, 'DD-MON-YY HH:MI:YY') DESC\n";
         
        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<GynaeParameter> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            GynaeParameter objParameter = new GynaeParameter();

            objParameter.setPregnancyVisitId(map.get("PREGNANCY_VISIT_ID").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setReferenceId(map.get("REFERENCE_ID").toString());
            objParameter.setLmp(map.get("LMP").toString());
            objParameter.setEdd(map.get("EDD").toString());
            objParameter.setFetus(map.get("FETUS").toString());
            objParameter.setFca(map.get("FCA").toString());
            objParameter.setHeadCircumference(map.get("HEAD_CIRCUMFERENCE").toString());
            objParameter.setAc(map.get("AC").toString());
            objParameter.setLie(map.get("LIE").toString());
            objParameter.setPresentation(map.get("PRESENTATION").toString());
            objParameter.setAfi(map.get("AFI").toString());
            objParameter.setBiparietalDiameter(map.get("BIPARIETAL_DIAMETER").toString());
            objParameter.setFemurLength(map.get("FEMUR_LENGTH").toString());
            objParameter.setLiquor(map.get("LIQUOR").toString());
            objParameter.setAmnioticFluidVolume(map.get("AMNIOTIC_FLUID_VOLUME").toString());
            objParameter.setPlacenta(map.get("PLACENTA").toString());
            objParameter.setCrl(map.get("CRL").toString());
            objParameter.setGestationSac(map.get("GESTATION_SAC").toString());
            objParameter.setNuchalTranslucency(map.get("NUCHAL_TRANSLUCENCY").toString());
            objParameter.setCord(map.get("CORD").toString());
            objParameter.setGrade(map.get("GRADE").toString());
            objParameter.setCervix(map.get("CERVIX").toString());
            objParameter.setEddDate(map.get("EDD_DATE").toString());
            objParameter.setRemarks(map.get("REMARKS").toString());
            objParameter.setIsFinal(map.get("IS_FINAL").toString());
            objParameter.setCrtdBy(map.get("CRTD_BY").toString());
            objParameter.setCrtdUser(map.get("CRTD_NAME").toString());
            objParameter.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            objParameter.setCrtdDate(map.get("CRTD_DATE").toString());
            objParameter.setFianlBy(map.get("FINAL_BY").toString());
            objParameter.setFianlUser(map.get("FINAL_NAME").toString());
            objParameter.setFianlTerminalId(map.get("FINAL_TERMINAL_ID").toString());
            objParameter.setFianlDate(map.get("FINAL_DATE").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }

    public boolean insertGayneeParameters(GynaeParameter objSave) {

        String columns[] = {Database.DCMS.OBSGYNUltrasound, "PATIENT_ID", "PREGNANCY_VISIT_ID", 
            "REFERENCE_ID","LMP", "EDD", "FETUS", "FCA", "HEAD_CIRCUMFERENCE", 
            "AC","LIE", "PRESENTATION","AFI", "BIPARIETAL_DIAMETER","FEMUR_LENGTH",
            "LIQUOR", "AMNIOTIC_FLUID_VOLUME","PLACENTA","GESTATION_SAC",
            "NUCHAL_TRANSLUCENCY","CORD", "GRADE","CERVIX", "CRL","EDD_DATE", 
            "REMARKS", "IS_FINAL","CRTD_BY","CRTD_TERMINAL_ID", "CRTD_DATE",
            "FINAL_BY", "FINAL_DATE", "FINAL_TERMINAL_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("PREGNANCY_VISIT_ID", "'" + objSave.getPregnancyVisitId()+ "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("REFERENCE_ID", "'" + objSave.getReferenceId() + "'");
        insertMap.put("LMP", "'" + objSave.getLmp()+ "'");
        insertMap.put("EDD", "'" + objSave.getEdd()+ "'");
        insertMap.put("FETUS", "'" + objSave.getFetus()+ "'");
        insertMap.put("FCA", "'" + objSave.getFca()+ "'");
        insertMap.put("HEAD_CIRCUMFERENCE", "'" + objSave.getHeadCircumference()+ "'");
        insertMap.put("AC", "'" + objSave.getAc()+ "'");
        insertMap.put("LIE", "'" + objSave.getLie() + "'");
        insertMap.put("PRESENTATION", "'" + objSave.getPresentation()+ "'");
        insertMap.put("AFI", "'" + objSave.getAfi()+ "'");
        insertMap.put("BIPARIETAL_DIAMETER", "'" + objSave.getBiparietalDiameter()+ "'");
        insertMap.put("FEMUR_LENGTH", "'" + objSave.getFemurLength()+ "'");
        insertMap.put("LIQUOR", "'" + objSave.getLiquor()+ "'");
        insertMap.put("AMNIOTIC_FLUID_VOLUME", "'" + objSave.getAmnioticFluidVolume()+ "'");
        insertMap.put("PLACENTA", "'" + objSave.getPlacenta()+ "'");
        insertMap.put("CRL", "'" + objSave.getCrl()+ "'");
        insertMap.put("GESTATION_SAC", "'" + objSave.getGestationSac()+ "'");
        insertMap.put("NUCHAL_TRANSLUCENCY", "'" + objSave.getNuchalTranslucency()+ "'");
        insertMap.put("CORD", "'" + objSave.getCord()+ "'");
        insertMap.put("GRADE", "'" + objSave.getGrade()+ "'");
        insertMap.put("CERVIX", "'" + objSave.getCervix()+ "'");
        insertMap.put("EDD_DATE", "'" + objSave.getEddDate()+ "'");
        insertMap.put("REMARKS", "'" + objSave.getRemarks()+ "'");
        insertMap.put("IS_FINAL", "'" + objSave.getIsFinal()+ "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", "SYSDATE");
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        insertMap.put("FINAL_BY", "'" + objSave.getFianlBy() + "'");
        insertMap.put("FINAL_DATE", objSave.getFianlDate());
        insertMap.put("FINAL_TERMINAL_ID", "'" + objSave.getFianlTerminalId() + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean updateGayneeParameters(GynaeParameter objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.OBSGYNUltrasound + " SET            \n"
                + "LMP  = '" + objUpdate.getLmp()+ "',                          \n"
                + "EDD  = '" + objUpdate.getEdd()+ "',                          \n"
                + "FETUS  = '" + objUpdate.getFetus()+ "',                      \n"
                + "FCA  = '" + objUpdate.getFca()+ "',                          \n"
                + "HEAD_CIRCUMFERENCE= '" + objUpdate.getHeadCircumference()+ "',\n"
                + "AC  = '" + objUpdate.getAc()+ "',                            \n"
                + "LIE  = '" + objUpdate.getLie()+ "',                          \n"
                + "PRESENTATION  = '" + objUpdate.getPresentation()+ "',        \n"
                + "AFI  = '" + objUpdate.getAfi()+ "',                          \n"
                + "BIPARIETAL_DIAMETER = '" + objUpdate.getBiparietalDiameter()+ "',\n"
                + "FEMUR_LENGTH  = '" + objUpdate.getFemurLength()+ "',         \n"
                + "LIQUOR  = '" + objUpdate.getLiquor()+ "',                    \n"
                + "AMNIOTIC_FLUID_VOLUME = '" + objUpdate.getAmnioticFluidVolume()+ "',\n"
                + "PLACENTA = '" + objUpdate.getPlacenta()+ "',                 \n"
                + "CRL  = '" + objUpdate.getCrl()+ "',                          \n"
                + "GESTATION_SAC  = '" + objUpdate.getGestationSac()+ "',       \n"
                + "NUCHAL_TRANSLUCENCY  = '" + objUpdate.getNuchalTranslucency()+ "',\n"
                + "CORD  = '" + objUpdate.getCord()+ "',                        \n"
                + "GRADE  = '" + objUpdate.getGrade()+ "',                      \n"
                + "CERVIX  = '" + objUpdate.getCervix()+ "',                    \n"
                + "EDD_DATE  = '" + objUpdate.getEddDate()+ "',                 \n"
                + "REMARKS  = '" + objUpdate.getRemarks()+ "',                  \n"
                + "IS_FINAL  = '" + objUpdate.getIsFinal() + "',                \n"
                + "FINAL_BY  = '" + objUpdate.getFianlBy()+ "',                 \n"
                + "FINAL_DATE  = " + objUpdate.getFianlDate()+ ",               \n"
                + "FINAL_TERMINAL_ID  = '" + objUpdate.getFianlTerminalId() + "'\n"
                + "WHERE PATIENT_ID = '" + objUpdate.getPatientId() + "'        \n"
                + "AND PREGNANCY_VISIT_ID = " + objUpdate.getPregnancyVisitId()+ "\n"
                + "AND REFERENCE_ID = '" + objUpdate.getReferenceId() + "'      \n";
        
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean fetchRecord(GynaeParameter objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.OBSGYNUltrasound + " SET         \n"
                + "IS_FINAL  = '" + objUpdate.getIsFinal()+ "',               \n"
                + "FINAL_BY  = '" + objUpdate.getFianlBy()+ "'                \n"
                + "WHERE PATIENT_ID = '" + objUpdate.getPatientId() + "'      \n"
                + "AND PREGNANCY_VISIT_ID = " + objUpdate.getPregnancyVisitId()+ "\n"
                + "AND REFERENCE_ID = '" + objUpdate.getReferenceId() + "'    \n";
                

        return Constants.dao.executeUpdate(query, false);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.OPD;

import BO.OPD.PatientHospitalVisit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class GayneeParameterHandler {
    
    public List<PatientHospitalVisit> selectGayneeParameter(String patientId,
            String referenceNumber) {

        String colums[] = {"-", "PATIENT_ID", "REFERENCE_ID", "NO_OF_FOETUS", 
            "LIE_PRESENTATION", "FCA", "CRL_BPD", "FL", "PLACENTA", "LIQUOR", 
            "EDD", "ANY_ABNORMALITY", "IS_FINAL"};
        
        String query = " SELECT PATIENT_ID,                             \n"
                + "        REFERENCE_ID,                                \n"
                + "        NO_OF_FOETUS,                                \n"
                + "        LIE_PRESENTATION,                            \n"
                + "        FCA,                                         \n"
                + "        CRL_BPD,                                     \n"
                + "        FL,                                          \n"
                + "        PLACENTA,                                    \n"
                + "        LIQUOR,                                      \n"
                + "        EDD,                                         \n"
                + "        ANY_ABNORMALITY,                             \n"
                + "        IS_FINAL  FROM                               \n"
                + Database.DCMS.gynaeParameters + "                    \n"
                + " WHERE PATIENT_ID = '"+ patientId +"'                \n";
        if(referenceNumber.length() != 0){
            query += "   AND REFERENCE_ID = '"+ referenceNumber +"'        \n";
        }
                
//                + "   AND IS_FINAL = '"+ isFinal +"'                    \n";
 
        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<PatientHospitalVisit> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            PatientHospitalVisit objParameter = new PatientHospitalVisit();
            
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setReferenceId(map.get("REFERENCE_ID").toString());
            objParameter.setNoOfFoetus(map.get("NO_OF_FOETUS").toString());
            objParameter.setLiePresentation(map.get("LIE_PRESENTATION").toString());
            objParameter.setFCA(map.get("FCA").toString());
            objParameter.setCrlBpd(map.get("CRL_BPD").toString());
            objParameter.setFL(map.get("FL").toString());
            objParameter.setPlacenta(map.get("PLACENTA").toString());
            objParameter.setLiquor(map.get("LIQUOR").toString());
            objParameter.setEDD(map.get("EDD").toString());
            objParameter.setAnyAbnormality(map.get("ANY_ABNORMALITY").toString());
            objParameter.setIsFinal(map.get("IS_FINAL").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }
    
    public boolean insertGayneeParameters(PatientHospitalVisit objSave) {

        String columns[] = {Database.DCMS.gynaeParameters, "PATIENT_ID", 
            "REFERENCE_ID", "NO_OF_FOETUS", "LIE_PRESENTATION", "FCA", "CRL_BPD", 
            "FL", "PLACENTA", "LIQUOR", "EDD", "ANY_ABNORMALITY", "IS_FINAL", 
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("PATIENT_ID", "'" + objSave.getPatientId() + "'");
        insertMap.put("REFERENCE_ID", "'" + objSave.getReferenceId()+ "'");
        insertMap.put("NO_OF_FOETUS", "'" + objSave.getNoOfFoetus()+ "'");
        insertMap.put("LIE_PRESENTATION", "'" + objSave.getLiePresentation()+ "'");
        insertMap.put("FCA", "'" + objSave.getFCA()+ "'");
        insertMap.put("CRL_BPD", "'" + objSave.getCrlBpd()+ "'");
        insertMap.put("FL", "'" + objSave.getFL()+ "'");
        insertMap.put("PLACENTA", "'" + objSave.getPlacenta()+ "'");
        insertMap.put("LIQUOR", "'" + objSave.getLiquor()+ "'");
        insertMap.put("EDD", "'" + objSave.getEDD()+ "'");
        insertMap.put("ANY_ABNORMALITY", "'" + objSave.getAnyAbnormality()+ "'");
        insertMap.put("IS_FINAL", "'" + objSave.getIsFinal()+ "'");
        insertMap.put("CRTD_BY", "'" + Constants.userId + "'");
        insertMap.put("CRTD_DATE", "SYSDATE");
        insertMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }
    
    public boolean updateGayneeParameters(PatientHospitalVisit objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.gynaeParameters + " SET           \n"
                + "PATIENT_ID  = '" + objUpdate.getPatientId() + "',            \n"
                + "REFERENCE_ID  = '" + objUpdate.getReferenceId()+ "',         \n"
                + "NO_OF_FOETUS  = '" + objUpdate.getNoOfFoetus()+ "',          \n"
                + "LIE_PRESENTATION  = '" + objUpdate.getLiePresentation()+ "', \n"
                + "FCA  = '" + objUpdate.getFCA()+ "',                          \n"
                + "CRL_BPD  = '" + objUpdate.getCrlBpd()+ "',                   \n"
                + "FL  = '" + objUpdate.getFL()+ "',                            \n"
                + "PLACENTA  = '" + objUpdate.getPlacenta()+ "',                \n"
                + "LIQUOR  = '" + objUpdate.getLiquor()+ "',                    \n"
                + "EDD  = '" + objUpdate.getEDD()+ "',                          \n"
                + "ANY_ABNORMALITY  = '" + objUpdate.getAnyAbnormality()+ "',   \n"
                + "IS_FINAL  = '" + objUpdate.getIsFinal()+ "'                  \n"
                + "WHERE PATIENT_ID = '"+ objUpdate.getPatientId()+"'           \n"
                + "AND REFERENCE_ID = '"+ objUpdate.getReferenceId()+"'         \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
}

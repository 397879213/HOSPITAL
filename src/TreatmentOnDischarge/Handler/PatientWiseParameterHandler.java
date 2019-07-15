/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentOnDischarge.Handler;

import BO.Hospital.ParameterSelectionBO;
import BO.OPD.PatientHospitalVisit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

/**
 *
 * @author Pacslink
 */
public class PatientWiseParameterHandler {
    
    List<PatientHospitalVisit> listParameter = new ArrayList<>();
    public boolean patientPerformedParametersPRD(String patientId, 
            String admissionNumber, String parameterId) {
        boolean ret = true;
        String colums[] = {"-", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "CPT_DESC",
            "PARAMETER_ID", "PARAMETER_DESC", "VERIFIED_VALUE", "ADMISSION_NO",
            "VERIFIED_DATE", "PATIENT_ID"};

        String query = "SELECT PRM.COMPLETE_ORDER_NO, PRM.ORDER_DETAIL_ID,      \n"
                + "        CPT.DESCRIPTION      CPT_DESC,                       \n"
                + "        CP.ID                PARAMETER_ID,                   \n"
                + "        CP.DESCRIPTION       PARAMETER_DESC,                 \n"
                + "        PRD.VERIFIED_VALUE   VERIFIED_VALUE,                 \n"
                + "        IVM.ADMISSION_NO,                                    \n"
                + "        IVM.PATIENT_ID,                                      \n"
                + " MAX(TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY HH24:MI:SS')) VERIFIED_DATE\n"
                + "  FROM  " + Database.DCMS.pathologyResultMaster + " PRM,     \n"
                + "        " + Database.DCMS.pathologyResultDetail + " PRD,     \n"
                + "        " + Database.DCMS.CPT + " CPT,                       \n"
                + "        " + Database.DCMS.CPTParameter + " CP,               \n"
                + "        " + Database.DCMS.invoiceMaster + " IVM              \n"
                + " WHERE  PRM.PATIENT_ID  = '" + patientId + "'                \n"
                + "   AND IVM.ADMISSION_NO = '" + admissionNumber + "'          \n"
                + "   AND PRD.PARAMETER_ID NOT IN ( SELECT PARAMETER_ID FROM "
                + Database.DCMS.patientWiseSelectedParameters + "               \n"
                + " WHERE PATIENT_ID  = '" + patientId + "'                     \n"
                + "   AND ADMISSION_NO = '" + admissionNumber + "' )            \n";
                if(parameterId.length() != 0){
                    query += "   AND PRD.PARAMETER_ID = '" + parameterId + "'   \n";
                }
                query += "   AND PRM.COMPLETE_ORDER_NO = PRD.COMPLETE_ORDER_NO  \n"
                + "   AND PRM.ORDER_DETAIL_ID = PRD.ORDER_DETAIL_ID             \n"
                + "   AND PRD.COMPLETE_ORDER_NO = IVM.COMPLETE_ORDER_NO         \n"
                + "   AND PRM.PATIENT_ID = IVM.PATIENT_ID                       \n"
                + "   AND PRM.ORDER_STATUS_ID = "+ Status.verified +"           \n"
                + "   AND PRM.CPT_ID = CPT.CPT_ID                               \n"
                + "   AND PRD.PARAMETER_ID = CP.ID                              \n"
                + "   AND PRD.VERIFIED_VALUE IS NOT NULL                        \n"
                + "   AND PRM.VERIFIED_DATE IN ( SELECT MAX(PR.VERIFIED_DATE) FROM \n"
                + Database.DCMS.pathologyResultMaster + " PR,                  \n"
                + Database.DCMS.pathologyResultDetail + " PD,                  \n"
                + Database.DCMS.invoiceMaster         + " IV                    \n"
                + " WHERE PR.PATIENT_ID  = '" + patientId + "'                 \n"
                + " AND IV.ADMISSION_NO  = '" + admissionNumber + "'            \n"
                + " AND PR.COMPLETE_ORDER_NO = PD.COMPLETE_ORDER_NO           \n"
                + " AND PR.ORDER_DETAIL_ID = PD.ORDER_DETAIL_ID               \n"
                + " AND PR.PATIENT_ID = IV.PATIENT_ID                          \n"
                + " AND PR.COMPLETE_ORDER_NO = IV.COMPLETE_ORDER_NO            \n"
                + " GROUP BY PR.CPT_ID)                                        \n"
                + " GROUP BY CPT.DESCRIPTION, CP.DESCRIPTION, PRM.COMPLETE_ORDER_NO, \n"
                + " PRM.ORDER_DETAIL_ID, PRD.VERIFIED_VALUE, IVM.ADMISSION_NO,  \n"
                + " CP.ID, IVM.PATIENT_ID                                       \n"
                + " ORDER BY CPT.DESCRIPTION                                    \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        for (HashMap map : lis) {

            PatientHospitalVisit objParameter = new PatientHospitalVisit();
            objParameter.setCON(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setODI(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setCptDescription(map.get("CPT_DESC").toString());
            objParameter.setParameterId(map.get("PARAMETER_ID").toString());
            objParameter.setParameterDescription(map.get("PARAMETER_DESC").toString());
            objParameter.setResultValue(map.get("VERIFIED_VALUE").toString());
            objParameter.setVerifiedtDate(map.get("VERIFIED_DATE").toString());
            objParameter.setAdmissionNumber(map.get("ADMISSION_NO").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            listParameter.add(objParameter);
        }
        return ret;
    }
    
    public boolean patientPerformedParametersCTR(String patientId, 
            String admissionNumber, String parameterId) {
        boolean ret = true;
        String colums[] = {"-", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "CPT_DESC",
            "PARAMETER_ID", "PARAMETER_DESC", "VERIFIED_VALUE", "ADMISSION_NO",
            "VERIFIED_DATE", "PATIENT_ID"};

        String query = "SELECT PRM.COMPLETE_ORDER_NO, PRM.ORDER_DETAIL_ID,      \n"
                + "        CPT.DESCRIPTION      CPT_DESC,                       \n"
                + "        CP.ID                PARAMETER_ID,                   \n"
                + "        CP.DESCRIPTION       PARAMETER_DESC,                 \n"
                + "        DBMS_LOB.substr(PRD.RESULT, 3000)  VERIFIED_VALUE,   \n"
                + "        IVM.ADMISSION_NO,                                    \n"
                + "        IVM.PATIENT_ID,                                      \n"
                + " MAX(TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY HH24:MI:SS')) VERIFIED_DATE\n"
                + "  FROM  " + Database.DCMS.pathologyResultMaster + " PRM,     \n"
                + "        " + Database.DCMS.CPTTextReporting      + " PRD,     \n"
                + "        " + Database.DCMS.CPT                   + " CPT,     \n"
                + "        " + Database.DCMS.CPTParameter          + " CP,      \n"
                + "        " + Database.DCMS.invoiceMaster         + " IVM      \n"
                + " WHERE  PRM.PATIENT_ID  = '" + patientId + "'                \n"
                + "   AND IVM.ADMISSION_NO = '" + admissionNumber + "'          \n"
                + "   AND PRD.PARAMETER_ID NOT IN ( SELECT PARAMETER_ID FROM "
                + Database.DCMS.patientWiseSelectedParameters + "               \n"
                + " WHERE PATIENT_ID  = '" + patientId + "'                     \n"
                + "   AND ADMISSION_NO = '" + admissionNumber + "' )            \n";
                if(parameterId.length() != 0){
                    query += "   AND PRD.PARAMETER_ID = '" + parameterId + "'   \n";
                }
                
                query += "   AND PRM.COMPLETE_ORDER_NO = PRD.COMPLETE_ORDER_NO         \n"
                + "   AND PRM.ORDER_DETAIL_ID = PRD.ORDER_DETAIL_ID             \n"
                + "   AND PRD.COMPLETE_ORDER_NO = IVM.COMPLETE_ORDER_NO         \n"
                + "   AND PRM.PATIENT_ID = IVM.PATIENT_ID                       \n"
                + "   AND PRM.ORDER_STATUS_ID = "+ Status.verified +"           \n"
                + "   AND PRM.CPT_ID = CPT.CPT_ID                               \n"
                + "   AND PRD.PARAMETER_ID = CP.ID                              \n"
                + "   AND PRD.RESULT IS NOT NULL                                \n"
                + "   AND PRM.VERIFIED_DATE IN ( SELECT MAX(PR.VERIFIED_DATE) FROM \n"
                + Database.DCMS.pathologyResultMaster + " PR,                   \n"
                + Database.DCMS.CPTTextReporting      + " CT,                   \n"
                + Database.DCMS.invoiceMaster         + " IV                    \n"
                + " WHERE PR.PATIENT_ID  = '" + patientId + "'                  \n"
                + " AND IV.ADMISSION_NO  = '" + admissionNumber + "'            \n"
                + " AND PR.COMPLETE_ORDER_NO = CT.COMPLETE_ORDER_NO             \n"
                + " AND PR.ORDER_DETAIL_ID = CT.ORDER_DETAIL_ID                 \n"
                + " AND PR.PATIENT_ID = IV.PATIENT_ID                           \n"
                + " AND PR.COMPLETE_ORDER_NO = IV.COMPLETE_ORDER_NO             \n"
                + " GROUP BY PR.CPT_ID)                                         \n"
                + " GROUP BY CPT.DESCRIPTION, CP.DESCRIPTION, PRM.COMPLETE_ORDER_NO, \n"
                + " PRM.ORDER_DETAIL_ID, DBMS_LOB.substr(PRD.RESULT, 3000),     \n"
                + " IVM.ADMISSION_NO, CP.ID, IVM.PATIENT_ID                                       \n"
                + " ORDER BY CPT.DESCRIPTION                                    \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        for (HashMap map : lis) {

            PatientHospitalVisit objParameter = new PatientHospitalVisit();
            objParameter.setCON(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setODI(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setCptDescription(map.get("CPT_DESC").toString());
            objParameter.setParameterId(map.get("PARAMETER_ID").toString());
            objParameter.setParameterDescription(map.get("PARAMETER_DESC").toString());
            objParameter.setResultValue(map.get("VERIFIED_VALUE").toString());
            objParameter.setVerifiedtDate(map.get("VERIFIED_DATE").toString());
            objParameter.setAdmissionNumber(map.get("ADMISSION_NO").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            listParameter.add(objParameter);
        }
        return ret;
    }
    
    public List<PatientHospitalVisit> patientPerformedParametersSRD(String patientId,
            String admissionNumber, String parameterId) {
        System.err.println("\n PRD: " + listParameter.size());
        String colums[] = {"-", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "CPT_DESC",
            "PARAMETER_ID", "PARAMETER_DESC", "VERIFIED_VALUE", "ADMISSION_NO",
            "VERIFIED_DATE", "PATIENT_ID"};

        String query = "SELECT PRM.COMPLETE_ORDER_NO, PRM.ORDER_DETAIL_ID,      \n"
                + "        CPT.DESCRIPTION      CPT_DESC,                       \n"
                + "        CP.ID                PARAMETER_ID,                   \n"
                + "        CP.DESCRIPTION       PARAMETER_DESC,                 \n"
                + "        PRD.RESULT_VALUE     VERIFIED_VALUE,                 \n"
                + "        IVM.ADMISSION_NO,                                    \n"
                + "        IVM.PATIENT_ID,                                      \n"
                + " MAX(TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY HH24:MI:SS')) VERIFIED_DATE\n"
                + "  FROM  " + Database.DCMS.pathologyResultMaster + "     PRM, \n"
                + "        " + Database.DCMS.pathSeriologyResultDetail + " PRD, \n"
                + "        " + Database.DCMS.CPT + " CPT,                       \n"
                + "        " + Database.DCMS.CPTParameter + " CP,                \n"
                + "        " + Database.DCMS.invoiceMaster + " IVM                \n"
                + " WHERE  PRM.PATIENT_ID  = '" + patientId + "'                 \n"
                + "   AND IVM.ADMISSION_NO = '" + admissionNumber + "'           \n"
                + "   AND PRD.PARAMETER_ID NOT IN ( SELECT PARAMETER_ID FROM "
                + Database.DCMS.patientWiseSelectedParameters + "               \n"
                + " WHERE PATIENT_ID  = '" + patientId + "'                     \n"
                + "   AND ADMISSION_NO = '" + admissionNumber + "' )            \n";
                if(parameterId.length() != 0){
                    query += "   AND PRD.PARAMETER_ID = '" + parameterId + "'   \n";
                }
                
                query += "   AND PRM.COMPLETE_ORDER_NO = PRD.COMPLETE_ORDER_NO  \n"
                + "   AND PRM.ORDER_DETAIL_ID = PRD.ORDER_DETAIL_ID             \n"
                + "   AND PRD.COMPLETE_ORDER_NO = IVM.COMPLETE_ORDER_NO         \n"
                + "   AND PRM.PATIENT_ID = IVM.PATIENT_ID                       \n"
                + "   AND PRM.ORDER_STATUS_ID = "+ Status.verified +"           \n"
                + "   AND PRM.CPT_ID = CPT.CPT_ID                               \n"
                + "   AND PRD.PARAMETER_ID = CP.ID                              \n"
                + "   AND PRD.RESULT_VALUE IS NOT NULL                          \n"
                + "   AND PRM.VERIFIED_DATE IN ( SELECT MAX(P.VERIFIED_DATE) FROM \n"
                + Database.DCMS.pathologyResultMaster       + " P,              \n"
                + Database.DCMS.pathSeriologyResultDetail   + " PR,             \n"
                + Database.DCMS.invoiceMaster               + " IV              \n"
                + " WHERE P.PATIENT_ID  = '" + patientId + "'                   \n"
                + " AND IV.ADMISSION_NO = '" + admissionNumber + "'             \n"
                + " AND P.COMPLETE_ORDER_NO = PR.COMPLETE_ORDER_NO              \n"
                + " AND P.ORDER_DETAIL_ID = PR.ORDER_DETAIL_ID                  \n"
                + " AND P.PATIENT_ID = IV.PATIENT_ID                            \n"
                + " AND PR.COMPLETE_ORDER_NO = IV.COMPLETE_ORDER_NO             \n"
                + " GROUP BY P.CPT_ID)                                          \n"
                + " GROUP BY CPT.DESCRIPTION, CP.DESCRIPTION, PRM.COMPLETE_ORDER_NO, \n"
                + " PRM.ORDER_DETAIL_ID, PRD.RESULT_VALUE, IVM.ADMISSION_NO,    \n"
                + " CP.ID, IVM.PATIENT_ID                                      \n"
                + " ORDER BY CPT.DESCRIPTION                                    \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        for (HashMap map : lis) {

            PatientHospitalVisit objParameter = new PatientHospitalVisit();
            objParameter.setCON(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setODI(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setCptDescription(map.get("CPT_DESC").toString());
            objParameter.setParameterId(map.get("PARAMETER_ID").toString());
            objParameter.setParameterDescription(map.get("PARAMETER_DESC").toString());
            objParameter.setResultValue(map.get("VERIFIED_VALUE").toString());
            objParameter.setVerifiedtDate(map.get("VERIFIED_DATE").toString());
            objParameter.setAdmissionNumber(map.get("ADMISSION_NO").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            listParameter.add(objParameter);
        }
        System.err.println("\n SRD: " + listParameter.size());
        return listParameter;
    }
    
    public List<PatientHospitalVisit> patientWiseSelectedParameter(String patientId,
            String admissionNumber) {

        String colums[] = {"-", "ADMISSION_NO","PATIENT_ID", "COMPLETE_ORDER_NO", 
            "ORDER_DETAIL_ID", "PARAMETER_ID", "PARAMETER_NAME", "VERIFIED_DATE",
            "RESULT", "CRTD_BY", "CRTD_TERMINAL_ID", "CRTD_DATE"};
        
        String query = " SELECT PSP.ADMISSION_NO,                           \n"
                + "        PSP.PATIENT_ID,                                  \n"
                + "        PSP.COMPLETE_ORDER_NO,                           \n"
                + "        PSP.ORDER_DETAIL_ID,                             \n"
                + "        PSP.PARAMETER_ID,                                \n"
                + "        CP.DESCRIPTION PARAMETER_NAME,                   \n"
                + " TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY HH24:MI:SS') VERIFIED_DATE,\n"
                + "        PSP.RESULT,                                      \n"
                + "        PSP.CRTD_BY,                                     \n"
                + "        PSP.CRTD_TERMINAL_ID,                            \n"
                + "        PSP.CRTD_DATE                           FROM     \n"
                + Database.DCMS.patientWiseSelectedParameters + "  PSP,     \n"
                + Database.DCMS.pathologyResultMaster + " PRM,              \n"
                + Database.DCMS.CPTParameter + " CP                         \n"
                + " WHERE PSP.PATIENT_ID = '"+ patientId +"'                \n"
                + " AND PSP.ADMISSION_NO = '"+ admissionNumber +"'          \n"
                + " AND PSP.COMPLETE_ORDER_NO = PRM.COMPLETE_ORDER_NO       \n"
                + " AND PSP.ORDER_DETAIL_ID = PRM.ORDER_DETAIL_ID           \n"
                + " AND PSP.PARAMETER_ID = CP.ID                            \n"
                + " ORDER BY CP.DESCRIPTION                                 \n";
 
        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<PatientHospitalVisit> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            PatientHospitalVisit objParameter = new PatientHospitalVisit();
            
            objParameter.setAdmissionNumber(map.get("ADMISSION_NO").toString());
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setCON(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setODI(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setParameterId(map.get("PARAMETER_ID").toString());
            objParameter.setParameterDescription(map.get("PARAMETER_NAME").toString());
            objParameter.setVerifiedtDate(map.get("VERIFIED_DATE").toString());
            objParameter.setResultValue(map.get("RESULT").toString());
            objParameter.setCrtdBy(map.get("CRTD_BY").toString());
            objParameter.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            objParameter.setCrtdDate(map.get("CRTD_DATE").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }
    
    public boolean deleteUsersParameter(String patientId, String admissionNumber) {
        String query
                = "  DELETE FROM " + Database.DCMS.patientWiseSelectedParameters
                + "   WHERE PATIENT_ID = '"+ patientId +"'                      \n"
                + "     AND ADMISSION_NO = '"+ admissionNumber +"'              \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean insertSelectedParameters(List<PatientHospitalVisit> listSave) {

        String[] columns = {Database.DCMS.patientWiseSelectedParameters, 
            "ADMISSION_NO", "PATIENT_ID", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID",
            "PARAMETER_ID", "RESULT", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listSave.size(); i++) {
            PatientHospitalVisit objSave = listSave.get(i);
            HashMap insertFormAttach = new HashMap();
            insertFormAttach.put("ADMISSION_NO", "'" + objSave.getAdmissionNumber()+ "'");
            insertFormAttach.put("PATIENT_ID", "'" + objSave.getPatientId()+ "'");
            insertFormAttach.put("COMPLETE_ORDER_NO", "'" + objSave.getCON()+ "'");
            insertFormAttach.put("ORDER_DETAIL_ID", "'" + objSave.getODI()+ "'");
            insertFormAttach.put("PARAMETER_ID", "'" + objSave.getParameterId() + "'");
            insertFormAttach.put("RESULT", "'" + objSave.getResultValue()+ "'");
            insertFormAttach.put("CRTD_BY", "'" + Constants.userId + "'");
            insertFormAttach.put("CRTD_DATE", "SYSDATE");
            insertFormAttach.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            lstInr.add(insertFormAttach);
        }
        return Constants.dao.insertData(lstInr, columns);
    }
    
    public List<PatientHospitalVisit> pathUrineDR(String patientId,
            String admissionNumber) {

        String colums[] = {"-", "COMPLETE_ORDER_NO","ORDER_DETAIL_ID", "COLOR", 
            "APPEARANCE", "PH", "SPECIFIC_GRAVITY", "PROTEIN", "GLUCOSE", "ACETONE", 
            "BILE_PIGMENT", "BLOOD", "UROBILINOGEN", "NITRITE", "PUS_CELL", "RED_CELL", 
            "CAST_DR", "EPITHELIEL_CELL", "BACTERIA", "YEAST", "CRYSTAL", "MUCUS"};
        
        String query = " SELECT PUD.COMPLETE_ORDER_NO, PUD.ORDER_DETAIL_ID,     \n"
                + "  NVL(PUD.COLOR, 'N/A')              COLOR,                  \n"
                + " NVL(PUD.APPEARANCE, 'N/A')          APPEARANCE,             \n"
                + " NVL(PUD.PH, 'N/A')                  PH,                     \n"
                + " NVL(PUD.SPECIFIC_GRAVITY, 'N/A')    SPECIFIC_GRAVITY,       \n"
                + " NVL(PUD.PROTEIN, 'N/A')             PROTEIN,                \n"
                + " NVL(PUD.GLUCOSE, 'N/A')             GLUCOSE,                \n"
                + " NVL(PUD.ACETONE, 'N/A')             ACETONE,                \n"
                + " NVL(PUD.BILE_PIGMENT, 'N/A')        BILE_PIGMENT,           \n"
                + " NVL(PUD.BLOOD, 'N/A')               BLOOD,                  \n"
                + " NVL(PUD.UROBILINOGEN, 'N/A')        UROBILINOGEN,           \n"
                + " NVL(PUD.NITRITE, 'N/A')             NITRITE,                \n"
                + " NVL(PUD.PUS_CELL, 'N/A')            PUS_CELL,               \n"
                + " NVL(PUD.RED_CELL, 'N/A')            RED_CELL,               \n"
                + " NVL(PUD.CAST_DR, 'N/A')             CAST_DR,                \n"
                + " NVL(PUD.EPITHELIEL_CELL, 'N/A')     EPITHELIEL_CELL,        \n"
                + " NVL(PUD.BACTERIA, 'N/A')            BACTERIA,               \n"
                + " NVL(PUD.YEAST, 'N/A')               YEAST,                  \n"
                + " NVL(PUD.CRYSTAL, 'N/A')             CRYSTAL,                \n"
                + " NVL(PUD.MUCUS,   'N/A')             MUCUS         FROM      \n"
                + Database.DCMS.urineDr               + "  PUD,                 \n"
                + Database.DCMS.pathologyResultMaster + " PRM,                  \n"
                + Database.DCMS.CPT                   + " CPT,                  \n"
                + Database.DCMS.invoiceMaster         + " IVM                   \n"
                + " WHERE PRM.PATIENT_ID = '"+ patientId +"'                    \n"
                + " AND IVM.ADMISSION_NO = '"+ admissionNumber +"'              \n"
                + " AND PRM.COMPLETE_ORDER_NO = PUD.COMPLETE_ORDER_NO           \n"
                + " AND PRM.ORDER_DETAIL_ID = PUD.ORDER_DETAIL_ID               \n"
                + " AND PUD.COMPLETE_ORDER_NO = IVM.COMPLETE_ORDER_NO           \n"
                + " AND PRM.PATIENT_ID = IVM.PATIENT_ID                         \n"
                + " AND PRM.ORDER_STATUS_ID = 12                                \n"
                + " AND PRM.CPT_ID = CPT.CPT_ID                                 \n"
                + " AND PRM.VERIFIED_DATE IN (SELECT MAX(PR.VERIFIED_DATE) FROM \n"
                + Database.DCMS.pathologyResultMaster + " PR,                   \n"
                + Database.DCMS.urineDr               + " CT,                   \n"
                + Database.DCMS.invoiceMaster         + " IV                    \n"
                + " WHERE PR.PATIENT_ID = '" + patientId + "'                   \n"
                + " AND IV.ADMISSION_NO = '" + admissionNumber + "'             \n"
                + " AND PR.COMPLETE_ORDER_NO = CT.COMPLETE_ORDER_NO             \n"
                + " AND PR.ORDER_DETAIL_ID = CT.ORDER_DETAIL_ID                 \n"
                + " AND PR.PATIENT_ID = IV.PATIENT_ID                           \n"
                + " AND PR.COMPLETE_ORDER_NO = IV.COMPLETE_ORDER_NO             \n"
                + " GROUP BY PR.CPT_ID)                                         \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<PatientHospitalVisit> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            PatientHospitalVisit objParameter = new PatientHospitalVisit();
            
            objParameter.setCON(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setODI(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setColor(map.get("COLOR").toString());
            objParameter.setAppearance(map.get("APPEARANCE").toString());
            objParameter.setpH(map.get("PH").toString());
            objParameter.setSpecificGravity(map.get("SPECIFIC_GRAVITY").toString());
            objParameter.setProtein(map.get("PROTEIN").toString());
            objParameter.setGlucose(map.get("GLUCOSE").toString());
            objParameter.setAcetone(map.get("ACETONE").toString());
            objParameter.setBilePigment(map.get("BILE_PIGMENT").toString());
            objParameter.setBlood(map.get("BLOOD").toString());
            objParameter.setUrobilinogen(map.get("UROBILINOGEN").toString());
            objParameter.setNitrite(map.get("NITRITE").toString());
            objParameter.setPusCell(map.get("PUS_CELL").toString());
            objParameter.setRedCell(map.get("RED_CELL").toString());
            objParameter.setCastDr(map.get("CAST_DR").toString());
            objParameter.setEpithelielCell(map.get("EPITHELIEL_CELL").toString());
            objParameter.setBacteria(map.get("BACTERIA").toString());
            objParameter.setYeast(map.get("YEAST").toString());
            objParameter.setCrystal(map.get("CRYSTAL").toString());
            objParameter.setMucus(map.get("MUCUS").toString());
            listParameter.add(objParameter);
        }
        return listParameter;
    }
}


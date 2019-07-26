/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.POF;

import BO.POF.ParameterResultsSearchBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class ParameterResultsSearchHandler {

    public List<ParameterResultsSearchBO> patientPerformedParametersPRD(
            String fromResult, String toResult, String parameterId) {

        String colums[] = {"-", "PATIENT_ID", "FULL_NAME", "AGE", "GENDER_ID",
            "GENDER_DESC", "CLIENT_ID", "CPT_ID", "CLIENT_DESC",
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "CPT_DESC", "PARAMETER_ID",
            "PARAMETER_DESC", "VERIFIED_VALUE", "VERIFIED_DATE"};

        String query
                = "SELECT PAT.PATIENT_ID,\n"
                + "       PAT.FULL_NAME,\n"
                + "       PAT.AGE,\n"
                + "       PAT.GENDER_ID,\n"
                + "       GEN.DESCRIPTION GENDER_DESC,\n"
                + "       PAT.CLIENT_ID,\n"
                + "       CLI.DESCRIPTION CLIENT_DESC,\n"
                + "       PRM.COMPLETE_ORDER_NO,\n"
                + "       PRM.ORDER_DETAIL_ID,\n"
                + "       PRM.CPT_ID,\n"
                + "       CPT.DESCRIPTION CPT_DESC,\n"
                + "       CP.ID PARAMETER_ID,\n"
                + "       CP.DESCRIPTION PARAMETER_DESC,\n"
                + "       PRD.VERIFIED_VALUE VERIFIED_VALUE,\n"
                + "       TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY HH24:MI:SS') VERIFIED_DATE\n"
                + "  FROM EMR.PATIENT                 PAT,\n"
                + "       EMR.PATHOLOGY_RESULT_MASTER PRM,\n"
                + "       EMR.PATHOLOGY_RESULT_DETAIL PRD,\n"
                + "       EMR.CPT                     CPT,\n"
                + "       EMR.CPT_PARAMETER           CP,\n"
                + "       EMR.DEFINITION_TYPE_DETAIL  GEN,\n"
                + "       EMR.CLIENT                  CLI\n"
                + " WHERE PRD.PARAMETER_ID = " + parameterId + "\n"
                + "   and TRUNC(PRM.VERIFIED_DATE) BETWEEN '10-JAN-18' AND '15-JAN-18'\n"
                + "   AND PRD.VERIFIED_VALUE BETWEEN '" + fromResult + "' AND '"
                + toResult + "'\n"
                + "   AND PRM.COMPLETE_ORDER_NO = PRD.COMPLETE_ORDER_NO\n"
                + "   AND PRM.ORDER_DETAIL_ID = PRD.ORDER_DETAIL_ID\n"
                + "   AND PRM.ORDER_STATUS_ID = 12\n"
                + "   AND PRM.CPT_ID = CPT.CPT_ID\n"
                + "   AND PRD.PARAMETER_ID = CP.ID\n"
                + "   AND PRM.PATIENT_ID = PAT.PATIENT_ID\n"
                + "   AND PAT.GENDER_ID = GEN.ID\n"
                + "   AND PAT.CLIENT_ID = CLI.ID\n"
                + "   AND PRD.VERIFIED_VALUE IS NOT NULL\n"
                + " ORDER BY CPT.DESCRIPTION                                \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<ParameterResultsSearchBO> listParameter = new ArrayList<>();
        for (HashMap map : lis) {
            ParameterResultsSearchBO objParameter = new ParameterResultsSearchBO();
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setPatientId(map.get("FULL_NAME").toString());
            objParameter.setPatientName(map.get("AGE").toString());
            objParameter.setGenderId(map.get("GENDER_ID").toString());
            objParameter.setGenderDescription(map.get("GENDER_DESC").toString());
            objParameter.setClientId(map.get("CLIENT_ID").toString());
            objParameter.setClientDescription(map.get("CLIENT_DESC").toString());
            objParameter.setCptId(map.get("CPT_ID").toString());
            objParameter.setCptDescription(map.get("CPT_DESC").toString());
            objParameter.setCon(map.get("COMPLETE_ORDER_NO").toString());
            objParameter.setOdi(map.get("ORDER_DETAIL_ID").toString());
            objParameter.setParameterId(map.get("PARAMETER_ID").toString());
            objParameter.setParameterDescription(map.get("PARAMETER_DESC").toString());
            objParameter.setResultValue(map.get("VERIFIED_VALUE").toString());
            objParameter.setVerifiedtDate(map.get("VERIFIED_DATE").toString());

            listParameter.add(objParameter);
        }
        return listParameter;
    }
}

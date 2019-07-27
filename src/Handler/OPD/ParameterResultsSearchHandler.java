/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.OPD;

import BO.OPD.ParameterResultsSearchBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;
import utilities.Status;

/**
 *
 * @author raheelansari
 */
public class ParameterResultsSearchHandler {

    public List<ParameterResultsSearchBO> patientPerformedParametersPRD(
            ParameterResultsSearchBO SearchObj) {

        String colums[] = {"-", "PATIENT_ID", "FULL_NAME", "AGE", "GENDER_ID",
            "GENDER_DESC", "CLIENT_ID", "CPT_ID", "CLIENT_DESC",
            "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", "CPT_DESC", "PARAMETER_ID",
            "PARAMETER_DESC", "VERIFIED_VALUE", "VERIFIED_DATE"};

        String query = 
                  "SELECT PAT.PATIENT_ID,                                       \n"
                + "       PAT.FULL_NAME,                                        \n"
                + "       PAT.AGE,                                              \n"
                + "       PAT.GENDER_ID,                                        \n"
                + "       GEN.DESCRIPTION GENDER_DESC,                          \n"
                + "       PAT.CLIENT_ID,                                        \n"
                + "       CLI.DESCRIPTION CLIENT_DESC,                          \n"
                + "       PRM.COMPLETE_ORDER_NO,                                \n"
                + "       PRM.ORDER_DETAIL_ID,                                  \n"
                + "       PRM.CPT_ID,                                           \n"
                + "       CPT.DESCRIPTION CPT_DESC,                             \n"
                + "       CP.ID PARAMETER_ID,                                   \n"
                + "       CP.DESCRIPTION PARAMETER_DESC,                        \n"
                + "       PRD.VERIFIED_VALUE VERIFIED_VALUE,                    \n"
                + "       TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY HH24:MI:SS') VERIFIED_DATE\n"
                + "  FROM " + Database.DCMS.patient + "   PAT,                  \n"
                + Database.DCMS.pathologyResultMaster + " PRM,                  \n"
                + Database.DCMS.pathologyResultDetail + " PRD,                  \n"
                + Database.DCMS.invoiceMaster + " IVM,                          \n"
                + Database.DCMS.invoiceDetail + " IVD,                          \n"
                + Database.DCMS.CPT + " CPT,                                    \n"
                + Database.DCMS.CPTParameter + " CP,                            \n"
                + Database.DCMS.definitionTypeDetail + "  GEN,                  \n"
                + Database.DCMS.client + " CLI                                  \n";
                if(SearchObj.getToDate().length() !=0){
                    query += " WHERE IVM.TRN_DATE BETWEEN '"+ SearchObj.getFromDate()
                            +"' AND '" + SearchObj.getToDate() +"'              \n";
                }else{
                    query += " WHERE IVM.TRN_DATE > SYSDATE - 1                 \n";
                }
                query += "   AND IVD.DEPARTMENT_ID = "+ Departments.pathology +"\n"
                + "   AND IVM.INVOICE_NO = IVD.INVOICE_NO                       \n"
                + "   AND IVM.COMPLETE_ORDER_NO = PRM.COMPLETE_ORDER_NO         \n"
                + "   AND IVD.COMPLETE_ORDER_NO = PRM.COMPLETE_ORDER_NO         \n"
                + "   AND IVD.ORDER_DETAIL_ID = PRM.ORDER_DETAIL_ID             \n"
                + "   AND IVD.COMPLETE_ORDER_NO = PRD.COMPLETE_ORDER_NO         \n"
                + "   AND IVD.ORDER_DETAIL_ID = PRD.ORDER_DETAIL_ID             \n"
                + "   AND PRM.COMPLETE_ORDER_NO = PRD.COMPLETE_ORDER_NO         \n"
                + "   AND PRM.ORDER_DETAIL_ID = PRD.ORDER_DETAIL_ID             \n"
                + "   AND PRM.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + "   AND IVM.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + "   AND PRM.CPT_ID = IVD.CPT_ID                               \n"
                + "   AND PRM.LOCATION_ID = IVM.LOCATION_ID                     \n"
                + "   AND PRD.PARAMETER_ID = CP.ID                              \n"
                + "   AND CP.ID = "+ SearchObj.getParameterId() +"              \n"
                + "   AND PRM.ORDER_STATUS_ID = "+ Status.verified +"           \n"
                + "   AND PRD.VERIFIED_VALUE >="+ SearchObj.getFromResult() 
                + "   AND PRD.VERIFIED_VALUE <="+ SearchObj.getToResult() +"    \n";
                if(SearchObj.getToAge().length() !=0){
                    query += " AND  TRUNC((SYSDATE - PAT.DOB)/ 365.25)  >="
                            + SearchObj.getFromAge() +"                         \n"
                            + " AND TRUNC((SYSDATE - PAT.DOB)/ 365.25)  <= " 
                            + SearchObj.getToAge()+"                            \n";
                }        
                if(SearchObj.getGenderId().length() !=0){
                    query += " AND GEN.ID = " + SearchObj.getGenderId()+"       \n";
                }
                if(SearchObj.getBgId().length() !=0){
                    query += " AND PAT.BLOOD_GROUP_ID = " + SearchObj.getBgId()+"\n";
                }
                if(SearchObj.getClientId().length() !=0){
                    query += " AND CLI.ID = " + SearchObj.getClientId()+"       \n";
                }
                query += "   AND PRM.CPT_ID = CPT.CPT_ID                        \n"
                + "   AND PAT.GENDER_ID = GEN.ID                                \n"
                + "   AND PAT.CLIENT_ID = CLI.ID                                \n"
                + "   AND PRD.VERIFIED_VALUE IS NOT NULL                        \n"
                + " ORDER BY CPT.DESCRIPTION                                    \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<ParameterResultsSearchBO> listParameter = new ArrayList<>();
        for (HashMap map : lis) {
            ParameterResultsSearchBO objParameter = new ParameterResultsSearchBO();
            objParameter.setPatientId(map.get("PATIENT_ID").toString());
            objParameter.setPatientName(map.get("FULL_NAME").toString());
            objParameter.setAge(map.get("AGE").toString());
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

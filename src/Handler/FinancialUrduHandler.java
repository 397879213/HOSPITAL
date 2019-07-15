/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.Patient;
import java.util.HashMap;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Pacslink
 */
public class FinancialUrduHandler {

      public Patient searchPatient(String patientId) {

        String c[] = {"-", "PATIENT_ID", "FULL_NAME", "TYPE", "GENDER", "AGE",
            "LOCATION", "CLIENT_ID", "CONTACT_NO", "PATIENT_STATUS_ID", "OLD_MRNO",
            "PATIENT_STATUS", "CLIENT_NAME", "TRANSACTION_TYPE", "SELECT_IT",
            "INFO_UPDATED"};
        String query
                = " SELECT P.PATIENT_STATUS_ID , P.PATIENT_ID, G.DESCRIPTION GENDER,"
                + " NVL(P.OLD_MRNO, ' ')OLD_MRNO, P.FULL_NAME,T.DESCRIPTION TYPE, "
                + " L.DESCRIPTION LOCATION, PS.DESCRIPTION PATIENT_STATUS,\n"
                + " ROUND(MONTHS_BETWEEN(SYSDATE,P.DOB )/12)||' Y' AGE , "
                + " P.CLIENT_ID , P.CONTACT_NO CONTACT_NO, CLT.DESCRIPTION \n"
                + " CLIENT_NAME, CLT.TRANSACTION_TYPE, CLT.SELECT_IT, INFO_UPDATED \n"
                + " FROM  \n"
                + Database.DCMS.patient + " P,              \n"
                + Database.DCMS.patientType + " T,          \n"
                + Database.DCMS.patientStatus + " PS,       \n"
                + Database.DCMS.location + " L,             \n"
                + Database.DCMS.client + " CLT,             \n"
                + Database.DCMS.gender + " G                \n"
                + " WHERE P.PATIENT_ID='" + patientId + "'  \n"
                + " AND P.ACTIVE = 'Y'                      \n"
                + " AND P.PATIENT_TYPE_ID = T.ID            \n"
                + " AND P.CLIENT_ID = CLT.ID                \n"
                + " AND P.PATIENT_STATUS_ID = PS.ID         \n"
                + " AND P.LOCATION_ID = L.ID                \n"
                + " AND P.GENDER_ID = G.ID ";

        return getPatientInfo(Constants.dao.selectData(query, c));
    }

    public Patient getPatientInfo(Vector vec) {

        Patient patient = new Patient();
        if (vec.size() == 1) {
            HashMap hashRow = (HashMap) vec.get(0);
            patient.setPatientId(hashRow.get("PATIENT_ID").toString());
            patient.setFullName(hashRow.get("FULL_NAME").toString());
            patient.setPatientStatusId(hashRow.get("PATIENT_STATUS_ID").toString());
            patient.setPatientInfoUpdated(hashRow.get("INFO_UPDATED").toString());
            patient.setPatientStatus(hashRow.get("PATIENT_STATUS").toString());
            patient.setGenderDescription(hashRow.get("GENDER").toString());
            patient.setOldMRNO(hashRow.get("OLD_MRNO").toString());
            patient.setAge(hashRow.get("AGE").toString());
            patient.setContactNo(hashRow.get("CONTACT_NO").toString());
            patient.setLocationDescription(hashRow.get("LOCATION").toString());
            Constants.completePatientClientId = hashRow.get("CLIENT_ID").toString();
            patient.setClientId(hashRow.get("CLIENT_ID").toString());
            patient.setClientDescription(hashRow.get("CLIENT_NAME").toString());
            patient.setClientTransactionType(hashRow.get("TRANSACTION_TYPE").toString());
            patient.setSelectIt(hashRow.get("SELECT_IT").toString());
        }
        return patient;
    }



}

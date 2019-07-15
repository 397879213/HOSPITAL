/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.Patient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import utilities.Constants;
import static utilities.DAO.conn;
import utilities.Database;

/**
 *
 * @author user
 */
public class PatientHandler {

    public Vector generalSearchPatient(Patient patient) {

        String c[] = {"-", "PATIENT_ID", "FIRST_NAME", "LAST_NAME", "AGE", "DOB",
            "TITLE_DESCRIPTION", "TITLE_ID", "GENDER_DESCRIPTION", "GENDER_ID",
            "MARITAL_STATUS_DESCRIPTION", "MARITAL_STATUS_ID", "FATHER_NAME",
            "HUSBAND_NAME", "BLOOD_GROUP_DESCRIPTION", "BLOOD_GROUP_ID",
            "RELIGION_DESCRIPTION", "RELIGION_ID", "PATIENT_TYPE_DESCRIPTION",
            "PATIENT_TYPE_ID", "CONTACT_NO", "EMERGENCY_CONTACT_NO",
            "EMAIL_ADDRESS", "CITY_DESCRIPTION", "CITY_ID", "ADDRESS", "CNIC",
            "LOCATION_DESCRIPTION", "LOCATION_ID", "CLIENT_DESCRIPTION",
            "CLIENT_ID", "COMPANY_DESCRIPTION", "COMPANY_ID", "OLD_MRNO", "PATIENT_UPDATE_ALLOW",
            "ATTACHED_MRNO", "REGISTRATION_DATE", "REGISTERED_BY", "INFO_UPDATED"};

        String query
                = " SELECT PATIENT_ID ,FIRST_NAME, NVL(LAST_NAME,'  ') "
                + " LAST_NAME, trunc(months_between(sysdate,dob)/12)||' Y '||"
                + " TRUNC(mod(months_between(sysdate,dob),12))|| ' M'  AGE , \n"
                + " TO_CHAR(DOB , 'DD-MM-YYYY') DOB ,CLIENT.PATIENT_UPDATE_ALLOW,\n"
                + " TITLE.DESCRIPTION TITLE_DESCRIPTION, TITLE.ID TITLE_ID ,\n"
                + " GENDER.DESCRIPTION GENDER_DESCRIPTION, GENDER.ID GENDER_ID,\n"
                + " MARITAL_STATUS.DESCRIPTION MARITAL_STATUS_DESCRIPTION,\n"
                + " MARITAL_STATUS.ID MARITAL_STATUS_ID, Pat.REGISTERED_BY, \n"
                + " NVL(FATHER_NAME, ' ') FATHER_NAME , INFO_UPDATED,\n"
                + " NVL(HUSBAND_NAME , ' ') HUSBAND_NAME, \n"
                + " NVL(ATTACHED_MRNO , ' ') ATTACHED_MRNO, \n"
                + " TO_CHAR(REGISTRATION_DATE , 'DD-MM-YY HH24:MI') REGISTRATION_DATE,"
                + " BLOOD_GROUP.DESCRIPTION BLOOD_GROUP_DESCRIPTION, \n"
                + " BLOOD_GROUP.ID BLOOD_GROUP_ID, \n"
                + " RELIGION.DESCRIPTION RELIGION_DESCRIPTION ,\n"
                + " RELIGION.ID RELIGION_ID, NVL(PAT.OLD_MRNO, ' ') OLD_MRNO, \n"
                + " PATIENT_TYPE.DESCRIPTION PATIENT_TYPE_DESCRIPTION,\n"
                + " PATIENT_TYPE.ID PATIENT_TYPE_ID ,  PAT.CONTACT_NO , \n"
                + " NVL(PAT.EMERGENCY_CONTACT_NO, ' ') EMERGENCY_CONTACT_NO,\n"
                + " NVL(PAT.EMAIL_ADDRESS,' ') EMAIL_ADDRESS, \n"
                + " CITY.DESCRIPTION CITY_DESCRIPTION, CITY.ID CITY_ID,\n"
                + " NVL(PAT.ADDRESS,'') ADDRESS, NVL(PAT.CNIC, ' ') CNIC , \n"
                + " LOCATION.DESCRIPTION LOCATION_DESCRIPTION,\n"
                + " LOCATION.ID LOCATION_ID, CLIENT.DESCRIPTION "
                + " CLIENT_DESCRIPTION,             \n"
                + " CLIENT.ID  CLIENT_ID , COMPANY.DESCRIPTION "
                + " COMPANY_DESCRIPTION , \n"
                + " COMPANY.ID COMPANY_ID FROM "
                + Database.DCMS.patient + " PAT ,                  \n"
                + Database.DCMS.title + " TITLE,                   \n"
                + Database.DCMS.gender + " GENDER,                 \n"
                + Database.DCMS.maritalStatus + " MARITAL_STATUS,  \n"
                + Database.DCMS.bloodGroup + " BLOOD_GROUP,        \n"
                + Database.DCMS.religion + " RELIGION,             \n"
                + Database.DCMS.patientType + " PATIENT_TYPE,      \n"
                + Database.DCMS.city + " ,                         \n"
                + Database.DCMS.client + " ,                       \n"
                + Database.DCMS.location + " ,                     \n"
                + Database.DCMS.company + "    COMPANY             \n";
        if (patient.getPatientId().trim().length() != 0) {
            query += " WHERE  PAT.PATIENT_ID = '" + patient.getPatientId().toUpperCase().trim() + "' \n";
        } else if (patient.getContactNo().trim().length() != 0) {
            query += " WHERE  PAT.CONTACT_NO = '" + patient.getContactNo().trim() + "' \n";
        } else if (patient.getFullName().trim().length() != 0) {
            query += " WHERE  PAT.FULL_NAME LIKE '%" + patient.getFullName().toUpperCase().trim() + "%' \n";
        } else if (patient.getCnic().trim().length() != 0) {
            query += " WHERE NVL(PAT.CNIC, ' ') LIKE '%" + patient.getCnic().trim().toUpperCase() + "%' \n";
        }
        query += " AND   PAT.ACTIVE = 'Y'                               \n"
                + " AND   PAT.TITLE_ID           = TITLE.ID             \n"
                + " AND   PAT.GENDER_ID          = GENDER.ID            \n"
                + " AND   PAT.MARITAL_STATUS_ID  = MARITAL_STATUS.ID    \n"
                + " AND   PAT.BLOOD_GROUP_ID     = BLOOD_GROUP.ID       \n"
                + " AND   PAT.RELIGION_ID        = RELIGION.ID          \n"
                + " AND   PAT.PATIENT_TYPE_ID    = PATIENT_TYPE.ID      \n"
                + " AND   PAT.CITY_ID            = CITY.ID              \n"
                + " AND   PAT.CLIENT_ID          = CLIENT.ID            \n"
                + " AND   PAT.LOCATION_ID        = LOCATION.ID          \n"
                + " AND   PAT.COMPANY_ID         = COMPANY.ID           \n";

        if (patient.getGenderId().trim().length() != 0 && !patient.getGenderId().trim().equalsIgnoreCase("LOV")) {
            query += " AND  PAT.GENDER_ID   = " + patient.getGenderId() + "       \n";
        }
        if (patient.getCnic().trim().length() != 0) {
            query += " AND NVL(PAT.CNIC, ' ') LIKE '%" + patient.getCnic().trim().toUpperCase() + "%' \n";
        }

        if (patient.getContactNo().trim().length() != 0) {
            query += " AND PAT.CONTACT_NO = '" + patient.getContactNo().trim() + "' \n";
        }
        if (patient.getFullName().trim().length() != 0) {
            query += " AND PAT.FULL_NAME LIKE '%" + patient.getFullName().toUpperCase().trim() + "%' \n";
        }
        if (patient.getOldMRNO().trim().length() != 0) {
            query += " AND UPPER(NVL(PAT.OLD_MRNO, ' '))  LIKE '%" + patient.getOldMRNO().toUpperCase().trim() + "%' \n";
        }
        if (patient.getRegistrationFrom().trim().length() != 0) {
            query += " AND TRUNC(PAT.REGISTRATION) >= " + patient.getRegistrationFrom() + "\n";
        }
        if (patient.getRegistrationTo().trim().length() != 0) {
            query += " AND TRUNC(PAT.REGISTRATION) <= " + patient.getRegistrationTo() + "\n";
        }
        if (patient.getAgeFrom().trim().length() != 0) {
            query += " AND ROUND(MONTHS_BETWEEN (TRUNC(SYSDATE),PAT.DOB)/12) >= " + patient.getAgeFrom() + "\n";
        }
        if (patient.getAgeTo().trim().length() != 0) {
            query += " AND ROUND(MONTHS_BETWEEN (TRUNC(SYSDATE),PAT.DOB)/12)<= " + patient.getAgeTo() + "\n";
        }
        query += " ORDER BY REGISTRATION_DATE DESC";

        return setStudyVector(Constants.dao.selectData(query, c));
    }

    public Vector setStudyVector(Vector patients) {

        Vector vec = new Vector();
        for (int i = 0; i < patients.size(); i++) {
            HashMap hashPatient = (HashMap) patients.get(i);
            Patient patient = new Patient();
            patient.setPatientId((String) hashPatient.get("PATIENT_ID"));
            patient.setOldMRNO((String) hashPatient.get("OLD_MRNO"));
            patient.setFirstName((String) hashPatient.get("FIRST_NAME"));
            patient.setLastName((String) hashPatient.get("LAST_NAME"));
            patient.setFullName((String) hashPatient.get("FULL_NAME"));
            patient.setFatherName((String) hashPatient.get("FATHER_NAME"));
            patient.setHusbandName((String) hashPatient.get("HUSBAND_NAME"));
            patient.setAge((String) hashPatient.get("AGE"));
            patient.setDob((String) hashPatient.get("DOB"));
            patient.setPatientInfoUpdated((String) hashPatient.get("INFO_UPDATED"));
            patient.setPatientUpdateAllow((String) hashPatient.get("PATIENT_UPDATE_ALLOW"));
            patient.setTitleDescription((String) hashPatient.get("TITLE_DESCRIPTION"));
            patient.setTitleId((String) hashPatient.get("TITLE_ID"));
            patient.setGenderDescription((String) hashPatient.get("GENDER_DESCRIPTION"));
            patient.setGenderId((String) hashPatient.get("GENDER_ID"));
            patient.setMaritalStatusDescription((String) hashPatient.get("MARITAL_STATUS_DESCRIPTION"));
            patient.setMaritalStatusId((String) hashPatient.get("MARITAL_STATUS_ID"));
            patient.setBloodGroupDescription((String) hashPatient.get("BLOOD_GROUP_DESCRIPTION"));
            patient.setBloodGroupId((String) hashPatient.get("BLOOD_GROUP_ID"));
            patient.setReligionDescription((String) hashPatient.get("RELIGION_DESCRIPTION"));
            patient.setReligionId((String) hashPatient.get("RELIGION_ID"));
            patient.setTypeDescription((String) hashPatient.get("PATIENT_TYPE_DESCRIPTION"));
            patient.setTypeId((String) hashPatient.get("PATIENT_TYPE_ID"));
            patient.setContactNo((String) hashPatient.get("CONTACT_NO"));
            patient.setEmergencyContactNo((String) hashPatient.get("EMERGENCY_CONTACT_NO"));
            patient.setEmail((String) hashPatient.get("EMAIL_ADDRESS"));
            patient.setCityDescription((String) hashPatient.get("CITY_DESCRIPTION"));
            patient.setCityId((String) hashPatient.get("CITY_ID"));
            patient.setAddress((String) hashPatient.get("ADDRESS"));
            patient.setCnic((String) hashPatient.get("CNIC"));
            patient.setRegisteredBy((String) hashPatient.get("REGISTERED_BY"));
            patient.setLocationDescription((String) hashPatient.get("LOCATION_DESCRIPTION"));
            patient.setLocationId((String) hashPatient.get("LOCATION_ID"));
            patient.setClientDescription((String) hashPatient.get("CLIENT_DESCRIPTION"));
            patient.setClientId((String) hashPatient.get("CLIENT_ID"));
            patient.setCompanyDescription((String) hashPatient.get("COMPANY_DESCRIPTION"));
            patient.setCompanyId((String) hashPatient.get("COMPANY_ID"));
            patient.setAttachedMRNOs((String) hashPatient.get("ATTACHED_MRNO"));
            patient.setOldMRNO((String) hashPatient.get("OLD_MRNO"));
            patient.setRegistrationDate((String) hashPatient.get("REGISTRATION_DATE"));

            vec.add(patient);
        }//
        return vec;
    }

    public String getPatientPicture(String patientId) {

        String ret = "";
        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            String sql = " SELECT PICTURE FROM "
                    + Database.DCMS.patientPicture + " \n"
                    + " WHERE PATIENT_ID = '" + patientId + "' \n";
            //Constants.print(sql);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString(1);
                ret = System.getProperty("java.io.tmpdir") + name + ".png";
                File picture = new File(ret);
                FileOutputStream fos = new FileOutputStream(picture);
                byte[] buffer = new byte[256];
                InputStream is = resultSet.getBinaryStream(1);
                while (is.read(buffer) > 0) {
                    fos.write(buffer);
                }
                fos.close();
            } else {
                ret = "";
                Constants.prescriptionFile = "";
            }
            stmt.close();
            resultSet.close();

        } catch (Exception ex) {
            ret = "";
            ex.printStackTrace();
        }

        return ret;
    }

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

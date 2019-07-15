package Antenatal.Handler;

import Antenatal.BO.BOBirthCertificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class BirthCertificateHandler {

    public List<BOBirthCertificate> selectPatientSearch(String patientId,
            String admissionNo) {

        String columns[] = {"-", "ID", "PATIENT_ID", "ADMISSION_NO", "BABY_NAME",
            "BABY_PATIENT_ID", "PREGNANCY_WEEKS", "GENDER_ID", "GENDER", "DOB",
            "DOB_DATE","AGE", "BIRTH_WEIGHT", "PRIMARY_PHYSICIAN_ID", "METHOD_INDICATION",
            "COMPLICATIONS", "B_F_VACCINATION","DELIVERY","LABOUR","PRESENT_STATUS",
            "FATHER_NAME", "FATHER_CNIC", "FATHER_OCCUPATION", "IS_FINAL", "PLACE",
            "PRESENT_ADDRESS", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID",
            "CLIENT_ID", "CLIENT_NAME", "OTHER_INFO"};

        String query = " SELECT PH.ID              ID,                      \n"
                + " PH.PATIENT_ID                  PATIENT_ID,              \n"
                + " NVL(PH.ADMISSION_NO, 0)        ADMISSION_NO,            \n"
                + " PH.BABY_NAME                   BABY_NAME,               \n"
                + " NVL(PH.BABY_PATIENT_ID, 'N/A') BABY_PATIENT_ID,         \n"
                + " PH.PREGNANCY_WEEKS             PREGNANCY_WEEKS,         \n"
                + " PH.GENDER_ID                   GENDER_ID,               \n"
                + " GEN.DESCRIPTION                GENDER,                  \n"
                + " TO_CHAR(PH.DOB, 'DD-MON-YY')   DOB,                     \n"
                + " ROUND(PH.DOB - (SYSDATE +1))   DOB_DATE,                \n"
                + " trunc(months_between(sysdate,PH.DOB)/12) AGE,           \n" 
                + " PH.BIRTH_WEIGHT                BIRTH_WEIGHT,            \n"
                + " NVL(PH.PRIMARY_PHYSICIAN_ID, ' ') PRIMARY_PHYSICIAN_ID, \n"
                + " NVL(PH.METHOD_INDICATION, ' ') METHOD_INDICATION,       \n"
                + " NVL(PH.COMPLICATIONS, ' ')     COMPLICATIONS,           \n"
                + " NVL(PH.B_F_VACCINATION, ' ')   B_F_VACCINATION,         \n"
                + " NVL(PH.DELIVERY, ' ')          DELIVERY,                \n"
                + " NVL(PH.LABOUR, ' ')            LABOUR,                  \n"
                + " NVL(PH.PRESENT_STATUS, ' ')    PRESENT_STATUS,          \n"
                + " NVL(PH.FATHER_NAME, ' ' )      FATHER_NAME,             \n"
                + " NVL(PH.FATHER_CNIC , ' ')      FATHER_CNIC,             \n"
                + " NVL(PH.FATHER_OCCUPATION,' ')  FATHER_OCCUPATION,       \n"
                + " PH.IS_FINAL                    IS_FINAL,                \n"
                + " PH.PLACE                       PLACE,                   \n"
                + " PH.PRESENT_ADDRESS             PRESENT_ADDRESS,         \n"
                + " NVL(PAT.OTHER_INFO, ' ')       OTHER_INFO,              \n"
                + " USR.NAME                       CRTD_BY,                 \n"
                + " CLT.ID                         CLIENT_ID,               \n"
                + " CLT.DESCRIPTION                CLIENT_NAME,             \n"
                + " TO_CHAR(PH.CRTD_DATE,'DD-MON-YYYY')CRTD_DATE,           \n"
                + " PH.CRTD_TERMINAL_ID CRTD_TERMINAL_ID  FROM              \n"
                + Database.DCMS.pregnancyHistory + "        PH,             \n"
                + Database.DCMS.patient + "                 PAT,            \n"
                + Database.DCMS.client + "                  CLT,            \n"
                + Database.DCMS.users + "                   USR,            \n"
                + Database.DCMS.definitionTypeDetail + "    GEN             \n"
                + " WHERE PH.PATIENT_ID = '" + patientId + "'               \n";

        if (admissionNo.trim().length() != 0) {
            query += " AND PH.ADMISSION_NO = '" + admissionNo + "'          \n";
        }
        query += " AND PH.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + " AND PAT.CLIENT_ID = CLT.ID                              \n"
                + " AND PH.CRTD_BY = USR.USER_NAME                          \n"
                + " AND PH.GENDER_ID = GEN.ID                               \n"
                + " ORDER BY PH.CRTD_DATE DESC                              \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<BOBirthCertificate> lisVerRep = new ArrayList<>();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            BOBirthCertificate objData = new BOBirthCertificate();
            objData.setId(map.get("ID").toString());
            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setOtherInfo(map.get("OTHER_INFO").toString());
            objData.setAdmissionNumber(map.get("ADMISSION_NO").toString());
            objData.setBabyName(map.get("BABY_NAME").toString());
            objData.setBabyPatientId(map.get("BABY_PATIENT_ID").toString());
            objData.setPregnancyWeeks(map.get("PREGNANCY_WEEKS").toString());
            objData.setGenderId(map.get("GENDER_ID").toString());
            objData.setGender(map.get("GENDER").toString());
            objData.setClientId(map.get("CLIENT_ID").toString());
            objData.setClientName(map.get("CLIENT_NAME").toString());
            objData.setDob(map.get("DOB").toString());
            objData.setDayOfBirth(map.get("DOB_DATE").toString());
            objData.setAge(map.get("AGE").toString());
            objData.setIsFinal(map.get("IS_FINAL").toString());
            objData.setBirthWeight(map.get("BIRTH_WEIGHT").toString());
            objData.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            objData.setMethodIndication(map.get("METHOD_INDICATION").toString());
            objData.setComplications(map.get("COMPLICATIONS").toString());
            objData.setBFVaccination(map.get("B_F_VACCINATION").toString());
            objData.setDelivery(map.get("DELIVERY").toString());
            objData.setLabour(map.get("LABOUR").toString());
            objData.setPresentStatus(map.get("PRESENT_STATUS").toString());
            objData.setFatherName(map.get("FATHER_NAME").toString());
            objData.setFatherCnic(map.get("FATHER_CNIC").toString());
            objData.setFatherOccupation(map.get("FATHER_OCCUPATION").toString());
            objData.setPlace(map.get("PLACE").toString());
            objData.setPresentAddress(map.get("PRESENT_ADDRESS").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public boolean updateBirthCertificate(BOBirthCertificate objRv) {

        String query
                = " UPDATE " + Database.DCMS.pregnancyHistory + "           \n"
                + " SET  BABY_NAME ='" + objRv.getBabyName() + "',          \n"
                + " BABY_PATIENT_ID = '" + objRv.getBabyPatientId() + "' ,  \n"
                + " PREGNANCY_WEEKS = '" + objRv.getPregnancyWeeks() + "',  \n"
                + " GENDER_ID =  '" + objRv.getGenderId() + "',             \n"
                + " DOB = '" + objRv.getDob() + "',                         \n"
                + " BIRTH_WEIGHT = '" + objRv.getBirthWeight() + "',        \n"
                + " PRIMARY_PHYSICIAN_ID = '" + objRv.getPrimaryPhysicianId() + "',\n"
                + " METHOD_INDICATION = '" + objRv.getMethodIndication() + "', \n"
                + " COMPLICATIONS = '" + objRv.getComplications() + "',     \n"
                + " B_F_VACCINATION = '" + objRv.getBFVaccination() + "',   \n"
                + " DELIVERY = '" + objRv.getDelivery()+ "',                \n"
                + " LABOUR = '" + objRv.getLabour()+ "',                    \n"
                + " PRESENT_STATUS = '" + objRv.getPresentStatus() + "',    \n"
                + " PLACE = '" + objRv.getPlace() + "',                     \n"
                + " PRESENT_ADDRESS = '"
                + objRv.getPresentAddress().replaceAll("'", "''") + "'      \n"
                + " WHERE ID = '" + objRv.getId() + "'                      \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean insertBirthCertificate(BOBirthCertificate objData) {

        String columns[] = {Database.DCMS.pregnancyHistory, "ID", "PATIENT_ID",
            "ADMISSION_NO", "BABY_NAME", "BABY_PATIENT_ID", "PREGNANCY_WEEKS",
            "GENDER_ID", "DOB", "BIRTH_WEIGHT", "PRIMARY_PHYSICIAN_ID",
            "METHOD_INDICATION", "COMPLICATIONS", "B_F_VACCINATION",
            "DELIVERY","LABOUR","PRESENT_STATUS", "FATHER_NAME", "FATHER_CNIC",
            "FATHER_OCCUPATION","PLACE", "PRESENT_ADDRESS", "CRTD_BY",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", " (SELECT NVL(MAX(ID)+ 1, '1') ID FROM "
                + Database.DCMS.pregnancyHistory + ")\n");
        map.put("PATIENT_ID", "'" + objData.getPatientId() + "'");
        map.put("ADMISSION_NO", "'" + objData.getAdmissionNumber() + "'");
        map.put("BABY_NAME", "'" + objData.getBabyName() + "'");
        map.put("BABY_PATIENT_ID", "'" + objData.getBabyPatientId() + "'");
        map.put("PREGNANCY_WEEKS", "'" + objData.getPregnancyWeeks() + "'");
        map.put("GENDER_ID", "'" + objData.getGenderId() + "'");
        map.put("DOB", "'" + objData.getDob() + "'");
        map.put("BIRTH_WEIGHT", "'" + objData.getBirthWeight() + "'");
        map.put("PRIMARY_PHYSICIAN_ID", "'" + objData.getPrimaryPhysicianId() + "'");
        map.put("METHOD_INDICATION", "'" + objData.getMethodIndication() + "'");
        map.put("COMPLICATIONS", "'" + objData.getComplications() + "'");
        map.put("B_F_VACCINATION", "'" + objData.getBFVaccination() + "'");
        map.put("DELIVERY", "'" + objData.getDelivery()+ "'");
        map.put("LABOUR", "'" + objData.getLabour()+ "'");
        map.put("PRESENT_STATUS", "'" + objData.getPresentStatus() + "'");
        map.put("FATHER_NAME", "'" + objData.getFatherName() + "'");
        map.put("FATHER_CNIC", "'" + objData.getFatherCnic() + "'");
        map.put("FATHER_OCCUPATION", "'" + objData.getFatherOccupation().replaceAll("'", "''") + "'");
        map.put("PLACE", "'" + objData.getPlace() + "'");
        map.put("PRESENT_ADDRESS", "'" + objData.getPresentAddress().replaceAll("'", "''") + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List listItem = new ArrayList();
        listItem.add(map);
        return Constants.dao.insertData(listItem, columns);
    }
}

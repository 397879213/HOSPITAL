package OPDVital_Raheel.Handler;

import OPDVital.Raheel.BO.PatientSymptom;
import OPDVital.Raheel.BO.PatientVitalSigns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

public class PatientVitalSignsHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public List searchPendingConsultancies(String patientId, String patientName, 
            String consultantId, String tokenNumber) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "COMPLETE_ORDER_NO",
            "ORDER_DETAIL_ID", "CONSULTANCY_DATE", "INVOICE_NO", "ID", "TOKEN_NO", 
            "CONSULTANT_ID", "CONSULTANT_NAME", "ORDER_STATUS_ID", "STATUS_DESCRIPTION"};

        String query
                = " SELECT OPC.PATIENT_ID, PAT.FULL_NAME, OPC.COMPLETE_ORDER_NO,\n"
                + " OPC.ORDER_DETAIL_ID,                                        \n"
                + " NVL(TO_CHAR(OPC.CONSULTANCY_DATE, 'DD-MON-YYYY'),'') CONSULTANCY_DATE, "
                + "OPC.INVOICE_NO, OPC.ID, \n"
                + " OPC.TOKEN_NO, OPC.CONSULTANT_ID, USR.NAME CONSULTANT_NAME, \n"
                + " OPC.ORDER_STATUS_ID, STATUS.DESCRIPTION STATUS_DESCRIPTION \n"
                + " FROM "
                + Database.DCMS.opdPendingConsultancy + " OPC,      \n"
                + Database.DCMS.users + " USR,                      \n"
                + Database.DCMS.definitionTypeDetail + " STATUS,    \n"
                + Database.DCMS.patient + " PAT                     \n"
                + " WHERE  1 = 1                                    \n";
        if (patientId.length() != 0) {
            query += " AND OPC.PATIENT_ID = '" + patientId + "'     \n";
        }

        if (patientName.length() != 0) {
            query += " AND UPPER(PAT.FULL_NAME) LIKE '%" + patientName + "%' \n";
        }
        if (consultantId.length() != 0) {
            query += " AND OPC.CONSULTANT_ID = '" + consultantId + "' \n";
        }
        if (tokenNumber.length() != 0) {
            query += " AND OPC.TOKEN_NO = '" + tokenNumber + "'       \n";
        }
        query +=  " AND USR.USER_NAME = NVL(OPC.CONSULTANT_ID, 'GENERAL')   \n"
              +   " AND STATUS.ID = OPC.ORDER_STATUS_ID                     \n"
              +   " AND PAT.PATIENT_ID = OPC.PATIENT_ID                     \n"
              +   " ORDER BY OPC.CONSULTANCY_DATE                           \n";

        System.out.println(query);
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<PatientSymptom> listVitals = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            PatientSymptom patSymp = new PatientSymptom();

            patSymp.setConsultancyId((String) map.get("ID"));
            patSymp.setPatientId((String) map.get("PATIENT_ID"));
            patSymp.setPatientName((String) map.get("FULL_NAME"));
            patSymp.setCon((String) map.get("COMPLETE_ORDER_NO"));
            patSymp.setOdi((String) map.get("ORDER_DETAIL_ID"));
            patSymp.setConsultancyDate((String) map.get("CONSULTANCY_DATE"));
            patSymp.setTokenNumber((String) map.get("TOKEN_NO"));
            patSymp.setConsultantId((String) map.get("CONSULTANT_ID"));
            patSymp.setConsultantName((String) map.get("CONSULTANT_NAME"));
            patSymp.setOrderTypedescription((String) map.get("ORDER_STATUS_ID"));
            patSymp.setOrderTypedescription((String) map.get("STATUS_DESCRIPTION"));
            listVitals.add(patSymp);
        }
        return listVitals;
    }
    
    public boolean insertPatientVitalSigns(PatientVitalSigns patientvitalsigns) {
        String[] columns = {Database.DCMS.patientVitalSigns,
            "ID", "PATIENT_ID", "ACTION_EVENT_ID", "VITAL_EVENT_ID", "INR",
            "RBS", "FBS", "BLOOD_PRESSURE_DIASTOLIC", "BLOOD_PRESSURE_SYSTOLIC",
            "HEIGHT", "WEIGHT", "BODY_TEMPERATURE", "PULSE", "HEART_RATE",
            "ABDOMINAL_GIRTH", "O2_SAT", "RESPIRATION_RATE", "CVP", "FHS_FOS","BMI",
            "VITAL_TIME", "VITAL_DATE", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap mapVitals = new HashMap();
        mapVitals.put("ID", key.generatePrimaryKey(Keys.patientVitalSigns, false));
        mapVitals.put("PATIENT_ID", "'" + patientvitalsigns.getPatientId() + "'");
        mapVitals.put("ACTION_EVENT_ID", "'" + patientvitalsigns.getActionEventId() + "'");
        mapVitals.put("VITAL_EVENT_ID", "'" + patientvitalsigns.getVitalEventId() + "'");
        mapVitals.put("BODY_TEMPERATURE", "'" + patientvitalsigns.getBodyTemperature() + "'");
        mapVitals.put("PULSE", "'" + patientvitalsigns.getPulse() + "'");
        mapVitals.put("O2_SAT", "'" + patientvitalsigns.getO2Sat() + "'");
//        mapVitals.put("VITAL_TIME", "'" + patientvitalsigns.getVitalTime() + "'");
        mapVitals.put("VITAL_TIME", "TO_CHAR(" + Constants.today + ", 'HH:MM AM')");
        mapVitals.put("BLOOD_PRESSURE_DIASTOLIC", "'"
                + patientvitalsigns.getBloodPressureDiastolic() + "'");
        mapVitals.put("BLOOD_PRESSURE_SYSTOLIC", "'"
                + patientvitalsigns.getBloodPressureSystolic() + "'");
        mapVitals.put("RESPIRATION_RATE", "'" + patientvitalsigns.getRespirationRate() + "'");
        mapVitals.put("ABDOMINAL_GIRTH", "'" + patientvitalsigns.getAbdominalGirth() + "'");
        mapVitals.put("INR", "'" + patientvitalsigns.getInr() + "'");
        mapVitals.put("HEIGHT", "'" + patientvitalsigns.getHeight() + "'");
        mapVitals.put("WEIGHT", "'" + patientvitalsigns.getWeight() + "'");
        mapVitals.put("HEART_RATE", "'" + patientvitalsigns.getHeartRate() + "'");
        mapVitals.put("RBS", "'" + patientvitalsigns.getRbs() + "'");
        mapVitals.put("FBS", "'" + patientvitalsigns.getFbs() + "'");
        mapVitals.put("CVP", "'" + patientvitalsigns.getCvp() + "'");
        mapVitals.put("FHS_FOS", "'" + patientvitalsigns.getFhsFos() + "'");
        System.err.println("\nBMI" +patientvitalsigns.getBmi() );
        mapVitals.put("BMI", "'" + patientvitalsigns.getBmi()+ "'");
        mapVitals.put("VITAL_DATE", Constants.today);
        mapVitals.put("CRTD_DATE", Constants.today);
        mapVitals.put("CRTD_BY", "'" + Constants.userId + "'");
        mapVitals.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List vec = new ArrayList();
        vec.add(mapVitals);
        return Constants.dao.insertData(vec, columns);

    }
    
    public boolean  UpdatePatientVitals(PatientVitalSigns patientvitalsigns){
    
       String query 
                   = " UPDATE " + Database.DCMS.patientVitalSigns + "\n SET "
        + "BODY_TEMPERATURE =  '" + patientvitalsigns.getBodyTemperature() +"',            \n"
        + "PULSE = '" + patientvitalsigns.getPulse() +"',            \n"
        + "O2_SAT = '" + patientvitalsigns.getO2Sat() +"',            \n"
        + "VITAL_TIME = " + Constants.today + ",  \n"
        + "BLOOD_PRESSURE_DIASTOLIC = '" + patientvitalsigns.getBloodPressureDiastolic() +"',            \n"
        + "BLOOD_PRESSURE_SYSTOLIC = '" + patientvitalsigns.getBloodPressureSystolic() +"',            \n"
        + "RESPIRATION_RATE = '" + patientvitalsigns.getRespirationRate() +"',            \n"
        + "ABDOMINAL_GIRTH = '" + patientvitalsigns.getAbdominalGirth() +"',            \n"
        + "INR = '" + patientvitalsigns.getInr() +"',            \n"
        + "HEIGHT = '" + patientvitalsigns.getHeight() +"',            \n"
        + "WEIGHT = '" + patientvitalsigns.getWeight() +"',            \n"
        + "HEART_RATE = '" + patientvitalsigns.getHeartRate() +"',            \n"
        + "RBS = '" + patientvitalsigns.getRbs() +"',            \n"
        + "FBS = '" + patientvitalsigns.getFbs() +"',            \n"
        + "CVP = '" + patientvitalsigns.getCvp() +"',            \n"
        + "FHS_FOS = '" + patientvitalsigns.getFhsFos() +"',            \n"
        + "UPTD_DATE = " + Constants.today +",            \n"
        + "UPTD_BY = '" + Constants.userId +"',            \n"
        + "UPTD_TERMINAL_ID = '" + Constants.terminalId +"'            \n"
        + "WHERE  ID = '" + patientvitalsigns.getId().trim() +    "'           \n";
        System.err.println("\n " + query);               
       return Constants.dao.executeUpdate(query, false);
       
    }

    public List searchPatientVitals(String patientId, String vitalEventId, String vitalDate) {

        String[] columns = {Database.DCMS.patientVitalSigns, "ID",
            "PATIENT_ID", "ACTION_EVENT_ID", "VITAL_EVENT_ID",
            "BODY_TEMPERATURE", "PULSE", "O2_SAT", "VITAL_TIME",
            "BLOOD_PRESSURE_DIASTOLIC", "BLOOD_PRESSURE_SYSTOLIC",
            "RESPIRATION_RATE", "ABDOMINAL_GIRTH", "HEIGHT", "WEIGHT","BMI",
            "HEART_RATE", "RBS", "FBS", "INR", "CVP", "FHS_FOS", "VITAL_DATE"};

        String query
                = " SELECT  PVS.ID,                                 \n"
                + " PVS.PATIENT_ID,                                 \n"
                + " PVS.ACTION_EVENT_ID,                            \n"
                + " PVS.VITAL_EVENT_ID,                             \n"
                + " NVL(PVS.BODY_TEMPERATURE, ' ')BODY_TEMPERATURE, \n"
                + " NVL(PVS.PULSE, ' ')          PULSE,             \n"
                + " NVL(PVS.O2_SAT, ' ')           O2_SAT,          \n"
                + " PVS.VITAL_TIME   VITAL_TIME,                    \n"
                + " NVL(PVS.BLOOD_PRESSURE_DIASTOLIC, ' ')  BLOOD_PRESSURE_DIASTOLIC,   \n"
                + " NVL(PVS.BLOOD_PRESSURE_SYSTOLIC, ' ')   BLOOD_PRESSURE_SYSTOLIC,    \n"
                + " NVL(PVS.RESPIRATION_RATE, ' ')RESPIRATION_RATE, \n"
                + " NVL(PVS.ABDOMINAL_GIRTH, ' ')ABDOMINAL_GIRTH,   \n"
                + " NVL(PVS.HEIGHT, ' ')HEIGHT,                     \n"
                + " NVL(PVS.WEIGHT, ' ')   WEIGHT ,                 \n"
                + " NVL(PVS.INR, ' ')       INR ,                   \n"
                + " NVL(PVS.HEART_RATE, ' ')   HEART_RATE,          \n"
                + " NVL(PVS.RBS, ' ')           RBS,                \n"
                + " NVL(PVS.FBS, ' ')           FBS,                \n"
                + " NVL(PVS.CVP, ' ')           CVP,                \n"
                + " NVL(PVS.BMI, ' ')           BMI,                \n"
                + " NVL(PVS.FHS_FOS, ' ')   FHS_FOS,                \n"
                + " TO_CHAR(PVS.VITAL_DATE, 'DD-MON-YY')VITAL_DATE  \n"
                + " FROM "
                + Database.DCMS.patientVitalSigns + " PVS         \n"
                + " WHERE  PVS.PATIENT_ID = '" + patientId + "'         \n";

        if (!vitalEventId.equals("0")) {
            query += " AND PVS.VITAL_EVENT_ID = '" + vitalEventId + "'    \n";
        }
        if (vitalDate.length() != 0) {
            query += " AND TO_CHAR(PVS.VITAL_DATE, 'DD-MON-YY') = '" + vitalDate + "'    \n";
        }
        query += " AND PVS.ACTIVE = 'Y'                                \n"
                //+ " AND   PVS.CRTD_BY  = '" + userId +"' \n"                    
                + " ORDER BY PVS.VITAL_DATE                             \n";

        System.out.println(query);
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<PatientVitalSigns> listVitals = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            PatientVitalSigns pvs = new PatientVitalSigns();

            pvs.setId((String) map.get("ID"));
            pvs.setPatientId((String) map.get("PATIENT_ID"));
            pvs.setActionEventId((String) map.get("ACTION_EVENT_ID"));
            pvs.setVitalEventId((String) map.get("VITAL_EVENT_ID"));
            pvs.setBodyTemperature((String) map.get("BODY_TEMPERATURE"));
            pvs.setPulse((String) map.get("PULSE"));
            pvs.setO2Sat((String) map.get("O2_SAT"));
            pvs.setVitalTime((String) map.get("VITAL_TIME"));
            pvs.setBloodPressureDiastolic((String) map.get("BLOOD_PRESSURE_DIASTOLIC"));
            pvs.setBloodPressureSystolic((String) map.get("BLOOD_PRESSURE_SYSTOLIC"));
            pvs.setRespirationRate((String) map.get("RESPIRATION_RATE"));
            pvs.setAbdominalGirth((String) map.get("ABDOMINAL_GIRTH"));
            pvs.setHeight((String) map.get("HEIGHT"));
            pvs.setWeight((String) map.get("WEIGHT"));
            pvs.setHeartRate((String) map.get("HEART_RATE"));
            pvs.setRbs((String) map.get("RBS"));
            pvs.setInr((String) map.get("INR"));
            pvs.setFbs((String) map.get("FBS"));
            pvs.setBmi((String) map.get("BMI"));
            pvs.setCvp((String) map.get("CVP"));
            pvs.setFhsFos((String) map.get("FHS_FOS"));
            pvs.setVitalDate((String) map.get("VITAL_DATE"));
            //pvs.setCrtdBy((String) map.get("CRTD_BY"));

            listVitals.add(pvs);
        }
        return listVitals;
    }

    public List searchPatientVital(String patientId, String userId,
            String vitalEventId, String fromDate, String toDate) {

        String[] columns = {Database.DCMS.patientVitalSigns, "ID",
            "PATIENT_ID", "FULL_NAME", "AGE", "GENDER", "LOCATION",
            "ACTION_EVENT_ID", "VITAL_EVENT_ID", "INR",
            "BODY_TEMPERATURE", "PULSE", "O2_SAT", "VITAL_TIME","BMI",
            "BLOOD_PRESSURE_DIASTOLIC", "BLOOD_PRESSURE_SYSTOLIC",
            "RESPIRATION_RATE", "ABDOMINAL_GIRTH", "HEIGHT", "WEIGHT",
            "HEART_RATE", "RBS", "FBS", "CRTD_BY",
            "CVP", "FHS_FOS", "VITAL_DATE"};

        String query
                = " SELECT  PVS.ID,                                 \n"
                + " PVS.PATIENT_ID,                                 \n"
                + " PAT.FULL_NAME                   FULL_NAME,      \n"
                + " PAT.AGE                         AGE,            \n"
                + " DTD.DESCRIPTION                 GENDER,         \n"
                + " LOC.DESCRIPTION                 LOCATION,       \n"
                + " PVS.ACTION_EVENT_ID,                            \n"
                + " PVS.CRTD_BY,                                    \n"
                + " VITAL_EVENT_ID                  VITAL_EVENT_ID, \n"
                + " NVL(PVS.BODY_TEMPERATURE, ' ')BODY_TEMPERATURE, \n"
                + " NVL(PVS.PULSE, ' ')          PULSE,             \n"
                + " NVL(PVS.O2_SAT, ' ')           O2_SAT,          \n"
                + " PVS.VITAL_TIME                  VITAL_TIME,     \n"
                + " NVL(PVS.BMI, 0)                BMI,             \n"
                + " NVL(PVS.BLOOD_PRESSURE_DIASTOLIC, ' ')  BLOOD_PRESSURE_DIASTOLIC,   \n"
                + " NVL(PVS.BLOOD_PRESSURE_SYSTOLIC, ' ')   BLOOD_PRESSURE_SYSTOLIC,    \n"
                + " NVL(PVS.RESPIRATION_RATE, ' ')RESPIRATION_RATE, \n"
                + " NVL(PVS.ABDOMINAL_GIRTH, ' ')ABDOMINAL_GIRTH,   \n"
                + " NVL(PVS.HEIGHT, ' ')HEIGHT,                     \n"
                + " NVL(PVS.WEIGHT, ' ')   WEIGHT ,                 \n"
                + " NVL(PVS.HEART_RATE, ' ')   HEART_RATE,          \n"
                + " NVL(PVS.RBS, ' ')           RBS,                \n"
                + " NVL(PVS.INR, ' ')           INR,                \n"
                + " NVL(PVS.FBS, ' ')           FBS,                \n"
                + " NVL(PVS.CVP, ' ')           CVP,                \n"
                + " NVL(PVS.FHS_FOS, ' ')   FHS_FOS,                \n"
                + " TO_CHAR(PVS.VITAL_DATE, 'DD-MON-YY')VITAL_DATE  \n"
                + " FROM "
                + Database.DCMS.patientVitalSigns + " PVS,         \n"
                + Database.DCMS.patient + "           PAT,         \n"
                + Database.DCMS.definitionTypeDetail + " DTD,      \n"
                + Database.DCMS.location + " LOC                  \n"
                + " WHERE 1=1 ";

        if (patientId.length() != 0) {
            query += " AND PVS.PATIENT_ID = '" + patientId + "'             \n";
        }
        if (userId.length() != 0) {
            query += " AND PVS.CRTD_BY = '" + userId + "'        \n";
        }
        if (vitalEventId.trim().length() != 0) {
                query += " AND PVS.VITAL_EVENT_ID = '" + vitalEventId + "'    \n";
            }
        if (fromDate.length() == 9 && toDate.length() == 9) {
            query += " AND PVS.CRTD_DATE BETWEEN  TO_DATE('"
                    + fromDate + "' , 'DD-MON-YY HH24:MI:SS') AND TO_DATE('"
                    + toDate + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }

        query += " AND PVS.ACTIVE = 'Y'                                  \n"
                + " AND PVS.PATIENT_ID = PAT.PATIENT_ID                    \n"
                + " AND PAT.GENDER_ID = DTD.ID                             \n"
                + " AND PAT.LOCATION_ID = LOC.ID                           \n"
                + " ORDER BY VITAL_DATE || PVS.VITAL_TIME   desc                            \n";

        System.out.println(query);
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<PatientVitalSigns> listVitals = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            PatientVitalSigns pvs = new PatientVitalSigns();

            pvs.setId((String) map.get("ID"));
            pvs.setPatientId(map.get("PATIENT_ID").toString());
//            pvs.setFullName((String) map.get("FULL_NAME"));
//            pvs.setAge((String) map.get("AGE"));
//            pvs.setGender((String) map.get("GENDER"));
//            pvs.setLocation((String) map.get("LOCATION"));
            pvs.setActionEventId((String) map.get("ACTION_EVENT_ID"));
            pvs.setVitalEventId((String) map.get("VITAL_EVENT_ID"));
            pvs.setBodyTemperature((String) map.get("BODY_TEMPERATURE"));
            pvs.setPulse((String) map.get("PULSE"));
            pvs.setO2Sat((String) map.get("O2_SAT"));
            pvs.setVitalTime((String) map.get("VITAL_TIME"));
            pvs.setBmi((String) map.get("BMI"));
            pvs.setBloodPressureDiastolic((String) map.get("BLOOD_PRESSURE_DIASTOLIC"));
            pvs.setBloodPressureSystolic((String) map.get("BLOOD_PRESSURE_SYSTOLIC"));
            pvs.setBloodPressure(pvs.getBloodPressureSystolic() + "/" +pvs.getBloodPressureDiastolic());
            pvs.setRespirationRate((String) map.get("RESPIRATION_RATE"));
            pvs.setAbdominalGirth((String) map.get("ABDOMINAL_GIRTH"));
            pvs.setHeight((String) map.get("HEIGHT"));
            pvs.setWeight((String) map.get("WEIGHT"));
            pvs.setHeartRate((String) map.get("HEART_RATE"));
            pvs.setRbs((String) map.get("RBS"));
            pvs.setInr((String) map.get("INR"));
            pvs.setFbs((String) map.get("FBS"));
            pvs.setCvp((String) map.get("CVP"));
            pvs.setCrtdBy((String) map.get("CRTD_BY"));
            pvs.setFhsFos((String) map.get("FHS_FOS"));
            pvs.setVitalDate((String) map.get("VITAL_DATE"));
            //pvs.setCrtdBy((String) map.get("CRTD_BY"));

            listVitals.add(pvs);
        }
        return listVitals;
    }

    public boolean updateVital(PatientVitalSigns selectedPatientVitalSigns) {
        String query
                = " UPDATE " + Database.DCMS.patientVitalSigns + "\n "
                + "SET \n"
                + " ACTIVE  = 'N'                                \n"
                + " WHERE ID = '" + selectedPatientVitalSigns.getId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateVitalEntered(String patentId, String consultancyId) {
        String query
                = " UPDATE " + Database.DCMS.opdPendingConsultancy + "\n "
                + "SET \n"
                + " VITAL_ENTERED  = 'Y'                                \n"
                + " WHERE PATIENT_ID = '" + patentId + "'"
                + " AND ID = '" + consultancyId + "'"
                + " AND VITAL_ENTERED = 'N'";
        System.out.println(query);
        return Constants.dao.executeUpdate(query, false);
    }
}

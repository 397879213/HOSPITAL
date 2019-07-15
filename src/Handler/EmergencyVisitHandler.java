///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Handler;
//
//import BO.Trauma.EmergencyVisit;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import utilities.Constants;
//import utilities.Database;
//import utilities.GenerateKeys;
//import utilities.Sequences;
//
///**
// *
// * @author Pacslink
// */
//public class EmergencyVisitHandler {
//
//    GenerateKeys key = new GenerateKeys();
//
//    String[] EmerColumns = {"-", "PATIENT_ID", "FULL_NAME", "AGE", "GENDER_ID",
//        "DESCRIPTION", "CONTACT_NO", "MLC_STATUS", "EMERGENCY_UNIT_ID",
//        "TEMPERATURE", "PULSE", "FBS", "RBS", "SYSTOLIC", "DIASTOLIC",
//        "COMPLAINTS", "TREATMENT_PLAN", "DESCRIPTION", "TYPE"};
//
//    String generalQuery
//            = " SELECT EPV.PATIENT_ID               PATIENT_ID,           \n"
//            + " PAT.FULL_NAME                       FULL_NAME,            \n"   
//            + " NVL(PAT.AGE, ' ')                   AGE,                  \n"   
//            + " PAT.GENDER_ID                       GENDER_ID,            \n"   
//            + " DTD.DESCRIPTION                     GENDER,               \n"   
//            + " NVL(PAT.CONTACT_NO, ' ')            CONTACT_NO,           \n"   
//            + " NVL(EPV.MLC_STATUS, ' ')            MLC_STATUS,           \n"   
//            + " EPV.EMERGENCY_UNIT_ID               EMERGENCY_UNIT_ID,    \n"
//            + " NVL(EPV.TEMPERATURE, ' ')           TEMPERATURE,          \n"
//            + " NVL(EPV.PULSE, ' ')                 PULSE,                \n"
//            + " NVL(EPV.FBS, ' ')                   FBS,                  \n"
//            + " NVL(EPV.RBS, ' ')                   RBS,                  \n"
//            + " NVL(EPV.SYSTOLIC, ' ')              SYSTOLIC,             \n"
//            + " NVL(EPV.DIASTOLIC, ' ')             DIASTOLIC,            \n"
//            + " NVL(EPV.COMPLAINTS, ' ')            COMPLAINTS,           \n"
//            + " NVL(EPV.TREATMENT_PLAN, ' ')        TREATMENT_PLAN,       \n"
//            + " NVL(ETU.DESCRIPTION, ' ')           TREATMENT_UNIT,       \n"
//            + " NVL(DD.TYPE, ' ')                   DISCHARGE_TYPE        \n"
//            + " FROM " + Database.DCMS.emergencyPendingVisit + " EPV,     \n"
//            + Database.DCMS.patient + " PAT,                              \n"
//            + Database.DCMS.users + " USR,                                \n"
//            + Database.DCMS.definitionTypeDetail + " ETU                  \n"
//            + Database.DCMS.definitionTypeDetail + " DTD                  \n"
//            + Database.DCMS.dischargeDetail + " DD                        \n";
//
//    
//    //NVL SELECTION IS MISSING
//    //PATIENT INFORMATION IS MISSING
//    //TRANSFER_BY IS MISSING
//    //Following table are missing in general query 
//    //USERS CRD FOR CRTD BY JOINS
//    //USERS TRF FOR TRANSFEREED BY JOINS
//    String generalJoin
//            = " AND EPV.PATIENT_ID = PAT.PATIENT_ID  \n"
//            + " AND EPV.MEDICAL_UNIT_ID = ETU.ID     \n"
//            + " AND EPV.CRTD_BY = USR.USER_NAME      \n"
//            + " AND PAT.GENDER_ID = DTD.ID           \n";
//    
//    public boolean insertEmergencyVisit(String patientId) {
//
//        String[] columns = {Database.DCMS.emergencyPendingVisit, "ID",
//            "PATIENT_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};
//
//        HashMap mapEmer = new HashMap();
//        mapEmer.put("ID", Sequences.traumaVisitId);
//        mapEmer.put("PATIENT_ID", "'" + patientId + "'");
//        mapEmer.put("CRTD_BY", "'" + Constants.userId + "'");
//        mapEmer.put("CRTD_TERMIAL_ID", "'" + Constants.terminalId + "'");
//
//        List listItem = new ArrayList();
//        listItem.add(mapEmer);
//        boolean ret = Constants.dao.insertData(listItem, columns);
//
//        if (ret) {
//            columns[0] = Database.DCMS.emergencyPendingVisit;
//            ret = Constants.dao.insertData(listItem, columns);
//        }
//        return ret;
//
//    }
//    
//    public List<EmergencyVisit> selectPendingByPatient(String patientId) {
//
//        String query = generalQuery
//                + " WHERE EPV.PATIENT_ID = '" + patientId + "'"
//                + generalJoin + " ORDER BY ID ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//
//    public List<EmergencyVisit> selectPendingByTraumaUnit(String MedicalUnitId) {
//
//        String query = generalQuery
//                + " WHERE EPV.MEDICAL_UNIT_ID = '" + MedicalUnitId + "' \n"
//                + generalJoin + " ORDER BY ID ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//    
//    public List<EmergencyVisit> selectPendingByDischargeType(String type) {
//
//        String query = generalQuery
//                + " WHERE DD.TYPE = '" + type + "' \n"
//                + generalJoin + " ORDER BY TYPE ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//    
//    public List<EmergencyVisit> selectTransferTo(String to) {
//
//        String query = generalQuery
//                + " WHERE code here = '" + to + "' \n"
//                + generalJoin + " ORDER BY  ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//    
//    public boolean updateDischargeType(EmergencyVisit patientType) {
//        String query
//                = " UPDATE " + Database.DCMS.dischargeDetail + "\n"
//                + " TYPE  = '" + patientType.getType().replaceAll("'", "''") + "' \n"
//                + " WHERE EPV.PATIENT_ID = '" + patientType.getPatientId()+ "'";
//
//        return Constants.dao.executeUpdate(query, false);
//
//    }
//    
//     public boolean updateVitals(EmergencyVisit vital) {
//        String query
//                = " UPDATE " + Database.DCMS.emergencyPendingVisit + "\n"
//                + " SET PULSE  = '" + vital.getPulse().replaceAll("'", "''") + "', \n"
//                + " FBS  = '" + vital.getFbs().replaceAll("'", "''") + "', \n"
//                + " RBS  = '" + vital.getRbs().replaceAll("'", "''") + "', \n"
//                + " SYSTOLIC  = '" + vital.getSystolic().replaceAll("'", "''") + "', \n"
//                + " DIASTOLIC  = '" + vital.getDiastolic().replaceAll("'", "''") + "' \n"
//                + " WHERE EPV.PATIENT_ID = '" + vital.getPatientId()+ "'";
//
//        return Constants.dao.executeUpdate(query, false);
//
//    }
//    
//
//    //COMPLETE THIS LIST FOR PATIENT INFO AND OTHER THINGS
//    public List setPatient(List list) {
//
//        List<EmergencyVisit> ListEmer = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            HashMap map = (HashMap) list.get(0);
//            EmergencyVisit obj = new EmergencyVisit();
//            obj.setPatientId(map.get("PATIENT_ID").toString());
//            obj.setFullName(map.get("FULL_NAME").toString());
//            obj.setAge(map.get("AGE").toString());
//            obj.setGenderId(map.get("GENDER_ID").toString());
//            obj.setGender(map.get("GENDER").toString());
//            obj.setContactNo(map.get("CONTACT_NO").toString());
//            obj.setMlcStatus(map.get("MLC_STATUS").toString());
//            obj.setTemperature(map.get("TEMPERATURE").toString());
//            obj.setPulse(map.get("PULSE").toString());
//            obj.setFbs(map.get("FBS").toString());
//            obj.setRbs(map.get("RBS").toString());
//            obj.setSystolic(map.get("SYSTOLIC").toString());
//            obj.setDiastolic(map.get("DIASTOLIC").toString());
//            obj.setMedicalUnit(map.get("DESCRIPTION").toString());
//            obj.setComplaints(map.get("COMPLAINTS").toString());
//            obj.setTreatment(map.get("TREATMENT_PLAN").toString());
//            obj.setType(map.get("DISCHARGE_TYPE").toString());
//            ListEmer.add(obj);
//        }
//        return ListEmer;
//    }
//    
//    
//    
//     String generalQueryPerformed
//            = " SELECT EPV.PATIENT_ID               PATIENT_ID,           \n"
//            + " PAT.FULL_NAME                       FULL_NAME,            \n"   
//            + " NVL(PAT.AGE, ' ')                   AGE,                  \n"   
//            + " PAT.GENDER_ID                       GENDER_ID,            \n"   
//            + " DTD.DESCRIPTION                     GENDER,               \n"   
//            + " NVL(PAT.CONTACT_NO, ' ')            CONTACT_NO,           \n"   
//            + " NVL(EPV.MLC_STATUS, ' ')            MLC_STATUS,           \n"   
//            + " EPV.EMERGENCY_UNIT_ID               EMERGENCY_UNIT_ID,    \n"
//            + " NVL(EPR.TEMPERATURE, ' ')           TEMPERATURE,          \n"
//            + " NVL(EPR.PULSE, ' ')                 PULSE,                \n"
//            + " NVL(EPR.FBS, ' ')                   FBS,                  \n"
//            + " NVL(EPR.RBS, ' ')                   RBS,                  \n"
//            + " NVL(EPR.SYSTOLIC, ' ')              SYSTOLIC,             \n"
//            + " NVL(EPR.DIASTOLIC, ' ')             DIASTOLIC,            \n"
//            + " NVL(EPR.COMPLAINTS, ' ')            COMPLAINTS,           \n"
//            + " NVL(EPR.TREATMENT_PLAN, ' ')        TREATMENT_PLAN,       \n"
//            + " NVL(ETU.DESCRIPTION, ' ')           TREATMENT_UNIT,       \n"
//            + " NVL(DD.TYPE, ' ')                   DISCHARGE_TYPE        \n"
//            + " FROM " + Database.DCMS.emergencyPerformedVisit + " EPR,   \n"
//            + Database.DCMS.patient + " PAT,                              \n"
//            + Database.DCMS.users + " USR,                                \n"
//            + Database.DCMS.definitionTypeDetail + " ETU                  \n"
//            + Database.DCMS.definitionTypeDetail + " DTD                  \n"
//            + Database.DCMS.dischargeDetail + " DD                        \n";
//    
//   
//     String generalJoinPerformed
//            = " AND EPR.PATIENT_ID = PAT.PATIENT_ID  \n"
//            + " AND EPR.MEDICAL_UNIT_ID = ETU.ID     \n"
//            + " AND EPR.CRTD_BY = USR.USER_NAME      \n"
//            + " AND PAT.GENDER_ID = DTD.ID           \n";
//    
//    public boolean insertEmergencyVisitPerformed(String patientId) {
//
//        String[] columns = {Database.DCMS.emergencyPerformedVisit, "ID",
//            "PATIENT_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};
//
//        HashMap mapEmer = new HashMap();
//        mapEmer.put("ID", Sequences.traumaVisitId);
//        mapEmer.put("PATIENT_ID", "'" + patientId + "'");
//        mapEmer.put("CRTD_BY", "'" + Constants.userId + "'");
//        mapEmer.put("CRTD_TERMIAL_ID", "'" + Constants.terminalId + "'");
//
//        List listItem = new ArrayList();
//        listItem.add(mapEmer);
//        boolean ret = Constants.dao.insertData(listItem, columns);
//
//        if (ret) {
//            columns[0] = Database.DCMS.emergencyPendingVisit;
//            ret = Constants.dao.insertData(listItem, columns);
//        }
//        return ret;
//
//    }
//    
//     public List<EmergencyVisit> selectPerformedByPatient(String patientId) {
//
//        String query = generalQuery
//                + " WHERE EPR.PATIENT_ID = '" + patientId + "'"
//                + generalJoin + " ORDER BY ID ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//
//    public List<EmergencyVisit> selectPerformedByTraumaUnit(String MedicalUnitId) {
//
//        String query = generalQuery
//                + " WHERE EPV.MEDICAL_UNIT_ID = '" + MedicalUnitId + "' \n"
//                + generalJoin + " ORDER BY ID";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//    
//    public List<EmergencyVisit> selectPerformedByDischargeType(String type) {
//
//        String query = generalQuery
//                + " WHERE DD.TYPE = '" + type + "' \n"
//                + generalJoin + " ORDER BY TYPE ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//    
//    public List<EmergencyVisit> selectPerformedTransferTo(String to) {
//
//        String query = generalQuery
//                + " WHERE code here = '" + to + "' \n"
//                + generalJoin + " ORDER BY  ";
//
//        return setPatient(Constants.dao.selectData(query, EmerColumns));
//    }
//    
//    public boolean updatePerformedDischargeType(EmergencyVisit patientType) {
//        String query
//                = " UPDATE " + Database.DCMS.dischargeDetail + "\n"
//                + " TYPE  = '" + patientType.getType().replaceAll("'", "''") + "' \n"
//                + " WHERE EPV.PATIENT_ID = '" + patientType.getPatientId()+ "'";
//
//        return Constants.dao.executeUpdate(query, false);
//
//    }
//    
//     public boolean updatePerformedVitals(EmergencyVisit vital) {
//        String query
//                = " UPDATE " + Database.DCMS.emergencyPerformedVisit + "\n"
//                + " SET PULSE  = '" + vital.getPulse().replaceAll("'", "''") + "', \n"
//                + " FBS  = '" + vital.getFbs().replaceAll("'", "''") + "', \n"
//                + " RBS  = '" + vital.getRbs().replaceAll("'", "''") + "', \n"
//                + " SYSTOLIC  = '" + vital.getSystolic().replaceAll("'", "''") + "', \n"
//                + " DIASTOLIC  = '" + vital.getDiastolic().replaceAll("'", "''") + "' \n"
//                + " WHERE EPV.PATIENT_ID = '" + vital.getPatientId()+ "'";
//
//        return Constants.dao.executeUpdate(query, false);
//
//    }
//    
//}

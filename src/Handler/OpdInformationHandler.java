package Handler;

import BO.Setup.OpdInformationBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class OpdInformationHandler {

      public List<OpdInformationBO> searchEmployeeData(String plNo) {

        String[] columns = {"", "PATIENT_ID", "PL_NUMBER", "DOB",
            "GENDER", "FULL_NAME", "RELATION", "FACTORY", "CRTD_DATE"};

        String query = " SELECT PATIENT_ID, PL_NUMBER, \n"
                + " NVL(TO_CHAR(DOB,'DD-MON-YYYY'),SYSDATE) DOB, GENDER, \n"
                + " FULL_NAME, RELATION, FACTORY, CRTD_DATE    \n"
                + " FROM "
                + Database.DCMS.pofPatients + "     \n"
                + " WHERE PL_NUMBER ='" + plNo + "' \n";
          System.out.println(query);
        List vec = Constants.dao.selectData(query, columns);
        List<OpdInformationBO> dpd = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            OpdInformationBO patientDetail = new OpdInformationBO();
            HashMap map = (HashMap) vec.get(i);
            patientDetail.setPatientId(map.get("PATIENT_ID").toString());
            patientDetail.setPlNumber(map.get("PL_NUMBER").toString());
            patientDetail.setDob(map.get("DOB").toString());
            patientDetail.setGender(map.get("GENDER").toString());
            patientDetail.setFullName(map.get("FULL_NAME").toString());
            patientDetail.setRelation(map.get("RELATION").toString());
            patientDetail.setFactoryName(map.get("FACTORY").toString());
            patientDetail.setCrtdDate(map.get("CRTD_DATE").toString());
            dpd.add(patientDetail);
        }
        return dpd;
    }
      
      public List<OpdInformationBO> searchPatientVisits(String patientId) {

        String[] columns = {"", "PATIENT_ID", "PL_NUMBER", "VISIT_NO",
            "PHYSICIAN_ID", "PHYSICIAN_NAME", "VISIT_NOTES", "VISIT_DATE"};

        String query = " SELECT PATIENT_ID, PL_NUMBER, VISIT_NO, PHYSICIAN_ID, \n"
                + " PHYSICIAN_NAME, VISIT_NOTES, "
                + " TO_CHAR(VISIT_DATE, 'DD-MON-YYYY') VISIT_DATE   \n"
                + " FROM "
                + Database.DCMS.pofPatientVisits + "           \n"
                + " WHERE PATIENT_ID ='" + patientId + "'      \n";

        List vec = Constants.dao.selectData(query, columns);
        List<OpdInformationBO> opdVisit = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            OpdInformationBO visitDetail = new OpdInformationBO();
            HashMap map = (HashMap) vec.get(i);
            visitDetail.setPatientId(map.get("PATIENT_ID").toString());
            visitDetail.setPlNumber(map.get("PL_NUMBER").toString());
            visitDetail.setVisitNo(map.get("VISIT_NO").toString());
            visitDetail.setPhysicianId(map.get("PHYSICIAN_ID").toString());
            visitDetail.setPhysicianName(map.get("PHYSICIAN_NAME").toString());
            visitDetail.setVisitNotes(map.get("VISIT_NOTES").toString());
            visitDetail.setVisitDate(map.get("VISIT_DATE").toString());
            opdVisit.add(visitDetail);
        }
        return opdVisit;
    }
      
       public List<OpdInformationBO> searchVisitMedicine(String visitNo) {

        String[] columns = {"", "VISIT_NO", "MEDICINE_ID", "MEDICINE_NAME",
                "INTAKE_DETAIL", "DURATION"};

        String query = " SELECT VISIT_NO, MEDICINE_ID, MEDICINE_NAME, "
                + "INTAKE_DETAIL, DURATION                     \n"
                + " FROM "
                + Database.DCMS.pofPatientVisitDetail+ "           \n"
                + " WHERE VISIT_NO ='" + visitNo + "'        \n";

        List vec = Constants.dao.selectData(query, columns);
        List<OpdInformationBO> Item=  new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            OpdInformationBO itemDetail = new OpdInformationBO();
            HashMap map = (HashMap) vec.get(i);
            itemDetail.setVisitNo(map.get("VISIT_NO").toString());
            itemDetail.setItemId(map.get("MEDICINE_ID").toString());
            itemDetail.setItemName(map.get("MEDICINE_NAME").toString());
            itemDetail.setIntakeDeatail(map.get("INTAKE_DETAIL").toString());
            itemDetail.setDuration(map.get("DURATION").toString());
            Item.add(itemDetail);
        }
        return Item;
       }
       
       public boolean insertPatientNotess(OpdInformationBO patientNotes) {
        String[] columns = {Database.DCMS.patientNotes,
            "ID", "PATIENT_ID", "NOTE_TYPE_ID", "NOTES", "ORDER_LOCATION_ID",
            "IS_FINAL", "ACTIVE", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID",
            "FINAL_DATE", "FINAL_BY", "FINAL_TERMINAL_ID", "NOTE_REF_ID"};

        HashMap mapVitals = new HashMap();
        mapVitals.put("ID", "(SELECT NVL(MAX(ID)+1, 1) FROM " + Database.DCMS.patientNotes + ")");
        mapVitals.put("PATIENT_ID", "'" + patientNotes.getPatientId() + "'");
        mapVitals.put("NOTE_TYPE_ID", "'6220'");
        mapVitals.put("NOTES", "'" + patientNotes.getVisitNo()+ "'");
        mapVitals.put("ORDER_LOCATION_ID", "'2974'");
        mapVitals.put("IS_FINAL", "'Y'");
        mapVitals.put("ACTIVE", "'Y'");
        mapVitals.put("CRTD_DATE", Constants.today);
        mapVitals.put("CRTD_BY", "'" + Constants.userId + "'");
        mapVitals.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        mapVitals.put("FINAL_DATE", Constants.today);
        mapVitals.put("FINAL_BY", "'" + Constants.userId + "'");
        mapVitals.put("FINAL_TERMINAL_ID", "'" + Constants.terminalId + "'");
        mapVitals.put("NOTE_REF_ID", "'0'");

        List vec = new ArrayList();
        vec.add(mapVitals);
        return Constants.dao.insertData(vec, columns);

    }

}

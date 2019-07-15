/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;

import BO.Hospital.DeathCertificate;
import BO.Hospital.DischargePatient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Status;

/**
 *
 * @author UsmanSaeed
 */
public class DeathCertificateHandler {

    GenerateKeys key = new GenerateKeys();
 
    public boolean updateSaveDeathCertificate(DeathCertificate objDc) {

        String query
                = " UPDATE " + Database.DCMS.deathCertificate + "\n SET "
                + "AGE_AT_DEATH = '" + objDc.getAgeAtDeath().trim() + "' ,"
                + "AUTOPSY = '" + objDc.getAutopsy() + "',"
                + "DEATH_CAUSE = '" + objDc.getDeathCause().trim() + "' ,"
                + "RECEIVED_BY = '" + objDc.getReceivedBy().trim() + "' ,"
                + "RELATION = '" + objDc.getRelation().trim() + "' ,"
                + "ORDER_STATUS_ID = '" + objDc.getOrderStatusId() + "' ,"
                + "PHYSICIAN_ID = '" + objDc.getPhysicianId().trim() + "' ,"
                + "ISSUE_DATE = '" + objDc.getIssueDate() + "' ,"
                + "OCCUPATION = '" + objDc.getOccupation().trim() + "' ,"
                + "NATIONALITY_ID = '" + objDc.getNationalityId().trim() + "' ,"
                + "SPOUSE_NAME = '" + objDc.getSpouseName().trim() + "' ,"
                + "CRTD_BY = '" + Constants.userId + "' ,"
                + "CRTD_DATE = " + Constants.today + " ,"
                + "CRTD_TERMINAL_ID = '" + Constants.terminalId + "' "
                + " WHERE PATIENT_ID  = '" + objDc.getPatientId().trim() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updateApproveDeathCertificate(DeathCertificate objDc) {

        String query
                = " UPDATE " + Database.DCMS.deathCertificate + "\n SET "
                + "AGE_AT_DEATH = '" + objDc.getAgeAtDeath().trim() + "' ,"
                + "AUTOPSY = '" + 'Y' + "',"
                + "DEATH_CAUSE = '" + objDc.getDeathCause().trim() + "' ,"
                + "RECEIVED_BY = '" + objDc.getReceivedBy().trim() + "' ,"
                + "RELATION = '" + objDc.getRelation().trim() + "' ,"
                + "OCCUPATION = '" + objDc.getOccupation().trim() + "' ,"
                + "PHYSICIAN_ID = '" + objDc.getPhysicianId().trim() + "' ,"
                + "NATIONALITY_ID = '" + objDc.getNationalityId().trim() + "' ,"
                + "ISSUE_DATE = '" + objDc.getIssueDate() + "' ,"
                + "ORDER_STATUS_ID = '" + Status.Approved + "' ,"
                + "SPOUSE_NAME = '" + objDc.getSpouseName()+ "' ,"
                + "CRTD_BY = '" + Constants.userId + "' ,"
                + "CRTD_DATE = " + Constants.today + " ,"
                + "CRTD_TERMINAL_ID = '" + Constants.terminalId + "' "
                + " WHERE PATIENT_ID  = '" + objDc.getPatientId().trim() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updatePatientInfo(DeathCertificate objDc) {

        String query
                = " UPDATE " + Database.DCMS.patient + "\n SET "
                + " ADDRESS = '" + objDc.getPresentAddress().trim() + "' ,"
                + " FATHER_NAME = '" + objDc.getFatherName().trim() + "' ,"
                + " CNIC = '" + objDc.getCnic().trim() + "' "
                + " WHERE PATIENT_ID  = '" + objDc.getPatientId().trim() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

     

    public List<DeathCertificate> selectDeathPatientInfo(String patId) {

        String colums[] = {"-", "PATIENT_ID", "FULL_NAME", "OCCUPATION",
            "AGE", "GENDER_ID", "GENDER", "CONTACT_NO", "CNIC", "ADDRESS",
            "FATHER_NAME", "MARITAL_STATUS_ID", "MARITAL_STATUS", "HUSBAND_NAME",
            "RELIGION_ID", "RELIGION", "AGE_AT_DEATH", "DEATH_CAUSE", "AUTOPSY",
            "RECEIVED_BY", "RELATION", "LOCATION_ID", "LOCATION", "ISSUE_DATE",
            "PHYSICIAN_ID", "PHYSICIAN", "NATIONALITY_ID", "NATIONALITY",
            "SPOUSE_NAME","CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"

        };

        String query = "SELECT NVL(DC.PATIENT_ID, ' ')PATIENT_ID           ,\n"
                + " NVL(PAT.FULL_NAME, ' ')            FULL_NAME            ,\n"
                + " NVL(PAT.HUSBAND_NAME, ' ')         HUSBAND_NAME         ,\n"
                + " NVL(DC.OCCUPATION, ' ')            OCCUPATION           ,\n"
                + " NVL(PAT.LOCATION_ID, ' ')          LOCATION_ID          ,\n"
                + " NVL(LOC.DESCRIPTION, ' ')          LOCATION             ,\n"
                + " NVL(PAT.AGE, ' ')                  AGE                  ,\n"
                + " PAT.GENDER_ID                      GENDER_ID            ,\n"
                + " DTD.DESCRIPTION                    GENDER               ,\n"
                + " NVL(PAT.CONTACT_NO, ' ')           CONTACT_NO           ,\n"
                + " NVL(DC.PHYSICIAN_ID, ' ')          PHYSICIAN_ID         ,\n"
                + " USR.USER_NAME                      PHYSICIAN            ,\n"
                + " NVL(PAT.CNIC, ' ')                 CNIC                 ,\n"
                + " NVL(PAT.ADDRESS, ' ')              ADDRESS              ,\n"
                + " NVL(PAT.FATHER_NAME, ' ')          FATHER_NAME          ,\n"
                + " PAT.MARITAL_STATUS_ID              MARITAL_STATUS_ID    ,\n"
                + " DDD.DESCRIPTION                    MARITAL_STATUS       ,\n"
                + " PAT.RELIGION_ID                    RELIGION_ID          ,\n"
                + " DFD.DESCRIPTION                    RELIGION             ,\n"
                + " NVL(DC.AGE_AT_DEATH, ' ')          AGE_AT_DEATH         ,\n"
                + " NVL(DC.NATIONALITY_ID,' ')         NATIONALITY_ID       ,\n"
                + " NVL(CON.COUNTRY_NAME, ' ')         NATIONALITY          ,\n"
                + " NVL(DC.DEATH_CAUSE, ' ')           DEATH_CAUSE          ,\n"
                + " NVL(DC.AUTOPSY, ' ')               AUTOPSY              ,\n"
                + " NVL(DC.RECEIVED_BY, ' ')           RECEIVED_BY          ,\n"
                + " NVL(DC.RELATION, ' ')              RELATION             ,\n"
                + " NVL(DC.SPOUSE_NAME, ' ')           SPOUSE_NAME          ,\n"
                + " TO_CHAR(DC.ISSUE_DATE,'DD-MON-YY') ISSUE_DATE           ,\n"
                + " DC.CRTD_BY                         CRTD_BY              ,\n"
                + " TO_CHAR(DC.CRTD_DATE ,'DD-MON-YY') CRTD_DATE            ,\n"
                + " DC.CRTD_TERMINAL_ID                CRTD_TERMINAL_ID      \n"
                + " FROM                                                     \n"
                + Database.DCMS.deathCertificate + " DC,                     \n"
                + Database.DCMS.definitionTypeDetail + " DDD,                \n"
                + Database.DCMS.definitionTypeDetail + " DFD,                \n"
                + Database.DCMS.definitionTypeDetail + " DTD,                \n"
                + Database.DCMS.location + "             LOC,                \n"
                + Database.DCMS.patient + "              PAT ,               \n"
                + Database.DCMS.users + "                USR ,               \n"
                + Database.DCMS.country + "              CON                 \n"
                + " WHERE PAT.GENDER_ID = DTD.ID                             \n"
                + " AND PAT.RELIGION_ID = DFD.ID                             \n"
                + " AND PAT.MARITAL_STATUS_ID = DDD.ID                       \n"
                + " AND PAT.LOCATION_ID = LOC.ID                             \n"
                + " AND NVL(DC.NATIONALITY_ID,'001') = CON.COUNTRY_ID        \n"
                + " AND DC.PATIENT_ID = PAT.PATIENT_ID                       \n"
                + " AND NVL(DC.PHYSICIAN_ID, 'GENERAL') = USR.USER_NAME      \n"
                + " AND DC.PATIENT_ID = '" + patId + "'                      \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<DeathCertificate> vecDC = new ArrayList<>();
        for (HashMap map : lis) {

            DeathCertificate objFS = new DeathCertificate();

            objFS.setPatientId(map.get("PATIENT_ID").toString());
            objFS.setPatientName(map.get("FULL_NAME").toString());
            objFS.setSpouseName(map.get("HUSBAND_NAME").toString());
            objFS.setOccupation(map.get("OCCUPATION").toString());
            objFS.setGenderId(map.get("GENDER_ID").toString());
            objFS.setGender(map.get("GENDER").toString());
            objFS.setLocationId(map.get("LOCATION_ID").toString());
            objFS.setLocation(map.get("LOCATION").toString());
            objFS.setAge(map.get("AGE").toString());
            objFS.setContactNo(map.get("CONTACT_NO").toString());
            objFS.setCnic(map.get("CNIC").toString());
            objFS.setPresentAddress(map.get("ADDRESS").toString());
            objFS.setFatherName(map.get("FATHER_NAME").toString());
            objFS.setMaritalStatusId(map.get("MARITAL_STATUS_ID").toString());
            objFS.setMaritalStatus(map.get("MARITAL_STATUS").toString());
            objFS.setPhysicianId(map.get("PHYSICIAN_ID").toString());
            objFS.setPhysician(map.get("PHYSICIAN").toString());
            objFS.setReligionId(map.get("RELIGION_ID").toString());
            objFS.setReligion(map.get("RELIGION").toString());
            objFS.setAgeAtDeath(map.get("AGE_AT_DEATH").toString());
            objFS.setDeathCause(map.get("DEATH_CAUSE").toString());
            objFS.setAutopsy(map.get("AUTOPSY").toString());
            objFS.setReceivedBy(map.get("RECEIVED_BY").toString());
            objFS.setRelation(map.get("RELATION").toString());
            objFS.setIssueDate(map.get("ISSUE_DATE").toString());
            objFS.setNationalityId(map.get("NATIONALITY_ID").toString());
            objFS.setNationality(map.get("NATIONALITY").toString());
            objFS.setSpouseName(map.get("SPOUSE_NAME").toString());
            objFS.setCrtdBy(map.get("CRTD_BY").toString());
            objFS.setCrtdDate(map.get("CRTD_DATE").toString());
            objFS.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            vecDC.add(objFS);
        }
        return vecDC;

    }

    public List<DischargePatient> selectPatientDiagnosis(String admisNo) {

        String colums[] = {"-", "DIAGNOSIS","SUMMARY"};

        String query = "SELECT                                            \n"
                + "NVL(PAH.DIAGNOSIS, ' ')       DIAGNOSIS,               \n"
                + "NVL(PAH.SUMMARY, ' ')         SUMMARY                  \n"
                + "FROM                                                   \n"
                + Database.DCMS.patientDischarge + "        PAH           \n"
                + "WHERE PAH.ADMISSION_NO = '" + admisNo + "'             \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<DischargePatient> vecDC = new ArrayList<>();
        for (HashMap map : lis) {

            DischargePatient objFS = new DischargePatient();

            objFS.setDiagnosisDescription(map.get("DIAGNOSIS").toString());
            objFS.setSummary(map.get("SUMMARY").toString());
            vecDC.add(objFS);
        }
        return vecDC;

    }

    public boolean updatePatientDischarge(String admissNo, DeathCertificate objDc) {

        String query
                = " UPDATE " + Database.DCMS.patientDischarge + "\n SET "
                + " SUMMARY = '" + objDc.getCaseSummary() + "' ,"
                + " DIAGNOSIS = '" + objDc.getDiagnosis().trim() + "' "
                + " WHERE ADMISSION_NO  = '" + admissNo + "'";

        return Constants.dao.executeUpdate(query, false);

    }
}

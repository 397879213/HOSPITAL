/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Client;

import BO.Patient;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.DAO;
import utilities.Database;
import utilities.GenerateKeys;

/**
 *
 * @author user
 */
public class EmployeeDataAccountHandler {

    GenerateKeys key = new GenerateKeys();

    public List<Patient> selectEmployeeInfo(String empId, String clientId, String patId) {

        String[] columns = {"-", "CLIENT_ID", "EMPLOYEE_ID", "PATIENT_ID",
            "FULL_NAME", "DEPARTMENT", "DESIGNATION", "ACTIVE",
            "GRADE", "DEPENDENTS", "EMER_CONTACT_NO"};

        String query = " SELECT  CEM.CLIENT_ID      CLIENT_ID   ,     \n"
                + "  CEM.EMPLOYEE_ID                EMPLOYEE_ID ,     \n"
                + "  CED.PATIENT_ID                 PATIENT_ID ,      \n"
                + "  CED.FULL_NAME                  FULL_NAME ,       \n"
                + "  CEM.DESIGNATION                DESIGNATION ,     \n"
                + "  CEM.DEPARTMENT                 DEPARTMENT  ,     \n"
                + "  CEM.GRADE                      GRADE ,           \n"
                + "  CEM.ACTIVE                     ACTIVE ,          \n"
                + "  CEM.DEPENDENTS                 DEPENDENTS,       \n"
                + "  CEM.EMERGENCY_CONTACT_NO       EMER_CONTACT_NO   \n"
                + "  FROM " + Database.DCMS.clientWiseEmployee + " CEM, \n"
                + Database.DCMS.clientEmployeeFamily + " CED       \n"
                + " WHERE CEM.EMPLOYEE_ID = CED.CLIENT_WISE_EMP_ID      \n";
        if (empId.length() != 0) {
            query += " AND CEM.EMPLOYEE_ID = '" + empId + "'            \n";
        }

        if (clientId.length() != 0) {
            query += "  AND CEM.CLIENT_ID = NVL('" + clientId + "',CEM.CLIENT_ID)\n";
        }
        if (patId.length() != 0) {
            query += "  AND CED.PATIENT_ID = '" + patId + "'            \n";
        }

        List list = Constants.dao.selectData(query, columns);
        List empInfoSearch = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

            HashMap map = (HashMap) list.get(i);
            Patient user = new Patient();
            user.setClientId(map.get("CLIENT_ID").toString());
            user.setPatientId(map.get("PATIENT_ID").toString());
            user.setEmployeeId(map.get("EMPLOYEE_ID").toString());
            user.setFullName(map.get("FULL_NAME").toString());
            user.setDepartment(map.get("DEPARTMENT").toString());
            user.setEmpDesignation(map.get("DESIGNATION").toString());
            user.setGrade(map.get("GRADE").toString());
            user.setActive(map.get("ACTIVE").toString());
            user.setTotalDependents(map.get("DEPENDENTS").toString());
            user.setEmergencyContactNo(map.get("EMER_CONTACT_NO").toString());
            empInfoSearch.add(user);
        }
        return empInfoSearch;
    }

    public boolean updateClient(Patient updateClient) {

        String query
                = " UPDATE " + Database.DCMS.patient + "\n SET "
                + " CLIENT_ID  = '" + updateClient.getClientId() + "'  \n"
                + " WHERE PATIENT_ID = '" + updateClient.getPatientId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertClientWiseEmpHistory(Patient pat) {

        String[] columns = {Database.DCMS.clientEmployeeApproval,
            "PATIENT_ID", "EMP_DETAIL_ID", "APPROVAL_TYPE_ID", "REMARKS",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("PATIENT_ID", "'" + pat.getPatientId() + "'");
        map.put("EMP_DETAIL_ID", "'" + pat.getEmployeeId() + "'");
        map.put("APPROVAL_TYPE_ID", "'" + pat.getApprovalTypeId() + "'");
        map.put("REMARKS", "'" + pat.getRemarks() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);

    }

    public boolean insertClientWiseEmployee(Patient emp) {

        String[] columns = {Database.DCMS.clientEmployeeData, "EMPLOYEE_ID",
            "CNIC_NO", "CLIENT_ID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"
        };

        HashMap mapTeam = new HashMap();

        mapTeam.put("EMPLOYEE_ID", "'" + emp.getEmployeeId() + "'");
        mapTeam.put("CNIC_NO", "'" + emp.getCnic() + "'");
        mapTeam.put("CLIENT_ID", "'" + emp.getClientId() + "'");
        mapTeam.put("CRTD_BY", "'" + Constants.userId + "'");
        mapTeam.put("CRTD_DATE", "" + Constants.today + "");
        mapTeam.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listUsers = new ArrayList();
        listUsers.add(mapTeam);
        return Constants.dao.insertData(listUsers, columns);

    }

    public List<Patient> selectClientWiseEmpInfo(String empId, String clientId) {

        String[] columns = {"-", "EMPLOYEE_ID", "RELATION_NAME", "AGE", "DOB",
            "CNIC_NO", "GENDER_ID", "GENDER", "CONTACT_NO", "RELATION_ID", "RELATION",
            "MARITAL_STATUS_ID", "MARITAL_STATUS", "ID", "PATIENT_ID", "ADDRESS",
            "CLIENT_ID", "ACTIVE", "PIC_UPLOADED", "CLIENT_ROW_ID", "TABLE_NAME",
            "INFO_UPDATED", "VERIFICATION_STATUS"};

        String query = " SELECT CWE.CLIENT_WISE_EMP_ID EMPLOYEE_ID,      \n"
                + "  CWE.FULL_NAME                    RELATION_NAME,     \n"
                + "  NVL(CWE.AGE,' ')                 AGE ,              \n"
                + "  TO_CHAR(NVL(CWE.DOB,SYSDATE), 'DD-MON-YYYY')DOB ,   \n"
                + "  NVL(CWE.CNIC_NO,' ')             CNIC_NO,           \n"
                + "  CWE.GENDER_ID                    GENDER_ID,         \n"
                + "  NVL(GEN.DESCRIPTION,' ')         GENDER,            \n"
                + "  NVL(CWE.CONTACT_NO,0)            CONTACT_NO,        \n"
                + "  NVL(CWE.RELATION_ID,0)           RELATION_ID,       \n"
                + "  NVL(RTN.DESCRIPTION,' ')         RELATION,          \n"
                + "  NVL(CWE.MARITAL_STATUS_ID,0)     MARITAL_STATUS_ID, \n"
                + "  NVL(MTS.DESCRIPTION,' ')         MARITAL_STATUS,    \n"
                + "  CWE.ID                           ID,                \n"
                + "  NVL(CWE.PATIENT_ID,' ')          PATIENT_ID,        \n"
                + "  NVL(CWE.ADDRESS,' ')             ADDRESS,           \n"
                + "  NVL(CWE.CLIENT_ID,0)             CLIENT_ID,         \n"
                + "  CWE.ACTIVE                       ACTIVE,            \n"
                + "  NVL(CWE.CLIENT_ROW_ID, ' ')      CLIENT_ROW_ID,     \n"
                + "  NVL(CWE.TABLE_NAME, ' ')         TABLE_NAME,        \n"
                + "  CWE.PIC_UPLOADED                 PIC_UPLOADED,      \n"
                + "  PAT.INFO_UPDATED                 INFO_UPDATED,      \n"
                + "  PAT.VERIFICATION_STATUS          VERIFICATION_STATUS\n"
                + "  FROM "
                + Database.DCMS.clientEmployeeFamily + " CWE,            \n"
                + Database.DCMS.patient + "              PAT,            \n"
                + Database.DCMS.definitionTypeDetail + " GEN,            \n"
                + Database.DCMS.definitionTypeDetail + " RTN,            \n"
                + Database.DCMS.definitionTypeDetail + " MTS             \n"
                + " WHERE CWE.CLIENT_ID = '" + clientId + "'             \n"
                + " AND CWE.CLIENT_WISE_EMP_ID = '" + empId + "'         \n"
                + " AND CWE.PATIENT_ID = PAT.PATIENT_ID                  \n"
                + " AND CWE.RELATION_ID = RTN.ID                         \n"
                + " AND CWE.GENDER_ID = GEN.ID                           \n"
                + " AND CWE.MARITAL_STATUS_ID = MTS.ID                   \n";

        List list = Constants.dao.selectData(query, columns);
        List clientWiseEmpSearch = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

            HashMap map = (HashMap) list.get(i);
            Patient user = new Patient();
            user.setEmployeeId(map.get("EMPLOYEE_ID").toString());
            user.setFullName(map.get("RELATION_NAME").toString());
            user.setRelation(map.get("RELATION").toString());
            user.setCnic((String) map.get("CNIC_NO"));
            user.setDob(map.get("DOB").toString());
            user.setActive(map.get("ACTIVE").toString());
            user.setId(map.get("ID").toString());
            user.setAge(map.get("AGE").toString());
            user.setContactNo(map.get("CONTACT_NO").toString());
            user.setPatientId(map.get("PATIENT_ID").toString().trim());
            user.setGenderId(map.get("GENDER_ID").toString());
            user.setGenderDescription(map.get("GENDER").toString());
            user.setMaritalStatusId(map.get("MARITAL_STATUS_ID").toString());
            user.setMaritalStatusDescription(map.get("MARITAL_STATUS").toString());
            user.setRelationId(map.get("RELATION_ID").toString());
            user.setRelation(map.get("RELATION").toString());
            user.setClientId(map.get("CLIENT_ID").toString());
            user.setAddress(map.get("ADDRESS").toString());
            user.setRowId(map.get("CLIENT_ROW_ID").toString());
            user.setTableName(map.get("TABLE_NAME").toString());
            user.setPictureUploaded(map.get("PIC_UPLOADED").toString());
            user.setInfoUpdated(map.get("INFO_UPDATED").toString());
            user.setVerificationStatus(map.get("VERIFICATION_STATUS").toString());
            clientWiseEmpSearch.add(user);

        }
        return clientWiseEmpSearch;
    }

    public boolean insertClientEmployee(Patient emp) {

        String[] columns = {Database.DCMS.clientEmployeeData, "PATIENT_ID",
            "CLIENT_ID", "EMPLOYEE_ID", "EMPLOYEE_NAME", "EMPLOYEE_CNIC",
            "DEPARTMENT", "DESIGNATION", "GRADE", "AGE", "GENDER_ID", "CONTACT_NO",
            "ADDRESS", "RELATION_ID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"
        };

        HashMap mapTeam = new HashMap();

        mapTeam.put("PATIENT_ID", "'" + emp.getPatientId() + "'");
        mapTeam.put("CLIENT_ID", "'" + emp.getClientId() + "'");
        mapTeam.put("EMPLOYEE_ID", "'" + emp.getEmployeeId() + "'");
        mapTeam.put("EMPLOYEE_NAME", "'" + emp.getFullName() + "'");
        mapTeam.put("EMPLOYEE_CNIC", "'" + emp.getCnic() + "'");
        mapTeam.put("DEPARTMENT", "'" + emp.getDepartment() + "'");
        mapTeam.put("DESIGNATION", "'" + emp.getEmpDesignation() + "'");
        mapTeam.put("GRADE", "'" + emp.getGrade() + "'");
        mapTeam.put("AGE", "'" + emp.getAge() + "'");
        mapTeam.put("GENDER_ID", "'" + emp.getGenderId() + "'");
        mapTeam.put("CONTACT_NO", "'" + emp.getContactNo() + "'");
        mapTeam.put("ADDRESS", "'" + emp.getAddress() + "'");
        mapTeam.put("RELATION_ID", "'" + emp.getRelationId() + "'");
        mapTeam.put("CRTD_BY", "'" + Constants.userId + "'");
        mapTeam.put("CRTD_DATE", "" + Constants.today + "");
        mapTeam.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listUsers = new ArrayList();
        listUsers.add(mapTeam);
        return Constants.dao.insertData(listUsers, columns);

    }

    public boolean updateEmployeeInfo(Patient emp) {

        {
            String query
                    = " UPDATE " + Database.DCMS.clientEmployeeFamily + "\n SET "
                    + " CONTACT_NO  = '" + emp.getContactNo() + "', \n"
                    + " CNIC_NO  = '" + emp.getCnic() + "'  \n"
                    + " WHERE ID = '" + emp.getId() + "'";

            return Constants.dao.executeUpdate(query, false);
        }

    }

    public boolean updatePatientId(String patientId, Patient emp, String attachType) {

        String query
                = " UPDATE " + Database.DCMS.clientEmployeeFamily + "\n SET "
                + " PATIENT_ID  = '" + patientId + "',  \n"
                + " CONTACT_NO  = '" + emp.getContactNo() + "', \n"
                + " CNIC_NO  = '" + emp.getCnic() + "',  \n"
                + " ADDRESS  = '" + emp.getAddress().replaceAll("'", "''") + "' , \n"
                + " MARITAL_STATUS_ID = " + emp.getMaritalStatusId() + " , \n"
                + " MRNO_ATTACHED_BY = '" + Constants.userId + "',  \n"
                + " MRNO_ATTACHED_TERMINAL = '" + Constants.terminalId + "',  \n"
                + " MRNO_ATTACH_TYPE = '" + attachType + "',  \n"
                + " MRNO_ATTACHED_DATE = SYSDATE  \n"
                + " WHERE ID = '" + emp.getId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertClientWiseInfo(Patient pat) {

        String[] columns = {Database.DCMS.clientWiseEmployee,
            "CLIENT_ID", "EMPLOYEE_ID", "DEPARTMENT", "DESIGNATION",
            "GRADE", "DEPENDENTS", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("CLIENT_ID", pat.getClientId());
        map.put("EMPLOYEE_ID", "'" + pat.getEmployeeId() + "'");
        map.put("DEPARTMENT", "'" + pat.getDepartment() + "'");
        map.put("DESIGNATION", "'" + pat.getEmpDesignation() + "'");
        map.put("GRADE", "'" + pat.getGrade() + "'");
        map.put("DEPENDENTS", "'" + pat.getTotalDependents() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);

    }

    public boolean insertEmpIDInCED(Patient pat) {

        String[] columns = {Database.DCMS.clientEmployeeFamily, "CLIENT_WISE_EMP_ID",
            "FULL_NAME", "DOB", "CLIENT_ID", "ID", "CRTD_TERMINAL_ID", "AGE",
            "CRTD_BY", "GENDER_ID", "MARITAL_STATUS_ID", "CONTACT_NO",
            "CNIC_NO", "RELATION_ID"};

        String[] cols = {"-", "MAX_ID"};
        String query = " SELECT NVL(MAX(ID),0)+1 MAX_ID FROM "
                + Database.DCMS.clientEmployeeFamily;
        List<HashMap> list = Constants.dao.selectData(query, cols);
        HashMap map = new HashMap();
        map.put("CLIENT_WISE_EMP_ID", "'" + pat.getEmployeeId() + "'");
        map.put("FULL_NAME", "'" + pat.getFullName() + "'");
        map.put("CLIENT_ID", "'" + pat.getClientId() + "'");
        map.put("GENDER_ID", "'" + pat.getGenderId() + "'");
        map.put("CONTACT_NO", "'" + pat.getContactNo() + "'");
        map.put("CNIC_NO", "'" + pat.getCnic() + "'");
        map.put("RELATION_ID", "'" + pat.getRelationId() + "'");
        map.put("MARITAL_STATUS_ID", "'" + pat.getMaritalStatusId() + "'");
        map.put("ID", "'" + list.get(0).get("MAX_ID").toString() + "'");
        map.put("AGE", "'" + pat.getAge() + "'");
        map.put("DOB", " TO_DATE ('" + pat.getDob() + "', 'DD-MON-YYYY')");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<Patient> searchClientInfo(String empId, String clientId) {

        String colums[] = {"-", "EMPLOYEE_ID", "DEPARTMENT", "DESIGNATION",
            "GRADE", "TOTAL_DEPENDENTS", "CLIENT_NAME"};

        String query = " SELECT CWE.EMPLOYEE_ID     EMPLOYEE_ID ,       \n"
                + " CWE.DEPARTMENT                  DEPARTMENT ,        \n"
                + " CWE.DESIGNATION                 DESIGNATION ,       \n"
                + " CLT.DESCRIPTION                 CLIENT_NAME ,       \n"
                + " CWE.GRADE                       GRADE ,             \n"
                + " CWE.DEPENDENTS                  TOTAL_DEPENDENTS    \n"
                + " FROM                                                \n"
                + Database.DCMS.clientWiseEmployee + "        CWE,      \n"
                + Database.DCMS.client + "                    CLT       \n"
                + " WHERE CWE.CLIENT_ID =  " + clientId + "             \n"
                + " AND   CWE.EMPLOYEE_ID = '" + empId + "'             \n"
                + " AND   CWE.CLIENT_ID = CLT.ID                        \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, colums);

        List<Patient> listEmp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            Patient pat = new Patient();
            pat.setEmployeeId(map.get("EMPLOYEE_ID").toString());
            pat.setDepartment(map.get("DEPARTMENT").toString());
            pat.setEmpDesignation(map.get("DESIGNATION").toString());
            pat.setClientDescription(map.get("CLIENT_NAME").toString());
            pat.setGrade(map.get("GRADE").toString());
            pat.setClientId(clientId);
            pat.setTotalDependents(map.get("TOTAL_DEPENDENTS").toString());
            listEmp.add(pat);
        }
        return listEmp;
    }

    public boolean isEmployeeRegistered(String empId, String clientId) {

        String colums[] = {"-", "EMPLOYEE_ID"};

        String query = " SELECT CWE.EMPLOYEE_ID EMPLOYEE_ID             \n"
                + " FROM                                                \n"
                + Database.DCMS.clientWiseEmployee + "  CWE             \n"
                + " WHERE CWE.CLIENT_ID =  " + clientId + "             \n"
                + " AND CWE.EMPLOYEE_ID = '" + empId + "'               \n";

        return Constants.dao.selectDatainList(query, colums).isEmpty();

    }

    public boolean UpdateClientsFamily(Patient pat) {

        String query
                = " UPDATE " + Database.DCMS.clientEmployeeFamily + "\n SET "
                + " FULL_NAME  = '" + pat.getFullName() + "', \n"
                + " CONTACT_NO  = '" + pat.getContactNo() + "', \n"
                + " AGE  = '" + pat.getAge() + "', \n"
                + " DOB  = '" + pat.getDob() + "', \n"
                + " CNIC_NO  = '" + pat.getCnic() + "', \n"
                + " GENDER  = '" + pat.getGenderDescription() + "', \n"
                + " RELATION_ID  = '" + pat.getRelation() + "', \n"
                + " MARITAL_STATUS_ID  = '" + pat.getMaritalStatusDescription() + "' \n"
                //                    + " WHERE CLIENT_WISE_EMP_ID = '" + pat.getEmployeeId() + "'\n"
                + " WHERE ID = '" + pat.getId() + "'                       \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public List<Patient> selectClientWiseEmpInfo(String empId) {

        String[] columns = {"-", "EMPLOYEE_ID", "RELATION_NAME", "RELATION",
            "CNIC_NO", "ID", "AGE", "CONTACT_NO", "PATIENT_ID", "GENDER",
            "GRADE", "DESIGNATION", "DEPARTMENT", "DOB"};
        String query = "SELECT                                       \n"
                + "  CWE.CLIENT_WISE_EMP_ID              EMPLOYEE_ID , \n"
                + "  NVL(CWE.FULL_NAME,' ')              RELATION_NAME,\n"
                + "  NVL(CWE.RELATION_ID,' ')            RELATION,     \n"
                + "  NVL(CWE.CNIC_NO,' ')                CNIC_NO ,     \n"
                + "  NVL(CWE.ID,0)                       ID ,          \n"
                + "  NVL(CWE.AGE,' ')                    AGE ,         \n"
                + "  NVL(CWE.CONTACT_NO,' ')             CONTACT_NO,   \n"
                + "  NVL(CWE.PATIENT_ID,' ')             PATIENT_ID,   \n"
                + "  NVL(CWE.GENDER,' ')                 GENDER ,      \n"
                + "  NVL(CE.GRADE,' ')                   GRADE ,       \n"
                + "  NVL(CE.DESIGNATION,' ')             DESIGNATION,  \n"
                + "  NVL(DTD.DESCRIPTION,' ')            DEPARTMENT,   \n"
                + "  NVL(CWE.DOB,' ')                    DOB           \n"
                + "  FROM "
                + Database.DCMS.clientEmployeeFamily + " CWE ,         \n"
                + Database.DCMS.clientWiseEmployee + " CE,             \n"
                + Database.DCMS.definitionTypeDetail + " DTD           \n"
                + " WHERE CWE.CLIENT_WISE_EMP_ID = CE.EMPLOYEE_ID "
                + " AND CE.DEPARTMENT =DTD.ID ";

        if (!empId.isEmpty()) {
            query += " AND CWE.CLIENT_WISE_EMP_ID = '" + empId + "'    \n";
        }

        List list = Constants.dao.selectData(query, columns);
        List clientWiseEmpSearch = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

            HashMap map = (HashMap) list.get(i);
            Patient user = new Patient();
            user.setEmployeeId(map.get("EMPLOYEE_ID").toString());
            user.setFullName(map.get("RELATION_NAME").toString());
            user.setRelation(map.get("RELATION").toString());
            user.setCnic((String) map.get("CNIC_NO"));
            user.setId(map.get("ID").toString());
            user.setAge(map.get("AGE").toString());
            user.setContactNo(map.get("CONTACT_NO").toString());
            user.setPatientId(map.get("PATIENT_ID").toString());
            user.setGenderDescription(map.get("GENDER").toString());
            user.setGrade(map.get("GRADE").toString());
            user.setEmpDesignation(map.get("DESIGNATION").toString());
            user.setDepartment(map.get("DEPARTMENT").toString());
            user.setDob(map.get("DOB").toString());

            clientWiseEmpSearch.add(user);
        }

        return clientWiseEmpSearch;
    }

    public boolean insertEmployeeUpdateHistory(Patient pat) {
        String[] columns = {Database.DCMS.employeeDetailHistory,
            "CLIENT_WISE_EMP_ID", "FULL_NAME", "AGE", "DOB", "CNIC_NO",
            "GENDER_ID", "CONTACT_NO", "RELATION_ID", "MARITAL_STATUS_ID",
            "PATIENT_ID", "CLIENT_ID", "ADDRESS", "PIC_UPLOADED", "ID",
            "ACTIVE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("CLIENT_WISE_EMP_ID", "'" + pat.getEmployeeId() + "'");
        map.put("FULL_NAME", "'" + pat.getFullName() + "'");
        map.put("AGE", "'" + pat.getAge() + "'");
        map.put("DOB", "'" + pat.getDob() + "'");
        map.put("CNIC_NO", "'" + pat.getCnic() + "'");
        map.put("GENDER_ID", "'" + pat.getGenderId() + "'");
        map.put("CONTACT_NO", "'" + pat.getContactNo() + "'");
        map.put("RELATION_ID", "'" + pat.getRelationId() + "'");
        map.put("MARITAL_STATUS_ID", "'" + pat.getMaritalStatusId() + "'");
        map.put("CLIENT_ID", "'" + pat.getClientId() + "'");
        map.put("ADDRESS", "'" + pat.getAddress() + "'");
        map.put("PIC_UPLOADED", "'" + pat.getActive() + "'");
        map.put("ID", "'" + pat.getId() + "'");
        map.put("ACTIVE", "'" + pat.getActive() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);

    }

    public List<Patient> selectCientEmployeeDocs(String patId) {

        String[] columns = {"-", "PATIENT_ID", "PAT_NAME", "EMP_DETAIL_ID", "DOC_TYPE_ID",
            "DOC_NAME", "ACTIVE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID",
            "ACTION", "REMARKS", "ACTION_BY", "ACTION_DATE", "ACTION_TERMINAL_ID"};

        String query = " SELECT  DOC.PATIENT_ID      PATIENT_ID   ,              \n"
                + "  CED.FULL_NAME                   PAT_NAME ,                  \n"
                + "  DOC.EMP_DETAIL_ID               EMP_DETAIL_ID ,             \n"
                + "  DOC.DOC_TYPE_ID                 DOC_TYPE_ID ,               \n"
                + "  DT.DESCRIPTION                  DOC_NAME ,                  \n"
                + "  DOC.ACTIVE                      ACTIVE ,                    \n"
                + "  DOC.CRTD_BY                     CRTD_BY ,                   \n"
                + "  DOC.CRTD_DATE                   CRTD_DATE ,                 \n"
                + "  DOC.CRTD_TERMINAL_ID            CRTD_TERMINAL_ID ,          \n"
                + "  NVL(DOC.ACTION, ' ')            ACTION ,                    \n"
                + "  NVL(DOC.REMARKS, ' ')           REMARKS ,                   \n"
                + "  DOC.ACTION_BY                   ACTION_BY ,                 \n"
                + "  DOC.ACTION_DATE                 ACTION_DATE ,               \n"
                + "  DOC.ACTION_TERMINAL_ID          ACTION_TERMINAL_ID          \n"
                + "  FROM " + Database.DCMS.clientEmployeeDocs + " DOC ,         \n"
                + Database.DCMS.definitionTypeDetail + " DT   ,                  \n"
                + Database.DCMS.clientEmployeeFamily + " CED                     \n"
                + "  WHERE DOC.PATIENT_ID = '" + patId + "'                      \n"
                + "  AND   DOC.DOC_TYPE_ID =  DT.ID                              \n"
                + "  AND   DOC.PATIENT_ID = CED.PATIENT_ID                       \n";

        List list = Constants.dao.selectData(query, columns);
        List empDocumentInfo = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

            HashMap map = (HashMap) list.get(i);
            Patient document = new Patient();
            document.setPatientId(map.get("PATIENT_ID").toString());
            document.setFullName(map.get("PAT_NAME").toString());
            document.setEmployeeId(map.get("EMP_DETAIL_ID").toString());
            document.setDocTypeId(map.get("DOC_TYPE_ID").toString());
            document.setDocDescription(map.get("DOC_NAME").toString());
            document.setActive(map.get("ACTIVE").toString());
            document.setCrtdBy(map.get("CRTD_BY").toString());
            document.setCrtdDate(map.get("CRTD_DATE").toString());
            document.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            document.setAction(map.get("ACTION").toString());
            document.setRemarks(map.get("REMARKS").toString());
            document.setActionBy(map.get("ACTION_BY").toString());
            document.setActionDate(map.get("ACTION_DATE").toString());
            document.setActionTerminalId(map.get("ACTION_TERMINAL_ID").toString());
            empDocumentInfo.add(document);
        }
        return empDocumentInfo;
    }

    public Image selectDocumentImage(String patId, String docTypeId) {

        String query = "SELECT PICTURE FROM "
                + Database.DCMS.clientEmployeeDocs + " WHERE PATIENT_ID = '" + patId + "'"
                + "AND DOC_TYPE_ID = '" + docTypeId + "'";
        System.out.println(query);
        Image image = null;
        Connection conn = null;
        try {
            if (DAO.conn == null || DAO.conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }

            // Prepare a Statement:
            PreparedStatement stmnt = DAO.conn.prepareStatement(query);
            // Execute
            ResultSet rs = stmnt.executeQuery();
            if (rs.next()) {
                try {
                    // Get as a BLOB
                    Blob aBlob = rs.getBlob(1);
                    byte[] allBytesInBlob = aBlob.getBytes(1, (int) aBlob.length());

                    image = Toolkit.getDefaultToolkit().createImage(allBytesInBlob);

                } catch (Exception ex) {
                    byte[] bytes;
                    bytes = rs.getBytes(1);
                    System.out.print("Image is not Find");

                }
            }

            // Close resources
            rs.close();
            stmnt.close();
            //conn.close();
            // Constants.dao.conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error when trying to read BLOB: " + ex);
        }
        return image;
    }

    public boolean UpdateOnContactNo(Patient pat) {

        String query
                = " UPDATE " + Database.DCMS.clientEmployeeFamily + " \n SET "
                + " CONTACT_NO  = '" + pat.getContactNo() + "'        \n"
                + " WHERE ID = '" + pat.getId() + "'                  \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public List<Patient> searchClientApproval(String patId) {
        String colums[] = {"-", "PATIENT_ID", "EMP_DETAIL_ID",
            "APPROVAL_TYPE_ID", "APPROVAL_DESCRIPTION", "REMARKS", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query = " SELECT CEA.PATIENT_ID     PATIENT_ID ,         \n"
                + " CEA.EMP_DETAIL_ID              EMP_DETAIL_ID ,      \n"
                + " CEA.APPROVAL_TYPE_ID           APPROVAL_TYPE_ID ,   \n"
                + " DT.DESCRIPTION                 APPROVAL_DESCRIPTION,\n"
                + " NVL(CEA.REMARKS,'')            REMARKS ,            \n"
                + " CEA.CRTD_BY                    CRTD_BY,             \n"
                + " CEA.CRTD_DATE                  CRTD_DATE,           \n"
                + " CEA.CRTD_TERMINAL_ID           CRTD_TERMINAL_ID     \n"
                + " FROM                                                \n"
                + Database.DCMS.clientEmployeeApproval + "     CEA,     \n"
                + Database.DCMS.definitionTypeDetail + "       DT       \n"
                + " WHERE CEA.PATIENT_ID =  '" + patId + "'              \n"
                + " AND CEA.APPROVAL_TYPE_ID =  DT.ID                  \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, colums);

        List<Patient> listEmp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            Patient pat = new Patient();
            pat.setPatientId(map.get("PATIENT_ID").toString());
            pat.setEmployeeId(map.get("EMP_DETAIL_ID").toString());
            pat.setApprovalTypeId(map.get("APPROVAL_TYPE_ID").toString());
            pat.setApprovalDescription(map.get("APPROVAL_DESCRIPTION").toString());
            pat.setRemarks(map.get("REMARKS").toString());
            pat.setCrtdBy(map.get("CRTD_BY").toString());
            pat.setCrtdDate(map.get("CRTD_DATE").toString());
            pat.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            listEmp.add(pat);
        }
        return listEmp;
    }

    public boolean deleteDocument(String patId, String docTypeId) {

        String query
                = " DELETE FROM " + Database.DCMS.clientEmployeeDocs + "\n"
                + " WHERE PATIENT_ID = '" + patId + "'                    \n"
                + " AND DOC_TYPE_ID = '" + docTypeId + "'                 \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean insertAuditLogInsert(Patient pat) {

        String[] columns = {Database.DCMS.auditLog, "PATIENT_ID", "PL_NUMBER",
            "FACTORY_ID", "DB_NAME", "DOB", "CONTACT_NO", "CNIC", "NAME",
            "RELATION", "CRTD_DATE", "ACTION", "ACTION_BY", "ACTION_DATE",
            "ACTION_TERMINAL_ID", "ROW_ID", "TABLE_NAME"};

        String[] cols = {"-", "MAX_ID"};
        String query = " SELECT NVL(MAX(ID),0)+1 MAX_ID FROM "
                + Database.DCMS.clientEmployeeFamily;
        List<HashMap> list = Constants.dao.selectData(query, cols);
        HashMap map = new HashMap();
        map.put("PATIENT_ID", "'" + pat.getPatientId() + "'");
        map.put("PL_NUMBER", "'" + pat.getEmployeeId() + "'");
        map.put("FACTORY_ID", "'" + pat.getClientId() + "'");
        map.put("DB_NAME", "' '");
        map.put("DOB", " TO_DATE ('" + pat.getDob() + "', 'DD-MON-YYYY')");
        map.put("CONTACT_NO", "'" + pat.getContactNo() + "'");
        map.put("CNIC", "'" + pat.getCnic() + "'");
        map.put("NAME", "'" + pat.getFullName() + "'");
        map.put("RELATION", "'" + pat.getRelationId() + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("ACTION", "'N'");
        map.put("ACTION_BY", "'" + Constants.userId + "'");
        map.put("ACTION_DATE", "'" + pat.getActionDate() + "'");
        map.put("ACTION_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("ROW_ID", "'" + pat.getRowIndex() + "'");
        map.put("TABLE_NAME", "'" + pat.getAction() + "'");
        map.put("DOB", " TO_DATE ('" + pat.getDob() + "', 'DD-MON-YYYY')");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean UpdateInfoUpdatedColumn(Patient pat) {

        String query
                = " UPDATE " + Database.DCMS.patient + " \n SET "
                + " INFO_UPDATED  = 'Y'                               \n"
                + " WHERE ID = '" + pat.getId() + "'                  \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean UpdateforCnic(Patient pat) {

        String query
                = " UPDATE " + Database.DCMS.clientEmployeeFamily + " \n SET "
                + " VERIFICATION_STATUS  = 'Y'                        \n"
                + " WHERE ID = '" + pat.getId() + "'                  \n";

        return Constants.dao.executeUpdate(query, false);

    }

}

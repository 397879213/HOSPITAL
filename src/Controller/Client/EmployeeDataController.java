/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Client;

import BO.Patient;
import Handler.Client.EmployeeDataAccountHandler;
import Handler.PatientHandler;
import java.awt.Image;
import java.util.List;
import utilities.Clients;
import utilities.Constants;
import utilities.Database;

public class EmployeeDataController {

    EmployeeDataAccountHandler hdlEmployeeData = new EmployeeDataAccountHandler();

    public List<Patient> selectEmployeeInfo(String empId, String clientId, String patId) {
        return hdlEmployeeData.selectEmployeeInfo(empId, clientId, patId);
    }

    public boolean insertClientWiseEmployee(Patient emp) {

        boolean ret = hdlEmployeeData.insertClientWiseEmployee(emp);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<Patient> selectClientWiseEmpInfo(String empId, String clientId) {

        return hdlEmployeeData.selectClientWiseEmpInfo(empId, clientId);
    }

    public boolean insertClientEmployee(Patient emp) {
        boolean ret = hdlEmployeeData.insertClientEmployee(emp);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean medicineApproval(Patient updateClient, Patient insertHistory) {

        boolean ret = hdlEmployeeData.updateClient(updateClient);
        if (ret) {
            ret = hdlEmployeeData.insertClientWiseEmpHistory(insertHistory);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean UpdateEmergencyContactNo(Patient pat) {

        String query
                = " UPDATE " + Database.DCMS.clientWiseEmployee + "\n SET "
                + " EMERGENCY_CONTACT_NO  = '" + pat.getEmergencyContactNo() + "'  \n"
                + " WHERE EMPLOYEE_ID = '" + pat.getEmployeeId() + "'       \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updateEmployeeInfo(Patient emp) {

        String query = " UPDATE " + Database.DCMS.clientEmployeeFamily + "\n "
                + " SET CONTACT_NO  = '" + emp.getContactNo() + "', \n"
                + " CNIC_NO  = '" + emp.getCnic() + "' , \n"
                + " ACTIVE  = '" + emp.getActive() + "' , \n"
                + " ADDRESS  = '" + emp.getAddress().replaceAll("'", "''") + "' , \n"
                + " MARITAL_STATUS_ID = " + emp.getMaritalStatusId() + " , \n"
                + " DOB  = TO_DATE('" + emp.getDob() + "', 'DD-MON-YYYY')  \n"
                + " WHERE ID = '" + emp.getId() + "'";

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret && emp.getPatientId().trim().length() == Integer.parseInt(Constants.mrnoLength) + 3) {

            query = " UPDATE " + Database.DCMS.patient + "  \n"
                    + " SET CONTACT_NO  = '" + emp.getContactNo() + "', \n"
                    + " MARITAL_STATUS_ID = " + emp.getMaritalStatusId() + " , \n"
                    + " CNIC  = '" + emp.getCnic() + "' , \n"
                    + " DOB  = TO_DATE('" + emp.getDob() + "', 'DD-MON-YYYY')  \n"
                    + " WHERE PATIENT_ID = '" + emp.getPatientId() + "'";

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = hdlEmployeeData.insertEmployeeUpdateHistory(emp);
        }
        if (ret && emp.getActive().equalsIgnoreCase("N")) {
            query = " UPDATE " + Database.DCMS.patient + "  \n"
                    + " SET CLIENT_ID  = '" + Clients.DowHospital + "'  \n"
                    + " WHERE PATIENT_ID = '" + emp.getPatientId() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updatePatientId(String patientId, Patient emp, String clientId) {

        boolean ret = hdlEmployeeData.updatePatientId(patientId, emp, "U");
        if (ret) {
            String query
                    = " UPDATE " + Database.DCMS.patient + "\n SET "
                    + " CLIENT_ID  = '" + clientId + "'  \n"
                    + " WHERE PATIENT_ID = '" + patientId + "'";

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateInactiveEmployee(String patientId,
            String empId, String clientId) {
        String query
                = " UPDATE " + Database.DCMS.clientEmployeeFamily + "\n "
                + " SET ACTIVE  = 'N'  \n"
                + " WHERE CLIENT_WISE_EMP_ID = '" + empId + "'"
                + " AND CLIENT_ID = '" + clientId + "'";

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            query = " UPDATE " + Database.DCMS.patient + "\n "
                    + " SET  CLIENT_ID  = '" + Clients.DowHospital + "' \n"
                    + " WHERE PATIENT_ID IN ( SELECT PATIENT_ID FROM "
                    + Database.DCMS.clientEmployeeFamily + " \n"
                    + " WHERE CLIENT_WISE_EMP_ID = '" + empId + "' "
                    + " AND CLIENT_ID = '" + clientId + "' "
                    + " AND PATIENT_ID IS NOT NULL)";

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertPatient(Patient emp, String attachType) {

        PatientHandler hdlPatient = new PatientHandler();
        //boolean ret = hdlPatient.registerPatient(emp);
        boolean ret = true;
        if (ret) {
            ret = hdlEmployeeData.updatePatientId(emp.getPatientId(),
                    emp, attachType);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    //// Controller for add Employee
    public boolean insertEmpInfo(Patient pat) {

        boolean ret = hdlEmployeeData.insertClientWiseInfo(pat);
        if (ret) {
            ret = hdlEmployeeData.insertEmpIDInCED(pat);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertEmployeeFamilyMemberInfo(Patient pat) {

        boolean ret = hdlEmployeeData.insertEmpIDInCED(pat);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean isEmployeeRegistered(String empId, String clientId) {

        return hdlEmployeeData.isEmployeeRegistered(empId, clientId);
    }

    public List<Patient> searchClientInfo(String empId, String clientId) {

        return hdlEmployeeData.searchClientInfo(empId, clientId);
    }

    public boolean updateFamilyInfo(Patient pat) {

        boolean ret = hdlEmployeeData.UpdateClientsFamily(pat);
        if (ret) {
          // ret = hdlAddclient.insertEmpIDInCED(pat);

            // if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<Patient> searchEmpInfoDetail(String empId) {

        return hdlEmployeeData.selectClientWiseEmpInfo(empId);
    }

    public List<Patient> selectEmpDocInfo(String patId) {
        return hdlEmployeeData.selectCientEmployeeDocs(patId);
    }

    public boolean UpdateOnContactNo(Patient pat) {

        boolean ret = hdlEmployeeData.UpdateOnContactNo(pat);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public Image selectDocumentImage(String patId, String docTypeId) {
        return hdlEmployeeData.selectDocumentImage(patId,docTypeId);
    }
     public List<Patient> searchClientApproval(String patId) {
        return hdlEmployeeData.searchClientApproval(patId);
    }
    
    public boolean deleteDocument(String patId, String docTypeId) {
        boolean ret = hdlEmployeeData.deleteDocument(patId,docTypeId);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
       }
       
    public boolean insertAuditLogInsert(Patient pat) {

        boolean ret = hdlEmployeeData.insertAuditLogInsert(pat);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean UpdateInfoUpdatedColumn(Patient pat) {

        boolean ret = hdlEmployeeData.UpdateInfoUpdatedColumn(pat);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
     public boolean UpdateforCnic(Patient pat) {

        boolean ret = hdlEmployeeData.UpdateforCnic(pat);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
     
     public boolean UpdateClientforRetiredMedical(Patient pat) {

        boolean ret = hdlEmployeeData.updateClient(pat);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
}

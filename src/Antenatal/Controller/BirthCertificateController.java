package Antenatal.Controller;

import Antenatal.BO.BOBirthCertificate;
import BO.Patient;
import Controller.PatientController;
import Antenatal.Handler.BirthCertificateHandler;
import java.util.List;
import utilities.Clients;
import utilities.Constants;
import utilities.TypeDetailId;

public class BirthCertificateController {

    BirthCertificateHandler hdlBirthCertificate = new BirthCertificateHandler();

    public List<BOBirthCertificate> selectPatientSearch(String patientId,
            String admissionNo) {
        return hdlBirthCertificate.selectPatientSearch(patientId, admissionNo);
    }

    public boolean updateBirthCertificate(BOBirthCertificate obj) {

        boolean ret = hdlBirthCertificate.updateBirthCertificate(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertBirthCertificate(BOBirthCertificate baby, boolean registerPatient) {

//        Patient patient = new Patient();
//        patient.setFirstName(baby.getBabyName());
//        patient.setFullName(baby.getBabyName());
//        patient.setClientId(Clients.newBornBaby);
//        patient.setDob(baby.getDob());
//        patient.setContactNo(baby.getContactNo());
//        patient.setGenderId(baby.getGenderId());
//        patient.setLocationId(Constants.locationId);
//        patient.setEmergencyContactNo(baby.getContactNo());
//        patient.setGuardianName(baby.getFatherName());
//        patient.setGuardianRelationId(TypeDetailId.fatherRelation);
//        patient.setTitleId("302");
//        if (baby.getGenderId().equalsIgnoreCase("1")) {
//            patient.setTitleId("301");
//        }
//        patient.setCityId("1");
//        patient.setCompanyId("87"); //SELF
//        patient.setMaritalStatusId("192");
//        patient.setBloodGroupId("52");
//        patient.setReligionId("215");
//        patient.setTypeId("210");
//        patient.setPrimaryPhysicianId("GENERAL");
//        baby.setPrimaryPhysicianId("GENERAL");
//        patient.setAge("0 M");
//        patient.setPresentAddress(baby.getPresentAddress());
//        patient.setPermanentAddress(baby.getPresentAddress());
//        PatientController ctlPatient = new PatientController();
        boolean ret = hdlBirthCertificate.insertBirthCertificate(baby);
//        if (registerPatient) {
//            ctlPatient.registerPatient(patient);
//            baby.setBabyPatientId(Constants.completePatientId);
//        }
//        if (ret) {
//            ret = hdlBirthCertificate.insertBirthCertificate(baby);
//        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}

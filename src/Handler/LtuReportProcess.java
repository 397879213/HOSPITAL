///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Handler;
//
///**
// *
// * @author DANISH
// */
//public class LtuReportProcess {
//
//    private String fetchId = "";
//    private String patientId = "";
//    private String con = "";
//    private String odi = "";
//    private String parameterId = "";
//    private String resultValue = "";
//    private String verifiedDate = "";
//    private String performedStatus = "";
//    private String remarks = "";
//    private String id = "";
//    private String cptId = "";
//    private String position = "";
//    private String detailId = "";
//    private String departmentName = "";
//    private String fetchBy = "";
//    private String fetchDate = "";
//
//    public String getFetchId() {
//        return fetchId;
//    }
//
//    public void setFetchId(String fetchId) {
//        this.fetchId = fetchId;
//    }
//
//    public String getPatientId() {
//        return patientId;
//    }
//
//    public void setPatientId(String patientId) {
//        this.patientId = patientId;
//    }
//
//    public String getCon() {
//        return con;
//    }
//
//    public void setCon(String con) {
//        this.con = con;
//    }
//
//    public String getOdi() {
//        return odi;
//    }
//
//    public void setOdi(String odi) {
//        this.odi = odi;
//    }
//
//    public String getParameterId() {
//        return parameterId;
//    }
//
//    public void setParameterId(String parameterId) {
//        this.parameterId = parameterId;
//    }
//
//    public String getResultValue() {
//        return resultValue;
//    }
//
//    public void setResultValue(String resultValue) {
//        this.resultValue = resultValue;
//    }
//
//    public String getVerifiedDate() {
//        return verifiedDate;
//    }
//
//    public void setVerifiedDate(String verifiedDate) {
//        this.verifiedDate = verifiedDate;
//    }
//
//    public String getPerformedStatus() {
//        return performedStatus;
//    }
//
//    public void setPerformedStatus(String performedStatus) {
//        this.performedStatus = performedStatus;
//    }
//
//    public String getRemarks() {
//        return remarks;
//    }
//
//    public void setRemarks(String remarks) {
//        this.remarks = remarks;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getCptId() {
//        return cptId;
//    }
//
//    public void setCptId(String cptId) {
//        this.cptId = cptId;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getDetailId() {
//        return detailId;
//    }
//
//    public void setDetailId(String detailId) {
//        this.detailId = detailId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getFetchBy() {
//        return fetchBy;
//    }
//
//    public void setFetchBy(String fetchBy) {
//        this.fetchBy = fetchBy;
//    }
//
//    public String getFetchDate() {
//        return fetchDate;
//    }
//
//    public void setFetchDate(String fetchDate) {
//        this.fetchDate = fetchDate;
//    }
//
//}
//
//    public List<LtuReportProcess> selectResult() {
//
//        String colums[] = {"-", "FETCH_ID", "PATIENT_ID", "CON", "ODI",
//        "PARAMETER_ID", "RESULT_VALUE", "VERIFIED_DATE", "PERFORMED_STATUS",
//        "REMARKS"};
//
//        String query = "SELECT FETCH_ID          FETCH_ID                  \n"
//                + "MED.PATIENT_ID                PATIENT_ID,               \n"
//                + "MED.CON                       CON,                      \n"
//                + "MED.ODI                       ODI,                      \n"
//                + "MED.PARAMETER_ID              PARAMETER_ID,             \n"
//                + "MED.RESULT_VALUE              RESULT_VALUE,             \n"
//                + "MED.VERIFIED_DATE             VERIFIED_DATE,            \n"
//                + "MED.PERFORMED_STATUS          PERFORMED_STATUS          \n"
//                + " FROM  "
//                + Database.DCMS.TRA + " POG,                \n"
//                + Database.DCMS.pathologyResultMaster + " PRM,             \n"
//                + Database.DCMS.pathGrowthSensitivity + " PGS,             \n"
//                + Database.DCMS.patient + "               PAT,             \n"
//                + Database.DCMS.location + "              LOC,             \n"
//                + Database.DCMS.definitionTypeDetail + "  DTD,             \n"
//                + Database.DCMS.definitionTypeDetail + "  GEN,             \n"
//                + Database.DCMS.definitionTypeDetail + "  MED,              \n"
//                + Database.DCMS.definitionTypeDetail + "  SPM              \n"
//                + "WHERE TRUNC(POG.CRTD_DATE) BETWEEN '1-APR-17' AND '30-APR-17' \n"
//                + "AND POG.ORGANISM_ID = '4948'                           \n"
//                + "AND POG.COMPLETE_ORDER_NO = PRM.COMPLETE_ORDER_NO      \n"
//                + "AND POG.ORDER_DETAIL_ID = PRM.ORDER_DETAIL_ID          \n"
//                + "AND POG.COMPLETE_ORDER_NO = PGS.COMPLETE_ORDER_NO      \n"
//                + "AND POG.ORDER_DETAIL_ID = PGS.ORDER_DETAIL_ID          \n"
//                + "AND POG.GROWTH_NUMBER = PGS.GROWTH_NUMBER              \n"
//                + "AND PGS.MEDICINE_ID = MED.ID                           \n"
//                + "AND PRM.PATIENT_ID = PAT.PATIENT_ID                    \n"
//                + "AND PRM.ORDER_STATUS_ID = 12                           \n"
//                + "AND PRM.SPECIMEN_ID = SPM.ID                           \n"
//                + "AND PRM.LOCATION_ID = LOC.ID                           \n"
//                + "AND PAT.GENDER_ID = GEN.ID                             \n";
//        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
//        List<LtuReportProcess> vecDC = new ArrayList<>();
//        for (HashMap map : lis) {
//
//            CultureProcess objBc = new CultureProcess();
//            objBc.setMedAbb(map.get("MED_ABB").toString());
//            vecDC.add(objBc);
//        }
//        return vecDC;
//    }
//
//    public boolean insertMicro() {
//        
//        String query = " INSERT INTO " + Database.DCMS.cultureMedicine
//                + " (LAB_NO,PERFORM_DATE, AGE, GENDER_ID, SPECIMEN, ORGANISM_ID, \n"
//                + " LOCATION_ID, ODI_CON) \n"
//                + " (SELECT DISTINCT(PRM.LAB_NO), TO_CHAR(PRM.VERIFIED_DATE, 'DD-MON-YY'),\n"
//                + " ROUND(MONTHS_BETWEEN(SYSDATE,PAT.DOB )/12) AGE,PAT.GENDER_ID, \n"
//                + " SPM.DESCRIPTION SPECIMEN,POG.ORGANISM_ID,PRM.LOCATION_ID,"
//                + " PRM.ORDER_DETAIL_ID||PRM.COMPLETE_ORDER_NO FROM  "
//                + Database.DCMS.pathOrganismGrowth + " POG,                \n"
//                + Database.DCMS.pathologyResultMaster + " PRM,             \n"
//                + Database.DCMS.pathGrowthSensitivity + " PGS,             \n"
//                + Database.DCMS.patient + "               PAT,             \n"
//                + Database.DCMS.location + "              LOC,             \n"
//                + Database.DCMS.definitionTypeDetail + "  DTD,             \n"
//                + Database.DCMS.definitionTypeDetail + "  GEN,             \n"
//                + Database.DCMS.definitionTypeDetail + "  MED,             \n"
//                + Database.DCMS.definitionTypeDetail + "  SPM              \n"
//                + " WHERE TRUNC(POG.CRTD_DATE) BETWEEN '01-APR-17' AND '30-APR-17' \n"
//                + " AND POG.ORGANISM_ID = '4948'                           \n"
//                + " AND POG.COMPLETE_ORDER_NO = PRM.COMPLETE_ORDER_NO      \n"
//                + " AND POG.ORDER_DETAIL_ID = PRM.ORDER_DETAIL_ID          \n"
//                + " AND POG.COMPLETE_ORDER_NO = PGS.COMPLETE_ORDER_NO      \n"
//                + " AND POG.ORDER_DETAIL_ID = PGS.ORDER_DETAIL_ID          \n"
//                + " AND POG.GROWTH_NUMBER = PGS.GROWTH_NUMBER              \n"
//                + " AND PGS.MEDICINE_ID = MED.ID                           \n"
//                + " AND PRM.PATIENT_ID = PAT.PATIENT_ID                    \n"
//                + " AND PRM.ORDER_STATUS_ID = 12                           \n"
//                + " AND PRM.SPECIMEN_ID = SPM.ID                           \n"
//                + " AND PRM.LOCATION_ID = LOC.ID                           \n"
//                + " AND PAT.GENDER_ID = GEN.ID                             \n)";
//
//        
//        return Constants.dao.executeUpdate(query, true);
//    }
//
//    public boolean updateMicroCulture() {
//
//        String[] columns = {"-", "UPDATE_QUERY"};
//
//        String query = " SELECT ' UPDATE " + Database.DCMS.cultureMedicine +" CC \n"
//                + " SET CC.'||MED.ADDITIONAL_INFO||'= '''|| \n"
//                + " NVL(DECODE( PGS.SENSITIVITY_TYPE , 1 , 'S', 2 , 'I', 3 , 'R'), '-') \n"
//                + " ||''' WHERE CC.ODI_CON = '''||PRM.ORDER_DETAIL_ID||PRM.COMPLETE_ORDER_NO||''';' UPDATE_QUERY\n"
//                + " FROM  "
//                + Database.DCMS.pathOrganismGrowth + " POG,         \n"
//                + Database.DCMS.pathologyResultMaster + " PRM,      \n"
//                + Database.DCMS.pathGrowthSensitivity + " PGS,      \n"
//                + Database.DCMS.patient + " PAT,                    \n"
//                + Database.DCMS.location + " LOC,                   \n"
//                + Database.DCMS.definitionTypeDetail + " GEN,       \n"
//                + Database.DCMS.definitionTypeDetail + " MED,       \n"
//                + Database.DCMS.definitionTypeDetail + " SPM        \n"
//                + " WHERE TRUNC(POG.CRTD_DATE) BETWEEN '01-APR-17' AND '30-APR-17' \n"
//                + " AND POG.ORGANISM_ID = '4948'                           \n"
//                + " AND POG.COMPLETE_ORDER_NO = PRM.COMPLETE_ORDER_NO      \n"
//                + " AND POG.ORDER_DETAIL_ID = PRM.ORDER_DETAIL_ID          \n"
//                + " AND POG.COMPLETE_ORDER_NO = PGS.COMPLETE_ORDER_NO      \n"
//                + " AND POG.ORDER_DETAIL_ID = PGS.ORDER_DETAIL_ID          \n"
//                + " AND POG.GROWTH_NUMBER = PGS.GROWTH_NUMBER              \n"
//                + " AND PGS.MEDICINE_ID = MED.ID                           \n"
//                + " AND PRM.PATIENT_ID = PAT.PATIENT_ID                    \n"
//                + " AND PRM.ORDER_STATUS_ID = 12                           \n"
//                + " AND PRM.SPECIMEN_ID = SPM.ID                           \n"
//                + " AND PRM.LOCATION_ID = LOC.ID                           \n"
//                + " AND PAT.GENDER_ID = GEN.ID                             \n";
//        
//        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
//        List<String> list = new ArrayList<>();
//        for (HashMap map : mapList) {
//            list.add(map.get("UPDATE_QUERY").toString());
//        }
//        
//        boolean ret = Constants.dao.executeUpdates(list);
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        } else if (!ret) {
//            Constants.dao.rollBack();
//        }
//        return ret;
//    }
//   
//
//    public void CultureMedicine() {
//        CultureProcess CP = new CultureProcess();
//        CP.selectMedicine();
//        CP.insertMicro(); 
//        CP.updateMicroCulture();
//
//    }
//
//    public static void main(String[] args) {
//
//        CultureProcess sharingProcess = new CultureProcess();
//        sharingProcess.CultureMedicine();
//    }
//}

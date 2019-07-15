package utilities;

public class Database {

    public static String username = "EMR";

    public static final class DCMS {
        
        
        public static final String ipdMedicinePlan = DAO.username + ".IPD_MEDICINE_PLAN   ";
        public static final String patientWiseSelectedParameters = DAO.username + ".PAT_WISE_SELECTED_PARAMETER   ";
        public static final String userWiseParameterMaster = DAO.username + ".USER_WISE_PARAMETER_MASTER   ";
        public static final String userWiseParameterDetail = DAO.username + ".USER_WISE_PARAMETER_DETAIL   ";
        public static final String userWiseParameter = DAO.username + ".USER_WISE_PARAMETER_DETAIL   ";
        public static final String treatmentOnDischarge = DAO.username + ".TREATMENT_ON_DISCHARGE   ";
        public static final String treatmentOnDischargeDetail = DAO.username + ".TREATMENT_ON_DISCHARGE_DETAIL   ";
        public static final String treatmentOnDischargeHistory = DAO.username + ".TREATMENT_ON_DISCHARGE_HISTORY   ";
        
        public static final String gynaeParameters = DAO.username + ".GYNAE_PARAMETERS   ";
        public static final String antenatalPatientInfo = DAO.username + ".ANTENATAL_PATIENT_INFO   ";
        public static final String recordOfAntenatalVisits = DAO.username + ".RECORD_OF_ANTENATAL_VISITS   ";
        
        public static final String dialysisMaster = DAO.username + ".DIALYSIS   ";
        public static final String dialysisItemDetail = DAO.username + ".DIALYSIS_ITEM_DETAIL   ";

        public static final String userAccessRights = DAO.username + "." + "USER_ACCESS_RIGHTS";
        public static final String chestPainClinic = DAO.username + "." + "CHEST_PAIN_CLINIC";
        public static final String locWiseCashSummary = DAO.username + "." + "LOC_WISE_CASH_SUMMARY";
        public static final String locWiseCashDetail = DAO.username + "." + "LOC_WISE_CASH_DETAIL";
        public static final String locWiseCashDepositDetail = DAO.username + ".LOC_WISE_DEPOSIT_DETAIL";
        public static final String bank = DAO.username + ".BANK";
        public static final String otc = DAO.username + ".OTC";
        public static final String UserWiseGroup = DAO.username + ".USER_WISE_GROUP ";
        public static final String UserWiseFavorites = DAO.username + ".USER_WISE_FAVOURITES ";
        public static final String echoDetail = DAO.username + ".CARDIAC_ECHO_DETAIL ";
        public static final String echoResults = DAO.username + ".CARDIAC_ECHO_RESULT ";
        public static final String opdReferLog = DAO.username + ".OPD_REFER_LOG ";
        public static final String patMedCategoryLog = DAO.username + ".PAT_MED_CATEGORY_LOG ";
        public static final String auditLog = DAO.username + "." + "AUDIT_LOG ";
        public static final String invoiceMaster = DAO.username + "." + "INVOICE_MASTER ";
        public static final String performingShareSummary = DAO.username + "." + "PERFORMING_SHARE_SUMMARY";
        public static final String historyStoreWisePatientDiscount
                = DAO.username + ".HISTORY_STORE_WISE_PAT_DISC ";

        public static final String otCheckList
                = DAO.username + ".OT_CHECK_LIST ";

        public static final String otProcedureLog = DAO.username + ".OT_PROCEDURE_LOG ";

        public static final String templateCptTextReporting = DAO.username + ".TEMPLATE_CPT_TEXT_REPORTING ";
        public static final String templatePathGrowthSensitivity = DAO.username + ".TEMPLATE_PATH_GROWTH_SENSITIV ";
        public static final String templatePathologyResultMaster = DAO.username + ".TEMPLATE_PATHOLOGY_RSLT_MASTER ";
        public static final String templatePathOrganismGrowth = DAO.username + ".TEMPLATE_PATH_ORGANISM_GROWTH  ";

        public static final String emergencyPendingVisit = DAO.username + ".EMER_PENDING_VISIT ";
        public static final String emergencyPerformedVisit = DAO.username + ".EMER_PERFORMED_VISIT ";

        public static final String traumaPendingCalls = DAO.username + ".TRAUMA_PENDING_CALLS ";
        public static final String traumaPerformedCalls = DAO.username + ".TRAUMA_PERFORMED_CALLS ";

        public static final String attendanceServer = DAO.username + ".HR_ATTENDANCE_SERVER ";
        public static final String refinedAttendanceData = DAO.username + ".HR_ATTENDANCE_SERVER ";
        public static final String cptWiseNotCpt = DAO.username + ".CPT_WISE_NOT_CPT ";
        public static final String attachEmployeePic = DAO.username + ".CLIENT_WISE_EMP_PICTURE ";
        public static final String clientEmployeeApproval = DAO.username + ".CLIENT_EMPLOYEE_APPROVAL ";
        public static final String attachEmployeePicHistory = DAO.username + ".CLIENT_EMP_PICTURE_HISTORY ";
        public static final String clientEmployeeFamily = DAO.username + ".CLIENT_EMP_DETAIL ";
        public static final String employeeDetailHistory = DAO.username + ".CLIENT_EMP_DETAIL_HIST ";
        public static final String teamShareMaster = DAO.username + ".TEAM_SHARE_MASTER ";
        public static final String teamShareDetail = DAO.username + ".TEAM_SHARE_DETAIL ";
        public static final String outSideReportsMaster = DAO.username + ".PATIENT_OUTSIDE_REPORTS ";
        public static final String outSideReportsDetail = DAO.username + ".OUTSIDE_REPORTS_DETAIL ";
        public static final String userAccessRightsSetup = DAO.username + ".USER_ACCESS_RIGHTS_SETUP ";
        public static final String userAccessRightsHistory = DAO.username + ".USER_ACCESS_RIGHTS_HISTORY ";
        public static final String systemUserManual = DAO.username + ".SYSTEM_USER_MANUAL ";
        public static final String patientReferral = DAO.username + ".PATIENT_OUTSIDE_REFERRAL ";
        public static final String abpmMaster = DAO.username + ".ABPM_MASTER ";
        public static final String abpmDetail = DAO.username + ".ABPM_DETAIL ";
        public static final String clientEmployeeData = DAO.username + ".CLIENT_EMPLOYEE_DATA ";
        public static final String clientWiseEmployee = DAO.username + ".CLIENT_WISE_EMPLOYEE_MASTER ";
        public static final String patientEyeVision = DAO.username + ".PATIENT_EYE_VISION  ";
        public static final String eyeVisionDetail = DAO.username + ".EYE_VISION_DETAIL  ";
        public static final String surgeryNotesPending = DAO.username + ".SURGERY_NOTES_PENDING ";
        public static final String transactionTypeHistory = Database.username + ".TRANSACTION_CHANGE_HISTORY ";
        public static final String addSlotRights = DAO.username + ".CLINIC_ADD_SLOT_RIGHTS ";
        public static final String cancelAppointment = DAO.username + ".CANCELLED_APPOINTMENT ";
        public static final String patientQuestionaireDetail = DAO.username + ".PATIENT_QUESTIONAIRE_DETAIL ";
        public static final String patientQuestionaire = DAO.username + ".PATIENT_QUESTIONAIRE ";
        public static final String orderReviewHistory = Database.username + ".ORDER_REVIEW_HISTORY ";
        public static final String clinicalProcedureTeam = DAO.username + ".CLINICAL_PROCEDURE_TEAM ";
        public static final String logSnowMedCode = DAO.username + ".HISTORY_SNOW_MED_CODE ";
        public static final String LiverDonorRecipientHistory = DAO.username + ".TRANSPLANT_PATIENT_HISTORY ";
        public static final String mdtPatientReview = DAO.username + ".MDT_PATIENT_REVIEW ";
        public static final String mdtWisePhysician = DAO.username + ".MDT_WISE_PHYSICIAN ";
        public static final String attendanceSummary = DAO.username + ".HR_ATTENDANCE_SUMMARY ";
        public static final String hrThumbAttendance = DAO.username + ".HR_THUMB_ATTENDANCE ";
        public static final String MDTReviewHistory = DAO.username + ".MDT_REVIEW_HISTORY ";
        public static final String otPendingProcedure = DAO.username + ".OT_PENDING_PROCEDURE ";
        public static final String otPerformedProcedure = DAO.username + ".OT_PERFORMED_PROCEDURE ";
        public static final String generalAnaesthesiaFitness = DAO.username + ".GENERAL_ANAESTHESIA_FITNESS ";
        public static final String otPendingOrders = DAO.username + ".ORDER_PENDING_HISTORY ";
        public static final String orderPendingQueue = DAO.username + ".PATIENT_PENDING_ORDER ";
        public static final String orderProcessedQueue = DAO.username + ".PATIENT_PERFORMED_ORDER ";
        public static final String mdtTeam = DAO.username + ".MDT_TEAM ";
        public static final String mdtTeamMember = DAO.username + ".MDT_TEAM_DETAIL ";
        public static final String otProcedureTeam = DAO.username + ".OT_PROCEDURE_TEAM ";
        public static final String OTTeam = DAO.username + ".OT_TEAM ";
        public static final String DianosticOrderHistory = DAO.username + ".DIAGNOSTIC_ORDER_HISTORY ";
        public static final String dianosticHistoryDetail = DAO.username + ".DIAGNOSTIC_HISTORY_DETAIL ";
        public static final String stoolDr = DAO.username + ".PATH_STOOL_DR ";
        public static final String urineDr = DAO.username + ".PATH_URINE_DR ";
        public static final String transplantDonors = DAO.username + ".TRANSPLANT_DONORS ";
        public static final String attachDocumnet = DAO.username + ".PATIENT_REPORTS_ATTACHMENTS  ";
        public static final String cptWiseQuestionaire = DAO.username + ".CPT_WISE_QUESTIONAIRE ";
        public static final String bedTransferRequest = DAO.username + ".BED_TRANSFER_REQUEST ";
        public static final String patientCreditApproval = DAO.username + ".PATIENT_CREDIT_APPROVAL ";
        public static final String patientCreditLimit = DAO.username + ".PATIENT_CREDIT_LIMIT ";
        public static final String blbTransfusionReporting = DAO.username + ".BLB_TRANSFUSION_REPORTING ";
        public static final String financialSupportInternalMember = DAO.username + ".INTERNAL_COMMITTEE_MEMBER  ";
        public static final String financialSupportApproval = DAO.username + ".FINANCIAL_SUPPORT_APPROVAL  ";
        public static final String userWiseLocation = DAO.username + "." + "USER_WISE_LOCATIONS  ";
        public static final String cptWiseCancelCpt = DAO.username + "." + "CPT_WISE_CANCEL_CPT  ";
        public static final String passwordChangeHistory = Database.username + "." + "PASSWORD_CHANGE_HISTORY ";
        public static final String clientWiseBlockedItems = DAO.username + "." + "CLIENT_WISE_BLOCKED_ITEMS ";
        public static final String inpatientInvoices = DAO.username + "." + "INPATIENT_INVOICES ";
        public static final String dischargePendingCertificate = DAO.username + "." + "DISCHARGE_PENDING_CERTIFICATE ";
        public static final String cptWisePerformingRights = DAO.username + ".CPT_WISE_PERFORMING_RIGHTS  ";
        public static final String pathologyBatch = DAO.username + ".PATHOLOGY_BATCH ";
        public static final String appointment = DAO.username + ".APPOINTMENT  ";
        public static final String appSMSDetail = DAO.username + ".APP_SMS_DETAIL ";
        public static final String role = DAO.username + ".ROLE   ";
        public static final String bloodGroup = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String city = DAO.username + ".CITY  ";
        public static final String company = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String gender = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String title = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String country = DAO.username + ".COUNTRY  ";
        public static final String location = DAO.username + ".LOCATION  ";
        public static final String locationWiseLocation = DAO.username + ".LOCATION_WISE_LOCATION  ";
        public static final String patientAdmission = DAO.username + ".PATIENT_ADMISSION  ";
        public static final String patientDischarge = DAO.username + ".PATIENT_DISCHARGE ";
        public static final String dischargeDetail = DAO.username + ".DISCHARGE_DETAIL ";
        public static final String pofPatients = DAO.username + ".POF_PATIENTS ";
        public static final String pofPatientVisits = DAO.username + ".POF_PATIENTS_VISIT  ";
        public static final String pofPatientVisitDetail = DAO.username + ".POF_PAT_VISIT_DETAIL  ";
        public static final String patientAdmissionHistory = DAO.username + ".PATIENT_ADMISSION_HISTORY  ";
        public static final String userWiseCpt = DAO.username + ".USER_WISE_CPT  ";
        public static final String consultantChangeHistory = Database.username + ".CONSULTANT_SHARE_HISTORY  ";
        public static final String blbProductOrderDelivered = DAO.username + ".BLB_PRODUCT_ORDER_DELIVERED  ";
        public static final String clinicalTeam = DAO.username + ".CLINICAL_TEAM  ";
        public static final String clinicalTeamMember = DAO.username + ".CLINICAL_MEMBER  ";
        public static final String blbOutsideProductProduct = DAO.username + ".BLB_OUTSIDE_PRODUCTS  ";
        public static final String caseStudyHistory = DAO.username + ".CASE_STUDY_HISTORY  ";
        public static final String enableRefundRequest = DAO.username + ".ENABLE_REFUND_REQUEST  ";
        public static final String userCloud = DAO.username + ".USER_CLOUD  ";
        public static final String caseTransferHistory = DAO.username + ".CASE_TRANSFER_HISTORY  ";
        public static final String blbPerformedQueue = DAO.username + ".BLB_DONOR_PERFORMED  ";
        public static final String lisParameter = DAO.username + ".PATH_ANALYZER_WISE_PARAMETER  ";
        public static final String CPTWisePerformingRights = DAO.username + ".CPT_WISE_PERFORMING_RIGHTS  ";
        public static final String locationWiseDepartment = DAO.username + ".LOCATION_WISE_DEPARTMENT  ";
        public static final String patientExaminationsDetailItem = DAO.username + ".EXAMINATION_DETAIL_OPTION   ";
        public static final String specialityExamDetailItem = DAO.username + ".SPECIALITY_EXAM_DETAIL_ITEM   ";
        public static final String clinicStatusHistory = DAO.username + ".UPDATE_CLINIC_STATUS_HIST  ";
        public static final String room = DAO.username + ".ROOM  ";
        public static final String rack = DAO.username + ".RACK  ";
        public static final String customer = DAO.username + ".CUSTOMER  ";
        public static final String locationWiseCPT = DAO.username + ".LOCATION_WISE_CPT  ";
        public static final String shelf = DAO.username + ".SHELF  ";
        public static final String patientFileMovement = DAO.username + ".PATIENT_FILE_MOVEMENT  ";
        public static final String FileMovementHistory = Database.username + ".FILE_MOVEMENT_HISTORY  ";
        public static final String FileRecord = DAO.username + ".PATIENT_FILE_RECORD  ";
        public static final String sampleStatus = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String designation = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String type = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String CPT = DAO.username + ".CPT  ";
        public static final String CPTCodes = DAO.username + ".CPT_WISE_CODES  ";
        public static final String CPTWiseCPT = DAO.username + ".CPT_WISE_CPT  ";
        public static final String item = DAO.username + ".ITEM  ";
        public static final String itemHistory = Database.username + ".ITEM_HISTORY  ";
        public static final String pathFarwordHistory = Database.username + ".PATH_FARWORD_HISTORY  ";
        public static final String pathTubeScanning = DAO.username + ".PATH_TUBE_SCANNING  ";
        public static final String pathHistoReport = "DUHS.PATH_HISTO_REPORT  ";
        public static final String pathHistoWorkflow = DAO.username + ".PATH_HISTO_WORKFLOW  ";
        public static final String pathSnowMedCode = DAO.username + ".SNOW_MED_CODE  ";
        public static final String userUpdateHistory = Database.username + ".USER_UPDATE_HISTORY  ";
        public static final String userWiseDepartment = DAO.username + ".USER_WISE_DEPARTMENT  ";
        public static final String labNoChangeHistory = DAO.username + ".LABNO_CHANGE_HISTORY  ";
        public static final String advanceRefundRequest = DAO.username + ".ADVANCE_REFUND_REQUEST  ";
        public static final String updateClientHistory = DAO.username + ".UPDATE_CLIENT_HISTORY  ";
        public static final String updateOrderHistory = DAO.username + ".UPDATE_ORDER_HISTORY  ";
        public static final String selectedTCode = DAO.username + ".SELECTED_TCODE  ";
        public static final String performingShareVerification = DAO.username
                + ".PERFORMING_SHARE_VERIFICATION  ";
        public static final String imagingSpecialApproval = DAO.username
                + ".IMAGING_SPECIAL_APPROVAL  ";
        public static final String gastroReporting = DAO.username + ".GASTRO_REPORTING";
        public static final String gastroReportingDetail = DAO.username + ".GASTRO_REPORTING_DETAIL";
        public static final String selectedTWiseMCode = DAO.username + ".SELECTED_TWISE_MICDO_CODE  ";
        public static final String clientChangeHistory = DAO.username + ".CLIENT_CHANGE_HISTORY  ";
        public static final String echoReporting = DAO.username + ".ECHO_REPORTING  ";
        public static final String equipmentStatus = DAO.username + ".EQUIPMENT_STATUS  ";
        public static final String specialityWiseItem = DAO.username + ".SPECIALITY_WISE_ITEM  ";
        public static final String generic = DAO.username + ".GENERIC  ";
        public static final String advanceReceiveHistory = DAO.username + ".ADVANCE_RECEIVED_HISTORY  ";
        public static final String bed = DAO.username + ".BED  ";
        public static final String ward = DAO.username + ".WARD  ";
        public static final String cptWisePerformingShare = DAO.username + ".CPT_WISE_PERFORMING_SHARE  ";
        public static final String locWiseCPTReportTiming = DAO.username + ".LOC_WISE_CPT_REPORT_TIMING  ";
        public static final String onlineReports = DAO.username + ".ONLINE_REPORTS  ";
        public static final String cptReportingDays = DAO.username + ".CPT_PERFORM_DAY   ";
        public static final String orderLocation = DAO.username + ".DEFINITION_TYPE_DETAIL    ";
        public static final String filmSize = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String contrastType = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String contrastQty = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String imagingReportingTemplate = DAO.username + ".IMAGING_REPORTING_TEMPLATE   ";
        public static final String teleReportingTemplate = DAO.username + ".PACS_REPORTING_TEMPLATE   ";
        public static final String applicationReports = DAO.username + ".APP_REPORTS   ";
        public static final String reportAccessHistory = Database.username + ".REPORT_VIEW_HISTORY   ";
        public static final String reportDeliveryInfo = Database.username + ".REPORT_DELIVERY_HISTORY   ";
        public static final String filmReceivedInfo = Database.username + ".FILMS_RECEIVED_HISTORY   ";
        public static final String applicationComments = DAO.username + ".APPLICATION_COMMENTS   ";
        public static final String wordShortcuts = DAO.username + ".WORD_SHORTCUT  ";
        public static final String primaryKey = DAO.username + ".DEFINITION_KEYS  ";
        public static final String pathLabNo = DAO.username + ".PATH_LAB_NO  ";
        public static final String imagingResultHistory = Database.username + ".IMAGING_RESULT_HISTORY  ";
        public static final String imagingRota = DAO.username + ".IMAGING_ROTA  ";
        public static final String opdCptMedOrders = DAO.username + ".OPD_CPT_MED_ORDERS  ";
        public static final String medicineFrequency = DAO.username + ".MEDICINE_FREQUENCY  ";
        public static final String userWiseMedFrequency = DAO.username + ".USER_WISE_MED_FREQ   ";
        public static final String pathologyWidalReporting = DAO.username + ".PATH_WIDAL_REPORTING ";
        public static final String systemConfiguration = DAO.username + ".PATH_WIDAL_REPORTING ";
        public static final String clientEmployeeDocs = DAO.username + ".CLIENT_EMPLOYEE_DOCS     ";
        public static final String definitionType = DAO.username + ".DEFINITION_TYPE   ";
        public static final String definitionTypeDetail = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String definitionTypeDetailHist = DAO.username + ".DEF_TYPE_DETAIL_HIST   ";
        public static final String userWiseEmployee = DAO.username + ".USER_WISE_EMPLOYEES   ";
        public static final String remoteRadiolgist = DAO.username + ".REMOTE_RADIOLOGIST   ";
        public static final String organismWiseMedicine = DAO.username + ".ORGANISM_WISE_MEDICINE   ";
        public static final String ItemWiseBrand = DAO.username + ".ITEM_WISE_BRAND   ";
        public static final String storeWiseItems = DAO.username + ".STORE_WISE_ITEMS   ";
        public static final String storeWiseUser = DAO.username + ".STORE_WISE_USERS   ";
        public static final String store = DAO.username + ".STORE   ";
        public static final String storeWisePatientDiscount = DAO.username + ".STORE_WISE_PATIENT_DISCOUNT   ";
        public static final String storeWiseIndentStore = DAO.username + ".STORE_WISE_INDENT   ";
        public static final String indication = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String riskFactor = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String medication = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String reasonForTermination = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String exercisePhase = DAO.username + ".ETT_EXERCISE_PHASE   ";
        public static final String ettReport = DAO.username + ".ETT_REPORT   ";
        public static final String ettReportDetail = DAO.username + ".ETT_REPORT_DETAIL   ";
        public static final String recoveryPhase = DAO.username + ".ETT_RECOVERY_PHASE   ";
        public static final String restingPhase = DAO.username + ".ETT_RESTING_PHASE   ";
        public static final String CPTParameter = DAO.username + ".CPT_PARAMETER   ";
        public static final String CPTTextReporting = DAO.username + ".CPT_TEXT_REPORTING   ";
        public static final String organization = DAO.username + ".ORGANIZATION   ";
        public static final String sectionWisePerformDay = DAO.username + ".GROUP_WISE_PERFORM_DAY   ";
        public static final String client = DAO.username + ".CLIENT   ";
        public static final String pathReportTime = DAO.username + ".PATH_REPORTING_TIME  ";
        public static final String clientWiseCPT = DAO.username + ".CLIENT_WISE_CPT  ";
        public static final String clientCreditReceive = DAO.username + ".CLIENT_CREDIT_RECIEVE  ";
        public static final String clientAmounDetail = DAO.username + ".CLIENT_AMOUNT_DETAIL   ";
        public static final String balanceRefundApproval = DAO.username + ".BALANCE_REFUND_APPROVAL   ";
        public static final String deathCertificate = DAO.username + ".DEATH_CERTIFICATE   ";
        public static final String maritalStatus = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patient = DAO.username + ".PATIENT   ";
        public static final String patientCardHistory = Database.username + ".PATIENT_CARD_HISTORY   ";
        public static final String oldMRNO = "DUHS.UPATIENT_REGISTRATION   ";
        public static final String blbProductOrderPending = DAO.username + ".BLB_PRODUCT_ORDER_PENDING   ";
        public static final String audioReporting = DAO.username + ".CPT_AUDIO_REPORTING  ";
        public static final String icd10Chapter = DAO.username + ".ICD10_CHAPTER  ";
        public static final String icd10Block = DAO.username + ".ICD10_BLOCK  ";
        public static final String patientPicture = DAO.username + ".PATIENT_PICTURE   ";
        public static final String patientUpdateHistory = Database.username + ".PATIENT_UPDATE_HISTORY   ";
        public static final String mergePatient = DAO.username + ".MERGE_PATIENT   ";
        public static final String unmergePatientHistory = DAO.username + ".UNMERGE_PAT_HISTORY   ";
        public static final String compoundAdditive = DAO.username + ".COMPOUNDING_ADDITIVE   ";
        public static final String compoundAdditiveDetail = DAO.username + ".COMPOUNDING_ADDITIVE_DETAIL   ";

        public static final String patientOldMRNO = DAO.username + ".PATIENT_OLD_MRNO   ";
        public static final String pharmacyGuide = DAO.username + ".PHARMACY_GUIDE  ";
        public static final String appUpgradeHistory = DAO.username + ".APP_UPGRADE_HISTORY  ";

        public static final String ventricular = DAO.username + ".HOLTER_WISE_VENTRICULAR   ";
        public static final String supraventricular = DAO.username + ".HOLTER_WISE_SUPRAVENTRICULAR   ";
        public static final String rtdependentevents = DAO.username + ".RATE_DEPENDENT_EVENTS   ";
        public static final String stanalysis = DAO.username + ".ST_EPISODE_ANALYSIS   ";
        public static final String holter = DAO.username + ".HOLTER   ";
        public static final String tokenPrintHistory = DAO.username + ".TOKEN_PRINT_HISTORY   ";

        public static final String clientWisePackage = DAO.username + ".CLIENT_WISE_PACKAGE   ";
        public static final String cptPackageDetail = DAO.username + ".CPT_PACKAGE_DETAIL   ";
        public static final String clientWiseLocation = DAO.username + ".CLIENT_WISE_LOCATION   ";
        public static final String billingLedger = DAO.username + ".BILLING_LEDGER   ";
        public static final String cancelReturnMaster = DAO.username + ".CANCEL_RETURN_MASTER   ";
        public static final String cancelReturnDetail = DAO.username + ".CANCEL_RETURN_DETAIL   ";
        public static final String specimen = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String cathProcData = DAO.username + ".CATH_PROC_DATA   ";
        public static final String speciality = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patientType = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patientStatus = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String province = DAO.username + ".PROVINCE   ";
        public static final String religion = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String department = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String active = DAO.username + ".ACTIVE   ";
        public static final String cultureMedicine = DAO.username + ".CULTURE_MEDICINE  ";
        public static final String section = DAO.username + ".SECTION   ";
        public static final String users = DAO.username + ".USERS   ";
        public static final String pofWardStatus = DAO.username + ".POF_WARD_STATUS    ";
        public static final String onCallDoctor = DAO.username + ".ON_CALL_DOCTOR   ";
        public static final String doctor = DAO.username + ".DOCTOR   ";
        public static final String appointmentTime = DAO.username + ".APPOINTMENT_TIME   ";
        public static final String nutritionistConsultancy = DAO.username + ".NUTRITIONIST_CONSULTANCY  ";
        public static final String donorCPTOrders = DAO.username + ".DONOR_ORDERS   ";
        public static final String procedureInvoices = DAO.username + ".PROCEDURE_INVOICE   ";
        public static final String patientAttendant = DAO.username + ".PATIENT_ATTENDANT   ";

        public static final String icdOCodes = DAO.username + ".ICD10_CODES   ";
        public static final String icd10Code = DAO.username + ".ICD10_CODE   ";

        public static final String Keys = DAO.username + ".KEYS   ";
        public static final String imagingVerifyRights = DAO.username + ".PERFORMING_VERIFY_RIGHTS   ";
        public static final String diagnosticOrderHistory = DAO.username + ".DIAGNOSTIC_ORDER_HISTORY   ";
        public static final String procedureOrderHistory = DAO.username + ".PROCEDURE_ORDER_HISTORY   ";
        public static final String imagingHistoryChangeTrack = Database.username + ".IMAGING_HISTORY_CHANGE_TRACK   ";
        public static final String orderMaster = DAO.username + ".ORDER_MASTER   ";
        public static final String prescription = DAO.username + ".PRESCRIPTION   ";
        public static final String practiceIncome = DAO.username + ".PRACTICE_INCOME   ";
        public static final String orderDetail = DAO.username + ".ORDER_DETAIL  ";
        public static final String pofHsr = DAO.username + ".POF_HSR";
        public static final String patFinancialSupport = DAO.username + ".PAT_FINANCIAL_SUPPORT   ";

        public static final String invoiceDetail = DAO.username + ".INVOICE_DETAIL   ";
        public static final String expenseType = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String expenseDailyDetail = DAO.username + ".DAILY_EXPENSE_DETAIL   ";
        public static final String imagingResult = DAO.username + ".IMAGING_RESULTS   ";
        public static final String previousImagingResult = "DUHS.IMAGING_RESULTS   ";
        public static final String imagingPendingQueue = DAO.username + ".IMAGING_PENDING_QUEUE   ";
        public static final String imagingAddendum = DAO.username + ".IMAGING_ADDENDUM   ";
        public static final String modalityAnalyzer = DAO.username + ".MODALITY_ANALYZER   ";
        public static final String sectionMachine = DAO.username + ".SECTION_MACHINE   ";
        public static final String emailQueue = DAO.username + ".EMAIL_QUEUE   ";
        public static final String appStatus = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String mobilityStatus = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String pathDefParams = DAO.username + ".DEF_PATH_PARAMS   ";
        public static final String pathRerunSample = DAO.username + ".PATH_RERUN_SAMPLE   ";
        public static final String sendSMS = DAO.username + ".SEND_SMS   ";
        public static final String setupColumnDetail = DAO.username + ".SETUP_COLUMN_DETAIL   ";

        public static final String clientBillReceive = DAO.username + ".CLIENT_BILL_RECEIVE  ";
        public static final String clientBillTransferDetail = DAO.username + ".CLIENT_BILL_TRANSFER_DETAIL  ";

        public static final String clientBillMaster = DAO.username + ".CLIENT_BILL_MASTER  ";
        public static final String clientBillDetail = DAO.username + ".CLIENT_BILL_DETAIL  ";
        public static final String clientAmountReceiveWiseBill = DAO.username + ".CLIENT_RECEIVE_BILLS_NO  ";

        public static final String clientCptUpdateHistory = Database.username + ".CLIENT_CPT_UPDATE_HIST  ";

        public static final String outsideInvestigations = DAO.username + ".OUTSIDE_INVESTIGATIONS  ";

        public static final String pathSeriologyResultDetail = DAO.username + ".PATH_SERIOLOGY_RESULT_DETAIL  ";
        public static final String userWiseLocations = DAO.username + ".USER_WISE_LOCATIONS  ";
        public static final String pathOrganismGrowth = DAO.username + ".PATH_ORGANISM_GROWTH  ";
        public static final String pathGrowthSensitivity = DAO.username + ".PATH_GROWTH_SENSITIVITY  ";
        public static final String pathOrganismQuantity = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String cptHoldResults = DAO.username + ".CPT_HOLD_RESULTS   ";//

        /**
         * cardiology setup tables
         */
        public static final String wire = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String stent = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String stentType = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String chether = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String chetherCurve = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String chetherDiameter = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String balloonLength = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String balloonType = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        //END CATH SETUP TABLES
        public static final String radiologyData = " radiology.dbo.RadIntegration   ";
        //Tables for Security Implmentation
        public static final String rightsAssignHistory = Database.username + ".RIGHTS_ASSIGN_HISTORY   ";
        public static final String roleWiseForm = DAO.username + ".ROLE_WISE_FORM  ";
        public static final String userWiseRole = DAO.username + ".USER_WISE_ROLE  ";
        public static final String formWiseAction = DAO.username + ".FORM_ACTION  ";

        public static final String form = DAO.username + ".FORM  ";
        public static final String terminal = DAO.username + ".TERMINALS  ";
        public static final String terminalMacAddress = DAO.username + ".TERMINAL_MAC_ADDRESSES   ";
        public static final String menu = DAO.username + ".MENU  ";
        public static final String modality = DAO.username + ".MODALITY  ";
        public static final String symbols = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String appGroupComponent = DAO.username + ".APP_GROUP_COMPONENT  ";
        public static final String refundMaster = DAO.username + ".REFUND_MASTER  ";
        public static final String refundDetail = DAO.username + ".REFUND_DETAIL  ";
        public static final String modalityWiseCPT = DAO.username + ".MODALITY_WISE_CPT  ";
        public static final String receivedBalanceHistory = DAO.username + ".BALANCE_RECEIVED_HISTORY  ";
        public static final String reportPrintHistory = DAO.username + ".REPORT_PRINT_HISTORY  ";
        public static final String reportingFormat = DAO.username + ".REPORTING_FORMAT   ";
        public static final String reportingDay = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String reports = DAO.username + ".APP_REPORTS   ";
        public static final String userWiseReports = DAO.username + ".USER_WISE_REPORTS   ";
        public static final String reportWiseParameter = DAO.username + ". REPORT_WISE_PARAMETER   ";
        public static final String reportParameter = DAO.username + ". REPORT_PARAMETER   ";
        public static final String dailyCashSummary = DAO.username + ".DAILY_CASH_SUMMARY   ";
        public static final String invoicePrintHistory = Database.username + ".INVOICE_PRINT_HISTORY   ";
        public static final String unverifyReportHistory = Database.username + ".UNVERIFY_REPORT_HISTORY   ";
        public static final String orderAction = DAO.username + ".ORDER_ACTIONS   ";
        public static final String partiallyVerifyHistory = DAO.username + ".PARTIAL_VERIFICATION_HISTORY   ";
        public static final String conference = DAO.username + ".CONFERENCE  ";
        public static final String conferenceStudy = DAO.username + ".CONFERENCE_STUDY   ";
        public static final String venue = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String clinic = DAO.username + ".CLINIC   ";
        public static final String clinicDetail = DAO.username + ".CLINIC_DETAIL   ";
        public static final String clinicTime = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String imagingOldStudies = "DUHS.PREVIOUS_REPORTS_INVESTIGATION   ";
        public static final String radLexCode = DAO.username + ".RADLEX_CODE   ";
        public static final String MHRADPOC = DAO.username + ".MH_RAD_POC   ";

        //PATHOLOGY TABLES
        public static final String pathologyAnalyzerWiseParameter = DAO.username + ".PATH_ANALYZER_WISE_PARAMETER   ";
        public static final String CPTWiseParameter = DAO.username + ".CPT_WISE_PARAMETER   ";
        public static final String pathologysSerologyDetail = DAO.username + ".PATH_SERIOLOGY_RESULT_DETAIL   ";
        public static final String pathologyAnalyzerRanges = DAO.username + ".PATH_ANALYZER_RANGES   ";
        public static final String pathologySpecimen = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String pathologyPendingQueue = DAO.username + ".PATHOLOGY_PENDING_QUEUE   ";
        public static final String pathologyResultMaster = DAO.username + ".PATHOLOGY_RESULT_MASTER   ";
        public static final String pathologyResultDetail = DAO.username + ".PATHOLOGY_RESULT_DETAIL   ";
        public static final String workFlowComments = DAO.username + ".WORKFLOW_COMMENTS   ";
        public static final String PATH_PRD_LOG = Database.username + ".PATH_RESULT_DETAIL_LOG   ";

        public static final String caseAssignHistory = DAO.username + ".CASE_ASSIGN_HISTORY   ";
        public static final String pathologyResultDetailHistory = Database.username + ".PATHOLOGY_RESULT_HISTORY   ";
        public static final String pathologyUrineResult = DAO.username + ".PATH_URINE_RESULT   ";
        public static final String pathologyStoolResult = DAO.username + ".PATH_STOOL_RESULT   ";
        public static final String pathologyBoneMarrow = DAO.username + ".PATH_BONE_MARROW_REPORT   ";
        public static final String pathologyCultureReport = DAO.username + ".PATH_CULTURE_REPORT   ";
        public static final String pathologyCultureGrowth = DAO.username + ".PATH_CULTURE_GROWTH   ";
        public static final String pathologyCultureMedicine = DAO.username + ".PATH_CULTURE_MEDICINE   ";
        public static final String pathologyCSFCytology = DAO.username + ".PATH_CSF_CYTOLOGY   ";
        public static final String pathologyCYTBiochemistry = DAO.username + ".PATH_CYT_BIOCHEMISTRY   ";
        public static final String pathologyTextReporting = DAO.username + ".PATH_TEXT_REPORTING   ";
        public static final String pathologySemenAnalysis = DAO.username + ".PATH_SEMEN_ANALYSIS   ";
        public static final String pathologySemenIntervals = DAO.username + ".PATH_SEMEN_INTERVALS   ";
        public static final String blbProductDeliveryHistory = DAO.username + ".BLB_PRODUCT_DELIVERY_HISTORY   ";

        //OPD
        public static final String ICD = DAO.username + ".ICD   ";
        public static final String ICDChapter = DAO.username + ".ICD_CHAPTER   ";
        public static final String ICDGroup = DAO.username + ".ICD_GROUP    ";
        public static final String opdPendingConsultancy = DAO.username + ".OPD_PENDING_CONSULTANCY   ";
        public static final String opdPerformedConsultancy = DAO.username + ".OPD_PERFORMED_CONSULTANCY   ";
        public static final String pregnancyHistory = Database.username + ".PREGNANCY_HISTORY   ";
        public static final String OBSGYNUltrasound = DAO.username + ".OBS_GYN_ULTRASOUND ";
        public static final String antenatalVisitHistory = DAO.username + ".ANTENATAL_VISITS_HISTORY ";

        public static final String medicineType = DAO.username + ".DEFINITION_TYPE_DETAIL    ";
        public static final String medicineOrderDetail = DAO.username + ".ORDER_DETAIL_MEDICINE   ";
        public static final String medicinePackageDetail = DAO.username + ".MEDICINE_PACKAGE_DETAIL   ";
        public static final String patientVitalSigns = DAO.username + ".PATIENT_VITAL_SIGNS   ";
        public static final String medicinePackage = DAO.username + ".MEDICINE_PACKAGE   ";
        public static final String patientExam = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String specialitySpecificData = DAO.username + ".SPECIALITY_DATA   ";
        public static final String specialityWiseExam = DAO.username + ".SPECIALITY_WISE_EXAM   ";
        public static final String specialityExamDetail = DAO.username + ".SPECIALITY_EXAM_DETAIL   ";
        public static final String opdExaminations = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patientExaminationsDetail = DAO.username + ".PATIENT_EXAMINATION_DETAIL   ";
        public static final String terminalWiseEmp = DAO.username + ".TERMINAL_WISE_EMP  ";
        public static final String CPTWiseItem = DAO.username + ".CPT_WISE_ITEM   ";
        public static final String userActionWiseParameter = DAO.username + ".USER_ACTION_WISE_PARAMETER   ";
        public static final String userActionPerformed = DAO.username + ".USER_ACTION_PERFORMED   ";

        public static final String waiveOff = DAO.username + ".WAIVE_OFF  ";
        public static final String locationWiseSetup = DAO.username + ".LOCATION_WISE_SETUP  ";

        public static final String CPTBreakupItems = DAO.username + ".CPT_BREAKUP_ITEMS  ";
        public static final String ActionWiseSMSEmailInfo = DAO.username + ".ACTION_WISE_EMAILS  ";

        public static final String transplantReviews = DAO.username + ".TRANSPLANT_REVIEWS  ";

        public static final String CPTHistory = Database.username + ".CPT_HISTORY  ";
        public static final String locationHistory = Database.username + ".LOCATION_HISTORY  ";
        public static final String userSession = DAO.username + ".USER_SESSION  ";

        public static final String setupTableColums = DAO.username + ".SETUP_TABLE_COLUMNS  ";
        public static final String setupColumnDetailHistory = Database.username + ".COLUMN_DETAIL_HISTORY  ";
        public static final String propertyEditHistory = Database.username + ".PROPERTY_EDIT_HISTORY  ";

        public static final String teethExamination = DAO.username + ".TEETH_EXAMINATION  ";
        public static final String teethExaminationDetail = DAO.username + ".TEETH_EXAMINATION_DETAIL  ";
        public static final String uploadStudyRequest = DAO.username + ".STUDY_TRANSFER_REQUEST  ";
        public static final String PACSUploadRequest = DAO.username + ".PACS_UPLOAD_REQUEST  ";
        //HR
        public static final String employeeExperience = DAO.username + ".EMPLOYEE_EXPERIENCE   ";
        public static final String employeeDependents = DAO.username + ".EMPLOYEE_DEPENDENTS   ";
        public static final String employeeQualification = DAO.username + ".EMPLOYEE_QUALIFICATION   ";
        public static final String employeePublications = DAO.username + ".EMPLOYEE_PUBLICATIONS   ";
        public static final String employeeOtherInfo = DAO.username + ".EMPLOYEE_OTHER_INFORMATION   ";
        public static final String employeeMembership = DAO.username + ".EMPLOYEE_MEMBERSHIPS   ";
        public static final String employeeLanguages = DAO.username + ".EMPLOYEE_LANGUAGES   ";
        public static final String employeeTrainings = DAO.username + ".HR_EMPLOYEE_TRAININGS   ";
        public static final String employeePromotions = DAO.username + ".HR_PROMOTION_INCREMENT   ";
        public static final String employeeAttachment = DAO.username + ".HR_EMPLOYEE_ATTACHMENTS   ";
        public static final String leaveAttachment = DAO.username + ".HR_LEAVE_ATTACHMENTS   ";
        public static final String employeeThumbScan = DAO.username + ".HR_THUMBSCAN  ";

        public static final String dutyShift = DAO.username + ".DEFINITION_TYPE_DETAIL   ";
        public static final String dutyShiftDetail = DAO.username + ".HR_DUTY_SHIFT_DETAIL   ";
        public static final String dutyRoster = DAO.username + ".HR_DUTY_ROSTER   ";
        public static final String employee = DAO.username + ".HR_EMPLOYEE   ";
        public static final String superAdmin = DAO.username + ".SUPER_ADMIN   ";
        public static final String employeeHistory = Database.username + ".HR_EMPLOYEE_HISTORY   ";
        public static final String employeePayroll = DAO.username + ".HR_PAYROLL   ";
        public static final String employeePicture = DAO.username + ".HR_EMPLOYEE_PICTURE   ";
        public static final String employeeAttendance = DAO.username + ".HR_EMPLOYEE_ATTENDANCE   ";

        public static final String leaveEntry = DAO.username + ".HR_LEAVE_ENTRY   ";
        public static final String leaveContract = DAO.username + ".HR_LEAVE_CONTRACT   ";
        public static final String employeeLeaves = DAO.username + ".HR_EMPLOYEE_LEAVES   ";
        public static final String leaveHierarchy = DAO.username + ".HR_EMP_LEAVE_HIERARCHY   ";
        //for Member Registration
        public static final String memberRegistration = DAO.username + ".MEMBER_REGISTRATION  ";
        public static final String memberInfoRegistration = DAO.username + ".MEMBER_INFO_REGISTRATION  ";
        public static final String memberType = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String memberCity = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String memberInfo = DAO.username + ".MEMBER_INFO_REGISTRATION  ";
        public static final String pendingTeachingFile = DAO.username + ".PENDING_CASE_STUDY  ";
        public static final String humanSystemType = DAO.username + ".DEFINITION_TYPE_DETAIL  ";

        public static final String finalCaseStudy = DAO.username + ".FINAL_CASE_STUDY  ";
        public static final String caseReporting = DAO.username + ".CASE_REPORTING  ";
        public static final String memberPicture = DAO.username + ".MEMBER_PICTURE  ";

        //new added table for hospital
        public static final String admissionUpdateHistory = Database.username + ".ADMISSION_UPDATE_HISTORY  ";
        public static final String bedTransferHistory = Database.username + ".BED_TRANSFER_HISTORY  ";
        public static final String inpatientStatusHistory = Database.username + ".INPATIENT_STATUS_HISTORY  ";

        public static final String patientSymptoms = DAO.username + ".PATIENT_SYMPTOMS  ";
        public static final String caseIcd10Codes = DAO.username + ".CASE_WISE_ICD_CODES ";

        public static final String rackWiseSystem = DAO.username + ".HUMAN_SYSTEM_WISE_RACK ";

        //Missing tables 
        public static final String CPTImageReporting = DAO.username + ".CPTREPORTING   ";
        public static final String fixedAssets = DAO.username + ".FIXED_ASSETS   ";
        public static final String fixedAssetsHistory = DAO.username + ".FIXED_ASSETS_HISTORY   ";
        public static final String patientNotes = DAO.username + ".PATIENT_NOTES ";

        public static final String patientFluidOutputMaster = DAO.username + ".PATIENT_FLUID_OUTPUT_MASTER ";
        public static final String patientFluidOutputDetail = DAO.username + ".PATIENT_FLUID_OUTPUT_DETAIL ";
        public static final String patientFluidInputMaster = DAO.username + ".PATIENT_FLUID_INPUT_MASTER ";
        public static final String patientFluidInputDetail = DAO.username + ".PATIENT_FLUID_INPUT_DETAIL ";
        public static final String medicationDispenseMaster = DAO.username + ".MEDICATION_DISPENSE_MASTER ";
        public static final String medicationDispenseDetail = DAO.username + ".MEDICATION_DISPENSE_DETAIL ";

        public static final String quoReceiveMaster = DAO.username + ".QUOTATION_RECEIVE_MASTER  ";
        public static final String quoRequestMaster = DAO.username + ".QUOTATION_REQUEST_MASTER  ";
        public static final String quoReceiveDetail = DAO.username + ".QUOTATION_RECEIVE_DETAIL  ";
        public static final String quoRequestDetail = DAO.username + ".QUOTATION_REQUEST_DETAIL  ";

        //Blood Bank
        //New Table For Blood Bank
        public static final String blbPendingQueue = DAO.username + ".BLB_PENDING_QUEUE ";
        public static final String blbDonorPerformed = DAO.username + ".BLB_DONOR_PERFORMED ";
        public static final String blbDonorQuestions = DAO.username + ".BLB_DONOR_QUESTIONS ";
        public static final String blbProductOrder = DAO.username + ".BLB_PRODUCT_ORDER ";
        public static final String blbAvailableProducts = DAO.username + ".BLB_AVAILABLE_PRODUCTS ";
        public static final String blbDiscardedProducts = DAO.username + ".BLB_DISCARDED_PRODUCTS ";
        public static final String blbBloodGrouping = DAO.username + ".BLB_BLOOD_GROUPING ";
        public static final String blbTempProductData = DAO.username + "." + "BLB_TEMP_PRODUCTS_DATA ";

        public static final String blbCrossMatchHistory = DAO.username + "." + "BLB_CROSS_MATCH_HISTORY ";

        public static final String blbIssueProduct = DAO.username + ".BLB_ISSUE_PRODUCT ";
        public static final String blbHoldProduct = DAO.username + ".BLB_HOLD_PRODUCT ";
        public static final String blbSpecialApprovalHistory = DAO.username + ".BLB_SPECIAL_APPROVAL_HISTORY ";
        public static final String blbForwardCaseHistory = DAO.username + ".BLB_FORWARD_CASE_HISTORY ";
        public static final String blbProductsHistory = DAO.username + ".BLB_PRODUCT_HISTORY ";
        public static final String blbDonorStatus = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbProductType = DAO.username + ".BLB_PRODUCTS_TYPE ";
        public static final String blbProductStatus = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbDonorDeferralType = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbFridgeType = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbSourceType = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbDefineFridge = DAO.username + ".FRIDGE ";
        public static final String blbDefineShelve = DAO.username + ".SHELVE ";
        public static final String blbDefineCell = DAO.username + ".CELL ";
        public static final String blbScreeningBatch = DAO.username + ".BLB_SCREENING_BATCH ";
        public static final String blbScreeningBatchDetail = DAO.username + ".BLB_SCREENING_BATCH_DETAIL ";
        public static final String hospital = DAO.username + ".HOSPITAL  ";
        public static final String rejectBlood = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbProductRejection = DAO.username + ".DEFINITION_TYPE_DETAIL ";
        public static final String userWiseAccessQueue = DAO.username + ".USER_WISE_ACCESS_QUEUE  ";
        public static final String cptWiseReferenceCPT = DAO.username + ".CPT_REFERENCE_CPT  ";

        public static final String vendorBillPending = DAO.username + "." + "VENDOR_BILL_PENDING ";
        public static final String vendorBillProcessed = DAO.username + "." + "VENDOR_BILL_PROCESSED ";
        public static final String billWorkflowEvents = DAO.username + "." + "BILL_WORKFLOW_EVENTS ";
        public static final String usersGroups = DAO.username + "." + "USERS_GROUPS ";
        public static final String userGroupDetail = DAO.username + "." + "USER_GROUP_DETAIL ";
        public static final String statusChange = Database.username + ".CHANGE_STATUS_HISTORY  ";
        public static final String support = DAO.username + ".HMS_SUPPORT  ";
        public static final String hrEmployee = DAO.username + ".HR_EMPLOYEE  ";
        public static final String thumbscan = DAO.username + ".HR_THUMBSCAN  ";
        public static final String cptRefenceCpt = DAO.username + ".CPT_REFERENCE_CPT  ";
        public static final String traumaVisitComplaints = DAO.username + ".TRAUMA_VISIT_COMPLAINTS  ";
        public static final String traumaUnitTransferHistory = DAO.username + ".TRAUMA_UNIT_TRANSFER_HISTORY  ";

        public static final String userWiseGroup = DAO.username + ". USER_WISE_GROUP   ";

        public static final String otValveSurg = DAO.username + ".OT_VALVE_SUR   ";
        public static final String otClosurePacingWire = DAO.username + ".OT_CLOSURE_PACE_WIRE   ";
        public static final String otCabg = DAO.username + ".OT_CABG   ";
        public static final String otSetupDetail = DAO.username + ".OT_SETUP_DETAIL   ";
        public static final String ipdMedicinePlanMaster = DAO.username + ".IPD_MEDICINE_PLAN_MASTER   ";
        public static final String ipdMedicinePlanDetail = DAO.username + ".IPD_MEDICINE_PLAN_DETAIL   ";

      //  
    }

    public static final class PACS {

        public static final String PACSStudies = DAO.username + ".PACS_STUDY   ";
        public static final String PACSStudyDetail = DAO.username + ".PACS_STUDY_DETAIL   ";

        public static final String PACSCPT = DAO.username + ".PACS_CPT   ";
        public static final String PACSServerPaths = DAO.username + ".PACS_SERVERS_PATH   ";
        public static final String PACSBackupServers = DAO.username + ".PACS_BACKUP_SERVERS   ";
        public static final String PACSPaths = DAO.username + ".PACS_PROCESS_PATH   ";
        public static final String PACSModality = DAO.username + ".PACS_MODALITY   ";
        public static final String CDFolder = DAO.username + ".PACS_CD_FOLDER  ";
        public static final String updatePacsStudy = DAO.username + ".UPDATE_PACS_STUDY  ";

    }

    public static class Inventory {

        public static final String purchaseOrderDetail = DAO.username + ".PURCHASE_ORDER_DETAIL  ";
        public static final String purchaseOrderMaster = DAO.username + ".PURCHASE_ORDER_MASTER  ";
        public static final String issueRequestDetailHistory = Database.username + ".ISSUE_REQUEST_DETAIL_HISTORY  ";
        public static final String storeWiseIndent = DAO.username + ".STORE_WISE_INDENT  ";
        public static final String issueRequestDetail = DAO.username + ".ISSUE_REQUEST_DETAIL  ";
        public static final String issueRequestMaster = DAO.username + ".ISSUE_REQUEST_MASTER  ";
        public static final String issueNoteDetail = DAO.username + ".ISSUE_NOTE_DETAIL  ";
        public static final String issueNoteMaster = DAO.username + ".ISSUE_NOTE_MASTER  ";
        public static final String receiveDetail = DAO.username + ".RECEIVE_DETAIL  ";
        public static final String receiveMaster = DAO.username + ".RECEIVE_MASTER  ";
        public static final String itemLedger = DAO.username + ".ITEM_LEDGER  ";
        public static final String storeWiseItems = DAO.username + ".STORE_WISE_ITEMS  ";
        public static final String storeWiseItemsHistory = Database.username + ".STORE_WISE_ITEMS_HISTORY  ";
        public static final String party = DAO.username + ".PARTY  ";
        public static final String store = DAO.username + ".STORE  ";
        public static final String itemReturnHistory = DAO.username + "." + "ITEM_RETURN_HISTORY ";
        public static final String toDateValidity = DAO.username + ".DEFINITION_TYPE_DETAIL  ";
        public static final String quoReceiveMaster = DAO.username + ".QUOTATION_RECEIVE_MASTER  ";
        public static final String quoRequestMaster = DAO.username + ".QUOTATION_REQUEST_MASTER  ";
        public static final String quoReceiveDetail = DAO.username + ".QUOTATION_RECEIVE_DETAIL  ";
        public static final String quoRequestDetail = DAO.username + ".QUOTATION_REQUEST_DETAIL  ";
        public static final String itemWorkFlowEvent = DAO.username + ".ITEM_WORKFLOW_EVENT  ";
        public static final String itemActionEvents = DAO.username + ".ITEM_ACTION_EVENTS  ";
        public static final String forwardQueue = DAO.username + ".FORWARD_QUEUE  ";
        public static final String hierarchyQueue = DAO.username + ".HIERARCHY_RIGHTS  ";
        public static final String forwardQueueMaster = DAO.username + ".FORWARD_QUEUE_MASTER ";
        public static final String itemDispenseMaster = DAO.username + ".ITEM_DISPENSE_MASTER ";
        public static final String itemReturnMaster = DAO.username + ".ITEM_RETURN_MASTER ";
        public static final String itemDispenseDetail = DAO.username + ".ITEM_DISPENSE_DETAIL ";
        public static final String itemReturnDetail = DAO.username + ".ITEM_RETURN_DETAIL ";
        public static final String toStore = DAO.username + ".STORE ";
        public static final String fromStore = DAO.username + ".STORE ";

        public static final String storeWiseUser = DAO.username + ".STORE_WISE_USERS ";
        public static final String patientDischarge = DAO.username + ".PATIENT_DISCHARGE ";
        public static final String dischargeDetail = DAO.username + ".DISCHARGE_DETAIL ";
        public static final String indentTemplateMaster = DAO.username + ".INDENT_TEMPLATE_MASTER ";
        public static final String indentTemplateDetail = DAO.username + ".INDENT_TEMPLATE_DETAIL ";

        public static final String partyQuotation = DAO.username + "." + "PARTY_QUOTATION ";

        public static final String billWorkflowEvents = DAO.username + "." + "BILL_WORKFLOW_EVENTS ";
        public static final String vendorBillPending = DAO.username + "." + "VENDOR_BILL_PENDING ";
        public static final String vendorBillProcessed = DAO.username + "." + "VENDOR_BILL_PROCESSED ";
        public static final String tenderMaster = DAO.username + "." + "TENDER_MASTER ";
        public static final String tenderDetail = DAO.username + "." + "TENDER_DETAIL ";
        public static final String tenderWiseParties = DAO.username + "." + "TENDER_WISE_PARTY ";
        public static final String tenderWisePartyItems = DAO.username + "." + "TENDER_PARTY_ITEMS ";
        public static final String batchWiseItemHistory = Database.username + "." + "BATCH_WISE_ITEM_HISTORY ";
        public static final String storeWiseItemsDetail = DAO.username + "." + "STORE_WISE_ITEMS_DETAIL ";
        

    }
}

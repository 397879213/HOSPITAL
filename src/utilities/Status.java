/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

public class Status {

    //TelradilologyStatus
    public static String teleOrder = "1";
    public static String telePerformed = "2";
    public static String teleCancel = "3";
    public static String teleUploadRequest = "4";
    public static String teleUploaded = "5";
    public static String teleDownloaded = "6";
    public static String teleReportSave = "7";
    public static String teleFinalSign = "8";
    public static String teleTransferred = "9";

    //new ot status
    public static String releasePatient = "6114";
    public static String surgeryPlanned = "6109";
    public static String preOPPrepration = "6110";
    public static String surgeryNotesVerified = "6111";
    public static String inOT = "6112";
    public static String surgeryperformed = "6113";
    public static String postOPRecovery = "6128";
    //new ot sgtatus

    public static String anaesthesiaStarted = "6124";
    public static String anaesthesiaEnded = "6125";
    public static String surgeryStarted = "6126";
    public static String surgeryEnded = "6127";
    public static String transferToOT = "6067";
    public static String backToOT = "6061";

    ////DONOR STATUS ENTRY IN FORM 
    public static String bagDelivered = "5252";
    public static String bagReserved = "5321";
    public static String bagReleased = "5472";

    //ORDER STATUS
    public static String crossMatched = "5206";
    public static String notCrossMatched = "5207";
    public static String pendingCrossMatched = "5470";
    public static String backToAvailableProduct = "5471";
    public static String transfusionReaction = "5498";

    public static String ordered = "4";
    public static String invoiced = "5";
    public static String performed = "6";
    public static String canceled = "7";
    public static String rejected = "8";
    public static String acknowledged = "9";
    public static String dictated = "10";
    public static String transcribed = "11";
    public static String verified = "12";
    public static String unverified = "13";
    public static String refund = "14";
    public static String partialRefund = "329";
    public static String partiallyVerified = "2600";
    public static String bloodGroupNotSpecified = "52";

    public static String phlebotomistAcknowledgement = "15";
    public static String sectionAcknowledgement = "16";
    public static String added = "17";
    public static String discussed = "18";
    public static String hold = "19";
    public static String save = "20";
    public static String forwarded = "21";
    public static String backTo = "22";
    public static String cancelRequest = "23";
    public static String withoutReport = "24";
    public static String receivedFilmsForReport = "25";
    public static String grossing = "5079";
    public static String processing = "5080";
    public static String embedding = "5081";
    public static String cutting = "5082";
    public static String staining = "5083";
    public static String forwardtoReporting = "5192";

    public static String indentForward = "5196";
    public static String grnForward = "5197";
    public static String purchaseForward = "5198";
    public static String materialIssueForward = "5199";

    // PatientPregnancyHistory
    public final static String statusCompleteHistory = "Z";//means complete history,used only in patient pregnancy history form
    public static String entered = "26";
    public static String Approved = "27";
    //public static String requestIssued = "5500";

    public static String reportInProgress = "383";
    public static String uploaded = "382";
    public static String supervisorApproved = "1277";

    public static String fileRequested = "64";
    public static String fileOut = "65";
    public static String fileIn = "66";

    public static String admissionRequest = "68";
    public static String admitted = "69";
    public static String bedTransferReqest = "5812";

    //Inventory
    public static String partialReceiving = "2515";
    public static String indentClose = "2516";
    public static String indentRequestInProgress = "6144";
    public static String ledgerIn = "2517";
    public static String ledgerOut = "2518";
    public static String grnReceive = "2532";
    public static String inventoryGRN = "3001";
    public static String inventoryIssue = "3002";
    public static String inventoryReceive = "3003";
    public static String inventorySupplierReturn = "3004";
    public static String inventoryMaterialReturn = "3005";
    public static String inventoryDispense = "3006";
    public static String inventoryRefundInventory = "3007";
    public static String inventoryCancel = "3008";
    public static String inventoryApprovedAndReceived = "3009";

    public static String activeAsset = "";

    public static String TeachingFileRequest = "3009";
    public static String TeachingFileDefine = "3009";

    //select data without cancel Request Orders
    public static String withoutCancelRequest = "000";
    public static String discharged = "2519";

    public static String itemReturn = "2093";
    public static String dischargeRequest = "5346";
    public static String medicallyDischarge = "2519";

    //path status
    public static String others = "429";
    public static String backToPhelobotomist = "2569";
    public static String backToSectionAck = "2570";
    public static String outReachToSectionAck = "2635";
    public static String backToOutReach = "2636";
    public static String outReachAck = "2637";
    public static String backtoReceptionist = "428";
//Pathology Batch Generation
    public static String batchGenerated = "72";
    public static String batchRecieved = "71";
    public static String batchReverted = "20027";

    //blood BANK
    ////DONOR STATUS ENTRY IN FORM 
    public static String donorBleeding = "5207";
    public static String donorAccepted = "5209";

//PRODUCT STATUS ENTRY IN FORM
    public static String released = "6001";
    public static String timeOut = "6002";
    //s public static String bagScreened = "6003";
    public static String unScreened = "6004";
    public static String delivered = "6005";
    public static String expired = "6006";

    public static String fridgeArranged = "6008";
    public static String ProductOrder = "6015";
    public static String arranged = "6007";
    public static String backToPhelebotomist = "2569";

//to be added
    public static String lama = "5213";
    public static String selfFinance = "5216";
    public static String fileHold = "5217";
    public static String death = "5215";
    public static String dor = "5214";
    public static String transferOutOfHsopital = "5218";
    public static String shiftingInHospital = "5219";
    public static String medicalDischarge = "5220";

    //BLOOD BANK PRODUCT STATUS       
    public static String physicalAcceptance = "5200";
    public static String donorBleeded = "5201";
    public static String donorSpecialApproval = "5202";
    public static String bloodGrouping = "5203";
    public static String bloodScreening = "5204";
    public static String donorPendingPhysicalApproval = "5205";
    public static String donorPendingBleedingApproval = "5242";
    public static String donorPhysicallyRejected = "5243";
    public static String donorBleedingRejected = "5244";
    public static String donorScreeningRejected = "5245";
    public static String donorPerformed = "5246";
    public static String donorScreeningAccepted = "5263";
    public static String transfusionCaseStudy = "5499";

    //BLOOD BANK PRODUCT STATUS       
    public static String saveDonorDetails = "5060";
    public static String financiallyDischarge = "290";
    //BLOOD BANK NEW PRODUCT STATUS
    public static String bagBleeded = "5247";
    public static String volumeNotSatisfactory = "5068";

    public static String bagRecieved = "5248";
    public static String bagScreened = "5249";
    public static String bagDiscarded = "5250";
    public static String bagAttached = "5251";

    //INVENTORY STATUS
    public static String prepareBill = "6131";
    public static String receiveBill = "6132";
    public static String auditBill = "6133";
    public static String dispatchBill = "6134";
    public static String dispatchReceived = "6135";
    public static String chequePrepare = "6136";
    public static String chequeDeliver = "6137";
    public static String inspectionDone = "6130";
    public static String indentRequestProcessed = "6150";
    public static String exportStatus = "N";
    public static String liquidSection = "8585";

}

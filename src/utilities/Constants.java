package utilities;

import BO.Machine;
import BO.OPDConsultancy;
import Form.general.DCMS_MDI;
import TableModel.GeneralTableLookAndFeel;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JInternalFrame;

@ManagedBean
@SessionScoped

public class Constants implements java.io.Serializable {

    public static String refDocName = "";
    public static Vector<String> vecMail = new Vector<>();
    public static Vector<String> menuIds = new Vector<>();
    public static Vector vecModality = new Vector();
    public static HashMap hashFrontServers = new HashMap();
    public static HashMap hashBackupServers = new HashMap();
    public static HashMap hashCompress = new HashMap();
    public static HashMap<String, String> hashSuperAdmin = new HashMap<>();
    public static HashMap hashPaths = new HashMap();
    public static HashMap hashStudy = new HashMap();
    public static HashMap hashPendingReports = new HashMap();
    public static HashMap hashTransferSyntax = new HashMap();
    public static HashMap hashFileTypes = new HashMap();
    public static HashMap hashFilmSizeId = new HashMap();
    public static HashMap hashContrastId = new HashMap();
    public static String[] radiologists = null;
    public static String[] cardiologists = null;
    public static String[] pathologists = null;
    public static String[] NMPhysician = null;
    public static String[] sections = null;
    public static String[] sectionOnly = null;

    //******************** G Constants  ********************//
    public static boolean laptop = false;
    public static String softAppName = "MISSION.exe";
    public static String softAppPath = "";
    public static String displayInfoMessage = "Reporting Template Definition";
    public static String displayMDIMessage = "";
    

    public static String days = "ALL";
    public static String reportTimeByDay = "784";
    public static String lastQueryTime = "2";
    public static String userTextFont = "Arial";
    public static int userTextFontSize = 16;
    public static String userRTFFontSize = "fs24";

    public static String xmlPath = "C:\\PL.xml";
    public static String PLLogo = "\\\\pacs-manager\\PACSDATA\\PL\\logo.jpg";
    //********************  PATHS ****************************//
    public static String customerId = "";
    public static String tempFolder = "TEMP_FOLDER";
    public static String recieveImagesFolder = "RECEIVE_IMAGES_FOLDER";
    public static String compressFolder = "COMPRESS_FOLDER";
    public static String incorrectFolder = "INCORRECT_FOLDER";
    public static String tagsFolder = "TAGS_FOLDER";
    public static String CTRequiredServer = "CT_REQUIRED_SERVER";
    public static String userInput = "";
    public static boolean deletereportParameter = false;
    //********************  VIEWERS  ****************************//
    public static String checkClearCanvas = "C:\\Program Files\\clearcanvas\\clearcanvas workstation";
    public static String clearCanvasViewer = "\"C:\\Program Files\\clearcanvas\\clearcanvas workstation\\ClearCanvas.Desktop.Executable.exe\" ClearCanvas.Desktop.Application   ";
    public static String IPACSViewer = "cmd /m /c start /max D:\\pacsdata\\iPACSViewer\\iPACS_Viewer.exe     ";
    public static String PLViewer = "cmd /m /c start /max    \\\\PACS-MANAGER\\PACSDATA\\PL\\viewer.exe   ";
    public static String ECGViewer = "cmd /m /c start /max   D:\\ECG\\ECGViewer.exe   ";
    public static String clearCanvassLocalViewer = "\"C:\\Program Files\\clearcanvas\\clearcanvas workstation\\ClearCanvas.Desktop.Executable.exe\" ClearCanvas.Desktop.Application   ";
    //********************  TAGS ****************************//
    public static String name = "PACSLINK Corporation";
    public static String tag = "PLDEMO-";
    public static String doctor = "Dr. PLDEMO";
    public static String donorPatient = "001000000001";
    public static String clientId = "";
    public static String clientName = "";
    //public static String itemLedgerId = "";
    public static String storeId = "171341";

    //********************  GUI DISPLAY ****************************//
    public static String modality = "";
    public static String errorMessage = "Unable to save data kindly contact administrator";
    public static String message = "Unable to save data kindly contact administrator";
    public static String messageInfo = "";

    public static String infoMessage = "Record successfully save";
    public static String queryModalities = "";
    public static String querySearchData = "";
    public static String attachedMRNOs = "";
    public static String AZNLANIP = "176.75.97.250";
    public static String AZNRemoteIP = "116.58.29.106";

    public static String DUHSIP = "10.10.12.4";
    public static String DUHSRemoteIP = "103.4.92.87";

    public static String medicineOrderType = "002";
    public static Vector comboModality = new Vector(); //
    public static Vector comboViewer = new Vector();  // comboViewer Values
    public static Vector comboModalityInfo = new Vector(); //Modality For Export
    //******************* HEADERS AND FOOTERS ******************************//
    public static String headerServerLog = "SERVER LOG";
    public static String headerPACSAlerts = "PACS ALERTS E-MAIL CONFIGURATION";
    public static String headerModalityServerPaths = "MODALITY SERVER PATHS";
    public static String headerBackupManagement = "BACKUP MANAGEMENT";
    public static String headerWKSAdmin = "ADMIN WORK STATION";
    public static String headerWKSUser = "Workstation";
    //public static String footerAllScreens = "All Rights Reserved A Product of DICOM Firm";
    public static String footerAllScreens = "All Rights Reserved A Product of Pacslink Corporation ";
    public static String cdFilePath = "D:\\CD\\IMAGES\\";
    public static String openStudyServer = "127.0.0.1";
    //******************* HEADERS AND FOOTERS ******************************//
    public static ImageIcon logo = new ImageIcon("");
    public static int colorBR = 102;
    public static int colorBG = 0;
    public static int colorBB = 102;
    public static int colorHFR = 102;
    public static int colorHFG = 0;
    public static int colorHFB = 102;
    //********************  MAIN WKS PARAM.xml File ****************************//    
    public static String mainWKSHeader = "";
    public static String mainWKSFooter = "";
    public static String mainWKSTitle = "";
    public static String cdImagesFolders = "";
    public static String databaseIP = "";
    public static String sid = "";
    public static String port = "";
    //********************  TABLES ****************************//
    public static String radiologySchema = "";
    public static String referringDoctorName = "";
    public static String PACSSchema = "";
    public static String PACSAlertMessage = "";
    public static int PACSAlertCount = 0;
    public static boolean PACSAlert = false;
    public static String locationId = "";
    public static String definitionSelect = "506";
    public static int randomNumberLength = 10;
    public static String userTimeOutTime = "1";

    public static String locationName = "";
    public static String mrnoLength = "";
    public static String locationClientId = "";
    public static String inpatientClientId = "270";

    public static String locationClientName = "";
    public static String clientTestLimit = "N";
    public static String clientCheckCreditLimit = "N";
    public static String balancePercentage = "75";
    public static String clientCreditLimit = "0";
    public static String organizationId = "";

    public static String organizationName = "";
    public static String logoPath = "";
    public static String locationInvoicePrinting = "";
    public static String locationInvoicePrintingCount = "";
    public static String slogan = "";
    public static String macAddress = "";
    public static String adminMacAddress = "54-53-ED-2A-45-04";
    public static String website = "";
    public static String itemOrder = "002";
    public static String testOrder = "001";
    public static String cptOrderTime = "A";
    public static String patientType = "001";
    public static String departmentId = "02";
    public static String pathologyReportingPhysician = "";
    public static String userId = "PLC";
    public static HashMap userRightsMap = new HashMap();
    public static String userFullName = "";
    public static String userDepartment = "";
    public static String systemAdministrator = "PLC";
    public static String userDepartmentId = "";
    public static String displayMessage = "";
    public static int displayCount = 0;
    public static boolean messageAlert = false;
    public static String userSectionId = "";
    public static String userSection = "";
    public static String userLocationId = "";
    public static String userLocationName = "";
    public static String reportPassword = "";
    public static String userDesignation = "";
    public static String userSpecialityId = "";
    public static String userSpecialityDescription = "";
    public static String userDesignationId = "";
    public static String dcms = "EMR";
    public static String today = "SYSDATE";

    public static int totalRowsUpdates = 0;
    public static String radiologyNo = "";
    public static String terminalId = "";
    public static String applicationVersion = "27.4.17";
    public static String loginMessage = "";
    public static String terminalStoreId = "";
    public static String terminalStoreDescription = "";
    public static String ipAddress = "";
    public static String onlineStatus = "";
    public static String terminalName = "";
    public static String locationlnvoice = "";
    public static String paymentMode = "01";

    public static int accessionNolength = 12;
    public static int accessionArraylength = 10;
    public static int accessionNoEntryLength = 6;
    public static String orderLocationId = "";
    public static String orderLocationName = "";
    public static String completePatientId = "";
    public static String completePatientClientId = "";
    public static String allLocations = "";
    public static String privatePatient = "001";
    public static final String itemSection = "ITEM";
    public static String selectedDate = "";
    public static boolean userAuthentcated = false;
    public static String userAuthentcatedId = "";
    public static String selectedOrderType = "Item";
    public static String receiveMaster;

    public static String issueNoteMaster;
    public static final String walkinPatient = "001000000000";
    public static String quoReceiveMaster = "";
    public static String sessionId = "";
    public static String reportUpdated = "";
    public static String libsUpdated = "";
    public static String appUpdated = "";
    public static String hrEnable = "";
    public static boolean clientBillbalanceAvailable;

    public static boolean pathologyReportingFetchData;
    public static String referringDoctorId;
    public static String generalContract = "726";
    public static String labelPrinter = "ZDesigner GK420";
    public static List<String> selectedServices = new ArrayList<>();
    public static int numberOfPrints = 1;

    public static String labNo = "";
    public static String analyzerId;
    public static String analyzerDesc;
    public static String printLog = "N";
    public static boolean alreadyOpenForm = false;
    public static JInternalFrame currentFrame = null;
    public static String teleradiologyServer = "\\\\176.75.97.250\\PACS-DATA";
    public static String transferJarFilePath = "";
    //public static String teleradiologyServer = "\\\\176.75.97.250\\PACS-DATA";
    public DCMS_MDI pane = new DCMS_MDI();
    //BELOW  COLUMNS ARE USE TO HANDLE Oemrder and INVOICE FROM NEW ORDER ETC
    public static String orderNo = "";
    public static String issueRequestMaster = "";
    public static String refundNo = "";
    public static String completeOrderNo = "";
    public static String orderDetailId = "";

    public static String[] cboDays = {"Today", "Yesterday", "Last 3 Days",
        "Last 7 days", "Last 14 days", "Last 21 days", "ALL", "Urgent"};
    public static String[] week = {"", "SUNDAY", "MONDAY", "TUESDAY",
        "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    public static String[] weekDays = {"", "1", "2", "3", "4", "5", "6", "7"};
    public static String[] locations = null;
    public static String[] orderLocations = null;
    public static String[] departments = null;
    public static String[] cboMachines = null;
    public static String[] cboModalities = null;
    public static String[] cboSymbols = null;

    public static String[] pathologyMachines = null;
    public static boolean[] orderInvoiceStatus = null;
    public static boolean[] medicineInvoiceStatus = null;
    public static boolean[] clientInvoiceStatus = null;
    public static boolean[] refundStatus = null;
    public static boolean[] ackStatus = null;
    public static boolean commit = false;
    public static boolean addUserCondition = false;
    public static String invoiceNo = "";

    public static int updateLimitHours = 2;

    public static float discountOnEachCPT1 = 0;
    //application color
    public static int generalTableHeaderWidth = 18;   //118   // pink = 218
    public static int red = 169;   //118   // pink = 218
    public static int green = 190;   //125
    public static int black = 236;   //118
    //Orgnization title
    public static String mainTitle = "";
    public static String title = "PACSLink ";
    public static String print = "PRINT";
    public static String view = "VIEW";
    public static String viewPrint = "viewPrint";
    public static String yes = "YES";
    public static String no = "NO";

    public static String jpegViewer = "\\REPORTS\\artsage32.exe   ";
    public static String reportInvoiceOutput = "\\INVOICE\\";
    public static String outReportPath = "\\EXPORT\\";
    public static String pdfServer = "\\EMAIL\\";
    public static String prescriptionFile = "";
    public static String prescriptionServer = "\\PRESCRIPTION\\";
    //public static String invoiceReportPath = "G:\\Development\\AZNOSTICS\\REPORTS\\invoiceReport.jasper";
    public static String applicationServer = "D:\\RISPACS";
    public static String reportEmail = "\\REPORTS\\EmailFinalResult.jasper";
    public static String CPTTypeId = "001";
    public static String inHouseDoctor = "NAJAM";
    //public static String radiologist = "NAJAM";
    public static String referringDoctor = "NAJAM";
    public static String reported = "009";
    public static String transcribed = "008";
    public static DAO dao = new DAO();
    public static String CPTDescription = "";
    public static String CPTId = "CPT";

    public static String stockMinus = "-";
    public static String stockPlus = "+";

    public static String appDateFormat = "DD-MM-YY";
    public static GeneralTableLookAndFeel tablelook
            = new GeneralTableLookAndFeel();
    public static String client = "AZNOSTICS";
    public static String lovDescription = "DESCRIPTION";
    public static String lovID = "ID";
    public static String lovClinicType = "ID";
    public static String normal = "Save as Template";
    public static String updateTemplate = "Update Template";
    public static String wordShortcut = "Words & Shortcut";

    public static OPDConsultancy opd = null;
    public static HashMap<String, String> hashCPTCodes = new HashMap<>();
    public static HashMap<String, String> cboDaysHash = new HashMap<>();
    public static HashMap<String, String> cboHashRadiologistName = new HashMap<>();
    public static HashMap<String, String> cboHashRadiologist = new HashMap<>();
    public static HashMap<String, String> hashRadiologistUsers = new HashMap<>();
    public static HashMap<String, String> cboHashCardiologist = new HashMap<>();
    public static HashMap<String, String> cboHashNMPhysician = new HashMap<>();
    public static HashMap<String, String> cboHashPathologist = new HashMap<>();
    public static HashMap<String, String> hashOrderLocationId = new HashMap<>();
    public static HashMap<String, String> cboDepartmentHash = new HashMap<>();
    public static HashMap<String, Boolean> technologistRequired = new HashMap<>();
    public static HashMap<String, String> hashLocations = new HashMap<>();
    public static HashMap<String, String> hashGetDepartmentID = new HashMap<>();
    public static HashMap<String, String> hashGetReportingFormat = new HashMap<>();
    public static HashMap<String, String> hashGetReportDay = new HashMap<>();
    public static HashMap<String, String> hashGetReportName = new HashMap<>();
    public static HashMap<String, String> hashGetDepartmentDescription = new HashMap<>();
    public static HashMap<String, String> hashUserMenuMnemonic = new HashMap<>();//
    public static HashMap<String, String> hashUserMenuItem = null;
    public static HashMap<String, String> hashComponent = new HashMap<>();
    public static HashMap<String, String> hashCDFolders = new HashMap<>();
    public static HashMap<String, String> mapCDImagesFolder = new HashMap<>();
    public static HashMap<String, String> hashModalityMachines = new HashMap<>();
    public static HashMap<String, Machine> cboHashModalityMachines = new HashMap<>();
    public static HashMap<String, String> hashAnalyzersMachines = new HashMap<>();
    public static HashMap<String, String> machineCode = new HashMap<>();
    public static HashMap<String, String> hashContrastQty = new HashMap<>();
    public static HashMap<String, String> pathologyMachineCode = new HashMap<>();
    public static HashMap<String, String> hashReportingPhysicianType = new HashMap<>();
    public static int xSize = 1030;
    public static int ySize = 780;
    public static int yExtension = 70;//100;
    public static int xExtension = 140;
    public static int xPathExtension = 250;
    public static int yPathExtension = 40;
    //Buttons Scheme
    Dimension exitButtonDimensions = new Dimension(60, 30);
    Dimension generalButtonDimensions = new Dimension(70, 30);
    Dimension SpacialButtonDimensions = new Dimension(100, 30);
    //public static File dictionary = new File("G:\\downloads\\dictionary_en.ortho");
    public static File dictionary = new File("D:\\RISPACS\\SPELLCHECKER\\dictionary_en.ortho");
    public static String[] months = {"", "JAN", "FEB", "MAR", "APR", "MAY", "JUN",
        "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    // New Tables
    public static void adjustValues() {

        //Set path
        reportInvoiceOutput = Constants.applicationServer + "\\AZN\\INVOICE\\";
        jpegViewer = Constants.applicationServer + "\\REPORTS\\artsage32.exe   ";
        outReportPath = Constants.applicationServer + "\\AZN\\EXPORT\\";
        pdfServer = Constants.applicationServer + "\\AZN\\EMAIL\\";
        prescriptionServer = Constants.applicationServer + "\\PRESCRIPTION\\";

        Constants.cboDaysHash.put("0", "0");
        Constants.cboDaysHash.put("0", "0");
        Constants.cboDaysHash.put("1", "1");
        Constants.cboDaysHash.put("2", "3");
        Constants.cboDaysHash.put("3", "7");
        Constants.cboDaysHash.put("4", "14");
        Constants.cboDaysHash.put("5", "21");
        Constants.cboDaysHash.put("6", "ALL");
        Constants.cboDaysHash.put("7", "Urgent");
        Constants.cboDaysHash.put("8", "");
        Constants.cboDaysHash.put("9", "");
        Constants.cboDaysHash.put("9", "");
        Constants.technologistRequired.put("Y", true);
        Constants.technologistRequired.put("N", false);
    }

    public static int toStoreID = 0;//used only for material issue
    public static int fromStoreID = 0;//used only for material issue
    public static String purchaseOrderNo = "";

    public static String quoRequestMaster = "";
    public static String paramaterImage = "IMAGE";

}

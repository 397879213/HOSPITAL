package Handler;

import BO.StudyData;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import utilities.Constants;
import utilities.Database;
import utilities.EncryptDecryptWithDES;

public class ApplicationSetupHandler implements java.io.Serializable {

    EncryptDecryptWithDES des = new EncryptDecryptWithDES();

    public boolean getTerminalInformation(String macAddress) {

        boolean ret = false;
        String[] columns = {"", "TERMINAL", "NAME", "TYPE", "LOCATION",
            "LOCATION_NAME", "STORE_ID", "STORE_DESCRIPTION", "HR_ENABLE",
            "ORDER_LOCATION_ID", "ORDER_LOCATION", "IP", "ORGANIZATION_NAME",
            "REPORT_UPDATED", "LIBS_UPDATED", "SOFT_APP_PATH", "ONLINE_STATUS",
            "APP_UPDATED", "LIBS_SERVER", "REPORTS_SERVER", "REPORT_PATH",
            "APPLICATION_SERVER", "APPLICATION_PATH", "APPLICATION_VERSION"};

        String query
                = "  SELECT TMA.TERMINAL_ID TERMINAL, TRM.DESCRIPTION NAME, IP, "
                + "  TRM.COMPUTER_TYPE TYPE, LOC.ID LOCATION , LOC.DESCRIPTION "
                + "  LOCATION_NAME, STORE_ID, STR.DESCRIPTION "
                + "  STORE_DESCRIPTION, TRM.ORDER_LOCATION_ID,  "
                + "  OLI.DESCRIPTION ORDER_LOCATION, "
                + "  TRM.REPORT_UPDATED,                                \n"
                + "  TRM.LIBS_UPDATED ,                                 \n"
                + "  TRM.APP_UPDATED  ,                                  \n"
                + "  TRM.REPORT_PATH ,                                  \n"
                + "  ORG.LIBS_SERVER ,                                  \n"
                + "  ORG.HR_ENABLE,                                     \n"
                + "  ORG.SOFT_APP_PATH ,                                \n"
                + "  ORG.REPORTS_SERVER,                                \n"
                + "  ORG.ONLINE_STATUS,                                 \n"
                + "  ORG.APPLICATION_PATH,                              \n"
                + "  ORG.DESCRIPTION ORGANIZATION_NAME,                 \n"
                + "  ORG.VERSION APPLICATION_VERSION,                   \n"
                + "  ORG.APPLICATION_SERVER    FROM                     \n"
                + Database.DCMS.terminal + " TRM,                       \n"
                + Database.DCMS.terminalMacAddress + "      TMA,        \n"
                + Database.DCMS.store + "                   STR,        \n"
                + Database.DCMS.location + "                LOC,        \n"
                + Database.DCMS.organization + "            ORG,        \n"
                + Database.DCMS.definitionTypeDetail + "    OLI         \n"
                + " WHERE TMA.MAC_ADDRESS  = '" + macAddress + "'       \n"
                + " AND TRM.LOCATION_ID = LOC.ID                        \n"
                + " AND TMA.TERMINAL_ID = TRM.TERMINAL_ID               \n"
                + " AND TRM.ORDER_LOCATION_ID = OLI.ID                  \n"
                + " AND LOC.ORGANIZATION_ID = ORG.ID                    \n"
                + " AND STR.ID = TRM.STORE_ID                           \n"
                + " AND TMA.ACTIVE = 'Y'                                \n"
                + " AND TRM.ACTIVE = 'Y'                                \n"
                + " AND LOC.ACTIVE = 'Y'                                \n";

        System.out.println(query);
        Vector vec = Constants.dao.selectData(query, columns);
        String applicationVersion = "";
        if (vec.isEmpty()) {
            Constants.terminalId = null;
            Constants.terminalName = null;
            Constants.ipAddress = null;
            Constants.locationId = null;
            Constants.applicationServer = null;
            Constants.loginMessage = "Invalid terminal Kindly Contact"
                    + " Administrator to enter \n valid license to run application";
            return false;
        }
        HashMap map = (HashMap) vec.get(0);
        Constants.terminalId = map.get("TERMINAL").toString();
        Constants.terminalStoreId = map.get("STORE_ID").toString();
        Constants.terminalStoreDescription = map.get("STORE_DESCRIPTION").toString();
        Constants.terminalName = map.get("NAME").toString();
        Constants.ipAddress = map.get("IP").toString();
        Constants.onlineStatus = map.get("ONLINE_STATUS").toString();
        Constants.locationId = map.get("LOCATION").toString();
        Constants.locationName = map.get("LOCATION_NAME").toString();
        Constants.orderLocationId = map.get("ORDER_LOCATION_ID").toString();
        Constants.orderLocationName = map.get("ORDER_LOCATION").toString();
        Constants.reportUpdated = (map.get("REPORT_UPDATED").toString());
        Constants.libsUpdated = ((String) map.get("LIBS_UPDATED"));
        Constants.appUpdated = ((String) map.get("APP_UPDATED"));
        Constants.hrEnable = ((String) map.get("HR_ENABLE"));
        Constants.softAppPath = map.get("SOFT_APP_PATH").toString();
        Constants.organizationName = ((String) map.get("ORGANIZATION_NAME"));
        applicationVersion = ((String) map.get("APPLICATION_VERSION"));

        Constants.macAddress = macAddress;
        ret = true;
        if (map.get("TYPE").toString().equalsIgnoreCase("LAPTOP")) {
            Constants.laptop = true;
        }

        if (Constants.mrnoLength.equalsIgnoreCase("8")) {
            Constants.accessionNolength = 11;
            Constants.accessionArraylength = 9;
            Constants.accessionNoEntryLength = 5;
        }
        return ret;
    }

    public void setMachineCodeHash() {

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query
                = "  SELECT ID, DESCRIPTION  FROM \n"
                + Database.DCMS.modalityAnalyzer
                + " \n WHERE ACTIVE = 'Y'"
                + " \n AND LOCATION_ID = '" + Constants.locationId + "'";
        Vector vec = Constants.dao.selectData(query, columns);
        Constants.machineCode = new HashMap();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.machineCode.put(map.get("DESCRIPTION").toString(),
                    map.get("ID").toString());
        }
    }

    public void setLocationsArray() {

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.location + " LOC \n"
                + " WHERE ID IN (SELECT ATTACHED_LOCATION_ID FROM  "
                + Database.DCMS.locationWiseLocation + " LWL \n"
                + " WHERE LWL.LOCATION_ID = '" + Constants.userLocationId + "') \n"
                + " AND ACTIVE = 'Y'"
                + " ORDER BY LOC.ID ";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query
                    = "  SELECT ID , DESCRIPTION  FROM \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE ACTIVE = 'Y'"
                    + " ORDER BY LOC.ID ";
        }

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.locations = new String[vec.size() + 1];
        Constants.locations[0] = "ALL";
        Constants.hashLocations.put("ALL", "ALL");
        Constants.hashLocations.put("All", "ALL");
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.locations[i + 1] = map.get("DESCRIPTION").toString();
            Constants.allLocations += "'" + map.get("ID").toString() + "',";
            Constants.hashLocations.put(map.get("DESCRIPTION").toString(),
                    map.get("ID").toString());
        }
        Constants.allLocations = Constants.allLocations.substring(0,
                Constants.allLocations.length() - 1);

    }

    public void setDepartmentHash() {

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.department
                + " \n WHERE ACTIVE = 'Y'"
                + " AND DEF_TYPE_ID =  \n" + utilities.DefinitionTypes.department
                + " \n ORDER BY ID ";

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.departments = new String[vec.size()];
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.departments[i] = map.get("DESCRIPTION").toString();
            Constants.hashGetDepartmentID.put(map.get("DESCRIPTION").toString(),
                    map.get("ID").toString());
            Constants.hashGetDepartmentDescription.put(map.get("ID").toString(),
                    map.get("DESCRIPTION").toString());
        }//
    }//

    public void setSectionWiseMachine() {

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query
                = " SELECT  S.SECTION_ID ID , MAC.DESCRIPTION  DESCRIPTION \n"
                + " FROM "
                + Database.DCMS.sectionMachine + "  SM,  \n"
                + Database.DCMS.section + "  S ,  \n"
                + Database.DCMS.modalityAnalyzer + " MAC  \n"
                + " WHERE S.SECTION_ID  =  SM.SECTION_ID      \n"
                + " AND S.DEPARTMENT_ID =  SM.DEPARTMENT_ID   \n"
                + " AND SM.MACHINE_ID   =  MAC.ID " //
                + " AND MAC.LOCATION_ID = '" + Constants.locationId + "'";//

        Constants.hashModalityMachines = new HashMap();
        Vector vec = Constants.dao.selectData(query, columns);
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.hashModalityMachines.put(map.get("ID").toString(),
                    map.get("DESCRIPTION").toString());
        }
    }

    //Static SETUP Configuration
    public void setReportingPhysicianTypes() {

        Constants.hashReportingPhysicianType.put("RADIOLOGY", "RADIOLOGIST");
        Constants.hashReportingPhysicianType.put("CARDIOLOGY", "CARDIOLOGIST");

    }

    public List<StudyData> selectPatientText() {

        String colums[] = {"-", "PATIENT_ID", "LAB_NO", "MASTER_REPORT", "CPT_REPORT"};

        String query = "\n"
                + "SELECT to_char(prm.text_reporting) MASTER_REPORT,"
                + "to_char(ctr.result)     CPT_REPORT, "
                + "prm.patient_id    PATIENT_ID,"
                + "prm.lab_no       LAB_NO"
                + " EMR.REPORT_VIEW_HISTORY RVH,\n"
                + " emr.pathology_result_master prm,\n"
                + " EMR.USERS USR,\n"
                + " emr.cpt_text_reporting ctr\n"
                + " WHERE (rvh.COMPLETE_ORDER_NO , rvh.ORDER_DETAIL_ID) IN\n"
                + " (\n"
                + " SELECT COMPLETE_ORDER_NO , ORDER_DETAIL_ID  FROM\n"
                + " emr.pathology_result_master         \n"
                + " where section_id = 'MOL'            \n"
                + " AND ORDER_STATUS_ID = 12 )              \n"
                + " AND ACTION_BY =USR.USER_NAME\n"
                + " and prm.complete_order_no = rvh.complete_order_no\n"
                + " and prm.order_detail_id = rvh.order_detail_id\n"
                + " and ctr.complete_order_no = prm.complete_order_no\n"
                + " and ctr.order_detail_id = prm.order_detail_id";
        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<StudyData> lisFluid = new ArrayList<>();

        for (int i = 0; i < lis.size(); i++) {
            HashMap map = lis.get(i);
            StudyData patFluid = new StudyData();
            patFluid.setPatientId(map.get("PATIENT_ID").toString());
            patFluid.setLabNumber(map.get("LAB_NO").toString());
            patFluid.setAddendum(map.get("MASTER_REPORT").toString());
            patFluid.setTextResult(map.get("CPT_REPORT").toString());
            lisFluid.add(patFluid);
            String masterResult = patFluid.getAddendum();
            masterResult = RTFtoString(patFluid.getAddendum());
            String cptResult = patFluid.getTextResult();
            cptResult = RTFtoString(patFluid.getTextResult());
            System.err.println("" + masterResult);
            System.err.println("" + cptResult);
        }
        return lisFluid;
    }

    public static void main(String[] args) {
        ApplicationSetupHandler setup = new ApplicationSetupHandler();
        setup.setSectionWiseMachine();
        setup.setMachineCodeHash();
    }

    public String RTFtoString(String sentence) {

        String text = "";
        try {
            RTFEditorKit rtfParser = new RTFEditorKit();
            Document document = rtfParser.createDefaultDocument();
            rtfParser.read(new ByteArrayInputStream(sentence.getBytes()), document, 0);
            text = document.getText(0, document.getLength());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return text;
    }

    private void InvokeMissionApplication() {

        try {
            if (!new File(Constants.softAppPath + Constants.softAppName).exists()) {
                System.out.println("Application Path = "
                        + Constants.softAppPath + Constants.softAppName);
                JOptionPane.showMessageDialog(null,
                        "Unable to Access Upgrade Kindly Contact Administrator");
                System.exit(0);
            }
            ProcessBuilder pb;
            pb = new ProcessBuilder(Constants.softAppPath + Constants.softAppName);
            System.out.println("Application is inititated");
            Process p = pb.start();
            Thread.sleep(3000);
            System.exit(0);

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}

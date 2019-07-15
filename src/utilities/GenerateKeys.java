package utilities;

import java.util.HashMap;
import java.util.Vector;

public class GenerateKeys {

    public static String[] keyString = {
        "", "0", "00", "000", "0000", "00000", "000000", "0000000",
        "00000000", "000000000", "0000000000", "00000000000"};

    public String generatePatientId() {

        String query = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM " + Database.DCMS.Keys
                + " WHERE TYPE = 'PATIENT'"
                + " AND ACTIVE = 'Y' ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt(map.get("LENGTH").toString());
        String key = keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");

        String patientId = (String) map.get("LOCATION") + key;

        if (Constants.onlineStatus.equalsIgnoreCase("N")) {
            patientId = Constants.locationId + key;
        }

        return patientId;

    }

    public String generateOrderMedicineNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = 'ORDER_MEDICINE'"
                + " AND LOCATION_ID  = '" + Constants.locationId + "'  \n"
                + " AND ACTIVE = 'Y'   ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        String orderNumber = (String) map.get("LOCATION") + (String) map.get("YEAR") + key;
        return orderNumber;
    }

    public String generateYearWiseId(String type) {

        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = '" + type + "'"
                + " AND ACTIVE = 'Y'  ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-", "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        query
                = " UPDATE " + Database.DCMS.Keys
                + " SET KEY = KEY +1 \n"
                + " WHERE TYPE = '" + type + "' "
                + " AND ACTIVE = 'Y' ";
        if (Constants.dao.executeUpdate(query, false)) {
            return ((String) map.get("YEAR") + key);
        } else {
            return null;
        }
    }

    public int generatesandUpdateIdWithoutCommit(String type) {

        String query
                = " SELECT KEY    FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = '" + type + "' "
                + " AND ACTIVE = 'Y'   ";

        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-", "KEY"});
        HashMap map = vec.get(0);
        String update = " UPDATE " + Database.DCMS.Keys
                + " SET KEY = KEY+ 1  WHERE TYPE  = '" + type + "' AND ACTIVE= 'Y'";
        Constants.dao.executeUpdate(update, false);
        return Integer.parseInt(map.get("KEY").toString());

    }

    public String generateId(String type) {

        String query
                = " SELECT KEY , LENGTH FROM " + Database.DCMS.Keys
                + " WHERE TYPE = '" + type + "' "
                + " AND ACTIVE = 'Y'   ";

        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-", "KEY", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt(map.get("LENGTH").toString());
        return this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");

    }

    public String generatecClientBillNo(String type, String clientId) {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = '" + type + "'"
                + " AND ACTIVE = 'Y'  ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        return (clientId + (String) map.get("YEAR") + key);

    }

    public String generateLedgerNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = 'LEDGER'"
                + " AND ACTIVE = 'Y'  ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        return ((String) map.get("YEAR") + key);

    }

    public String generateVoucherNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = '" + Keys.voucher.trim() + "'"
                + " AND ACTIVE = 'Y'   ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        return ((String) map.get("YEAR") + key);

    }

    public String generateDonorId() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = '" + Keys.bloodBank.trim() + "'"
                + " AND ACTIVE = 'Y'   ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        //int length = Integer.parseInt((map.get("LENGTH")).toString());

        return map.get("KEY").toString();

    }

    public String generateOPDConsultancy() {

        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = 'OPD_CONSULTANCY'"
                + " AND ACTIVE = 'Y'   ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        return (Constants.locationId + (String) map.get("YEAR") + key);
    }

    public String generateExpenseNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM " + Database.DCMS.Keys
                + " WHERE TYPE = 'EXPENSE'  \n"
                + " AND ACTIVE = 'Y'   \n";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        return ((String) map.get("YEAR") + key);

    }

    public String generateOrderNo(String orderType) {
        String query
                = " SELECT SEQ_NAME , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE UPPER(TYPE) = '" + orderType.toUpperCase() + "'"
                + " AND LOCATION_ID  = '" + Constants.locationId + "'  \n"
                + " AND ACTIVE = 'Y' ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "SEQ_NAME", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        String sequence = (String) map.get("SEQ_NAME");
        String[] seq = {"", "KEY"};
        String update = " SELECT " + sequence + ".NEXTVAL KEY FROM DUAL  ";

        String counter = ((HashMap) (Constants.dao.selectDatainList(update, seq)).get(0)).get("KEY").toString();

        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - counter.length()] + counter;
        String orderNumber = (String) map.get("LOCATION") + (String) map.get("YEAR") + key;
        return orderNumber;
    }

    public String generateInvoiceNo() {
        String query
                = " SELECT SEQ_NAME , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM "
                + Database.DCMS.Keys
                + " WHERE UPPER(TYPE) = 'INVOICE'   \n"
                + " AND LOCATION_ID  = '" + Constants.locationId + "'  \n"
                + " AND ACTIVE = 'Y' ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "SEQ_NAME", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        String sequence = (String) map.get("SEQ_NAME");
        String[] seq = {"", "KEY"};
        String update = " SELECT " + sequence + ".NEXTVAL KEY FROM DUAL  ";

        String counter = ((HashMap) (Constants.dao.selectDatainList(update, seq)).get(0)).get("KEY").toString();

        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - counter.length()] + counter;
        return (String) map.get("LOCATION") + (String) map.get("YEAR") + key;

    }

    public String saveGenerateInvoiceNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR , LOCATION_ID LOCATION, "
                + " LENGTH FROM " + Database.DCMS.Keys
                + " WHERE TYPE = 'INVOICE'  \n"
                + " AND LOCATION_ID  = '" + Constants.locationId + "'  \n"
                + " AND ACTIVE = 'Y'  ";

        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        return (String) map.get("LOCATION") + (String) map.get("YEAR") + key;
    }

    public String generateRefundNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR, LOCATION_ID LOCATION,"
                + " LENGTH FROM " + Database.DCMS.Keys
                + " WHERE TYPE = 'REFUND' AND ACTIVE = 'Y'  ";

        Vector<HashMap> vec = Constants.dao.selectData(query,
                new String[]{"-", "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()]
                + (String) map.get("KEY");
        String refundNumber = (String) map.get("YEAR") + key;
        return refundNumber;
    }

    public String generateImagingNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR, LOCATION_ID LOCATION,"
                + " LENGTH  FROM " + Database.DCMS.Keys
                + " WHERE TYPE = 'IMAGING'  AND ACTIVE = 'Y'  ";

        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR", "LOCATION", "LENGTH"});
        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = this.keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        String imagingNumber = (String) map.get("YEAR") + key;
        this.updateKey("IMAGING");
        return imagingNumber;

    }

    public String generatePathologyNo() {

        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR, LOCATION_ID LOCATION, "
                + " LENGTH FROM " + Database.DCMS.Keys
                + " WHERE TYPE = 'PATHOLOGY'  AND ACTIVE = 'Y'  ";

        Vector<HashMap> vec = Constants.dao.selectData(query,
                new String[]{"-", "KEY", "YEAR", "LOCATION", "LENGTH"});

        HashMap map = vec.get(0);
        int length = Integer.parseInt((map.get("LENGTH")).toString());
        String key = keyString[length - ((String) map.get("KEY")).length()] + (String) map.get("KEY");
        String pathologyNumber = (String) map.get("YEAR") + key;
        this.updateKey("PATHOLOGY");

        return pathologyNumber;
    }

    public String getDoctorId() {

        String query
                = " SELECT MAX(TO_NUMBER(DOCTOR_ID)) + 1 DOCTOR_ID FROM "
                + Database.DCMS.doctor;

        Vector<HashMap> vec
                = Constants.dao.selectData(query,
                        new String[]{"-", "DOCTOR_ID"});
        HashMap map = vec.get(0);
        return (String) map.get("DOCTOR_ID");
        //key = this.keyString[4 - key.length()] + key;

    }

    public boolean updateKey(String type) {

        return Constants.dao.executeUpdate(
                " UPDATE " + Database.DCMS.Keys
                + " SET KEY  = KEY + 1"
                + " WHERE TYPE = '" + type + "'"
                + " AND ACTIVE = 'Y'", false);
    }

    public boolean updateDefinitionKey(String keyId) {

        return Constants.dao.executeUpdate(
                " UPDATE " + Database.DCMS.primaryKey
                + " SET KEY  = KEY + 1  \n"
                + " WHERE ID = '" + keyId + "'"
                + " AND ACTIVE = 'Y'        ", false);
    }

    public String getSectionNumber(String sectionId, String department) {

        String query
                = " SELECT SEC.YEAR YEAR, SEC.LENGTH LENGTH,  SEC.SEQ_NAME, SEQUENCE "
                + " FROM " + Database.DCMS.section + " SEC \n "
                + " WHERE  SECTION_ID = '" + sectionId + "' \n"
                + " AND DEPARTMENT_ID = '" + department + "'  ";

        Vector<HashMap> vec
                = Constants.dao.selectData(query,
                        new String[]{"-", "SEQ_NAME", "YEAR", "LENGTH", "SEQUENCE"});
        HashMap map = vec.get(0);
        String sequenceName = (String) map.get("SEQ_NAME");
        String year = (String) map.get("YEAR");
        String length = (String) map.get("LENGTH");
        String key = "";

        if (((String) map.get("SEQUENCE")).equalsIgnoreCase("Y")) {
            String[] seq = {"", "KEY"};
            String update = " SELECT " + sequenceName + ".NEXTVAL KEY FROM DUAL  ";
            key = ((HashMap) (Constants.dao.selectDatainList(update, seq)).get(0)).get("KEY").toString();
            String finalKey = sectionId + year;
            key = finalKey + this.keyString[(Integer.parseInt(length) - finalKey.length())
                    - key.length()] + key;
        } else {
            key = getSectionNumberByCounter(sectionId, department);
        }
        return key;
    }

    public String getSectionNumberByCounter(String sectionId, String department) {

        String query
                = " SELECT SEC.DEPARTMENT_ID , SEC.YEAR YEAR, SEC.LENGTH LENGTH, "
                + " SEC.SECTION_ID , SEC.SECTION_COUNTER_NO "
                + " FROM " + Database.DCMS.section + " SEC \n "
                + " WHERE  SECTION_ID = '" + sectionId + "' \n"
                + " AND DEPARTMENT_ID = '" + department + "'   ";

        Vector<HashMap> vec
                = Constants.dao.selectData(query,
                        new String[]{"-", "DEPARTMENT_ID", "SECTION_ID",
                            "SECTION_COUNTER_NO", "YEAR", "LENGTH"});

        HashMap map = vec.get(0);
        String key = (String) map.get("SECTION_COUNTER_NO");
        String year = (String) map.get("YEAR");
        String length = (String) map.get("LENGTH");

        Constants.dao.executeUpdate(
                " UPDATE " + Database.DCMS.section + " \n "
                + " SET SECTION_COUNTER_NO = SECTION_COUNTER_NO + 1 "
                + " WHERE SECTION_ID = '" + sectionId + "' \n"
                + " AND DEPARTMENT_ID = '" + department + "'", false);

        String finalKey = sectionId + year;
        key = finalKey + this.keyString[(Integer.parseInt(length) - finalKey.length())
                - key.length()] + key;

        return key;
    }

    public String generatePrimaryKey(String tableName, boolean commit) {

        String[] cols = {Database.DCMS.primaryKey,
            "KEY", "TYPE", "LENGTH", "SEQUENCE_NAME", "SEQ_ACTIVE", "YEAR"};
        String query = "SELECT KEY , TYPE , LENGTH, "   
                + " SEQ_ACTIVE, YEAR FROM  "
                + Database.DCMS.primaryKey
                + " WHERE UPPER(ID) = '" + tableName.trim().toUpperCase().trim() + "'";
        System.out.println(query);
        Vector vec = (Vector) Constants.dao.selectData(query, cols);
        if (vec.isEmpty()) {
            return "0";
        }
        HashMap map = (HashMap) vec.get(0);
        String key = map.get("KEY").toString();
        String type = map.get("TYPE").toString();
        String length = map.get("LENGTH").toString();
        String sequenceName = map.get("SEQUENCE_NAME").toString();
        String sequenceActive = map.get("SEQ_ACTIVE").toString();
        String year = map.get("YEAR").toString();
        if (type.equalsIgnoreCase("STRING")) {
            key = this.keyString[(Integer.parseInt(length) - key.length())] + key;
            return key;
        } else if (sequenceActive.equalsIgnoreCase("N")) {
            Constants.dao.executeUpdate("UPDATE " + Database.DCMS.primaryKey
                    + " SET KEY = KEY +1 WHERE ID = '" + tableName + "'", commit);
            return key;
        } else {
            String[] seq = {"", "KEY"};
            String update = " SELECT " + sequenceName + ".NEXTVAL KEY FROM DUAL  ";
            return year + ((HashMap) (Constants.dao.selectDatainList(update, seq)).get(0)).get("KEY").toString();
        }
    }

    public String generateLabNo(String tableName, boolean commit) {

        String[] cols = {Database.DCMS.primaryKey,
            "KEY", "TYPE", "LENGTH", "SEQUENCE_NAME", "SEQ_ACTIVE", "YEAR"};
        String query = "SELECT KEY , TYPE , LENGTH, SEQUENCE_NAME, "
                + " SEQ_ACTIVE, YEAR FROM  "
                + Database.DCMS.primaryKey
                + " WHERE UPPER(ID) = '" + tableName.trim().toUpperCase().trim() + "'";

        Vector vec = (Vector) Constants.dao.selectData(query, cols);
        if (vec.isEmpty()) {
            return "0";
        }
        HashMap map = (HashMap) vec.get(0);
        String sequenceName = map.get("SEQUENCE_NAME").toString();
        String year = map.get("YEAR").toString();
        String[] seq = {"", "KEY"};
        String update = " SELECT " + sequenceName + ".NEXTVAL KEY FROM DUAL  ";
        String labNo = ((HashMap) (Constants.dao.selectDatainList(update, seq)).get(0)).get("KEY").toString();
        if (Constants.onlineStatus.equalsIgnoreCase("N")) {
            labNo = "9" + Constants.locationId + labNo;
        } else {
            labNo = year + labNo;
        }
        return labNo;

    }

    public String generateCounterPrimaryKey(String tableName) {

        String[] cols = {Database.DCMS.primaryKey,
            "KEY", "TYPE", "LENGTH", "SEQUENCE_NAME"};
        String query = "SELECT KEY , TYPE , LENGTH, SEQUENCE_NAME FROM  "
                + Database.DCMS.primaryKey
                + " WHERE UPPER(ID) = '" + tableName.trim().toUpperCase().trim() + "'";

        Vector vec = (Vector) Constants.dao.selectData(query, cols);
        if (vec.isEmpty()) {
            return "0";
        }
        if (!Constants.dao.executeUpdate("UPDATE " + Database.DCMS.primaryKey
                + " SET KEY = KEY + 1 "
                + " WHERE UPPER(ID) = '" + tableName.trim().toUpperCase().trim() + "'", false)) {
            return "0";
        }
        HashMap map = (HashMap) vec.get(0);
        return map.get("KEY").toString();

    }

    public static void main(String args[]) {

        GenerateKeys keys = new GenerateKeys();
        DAO dao = new DAO();
        dao.getConnection();
        System.out.println(keys.getSectionNumber("SEC", "02"));
    }

    public String generateCustomerNo() {
        String query
                = " SELECT KEY , SUBSTR(YEAR,3) YEAR FROM "
                + Database.DCMS.Keys
                + " WHERE TYPE = 'CUSTOMER' \n"
                + " AND ACTIVE = 'Y' ";
        Vector<HashMap> vec = Constants.dao.selectData(query, new String[]{"-",
            "KEY", "YEAR"});
        HashMap map = vec.get(0);
        String key = (String) map.get("KEY");
        return (String) map.get("YEAR") + key;

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.Database;
import java.util.Vector;
import utilities.Designations;
import utilities.EncryptDecrypt;
import utilities.EncryptDecryptWithDES;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Reports;

public class UserHandler implements java.io.Serializable {

    public List<User> searchUser(User user) {

        String colums[] = {"-", "USER_NAME", "PASSWORD", "LOCATION_ID",
            "NAME", "EMAIL_ADDRESS", "ADDRESS", "ACTIVE", "THEME", "THEME_COLOR",
            "COLOR_RED", "COLOR_GREEN", "COLOR_BLUE", "DESIGNATION",
            "DESIGNATION_ID", "DEPARTMENT", "DEPARTMENT_ID", "REPORT_PASSWORD",
            "TYPE", "DEGREES", "SPECIALITY_ID", "SPECIALITY", "LOCATION_NAME",
            "SECTION_ID", "SECTION_NAME", "CONTACT_NO", "USER_ID"};

        String query = " SELECT USR.SECTION_ID                       ,\n"
                + " SEC.DESCRIPTION SECTION_NAME                     ,\n"
                + " NVL(USR.CONTACT_NO, '123') CONTACT_NO            ,\n"
                + " USR.USER_NAME USER_NAME                          ,\n"
                + " USR.USER_ID USER_ID                              ,\n"
                + " USR.PASSWORD  PASSWORD                           ,\n"
                + " USR.LOCATION_ID LOCATION_ID                      ,\n"
                + " LOC.DESCRIPTION LOCATION_NAME                    ,\n"
                + " NVL(USR.SPECIALITY_ID,234)  SPECIALITY_ID        ,\n"
                + " SPY.DESCRIPTION SPECIALITY                       ,\n"
                + " NVL(USR.NAME,'   ') NAME                         ,\n"
                + " NVL(USR.TYPE,'   ') TYPE                         ,\n"
                + " NVL(DEG.DESCRIPTION,'   ')      DESIGNATION      ,\n"
                + " NVL(USR.DESIGNATION_ID,0)   DESIGNATION_ID       ,\n"
                + " NVL(DEP.DESCRIPTION,'   ')      DEPARTMENT       ,\n"
                + " NVL(USR.DEPARTMENT_ID,0)    DEPARTMENT_ID        ,\n"
                + " NVL(USR.EMAIL_ADDRESS,'  ')     EMAIL_ADDRESS    ,\n"
                + " NVL(USR.REPORT_PASSWORD,'420')  REPORT_PASSWORD  ,\n"
                + " NVL(USR.ADDRESS,'  ') ADDRESS                    ,\n"
                + " NVL(USR.DEGREES,'  ') DEGREES                    ,\n"
                + " NVL(USR.ACTIVE,'N') ACTIVE                       ,\n"
                + " NVL(USR.THEME,'  ') THEME                        ,\n"
                + " NVL(USR.THEME_COLOR,'  ')  THEME_COLOR           ,\n"
                + " NVL(USR.COLOR_RED,0)   COLOR_RED                 ,\n"
                + " NVL(USR.COLOR_GREEN,0) COLOR_GREEN               ,\n"
                + " NVL(USR.COLOR_BLUE,0)  COLOR_BLUE                 \n"
                + " FROM                                              \n"
                + Database.DCMS.department + "   DEP,                 \n"
                + Database.DCMS.designation + "  DEG,                 \n"
                + Database.DCMS.section + "      SEC,                 \n"
                + Database.DCMS.speciality + "   SPY,                 \n"
                + Database.DCMS.location + "     LOC,                 \n"
                + Database.DCMS.users + "        USR                  \n"
                + " WHERE UPPER(USR.USER_ID) LIKE '%" + user.getUserId().toUpperCase() + "%'  \n"
                + " AND UPPER(USR.USER_NAME) LIKE '%" + user.getUserName().toUpperCase() + "%'  \n"
                + " AND UPPER(USR.NAME) LIKE '%" + user.getName().toUpperCase() + "%'  \n";

        if (!user.getLocationId().isEmpty()) {
            query += " AND LOC.ID =  '" + user.getLocationId() + "'  \n";
        }
        if (!user.getDepartmentId().isEmpty()) {
            query += " AND DEP.ID =  '" + user.getDepartmentId() + "'  \n";
        }
        if (!user.getSectionId().isEmpty()) {
            query += " AND SEC.ID =  '" + user.getSection() + "'  \n";
        }
        if (!user.getDesignationId().isEmpty()) {
            query += " AND DEG.ID =  '" + user.getDesignationId() + "'  \n";
        }

        query += " AND USR.DESIGNATION_ID = DEG.ID              \n"
                + " AND USR.LOCATION_ID = LOC.ID                \n"
                + " AND NVL(USR.SPECIALITY_ID , 234) = SPY.ID   \n"
                + " AND USR.DEPARTMENT_ID = DEP.ID              \n"
                + " AND SEC.DEPARTMENT_ID = DEP.ID              \n"
                + " AND USR.SECTION_ID = SEC.SECTION_ID         \n";

        return setUserData(Constants.dao.selectData(query, colums));

    }
    EncryptDecryptWithDES des = new EncryptDecryptWithDES();

    public List<User> searchPerformingPhysician(User user) {

        String colums[] = {"-", "USER_NAME", "PASSWORD", "LOCATION_ID",
            "NAME", "EMAIL_ADDRESS1", "ADDRESS", "ACTIVE", "PRACTICE_INCOME_TAX",
            "THEME", "THEME_COLOR", "COLOR_RED", "COLOR_GREEN", "COLOR_BLUE",
            "DESIGNATION", "DESIGNATION_ID", "DEPARTMENT", "DEPARTMENT_ID",
            "REPORT_PASSWORD", "TYPE", "DEGREES", "SPECIALITY_ID", "SPECIALITY",
            "LOCATION_NAME", "SECTION_ID", "SECTION_NAME", "CONTACT_NO", "USER_ID"};

        String query = " SELECT USR.SECTION_ID                       ,\n"
                + " SEC.DESCRIPTION SECTION_NAME                     ,\n"
                + " NVL(USR.CONTACT_NO, '123') CONTACT_NO            ,\n"
                + " USR.USER_NAME USER_NAME                          ,\n"
                + " USR.USER_ID USER_ID                              ,\n"
                + " USR.PASSWORD  PASSWORD                           ,\n"
                + " USR.LOCATION_ID LOCATION_ID                      ,\n"
                + " LOC.DESCRIPTION LOCATION_NAME                    ,\n"
                + " NVL(USR.SPECIALITY_ID,234)  SPECIALITY_ID        ,\n"
                + " SPY.DESCRIPTION SPECIALITY                       ,\n"
                + " NVL(USR.NAME,'   ') NAME                         ,\n"
                + " USR.PRACTICE_INCOME_TAX                          ,\n"
                + " NVL(USR.TYPE,'   ') TYPE                         ,\n"
                + " NVL(DEG.DESCRIPTION,'   ')      DESIGNATION      ,\n"
                + " NVL(USR.DESIGNATION_ID,0)   DESIGNATION_ID       ,\n"
                + " NVL(DEP.DESCRIPTION,'   ')      DEPARTMENT       ,\n"
                + " NVL(USR.DEPARTMENT_ID,0)    DEPARTMENT_ID        ,\n"
                + " NVL(USR.EMAIL_ADDRESS,'  ')     EMAIL_ADDRESS    ,\n"
                + " NVL(USR.REPORT_PASSWORD,'420')  REPORT_PASSWORD  ,\n"
                + " NVL(USR.ADDRESS,'  ') ADDRESS                    ,\n"
                + " NVL(USR.DEGREES,'  ') DEGREES                    ,\n"
                + " NVL(USR.ACTIVE,'N') ACTIVE                       ,\n"
                + " NVL(USR.THEME,'  ') THEME                        ,\n"
                + " NVL(USR.THEME_COLOR,'  ')  THEME_COLOR           ,\n"
                + " NVL(USR.COLOR_RED,0)   COLOR_RED                 ,\n"
                + " NVL(USR.COLOR_GREEN,0) COLOR_GREEN               ,\n"
                + " NVL(USR.COLOR_BLUE,0)  COLOR_BLUE                 \n"
                + " FROM                                              \n"
                + Database.DCMS.department + "   DEP,                 \n"
                + Database.DCMS.designation + "  DEG,                 \n"
                + Database.DCMS.section + "      SEC,                 \n"
                + Database.DCMS.speciality + "   SPY,                 \n"
                + Database.DCMS.location + "     LOC,                 \n"
                + Database.DCMS.users + "        USR                  \n"
                + " WHERE UPPER(USR.USER_ID) LIKE '%" + user.getUserId().toUpperCase() + "%' \n"
                + " AND UPPER(USR.NAME) LIKE '%" + user.getName().toUpperCase() + "%'  \n";

        if (user.getSpecialityId().trim().length() != 0) {
            query += " AND USR.SPECIALITY_ID = " + user.getSpecialityId() + "\n";
        }
        if (user.getType().trim().length() != 0) {
            query += " AND USR.TYPE = '" + user.getType() + "' \n";
        }

        query += " AND USR.DESIGNATION_ID = DEG.ID "
                + " AND USR.LOCATION_ID = LOC.ID "
                + " AND NVL(USR.SPECIALITY_ID , 234) = SPY.ID \n"
                + " AND USR.DEPARTMENT_ID = DEP.ID \n"
                + " AND SEC.DEPARTMENT_ID = DEP.ID  \n"
                + " AND USR.SECTION_ID = SEC.SECTION_ID ";

        return setUserData(Constants.dao.selectData(query, colums));

    }

    public List<User> setUserData(List data) {

        List<User> user = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            HashMap rowData = (HashMap) data.get(i);
            User userData = new User();
            userData.setAddress((String) rowData.get("ADDRESS"));
            userData.setContactNo((String) rowData.get("CONTACT_NO"));
            userData.setDegrees((String) rowData.get("DEGREES"));
            userData.setEmailAddress((String) rowData.get("EMAIL_ADDRESS"));
            userData.setLocationId((String) rowData.get("LOCATION_ID"));
            userData.setLocationName((String) rowData.get("LOCATION_NAME"));
            userData.setName((String) rowData.get("NAME"));
            userData.setActive((String) rowData.get("ACTIVE"));
            userData.setPracticeIncomeTax((String) rowData.get("PRACTICE_INCOME_TAX"));
            userData.setDesignation((String) rowData.get("DESIGNATION"));
            userData.setDesignationId((String) rowData.get("DESIGNATION_ID"));
            userData.setSpeciality((String) rowData.get("SPECIALITY"));
            userData.setSpecialityId((String) rowData.get("SPECIALITY_ID"));
            userData.setDepartment((String) rowData.get("DEPARTMENT"));
            userData.setDepartmentId((String) rowData.get("DEPARTMENT_ID"));
            userData.setSectionId((String) rowData.get("SECTION_ID"));
            userData.setSection((String) rowData.get("SECTION_NAME"));
            userData.setCurrentPassword((String) rowData.get("PASSWORD"));
            userData.setCurrentPassword(EncryptDecryptWithDES.decrypt(userData.getCurrentPassword()));
            userData.setUserName((String) rowData.get("USER_NAME"));
            userData.setUserId((String) rowData.get("USER_ID"));
            userData.setReportPassword((String) rowData.get("REPORT_PASSWORD"));
            userData.setType((String) rowData.get("TYPE"));
            userData.setTheme((String) rowData.get("THEME"));
            userData.setThemeColor((String) rowData.get("THEME_COLOR"));
            userData.setColorRed(Integer.parseInt((String) rowData.get("COLOR_RED")));
            userData.setColorGreen(Integer.parseInt((String) rowData.get("COLOR_GREEN")));
            userData.setColorBlue(Integer.parseInt((String) rowData.get("COLOR_BLUE")));
            user.add(userData);
        }
        return user;
    }

    public Vector setLoginUserData(Vector data) {

        Vector user = new Vector();
        for (int i = 0; i < data.size(); i++) {
            HashMap rowData = (HashMap) data.get(i);
            User userData = new User();
            userData.setAddress((String) rowData.get("ADDRESS"));
            userData.setContactNo((String) rowData.get("CONTACT_NO"));
            userData.setDegrees((String) rowData.get("DEGREES"));
            userData.setEmailAddress((String) rowData.get("EMAIL_ADDRESS"));
            userData.setLocationId(rowData.get("LOCATION_ID").toString());
            userData.setLocationName((String) rowData.get("LOCATION_NAME"));
            userData.setName((String) rowData.get("NAME"));
            userData.setActive((String) rowData.get("ACTIVE"));
            userData.setDesignation((String) rowData.get("DESIGNATION"));
            userData.setDesignationId((String) rowData.get("DESIGNATION_ID"));
            userData.setDepartment((String) rowData.get("DEPARTMENT"));
            userData.setDepartmentId((String) rowData.get("DEPARTMENT_ID"));
            userData.setSection((String) rowData.get("SECTION_ID"));
            userData.setSectionId((String) rowData.get("SECTION_ID"));
            userData.setCurrentPassword((String) rowData.get("PASSWORD"));
            userData.setCurrentPassword(EncryptDecryptWithDES.decrypt(userData.getCurrentPassword()));
            userData.setUserName((String) rowData.get("USER_NAME"));
            userData.setReportPassword((String) rowData.get("REPORT_PASSWORD"));
            userData.setType((String) rowData.get("TYPE"));
            userData.setTheme((String) rowData.get("THEME"));
            userData.setThemeColor((String) rowData.get("THEME_COLOR"));
            userData.setColorRed(Integer.parseInt((String) rowData.get("COLOR_RED")));
            userData.setColorGreen(Integer.parseInt((String) rowData.get("COLOR_GREEN")));
            userData.setColorBlue(Integer.parseInt((String) rowData.get("COLOR_BLUE")));
            user.add(userData);
            Reports.financial.invoicePrivateReport = rowData.get("LOCATION_CASH_INVOICE").toString();
            Reports.financial.invoiceClientReport = rowData.get("LOCATION_CREDIT_INVOICE").toString();

            Constants.locationId = (String) rowData.get("LOCATION_ID");
            Constants.printLog = (String) rowData.get("PRINT_LOG");
            Constants.userDepartmentId = (String) rowData.get("DEPARTMENT_ID");
            Constants.userDesignationId = (String) rowData.get("DESIGNATION_ID");
            Constants.userSectionId = (String) rowData.get("SECTION_ID");
            Constants.userSection = (String) rowData.get("SECTION_ID");
            Constants.mrnoLength = rowData.get("MRNO_LENGTH").toString();

            try {
                Constants.numberOfPrints = Integer.parseInt(rowData.get("NUMBER_OF_INVOICES").toString());
            } catch (Exception ex) {
                Constants.numberOfPrints = 1;
            }
            Constants.balancePercentage = rowData.get("BALANCE_PERCENTAGE").toString();
            Constants.clientCheckCreditLimit = rowData.get("CHECK_CREDIT").toString();
            Constants.clientCreditLimit = rowData.get("CREDIT_LIMIT").toString();
            Constants.clientTestLimit = rowData.get("TEST_LIMIT").toString();
            Constants.organizationId = rowData.get("ORGANIZATION_ID").toString();
            Constants.organizationName = rowData.get("ORGANIZATION").toString();
            Constants.logoPath = rowData.get("LOGO").toString();
            Constants.locationInvoicePrinting = rowData.get("INVOICE_PRINTING_STATUS").toString();
            Constants.slogan = rowData.get("SLOGAN").toString();
            Constants.userSpecialityId = rowData.get("SPECIALITY_ID").toString();
            Constants.userSpecialityDescription = rowData.get("SPECIALITY").toString();
            Constants.website = rowData.get("WEBSITE").toString();
            Constants.locationClientId = rowData.get("CLIENT_ID").toString();
            Constants.locationClientName = rowData.get("CLIENT_NAME").toString();
            Constants.applicationServer = rowData.get("LOCATION_REPORT_SERVER").toString();
            Constants.labelPrinter = rowData.get("LABEL_PRINTER").toString();
            this.setMessagingAlertData();
        }
        return user;
    }

    public boolean updateUserPreferences(User user) {

        String query
                = " UPDATE " + Database.DCMS.users + "                 \n"
                + " SET THEME = '" + user.getTheme() + "'             ,\n"
                + "     THEME_COLOR = '" + user.getThemeColor() + "'  ,\n"
                + "     COLOR_RED = " + user.getColorRed() + "        ,\n"
                + "     COLOR_GREEN = " + user.getColorGreen() + "    ,\n"
                + "     COLOR_BLUE = " + user.getColorBlue() + "       \n"
                + " WHERE USER_NAME = '" + user.getUserName() + "'     \n";
        if (user.getUserName().length() == 0) {
            JOptionPane.showMessageDialog(null, "This facility is only for registered users");
            return false;
        }
        return Constants.dao.executeUpdate(query, true);
    }

    public Vector selectMenu(String userId) {

        Vector menus = new Vector();
        String[] columns = {"-", "NAME", "ID", "POSITION", "MENU_NAME", "MNEMONIC"};

        String query
                = "SELECT NAME, POSITION , MENU_NAME , ID,  MNEMONIC FROM  "
                + Database.DCMS.menu + " \n"
                + " WHERE ID IN (\n"
                + "        SELECT MENU_ID FROM              \n"
                + Database.DCMS.form + "   FRM ,           \n"
                + Database.DCMS.menu + "   MNU ,           \n"
                + Database.DCMS.roleWiseForm + "   RWF,     \n"
                + Database.DCMS.userWiseRole + "   UWR,     \n"
                + Database.DCMS.role + "   RLE              \n"
                + "        WHERE FRM.MENU_ID = MNU.ID       \n"
                + "        AND FRM.ACTIVE = 'Y'             \n"
                + "        AND FRM.DESKTOP_ENABLED = 'Y'    \n"
                + "        AND MNU.ACTIVE = 'Y'             \n"
                + "        AND RWF.FORM_ID = FRM.ID         \n"
                + "        AND RWF.ROLE_ID = UWR.ROLE_ID    \n"
                + "        AND RLE.ID = UWR.ROLE_ID         \n"
                + "        AND UPPER(RLE.ROLE_TYPE) =  UPPER('FORM') \n"
                + "        AND UWR.USER_ID = '" + userId + "'\n"
                + "        ) ORDER BY POSITION  \n";

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.menuIds = new Vector();
        //System.out.println(query);
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.hashUserMenuMnemonic.put((String) map.get("ID"),
                    (String) map.get("MNEMONIC"));
            menus.add((String) map.get("NAME"));
            Constants.menuIds.add((String) map.get("ID"));
        }
        return menus;
    }

    public void selectUserGroupRights() {

        String[] cols = {"", "ID"};
        String query = " SELECT  FWA.ID FROM "
                + Database.DCMS.formWiseAction + " FWA, \n"
                + Database.DCMS.userWiseRole + " UWR, \n"
                + Database.DCMS.roleWiseForm + " RWF, \n"
                + Database.DCMS.role + " ROL \n"
                + " WHERE FWA.ID = RWF.FORM_ID  \n"
                + " AND RWF.ROLE_ID = ROL.ID \n"
                + " AND ROL.ID = UWR.ROLE_ID \n"
                + " AND UPPER(ROL.ROLE_TYPE) = 'BUTTON' \n"
                + " AND UWR.USER_ID = '" + Constants.userId + "' \n";

        Vector vec = Constants.dao.selectData(query, cols);
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.userRightsMap.put(map.get("ID"), Constants.userId);
        }
    }

    public Vector selectMenuItem(String menuId, String userId) {

        Vector items = new Vector();
        String[] columns = {"-", "FORM_ID", "FORM_NAME", "POSITION"};

        String query
                = " SELECT                              \n"
                + " DISTINCT (FRM.NAME) FORM_ID        ,\n"
                + " FRM.POSITION POSITION              ,\n"
                + " FRM.FORM_NAME FORM_NAME             \n"
                + " FROM                                \n"
                + Database.DCMS.form + "  FRM ,         \n"
                + Database.DCMS.roleWiseForm + " RWF,   \n"
                + Database.DCMS.role + "         RLE,   \n"
                + Database.DCMS.userWiseRole + " UWR    \n"
                + " WHERE FRM.ACTIVE = 'Y'\n"
                + " AND RWF.FORM_ID = FRM.ID\n"
                + " AND RWF.ROLE_ID = UWR.ROLE_ID\n"
                + " AND RWF.ROLE_ID = RLE.ID\n"
                + " AND UPPER(RLE.ROLE_TYPE) = UPPER('FORM')\n"
                + " AND UWR.USER_ID = '" + userId + "'\n"
                + " AND FRM.MENU_ID = " + menuId + "\n"
                + " AND FRM.DESKTOP_ENABLED = 'Y'   \n"
                + " ORDER BY FRM.POSITION \n";

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.hashUserMenuItem = new HashMap<String, String>();

        for (int i = 0; i < vec.size(); i++) {

            HashMap map = (HashMap) vec.get(i);
            String formName = map.get("FORM_NAME").toString();
            if (formName.equalsIgnoreCase("Form.imaging.radiology.frmRadiologyReporting") && Constants.laptop) {
                formName = "Form.imaging.radiology.frmRadiologyReportingLaptop";
            }
            Constants.hashUserMenuItem.put(map.get("FORM_ID").toString(), formName);
            items.add((String) map.get("FORM_ID"));
        }
        return items;
    }

    public void selectFormWiseComponent(String userId) {

        String[] columns = {"-", "KEY", "COMPONENT"};

        String query
                = "  SELECT"
                + " AGC.FORM_ID||'_'||AGC.COMPONENT_ID KEY       ,\n "
                + " AGC.COMPONENT_ID    COMPONENT                 \n"
                + " FROM                                          \n"
                + Database.DCMS.appGroupComponent + "  AGC     \n"
                + " WHERE GROUP_ID IN (SELECT GROUP_ID            \n"
                + " FROM                                          \n"
                + Database.DCMS.userWiseRole + "                  \n"
                + " WHERE USER_ID = '" + userId + "')          \n"
                + " AND ACTIVE = 'Y'    \n"
                + " ORDER BY FORM_ID ";

        Vector vec = Constants.dao.selectData(query, columns);

        for (int i = 0; i < vec.size(); i++) {

            HashMap map = (HashMap) vec.get(i);
            Constants.hashComponent.put((String) map.get("KEY"),
                    (String) map.get("COMPONENT"));
        }

    }

    public void getRadiologists() {

        String[] columns = {"-", "USER_NAME", "DESIGNATION", "NAME"};
        String query
                = "  SELECT USER_NAME, DEG.DESCRIPTION DESIGNATION, NAME  "
                + "  FROM "
                + Database.DCMS.users + " USR,          \n"
                + Database.DCMS.designation + " DEG     \n"
                + " WHERE DESIGNATION_ID = " + utilities.TypeDetailId.radiologyConsultant + "\n" //RADIOLOGIST
                + " AND DEG.ID = USR.DESIGNATION_ID     \n"
                + " AND USR.ACTIVE = 'Y' ";

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.radiologists = new String[vec.size() + 1];
        Constants.cboHashRadiologist.put("0", "ALL");
        Constants.radiologists[0] = "ALL";
        Constants.cboHashRadiologistName.put("ALL", "ALL");

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.radiologists[i + 1] = map.get("NAME").toString();
            Constants.cboHashRadiologist.put("" + (i + 1), map.get("USER_NAME").toString());
            Constants.cboHashRadiologistName.put(map.get("NAME").toString(),
                    map.get("USER_NAME").toString());
            Constants.hashRadiologistUsers.put(map.get("USER_NAME").toString(),
                    map.get("NAME").toString());

        }

    }

    public void getNMPhysicians() {

        String[] columns = {"-", "USER_NAME", "DESIGNATION", "NAME"};
        String query
                = "  SELECT USER_NAME, DEG.DESCRIPTION DESIGNATION, NAME  "
                + "  FROM "
                + Database.DCMS.users + " USR,           \n"
                + Database.DCMS.designation + " DEG      \n"
                + " WHERE DESIGNATION_ID = '008'         \n" //NM Physician
                + " AND DEG.ID = USR.DESIGNATION_ID      \n"
                + " AND USR.ACTIVE = 'Y' ";

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.NMPhysician = new String[vec.size() + 1];
        Constants.cboHashNMPhysician.put("0", "ALL");
        Constants.NMPhysician[0] = "ALL";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.NMPhysician[i + 1] = map.get("NAME").toString();
            Constants.cboHashNMPhysician.put("" + (i + 1),
                    map.get("USER_NAME").toString());
        }
    }

    public void getCardiologists() {

        String[] columns = {"-", "USER_NAME", "DESIGNATION", "NAME"};

        String query
                = "  SELECT USER_NAME, DEG.DESCRIPTION DESIGNATION, NAME  "
                + "  FROM "
                + Database.DCMS.users + " USR, \n"
                + Database.DCMS.designation + " DEG \n"
                + " WHERE DESIGNATION_ID = " + Designations.cardiologist + " \n" //CARDIOLOGIST
                + " AND DEG.ID = USR.DESIGNATION_ID \n"
                + " AND USR.ACTIVE = 'Y' ";

        Constants.cboHashCardiologist.clear();
        Vector vec = Constants.dao.selectData(query, columns);
        Constants.cardiologists = new String[vec.size() + 1];
        Constants.cboHashCardiologist.put("0", "ALL");
        Constants.cardiologists[0] = "ALL";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.cardiologists[i + 1] = map.get("NAME").toString();
            Constants.cboHashCardiologist.put("" + (i + 1),
                    map.get("USER_NAME").toString());
        }
    }

    public void getPathologists() {

        String[] columns = {"-", "USER_NAME", "DESIGNATION", "NAME"};
        String query
                = "  SELECT USER_NAME, DEG.DESCRIPTION DESIGNATION, NAME  "
                + "  FROM "
                + Database.DCMS.users + " USR, \n"
                + Database.DCMS.designation + " DEG \n"
                + " WHERE DESIGNATION_ID = '006' \n" //PATHOLOGIST
                + " AND DEG.ID = USR.DESIGNATION_ID \n"
                + " AND USR.ACTIVE = 'Y' ";

        Vector vec = Constants.dao.selectData(query, columns);
        Constants.pathologists = new String[vec.size() + 1];
        Constants.cboHashPathologist.put("0", "ALL");
        Constants.pathologists[0] = "ALL";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.pathologists[i + 1] = map.get("NAME").toString();
            Constants.cboHashPathologist.put("" + (i + 1),
                    map.get("USER_NAME").toString());
        }
    }

    public static void main(String args[]) {

        //String pass = UserHandler.encrypt("najam123");
        //System.out.println("Encrypted password of user:" + pass);;
    }

    public static final byte[] keyValue
            = new byte[]{'T', 'h', 'e', 'B', 'e', 's', 't',
                'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};

    public Vector selectUser(String userName, String pass) {

        String colums[] = {"-", "USER_NAME", "PASSWORD", "LOCATION_ID",
            "NAME", "CONTACT_NO", "EMAIL_ADDRESS", "DEPARTMENT_ID", "THEME",
            "THEME_COLOR", "COLOR_RED", "COLOR_GREEN", "LOCATION_NAME",
            "COLOR_BLUE", "DESIGNATION", "REPORT_PASSWORD", "DEPARTMENT", "DESIGNATION_ID",
            "LOCATION_CASH_INVOICE", "LOCATION_CREDIT_INVOICE", "MRNO_LENGTH",
            "CHECK_CREDIT", "CREDIT_LIMIT", "TEST_LIMIT", "ORGANIZATION_ID",
            "ORGANIZATION", "LOGO", "SLOGAN", "WEBSITE", "CLIENT_ID", "PRINT_LOG",
            "CLIENT_NAME", "LOCATION_REPORT_SERVER", "INVOICE_PRINTING_STATUS",
            "SPECIALITY_ID", "SPECIALITY", "SECTION_ID", "LABEL_PRINTER",
            "BALANCE_PERCENTAGE", "NUMBER_OF_INVOICES"};

        String query = " SELECT LOC.CLIENT_ID , CLT.DESCRIPTION CLIENT_NAME,\n"
                + " USR.USER_NAME USER_NAME, USR.PASSWORD PASSWORD, SECTION_ID,\n"
                + " ORG.SLOGAN, ORG.WEBSITE, ORG.MRNO_LENGTH, ORG.ID ORGANIZATION_ID, \n"
                + " LCI.DESCRIPTION LOCATION_CASH_INVOICE, IPS.DESCRIPTION "
                + " INVOICE_PRINTING_STATUS, LNI.DESCRIPTION  NUMBER_OF_INVOICES,"
                + " LOG.DESCRIPTION LOGO, LDI.DESCRIPTION LOCATION_CREDIT_INVOICE, \n"
                + " LLP.DESCRIPTION LABEL_PRINTER,                           \n"
                + " NVL(LBP.DESCRIPTION, '75') BALANCE_PERCENTAGE, \n"
                + " SRV.DESCRIPTION LOCATION_REPORT_SERVER, SPY.DESCRIPTION \n"
                + " SPECIALITY, ORG.DESCRIPTION ORGANIZATION,  \n"
                + " CHECK_CREDIT, CREDIT_LIMIT, TEST_LIMIT, \n"
                + " NVL(USR.SPECIALITY_ID , 234) SPECIALITY_ID,         \n"
                + " USR.LOCATION_ID LOCATION_ID,                        \n"
                + " 'N' PRINT_LOG,                                      \n"
                + " LOC.DESCRIPTION LOCATION_NAME,                      \n"
                + " NVL(USR.NAME,'   ') NAME,                           \n"
                + " NVL(DEG.DESCRIPTION,'   ')  DESIGNATION,            \n"
                + " NVL(DEP.DESCRIPTION,'   ')  DEPARTMENT,             \n"
                + " DEP.ID DEPARTMENT_ID,                               \n"
                + " DEG.ID DESIGNATION_ID,                              \n"
                + " NVL(USR.CONTACT_NO,' ') CONTACT_NO ,                \n"
                + " NVL(USR.E_ADDRESS,' ') EMAIL_ADDRESS,               \n"
                + " NVL(USR.REPORT_PASSWORD,'420') REPORT_PASSWORD,     \n"
                + " NVL(USR.THEME,'') THEME,                            \n"
                + " NVL(USR.THEME_COLOR,'')  THEME_COLOR,               \n"
                + " NVL(USR.COLOR_RED,0)   COLOR_RED,                   \n"
                + " NVL(USR.COLOR_GREEN,0) COLOR_GREEN,                 \n"
                + " NVL(USR.COLOR_BLUE,0)  COLOR_BLUE                   \n"
                + " FROM                                                \n"
                + Database.DCMS.users + "        USR,                   \n"
                + Database.DCMS.department + "   DEP,                   \n"
                + Database.DCMS.location + "     LOC,                   \n"
                + Database.DCMS.client + "       CLT,                   \n"
                + Database.DCMS.speciality + "         SPY,             \n"
                + Database.DCMS.setupColumnDetail + "  OGI,             \n"
                + Database.DCMS.setupColumnDetail + "  LOG,             \n"
                + Database.DCMS.setupColumnDetail + "  LCI,             \n"
                + Database.DCMS.setupColumnDetail + "  LDI,             \n"
                + Database.DCMS.setupColumnDetail + "  LNI,             \n"
                + Database.DCMS.setupColumnDetail + "  SRV,             \n"
                + Database.DCMS.setupColumnDetail + "  IPS,             \n"
                + Database.DCMS.setupColumnDetail + "  LLP,             \n"
                + Database.DCMS.setupColumnDetail + "  LBP,              \n"
                + Database.DCMS.organization + " ORG,                   \n"
                + Database.DCMS.designation + "  DEG                    \n"
                + " WHERE UPPER(USR.USER_ID) ='" + userName.toUpperCase() + "'  \n"
                + " AND USR.PASSWORD = '" + EncryptDecrypt.encrypt(pass, keyValue) + "'\n"
                + " AND DEPARTMENT_ID = DEP.ID       \n"
                + " AND OGI.TABLE_ROW_ID = LOC.ID    \n"
                + " AND OGI.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.organizationId + "\n"
                + " AND LNI.TABLE_ROW_ID = LOC.ID    \n"
                + " AND LNI.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.numberOfInvoicePrinting + "\n"
                + " AND LLP.TABLE_ROW_ID = LOC.ID    \n"
                + " AND LLP.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.labelPrinter + "\n"
                + " AND LBP.TABLE_ROW_ID = LOC.ID    \n"
                + " AND LBP.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.balancePercentage + "\n"
                + " AND LOG.TABLE_ROW_ID = LOC.ID    \n"
                + " AND LOG.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.logo + "\n"
                + " AND LCI.TABLE_ROW_ID = LOC.ID    \n"
                + " AND LCI.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.locationCashInvoice + "\n"
                + " AND LDI.TABLE_ROW_ID = LOC.ID    \n"
                + " AND LDI.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.locationCreditInvoice + "\n"
                + " AND SRV.TABLE_ROW_ID = LOC.ID    \n"
                + " AND SRV.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.reportServer + "\n"
                + " AND IPS.TABLE_ROW_ID = LOC.ID    \n"
                + " AND IPS.TABLE_COLUMN_ID = " + utilities.SetupTableColumns.Location.invoicePrinting + "\n"
                + " AND LOC.CLIENT_ID = CLT.ID       \n"
                + " AND OGI.DESCRIPTION = ORG.ID     \n"
                + " AND NVL(USR.SPECIALITY_ID, 234) = SPY.ID   \n"
                + " AND DESIGNATION_ID = DEG.ID         \n"
                + " AND USR.LOCATION_ID = LOC.ID";

        if (!(Constants.terminalId.equalsIgnoreCase("DBADM")
                || Constants.terminalId.equalsIgnoreCase("ADMLAN")
                || Constants.terminalId.equalsIgnoreCase("PLCADM"))) {
            query += " AND USR.ACTIVE = 'Y'             \n";
        }
         System.out.println(query);
        return setLoginUserData(Constants.dao.selectData(query, colums));

    }

    public boolean userAuthentication(String userName, String pass, User user) {

        String colums[] = {"-", "USER_NAME"};
        String query = " SELECT  USR.USER_NAME USER_NAME FROM   \n"
                + Database.DCMS.users + "        USR           \n"
                + " WHERE UPPER(USR.USER_NAME) ='" + userName.toUpperCase() + "'  \n"
                + " USR.PASSWORD =  '" + EncryptDecrypt.encrypt(user.getCurrentPassword(), UserHandler.keyValue) + "'\n"
                //+ " AND USR.PASSWORD = '" + EncryptDecrypt.encrypt(pass, keyValue) + "'\n"
                + " AND USR.ACTIVE = 'Y'        \n";

        if (Constants.dao.selectData(query, colums).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean insertSession() {

        boolean ret = true;
        String[] columns = {Database.DCMS.userSession, "ID", "CRTD_BY",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        Constants.sessionId = key.generatePrimaryKey(Keys.userSession, false);
        map.put("ID", "'" + Constants.sessionId + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List li = new ArrayList();
        li.add(map);
        ret = Constants.dao.insertData(li, columns);
        if (ret) {
            ret = Constants.dao.commitTransaction();

        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    GenerateKeys key = new GenerateKeys();

    public String[] selectNameAndPassword(String userId) {

        String[] credentials = null;
        String[] cols = {"", "NAME", "PASSWORD"};

        String query = " SELECT NAME , PASSWORD FROM "
                + Database.DCMS.users
                + " WHERE USER_NAME = '" + userId + "'";

        List<HashMap> list = Constants.dao.selectData(query, cols);

        if (list.size() == 1) {
            credentials = new String[2];
            HashMap map = list.get(0);
            credentials[0] = map.get("NAME").toString();
            credentials[1] = map.get("PASSWORD").toString();
        }
        return credentials;
    }

    public void getSuperAdminRights() {

        String[] columns = {Database.DCMS.superAdmin, "ACTION_ID"};

        String query = " SELECT ACTION_ID FROM " + Database.DCMS.superAdmin
                + " WHERE USER_ID ='" + Constants.userId + "' \n";

        List<HashMap> list = Constants.dao.selectData(query, columns);

        for (int i = 0; i < list.size(); i++) {
            Constants.hashSuperAdmin.put(list.get(i).get("ACTION_ID").toString(),
                    list.get(i).get("ACTION_ID").toString());
        }
    }

    public boolean selectUserExisted(String employeeId) {

        String[] cols = {"", "EMPLOYEE_ID"};
        String query = " SELECT  USR.EMPLOYEE_ID FROM "
                + Database.DCMS.users + " USR        \n"
                + " WHERE USR.EMPLOYEE_ID ='" + employeeId + "'";

        return Constants.dao.selectData(query, cols).isEmpty();

    }

    public boolean getEmployee(String employeeId) {

        String[] cols = {"", "EMPLOYEE_ID"};
        String query = " SELECT  EMP.EMPLOYEE_ID FROM "
                + Database.DCMS.employee + " EMP        \n"
                + " WHERE EMP.EMPLOYEE_ID ='" + employeeId + "'";

        return Constants.dao.selectData(query, cols).isEmpty();
    }

    private void setMessagingAlertData() {

    }
}

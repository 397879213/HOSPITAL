/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.GroupForm;
 
import java.util.HashMap;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

 
public class GroupHandler implements java.io.Serializable{

    GenerateKeys key = new GenerateKeys();
    public String group_id="";    
    public GroupHandler() {
    }

    public boolean registerGroup(GroupForm grp) {

        String[] columns = {Database.DCMS.role, "ID", "DESCRIPTION","ACTIVE",
            "COMMENTS", "ROLE_TYPE"};

        String query = " SELECT * FROM " + Database.DCMS.role
                + " WHERE UPPER(DESCRIPTION) ='"+grp.getRoleName().toUpperCase()+"'";
        
        if (!Constants.dao.selectData(query, columns).isEmpty()) {
            grp.setMessage("Group Already Exists");
            return true;
        } 
        HashMap groupMap = new HashMap(); 
        groupMap.put("ID", "'" + key.generatePrimaryKey(Keys.role,false) + "'");
        groupMap.put("DESCRIPTION", "'" + grp.getRoleName() + "'");
        groupMap.put("ACTIVE", "'Y'");
        groupMap.put("ROLE_TYPE", "'"+grp.getRoleType()+"'");
        groupMap.put("COMMENTS", "'" + grp.getComments() + "'");
        Vector vecGroup = new Vector();
        vecGroup.add(groupMap);
        grp.setMessage("Record Successfully Save");
        return Constants.dao.insertData(vecGroup, columns);  
    }

   
    public Vector selectGroups(GroupForm groups) {
        
        String colums[] = {"-", "ID", "DESCRIPTION","ROLE_TYPE","COMMENTS"};

        String query = "SELECT  ID, DESCRIPTION , ROLE_TYPE, \n"
                + " NVL(COMMENTS,' ') COMMENTS  \n"
                + " FROM  \n "+Database.DCMS.role
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + groups.getRoleName().toUpperCase() + "%'  \n";
        
        if(!groups.getRoleType().equalsIgnoreCase("ALL")){
            query+=" AND UPPER(ROLE_TYPE)='" + groups.getRoleType().toUpperCase() + "'";
        }
        return setGroupData(Constants.dao.selectData(query, colums));
    }

    private Vector setGroupData(Vector<HashMap> selectData) {
      
        Vector groups = new Vector();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap rowData = (HashMap) selectData.get(i);
            GroupForm groupData = new GroupForm();
            groupData.setRoleId((String) rowData.get("ID"));
            groupData.setRoleName((String) rowData.get("DESCRIPTION"));
            groupData.setComments ((String) rowData.get("COMMENTS"));
            groupData.setRoleType((String) rowData.get("ROLE_TYPE"));
            
            
            groups.add(groupData);
        }
        return groups;
    }

    public Vector selectFormByGroup(GroupForm groupForm) {

        String colums[] = {"-", "ROLE_ID", "ROLE_NAME", "FORM_ID", "FORM_NAME",
            "MENU_ID", "MENU_NAME", "DESCRIPTION"};

        String query = " SELECT RLE.ID ROLE_ID, RLE.DESCRIPTION ROLE_NAME, \n"
                + " FRM.ID FORM_ID, FRM.NAME FORM_NAME, FRM.MENU_ID "
                + " MENU_ID, MNU.NAME MENU_NAME, "
                + " NVL(RWF.DESCRIPTION,'  ')DESCRIPTION FROM \n"
                + Database.DCMS.roleWiseForm + " RWF,   \n"
                + Database.DCMS.role + " RLE,           \n"
                + Database.DCMS.menu + " MNU,           \n"
                + Database.DCMS.form + " FRM            \n"
                + " WHERE FRM.ID = RWF.FORM_ID          \n"
                + " AND RLE.ID = RWF.ROLE_ID            \n"
                + " AND MNU.ID = FRM.MENU_ID            \n"
                + " AND UPPER(RWF.ROLE_ID)=UPPER('" + groupForm.getRoleId() + "')\n";
        return setGroupFormData(Constants.dao.selectData(query, colums));

    }
    
    public Vector selectRoleWiseReports(GroupForm groupForms) {

        String colums[] = {"-", "REPORT_ID", "DESCRIPTION"};

        String query = " SELECT APR.ID REPORT_ID, APR.DESCRIPTION DESCRIPTION  FROM \n"
                + Database.DCMS.roleWiseForm + " RWF,   \n"
                + Database.DCMS.applicationReports + " APR \n"
                + " WHERE APR.ID = RWF.FORM_ID          \n"
                + " AND UPPER(RWF.ROLE_ID)=UPPER('" + groupForms.getRoleId() + "')\n";
        Vector vec = Constants.dao.selectData(query, colums);
        Vector vecGroups = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap rowData = (HashMap) vec.get(i);
            GroupForm groupForm = new GroupForm();
            groupForm.setRoleId (groupForms.getRoleId());
            groupForm.setRoleName(groupForms.getRoleName());
            groupForm.setObjectId ((String) rowData.get("REPORT_ID"));
            groupForm.setObjectName ((String) rowData.get("DESCRIPTION"));
            vecGroups.add(groupForm);
        }
        return vecGroups;
    }
    
    public Vector selectRoleWiseAction(GroupForm groupForms) {

        String colums[] = {"-", "REPORT_ID", "DESCRIPTION"};

        String query = " SELECT APR.ID REPORT_ID, APR.DESCRIPTION DESCRIPTION  FROM \n"
                + Database.DCMS.roleWiseForm + " RWF,   \n"
                + Database.DCMS.formWiseAction + " APR \n"
                + " WHERE APR.ID = RWF.FORM_ID          \n"
                + " AND UPPER(RWF.ROLE_ID)=UPPER('" + groupForms.getRoleId() + "')\n";
        Vector vec = Constants.dao.selectData(query, colums);
        Vector vecGroups = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap rowData = (HashMap) vec.get(i);
            GroupForm groupForm = new GroupForm();
            groupForm.setRoleId ( groupForms.getRoleId());
            groupForm.setRoleName ( groupForms.getRoleName());
            groupForm.setObjectId ( (String) rowData.get("REPORT_ID"));
            groupForm.setObjectName ( (String) rowData.get("DESCRIPTION"));
            vecGroups.add(groupForm);
        }
        return vecGroups;
    }

    private Vector setGroupFormData(Vector<HashMap> selectData) {
        Vector group = new Vector();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap rowData = (HashMap) selectData.get(i);
            GroupForm groupForm = new GroupForm();
            groupForm.setRoleId((String) rowData.get("ROLE_ID"));
            groupForm.setRoleName((String) rowData.get("ROLE_NAME"));
            groupForm.setObjectId((String) rowData.get("FORM_ID"));
            groupForm.setObjectName((String) rowData.get("FORM_NAME"));
            groupForm.setMenuId((String) rowData.get("MENU_ID"));
            groupForm.setMenuName((String) rowData.get("MENU_NAME"));
            groupForm.setActive((String) rowData.get("ACTIVE"));
            groupForm.setComments((String) rowData.get("DESCRIPTION"));
            group.add(groupForm);
        }
        return group;

    }

    public boolean insertFormInGroup(GroupForm grp,String formName) {

        
        String[] columnsAppForm = {Database.DCMS.roleWiseForm, "ROLE_ID", 
            "FORM_ID", "DESCRIPTION", "CRTD_TERMINAL_ID", "CRTD_BY"};

        Vector vecInserts = new Vector();
            String value = formName;
            HashMap groupForm = new HashMap();
            groupForm.put("ROLE_ID","'"+ grp.getRoleId() + "'");
            groupForm.put("FORM_ID","'" + value + "'");
            groupForm.put("DESCRIPTION","'" + grp.getComments() + "'");
            groupForm.put("CRTD_TERMINAL_ID","'" + Constants.terminalId + "'");
            groupForm.put("CRTD_BY","'" + Constants.userId + "'");
            
            vecInserts.add(groupForm);
        return  Constants.dao.insertData(vecInserts, columnsAppForm);
        
    }
//
//        public boolean updateAppGroupForm(GroupForm grp) {
//
//        
//        String[] columnsForm = {Database.DCMS.form, "FORM_ID"};
//        String[] columnsAppForm = {Database.DCMS.appGroupForm, "GROUP_ID", 
//            "FORM_ID", "DESCRIPTION"};
//
//        Vector vecInserts = new Vector();
//        String query = " SELECT FORM_ID FROM " + Database.DCMS.form;
//        Vector vecForms = Constants.dao.selectData(query, columnsForm);
//        for (int i = 0; i < vecForms.size(); i++) {
//            String value = ((HashMap) vecForms.get(i)).get("FORM_ID").toString();
//            HashMap groupForm = new HashMap();
//            groupForm.put("GROUP_ID","'"+ grp.groupName + "'");
//            groupForm.put("FORM_ID","'" + value + "'");
//            groupForm.put("DESCRIPTION","'" + grp.Comments + "'");
//            vecInserts.add(groupForm);
//        }
//        return  Constants.dao.insertData(vecInserts, columnsAppForm);
//    }
//
//

    public boolean removeAppGroupForm(GroupForm groupForm, String formId) {

    
        String query = "DELETE FROM  "
                + Database.DCMS.roleWiseForm
                + " WHERE ROLE_ID=  "+ " '" + groupForm.getRoleId()+ "'"
                + " AND  UPPER(FORM_ID) ="+ " '" + formId.toUpperCase()+ "'";

        return (Constants.dao.executeUpdate(query, false));
    
    }

}

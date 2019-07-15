package Handler;

import BO.GroupForm;
import BO.RightAssignHistory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;

public class UserGroupHandler  implements java.io.Serializable{

    UserHandler hdlUser = new UserHandler();

    public Vector selectUserGroup(String userId) {

        String colums[] = {"-", "USER_ID", "ROLE_ID", "DESCRIPTION", "ROLE_TYPE"};
        String query = "SELECT USER_ID, DESCRIPTION, ROLE_ID, ROLE_TYPE FROM "
                + Database.DCMS.userWiseRole + ", \n"
                + Database.DCMS.role + " role \n"
                + " WHERE UPPER(USER_ID) = UPPER('" + userId + "')"
                + " AND ROLE_ID = role.ID \n";
        return setUserGroupData(Constants.dao.selectData(query, colums));
    }

    private Vector setUserGroupData(Vector<HashMap> selectData) {

        Vector user = new Vector();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap rowData = (HashMap) selectData.get(i);
            GroupForm userData = new GroupForm();
            userData.setUserName((String) rowData.get("USER_ID"));
            userData.setRoleId((String) rowData.get("ROLE_ID"));
            userData.setRoleName((String) rowData.get("DESCRIPTION"));
            userData.setRoleType((String) rowData.get("ROLE_TYPE"));

            user.add(userData);
        }
        return user;

    }
 
    
     public boolean  selectStoreWiseUser(String fromUserId, String toUserId) {

        String colums[] = {"-", "STORE_ID", "ACTIVE", "UPDATE_ITEM_STOCK","USER_ID"};
        String insertColums[] = {Database.DCMS.storeWiseUser,
            "STORE_ID", "USER_ID", "ACTIVE", "UPDATE_ITEM_STOCK", "CRTD_BY", "CRTD_TERMINAL_ID"};
        String query = "SELECT STORE_ID, USER_ID,ACTIVE,UPDATE_ITEM_STOCK FROM "
                + Database.DCMS.storeWiseUser + " \n"
                + " WHERE UPPER(USER_ID) = UPPER('" + fromUserId + "')";
        List<HashMap> list = Constants.dao.selectDatainList(query, colums);
        List<HashMap> insertRights = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap<String, String> userRights = new HashMap<>();
            userRights.put("STORE_ID", "'" + list.get(i).get("STORE_ID").toString() + "'");
            userRights.put("USER_ID", "'" + toUserId + "'");
            userRights.put("ACTIVE", "'" + list.get(i).get("ACTIVE").toString() + "'");
            userRights.put("UPDATE_ITEM_STOCK", "'" + list.get(i).get("UPDATE_ITEM_STOCK").toString() + "'");
            userRights.put("CRTD_BY", "'" + Constants.userId + "'");
            userRights.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            insertRights.add(userRights);
        }

        return Constants.dao.insertData(insertRights, insertColums);
    }

     public boolean selectUserWiseLocaction(String fromUserId, String toUserId) {

        String colums[] = {"-", "LOCATION_ID"};
        String insertColums[] = {Database.DCMS.userWiseLocation,
            "LOCATION_ID", "USER_ID"};
        String query = "SELECT LOCATION_ID, USER_ID FROM "
                + Database.DCMS.userWiseLocation + " \n"
                + " WHERE UPPER(USER_ID) = UPPER('" + fromUserId + "')";
        List<HashMap> list = Constants.dao.selectDatainList(query, colums);
        List<HashMap> insertRights = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap<String, String> userRights = new HashMap<>();
            userRights.put("LOCATION_ID", "'" + list.get(i).get("LOCATION_ID").toString() + "'");
            userRights.put("USER_ID", "'" + toUserId + "'");
            insertRights.add(userRights);
        }

        return Constants.dao.insertData(insertRights, insertColums);
    }


 public boolean selectUserWiseDepartment(String fromUserId, String toUserId) {

        String colums[] = {"-", "DEPARTMENT_ID"};
        String insertColums[] = {Database.DCMS.userWiseDepartment,
            "DEPARTMENT_ID", "USER_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};
        String query = "SELECT DEPARTMENT_ID, USER_ID,CRTD_BY,CRTD_TERMINAL_ID FROM "
                + Database.DCMS.userWiseDepartment + " \n"
                + " WHERE UPPER(USER_ID) = UPPER('" + fromUserId + "')";
        List<HashMap> list = Constants.dao.selectDatainList(query, colums);
        List<HashMap> insertRights = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap<String, String> userRights = new HashMap<>();
            userRights.put("DEPARTMENT_ID", "'" + list.get(i).get("DEPARTMENT_ID").toString() + "'");
            userRights.put("USER_ID", "'" + toUserId + "'");
             userRights.put("CRTD_BY", "'" + Constants.userId + "'");
            userRights.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            insertRights.add(userRights);
        }

        return Constants.dao.insertData(insertRights, insertColums);
    }

}

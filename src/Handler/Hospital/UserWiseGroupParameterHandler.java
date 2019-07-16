/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;

import BO.Hospital.IpdMedicinePlanBO;
import BO.Hospital.UserWiseGroupParameterBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class UserWiseGroupParameterHandler implements java.io.Serializable {

    public List<UserWiseGroupParameterBO> selectUserParameters(String userId,
            String groupId) {

        String[] selectColumns = {"-","USER_ID","USER_NAME","PARAMETER_ID",
            "PARAMETER_NAME", "DISPLAY_NAME","GROUP_ID","UNIT"};

        String selectUserParameters = "SELECT UWP.USER_ID,  \n"
                + "USR.NAME USER_NAME,                      \n"
                + "UWP.PARAMETER_ID,                        \n"
                + "CP.DESCRIPTION PARAMETER_NAME,           \n"
                + "CP.DISPLAY_NAME DISPLAY_NAME,            \n"
                + "NVL(CP.UNIT, ' ') UNIT,                  \n"
                + " UWP.GROUP_ID                            \n"
                + " FROM " + Database.DCMS.users + " USR,   \n"
                + Database.DCMS.userWiseGroupParameters + " UWP,\n"
                + Database.DCMS.CPTParameter + " CP         \n"
                + "WHERE UWP.USER_ID = '" + userId + "'     \n"
                + "AND UWP.GROUP_ID = " + groupId + "       \n"
                + "AND USR.USER_NAME = UWP.USER_ID          \n"
                + "AND CP.ID = UWP.PARAMETER_ID             \n"
                + "";
         System.out.println(selectUserParameters);
        List<HashMap> listMap = Constants.dao.selectDatainList(selectUserParameters, selectColumns);

        List<UserWiseGroupParameterBO> list = new ArrayList();
        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            UserWiseGroupParameterBO set = new UserWiseGroupParameterBO();

            set.setUserId(map.get("USER_ID").toString());
            set.setUserName(map.get("USER_NAME").toString());
            set.setParameterId(map.get("PARAMETER_ID").toString());
            set.setParameterName(map.get("PARAMETER_NAME").toString());
            set.setDisplayName(map.get("DISPLAY_NAME").toString());
            set.setGroupId(map.get("GROUP_ID").toString());
            set.setUnit(map.get("UNIT").toString());

            list.add(set);
        }
        return list;
    }

    public boolean insertUserParameters(UserWiseGroupParameterBO imp) {

        String[] columns = {Database.DCMS.userWiseGroupParameters,
            "USER_ID", "PARAMETER_ID", "GROUP_ID"};

        HashMap map = new HashMap();
        map.put("USER_ID", "'" + imp.getUserId() + "'");
        map.put("PARAMETER_ID", "'" + imp.getParameterId() + "'");
        map.put("GROUP_ID", "'" + imp.getGroupId() + "'");
        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean deleteUsersParameter(String userId,String parameterId ,
           String groupId) {
        String query ="DELETE FROM "+Database.DCMS.userWiseGroupParameters+" UWP \n"
                + " WHERE UWP.USER_ID = '"+userId+"'     \n"
                + " AND PARAMETER_ID = "+parameterId+"   \n"
                + " AND GROUP_ID = "+ groupId + "          \n";
                
        System.out.println(query);
        return Constants.dao.executeUpdate(query, false);
    }

}

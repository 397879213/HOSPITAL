/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.OnCallDoctor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class OnCallDoctorHandler implements java.io.Serializable {

    public List<OnCallDoctor> selectOnCallDoctor(String date, String dutyType) {

        String[] selectColumns = {"-", "SPECIALITY_ID", "SPECIALTIY",
            "USER1_NAME", "USER2_NAME", "USER3_NAME", "USER_ID1", "USER_ID2",
            "USER_ID3", "CALL_DATE", "DUTY_TYPE", "NEXT_DATE"};

        String selectOnCall
                = "SELECT NVL(OCD.USER_ID1,'GENERAL')   USER_ID1,         \n"
                + "USR1.NAME                            USER1_NAME,       \n"
                + "NVL(OCD.USER_ID2,'GENERAL')          USER_ID2,         \n"
                + "USR2.NAME                            USER2_NAME,       \n"
                + "NVL(OCD.USER_ID3,'GENERAL')          USER_ID3,         \n"
                + "USR3.NAME                            USER3_NAME,       \n"
                + "SPY.DESCRIPTION                      SPECIALTIY,       \n"
                + "OCD.SPECIALITY_ID                    SPECIALITY_ID,    \n"
                + "TO_CHAR(OCD.ON_CALL_DATE, 'DD-MON-YYYY') CALL_DATE,    \n"
                + "TO_CHAR(OCD.ON_CALL_DATE + 1, 'DD-MON-YYYY') NEXT_DATE,\n"
                + "OCD.DUTY_TYPE                        DUTY_TYPE         \n"
                + " FROM " + Database.DCMS.onCallDoctor + " OCD,          \n"
                + Database.DCMS.definitionTypeDetail + "   SPY ,          \n"
                + Database.DCMS.users + "   USR1 ,                        \n"
                + Database.DCMS.users + "   USR2  ,                       \n"
                + Database.DCMS.users + "   USR3                          \n"
                + "WHERE OCD.ON_CALL_DATE =  '" + date + "'               \n";
        if(!dutyType.equalsIgnoreCase("SELECT")){
            selectOnCall += "AND OCD.DUTY_TYPE = '" + dutyType + "'       \n";
        }
                selectOnCall += "AND OCD.SPECIALITY_ID =   SPY.ID         \n"
                + "AND NVL(OCD.USER_ID1, 'GENERAL')  =   USR1.USER_NAME   \n"
                + "AND NVL(OCD.USER_ID2, 'GENERAL')  =   USR2.USER_NAME   \n"
                + "AND NVL(OCD.USER_ID3, 'GENERAL')  =   USR3.USER_NAME   \n";

        System.out.println(selectOnCall);

        List selectRoom = Constants.dao.selectDatainList(selectOnCall, selectColumns);

        List<OnCallDoctor> list = new ArrayList();
        for (int i = 0; i < selectRoom.size(); i++) {
            HashMap map = (HashMap) selectRoom.get(i);
            OnCallDoctor set = new OnCallDoctor();
            set.setDate(map.get("CALL_DATE").toString());
            set.setNextDate(map.get("NEXT_DATE").toString());
            set.setSpecialityId(map.get("SPECIALITY_ID").toString());
            set.setSpecialityName(map.get("SPECIALTIY").toString());
            set.setUserId1(map.get("USER_ID1").toString());
            set.setUserName1(map.get("USER1_NAME").toString());
            set.setUserId2(map.get("USER_ID2").toString());
            set.setUserName2(map.get("USER2_NAME").toString());
            set.setUserId3(map.get("USER_ID3").toString());
            set.setUserName3(map.get("USER3_NAME").toString());
            set.setDutyType(map.get("DUTY_TYPE").toString());

            list.add(set);
        }
        return list;
    }

    public boolean insertOnCallDutyRoaster(OnCallDoctor obj, String copytdate) {

        String[] columns = {Database.DCMS.onCallDoctor, "ON_CALL_DATE", "SPECIALITY_ID",
            "USER_ID1", "USER_ID2", "USER_ID3", "DUTY_TYPE"};

        HashMap insertCall = new HashMap();
        insertCall.put("ON_CALL_DATE", "'" + copytdate + "'");
        insertCall.put("USER_ID1", "'" + obj.getUserId1() + "'");
        insertCall.put("USER_ID2", "'" + obj.getUserId2() + "'");
        insertCall.put("USER_ID3", "'" + obj.getUserId3() + "'");
        insertCall.put("SPECIALITY_ID", "'" + obj.getSpecialityId()+ "'");
        insertCall.put("DUTY_TYPE", "'" + obj.getDutyType()+ "'");
        insertCall.put("CRTD_BY", "'" + Constants.userId + "'");
        insertCall.put("CRTD_DATE", Constants.today );
        insertCall.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listInr = new ArrayList();
        listInr.add(insertCall);
        return Constants.dao.insertData(listInr, columns);
    }

    public boolean updateUser(OnCallDoctor com) {
        String query
                = " UPDATE " + Database.DCMS.onCallDoctor + "\n"
                + " SET USER_ID1 = '" + com.getUserId1().replaceAll("'", "''") + "',\n"
                + " USER_ID2 = '" + com.getUserId2().replaceAll("'", "''") + "',\n"
                + " USER_ID3 = '" + com.getUserId3().replaceAll("'", "''") + "' \n"
                + " WHERE SPECIALITY_ID  = '" + com.getSpecialityId() + "'"
                + " AND TO_CHAR(ON_CALL_DATE, 'DD-MON-YYYY') = '" +com.getDate()+"'\n";

        System.out.println(query);
        List listUpdate = new ArrayList();
        listUpdate.add(query);
        return Constants.dao.executeUpdates(listUpdate);
    }

    public boolean deleteRoaster(String selectDate) {
        String query
                = " DELETE " + Database.DCMS.onCallDoctor + "\n"
                + " WHERE TO_CHAR(ON_CALL_DATE, 'DD-MON-YYYY')  = '" + selectDate + "'";

        return Constants.dao.executeUpdate(query, false);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.Setup.ConsultationRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;

public class ConsultationRoomHandler implements java.io.Serializable {

    public List<ConsultationRoom> selectConsultantRoom(String userName,
            String specialtyId) {

        String[] selectColumns = {"-", "USER_NAME", "NAME", "SPECALTIY",
            "DEPARTMENT", "DESIGNATION", "CONSULTATION_ROOM_ID", "ROOM_NAME"};

        String selectConsultationRoom
                = "SELECT USR.USER_NAME, "
                + "USR.NAME,                                                \n"
                + "SPY.DESCRIPTION          SPECALTIY,                      \n"
                + "DEP.DESCRIPTION          DEPARTMENT,                     \n"
                + "DEG.DESCRIPTION          DESIGNATION,                    \n"
                + "USR.CONSULTATION_ROOM_ID ,                               \n"
                + "ROM.DESCRIPTION || ' '|| ROM.ADDITIONAL_INFO ROOM_NAME   \n"
                + " FROM " + Database.DCMS.users + "       USR,             \n"
                + Database.DCMS.definitionTypeDetail + "   DEP,             \n"
                + Database.DCMS.definitionTypeDetail + "   DEG ,            \n"
                + Database.DCMS.definitionTypeDetail + "   ROM ,            \n"
                + Database.DCMS.definitionTypeDetail + "   SPY              \n"
                + "WHERE USR.SPECIALITY_ID =   SPY.ID "
                + "AND USR.DEPARTMENT_ID =   DEP.ID "
                + "AND USR.DESIGNATION_ID =  DEG.ID "
                + "AND USR.CONSULTATION_ROOM_ID =  ROM.ID "
                + "AND USR.USER_NAME IN (SELECT USER_ID FROM                \n"
                + Database.DCMS.cptWisePerformingShare + " CPS              \n"
                + "WHERE CPS.CPT_ID IN (SELECT DEF.DESCRIPTION FROM         \n"
                + Database.DCMS.definitionTypeDetail + " DEF                \n"
                + "WHERE DEF.DEF_TYPE_ID="
                + " '"+DefinitionTypes.consultationRooms+"'))               \n"
                + "AND USR.ACTIVE= 'Y'                                      \n";

        if (userName.length()!=0) {
            selectConsultationRoom += " AND USR.USER_NAME = '" + userName + "'\n";
        }

        if (specialtyId.length()!=0) {
            selectConsultationRoom += " AND USR.SPECIALITY_ID = '" + specialtyId + "' \n";
        }

        List selectRoom = Constants.dao.selectDatainList(selectConsultationRoom, selectColumns);

        List<ConsultationRoom> list = new ArrayList();
        for (int i = 0; i < selectRoom.size(); i++) {
            HashMap map = (HashMap) selectRoom.get(i);
            ConsultationRoom set = new ConsultationRoom();
            set.setUserName(map.get("USER_NAME").toString());
            set.setName(map.get("NAME").toString());
            set.setSpecialityName(map.get("SPECALTIY").toString());
            set.setDepartmentName(map.get("DEPARTMENT").toString());
            set.setDesignationName(map.get("DESIGNATION").toString());
            set.setConsultationRoomId(map.get("CONSULTATION_ROOM_ID").toString());
            set.setRoomName(map.get("ROOM_NAME").toString());

            list.add(set);
        }
        return list;
    }

    public boolean updateRoom(ConsultationRoom com) {
        String query
                = " UPDATE " + Database.DCMS.users + "\n"
                + " SET CONSULTATION_ROOM_ID = '" + com.getConsultationRoomId().replaceAll("'", "''") + "'\n"
                + " WHERE USER_NAME  = '" + com.getUserName() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

}

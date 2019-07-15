package Controller.Setup;

import BO.Setup.ConsultationRoom;
import Handler.ConsultationRoomHandler;
import java.util.List;
import utilities.Constants;

public class ConsultationRoomController {

    ConsultationRoomHandler hdlLog = new ConsultationRoomHandler();

    public List<ConsultationRoom> selectRoomDetails(String userName,
            String specialtyId) {
        return hdlLog.selectConsultantRoom(userName, specialtyId);
    }


    public boolean updateAllDb(ConsultationRoom com) {

        boolean ret = hdlLog.updateRoom(com);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}

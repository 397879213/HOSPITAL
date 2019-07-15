package Controller.Client;

import BO.AuditLog;
import Handler.Client.AuditLogHandler;
import java.util.List;
import utilities.Constants;

public class AuditLogController {

    AuditLogHandler hdlLog = new AuditLogHandler();

    public List<AuditLog> selectEmployeeByFactory(String factoryId) {
        return hdlLog.selectEmployeeByFactory(factoryId);
    }

    public List<AuditLog> selectEmployeeByPlNo(String plNumber) {
        return hdlLog.selectEmployeeByPl(plNumber);
    }

    public boolean updateAllDb(AuditLog com) {

        boolean ret = hdlLog.updatePersonnelDb(com);
        if (ret) {
            ret = hdlLog.updateEmr(com);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}

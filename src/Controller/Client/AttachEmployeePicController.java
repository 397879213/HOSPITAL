package Controller.Client;

import BO.Client.AttachDocument;
import Handler.Client.AttachEmployeePicHandler;
import java.awt.Image;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author pacslink
 */
public class AttachEmployeePicController {

    AttachEmployeePicHandler hdlDocumnet = new AttachEmployeePicHandler();

    public List<AttachDocument> getEmployeeDetail(String id) {
        return hdlDocumnet.getEmployeeDetail(id);
    }

    public boolean insertDocuments(AttachDocument doc) {

        boolean ret = hdlDocumnet.insertEmployeeePicHistory(doc.getId());

        if (ret) {
            String delete = " DELETE  " + Database.DCMS.attachEmployeePic + "  \n"
                    + " WHERE ID = " + doc.getId() + "    \n";
            ret = Constants.dao.executeUpdate(delete, false);

        }
        if (ret) {
            ret = hdlDocumnet.insertDocuments(doc);
        }
        if (ret) {
            String query
                    = " UPDATE   " + Database.DCMS.clientEmployeeFamily + "\n"
                    + " SET PIC_UPLOADED = 'Y'    \n"
                    + " WHERE ID = " + doc.getId() + " ";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deleteAttachDocuments(String id) {

        String query
                = " UPDATE  " + Database.DCMS.attachEmployeePic + "    \n"
                + " SET ACTIVE = 'N',        \n"
                + " DELETED_BY = '" + Constants.userId + "',    \n"
                + " DELETED_DATE = SYSDATE , "
                + " DELETE_TERMINAL_ID = '" + Constants.terminalId + "'    \n"
                + " WHERE ID = " + id + "   \n";

        boolean ret = Constants.dao.executeUpdate(query, false);
        if (ret) {
            ret = hdlDocumnet.updatePicStatus(id, "N");
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public Image searchImage(String id) {
        return hdlDocumnet.searchImage(id);
    }

    public boolean insertEmployeeDoc(String patientId, String empDetailId,
            String doctypeId,String path, String remarks) {
        return hdlDocumnet.insertEmployeeDoc(patientId, empDetailId,doctypeId, path,remarks);
    }
}

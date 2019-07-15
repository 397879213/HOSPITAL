package Handler.Client;

import BO.Client.AttachDocument;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.DAO;
import static utilities.DAO.conn;
import utilities.Database;

public class AttachEmployeePicHandler {

    public List<AttachDocument> getEmployeeDetail(String id) {

        String[] columns = {"", "EMPLOYEE_ID", "CLIENT_ID", "CRTD_BY", "AGE",
            "CRTD_DATE", "FULL_NAME"};

        String query
                = " SELECT AD.EMPLOYEE_ID  EMPLOYEE_ID,              \n"
                + " AD.CLIENT_ID           CLIENT_ID,                \n"
                + " TO_CHAR(AD.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,    \n"
                + " PAT.FULL_NAME          FULL_NAME,                \n"
                + " PAT.AGE                AGE,                      \n"
                + " GEN.DESCRIPTION        GENDER,                   \n"
                + " USR.NAME               CRTD_BY                   \n"
                + " FROM "
                + Database.DCMS.attachEmployeePic + " AD,   \n"
                + Database.DCMS.clientEmployeeFamily + "    PAT,  \n"
                + Database.DCMS.gender + "            GEN,  \n"
                + Database.DCMS.client + "            CLT,  \n"
                + Database.DCMS.users + "             USR   \n"
                + " WHERE AD.ID = " + id + "                \n"
                + " AND   CLT.ID = AD.CLIENT_ID             \n"
                + " AND   PAT.ID = AD.EMPLOYEE_ID           \n"
                + " AND   AD.CRTD_BY = USR.USER_ID          \n"
                + " AND   PAT.GENDER = GEN.ID               \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<AttachDocument> listPatientDetail = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            AttachDocument pat = new AttachDocument();
            pat.setEmployeeId((String) map.get("EMPLOYEE_ID"));
            pat.setClientId((String) map.get("CLIENT_ID"));
            pat.setFullName((String) map.get("FULL_NAME"));
            pat.setAttachmentDate((String) map.get("CRTD_DATE"));
            pat.setAge((String) map.get("AGE"));
            pat.setGender((String) map.get("GENDER"));
            pat.setCrtdBy((String) map.get("CRTD_BY"));
            listPatientDetail.add(pat);
        }
        return listPatientDetail;

    }

    public boolean insertDocuments(AttachDocument doc) {
        boolean ret = true;
        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            File fBlob = new File(doc.getPath());
            InputStream input = new FileInputStream(fBlob);
            PreparedStatement pstmt = conn.prepareStatement("INSERT "
                    + " INTO  " + Database.DCMS.attachEmployeePic
                    + " (ID, EMPLOYEE_PICTURE,CRTD_BY,CRTD_TERMINAL_ID)"
                    + " VALUES (?,?,?,?)");

            pstmt.setString(1, doc.getId());
            pstmt.setBinaryStream(2, input, (int) fBlob.length());//);
            pstmt.setString(3, Constants.userId);
            pstmt.setString(4, Constants.terminalId);
            pstmt.execute();

        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;

    }

    public boolean insertEmployeeePicHistory(String id) {
        String query = " INSERT "
                + " INTO  " + Database.DCMS.attachEmployeePicHistory
                + " SELECT * FROM " + Database.DCMS.attachEmployeePic
                + " WHERE ID = " + id;

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updatePicStatus(String empId, String status) {
        String query
                = " UPDATE   " + Database.DCMS.clientEmployeeFamily + "\n"
                + " SET PIC_UPLOADED = '" + status + "'         \n"
                + " WHERE ID = '" + empId + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public Image searchImage(String id) {
        String query = " SELECT EMPLOYEE_PICTURE FROM "
                + Database.DCMS.attachEmployeePic + " WHERE ID =" + id;

        Image image = null;
        try {
            if (DAO.conn == null || DAO.conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            PreparedStatement stmnt = DAO.conn.prepareStatement(query);
            ResultSet rs = stmnt.executeQuery();
            if (rs.next()) {
                try {
                    Blob aBlob = rs.getBlob(1);
                    byte[] allBytesInBlob = aBlob.getBytes(1, (int) aBlob.length());
                    image = Toolkit.getDefaultToolkit().createImage(allBytesInBlob);
                } catch (Exception ex) {
                    byte[] bytes;
                    bytes = rs.getBytes(1);
                    System.out.print("Image is not Find");

                }
            }
            rs.close();
            stmnt.close();
        } catch (Exception ex) {
            System.out.println("Error when trying to read BLOB: " + ex);
        }
        return image;
    }
    
    
     public boolean insertEmployeeDoc(String patientId, 
              String empDetailId,  String doctypeId,String path, String remarks) {
        boolean ret = true;
        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            } 
            File fBlob = new File(path);
            InputStream input = new FileInputStream(fBlob);
            PreparedStatement pstmt = conn.prepareStatement("INSERT "
                    + " INTO  " + Database.DCMS.clientEmployeeDocs
                    + " (PATIENT_ID ,EMP_DETAIL_ID ,DOC_TYPE_ID,  "
                    + " PICTURE , ACTIVE , CRTD_BY , "
                    + " CRTD_TERMINAL_ID,REMARKS,ACTION_BY,ACTION_TERMINAL_ID)VALUES (?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, patientId);
            pstmt.setString(2, empDetailId);
            pstmt.setString(3, doctypeId);
            pstmt.setBinaryStream(4, input, (int) fBlob.length());//);
            pstmt.setString(5, "Y");
            pstmt.setString(6, Constants.userId);
            pstmt.setString(7, Constants.terminalId);
            pstmt.setString(8, remarks);
            pstmt.setString(9, Constants.userId);
            pstmt.setString(10, Constants.terminalId);
            pstmt.execute();
            conn.commit();
            conn.close();
        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }
}

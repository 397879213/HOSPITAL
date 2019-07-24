/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.OPD;

import BO.OutsideInvestigation;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import utilities.Constants;
import utilities.DAO;
import static utilities.DAO.conn;
import utilities.Database;
import utilities.GenerateKeys;

public class OutsideInvestigationHandler implements java.io.Serializable {

    DAO dao = new DAO();
    GenerateKeys keys = new GenerateKeys();

    public boolean insertOutsideInvestigation(OutsideInvestigation investigation) {

        String[] columns = {Database.DCMS.outsideInvestigations, "PATIENT_ID",
            "CPT_ID", "CON", "ODI", "HEALTHCARE_FACILITY_ID", "TEST_NAME", "ID",
            "REPORT_DATE", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap mapInvestigation = new HashMap();
        mapInvestigation.put("CPT_ID", "'" + investigation.getCptId() + "'");
        mapInvestigation.put("PATIENT_ID", "'" + investigation.getPatientId() + "'");
        mapInvestigation.put("CON", "'" + investigation.getCompleteOrderNo() + "'");
        mapInvestigation.put("ODI", "'" + investigation.getOrderDetailId() + "'");
        mapInvestigation.put("HEALTHCARE_FACILITY_ID", "'" + investigation.getHealthCareFacilityId() + "'");
        mapInvestigation.put("TEST_NAME", "'" + investigation.getTestName() + "'");
        mapInvestigation.put("ID", "(SELECT NVL(MAX(ID) + 1, 0) ID FROM " + 
                Database.DCMS.outsideInvestigations + ")");
        mapInvestigation.put("REPORT_DATE", "'" + investigation.getReportDate() + "'");
        mapInvestigation.put("CRTD_BY", "'" + Constants.userId + "'");
        mapInvestigation.put("CRTD_DATE", "" + "SYSDATE" + "");
        mapInvestigation.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List list = new ArrayList();
        list.add(mapInvestigation);
        return Constants.dao.insertData(list, columns);
    }

    public List<OutsideInvestigation> selectOutsideInvestigation(
            String completeOrderNo, String orderDetailId, String patientId,
            String testName) {
        String[] columns = {Database.DCMS.outsideInvestigations, "PATIENT_ID",
            "CPT_ID", "CON", "ODI", "HEALTHCARE_FACILITY_DES",  "IS_REPORT_ATTACHED", 
            "HEALTHCARE_FACILITY_ID", "TEST_NAME", "REPORT_DATE", "ID", 
            "REPORT_REMARKS", "REPORT_DATE_DAY"};

        String query = " SELECT OSI.PATIENT_ID ,  NVL(OSI.CPT_ID,' ') CPT_ID,   \n"
                + " OSI.CON, OSI.ODI, TEST_NAME,                                \n"
                + " OSI.HEALTHCARE_FACILITY_ID,                                 \n"
                + " HFS.DESCRIPTION     HEALTHCARE_FACILITY_DES,                \n"
                + " NVL(OSI.TEST_NAME,' ') TEST_NAME,                           \n"
                + " TO_CHAR(OSI.REPORT_DATE,'DD-MON-YY')  REPORT_DATE,          \n"
                + " ROUND(OSI.REPORT_DATE - SYSDATE  )+1 REPORT_DATE_DAY,       \n"
                + " OSI.ID, OSI.IS_REPORT_ATTACHED,                             \n"
                + " NVL(OSI.REPORT_REMARKS,' ') REPORT_REMARKS                  \n"
                + " FROM " + Database.DCMS.outsideInvestigations + " OSI,       \n"
                + "   " + Database.DCMS.definitionTypeDetail + " HFS,           \n"
                + "   " + Database.DCMS.CPT + " CPT                             \n"
                + " WHERE OSI.PATIENT_ID = '" + patientId + "'                  \n"
                + " AND OSI.CON  = '" + completeOrderNo + "'                    \n"
                + " AND OSI.ODI = " + orderDetailId + "                         \n";
                if(testName.length() != 0){
                    query += " AND UPPER(OSI.TEST_NAME) LIKE '%" 
                            + testName.toUpperCase() + "%'                      \n";
                }
                query += " AND OSI.HEALTHCARE_FACILITY_ID = HFS.ID              \n"
                + " AND NVL(OSI.CPT_ID,'GENERAL') = NVL(CPT.CPT_ID,'GENERAL')   \n";

        List vec = Constants.dao.selectData(query, columns);
        List<OutsideInvestigation> listInvestigations = new ArrayList();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            OutsideInvestigation investigation = new OutsideInvestigation();
            investigation.setPatientId((String) map.get("PATIENT_ID"));
            investigation.setCompleteOrderNo((String) map.get("CON"));
            investigation.setOrderDetailId((String) map.get("ODI"));
            investigation.setCptId((String) map.get("CPT_ID"));
            investigation.setTestName((String) map.get("TEST_NAME"));
            investigation.setHealthCareFacilityDescription((String) map.get(
                    "HEALTHCARE_FACILITY_DES"));
            investigation.setHealthCareFacilityId((String) map.get("HEALTHCARE_FACILITY_ID"));
            investigation.setReportDay((String) map.get("REPORT_DATE_DAY"));
            investigation.setReportDate((String) map.get("REPORT_DATE"));
            investigation.setId((String) map.get("ID"));
            investigation.setIsReportAttached((String) map.get("IS_REPORT_ATTACHED"));
            investigation.setReportRermarks((String) map.get("REPORT_REMARKS"));

            listInvestigations.add(investigation);
        }
        return listInvestigations;
    }

    public List<OutsideInvestigation> selectPreviousOutsideInvestigation(
            String completeOrderNo, String patientId,
            String testName) {
        String[] columns = {Database.DCMS.outsideInvestigations, "PATIENT_ID",
            "CPT_ID", "CON", "ODI", "REPORT_REMARKS",
            "HEALTHCARE_FACILITY", "TEST_NAME", "IS_REPORT_ATTACHED", "REPORT_DATE"};

        String query = " SELECT PATIENT_ID ,  NVL(CPT_ID,' ') CPT_ID         ,\n"
                + " CON, ODI, TEST_NAME            ,\n"
                + " NVL(HEALTHCARE_FACILITY_ID,' ') HEALTHCARE_FACILITY         ,\n"
                + " IS_REPORT_ATTACHED, REPORT_REMARKS,\n"
                + " TO_CHAR(REPORT_DATE,'DD-MON-YY')  REPORT_DATE            \n"
                + " FROM " + Database.DCMS.outsideInvestigations
                + " WHERE PATIENT_ID = '" + patientId + "'  \n"
                + " AND CON  NOT IN('" + completeOrderNo + "')\n";

        if (!testName.isEmpty()) {
            query += " AND TEST_NAME LIKE '%" + testName.toUpperCase() + "%'    \n";
        }

        List vec = Constants.dao.selectData(query, columns);
        List<OutsideInvestigation> listInvestigations = new ArrayList();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            OutsideInvestigation investigation = new OutsideInvestigation();
            investigation.setPatientId((String) map.get("PATIENT_ID"));
            investigation.setCompleteOrderNo((String) map.get("CON"));
            investigation.setOrderDetailId((String) map.get("ODI"));
            investigation.setCptId((String) map.get("CPT_ID"));
            investigation.setTestName((String) map.get("TEST_NAME"));
            investigation.setReportDate((String) map.get("REPORT_DATE"));
            investigation.setReportRermarks((String) map.get("REPORT_REMARKS"));
            investigation.setIsReportAttached((String) map.get("IS_REPORT_ATTACHED"));
            investigation.setHealthCareFacilityId((String) map.get("HEALTHCARE_FACILITY"));
            investigation.setRowId((String) map.get("ROWID"));

            listInvestigations.add(investigation);
        }
        return listInvestigations;
    }

    public boolean updateReportImage(String filePath, int id) {

        File file = new File(filePath);
        boolean ret = true;

        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            PreparedStatement stmt2 = conn.prepareStatement(" SELECT  REPORT_IMAGE FROM  "
                    + Database.DCMS.outsideInvestigations
                    + " WHERE ID= ? FOR UPDATE ");
            stmt2.setInt(1, id);
            ResultSet rset = stmt2.executeQuery();
            FileInputStream inputFileInputStream = new FileInputStream(file);
            rset.next();
            BLOB image = ((OracleResultSet) rset).getBLOB("REPORT_IMAGE");
            int bufferSize;
            byte[] byteBuffer;
            int bytesRead = 0;

            bufferSize = image.getBufferSize();
            byteBuffer = new byte[bufferSize];
            OutputStream blobOutputStream = image.getBinaryOutputStream();
            while ((bytesRead = inputFileInputStream.read(byteBuffer)) != -1) {
                // After reading a buffer from the binary file, write the contents
                // of the buffer to the output stream using the write()
                // method.
                blobOutputStream.write(byteBuffer, 0, bytesRead);

            }
            inputFileInputStream.close();
            blobOutputStream.close();
            Constants.dao.commitTransaction();
            rset.close();
            stmt2.close();

        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }
    
    public Image selectReportImage(String id) {

        String query = "SELECT REPORT_IMAGE FROM "
                + Database.DCMS.outsideInvestigations + " WHERE ID = " + id;
        System.out.println(query);
        Image image = null;
        Connection conn = null;
        try {
            if (DAO.conn == null || DAO.conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }

            // Prepare a Statement:
            PreparedStatement stmnt = DAO.conn.prepareStatement(query);
            // Execute
            ResultSet rs = stmnt.executeQuery();
            if (rs.next()) {
                try {
                    // Get as a BLOB
                    Blob aBlob = rs.getBlob(1);
                    byte[] allBytesInBlob = aBlob.getBytes(1, (int) aBlob.length());

                    image = Toolkit.getDefaultToolkit().createImage(allBytesInBlob);

                } catch (Exception ex) {
                    byte[] bytes;
                    bytes = rs.getBytes(1);
                    System.out.print("Image is not Find");

                }
            }

            // Close resources
            rs.close();
            stmnt.close();
            //conn.close();
            // Constants.dao.conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error when trying to read BLOB: " + ex);
        }
        return image;
    }

//    public String getReportImages(String id) {
//
//        String ret = "";
//        try {
//            if (conn == null || conn.isClosed()) {
//                conn = Constants.dao.getConnection();
//            }
//            String sql = " SELECT REPORT_IMAGE FROM "
//                    + Database.DCMS.outsideInvestigations + " \n"
//                    + " WHERE ID = " + id + "  \n";
//
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet resultSet = stmt.executeQuery();
//            if (resultSet.next()) {
//                ret = System.getProperty("java.io.tmpdir") + id + ".jpg";
//                File picture = new File(ret);
//                FileOutputStream fos = new FileOutputStream(picture);
//                byte[] buffer = new byte[256];
//                InputStream is = resultSet.getBinaryStream(1);
//                while (is.read(buffer) > 0) {
//                    fos.write(buffer);
//                }
//                fos.close();
//            } else {
//                ret = "";
//            }
//            stmt.close();
//            resultSet.close();
//
//        } catch (Exception ex) {
//            ret = "";
//            ex.printStackTrace();
//        }
//
//        return ret;
//    }
    
}

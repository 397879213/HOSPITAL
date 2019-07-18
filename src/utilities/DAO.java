    package utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;
 

public class DAO implements java.io.Serializable {

    public static Connection conn = null;

    public ResultSet rs = null;
    public static Statement stmt = null;
    public boolean exequery = true;
    public boolean execption = true;

    public static Connection teleConn = null;
    public ResultSet teleRs = null;
    public static Statement teleStmt = null;
 
    public static String username = "EMR";
    public static String usernameEmr = "EMR";
    public static String usernamePerSys = "PERSYS";
    public static String usernamePof = "POF";

    public static String password = "SIBTAINPASHA";
    public static String sid = "HMSDB";
    public static String ip = "10.14.10.195";
    public static String organizationName = "";
    public static String port = "1521";

    public static String conString = "";
    public String connectionException = "";
    public static int count = 0;
    public static boolean receipient = false;

    //
    public static String telePassword = "DDDD";
    public static String teleSid = "XE";
    public static String teleIp = "127.0.0.1";
    public static String telePort = "1521";

    public static String reportConString = "";
    public static String reportIp = "127.0.0.1";
    public static String reportSID = "HMSDB";
    public static String reportPort = "1521";
    public static String reportUserName = "EMR";
    public static String reportPassword = "SIBTAINPASHA";
    public static Connection connReport = null;

    public Connection getReportConnection() {

        try {

            reportConString = "jdbc:oracle:thin:@//" + reportIp + ":" + reportPort + "/" + reportSID;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connReport = DriverManager.getConnection(reportConString, reportUserName,
                    reportPassword);
            connReport.setAutoCommit(false);

        } catch (Exception ex) {
            connReport = null;
            System.out.println("\n Unable to connect main Server due to network problem, kindly contact Administrator");
            ex.printStackTrace();
            System.out.println("\n Unable to make connection to DB, Please contact Administrator ");
        }
        return connReport;
    }

    public Connection getConnection() {

        try {

            conString = "jdbc:oracle:thin:@//" + ip + ":" + port + "/" + sid;
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(conString, username, password);

            conn.setAutoCommit(false);

        } catch (Exception ex) {

            conn = null;
            System.out.println("\n Unable to connect main Server due to network problem, kindly contact Administrator");
            ex.printStackTrace();
            System.out.println("\n Unable to make connection to DB, Please contact Administrator ");
        }
        if (Constants.sessionId.length() != 0 && checkUserSessionStatus()) {
            closeSession();
         
            System.exit(0);
        }

        return conn;
    }

    public static String attendanceCon = "";
    public static Connection attConn = null;

    public void getServerConnection(String ip, String sid, String port,
            String userName, String password) {

        try {
            attendanceCon = "jdbc:oracle:thin:@//" + ip + ":" + port + "/" + sid;
            Class.forName("oracle.jdbc.driver.OracleDriver");

            attConn = DriverManager.getConnection(attendanceCon, userName, password);
            attConn.setAutoCommit(false);

        } catch (Exception ex) {
            attConn = null;
            //System.out.println(conString+"  "+ username+"   "+ password);
            ex.printStackTrace();
            System.out.println("\n Unable to make connection to DB, Please contact Administrator ");
        }

    }

    public Connection getTeleradiologyConnection() {

        try {

            conString = "jdbc:oracle:thin:@//" + teleIp + ":" + telePort + "/" + teleSid;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            teleConn = DriverManager.getConnection(conString, username, telePassword);
            teleConn.setAutoCommit(false);

        } catch (Exception ex) {

            teleConn = null;
            System.out.println("\n Unable to connect main Server due to network problem, kindly contact Administrator");
            ex.printStackTrace();
            System.out.println("\n Unable to make connection to DB, Please contact Administrator ");
        }

        return teleConn;
    }

    public static boolean closeConnection() {
        boolean ret = true;
        try {
            if (DAO.conn != null && !(DAO.conn.isClosed())) {
                DAO.conn.close();
                DAO.conn = null;
            }
        } catch (Exception ex) {
            ret = false;
            DAO.conn = null;
            ex.printStackTrace();
        }
        return ret;
    }

    public boolean executeUpdates(Vector queries) {

        boolean ret = true;
        for (int i = 0; i < queries.size(); i++) {
            String query = (String) queries.get(i);
            if (!executeUpdate(query, false)) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public boolean executeRemoteUpdates(List queries) {

        boolean ret = true;
        for (int i = 0; i < queries.size(); i++) {
            String query = (String) queries.get(i);
            if (!executeRemoteUpdate(query, false)) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public boolean executeUpdates(List queries) {

        boolean ret = true;
        for (int i = 0; i < queries.size(); i++) {
            String query = (String) queries.get(i);
            if (!executeUpdate(query, false)) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public void retrieveFileFromBlob() {

        try {
            if (conn == null || conn.isClosed()) {
                conn = this.getConnection();
            }
            String sql = "SELECT COMPLETE_ORDER_NO, PRESCRIPTION FROM "
                    + " ORDER_MASTER "
                    + " WHERE COMPLETE_ORDER_NO = 1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                //String name = resultSet.getString(1);
                //System.out.println("Name        = " + name);
                //String description = resultSet.getString(2);
                //System.out.println("Description = " + description);
                String fileName = resultSet.getString(3);
                //System.out.println("File Name = " + fileName);
                File image = new File("D:\\LOG\\" + fileName);
                FileOutputStream fos = new FileOutputStream(image);
                byte[] buffer = new byte[256];
                InputStream is = resultSet.getBinaryStream(4);
                while (is.read(buffer) > 0) {
                    fos.write(buffer);
                }
                fos.close();
            }
            stmt.close();
            resultSet.close();
            conn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    public boolean executeRemoteUpdate(String query, boolean commit) {
        boolean flag = true;
        try {
            if (attConn == null || attConn.isClosed()) {
                return false;
            }
            if (Constants.printLog.equalsIgnoreCase("Y")) {
                System.out.println(query.trim() + ";");
            }
            try (Statement stm = attConn.createStatement()) {
                Constants.totalRowsUpdates = stm.executeUpdate(query);
                if (commit) {
                    attConn.commit();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            flag = false;
            this.rollBack();
        }
        return flag;
    }

    public boolean executeUpdate(String query, boolean commit) {
        boolean flag = true;
        try {
            if (conn == null || conn.isClosed()) {
                this.getConnection();
            }
            if (Constants.printLog.equalsIgnoreCase("Y")
                    && Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
                System.out.println(query.trim() + ";");
            }
            stmt = conn.createStatement();
            Constants.totalRowsUpdates = stmt.executeUpdate(query);
            if (commit) {
                conn.commit();
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            flag = false;
            this.rollBack();

        }
        return flag;
    }

    public boolean executeTeleUpdate(String query, boolean commit) {
        boolean flag = true;
        try {
            if (teleConn == null || teleConn.isClosed()) {
                this.getTeleradiologyConnection();
            }
            if (Constants.printLog.equalsIgnoreCase("Y")) {
                System.out.println(query.trim() + ";");
            }
            teleStmt = teleConn.createStatement();
            Constants.totalRowsUpdates = teleStmt.executeUpdate(query);
            if (commit) {
                teleConn.commit();
            }
            teleStmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            flag = false;
            this.rollBack();

        }
        return flag;
    }

    public boolean insertData(Vector vec, String[] columns) {

        boolean flag = true;
        try {

            for (int i = 0; i < vec.size(); i++) {
                String query = "INSERT INTO " + columns[0] + "(";
                for (int col = 1; col < columns.length; col++) {
                    query += columns[col] + ",";
                }
                query = query.substring(0, query.length() - 1) + ")VALUES(";
                HashMap map = (HashMap) vec.get(i);
                //JOptionPane.showMessageDialog(null,map.get(columns[1]));
                for (int col = 1; col < columns.length; col++) {

                    query += (String) map.get(columns[col]) + ",";
                    //JOptionPane.showMessageDialog(null, query);
                    //break;
                }
                query = query.substring(0, query.length() - 1) + ")";
                //System.out.println("Correct query " + query);
                flag = this.executeUpdate(query, false);
                if (!flag) {
                    return flag;
                }
            }

        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();

        }
        return flag;
    }

    public boolean commitTransaction() {

        boolean ret = true;
        try {
            this.conn.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            this.rollBack();
            ret = false;
        }
        return ret;
    }

    public boolean commitTransaction(Connection commitConnection) {

        boolean ret = true;
        try {
            commitConnection.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                commitConnection.rollback();
            } catch (Exception ex1) {
                ex.printStackTrace();
            }
            ret = false;
        }
        return ret;
    }

    public boolean commitTeleTransaction() {

        boolean ret = true;
        try {
            teleConn.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            this.teleRollBack();
            ret = false;
        }
        return ret;
    }

    public void teleRollBack() {
        try {
            teleConn.rollback();

        } catch (Exception ex) {
            System.out.println("While Roll Back");
            ex.printStackTrace();
        }
    }

    public void rollBack() {
        try {
            this.conn.rollback();

        } catch (Exception ex) {
            System.out.println("While Roll Back");
            ex.printStackTrace();
        }
    }

    public void remoteRollBack() {
        try {
            this.attConn.rollback();

        } catch (Exception ex) {
            System.out.println("While Roll Back");
            ex.printStackTrace();
        }
    }

    public boolean insertData(List vec, String[] columns) {

        boolean flag = true;
        try {

            for (int i = 0; i < vec.size(); i++) {
                String query = "INSERT INTO " + columns[0] + "(";
                for (int col = 1; col < columns.length; col++) {
                    query += columns[col] + ",";
                }
                query = query.substring(0, query.length() - 1) + ")VALUES(";
                HashMap map = (HashMap) vec.get(i);
                //JOptionPane.showMessageDialog(null,map.get(columns[1]));
                
                for (int col = 1; col < columns.length; col++) {

                    query += (String) map.get(columns[col]) + ",";
                    //JOptionPane.showMessageDialog(null, query);
                    //break;
                }
                query = query.substring(0, query.length() - 1) + ")";
//                System.out.println(query);
                flag = this.executeUpdate(query, false);
            }

        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();

        }
        return flag;
    }

    public boolean insertRemoteData(List vec, String[] columns) {

        boolean flag = true;
        try {

            for (int i = 0; i < vec.size(); i++) {
                String query = "INSERT INTO " + columns[0] + "(";
                for (int col = 1; col < columns.length; col++) {
                    query += columns[col] + ",";
                }
                query = query.substring(0, query.length() - 1) + ")VALUES(";
                HashMap map = (HashMap) vec.get(i);
                //JOptionPane.showMessageDialog(null,map.get(columns[1]));
                for (int col = 1; col < columns.length; col++) {

                    query += (String) map.get(columns[col]) + ",";
                    //JOptionPane.showMessageDialog(null, query);
                    //break;
                }
                query = query.substring(0, query.length() - 1) + ")";
                //System.out.println("Correct query " + query);
                flag = this.executeRemoteUpdate(query, false);
            }

        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();

        }
        return flag;
    }

    public Vector<HashMap> selectData(String query, String[] columns) {

        Vector<HashMap> vec = new Vector<HashMap>();
        int i = 1;
        try {
            if (DAO.conn == null || conn.isClosed()) {
                this.getConnection();

            }
            stmt = conn.createStatement();

            if (Constants.printLog.equalsIgnoreCase("Y")
                    && Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
                System.out.println(query.trim() + ";");
            }
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                HashMap hashRow = new HashMap();
                for (; i < columns.length; i++) {
                    // System.out.println(columns[i] + " = " + rs.getString(columns[i]));
                    hashRow.put(columns[i], rs.getString(columns[i]));
                }
                i = 1;
                vec.add(hashRow);
            }
            rs.close();
            stmt.close();
            //conn.close();
        } catch (Exception ex) {
            System.out.println("columns[i] = " + columns[i]);
            //DAO.conn = null;
            if (Constants.printLog.equalsIgnoreCase("Y")) {
                ex.printStackTrace();
            }
        }
        return vec;
    }

    public Vector<HashMap> selectRemoteData(String query, String[] columns) {

        Vector<HashMap> vec = new Vector<HashMap>();
        int i = 1;
        try {
            Statement stm = attConn.createStatement();

            if (Constants.printLog.equalsIgnoreCase("Y")
                    && Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
                System.out.println(query.trim() + ";");
            }
            ResultSet rst = stm.executeQuery(query);
            while (rst.next()) {
                HashMap hashRow = new HashMap();
                for (; i < columns.length; i++) {
                    // System.out.println(columns[i] + " = " + rs.getString(columns[i]));
                    hashRow.put(columns[i], rst.getString(columns[i]));
                }
                i = 1;
                vec.add(hashRow);
            }
            rst.close();
            stm.close();
            //conn.close();
        } catch (Exception ex) {
            System.out.println("columns[i] = " + columns[i]);
            //DAO.conn = null;
            ex.printStackTrace();
        }
        return vec;
    }

    public List<HashMap> selectDatainList(String query, String[] columns) {

        List<HashMap> vec = new ArrayList<HashMap>();
        int i = 1;
        try {
            if (conn == null || conn.isClosed()) {
                this.getConnection();
            }
            stmt = conn.createStatement();
            if (Constants.printLog.equalsIgnoreCase("Y")
                    && Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
                System.out.println(query.trim() + ";");
            }

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                HashMap hashRow = new HashMap();
                for (; i < columns.length; i++) {
//                    System.out.println(columns[i] + " = " + rs.getString(columns[i]));
                    hashRow.put(columns[i], rs.getString(columns[i]));
                }
                i = 1;
                vec.add(hashRow);
            }
            rs.close();
            stmt.close();
            //conn.close();
        } catch (Exception ex) {
            System.out.println("columns[i] = " + columns[i]);
            DAO.conn = null;
            ex.printStackTrace();
        }
        return vec;
    }

    public List<HashMap> selectTeleradiologyDatainList(String query, String[] columns) {

        List<HashMap> vec = new ArrayList<HashMap>();
        int i = 1;
        try {
            if (DAO.teleConn == null || DAO.teleConn.isClosed()) {
                this.getTeleradiologyConnection();
            }
            teleStmt = teleConn.createStatement();
            if (Constants.printLog.equalsIgnoreCase("Y")) {
                System.out.println(query.trim() + ";");
            }

            teleRs = teleStmt.executeQuery(query);
            while (teleRs.next()) {
                HashMap hashRow = new HashMap();
                for (; i < columns.length; i++) {
                    // System.out.println(columns[i] + " = " + rs.getString(columns[i]));
                    hashRow.put(columns[i], teleRs.getString(columns[i]));
                }
                i = 1;
                vec.add(hashRow);
            }
            teleRs.close();
            teleStmt.close();
            //conn.close();
        } catch (Exception ex) {
            System.out.println("columns[i] = " + columns[i]);
            DAO.teleConn = null;
            ex.printStackTrace();
        }
        return vec;
    }

    public void insertHMSClob() {

        try {
            if (conn.isClosed() || conn == null) {

                this.getConnection();
            }
            String query = "";

            //"INSERT INTO " + Database.RISHMS.HMSStudyReport + " (ID , REPORT_ID , REPORT , )";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 5);
            pstmt.setString(2, "Das");
            StringBuffer sb = new StringBuffer(400000);
            sb.append("This is the Example of CLOB ..");
            String clobValue = sb.toString();

            pstmt.setString(3, clobValue);
            int i = pstmt.executeUpdate();
            System.out.println("Done Inserted");
            pstmt.close();
            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float selectDataSize(String query) {
        float size = 0f;
        try {
            if (conn == null) {
                this.getConnection();
            }
            if (Constants.printLog.equalsIgnoreCase("Y")) {
                System.out.println(query.trim() + ";");
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                size = rs.getInt("DATA_SIZE");
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return size;
    }

    public boolean updateData(Vector vec, String[] columns) {

        boolean flag = true;
        try {
            for (int i = 0; i < vec.size(); i++) {
                HashMap map = (HashMap) vec.get(i);
                String query = "UPDATE " + columns[0] + " SET ";

                for (int col = 2; col < columns.length; col++) {
                    query += columns[col] + " = " + (String) map.get(columns[col]) + ",";
                }
                query = query.substring(0, query.length() - 1);
                query += " WHERE " + columns[1] + " = " + (String) map.get(columns[1]);
                //JOptionPane.showMessageDialog(null,map.get(columns[1]));
                System.out.println("Correct query " + query);
                flag = this.executeUpdate(query, false);
            }
        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();
        }
        return flag;
    }

    public boolean updateData(List vec, String[] columns) {

        boolean flag = true;
        try {
            for (int i = 0; i < vec.size(); i++) {
                HashMap map = (HashMap) vec.get(i);
                String query = "UPDATE " + columns[0] + " SET ";

                for (int col = 2; col < columns.length; col++) {
                    query += columns[col] + " = " + (String) map.get(columns[col]) + ",";
                }
                query = query.substring(0, query.length() - 1);
                query += " WHERE " + columns[1] + " = " + (String) map.get(columns[1]);
                //JOptionPane.showMessageDialog(null,map.get(columns[1]));
                //System.out.println("Correct query " + query);
                flag = this.executeUpdate(query, false);
            }
        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();
        }
        return flag;
    }

    public List<HashMap> selectDatainListBLOB(String query, String[] columns) {

        List<HashMap> vec = new ArrayList<HashMap>();
        int i = 1;
        try {
            if (conn == null || conn.isClosed()) {
                this.getConnection();
            }
            stmt = conn.createStatement();
            if (Constants.printLog.equalsIgnoreCase("Y")) {
                System.out.println(query.trim() + ";");
            }

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                HashMap hashRow = new HashMap();
                for (; i < columns.length; i++) {
                    if (columns[i].equals("EMP_FILE")) {
                        hashRow.put(columns[i], rs.getBlob(columns[i]));
                    } else {
                        // System.out.println(columns[i] + " = " + rs.getString(columns[i]));
                        hashRow.put(columns[i], rs.getString(columns[i]));
                    }
                }
                i = 1;
                vec.add(hashRow);
            }
            rs.close();
            stmt.close();
            //conn.close();
        } catch (Exception ex) {
            System.out.println("columns[i] = " + columns[i]);
            DAO.conn = null;
            ex.printStackTrace();
        }
        return vec;
    }

    public void checkLastQueryTime() {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YY HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
    }

    public boolean checkUserSessionStatus() {

        String colums[] = {"-", "ACTIVE"};
        String query = " SELECT  ACTIVE FROM   \n"
                + Database.DCMS.userSession + "    USR    \n"
                + " WHERE UPPER(ID) ='" + Constants.sessionId + "'\n"
                + " AND ACTIVE = 'Y' \n";

        return Constants.dao.selectData(query, colums).isEmpty();
    }

    public boolean closeSession() {

        boolean ret = false;
        String update = " UPDATE " + Database.DCMS.userSession
                + " SET  CLOSE_DATE  = SYSDATE  \n"
                + " WHERE ID  = '" + Constants.sessionId + "' \n";
        if (Constants.dao.executeUpdate(update, ret)) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}

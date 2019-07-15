package utilities;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExportToExcel {

    public boolean exportImagingSearchData(String query) {

        boolean ret = false;
        try {

            Constants.dao.getConnection();
            Statement stmt = DAO.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetToExcel resultSetToExcel
                    = new ResultSetToExcel(rs,
                            new ResultSetToExcel.FormatType[]{
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT
                            }, "Search Data Results");

            String excelFile = "D:\\" + Constants.userId + "SearchResultData.xls";
            new File(excelFile).delete();
            resultSetToExcel.generate(new File(excelFile));
            ret = true;
        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }

    public boolean exportResidentReportingData(String query) {

        boolean ret = true;
        try {
            Constants.dao.getConnection();
            Statement stmt = DAO.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetToExcel resultSetToExcel
                    = new ResultSetToExcel(rs,
                            new ResultSetToExcel.FormatType[]{
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT},
                            "Reporting List");
            String excelFile = "D:\\" + Constants.userId + "ReportingList.xls";
            new File(excelFile).delete();
            resultSetToExcel.generate(new File(excelFile));

        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }

    public boolean exportPerformingPhysicianShareData(String query) {

        boolean ret = false;
        try {

            Constants.dao.getConnection();
            Statement stmt = DAO.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetToExcel resultSetToExcel
                    = new ResultSetToExcel(rs,
                            new ResultSetToExcel.FormatType[]{
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT
                            }, "Search Data Results");

            String excelFile = System.getProperty("user.home") + "\\Desktop\\performingPhysicianShare.xls";
            new File(excelFile).delete();
            resultSetToExcel.generate(new File(excelFile));
            ret = true;
        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }

    public boolean exportHrReportingData(String query) {

        boolean ret = true;
        try {
            Constants.dao.getConnection();
            Statement stmt = DAO.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetToExcel resultSetToExcel
                    = new ResultSetToExcel(rs,
                            new ResultSetToExcel.FormatType[]{
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT,
                                ResultSetToExcel.FormatType.TEXT},
                            "Reporting List");
            String excelFile = "D:\\" + Constants.userId + "ReportingList.xls";
            new File(excelFile).delete();
            resultSetToExcel.generate(new File(excelFile));

        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }

}

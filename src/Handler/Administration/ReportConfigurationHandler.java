/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.ReportConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Status;

/**
 *
 * @author Danish
 */
public class ReportConfigurationHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public List<ReportConfiguration> selectReport(String reportId, String path) {

        String[] columns = {"-", "ID", "DESCRIPTION", "REPORT_SERVER",
            "REPORT_PATH", "ACTIVE", "REPORT_NAME",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query = "SELECT                                               \n"
                + "AP.ID                         ID,                         \n"
                + "AP.DESCRIPTION                DESCRIPTION,                \n"
                + "AP.REPORT_SERVER              REPORT_SERVER,              \n"
                + "AP.REPORT_PATH                REPORT_PATH,                \n"
                + "AP.ACTIVE                     ACTIVE,                     \n"
                + "AP.REPORT_NAME                REPORT_NAME,                \n"
                //           + "AP.POSITION                   POSITION,                   \n"
                //           + "NVL(AP.REPORT_TYPE,' ')       REPORT_TYPE,                \n"
                + "AP.CRTD_BY                    CRTD_BY,                    \n"
                + "TO_CHAR(AP.CRTD_DATE, 'DD-MON-YY')    CRTD_DATE,          \n"
                + "AP.CRTD_TERMINAL_ID           CRTD_TERMINAL_ID            \n"
                + "FROM " + Database.DCMS.reports + "   AP                   \n"
                + " WHERE 1 = 1                                              \n";

        if (!reportId.equalsIgnoreCase("")) {
            query += " AND AP.ID = '" + reportId + "'                        \n";
        }

        if (!path.equalsIgnoreCase("")) {
            query += " AND AP.REPORT_PATH = '\\"+path+"\\'                   \n";
        }

        List list = Constants.dao.selectData(query, columns);
        List<ReportConfiguration> lisMod = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            ReportConfiguration mod = new ReportConfiguration();
            mod.setId(map.get("ID").toString());
            mod.setReportName(map.get("DESCRIPTION").toString());
            mod.setReportServer(map.get("REPORT_SERVER").toString());
            mod.setReportPath(map.get("REPORT_PATH").toString());
            mod.setActive(map.get("ACTIVE").toString());
            mod.setReportConfig(map.get("REPORT_NAME").toString());
//          mod.setPosition(map.get("POSITION").toString());
//          mod.setReportType(map.get("REPORT_TYPE").toString());
            mod.setCrtdBy(map.get("CRTD_BY").toString());
            mod.setCrtdDate(map.get("CRTD_DATE").toString());
            mod.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisMod.add(mod);
        }
        return lisMod;
    }

    public List<ReportConfiguration> selectReportWiseParameter(String reportId) {

        String[] columns = {"-", "ID", "DESCRIPTION", "PARAMETER_ID",
            "PARAMETER_NAME"};

        String query = "SELECT                                               \n"
                + "AP.ID                        ID,                          \n"
                + "AP.DESCRIPTION               DESCRIPTION,                 \n"
                + "RWP.PARAMETER_ID             PARAMETER_ID,                \n"
                + "RP.REPORT_PARAMETER_NAME     PARAMETER_NAME               \n"
                + "FROM " + Database.DCMS.reports + "   AP,                  \n"
                + Database.DCMS.reportWiseParameter + "   RWP,               \n"
                + Database.DCMS.reportParameter + "   RP                     \n"
                + " WHERE AP.ID = RWP.REPORT_ID                              \n"
                + " AND RP.ID = RWP.PARAMETER_ID                              \n";

        if (!reportId.equalsIgnoreCase("")) {
            query += " AND AP.ID = '" + reportId + "'                        \n";
        }

        List list = Constants.dao.selectData(query, columns);
        List<ReportConfiguration> lisMod = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            ReportConfiguration mod = new ReportConfiguration();
            mod.setReportId(map.get("ID").toString());
            mod.setReportName(map.get("DESCRIPTION").toString());
            mod.setParameterId(map.get("PARAMETER_ID").toString());
            mod.setParameterName(map.get("PARAMETER_NAME").toString());
            lisMod.add(mod);
        }
        return lisMod;
    }

    public boolean insertAppReports(ReportConfiguration pat) {

        GenerateKeys Key = new GenerateKeys();

        String[] columns = {Database.DCMS.reports, "ID", "DESCRIPTION",
            "REPORT_SERVER", "REPORT_PATH", "ACTIVE", "REPORT_NAME", "POSITION",
            "REPORT_TYPE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        pat.setId(key.generatePrimaryKey(Keys.appReport,true)); //appReport DUMMY Entry
        map.put("ID", "'" + pat.getId() + "'");
        map.put("DESCRIPTION", "'" + pat.getReportName() + "'");
        map.put("REPORT_SERVER", "'" + pat.getReportServer() + "'");
        map.put("REPORT_PATH", "'\"" + pat.getReportPath() + "\'");
        map.put("ACTIVE", "'" + pat.getActive() + "'");
        map.put("REPORT_NAME", "'" + pat.getReportConfig() + "'");
        map.put("POSITION", "'" + pat.getPosition() + "'");
        map.put("REPORT_TYPE", "'" + pat.getReportType() + "'");
        map.put("CRTD_DATE", "" + Constants.today + "");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public boolean insertReportWiseParamter(ReportConfiguration pat) {

        String[] columns = {Database.DCMS.reportWiseParameter,
            "REPORT_ID", "PARAMETER_ID"};

        HashMap map = new HashMap();
        map.put("REPORT_ID", "'" + pat.getReportId() + "'");
        map.put("PARAMETER_ID", "'" + pat.getParameterId() + "'");
        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }
    
       public boolean deleteReportWiseParameter(ReportConfiguration objRv) {

        String query
                = " DELETE FROM " + Database.DCMS.reportWiseParameter + "\n  "
                + " WHERE REPORT_ID  = '" + objRv.getReportId() + "'"
                + " AND  PARAMETER_ID  = '" + objRv.getParameterId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }
    

    public boolean updateReportInfo(ReportConfiguration objRv) {

        String query
                = " UPDATE " + Database.DCMS.reports + "\n SET "
                + " DESCRIPTION = '" + objRv.getReportName() + "', "
                + " REPORT_PATH = '" + objRv.getReportPath() + "' ,"
                + " ACTIVE = '" + objRv.getActive() + "', "
                + " REPORT_NAME = '" + objRv.getReportConfig() + "' "
                + " WHERE ID  = '" + objRv.getId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }


    public static void main(String[] args) {
        
        ReportConfigurationHandler obj = new ReportConfigurationHandler();
        obj.selectReport("","OPD");
    }
}

 
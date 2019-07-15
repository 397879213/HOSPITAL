/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.ReportConfiguration;
import Handler.Administration.ReportConfigurationHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Shuja
 */
public class ReportConfigurationController {

    ReportConfigurationHandler hdlRep = new ReportConfigurationHandler();

    public List<ReportConfiguration> selectReport(String reportId, String path) {
        return hdlRep.selectReport(reportId, path);
    }

    public List<ReportConfiguration> selectReportWiseParameter(String reportId) {
        return hdlRep.selectReportWiseParameter(reportId);
    }

    public boolean insertAppReports(ReportConfiguration obj) {

        boolean ret = hdlRep.insertAppReports(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean insertReportWiseParameter(ReportConfiguration obj) {

        boolean ret = hdlRep.insertReportWiseParamter(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean deleteReportWiseParameter(ReportConfiguration obj) {

        boolean ret = true;

        if (ret) {
            ret = hdlRep.deleteReportWiseParameter(obj);
        }

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean updateReportInfo(ReportConfiguration obj) {

        boolean ret = hdlRep.updateReportInfo(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

}

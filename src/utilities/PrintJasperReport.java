package utilities;

import BO.StudyData;
import BO.Reports;
import BO.StudyInformation;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.Serializable;
import net.sf.jasperreports.engine.*;
import java.util.*;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.PrinterName;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.plot.dial.DialFrame;
import org.jfree.chart.plot.dial.DialLayerChangeListener;
import org.jfree.chart.plot.dial.DialPlot;

public class PrintJasperReport implements DialFrame, Serializable {

    private int prints = 1;
    PrintService dService = PrintServiceLookup.lookupDefaultPrintService();

    public void printLocationWiseCashDetailReport(String reportPath, String reportFile, String outReportName,
            String action, String fromDate, String toDate, String locationId, String userId) {

        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("userId", userId);
        hm.put("locationId", locationId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);

        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printLocationWiseCashSummaryReport(String reportPath, String reportFile, String outReportName,
            String action, String fromDate, String toDate, String locationId) {

        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("locationId", locationId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);

        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printBillReport(String reportPath, String reportFile, String outReportName,
            String action, String billNo, String poNo) {

        HashMap hm = new HashMap();
        hm.put("billNo", billNo);
        hm.put("poNo", poNo);
        hm.put("user", Constants.userId);
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);

        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printDonorReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId, String productTypeId) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("productTypeId", productTypeId);
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);

        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printCrossMatchReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId, String bagNo) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("bagNo", bagNo);
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printDiagnosticHistoryReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printOrderReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printProductIssueReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("user", Constants.userId);
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printImagingReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("headerFooter", "N");
        hm.put("locationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printInvoiceReport(reportFile, outReportName, action, hm);

    }

    public void printIndentClosed(String reportPath, String reportFile, String outReportName,
            String action, int reqNo) {
        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("issueRequestNo", "" + reqNo);
        hm.put("userLocationId", Constants.locationId);
        hm.put("reportTitle", "Indent Closed");
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);
    }

    /**
     * @Warning Donot Remove ,Used to Print the Report for Indent Note
     * @param reportPath Path where to find the File
     * @param reportFile
     * @param outReportName Name of the File to Display to the Users
     * @param action Action Event to be taken by Viewer
     * @param reqNo :indent No or Request No
     */
    public void printIndentNote(String reportPath, String reportFile, String outReportName,
            String action, int reqNo) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("issueRequestNo", reqNo);
        hm.put("userLocationId", Constants.locationId);
        hm.put("reportTitle", "INDENT REQUEST NOTE");
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);

    }

    /**
     * print Purchase Order
     *
     * @param reportPath
     * @param reportFile
     * @param outReportName
     * @param action
     * @param reqNo
     */
    public void printPurchaseOrder(String reportPath, String reportFile, String outReportName,
            String action, int purchaseOrderNo) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("purchase_order_no", "" + purchaseOrderNo);
        hm.put("LocationId", Constants.locationId);
//        hm.put("reportTitle", "INDENT REQUEST NOTE");
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);

    }

    /**
     * @Warning Donot Remove ,Used to Print the Report for Indent Note
     * @param reportPath Path where to find the File
     * @param reportFile
     * @param outReportName Name of the File to Display to the Users
     * @param action Action Event to be taken by Viewer
     * @param reqNo :indent No or Request No
     */
    public void printGRNNote(String reportPath, String reportFile, String outReportName,
            String action, int receiveNo) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("receive_No", receiveNo);
        hm.put("userLocationId", Constants.locationId);
        hm.put("reportTitle", "GOOD RECEIVE NOTE");
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);

    }

    public void generateGrouopWiseUserParameter(String reportPath, String reportFile,
            String outReportName, String action, String fromDate, String toDate, 
            String patientId, String groupId, String reportHeader, String userId ) {

        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("patientId", patientId);
        hm.put("groupId", groupId);
        hm.put("userId", userId);
        hm.put("reportHeader", reportHeader);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);

    }
    
    /**
     * @Warning Donot Remove ,Used to Print the Report for Indent Note
     * @param reportPath Path where to find the File
     * @param reportFile
     * @param outReportName Name of the File to Display to the Users
     * @param action Action Event to be taken by Viewer
     * @param reqNo :indent No or Request No
     */
    public void printMaterialNote(String reportPath, String reportFile, String outReportName,
            String action, int issueNo) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("issueNoteNo", issueNo);
        hm.put("userLocationId", Constants.locationId);
        hm.put("reportTitle", "ISSUE NOTE ");
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);

    }

    /**
     * @Warning Donot Remove ,Used to Print the Report for StockWiseReport
     * @param reportPath Path where to find the File
     * @param reportFile
     * @param outReportName Name of the File to Display to the Users
     * @param action Action Event to be taken by Viewer
     * @param reqNo :Store Name
     */
    public void printStockWiseReport(String reportPath, String reportFile, String outReportName,
            String action, int storeId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("storeId", storeId);
        hm.put("userLocationId", Constants.locationId);
        hm.put("reportTitle", "STORE WISE STOCK REPORT");
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);

    }

    public void printOrderReport(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId, String patientId) {

        //getCompleteOrderNo
        HashMap hm = new HashMap();
        hm.put("orderDetailId", orderDetailId);
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("patientId", patientId);
        hm.put("headerFooter", "N");
        hm.put("userId", Constants.userId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile.trim(), outReportName, action, hm);
    }//

    public void printPathologySummaryReport(String reportPath, String reportFile, String outReportName,
            String action, StudyData data) {

        //getCompleteOrderNo
        HashMap hm = new HashMap();

        hm.put("orderDetailId", data.getOrderDetailId());
        hm.put("opinion", data.getReportComments());
        hm.put("completeOrderNo", data.getCompleteOrderNo());
        hm.put("headerFooter", "N");
        hm.put("userId", Constants.userId);
        hm.put("user", Constants.userId);
        hm.put("sectionId", data.getSectionId());
        hm.put("completeOrderNumbers", data.getCompleteOrderNumbers());
        hm.put("SUBREPORT_DIR", reportPath);
        this.printInvoiceReport(reportFile.trim(), outReportName, action, hm);
    }//

    public void printCancelRequest(String reportPath, String reportFile, String outReportName,
            String action, String cancelReturnId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("cancelReturnId", cancelReturnId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printProcedureInvoice(String reportPath, String reportFile, String outReportName,
            String action, String transactionNo, String reprint, String procedureInvoice) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("invoiceNo", transactionNo);
        hm.put("invoiceItemDetailNo", procedureInvoice);
        hm.put("refundNo", transactionNo);
        hm.put("batchNo", transactionNo);
        hm.put("user", Constants.userId);
        hm.put("reprint", reprint);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printInvoice(String reportPath, String reportFile, String outReportName,
            String action, String transactionNo, String reprint) {

        if (!new File(reportFile).exists()) {
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("invoiceNo", transactionNo);
        hm.put("refundNo", transactionNo);
        hm.put("batchNo", transactionNo);
        hm.put("user", Constants.userId);
        hm.put("reprint", reprint);
        hm.put("SUBREPORT_DIR", reportPath);
        if (reprint.equalsIgnoreCase("ORIGINAL")) {
            prints = Constants.numberOfPrints;
        }
        if (Constants.messageAlert) {
            GUIUtils.displayReportMessage();
        }
        this.printInvoiceReport(reportFile, outReportName, action, hm);

    }

    public void printTeachingFile(String reportPath, String reportFile, String outReportName,
            String action, String transactionNo, String reprint) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("caseId", transactionNo);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printEyeVision(String reportPath, String reportFile, String outReportName,
            String action, String completeOrderNo, String orderDetailId, String patientId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("patientId", patientId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printPatientCard(String reportPath, String reportFile,
            String outReportName, String action, String patientId) {

        HashMap hm = new HashMap();
        hm.put("patientId", patientId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printLabel(String reportPath, String reportFile,
            String outReportName, String action,
            String completeOrderNo, String orderDetailId) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("orderDetailId", orderDetailId);
        hm.put("locationId", Constants.locationId);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printImagingHistory(String reportPath, String reportFile,
            String outReportName, String action, String completeOrderNo) {

        HashMap hm = new HashMap();
        hm.put("completeOrderNo", completeOrderNo);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printSectionWiseCashSummmary(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String locationId, String sectionId) {

        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("locationId", locationId);
        hm.put("sectionId", sectionId);
        hm.put("userId", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printInvoiceReport(reportFile, outReportName, action, hm);
    }

    public void printMonthlyAttendance(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String locationId, String employeeId) {

        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("locationId", locationId);
        hm.put("employeeId", employeeId);
        hm.put("userId", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void GenerateReportDateParameter(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String location, String department,
            String locationDescription, String referringDoctorId,
            String referringDoctorName, String userId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report Name = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        if (DAO.connReport == null) {
            Constants.dao.getReportConnection();
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("location", location);
        hm.put("locationId", location);
        hm.put("locationName", Constants.locationName);
        hm.put("logoPath", Constants.logoPath);
        hm.put("slogan", Constants.slogan);
        hm.put("department", department);
        hm.put("departmentId", Constants.userDepartmentId);
        hm.put("locationDescription", locationDescription);
        hm.put("locationName", locationDescription);
        hm.put("referringDoctorId", referringDoctorId);
        hm.put("referringDoctorName", referringDoctorName);
        hm.put("clientId", Constants.clientId);
        hm.put("clientName", Constants.clientName);
        hm.put("user", Constants.userId);
        hm.put("userId", userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printInvoiceReport(reportFile, outReportName, action, hm);
    }

    public void generatePharmacyReport(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String location, String storeId,
            String userId, String storeDescription) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report Name = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        if (DAO.connReport == null) {
            Constants.dao.getReportConnection();
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("storeId", storeId);
        hm.put("storeDescription", storeDescription);
        hm.put("reportTitle", "Daily Cash Summary");
        hm.put("userLocationId", Constants.locationId);
        hm.put("locationId", Constants.locationId);
        hm.put("locationName", Constants.locationName);
        hm.put("logoPath", Constants.logoPath);
        hm.put("slogan", Constants.slogan);
        hm.put("user", Constants.userId);
        hm.put("userId", userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printInvoiceReport(reportFile, outReportName, action, hm);
    }

    public void GeneratePathologyReport(String reportPath, String reportFile,
            String fromDate, String toDate, String statusId,
            String sectionId, String cptId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Refport File Path = " + reportFile);
            JOptionPane.showMessageDialog(null,
                    "Report is not Available in System");
            return;
        }
        if (DAO.connReport == null) {
            Constants.dao.getReportConnection();
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("location", Constants.locationId);
        hm.put("locationId", Constants.locationId);
        hm.put("sectionId", sectionId);
        hm.put("cptId", cptId);
        hm.put("statusId", statusId);
        hm.put("departmentId", Departments.pathology);
        hm.put("locationName", Constants.locationName);
        hm.put("user", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);

        this.printReport(reportFile, Constants.outReportPath + "out.pdf", "VIEW", hm);

    }

    public void generateAppointmentReports(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String clinicId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Refport File Path = " + reportFile);

            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        if (DAO.connReport == null) {
            Constants.dao.getReportConnection();
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("clinicId", clinicId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printAppointmentReview(String reportPath, String reportFile,
            String outReportName, String action, String id, String reprint) {

        if (!new File(reportFile).exists()) {
            System.out.println("Refport File Path = " + reportFile);

            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("appointmentId", id);
        hm.put("mdtReviewId", id);
        hm.put("user", Constants.userId);;
        hm.put("reprint", reprint);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printInvoiceReport(reportFile, outReportName, action, hm);
    }

    public Reports getReportPath(String reportName) {

        BO.Reports report
                = searchReportLocation(reportName);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            JOptionPane.showMessageDialog(null, "Report is not Available, Kindly Contact Administrator");

        } else if (!new File(report.getReportPath()).exists()) {
            JOptionPane.showMessageDialog(null, "Report is not Accessible, Kindly Contact Administrator");
        }
        return report;
    }

    public void printCPTList(String reportPath, String reportFile,
            String outReportName, String action, String dept, String section) {

        if (!new File(reportFile).exists()) {
            System.out.println("Refport File Path = " + reportFile);

            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        if (dept != null) {
            System.out.println("Adding Dept = " + dept);
            hm.put("departmentId", dept);
        }
        if (section != null) {
            System.out.println("Adding Section = " + section);
            hm.put("sectionId", section);
        }
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public boolean generateAdministrationReport(String reportFile,
            String outReportName, String action, HashMap hm) {

        return this.printReport(reportFile, outReportName, action, hm);
    }

    public void generateAdministrationReports(String reportPath, String reportFile,
            String outReportName, String action, String fromDate, String department,
            String toDate, String locationId, String recieveBalance, String locationName) {

        if (locationId.equalsIgnoreCase("ALL")) {
            locationId = Constants.allLocations;
            locationName = "All Locations";
        }
        System.out.println("Report Path  = " + reportFile);
        if (!new File(reportFile).exists()) {
            System.out.println("Report Path  = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("location", locationId);
        hm.put("locationId", locationId);
        hm.put("departmentId", department);
        hm.put("department", department);
        hm.put("locationName", locationName);
        hm.put("locationDescription", locationName);
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);
        hm.put("receiveBalance", Integer.parseInt(recieveBalance));
        this.printReport(reportFile, outReportName, action, hm);

    }

    public void generatePendingBalanceReport(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String locationId) {

        HashMap hm = new HashMap();
        hm.put("FromDate", fromDate);
        hm.put("ToDate", toDate);
        hm.put("locationId", locationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);

    }

    public void generateReceiveBalanceReport(String reportPath, String reportFile,
            String outReportName, String action, String fromDate,
            String toDate, String locationId) {

        HashMap hm = new HashMap();
        hm.put("FromDate", fromDate);
        hm.put("ToDate", toDate);
        hm.put("locationId", locationId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);  //        
    }

    public void printDoctorReferenceReport(String reportPath, String reportFile,
            String outReportName, String action, String fromDate, String toDate,
            String referringDoctorID, String referringDoctorName) {

        if (!new File(reportFile).exists()) {
            System.out.println("Refport File Path = " + reportFile);

            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("referringDoctorId", referringDoctorID);
        hm.put("referringDoctorName", referringDoctorName);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void imagingPendingReport(String reportPath, String reportFile,
            String outReportName, String action, String fromDate, String toDate,
            String sectionId, String departmentId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Refport File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("sectionId", sectionId);
        hm.put("departmentId", departmentId);
        hm.put("locationId", Constants.locationId);
        hm.put("userId", Constants.userId);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printAllDoctorReferenceReport(String reportPath, String reportFile, String outReportName,
            String action, String fromDate, String toDate) {

        if (!new File(reportFile).exists()) {
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        HashMap hm = new HashMap();
        hm.put("fromDate", fromDate);
        hm.put("toDate", toDate);
        hm.put("SUBREPORT_DIR", reportPath);
        this.printReport(reportFile, outReportName, action, hm);
    }

    public void printLabelReport(String reportFile, String outReportName,
            String action, HashMap hm) {

        PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
        printServiceAttributeSet.add(new PrinterName(Constants.labelPrinter, null));
        JRPrintServiceExporter exporter = new JRPrintServiceExporter();
        boolean printLabel = true;

        while (printLabel) {
            try {
                if (DAO.conn == null || DAO.conn.isClosed()) {
                    Constants.dao.getConnection();
                }
                PrinterJob job = PrinterJob.getPrinterJob();
                PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
                int selectedService = 0;
                for (int i = 0; i < services.length; i++) {
                    if (services[i].getName().equalsIgnoreCase((Constants.labelPrinter))) {
                        selectedService = i;
                    }
                }
                job.setPrintService(services[selectedService]);
                PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
                exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, services[selectedService].getAttributes());
                exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
                exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
                JasperPrint print = JasperFillManager.fillReport(reportFile, hm, DAO.conn);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                exporter.exportReport();
                //Fill the report using an empty data source
                printLabel = false;
            } catch (JRException e) {
                e.printStackTrace();
                printLabel = true;
                JOptionPane.showMessageDialog(null, "Missing Label Going to Print");
            } catch (Exception e) {
                printLabel = true;
                JOptionPane.showMessageDialog(null, "Missing Label Going to Print going to Print");
                e.printStackTrace();
            }
        }
    }

    public boolean printInvoiceReport(String reportFile, String outReportName,
            String action, HashMap hm) {

        boolean ret = true;

        if (!new File(reportFile.trim()).exists()) {
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return false;
        }
        try {
            if (DAO.conn == null || DAO.conn.isClosed()) {
                Constants.dao.getConnection();
            }
            //Fill the report using an empty data source
            JasperPrint print = JasperFillManager.fillReport(reportFile, hm, DAO.conn);
            if (action.equalsIgnoreCase(Constants.view)) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                //exporter.exportReport();
                //JasperViewer visor = new JasperViewer(print, false);
                JFrame frame = new JFrame("Report");
                JRViewer viewer = new JRViewer(print);
                ((JPanel) viewer.getComponent(0)).remove(0);
                ((JPanel) viewer.getComponent(0)).remove(0);

                frame.getContentPane().add(viewer);
                frame.pack();
                frame.setSize(1024, 850);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            } else if (action.equalsIgnoreCase(Constants.viewPrint)) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                JasperViewer visor = new JasperViewer(print, false);
                visor.setVisible(true);
            } // Create a PDF exporter
            else if (action.equalsIgnoreCase("EXPORT")) {
                JRExporter exporter;
                exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                exporter.exportReport();
            } // FOR PRINTING
            else if (action.equalsIgnoreCase(Constants.print)) {

                JasperPrintManager.printReport(print, false);
                if (prints == 2) {
                    System.out.println("gOING TO PRINT 2 INVOICES = " + reportFile);
                    JasperPrintManager.printReport(print, false);
                }
                prints = 1;
            } else if (action.equalsIgnoreCase("EXCEL")) {
                /**
                 * 3- export to Excel sheet
                 */
                JRXlsExporter exporter = new JRXlsExporter();

                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                print.setProperty("net.sf.jasperreports.export.xls.ignore.graphics", "true");
                // Export the PDF file

                exporter.exportReport();

            } else if (action.equalsIgnoreCase("BOTH")) {

                JasperViewer visor = new JasperViewer(print, false);
                visor.setVisible(true);
                JasperPrintManager.printReport(print, true);
            }

        } catch (JRException e) {
            ret = false;
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            //System.exit(1);
        } catch (Exception e) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            e.printStackTrace();
            //System.exit(1);
        }
        return ret;
    }

    public boolean printReport(String reportFile, String outReportName,
            String action, HashMap hm) {

        boolean ret = true;

        if (!new File(reportFile.trim()).exists()) {
            System.out.println("Report Name = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return false;
        }
        try {
            if (DAO.connReport == null || DAO.connReport.isClosed()) {
                Constants.dao.getReportConnection();
            }
            //Fill the report using an empty data source
            JasperPrint print = JasperFillManager.fillReport(reportFile, hm, DAO.connReport);
            if (action.equalsIgnoreCase(Constants.view)) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                //exporter.exportReport();
                //JasperViewer visor = new JasperViewer(print, false);
                JFrame frame = new JFrame("Report");
                JRViewer viewer = new JRViewer(print);
                ((JPanel) viewer.getComponent(0)).remove(0);
                ((JPanel) viewer.getComponent(0)).remove(0);

                frame.getContentPane().add(viewer);
                frame.pack();
                frame.setSize(1024, 850);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            } else if (action.equalsIgnoreCase(Constants.viewPrint)) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                JasperViewer visor = new JasperViewer(print, false);
                visor.setVisible(true);
            } // Create a PDF exporter
            else if (action.equalsIgnoreCase("EXPORT")) {
                JRExporter exporter;
                exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                exporter.exportReport();
            } // FOR PRINTING
            else if (action.equalsIgnoreCase(Constants.print)) {

                JasperPrintManager.printReport(print, false);
                if (prints == 2) {
                    System.out.println("gOING TO PRINT 2 INVOICES = " + reportFile);
                    JasperPrintManager.printReport(print, false);
                }
                prints = 1;
            } else if (action.equalsIgnoreCase("EXCEL")) {
                /**
                 * 3- export to Excel sheet
                 */
                JRXlsExporter exporter = new JRXlsExporter();

                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                print.setProperty("net.sf.jasperreports.export.xls.ignore.graphics", "true");
                // Export the PDF file

                exporter.exportReport();

            } else if (action.equalsIgnoreCase("BOTH")) {

                JasperViewer visor = new JasperViewer(print, false);
                visor.setVisible(true);
                JasperPrintManager.printReport(print, true);
            }

        } catch (JRException e) {
            ret = false;
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            //System.exit(1);
        } catch (Exception e) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            e.printStackTrace();
            //System.exit(1);
        }
        return ret;
    }

//      public boolean frameReport(String reportFile, String outReportName,
//            HashMap hm) {
//
//        boolean ret = true; 
//
//        if (!new File(reportFile.trim()).exists()) {
//            System.out.println("Report Name = " + reportFile);
//            JOptionPane.showMessageDialog(null, "Report is not available in system");
//            return false;
//        }
//        try {
//            if (DAO.connReport == null || DAO.connReport.isClosed()) {
//                Constants.dao.getReportConnection();
//            }
//            //Fill the report using an empty data source
//            JasperPrint print = JasperFillManager.fillReport(reportFile, hm, DAO.connReport);
//            JRExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
//                // Export the PDF file
//            //JasperViewer visor = new JasperViewer(print, false);
//            //JRViewer jRViewer = new JRViewer(print);
//            //jRViewer.setVisible(true);             
//            JFrame frame = new JFrame("Report");
//            JRViewer viewer = new JRViewer(print);
//            ((JPanel) viewer.getComponent(0)).remove(0);
//            ((JPanel) viewer.getComponent(0)).remove(0);
//
//            frame.getContentPane().add(viewer);
//            frame.pack();
//            frame.setSize(1024, 850);
//            frame.setLocationRelativeTo(null);
//
//            frame.setVisible(true);
//
//        } catch (JRException e) {
//            ret = false;
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
//            //System.exit(1);
//        } catch (Exception e) {
//            ret = false;
//            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
//            e.printStackTrace();
//            //System.exit(1);
//        }
//        return ret;
//    }
    public void printPACSReport(String reportPath, String reportFile,
            String outReportName, String action, StudyInformation study) {

        System.out.println("reportFile = " + reportFile);
        String conclusion = "Conclusion:";
        if (study.getConclusion().trim().length() == 0) {
            conclusion = "";
        }
        String technique = "Technique:";
        if (study.getTechnique().trim().length() == 0) {
            technique = "";
        }
        String clinicalIndication = "Clinical Indication:";
        if (study.getClinicalInformation().trim().length() == 0) {
            clinicalIndication = "";
        }
        HashMap hm = new HashMap();
        hm.put("patientId", study.getPatientId());
        hm.put("modality", study.getModality());
        hm.put("accessionNo", study.getAccessionNo());
        hm.put("conclusion", conclusion);
        hm.put("technique", technique);
        hm.put("clinicalIndication", clinicalIndication);
        hm.put("SUBREPORT_DIR", reportPath);
        if (!new File(reportFile).exists()) {
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        if (Constants.dao.conn == null) {
            Constants.dao.getReportConnection();
        }

        try {
            JasperPrint print = JasperFillManager.fillReport(reportFile, hm, Constants.dao.conn);
            if (action.equalsIgnoreCase("VIEW")) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                //exporter.exportReport();
                JasperViewer visor = new JasperViewer(print, false);
                visor.setVisible(true);
            }
            // Create a PDF exporter
            if (action.equalsIgnoreCase("EXPORT")) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                exporter.exportReport();
            }
            // FOR PRINTING
            if (action.equalsIgnoreCase("PRINT")) {
                JasperPrintManager.printReport(print, true);
            }
        } catch (JRException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            //System.exit(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            e.printStackTrace();
            //System.exit(1);
        }
    }

    public void printQueryReport(String reportFile, String outReportName,
            String action, HashMap hm, String query) {

        if (!new File(reportFile.trim()).exists()) {
            System.out.println("Report Name = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }
        try {
            if (DAO.connReport == null || DAO.connReport.isClosed()) {
                Constants.dao.getReportConnection();
            }
            //Fill the report using an empty data source
            query = "SELECT CPT_ID ,\n"
                    + "CPT.DESCRIPTION DESCRIPTION,\n"
                    + "COST PRICE,\n"
                    + "DEPT.DESCRIPTION DEPARTMENT,\n"
                    + "SECTION_ID SECTION\n"
                    + "FROM CPT   CPT  ,\n"
                    + "DEFINITION_TYPE_DETAIL DEPT\n"
                    + "\n"
                    + " WHERE CPT.ACTIVE = 'Y'\n"
                    + "AND CPT.DEPARTMENT_ID = DEPT.ID\n"
                    + "AND DEPARTMENT_ID = 128 "
                    + "ORDER BY SECTION_ID";
            JasperDesign jd = JRXmlLoader.load(reportFile);
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(query);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint print = JasperFillManager.fillReport(jr, hm, DAO.connReport);
            if (action.equalsIgnoreCase("VIEW")) {
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outReportName);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                // Export the PDF file
                //exporter.exportReport();
                JasperViewer visor = new JasperViewer(print, false);
                visor.setVisible(true);
            }
        } catch (JRException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            //System.exit(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to Display Report Kindly Contact Administrator");
            e.printStackTrace();
            //System.exit(1);
        }
    }

    public void printBillStatusReport(String reportPath, String reportFile, String outReportName,
            String action, String orderStatusId) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("orderStatusId", "" + orderStatusId);
        hm.put("locationId", Constants.locationId);
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);
        this.printReport(reportFile, outReportName, action, hm);

    }

    public static void main(String[] args) {

        PrintJasperReport report = new PrintJasperReport();
        HashMap map = new HashMap();
        map.put("departmentId", "127");
        map.put("user", Constants.systemAdministrator);
        map.put("locationId", "001");
        report.printQueryReport("D:\\SYSREP\\REPORTS\\ADMINISTRATION\\ALL_CPT_LIST.JRXML",
                "D:\\AZN\\PATHOLOGY\\54.pdf", "VIEW", map, "QUERY");

    }

    @Override
    public Shape getWindow(Rectangle2D rd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addChangeListener(DialLayerChangeListener dl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeChangeListener(DialLayerChangeListener dl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasListener(EventListener el) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isClippedToWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics2D gd, DialPlot dp, Rectangle2D rd, Rectangle2D rd1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reports searchReportLocation(String reportName) {

        String c[] = {"-", "PATH", "REPORT_NAME"};
        String query
                = "  SELECT  REPORT_SERVER||REPORT_PATH PATH , "
                + " REPORT_NAME REPORT_NAME FROM \n "
                + Database.DCMS.applicationReports + "\n"
                + " WHERE UPPER(ID) = UPPER('" + reportName + "') \n";

        List vec = Constants.dao.selectDatainList(query, c);
        Reports report = new Reports();

        if (vec.isEmpty()) {
            return report;
        }
        HashMap map = (HashMap) vec.get(0);

        report.setReportPath(map.get("PATH").toString());
        report.setReportName(map.get("REPORT_NAME").toString());
        report.setReportFilePath(report.getReportPath() + report.getReportName());

        return report;
    }

    public void printDispensedReport(String reportPath, String reportFile, String outReportName,
            String action, int dispenseNo) {

        if (!new File(reportFile).exists()) {
            System.out.println("Report File Path = " + reportFile);
            JOptionPane.showMessageDialog(null, "Report is not available in system");
            return;
        }

        HashMap hm = new HashMap();
        hm.put("dispenseNo", dispenseNo);
        hm.put("locationId", Constants.locationId);
        hm.put("SUBREPORT_DIR", reportPath);
        hm.put("user", Constants.userId);

        this.printReport(reportFile, outReportName, action, hm);

    }

}

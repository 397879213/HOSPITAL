/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development.Handler;

import Development.BO.DailyCashSummary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class DailyCashSummaryHandler {

    public List<DailyCashSummary> getInvoiceDetail(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "DESCRIPTION", "INVOICE_NO",
            "NET_DISCOUNT", "PRICE", "SUPPORT", "PAYABLE_AMOUNT", "ADVANCE_ADJUSTED",
            "RECEIVED_AMOUNT", "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT SUBSTR(IVM.PATIENT_ID,4)  PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "CPT.DESCRIPTION                       DESCRIPTION,\n"
                + "SUBSTR(IVM.INVOICE_NO,4)              INVOICE_NO,\n"
                + "(IVD.PRICE - IVD.PAYABLE_AMOUNT)      NET_DISCOUNT,\n"
                + "NVL(IVD.PRICE,'0')                    PRICE,\n"
                + "NVL(IVD.FINANCIAL_SUPPORT,'0')         SUPPORT,\n"
                + "NVL(IVD.PAYABLE_AMOUNT,'0')           PAYABLE_AMOUNT,\n"
                + "NVL(IVD.ADVANCE_ADJUSTED,'0')          ADVANCE_ADJUSTED,\n"
                + "NVL(IVD.INVOICE_CASH,'0')             RECEIVED_AMOUNT,\n"
                + "IVM.INVOICE_BY                        INVOICE_BY,\n"
                + "IVM.INVOICE_DATE                      INVOICE_DATE\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.invoiceDetail + "         IVD , \n"
                + Database.DCMS.CPT + "                   CPT ,\n"
                + Database.DCMS.patient + "               PAT \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVM.INVOICE_BY = NVL('" + dcsBO.getUserId() + "' , IVM.INVOICE_BY)\n";

        if (dcsBO.getPatientId().length() != 0) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }
        
        if (dcsBO.getFromDate().length() != 0 && dcsBO.getToDate().length() != 0) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        
        if (dcsBO.getPatFullName().length() != 0) {
            query += " AND UPPER(PAT.FULL_NAME) LIKE '%" + dcsBO.getPatFullName().toUpperCase() + "%'                  \n";
        }

        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVD.INVOICE_NO = IVM.INVOICE_NO\n"
                + "AND IVD.CPT_ID = CPT.CPT_ID\n"
                //+ "AND IVD.INVOICE_CASH > 0\n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "ORDER BY IVM.INVOICE_DATE,  IVD.SECTION_ID";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();
        int totalPayable = 0;

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setDescription(map.get("DESCRIPTION").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setSupport(map.get("NET_DISCOUNT").toString());
            objBo.setPrice(map.get("PRICE").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());

            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> getInvoiceMaster(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "INVOICE_NO", "TOTAL_AMOUNT",
            "NET_DISCOUNT", "PAYABLE_AMOUNT", "SUPPORT", "RECEIVED_AMOUNT", "ADVANCE_ADJUSTED",
            "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT SUBSTR(IVM.PATIENT_ID,4)  PATIENT_ID,            \n"
                + "PAT.FULL_NAME                         FULL_NAME,             \n"
                + "SUBSTR(IVM.INVOICE_NO,4)              INVOICE_NO,            \n"
                + "IVM.TOTAL_AMOUNT                      TOTAL_AMOUNT,          \n"
                + "IVM.NET_DISCOUNT                      NET_DISCOUNT,          \n"
                + "IVM.PAYABLE_AMOUNT                    PAYABLE_AMOUNT,        \n"
                + "IVM.FINANCIAL_SUPPORT                 SUPPORT,               \n"
                + "IVM.RECEIVED_AMOUNT                   RECEIVED_AMOUNT,       \n"
                + "IVM.ADVANCE_ADJUSTED                  ADVANCE_ADJUSTED,      \n"
                + "IVM.INVOICE_BY                        INVOICE_BY,            \n"
                + "IVM.INVOICE_DATE                      INVOICE_DATE           \n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM,              \n"
                + Database.DCMS.patient + "               PAT                   \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVM.INVOICE_BY = NVL('" + dcsBO.getUserId() + "' , IVM.INVOICE_BY)\n";

        if (dcsBO.getPatientId().length() != 0) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'       \n";
        }

        if (dcsBO.getFromDate().length() != 0 && dcsBO.getToDate().length() != 0) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        
        if (dcsBO.getPatFullName().length() != 0) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'\n";
        }

        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "ORDER BY IVM.INVOICE_DATE";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setSupport(map.get("SUPPORT").toString());
            objBo.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());
            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> getRefundDetail(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "DESCRIPTION", "REFUND_NO",
            "DISCOUNT", "REFUND_AMOUNT", "FINANCIAL_SUPPORT", "PRICE", "CASH_REFUND", "INVOICE_ADJUSTED",
            "LEDGER_ADJUSTED", "REFUND_BY", "REFUND_DATE"};

        String query = "SELECT  SUBSTR(RFM.PATIENT_ID,4) PATIENT_ID,            \n"
                + "PAT.FULL_NAME                         FULL_NAME,             \n"
                + "CPT.DESCRIPTION                       DESCRIPTION,           \n"
                + "RFM.INVOICE_NO                        REFUND_NO,             \n"
                + "(IVD.PRICE -IVD.PAYABLE_AMOUNT)       DISCOUNT,              \n"
                + "RFD.REFUND_AMOUNT                     REFUND_AMOUNT,         \n"
                + "RFD.FINANCIAL_SUPPORT                 FINANCIAL_SUPPORT,     \n"
                + "IVD.PRICE                             PRICE,                 \n"
                + "RFD.CASH_REFUND                       CASH_REFUND,           \n"
                + "RFD.INVOICE_BALANCE_ADJUSTED          INVOICE_ADJUSTED,      \n"
                + "RFD.LEDGER_BALANCE_ADJUSTED           LEDGER_ADJUSTED,       \n"
                + "RFM.REFUND_BY                         REFUND_BY,             \n"
                + "TO_CHAR(RFM.REFUND_DATE, 'DD-MON-YY HH12:MI AM')REFUND_DATE  \n"
                + " FROM " + Database.DCMS.refundMaster + "RFM ,                \n"
                + Database.DCMS.invoiceDetail + "         IVD ,                 \n"
                + Database.DCMS.CPT + "                   CPT ,                 \n"
                + Database.DCMS.patient + "               PAT ,                 \n"
                + Database.DCMS.refundDetail + "          RFD ,                 \n"
                + Database.DCMS.orderDetail + "           ODD                   \n"
                + "WHERE   RFM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',RFM.LOCATION_ID)\n"
                + "AND RFM.REFUND_BY = NVL('" + dcsBO.getUserId() + "' , RFM.REFUND_BY) \n";

        if (dcsBO.getPatientId().length() != 0) {
            query += " AND RFM.PATIENT_ID ='" + dcsBO.getPatientId() + "'       \n";
        }

        if (dcsBO.getPatFullName().length() != 0) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'\n";
        }

        if (dcsBO.getFromDate().length() != 0 && dcsBO.getToDate().length() != 0) {
            query += "AND RFD.REFUND_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        
        query += "AND RFM.PATIENT_ID = PAT.PATIENT_ID                           \n"
                + "AND RFM.REFUND_NO = RFD.REFUND_NO                            \n"
                + "AND RFM.INVOICE_NO        = IVD.INVOICE_NO                   \n"
                + "AND RFD.COMPLETE_ORDER_NO = IVD.COMPLETE_ORDER_NO            \n"
                + "AND RFD.ORDER_DETAIL_ID   = IVD.ORDER_DETAIL_ID              \n"
                + "AND RFD.COMPLETE_ORDER_NO = ODD.COMPLETE_ORDER_NO            \n"
                + "AND RFD.ORDER_DETAIL_ID   = ODD.ORDER_DETAIL_ID              \n"
                + "AND IVD.COMPLETE_ORDER_NO = ODD.COMPLETE_ORDER_NO            \n"
                + "AND IVD.ORDER_DETAIL_ID   = ODD.ORDER_DETAIL_ID              \n"
                + "AND ODD.CPT_ID            = CPT.CPT_ID                       \n";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setDescription(map.get("DESCRIPTION").toString());
            objBo.setRefundNo(map.get("REFUND_NO").toString());
            objBo.setNetDiscount(map.get("DISCOUNT").toString());
            objBo.setPrice(map.get("PRICE").toString());
            objBo.setSupport(map.get("FINANCIAL_SUPPORT").toString());
            objBo.setRefundAmount(map.get("REFUND_AMOUNT").toString());
            objBo.setCashRefund(map.get("CASH_REFUND").toString());
            objBo.setInvoiceAdjusted(map.get("INVOICE_ADJUSTED").toString());
            objBo.setLedgerAdjusted(map.get("LEDGER_ADJUSTED").toString());
            objBo.setRefundBy(map.get("REFUND_BY").toString());
            objBo.setRefundDate(map.get("REFUND_DATE").toString());
            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> getRefundMaster(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "REFUND_NO", "REFUND_AMOUNT",
            "NET_DISCOUNT", "CASH_REFUND", "SUPPORT", "INVOICE_ADJUSTED", "LEDGER_ADJUSTED",
            "REFUND_BY", "REFUND_DATE"};

        String query = "SELECT SUBSTR(RFM.PATIENT_ID,4)      PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "SUBSTR(RFM.INVOICE_NO,4)              REFUND_NO,\n"
                + "RFM.REFUND_AMOUNT                     REFUND_AMOUNT,\n"
                + "RFM.DISCOUNT                          NET_DISCOUNT,\n"
                + "RFM.CASH_REFUND                       CASH_REFUND,\n"
                + "RFM.FINANCIAL_SUPPORT                 SUPPORT,     \n"
                + "RFM.INVOICE_BALANCE_ADJUSTED          INVOICE_ADJUSTED,\n"
                + "RFM.LEDGER_BALANCE_ADJUSTMENT           LEDGER_ADJUSTED,\n"
                + "RFM.REFUND_BY                         REFUND_BY,\n"
                + "RFM.REFUND_DATE                       REFUND_DATE\n"
                + " FROM " + Database.DCMS.refundMaster + "  RFM, \n"
                + Database.DCMS.patient + "               PAT \n"
                + "WHERE RFM.LOCATION_ID =   NVL('" + dcsBO.getLocationId()
                + "',RFM.LOCATION_ID)\n"
                + "AND RFM.REFUND_BY = NVL('" + dcsBO.getUserId() + "' , RFM.REFUND_BY) \n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND RFM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                  \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND RFM.REFUND_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        query += "AND RFM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND RFM.STATUS_ID='14' \n"
                + "ORDER BY RFM.REFUND_DATE";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setRefundNo(map.get("REFUND_NO").toString());
            objBo.setRefundAmount(map.get("REFUND_AMOUNT").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setCashRefund(map.get("CASH_REFUND").toString());
            objBo.setSupport(map.get("SUPPORT").toString());
            objBo.setInvoiceAdjusted(map.get("INVOICE_ADJUSTED").toString());
            objBo.setLedgerAdjusted(map.get("LEDGER_ADJUSTED").toString());
            objBo.setRefundBy(map.get("REFUND_BY").toString());
            objBo.setRefundDate(map.get("REFUND_DATE").toString());
            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> advanceRecHis(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "ACCOUNT", "TRANSACTION_NO",
            "AMOUNT", "RECEIVE_DATE", "COMMENTS", "RECIEVED_BY"};

        String query = "SELECT SUBSTR(ARH.PATIENT_ID , 4)              PATIENT_ID,                     \n"
                + "PAT.FULL_NAME                                       FULL_NAME,                      \n"
                + "ACT.DESCRIPTION                                     ACCOUNT,                        \n"
                + " ARH.VOUCHER_NO                                     TRANSACTION_NO,                 \n"
                + "ARH.AMOUNT                                          AMOUNT,                         \n"
                + "TO_CHAR (ARH.CRTD_DATE, 'DD-MON-YY HH12:MI AM')     RECEIVE_DATE,                   \n"
                + "ARH.COMMENTS                                        COMMENTS,                       \n"
                + "USR.NAME                                            RECIEVED_BY                     \n"
                + " FROM " + Database.DCMS.advanceReceiveHistory + "   ARH,                            \n"
                + Database.DCMS.patient + "                          PAT,                             \n"
                + Database.DCMS.definitionTypeDetail + "             ACT,                             \n"
                + Database.DCMS.users + "                            USR                             \n"
                + "WHERE ARH.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',ARH.LOCATION_ID)      \n"
                + "AND  ARH.CRTD_BY = NVL('" + dcsBO.getUserId() + "' ,  ARH.CRTD_BY)                  \n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND ARH.PATIENT_ID ='" + dcsBO.getPatientId() + "'                               \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                         \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND ARH.CRTD_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , 'DD-MON-YY HH24:MI:SS' ) \n"
                    + "  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        query += "AND ARH.PATIENT_ID = PAT.PATIENT_ID                                            \n"
                + "AND USR.USER_NAME = ARH.CRTD_BY                                                       \n"
                + "AND ARH.TRANSACTION_TYPE = '61'                                                       \n"
                + "AND ARH.ACCOUNT = ACT.ID                                                              \n"
                + "ORDER BY ARH.CRTD_DATE";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setAccount(map.get("ACCOUNT").toString());
            objBo.setTransactionNo(map.get("TRANSACTION_NO").toString());
            objBo.setAmount(map.get("AMOUNT").toString());
            objBo.setRecieveDate(map.get("RECEIVE_DATE").toString());
            objBo.setComments(map.get("COMMENTS").toString());
            objBo.setUserId(map.get("RECIEVED_BY").toString());
            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> balanceRecHis(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "INVOICE_NO", "RECEIVED_BY",
            "RECEIVING_DATE", "RECEIVED_AMOUNT", "PAYABLE_AMOUNT", "BALANCE_AMOUNT"};

        String query = " SELECT SUBSTR(DCS.PATIENT_ID,4) PATIENT_ID,   \n"
                + "PAT.FULL_NAME                    FULL_NAME,         \n"
                + "IVM.INVOICE_NO                   INVOICE_NO,        \n"
                + "DCS.USER_ID                      RECEIVED_BY,       \n"
                + "DCS.RECEIVING_DATE               RECEIVING_DATE,    \n"
                + "DCS.RECEIVED_AMOUNT              RECEIVED_AMOUNT,   \n"
                + "IVM.PAYABLE_AMOUNT               PAYABLE_AMOUNT,    \n"
                + "(IVM.PAYABLE_AMOUNT-DCS.RECEIVED_AMOUNT) BALANCE_AMOUNT \n"
                + " FROM " + Database.DCMS.receivedBalanceHistory + "   DCS,                               \n"
                + Database.DCMS.patient + "                          PAT,                                  \n"
                + Database.DCMS.invoiceMaster + "             IVM                                                              \n"
                + "WHERE DCS.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',DCS.LOCATION_ID)                                \n"
                + "AND  DCS.USER_ID = NVL('" + dcsBO.getUserId() + "' ,  DCS.USER_ID )                                           \n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND DCS.PATIENT_ID ='" + dcsBO.getPatientId() + "'                                                         \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                                                  \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND DCS.RECEIVING_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , 'DD-MON-YY HH24:MI:SS' )  \n"
                    + "  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS')                                          \n";
        }
        query += "AND DCS.PATIENT_ID = PAT.PATIENT_ID                                                                    \n"
                + "AND IVM.COMPLETE_ORDER_NO = DCS.COMPLETE_ORDER_NO                                                             \n"
                + "AND IVM.INVOICE_NO = DCS.INVOICE_NO";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setUserId(map.get("RECEIVED_BY").toString());
            objBo.setRecieveDate(map.get("RECEIVING_DATE").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setBalanceAmount(map.get("BALANCE_AMOUNT").toString());
            lisins.add(objBo);
        }
        return lisins;

    }

    public List<DailyCashSummary> getInvoiceDetailClient(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "DESCRIPTION", "CLIENT_NAME", "INVOICE_NO",
            "NET_DISCOUNT", "PRICE", "SUPPORT", "PAYABLE_AMOUNT", "ADVANCE_ADJUSTED", "RECEIVED_AMOUNT", "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT SUBSTR(IVM.PATIENT_ID,4)  PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "CPT.DESCRIPTION                       DESCRIPTION,\n"
                + "CL.DESCRIPTION                       CLIENT_NAME,\n"
                + "SUBSTR(IVM.INVOICE_NO,4)              INVOICE_NO,\n"
                + "(IVD.PRICE - IVD.PAYABLE_AMOUNT)      NET_DISCOUNT,\n"
                + "IVD.PRICE                             PRICE,\n"
                + "IVD.FINANCIAL_SUPPORT                  SUPPORT,\n"
                + "IVD.PAYABLE_AMOUNT                    PAYABLE_AMOUNT,\n"
                + "IVD.ADVANCE_ADJUSTED                   ADVANCE_ADJUSTED,\n"
                + "IVD.INVOICE_CASH                      RECEIVED_AMOUNT,\n"
                + "IVM.INVOICE_BY                        INVOICE_BY,\n"
                + "IVM.INVOICE_DATE                      INVOICE_DATE\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.invoiceDetail + "         IVD , \n"
                + Database.DCMS.client + "         CL , \n"
                + Database.DCMS.CPT + "                   CPT ,\n"
                + Database.DCMS.patient + "               PAT \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVM.INVOICE_BY = NVL('" + dcsBO.getUserId() + "' , IVM.INVOICE_BY)\n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                  \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }

        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVD.INVOICE_NO = IVM.INVOICE_NO\n"
                + "AND IVD.CPT_ID = CPT.CPT_ID\n"
                //+ "AND IVD.INVOICE_CASH > 0\n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "AND IVM.PAYMENT_MODE_ID = '62' \n"
                + "AND IVM.CLIENT_ID = CL.ID \n"
                + "ORDER BY IVM.INVOICE_DATE,  IVD.SECTION_ID";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();
        int totalPayable = 0;

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setDescription(map.get("DESCRIPTION").toString());
            objBo.setClientName(map.get("CLIENT_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setSupport(map.get("NET_DISCOUNT").toString());
            objBo.setPrice(map.get("PRICE").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());

            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> getInvoiceMasterClient(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "CLIENT_NAME", "INVOICE_NO", "TOTAL_AMOUNT",
            "NET_DISCOUNT", "PAYABLE_AMOUNT", "SUPPORT", "RECEIVED_AMOUNT", "ADVANCE_ADJUSTED",
            "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT SUBSTR(IVM.PATIENT_ID,4)  PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "CL.DESCRIPTION                       CLIENT_NAME,\n"
                + "SUBSTR(IVM.INVOICE_NO,4)              INVOICE_NO,\n"
                + "IVM.TOTAL_AMOUNT                      TOTAL_AMOUNT,\n"
                + "IVM.NET_DISCOUNT                       NET_DISCOUNT,\n"
                + "IVM.PAYABLE_AMOUNT                     PAYABLE_AMOUNT,\n"
                + "IVM.FINANCIAL_SUPPORT                   SUPPORT,     \n"
                + "IVM.RECEIVED_AMOUNT                     RECEIVED_AMOUNT,\n"
                + "IVM.ADVANCE_ADJUSTED                    ADVANCE_ADJUSTED,\n"
                + "IVM.INVOICE_BY                           INVOICE_BY,\n"
                + "IVM.INVOICE_DATE                         INVOICE_DATE\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.patient + "               PAT, \n"
                + Database.DCMS.client + "               CL \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVM.INVOICE_BY = NVL('" + dcsBO.getUserId() + "' , IVM.INVOICE_BY)\n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                  \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "AND IVM.PAYMENT_MODE_ID = '62' \n"
                + "AND IVM.CLIENT_ID = CL.ID \n"
                + "ORDER BY IVM.INVOICE_DATE";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setClientName(map.get("CLIENT_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setSupport(map.get("SUPPORT").toString());
            objBo.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());
            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> getInvoiceDetailCash(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "DESCRIPTION", "CLIENT_NAME", "INVOICE_NO",
            "NET_DISCOUNT", "PRICE", "SUPPORT", "PAYABLE_AMOUNT", "ADVANCE_ADJUSTED", "RECEIVED_AMOUNT", "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT SUBSTR(IVM.PATIENT_ID,4)  PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "CPT.DESCRIPTION                       DESCRIPTION,\n"
                + "CL.DESCRIPTION                       CLIENT_NAME,\n"
                + "SUBSTR(IVM.INVOICE_NO,4)              INVOICE_NO,\n"
                + "(IVD.PRICE - IVD.PAYABLE_AMOUNT)      NET_DISCOUNT,\n"
                + "IVD.PRICE                             PRICE,\n"
                + "IVD.FINANCIAL_SUPPORT                  SUPPORT,\n"
                + "IVD.PAYABLE_AMOUNT                    PAYABLE_AMOUNT,\n"
                + "IVD.ADVANCE_ADJUSTED                   ADVANCE_ADJUSTED,\n"
                + "IVD.INVOICE_CASH                      RECEIVED_AMOUNT,\n"
                + "IVM.INVOICE_BY                        INVOICE_BY,\n"
                + "IVM.INVOICE_DATE                      INVOICE_DATE\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.invoiceDetail + "         IVD , \n"
                + Database.DCMS.client + "         CL , \n"
                + Database.DCMS.CPT + "                   CPT ,\n"
                + Database.DCMS.patient + "               PAT \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVM.INVOICE_BY = NVL('" + dcsBO.getUserId() + "' , IVM.INVOICE_BY)\n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                  \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }

        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVD.INVOICE_NO = IVM.INVOICE_NO\n"
                + "AND IVD.CPT_ID = CPT.CPT_ID\n"
                + "AND IVD.INVOICE_CASH > 0\n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "AND IVM.PAYMENT_MODE_ID = '61' \n"
                + "AND IVM.CLIENT_ID = CL.ID \n"
                + "ORDER BY IVM.INVOICE_DATE,  IVD.SECTION_ID";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();
        int totalPayable = 0;

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setDescription(map.get("DESCRIPTION").toString());
            objBo.setClientName(map.get("CLIENT_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setSupport(map.get("NET_DISCOUNT").toString());
            objBo.setPrice(map.get("PRICE").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());

            lisins.add(objBo);
        }
        return lisins;
    }

    public List<DailyCashSummary> getInvoiceMasterCash(DailyCashSummary dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "CLIENT_NAME", "INVOICE_NO", "TOTAL_AMOUNT",
            "NET_DISCOUNT", "PAYABLE_AMOUNT", "SUPPORT", "RECEIVED_AMOUNT", "ADVANCE_ADJUSTED",
            "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT SUBSTR(IVM.PATIENT_ID,4)  PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "CL.DESCRIPTION                       CLIENT_NAME,,\n"
                + "SUBSTR(IVM.INVOICE_NO,4)              INVOICE_NO,\n"
                + "IVM.TOTAL_AMOUNT                      TOTAL_AMOUNT,\n"
                + "IVM.NET_DISCOUNT                       NET_DISCOUNT,\n"
                + "IVM.PAYABLE_AMOUNT                     PAYABLE_AMOUNT,\n"
                + "IVM.FINANCIAL_SUPPORT                   SUPPORT,     \n"
                + "IVM.RECEIVED_AMOUNT                     RECEIVED_AMOUNT,\n"
                + "IVM.ADVANCE_ADJUSTED                    ADVANCE_ADJUSTED,\n"
                + "IVM.INVOICE_BY                           INVOICE_BY,\n"
                + "IVM.INVOICE_DATE                         INVOICE_DATE\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.patient + "               PAT \n"
                + Database.DCMS.client + "               CL \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVM.INVOICE_BY = NVL('" + dcsBO.getUserId() + "' , IVM.INVOICE_BY)\n";

        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }

        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND PAT.FULL_NAME LIKE '%" + dcsBO.getPatFullName() + "%'                  \n";
        }

        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
        }
        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "AND IVM.PAYMENT_MODE_ID = '61' \n"
                + "AND IVM.CLIENT_ID = CL.ID \n"
                + "ORDER BY IVM.INVOICE_DATE";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<DailyCashSummary> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            DailyCashSummary objBo = new DailyCashSummary();
            objBo.setPatientId(map.get("PATIENT_ID").toString());
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setClientName(map.get("CLIENT_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            objBo.setNetDiscount(map.get("NET_DISCOUNT").toString());
            objBo.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            objBo.setSupport(map.get("SUPPORT").toString());
            objBo.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            objBo.setReciveAmount(map.get("RECEIVED_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());
            lisins.add(objBo);
        }
        return lisins;
    }
//   public static void main(String[] args) {
//       DailyCashSummaryHandler hnd= new DailyCashSummaryHandler();
//       System.out.println(hnd.getRefundMaster("01-JAN-17 08:00:00", "01-APR-18 08:30:00", "", "",""));
//   }
}

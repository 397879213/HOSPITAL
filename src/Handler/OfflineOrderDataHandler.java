/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.OfflineOrderData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class OfflineOrderDataHandler implements java.io.Serializable {

    public List<OfflineOrderData> selectInvoiceMaster(String status,
            String locationId, String patientId) {

        String[] selectColumns = {"-", "PATIENT_ID", "FULL_NAME", "COMPLETE_ORDER_NO",
            "INVOICE_NO", "DESCRIPTION", "PAYMENT_MODE_ID", "STATUS_ID", "INVOICE_DATE",
            "NET_DISCOUNT", "DOCTOR_SHARE_DISCOUNT", "TOTAL_AMOUNT",
            "PAYABLE_AMOUNT", "RECEIVED_AMOUNT", "RECEIPT_MADE", "REMARKS",
            "MANUAL_INVOICE_NO", "TERMINAL_ID", "INVOICE_BY", "USER_ID",
            "TRN_DATE", "BALANCE_AMOUNT", "PERCENTAGE_DISCOUNT", "LOCATION_ID",
            "REFERRAL_NO", "ACCESS_CODE", "UPDATED_BY", "UPDATED_TERMINAL",
            "UPDATED_DATE", "REFUND_AMOUNT", "RETURN_AMOUNT", "ADVANCE_ADJUSTED",
            "CLIENT_BILL_RECEIVE_NO", "REPORT_PENDING_AMOUNT", "FINANCIAL_SUPPORT",
            "CLIENT_BILL_NO", "CLIENT_ID", "STORE_ID", "INVOICE_TIME_CASH",
            "ADMISSION_NO", "EXPORT_STATUS"};

        String selectInvoiceMaster
                = "SELECT IM.PATIENT_ID, "
                + "PAT.FULL_NAME, \n"
                + "IM.COMPLETE_ORDER_NO, \n"
                + "IM.INVOICE_NO, \n"
                + "LOC.DESCRIPTION, \n"
                + "IM.PAYMENT_MODE_ID, "
                + "IM.STATUS_ID, \n"
                + " TO_CHAR(IM.INVOICE_DATE, 'DD/MON/YY HH:MI:SSAM') INVOICE_DATE ,\n"
                + "IM.NET_DISCOUNT, \n"
                + "IM.DOCTOR_SHARE_DISCOUNT, \n"
                + "IM.TOTAL_AMOUNT, "
                + "IM.PAYABLE_AMOUNT, \n"
                + "IM.RECEIVED_AMOUNT, \n"
                + "IM.RECEIPT_MADE, \n"
                + "NVL(IM.REMARKS,' ')  REMARKS ,\n"
                + "IM.MANUAL_INVOICE_NO, "
                + "IM.TERMINAL_ID, \n"
                + "IM.INVOICE_BY, "
                + "NVL(IM.USER_ID,' ')  USER_ID,  \n"
                + " TO_CHAR(IM.TRN_DATE, 'DD/MON/YY HH:MI:SSAM') TRN_DATE ,\n"
                + "IM.BALANCE_AMOUNT, "
                + "IM.PERCENTAGE_DISCOUNT, \n"
                + "IM.LOCATION_ID, "
                + "NVL(IM.REFERRAL_NO,' ') REFERRAL_NO, "
                + "IM.ACCESS_CODE, \n"
                + "NVL(IM.UPDATED_BY,' ')  UPDATED_BY, \n "
                + "NVL(IM.UPDATED_TERMINAL,' ')   UPDATED_TERMINAL, \n"
                + "TO_CHAR(NVL(IM.UPDATED_DATE,SYSDATE), 'DD/MON/YY HH:MI:SSAM') UPDATED_DATE ,\n"
                + "IM.REFUND_AMOUNT, \n"
                + "IM.RETURN_AMOUNT, "
                + "IM.ADVANCE_ADJUSTED, "
                + "NVL(IM.CLIENT_BILL_RECEIVE_NO,0)  CLIENT_BILL_RECEIVE_NO, \n"
                + "IM.REPORT_PENDING_AMOUNT, "
                + "IM.FINANCIAL_SUPPORT, \n"
                + "NVL(IM.CLIENT_BILL_NO,0)  CLIENT_BILL_NO,\n "
                + "IM.CLIENT_ID, "
                + "IM.STORE_ID, \n"
                + "IM.INVOICE_TIME_CASH, \n"
                + "IM.ADMISSION_NO, "
                + "IM.EXPORT_STATUS \n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IM,    \n"
                + Database.DCMS.patient + "                PAT,     \n"
                + Database.DCMS.users + "                 USR ,     \n"
                + Database.DCMS.location + "               LOC      \n";

        if (!status.isEmpty()) {
            selectInvoiceMaster += " WHERE IM.EXPORT_STATUS = '" + status + "' \n";
        }
        if (!locationId.equalsIgnoreCase("")) {
            selectInvoiceMaster += " WHERE IM.LOCATION_ID = '" + locationId + "' \n";
        } else if (!patientId.equalsIgnoreCase("")) {
            selectInvoiceMaster += " WHERE IM.PATIENT_ID = '" + patientId + "' \n";
        }

        selectInvoiceMaster += " AND   IM.EXPORT_STATUS = 'N'     \n"
                + " AND   PAT.PATIENT_ID   = IM.PATIENT_ID        \n"
                + " AND   PAT.LOCATION_ID  = IM.LOCATION_ID       \n"
                + " AND   IM.LOCATION_ID   = LOC.ID               \n"
                + " AND   USR.USER_NAME    = IM.INVOICE_BY        \n";

        List selectInvoice = Constants.dao.selectDatainList(selectInvoiceMaster, selectColumns);

        List<OfflineOrderData> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            OfflineOrderData set = new OfflineOrderData();

            set.setPatientId(map.get("PATIENT_ID").toString());
            set.setPatientName(map.get("FULL_NAME").toString());
            set.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            set.setInvoiceNo(map.get("INVOICE_NO").toString());
            set.setPaymentModeId(map.get("PAYMENT_MODE_ID").toString());
            set.setStatusId(map.get("STATUS_ID").toString());
            set.setInvoiceDate(map.get("INVOICE_DATE").toString());
            set.setNetDiscount(map.get("NET_DISCOUNT").toString());
            set.setDoctorShareDiscount(map.get("DOCTOR_SHARE_DISCOUNT").toString());
            set.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            set.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            set.setReceivedAmount(map.get("RECEIVED_AMOUNT").toString());
            set.setReceiptMade(map.get("RECEIPT_MADE").toString());
            set.setRemarks(map.get("REMARKS").toString());
            set.setManualInvoiceNo(map.get("MANUAL_INVOICE_NO").toString());
            set.setTerminalId(map.get("TERMINAL_ID").toString());
            set.setInvoiceBy(map.get("INVOICE_BY").toString());
            set.setOrderBy(map.get("USER_ID").toString());
            set.setTrnDate(map.get("TRN_DATE").toString());
            set.setBalanceAmount(map.get("BALANCE_AMOUNT").toString());
            set.setPercentageDiscount(Float.parseFloat(map.get("PERCENTAGE_DISCOUNT").toString()));
            set.setLocationId(map.get("LOCATION_ID").toString());
            set.setLocation(map.get("DESCRIPTION").toString());
            set.setReferralNo(map.get("REFERRAL_NO").toString());
            set.setAccessCode(map.get("ACCESS_CODE").toString());
            set.setUpdatedBy(map.get("UPDATED_BY").toString());
            set.setUpdatedTerminal(map.get("UPDATED_TERMINAL").toString());
            set.setUpdatedDate(map.get("UPDATED_DATE").toString());
            set.setRefundAmount(map.get("REFUND_AMOUNT").toString());
            set.setReturnAmount(map.get("RETURN_AMOUNT").toString());
            set.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            set.setClientBillReceiveNo(map.get("CLIENT_BILL_RECEIVE_NO").toString());
            set.setReportPendingAmount(map.get("REPORT_PENDING_AMOUNT").toString());
            set.setFinancialSupport(Integer.parseInt(map.get("FINANCIAL_SUPPORT").toString()));
            set.setClientBillNo(map.get("CLIENT_BILL_NO").toString());
            set.setClientId(map.get("CLIENT_ID").toString());
            set.setStoreId(map.get("STORE_ID").toString());
            set.setInvoiceTimeCash(map.get("INVOICE_TIME_CASH").toString());
            set.setAdmissionNumber(map.get("ADMISSION_NO").toString());

            list.add(set);
        }
        return list;
    }

    public List<OfflineOrderData> selectInvoiceDetail(String InvoiceNo) {

        String[] cols = {"-", "COMPLETE_ORDER_NO", "INVOICE_NO", "INVOICE_DETAIL_ID",
            "ORDER_DETAIL_ID", "DEPARTMENT_ID", "SECTION_ID", "PRICE",
            "DISCOUNT_PERCENTAGE", "INVOICE_DATE", "CPT_DES", "ADVANCE_ADJUSTED",
            "PAYABLE_AMOUNT", "RECEIVED_AMOUNT", "INVOICE_BY", "STATUS_ID",
            "USER_ID", "TERMINAL_ID", "TRN_DATE", "REFUND_BY", "REFUND_DATE",
            "FINANCIAL_SUPPORT", "REPORTING_TIME", "SECTION_NO",
            "APPOINTMENT_TIME", "APPOINTMENT_STATUS", "BALANCE_AMOUNT",
            "INVOICE_CASH", "QUANTITY", "TOTAL_AMOUNT", "REFUND_STATUS",
            "PERFORMING_PHYSICIAN_ID", "REFUND_AMOUNT", "CPT_ID"};

        String query
                = "SELECT IVD.COMPLETE_ORDER_NO, \n"
                + "IVD.INVOICE_NO, "
                + "IVD.INVOICE_DETAIL_ID, \n"
                + "IVD.ORDER_DETAIL_ID, "
                + "IVD.DEPARTMENT_ID, "
                + "IVD.SECTION_ID, "
                + "IVD.PRICE, "
                + "IVD.DISCOUNT_PERCENTAGE, "
                + " TO_CHAR(IVD.INVOICE_DATE, 'DD/MON/YY HH:MI:SSAM') INVOICE_DATE ,\n"
                + "IVD.ADVANCE_ADJUSTED, "
                + "IVD.PAYABLE_AMOUNT, RECEIVED_AMOUNT, "
                + "IVD.INVOICE_BY, "
                + "IVD.STATUS_ID, \n"
                + "IVD.USER_ID, "
                + "IVD.TERMINAL_ID, \n"
                + " TO_CHAR(IVD.TRN_DATE, 'DD/MON/YY HH:MI:SSAM') TRN_DATE ,\n"
                + "NVL(IVD.REFUND_BY,' ')  REFUND_BY,\n "
                + " TO_CHAR(NVL(IVD.REFUND_DATE,SYSDATE), 'DD/MON/YY HH:MI:SSAM') REFUND_DATE ,\n"
                + "IVD.FINANCIAL_SUPPORT, \n"
                + "CP.DESCRIPTION  CPT_DES , "
                + "NVL(IVD.REPORTING_TIME,' ') REPORTING_TIME, "
                + "IVD.SECTION_NO, "
                + "NVL(IVD.APPOINTMENT_TIME,' ')  APPOINTMENT_TIME,\n "
                + "IVD.APPOINTMENT_STATUS, \n"
                + "IVD.BALANCE_AMOUNT, "
                + "IVD.INVOICE_CASH, "
                + "IVD.QUANTITY, "
                + "IVD.TOTAL_AMOUNT, "
                + "IVD.REFUND_STATUS, \n"
                + "NVL(IVD.PERFORMING_PHYSICIAN_ID,' ')PERFORMING_PHYSICIAN_ID,  "
                + "IVD.REFUND_AMOUNT, \n"
                + "IVD.CPT_ID FROM \n" + Database.DCMS.invoiceDetail + " IVD, \n"
                + Database.DCMS.CPT + " CP \n"
                + " WHERE INVOICE_NO = '" + InvoiceNo + "' \n"
                + " AND IVD.CPT_ID = CP.CPT_ID             \n";

        List list = Constants.dao.selectDatainList(query, cols);
        List<OfflineOrderData> orders = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            OfflineOrderData rep = new OfflineOrderData();

            rep.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            rep.setInvoiceNo(map.get("INVOICE_NO").toString());
            rep.setInvoiceDetailId(map.get("INVOICE_DETAIL_ID").toString());
            rep.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
            rep.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            rep.setSectionId(map.get("SECTION_ID").toString());
            rep.setPrice(map.get("PRICE").toString());
            rep.setDiscount(map.get("DISCOUNT_PERCENTAGE").toString());
            rep.setInvoiceDate(map.get("INVOICE_DATE").toString());
            rep.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            rep.setReceivedAmount(map.get("RECEIVED_AMOUNT").toString());
            rep.setInvoiceBy(map.get("INVOICE_BY").toString());
            rep.setStatusId(map.get("STATUS_ID").toString());
            rep.setOrderBy(map.get("USER_ID").toString());
            rep.setTerminalId(map.get("TERMINAL_ID").toString());
            rep.setTrnDate(map.get("TRN_DATE").toString());
            rep.setRefundBy(map.get("REFUND_BY").toString());
            rep.setRefundDate(map.get("REFUND_DATE").toString());
            rep.setFinancialSupport(Integer.parseInt(map.get("FINANCIAL_SUPPORT").toString()));
            rep.setCptDescription(map.get("CPT_DES").toString());
            rep.setReportDeliveryTime(map.get("REPORTING_TIME").toString());
            rep.setSectionNo(map.get("SECTION_NO").toString());
            rep.setAppointmentTime(map.get("APPOINTMENT_TIME").toString());
            rep.setAppointmentStatus(map.get("APPOINTMENT_STATUS").toString());
            rep.setBalanceAmount(map.get("BALANCE_AMOUNT").toString());
            rep.setInvoiceTimeCash(map.get("INVOICE_CASH").toString());
            rep.setQuantity(Integer.parseInt(map.get("QUANTITY").toString()));
            rep.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            rep.setRefundStatus(map.get("REFUND_STATUS").toString());
            rep.setPerformingPhysicianId(map.get("PERFORMING_PHYSICIAN_ID").toString());
            rep.setRefundAmount(map.get("REFUND_AMOUNT").toString());
            rep.setCptId(map.get("CPT_ID").toString());

            orders.add(rep);
        }
        return orders;
    }

    //InvoiceMasterAndInvoiceDetail
    public List<OfflineOrderData> selectInvMastandDetail() {

        String[] selectColumns = {"-", "PATIENT_ID", "FULL_NAME", "COMPLETE_ORDER_NO",
            "INVOICE_NO", "DESCRIPTION", "PAYMENT_MODE_ID", "STATUS_ID", "INVOICE_DATE",
            "NET_DISCOUNT", "DOCTOR_SHARE_DISCOUNT", "TOTAL_AMOUNT",
            "PAYABLE_AMOUNT", "RECEIVED_AMOUNT", "RECEIPT_MADE", "REMARKS",
            "MANUAL_INVOICE_NO", "TERMINAL_ID", "INVOICE_BY", "USER_ID",
            "TRN_DATE", "BALANCE_AMOUNT", "PERCENTAGE_DISCOUNT", "LOCATION_ID",
            "REFERRAL_NO", "ACCESS_CODE", "UPDATED_BY", "UPDATED_TERMINAL",
            "UPDATED_DATE", "REFUND_AMOUNT", "RETURN_AMOUNT", "ADVANCE_ADJUSTED",
            "CLIENT_BILL_RECEIVE_NO", "REPORT_PENDING_AMOUNT", "FINANCIAL_SUPPORT",
            "CLIENT_BILL_NO", "CLIENT_ID", "STORE_ID", "INVOICE_TIME_CASH",
            "ADMISSION_NO", "EXPORT_STATUS", "COMPLETE_ORDER_NO", "INVOICE_NO", "INVOICE_DETAIL_ID",
            "ORDER_DETAIL_ID", "DEPARTMENT_ID", "SECTION_ID", "PRICE",
            "DISCOUNT_PERCENTAGE", "INVOICE_DATE", "CPT_DES", "ADVANCE_ADJUSTED",
            "PAYABLE_AMOUNT", "RECEIVED_AMOUNT", "INVOICE_BY", "STATUS_ID",
            "USER_ID", "TERMINAL_ID", "TRN_DATE", "REFUND_BY", "REFUND_DATE",
            "FINANCIAL_SUPPORT", "REPORTING_TIME", "SECTION_NO",
            "APPOINTMENT_TIME", "APPOINTMENT_STATUS", "BALANCE_AMOUNT",
            "INVOICE_CASH", "QUANTITY", "TOTAL_AMOUNT", "REFUND_STATUS",
            "PERFORMING_PHYSICIAN_ID", "REFUND_AMOUNT", "CPT_ID"};

        String selectInvMastandDetail
                = "SELECT IM.PATIENT_ID, "
                + "PAT.FULL_NAME, \n"
                + "IM.COMPLETE_ORDER_NO, \n"
                + "IM.INVOICE_NO, \n"
                + "LOC.DESCRIPTION, \n"
                + "IM.PAYMENT_MODE_ID, "
                + "IM.STATUS_ID, \n"
                + " TO_CHAR(IM.INVOICE_DATE, 'DD/MON/YY HH:MI:SSAM') INVOICE_DATE ,\n"
                + "IM.NET_DISCOUNT, \n"
                + "IM.DOCTOR_SHARE_DISCOUNT, \n"
                + "IM.TOTAL_AMOUNT, "
                + "IM.PAYABLE_AMOUNT, \n"
                + "IM.RECEIVED_AMOUNT, \n"
                + "IM.RECEIPT_MADE, \n"
                + "NVL(IM.REMARKS,' ')  REMARKS ,\n"
                + "IM.MANUAL_INVOICE_NO, "
                + "IM.TERMINAL_ID, \n"
                + "IM.INVOICE_BY, "
                + "NVL(IM.USER_ID,' ')  USER_ID,  \n"
                + "TO_CHAR(IM.TRN_DATE, 'DD/MON/YY HH:MI:SSAM') TRN_DATE ,\n"
                + "IM.BALANCE_AMOUNT, "
                + "IM.PERCENTAGE_DISCOUNT, \n"
                + "IM.LOCATION_ID, "
                + "NVL(IM.REFERRAL_NO,' ') REFERRAL_NO, "
                + "IM.ACCESS_CODE, \n"
                + "NVL(IM.UPDATED_BY,' ')  UPDATED_BY, \n "
                + "NVL(IM.UPDATED_TERMINAL,' ')   UPDATED_TERMINAL, \n"
                + "TO_CHAR(NVL(IM.UPDATED_DATE,SYSDATE), 'DD/MON/YY HH:MI:SSAM') UPDATED_DATE ,\n"
                + "IM.REFUND_AMOUNT, \n"
                + "IM.RETURN_AMOUNT, "
                + "IM.ADVANCE_ADJUSTED, "
                + "NVL(IM.CLIENT_BILL_RECEIVE_NO,0)  CLIENT_BILL_RECEIVE_NO, \n"
                + "IM.REPORT_PENDING_AMOUNT, "
                + "IM.FINANCIAL_SUPPORT, \n"
                + "NVL(IM.CLIENT_BILL_NO,0)  CLIENT_BILL_NO,\n "
                + "IM.CLIENT_ID, "
                + "IM.STORE_ID, \n"
                + "IM.INVOICE_TIME_CASH, \n"
                + "IM.ADMISSION_NO, "
                + "IM.EXPORT_STATUS \n"
                + "IVD.COMPLETE_ORDER_NO, \n"
                + "IVD.INVOICE_NO, "
                + "IVD.INVOICE_DETAIL_ID, \n"
                + "IVD.ORDER_DETAIL_ID, "
                + "IVD.DEPARTMENT_ID, "
                + "IVD.SECTION_ID, "
                + "IVD.PRICE, "
                + "IVD.DISCOUNT_PERCENTAGE, "
                + " TO_CHAR(IVD.INVOICE_DATE, 'DD/MON/YY HH:MI:SSAM') INVOICE_DATE ,\n"
                + "IVD.ADVANCE_ADJUSTED, "
                + "IVD.PAYABLE_AMOUNT, RECEIVED_AMOUNT, "
                + "IVD.INVOICE_BY, "
                + "IVD.STATUS_ID, \n"
                + "IVD.USER_ID, "
                + "IVD.TERMINAL_ID, \n"
                + " TO_CHAR(IVD.TRN_DATE, 'DD/MON/YY HH:MI:SSAM') TRN_DATE ,\n"
                + "NVL(IVD.REFUND_BY,' ')  REFUND_BY,\n "
                + " TO_CHAR(NVL(IVD.REFUND_DATE,SYSDATE), 'DD/MON/YY HH:MI:SSAM') REFUND_DATE ,\n"
                + "IVD.FINANCIAL_SUPPORT, \n"
                + "CP.DESCRIPTION  CPT_DES , "
                + "NVL(IVD.REPORTING_TIME,' ') REPORTING_TIME, "
                + "IVD.SECTION_NO, "
                + "NVL(IVD.APPOINTMENT_TIME,' ')  APPOINTMENT_TIME,\n "
                + "IVD.APPOINTMENT_STATUS, \n"
                + "IVD.BALANCE_AMOUNT, "
                + "IVD.INVOICE_CASH, "
                + "IVD.QUANTITY, "
                + "IVD.TOTAL_AMOUNT, "
                + "IVD.REFUND_STATUS, \n"
                + "NVL(IVD.PERFORMING_PHYSICIAN_ID,' ')PERFORMING_PHYSICIAN_ID,  "
                + "IVD.REFUND_AMOUNT,   \n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IM,    \n"
                + Database.DCMS.invoiceDetail + " IVD               \n";

        List selectAll = Constants.dao.selectDatainList(selectInvMastandDetail, selectColumns);

        List<OfflineOrderData> list = new ArrayList();
        for (int i = 0; i < selectAll.size(); i++) {
            HashMap map = (HashMap) selectAll.get(i);
            OfflineOrderData Obj = new OfflineOrderData();

            Obj.setPatientId(map.get("PATIENT_ID").toString());
            Obj.setPatientName(map.get("FULL_NAME").toString());
            Obj.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            Obj.setInvoiceNo(map.get("INVOICE_NO").toString());
            Obj.setPaymentModeId(map.get("PAYMENT_MODE_ID").toString());
            Obj.setStatusId(map.get("STATUS_ID").toString());
            Obj.setInvoiceDate(map.get("INVOICE_DATE").toString());
            Obj.setNetDiscount(map.get("NET_DISCOUNT").toString());
            Obj.setDoctorShareDiscount(map.get("DOCTOR_SHARE_DISCOUNT").toString());
            Obj.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            Obj.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            Obj.setReceivedAmount(map.get("RECEIVED_AMOUNT").toString());
            Obj.setReceiptMade(map.get("RECEIPT_MADE").toString());
            Obj.setRemarks(map.get("REMARKS").toString());
            Obj.setManualInvoiceNo(map.get("MANUAL_INVOICE_NO").toString());
            Obj.setTerminalId(map.get("TERMINAL_ID").toString());
            Obj.setInvoiceBy(map.get("INVOICE_BY").toString());
            Obj.setOrderBy(map.get("USER_ID").toString());
            Obj.setTrnDate(map.get("TRN_DATE").toString());
            Obj.setBalanceAmount(map.get("BALANCE_AMOUNT").toString());
            Obj.setPercentageDiscount(Float.parseFloat(map.get("PERCENTAGE_DISCOUNT").toString()));
            Obj.setLocationId(map.get("LOCATION_ID").toString());
            Obj.setLocation(map.get("DESCRIPTION").toString());
            Obj.setReferralNo(map.get("REFERRAL_NO").toString());
            Obj.setAccessCode(map.get("ACCESS_CODE").toString());
            Obj.setUpdatedBy(map.get("UPDATED_BY").toString());
            Obj.setUpdatedTerminal(map.get("UPDATED_TERMINAL").toString());
            Obj.setUpdatedDate(map.get("UPDATED_DATE").toString());
            Obj.setRefundAmount(map.get("REFUND_AMOUNT").toString());
            Obj.setReturnAmount(map.get("RETURN_AMOUNT").toString());
            Obj.setAdvanceAdjusted(map.get("ADVANCE_ADJUSTED").toString());
            Obj.setClientBillReceiveNo(map.get("CLIENT_BILL_RECEIVE_NO").toString());
            Obj.setReportPendingAmount(map.get("REPORT_PENDING_AMOUNT").toString());
            Obj.setFinancialSupport(Integer.parseInt(map.get("FINANCIAL_SUPPORT").toString()));
            Obj.setClientBillNo(map.get("CLIENT_BILL_NO").toString());
            Obj.setClientId(map.get("CLIENT_ID").toString());
            Obj.setStoreId(map.get("STORE_ID").toString());
            Obj.setInvoiceTimeCash(map.get("INVOICE_TIME_CASH").toString());
            Obj.setAdmissionNumber(map.get("ADMISSION_NO").toString());
            Obj.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            Obj.setInvoiceNo(map.get("INVOICE_NO").toString());
            Obj.setInvoiceDetailId(map.get("INVOICE_DETAIL_ID").toString());
            Obj.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
            Obj.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            Obj.setSectionId(map.get("SECTION_ID").toString());
            Obj.setPrice(map.get("PRICE").toString());
            Obj.setDiscount(map.get("DISCOUNT_PERCENTAGE").toString());
            Obj.setInvoiceDate(map.get("INVOICE_DATE").toString());
            Obj.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            Obj.setReceivedAmount(map.get("RECEIVED_AMOUNT").toString());
            Obj.setInvoiceBy(map.get("INVOICE_BY").toString());
            Obj.setStatusId(map.get("STATUS_ID").toString());
            Obj.setOrderBy(map.get("USER_ID").toString());
            Obj.setTerminalId(map.get("TERMINAL_ID").toString());
            Obj.setTrnDate(map.get("TRN_DATE").toString());
            Obj.setRefundBy(map.get("REFUND_BY").toString());
            Obj.setRefundDate(map.get("REFUND_DATE").toString());
            Obj.setFinancialSupport(Integer.parseInt(map.get("FINANCIAL_SUPPORT").toString()));
            Obj.setCptDescription(map.get("CPT_DES").toString());
            Obj.setReportDeliveryTime(map.get("REPORTING_TIME").toString());
            Obj.setSectionNo(map.get("SECTION_NO").toString());
            Obj.setAppointmentTime(map.get("APPOINTMENT_TIME").toString());
            Obj.setAppointmentStatus(map.get("APPOINTMENT_STATUS").toString());
            Obj.setBalanceAmount(map.get("BALANCE_AMOUNT").toString());
            Obj.setInvoiceTimeCash(map.get("INVOICE_CASH").toString());
            Obj.setQuantity(Integer.parseInt(map.get("QUANTITY").toString()));
            Obj.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            Obj.setRefundStatus(map.get("REFUND_STATUS").toString());
            Obj.setPerformingPhysicianId(map.get("PERFORMING_PHYSICIAN_ID").toString());
            Obj.setRefundAmount(map.get("REFUND_AMOUNT").toString());
            Obj.setCptId(map.get("CPT_ID").toString());
            list.add(Obj);
        }
        return list;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author PACSLINK
 */
public class TransactionType {

    public static final String refund = "4815";
    public static final String advanceAmount = "4816";
    public static final String invoice = "4817";
    public static final String ledgerRefundAmount = "4818";
    public static final String receivedBalance = "4819";
    public static final String advanceDeposit = "4820";

    public static final String icd = "ICD";
    public static final String tcode = "TCODE";
    public static final String mCode = "M-CODE";
    public static final String icdo = "ICDO-CODE";
     
    
    public static final String returns = "RETURN";
    public static final String discount = "DISCOUNT";

     
   
    public static final String AdvanceAdjustment = "Patient Advance Adjustment";

    public static final String cashAgainBalance = "Cash Again Balance";
    public static final String waiveOff = "Performing Fee Waiveoff";

    public static final String eventInvoiceNo = "invoiceNo";
    public static final String eventRefundNo = "refundNo";
    public static final String eventOrderNo = "orderNo";
    public static final String pendingBalance = "PENDING_BALANCE";

    public static final String remarksInvoiceNo = "Amount has received against patient invoice.";
    public static final String remarksDiscountAfterInvoice = "discount has provided after invoice generation.";
    public static final String remarksAmountRetrunAfterInvoice = "Amount has returned after invoice generation.";
    public static final String remarksBalanceAmountReceived = "Amount has received in account of balance amount.";

}

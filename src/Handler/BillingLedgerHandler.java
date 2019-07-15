/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.BillingLedger;
import java.util.HashMap;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author user
 */
public class BillingLedgerHandler {

    public String getPatientAccountAmount(String patientId, String account, boolean accountbalance) {

        if (!accountbalance) {
            return "0";
        }
        String cols[] = {"-", "BALANCE_AMOUNT"};
        String query
                = " SELECT NVL(SUM(CR-DR), 0) BALANCE_AMOUNT \n"
                + " FROM \n"
                + Database.DCMS.billingLedger + " PL                    \n"
                + " WHERE PATIENT_ID='" + patientId + "'                \n"
                + " AND ACCOUNT = '" + account + "'                     \n";
        Vector vec = Constants.dao.selectData(query, cols);
        HashMap hashRow = (HashMap) vec.get(0);
        return hashRow.get("BALANCE_AMOUNT").toString();

    }
public boolean insertBillingLedger(BillingLedger ledger) {

        String[] columns = {Database.DCMS.billingLedger, "PATIENT_ID",
            "ACCOUNT", "DR", "CR", "CPT", "TRANS_NO", "TRANS_TYPE", "COMMENTS",
            "TERMINAL_ID", "TRANSACTION_BY", "VOUCHER_NO", "LOCATION_ID"};

        HashMap ledgerMap = new HashMap();
        ledgerMap.put("PATIENT_ID", "'" + ledger.getPatientId() + "'");
        ledgerMap.put("LOCATION_ID", "'" + Constants.locationId + "'");
        ledgerMap.put("ACCOUNT", "'" + ledger.getAccount() + "'");
        ledgerMap.put("DR", "'" + ledger.getDrAmount() + "'");
        ledgerMap.put("CR", "'" + ledger.getCrAmount() + "'");
        ledgerMap.put("CPT", "'" + ledger.getCpt() + "'");
        ledgerMap.put("TRANS_NO", "'" + ledger.getTransNo() + "'");
        ledgerMap.put("TRANS_TYPE", "'" + ledger.getTransType() + "'");
        ledgerMap.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
        ledgerMap.put("TRANSACTION_BY", "'" + Constants.userId + "'");
        ledgerMap.put("VOUCHER_NO", "'" + ledger.getVoucherNo() + "'");
        ledgerMap.put("COMMENTS", "'" + ledger.getApproveComments() + "'");
        Vector vec = new Vector();
        vec.add(ledgerMap);
        return Constants.dao.insertData(vec, columns);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BO.BillingLedger;
import Handler.BillingLedgerHandler;

/**
 *
 * @author user
 */
public class BillingLedgerController {

    BillingLedgerHandler hdlLedger = new BillingLedgerHandler();

    public boolean insertLedgerEntry(BillingLedger ledger) {
        //ledger.voucherNo = key.generateVoucherNo();
        return hdlLedger.insertBillingLedger(ledger);
    }

}

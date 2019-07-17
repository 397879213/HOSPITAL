/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientCptRates;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class ClientCptRatesController {

    ClientCptRatesHandler hdlClientCptRates = new ClientCptRatesHandler();
    List<ClientCptRatesBo> listSelectPatients = new ArrayList();
    List<ClientCptRatesBo> listSumOfIvd = new ArrayList();

    public boolean updateIVDRates(ClientCptRatesBo objUpdate) {
        boolean ret = hdlClientCptRates.updateIVDRates(objUpdate);
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateRefundDetail(ClientCptRatesBo objUpdate) {
        boolean ret = hdlClientCptRates.updateRefundDetail(objUpdate);
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateRefundMaster(ClientCptRatesBo objUpdate) {
        boolean ret = hdlClientCptRates.updateRefundMaster(objUpdate);
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateInvoiceMaster(ClientCptRatesBo objUpdate) {
        boolean ret = hdlClientCptRates.updateInvoiceMaster(objUpdate);
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean changeInIVD(String fromDate, String toDate) {
        boolean ret = true;
        listSelectPatients = hdlClientCptRates.selectForIvd(fromDate, toDate);
        System.err.println("sixeee" + listSelectPatients.size());
        for (int i = 0; i < listSelectPatients.size(); i++) {
            ClientCptRatesBo objChangeClient = listSelectPatients.get(i);
            hdlClientCptRates.selectForIvm("001001180150445");
            String cost = hdlClientCptRates.selectCPTRates(objChangeClient.getCptId());

            if (objChangeClient.getStatusId().equalsIgnoreCase("14")) {
                objChangeClient.setPayablelAmount(cost);
                objChangeClient.setTotalAmount(cost);
                objChangeClient.setPrice(cost);
                objChangeClient.setBalanceAmount("0");
                objChangeClient.setRefundAmount(cost);
                objChangeClient.setInvoiceBalanceAdjsted(cost);
                objChangeClient.setUnitPrice(cost);
                // update cost in Refund Detail against con, odi
                ret = updateRefundDetail(objChangeClient);
            } else {
                objChangeClient.setPayablelAmount(cost);
                objChangeClient.setTotalAmount(cost);
                objChangeClient.setPrice(cost);
                objChangeClient.setBalanceAmount(cost);
                objChangeClient.setRefundAmount("0");
            }
            ret = updateIVDRates(objChangeClient);
        }
        return ret;
    }

    public boolean changeInIVM(String con) {
        boolean ret = true;
        listSumOfIvd = hdlClientCptRates.selectForIvm(con);
        ClientCptRatesBo objForMaster = listSumOfIvd.get(0);
        ret = hdlClientCptRates.updateInvoiceMaster(objForMaster);
        if (ret) {
            ret = hdlClientCptRates.updateRefundMaster(objForMaster);
        }
        return ret;
    }

    public static void main(String[] args) {
        ClientCptRatesController ctlClientCptRates = new ClientCptRatesController();
        String fromDate = "01-JUL-19";
        String toDate = "17-JUL-19";
        if (ctlClientCptRates.changeInIVD(fromDate, toDate)) {
            JOptionPane.showMessageDialog(null, "Records Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to run Process!");
        }
    }
}

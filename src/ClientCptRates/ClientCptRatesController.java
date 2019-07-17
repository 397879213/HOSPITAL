/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientCptRates;

import java.util.ArrayList;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class ClientCptRatesController {

    ClientCptRatesHandler hdlClientCptRates = new ClientCptRatesHandler();
    List<ClientCptRatesBo> listSelectPatients = new ArrayList();

    public boolean updateIVDRates(ClientCptRatesBo objUpdate) {
        boolean ret = hdlClientCptRates.updateIVDRates(objUpdate);
        if (ret) {
            ret = Constants.dao.commitTeleTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public void changeInIVD(String fromDate, String toDate) {
        listSelectPatients = hdlClientCptRates.selectForIvd(fromDate, toDate);

        for (int i = 0; i < listSelectPatients.size(); i++) {
            ClientCptRatesBo objChangeClient = listSelectPatients.get(i);

            String cost = hdlClientCptRates.selectCPTRates(objChangeClient.getCptId());

            if (objChangeClient.getStatusId().equalsIgnoreCase("14")) {
                objChangeClient.setPayablelAmount(cost);
                objChangeClient.setTotalAmount(cost);
                objChangeClient.setPrice(cost);
                objChangeClient.setBalanceAmount("0");
                objChangeClient.setRefundAmount(cost);
            } else {
                objChangeClient.setPayablelAmount(cost);
                objChangeClient.setTotalAmount(cost);
                objChangeClient.setPrice(cost);
                objChangeClient.setBalanceAmount(cost);
                objChangeClient.setRefundAmount("0");
            }
            updateIVDRates(objChangeClient);
        }
    }

    public static void main(String[] args) {
        ClientCptRatesController ctlClientCptRates = new ClientCptRatesController();
        String fromDate = "01-JUL-19";
        String toDate = "10-JUL-19";
        ctlClientCptRates.changeInIVD(fromDate, toDate);
    }
}

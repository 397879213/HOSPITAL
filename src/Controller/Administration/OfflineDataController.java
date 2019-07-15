package Controller.Administration;

import BO.OfflineOrderData;
import Handler.OfflineOrderDataHandler;
import java.util.List;

public class OfflineDataController {

    OfflineOrderDataHandler hdlOffline = new OfflineOrderDataHandler();

    public List<OfflineOrderData> selectInvoiceMaster(String status,
            String locationId, String patientId) {
        return hdlOffline.selectInvoiceMaster(status, locationId, patientId);
    }

    public List<OfflineOrderData> selectInvoiceDetail(String InvoiceNo) {
        return hdlOffline.selectInvoiceDetail(InvoiceNo);
    }

}

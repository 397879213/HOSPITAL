package Controller.Administration;

import BO.OfflineOrderData;
import Handler.NursingOrderDescriptionHandler;
import java.util.List;

public class NursingOrderDescriptionController {

    
    NursingOrderDescriptionHandler hdlNursingOrder = new NursingOrderDescriptionHandler();

    public List<OfflineOrderData> selectInvoiceMaster(String admissionNo,
       String status, String userName, String fromDate, String toDate) {
        return hdlNursingOrder.selectInvoiceMaster(admissionNo, status, userName, fromDate, toDate);
    }

    public List<OfflineOrderData> selectInvoiceDetail(String invoiceNumber) {
        return hdlNursingOrder.selectInvoiceDetail(invoiceNumber);
    }

}

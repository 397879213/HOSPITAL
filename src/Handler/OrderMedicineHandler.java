/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.CancelReturnOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Status;

/**
 *
 * @author user
 */
public class OrderMedicineHandler {

    GenerateKeys key = new GenerateKeys();

    public boolean saveItemLedgerIn(List vecSelectedOrders) {

        String[] columns = {Database.Inventory.itemLedger, "SERIAL", "TRANSACTION_TYPE_ID",
            "TRANSACTION_NO", "ITEM_ID", "STORE_ID", "QTY_IN", "VALUE_IN",
            "COST", "CRTD_BY", "CRTD_TERMINAL_ID"};

        Vector vec = new Vector();
        for (int i = 0; i < vecSelectedOrders.size(); i++) {
            CancelReturnOrder order = (CancelReturnOrder) vecSelectedOrders.get(i);
            HashMap DTMap = new HashMap();
            DTMap.put("SERIAL", key.generatePrimaryKey(Keys.itemLedger, false));
            DTMap.put("TRANSACTION_TYPE_ID", Status.inventoryRefundInventory);
            DTMap.put("TRANSACTION_NO", order.getCancelReturnId());
            DTMap.put("ITEM_ID", order.getItemId());
            DTMap.put("STORE_ID", order.getStoreId());
            DTMap.put("QTY_IN", "" + order.getRefundQuantity());
            DTMap.put("VALUE_IN", "" + (Float.parseFloat(order.getPrice())
                    * Float.parseFloat(order.getRefundQuantity())));
            DTMap.put("COST", order.getPrice());
            DTMap.put("CRTD_BY", "'" + Constants.userId + "'");
            DTMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            vec.add(DTMap);
        }
        return Constants.dao.insertData(vec, columns);

    }

}

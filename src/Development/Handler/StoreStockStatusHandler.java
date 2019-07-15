/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development.Handler;

import Development.BO.StoreStockStatusBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Muhammad Talha Khan
 */
public class StoreStockStatusHandler {
    
    
    
    public List<StoreStockStatusBO> selectItemSearch(String itemId) {
         
          String columns[] = {"-","ITEM_ID","ITEM_NAME", "STORE_NAME", "QUANTITY",
              "SALE_PRICE", "STATUS"};
          
          String query ="SELECT SWI.ITEM_ID     ITEM_ID,                     \n"
                  +"  ITM.DESCRIPTION           ITEM_NAME,                   \n"
                  +"  STR.DESCRIPTION           STORE_NAME,                  \n"
                  +"  SWI.QTY                   QUANTITY,                    \n"
                  +" SWI.SALE_PRICE             SALE_PRICE,                  \n"
                  +" SWI.ACTIVE                 STATUS                       \n"
                  +" FROM " +Database.DCMS.storeWiseItems+"SWI,              \n"
                  + Database.DCMS.store+ "STR,                               \n"
                  + Database.DCMS.item + "ITM                               \n"
                  +" WHERE SWI.ITEM_ID = '"+itemId+"'                        \n"
                  +" AND STR.ID IN (1,2,3,4,6,721,171321,171261,401)         \n"
                  +" AND SWI.ACTIVE = 'Y'                                    \n"
                  +" AND SWI.STORE_ID = STR.ID                               \n"
                  +" AND SWI.ITEM_ID = ITM.ID                                \n";
                  
          System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<StoreStockStatusBO> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              StoreStockStatusBO objData = new StoreStockStatusBO();
              
              objData.setItemId(map.get("ITEM_ID").toString());
              objData.setItemName(map.get("ITEM_NAME").toString());
              objData.setStoreName(map.get("STORE_NAME").toString());
              objData.setQuantity(map.get("QUANTITY").toString());
              objData.setSalePrice(map.get("SALE_PRICE").toString());
              objData.setStatus(map.get("STATUS").toString());
            
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
    
}

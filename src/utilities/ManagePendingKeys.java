/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author pacslink
 * 
 */
public class ManagePendingKeys {

    GenerateKeys key = new GenerateKeys();

    public void updateTransactionTableKeyColumn(String tableName, String type) {

        String[] cols = {"", "ROWID"};

        String query = "SELECT ROWID FROM " + tableName
                +" WHERE ID IS NULL ";

        Vector vec = Constants.dao.selectData(query, cols);
        for (int i = 0; i < vec.size(); i++) {

            try {
                HashMap map = (HashMap) vec.get(i);
                String rowId = map.get("ROWID").toString();
                String id = key.generateYearWiseId(type);
                String update
                        = "  UPDATE " + tableName + " \n"
                        + " SET ID = '" + id + "' \n"
                        + " WHERE ROWID = '" + rowId + "' \n";

                Constants.dao.executeUpdate(update, true);
                                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("Current Record in Progress " + (i+1) + " out of "+vec.size());
        }
    }
 
    
    public static void main(String args[]) {

         
        ManagePendingKeys manage = new ManagePendingKeys();
//manage.updateTransactionTableKeyColumn("PACS_STUDY", Keys.pacsStudy);
              
// manage.updateTransactionTableKeyColumn("DAILY_CASH_SUMMARY", Keys.dailyCashSummary);
      //  manage.updateTransactionTableKeyColumn("APPOINTMENT", Keys.appointment);
              
       //  manage.updateDefinitionTableKeyColumn(Keys.applicationComments);
       // manage.updateDefinitionTableKeyColumn(Keys.clinic);
       

   //  manage.updateTransactionTableKeyColumn("BALANCE_RECEIVED_HISTORY", Keys.balanceReceivedHistory);
     //   manage.updateTransactionTableKeyColumn("FILMS_RECEIVED_HISTORY", Keys.filmsReceivedHistory);
    //    manage.updateTransactionTableKeyColumn("IMAGING_HISTORY_CHANGE_TRACK", Keys.imagingHistoryChangeTrack);
     
        

   manage.updateDefinitionTableKeyColumn(Keys.locationWiseReportingTime);
     //   manage.updateTransactionTableKeyColumn("IMAGING_RESULT_HISTORY", Keys.imagingResultHistory);
    //    manage.updateDefinitionTableKeyColumn(Keys.imagingRota);
      
    //     manage.updateDefinitionTableKeyColumn(Keys.pacsLicensingInformation);
   //     manage.updateDefinitionTableKeyColumn(Keys.performingVerifyRights);
   //     manage.updateTransactionTableKeyColumn("REPORT_DELIVERY_HISTORY", Keys.reportDeliveryHistory);
   //     manage.updateTransactionTableKeyColumn("REPORT_VIEW_HISTORY", Keys.reportViewHistory);
   //     manage.updateDefinitionTableKeyColumn(Keys.sectionMachine);
   //     manage.updateTransactionTableKeyColumn("STUDY_TRANSFER_REQUEST", Keys.studyTransferRequest);
   //     manage.updateTransactionTableKeyColumn("UNVERIFY_REPORT_HISTORY", Keys.unverifyReportHistory);
    //    manage.updateDefinitionTableKeyColumn(Keys.wordShortcut);
        if(true){
            return;
        }
        
       
      
       
        
        
        
         
        manage.updateDefinitionTableKeyColumn(Keys.wordShortcut);
        
      
        
        //manage.updateTransactionTableKeyColumn("EMAIL_QUEUE", Keys.emailQueue);
        manage.updateTransactionTableKeyColumn("IMAGING_HISTORY_CHANGE_TRACK", Keys.imagingHistoryChangeTrack);
        manage.updateTransactionTableKeyColumn("PACS_IMAGE_VIEW_HISTORY", Keys.pacsImageViewHistory);
        manage.updateTransactionTableKeyColumn("REPORT_DELIVERY_HISTORY", Keys.reportDeliveryHistory);
        manage.updateTransactionTableKeyColumn("REPORT_VIEW_HISTORY", Keys.reportViewHistory);
        //manage.updateTransactionTableKeyColumn("SEND_SMS", Keys.sendSMS);
        manage.updateTransactionTableKeyColumn("STUDY_TRANSFER_REQUEST", Keys.studyTransferRequest);
        manage.updateTransactionTableKeyColumn("UNVERIFY_REPORT_HISTORY", Keys.unverifyReportHistory);
        manage.updateTransactionTableKeyColumn("PATH_TEXT_REPORTING", Keys.pathTextReporting);
        //manage.updateTransactionTableKeyColumn("PACS_LOG", Keys.pacsLog);
        manage.updateTransactionTableKeyColumn("IMAGING_RESULT_HISTORY", Keys.imagingResultHistory);
        //manage.updateTransactionTableKeyColumn("CONFERENCE_STUDY", Keys.conferenceStudy);
        //manage.updateTransactionTableKeyColumn("CLIENT_BILL_TRANSFER_DETAIL", Keys.clientBillTransferDetail);
      

 
      
        //manage.updateDefinitionTableKeyColumn(Keys.clinic);
        

        //manage.updateDefinitionTableKeyColumn("EMR.APP_GROUP_COMPONENT");
    }
    
    
    
  public void updateDefinitionTableKeyColumn(String tableName) {

        String[] cols = {"", "ROWID"};
        String query = " SELECT ROWID FROM " + tableName
                + " WHERE ID IS NULL";
        Vector vec = Constants.dao.selectData(query, cols);
        for (int i = 0; i < vec.size(); i++) {
            try {
                
                HashMap map = (HashMap) vec.get(i);
                String rowId = map.get("ROWID").toString();
                String id = key.generatePrimaryKey(tableName,false);
                String update
                        = "  UPDATE " + tableName + " \n"
                        + " SET ID = '" + id + "' \n"
                        + " WHERE ROWID = '" + rowId + "' \n";

                //System.out.println(update);
                Constants.dao.executeUpdate(update, true);
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("Current Record in Progress " + (i+1) + " out of "+vec.size());
        }
    }

}

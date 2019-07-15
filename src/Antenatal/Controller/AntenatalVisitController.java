/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.Controller;

import Antenatal.BO.AntenatalVisitsBo;
import Antenatal.Handler.AntenatalVisitHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author ADMIN
 */
public class AntenatalVisitController {
    AntenatalVisitHandler hdlAntenatalVisit = new AntenatalVisitHandler();
    
   public boolean insertAntenatalVisits(AntenatalVisitsBo objAntenatal) {
       boolean ret = hdlAntenatalVisit.insertAntenatalVisits(objAntenatal);
       if(ret){
           Constants.dao.commitTransaction();
       }
       if(!ret){
           Constants.dao.remoteRollBack();
       }
       return ret;
   }
 
 public List<AntenatalVisitsBo> searchAntenatalVisits(String referenceId,String 
         patientId, String fromDate, String toDate, String isFinal, String pregnancyVisitId) {
      return hdlAntenatalVisit.searchVisits( referenceId, patientId, fromDate, 
              toDate, isFinal, pregnancyVisitId);
  
}
 
 public boolean updateAntenatalVisits(AntenatalVisitsBo objAntenatal) {
       boolean ret = hdlAntenatalVisit.updateAntenatalVisits(objAntenatal);
       if(ret){
           Constants.dao.commitTransaction();
       }
       if(!ret){
           Constants.dao.remoteRollBack();
       }
       return ret;
   }
}

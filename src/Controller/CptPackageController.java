/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Handler.CptPackageHandler;
import java.util.Vector;
import BO.Package;
import utilities.Constants;
import utilities.Database;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped


/**
 *
 * @author PACSLINK
 */

public class CptPackageController implements java.io.Serializable{
        
    CptPackageHandler hdlCptPackage = new CptPackageHandler();
    
    public Vector selectPackageTests(String pacakgeId){
        return hdlCptPackage.selectPacakgeCptList(pacakgeId);
    }
 
    public Vector selectPackageTestsForOrder(String pacakgeId){
        return hdlCptPackage.selectPacakgeCptListForOrder(pacakgeId);
    }
 
    
    public boolean checkIfAlreadyClientWisePacakgeInserted(Package p){
        return hdlCptPackage.checkIfAlreadyClientWisePacakgeInserted(p);
    }
    
    
    public boolean insertTestsInPackage(Package p) {
        if (hdlCptPackage.insertTestsInPackage(p)) {
            Constants.dao.commitTransaction();
            return true;
        } else {
            Constants.dao.rollBack();
            return false;
        }
    }
    
    public boolean deleteCptFromPackage(String packId, String cptId) {

        String query
                = "DELETE FROM " + Database.DCMS.cptPackageDetail + " \n"
                + " WHERE PACKAGE_ID ='" + packId + "' \n "
                + " AND CPT_ID = '" + cptId + "' ";

        boolean ret = Constants.dao.executeUpdate(query, false);
        if (ret) {
            ret = Constants.dao.commitTransaction();

        } 
        if(!ret) {
            Constants.dao.rollBack();

        }
        return ret;
    }
    
    public boolean insertClientWisePacakge(Package p){
        return hdlCptPackage.insertClientWisePackage(p);
    }
    
    public boolean deleteClientWisePacakge(Package p){
        return hdlCptPackage.deleteClientWisePackage(p);
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Setup;

import BO.SetupColumnDetail;
import Handler.SetupColumnDetailHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;
import utilities.Database;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

/**
 *
 * @author Pacslink
 */
public class SetupColumnDetailController implements java.io.Serializable {

    SetupColumnDetailHandler hdlScd = new SetupColumnDetailHandler();

    public List<SetupColumnDetail> searchProperty(String searchString,
            String setupId, String tableRowId) {

        return hdlScd.searchProperty(searchString, setupId, tableRowId);
    }

    
    public List searchSetupColumDetails(String tableRowId, String setupId) {

        return hdlScd.searchSetupColumDetails(tableRowId, setupId);
    }

}

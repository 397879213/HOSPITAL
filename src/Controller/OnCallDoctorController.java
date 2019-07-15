/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BO.OnCallDoctor;
import Handler.OnCallDoctorHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Danish
 */
public class OnCallDoctorController {

    OnCallDoctorHandler objHdl = new OnCallDoctorHandler();

    public List<OnCallDoctor> selectOnCallDoctor(String date, String dutyType) {
        return objHdl.selectOnCallDoctor(date, dutyType);
    }
    
    public boolean insertOnCallDutyRoaster(String selectdate, String copytdate) {
        boolean ret = true;
        List<OnCallDoctor> listInr = new ArrayList();
        listInr = objHdl.selectOnCallDoctor(selectdate, "SELECT");
        ret = objHdl.deleteRoaster(copytdate);
        for (int i = 0; i < listInr.size(); i++) {
            OnCallDoctor obj = listInr.get(i);
            if (ret) {
                ret = objHdl.insertOnCallDutyRoaster(obj, copytdate);
            }
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
        }
        return ret;
    }

    public boolean updateUser(OnCallDoctor com) {
        boolean ret = objHdl.updateUser(com);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
//    public boolean deleteRoaster(String selectDate) {
//        boolean ret = objHdl.deleteRoaster(selectDate);
//        if(ret){
//            Constants.dao.commitTransaction();
//        }
//        if(!ret){
//            Constants.dao.rollBack();
//        }
//        return ret;
//    }

//    public static void main(String[] args) {
//        OnCallDoctorController objCtl = new OnCallDoctorController();
//        objCtl.insertOnCallDutyRoaster("24-NOV-2018", "26-NOV-2018");
//    }
}

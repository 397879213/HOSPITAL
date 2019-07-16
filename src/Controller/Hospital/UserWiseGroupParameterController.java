/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.UserWiseGroupParameterBO;
import Handler.Hospital.UserWiseGroupParameterHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Adeel
 */
public class UserWiseGroupParameterController {

    UserWiseGroupParameterHandler hdlUserParameters = new UserWiseGroupParameterHandler();

    public List<UserWiseGroupParameterBO> selectUserParameters(String userId,
            String groupId) {
        return hdlUserParameters.selectUserParameters(userId, groupId);
    }

    public boolean insertUserParameters(UserWiseGroupParameterBO imp) {
        boolean ret = hdlUserParameters.insertUserParameters(imp);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deleteUsersParameter(String userId, String parameterId,
            String groupId) {
        Boolean ret = hdlUserParameters.deleteUsersParameter(userId, parameterId, groupId);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.SetupTableColumnBO;
import Handler.Administration.SetupTableColumnHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class SetupTableColumnController {

    SetupTableColumnHandler hdlSetupTableColumn = new SetupTableColumnHandler();

    public List<SetupTableColumnBO> selectSetupTableColumn(String id, String setupId) {
        return hdlSetupTableColumn.selectSetupTableColumn(id, setupId);
    }

    public boolean updateSetupTableColumn(SetupTableColumnBO objUpdate) {
        boolean ret = hdlSetupTableColumn.updateSetupTableColumn(objUpdate);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean saveProperty(SetupTableColumnBO objUpdate, String setupId) {
        String id = hdlSetupTableColumn.selectSetupTableColumnID();

        boolean ret = hdlSetupTableColumn.insertSetupTableColumn(id, objUpdate);
        if (setupId.equalsIgnoreCase("1")) {
            if (ret) {
                ret = hdlSetupTableColumn.insertSetupColumnDetail(objUpdate, id);
            }
        } else {
            if (ret) {
                ret = hdlSetupTableColumn.insertSetupColumnDetailOrg(objUpdate, id);
            }
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<SetupTableColumnBO> selectSetupTableColumnProperty(String setupId,
            String description) {
        return hdlSetupTableColumn.selectSetupTableColumnProperty(setupId, description);
    }

    public boolean updatePropertyInfo(SetupTableColumnBO objUpdate) {
        boolean ret = hdlSetupTableColumn.updatePropertyInfo(objUpdate);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}

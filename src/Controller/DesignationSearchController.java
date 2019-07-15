package Controller;

import BO.DesignationSearch;
import Handler.DesignationSearchHandler;
import java.util.List;
import utilities.Constants;

public class DesignationSearchController {

    DesignationSearchHandler hdlDesignation = new DesignationSearchHandler();

    public List<DesignationSearch> selectDesignation(String pofDegId,
            String pofDegDes, String status) {
        return hdlDesignation.selectDesignation(pofDegId, pofDegDes,status);
    }
    
    public boolean updateHsrColumns(List list) {

        boolean ret = hdlDesignation.updateHsrColumns(list);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}

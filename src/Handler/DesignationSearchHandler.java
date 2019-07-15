/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.DesignationSearch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class DesignationSearchHandler implements java.io.Serializable {

    public List<DesignationSearch> selectDesignation(String pofDegId,
            String pofDegDes, String status) {

        String[] selectColumns = {"-", "POF_DEG_ID", "DEG_DESC",
            "POF_GRADE_ID", "GRADE_DESC", "CHILD_ABOVE_12", "CHILD_UNDER_12",
            "SPOUSE", "PARENTS", "SELF", "CLASS","VERIFIED_STATUS"};

        String query
                = "SELECT HSR.POF_DEG_ID,                                  \n"
                + "HSR.DEG_DESC,                                           \n"
                + "HSR.POF_GRADE_ID,                                       \n"
                + "HSR.GRADE_DESC,                                         \n"
                + "HSR.CHILD_ABOVE_12,                                     \n"
                + "HSR.CHILD_UNDER_12,                                     \n"
                + "HSR.SPOUSE,                                             \n"
                + "HSR.PARENTS,                                            \n"
                + "HSR.SELF,                                               \n"
                + "HSR.VERIFIED_STATUS,                                    \n"
                + "HSR.CLASS                                               \n"
                + "FROM " + Database.DCMS.pofHsr + "  HSR                  \n";

        if (status.length() != 0) {
            query += " WHERE HSR.VERIFIED_STATUS = '" + status + "' \n"
                    + "ORDER BY  POF_DEG_ID                         \n";
        }
        if (pofDegId.length() != 0) {
            query += " WHERE HSR.POF_DEG_ID = '" + pofDegId + "' \n"
                    + "ORDER BY  POF_DEG_ID                      \n";
        }

        if (pofDegDes.length() != 0) {
            query += " WHERE HSR.DEG_DESC = '" + pofDegDes + "' \n"
                    + "ORDER BY  POF_DEG_ID                     \n";
        }

        

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<DesignationSearch> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            DesignationSearch set = new DesignationSearch();

            set.setPofDesgId(map.get("POF_DEG_ID").toString());
            set.setPofDegDescription(map.get("DEG_DESC").toString());
            set.setPofGradeId(map.get("POF_GRADE_ID").toString());
            set.setPofGradeDescription(map.get("GRADE_DESC").toString());
            set.setChildAbove12(map.get("CHILD_ABOVE_12").toString());
            set.setChildUnder12(map.get("CHILD_UNDER_12").toString());
            set.setSpouse(map.get("SPOUSE").toString());
            set.setParents(map.get("PARENTS").toString());
            set.setSelf(map.get("SELF").toString());
            set.setPofClass(map.get("CLASS").toString());
            set.setVerifiedStatus(map.get("VERIFIED_STATUS").toString());

            list.add(set);
        }
        return list;
    }

    public boolean updateHsrColumns(List <DesignationSearch> list) {
     boolean ret = true;

        for (int i = 0; i < list.size(); i++) {
            DesignationSearch com = list.get(i);
            String query
                    = " UPDATE " + Database.DCMS.pofHsr + "\n"
                    + " SET GRADE_DESC = '" + com.getPofGradeDescription().replaceAll("'", "''") + "',\n"
                    + " CHILD_ABOVE_12 = '" + com.getChildAbove12().replaceAll("'", "''") + "',\n"
                    + " CHILD_UNDER_12 = '" + com.getChildUnder12().replaceAll("'", "''") + "',\n"
                    + " SPOUSE = '" + com.getSpouse().replaceAll("'", "''") + "',\n"
                    + " PARENTS = '" + com.getParents().replaceAll("'", "''") + "',\n"
                    + " SELF = '" + com.getSelf().replaceAll("'", "''") + "',\n"
                    + " CLASS = '" + com.getPofClass().replaceAll("'", "''") + "',\n"
                    + " VERIFIED_STATUS = 'Y',\n"
                    + " VERIFIED_DATE = " + Constants.today + ",   \n"
                    + " VERIFIED_BY = '" + Constants.userId + "', \n"
                    + " VERIFIED_TERMINAL_ID = '" + Constants.terminalId + "' \n"
                    + " WHERE POF_DEG_ID  = '" + com.getPofDesgId() + "'";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

}

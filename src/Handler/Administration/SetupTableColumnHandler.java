/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.BODailyServices;
import BO.Administration.SetupTableColumnBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class SetupTableColumnHandler {

    public List<SetupTableColumnBO> selectSetupTableColumn(String id, String setupId) {

        String columns[] = {"-", "ID", "SETUP_ID", "PROPERTY", "DEFAULT_VALUE", "REMARKS"};

        String query = " SELECT ST.ID, ST.SETUP_ID, ST.PROPERTY,                \n"
                + "NVL(ST.DEFAULT_VALUE, ' ') DEFAULT_VALUE, NVL(REMARKS, ' ') "
                + "REMARKS "
                + " FROM " + Database.DCMS.setupTableColums + " ST               \n"
                + " WHERE ST.SETUP_ID = " + setupId + "                         \n";
        if (id.trim().length() != 0) {
            query += " AND ST.ID = " + id + "                           \n";
        }
        query += " AND ST.ACTIVE = 'Y'                                  \n"
                + " ORDER BY ST.PROPERTY, ST.ID                                 \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<SetupTableColumnBO> lisData = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            SetupTableColumnBO objBO = new SetupTableColumnBO();

            objBO.setId(map.get("ID").toString());
            objBO.setSetupId(map.get("SETUP_ID").toString());
            objBO.setProperty(map.get("PROPERTY").toString());
            objBO.setDefaultValue(map.get("DEFAULT_VALUE").toString());
            objBO.setRemarks(map.get("REMARKS").toString());
            lisData.add(objBO);
        }
        return lisData;
    }

    public boolean updateSetupTableColumn(SetupTableColumnBO objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.setupTableColums + " SET           \n"
                + " REMARKS  = '" + objUpdate.getRemarks() + "'            \n"
                + "WHERE SETUP_ID = '" + objUpdate.getSetupId() + "'           \n"
                + "AND ID = '" + objUpdate.getId() + "'         \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public String selectSetupTableColumnID() {

        String columns[] = {"-", "ID"};

        String query = " SELECT MAX(ID)+1 ID FROM                               \n"
                + Database.DCMS.setupTableColums + " ST                          \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        return listmap.get(0).get("ID").toString();
    }

    public boolean insertSetupTableColumn(String id, SetupTableColumnBO saveProperty) {

        String[] columns = {Database.DCMS.setupTableColums, "ID", "SETUP_ID",
            "PROPERTY", "DEFAULT_VALUE", "ACTIVE", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + id + "'");
        map.put("SETUP_ID", "'" + saveProperty.getSetupId() + "'");
        map.put("PROPERTY", "'" + saveProperty.getProperty() + "'");
        map.put("DEFAULT_VALUE", "'" + saveProperty.getDefaultValue() + "'");
        map.put("ACTIVE", "'" + saveProperty.getActive() + "'");
        map.put("CRTD_DATE", "" + Constants.today + "");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public boolean insertSetupColumnDetail(SetupTableColumnBO saveProperty, String id) {

        String query = "INSERT INTO " + Database.DCMS.setupColumnDetail + " SELECT USER_NAME, '"
                + id + "', '" + saveProperty.getDescription() + "', '"
                + Constants.userId + "', " + Constants.today + ", '"
                + Constants.terminalId + "' FROM "
                + Database.DCMS.users;

        return Constants.dao.executeUpdate(query, true);
    }

    public boolean insertSetupColumnDetailOrg(SetupTableColumnBO saveProperty, String id) {

        String[] columns = {Database.DCMS.setupColumnDetail, "TABLE_ROW_ID",
            "TABLE_COLUMN_ID", "DESCRIPTION", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("TABLE_ROW_ID", "'332'");
        map.put("TABLE_COLUMN_ID", "'" + id + "'");
        map.put("DESCRIPTION", "'" + saveProperty.getDescription() + "'");
        map.put("CRTD_DATE", "" + Constants.today + "");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public List<SetupTableColumnBO> selectSetupTableColumnProperty(String setupId,
            String description) {

        String columns[] = {"-", "ID", "PROPERTY", "ACTIVE"};

        String query = " SELECT STC.ID, STC.PROPERTY, STC.ACTIVE                 \n"
                + " FROM " + Database.DCMS.setupTableColums + " STC              \n"
                + " WHERE STC.SETUP_ID = " + setupId + "                        \n"
                + " AND UPPER(STC.PROPERTY) LIKE '%" + description + "%'        \n"
                + " ORDER BY STC.PROPERTY, STC.ID                               \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<SetupTableColumnBO> lisData = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            SetupTableColumnBO objBO = new SetupTableColumnBO();

            objBO.setId(map.get("ID").toString());
            objBO.setProperty(map.get("PROPERTY").toString());
            objBO.setActive(map.get("ACTIVE").toString());
            lisData.add(objBO);
        }
        return lisData;
    }

    public boolean updatePropertyInfo(SetupTableColumnBO objUpdate) {

        String query
                = " UPDATE " + Database.DCMS.setupTableColums + " SET           \n"
                + " PROPERTY  = '" + objUpdate.getProperty()+ "',            \n"
                + " ACTIVE  = '" + objUpdate.getActive()+ "'            \n"
                + "WHERE ID = '" + objUpdate.getId() + "'         \n";

        return Constants.dao.executeUpdate(query, false);
    }
}

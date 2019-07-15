/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.Location;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;

/**
 *
 * @author Sibtain
 */
public class LocationHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    //location wise Setup
    public Boolean insertLocWiseSetup(Location loc) {

        List listCols = new ArrayList();
        listCols.add(loc.insertTable);
        // listCols.add("ID");
        listCols.add("LOCATION_ID");
        listCols.add(loc.insertColumn);

        if (loc.insertColumn1 != null && loc.insertColumn1.length() > 0) {
            listCols.add(loc.insertColumn1);
        }
        if (loc.insertColumn2 != null && loc.insertColumn2.length() > 0) {
            listCols.add(loc.insertColumn2);
        }
        if (loc.insertColumn3 != null && loc.insertColumn3.length() > 0) {
            listCols.add(loc.insertColumn3);
        }
        if (loc.insertColumn4 != null && loc.insertColumn4.length() > 0) {
            listCols.add(loc.insertColumn4);
        }

        String[] columns = new String[listCols.size()];
        for (int i = 0; i < columns.length; i++) {
            columns[i] = listCols.get(i).toString();
        }
        HashMap map = new HashMap();
       // String id = key.generatePrimaryKey(Keys.locationWiseSetup);
        //  map.put("ID", "'" + id + "'");
        map.put("LOCATION_ID", "'" + loc.id + "'");
        map.put("" + loc.insertColumn + "", "'" + loc.unAttachedId + "'");
        map.put("" + loc.insertColumn1 + "", "'" + loc.fieldValue1 + "'");
        map.put("" + loc.insertColumn2 + "", "'" + loc.fieldValue2 + "'");
        List location = new ArrayList();
        location.add(map);
        return Constants.dao.insertData(location, columns);

    }

    //location wise setup - Search Attached Query
    public List setSelectionforAttached(Location loc, String search) {
        String columns[] = {"-", "ATTACH_ID", "DESCRIPTION", "INSERT_COLUMN_1",
            "INSERT_COLUMN_2"};

        String col1 = loc.insertColumn1;
        String col2 = loc.insertColumn2;

        if (loc.insertColumn1 == null) {
            col1 = loc.insertColumn;
        }
        if (loc.insertColumn2 == null) {
            col2 = loc.insertColumn;
        }

        String query = " SELECT                                             \n"
                + " NVL(LOC." + col1 + ",'-1') INSERT_COLUMN_1             ,\n"
                + " NVL(LOC." + col2 + ",'-1') INSERT_COLUMN_2             ,\n"
                + " ST." + loc.selectColumnId + "   ATTACH_ID              ,\n"
                + " ST." + loc.selectColumnDescription + "   DESCRIPTION    \n"
                + " FROM                                                    \n"
                + loc.insertTable + "    LOC,                               \n"
                + loc.selectTable + "    ST                                 \n"
                + " WHERE ST." + loc.selectColumnId + " = LOC." + loc.insertColumn + "  \n"
                + " AND LOC.LOCATION_ID = '" + loc.id + "'  \n";

        if (search.trim().length() != 0) {
            query += "  AND UPPER(ST." + loc.selectColumnDescription + ") LIKE '%"
                    + search.trim().toUpperCase() + "%'";
        }
        query += " ORDER BY ST." + loc.selectColumnDescription;

        List list = Constants.dao.selectDatainList(query, columns);
        List listLocation = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            Location location = new Location();
            location.attachedId = map.get("ATTACH_ID").toString();
            location.attachedDesc = map.get("DESCRIPTION").toString();
            location.fieldValue1 = (String) map.get("INSERT_COLUMN_1");
            location.fieldValue2 = (String) map.get("INSERT_COLUMN_2");
            listLocation.add(location);
        }
        return listLocation;

    }

//location wise setup - Search UnAttached Query
    public List setSelectionforUnAttached(Location loc, String search) {

        String columns[] = {"-", "UNATTACH_ID", "DESCRIPTION"};

        String query = " SELECT                                             \n"
                + " LOC." + loc.selectColumnId + " UNATTACH_ID             ,\n"
                + " LOC." + loc.selectColumnDescription + " DESCRIPTION       \n"
                + " FROM                                                    \n"
                + loc.selectTable + "    LOC                                \n"
                + " WHERE " + loc.selectColumnId + " NOT IN                 \n"
                + "(SELECT " + loc.insertColumn + " FROM " + loc.insertTable + " \n"
                + " WHERE LOCATION_ID = " + loc.id + " )                     \n";

        if (Integer.parseInt(loc.defTypeId) != 0) {
            query += " AND LOC.DEF_TYPE_ID = " + loc.defTypeId + " \n";
        }

        if (search.trim().length() != 0) {
            query += " AND UPPER(LOC." + loc.selectColumnDescription + ") LIKE '%"
                    + search.trim().toUpperCase() + "%'";
        }

        query += " ORDER BY LOC." + loc.selectColumnDescription;

        System.out.println(query);

        List list = Constants.dao.selectDatainList(query, columns);
        List listLocation = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            Location location = new Location();
            location.unAttachedId = map.get("UNATTACH_ID").toString();
            location.unAttachedDesc = map.get("DESCRIPTION").toString();

            listLocation.add(location);
        }
        return listLocation;

    }

    //location wise setup
    public Boolean deleteLocWiseSetup(Location loc) {
        String query = "DELETE FROM \n"
                + " " + loc.insertTable + " "
                + " WHERE LOCATION_ID = '" + loc.id + "'"
                + " AND " + loc.insertColumn + " = '" + loc.attachedId + "'";
        return Constants.dao.executeUpdate(query, false);

    }

    public Vector selectAllLocations() {

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.location;

        Vector vec = Constants.dao.selectData(query, columns);
        Vector vecLocations = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Location loc = new Location();
            loc.id = map.get("ID").toString();
            loc.description = map.get("DESCRIPTION").toString();
            vecLocations.add(loc);
        }
        return vecLocations;
    }

    /**
     * Search Locations with clients
     *
     * @param description
     * @return
     */
    public List<Location> searchLocations(String description) {

        String[] columns = {"-", "ID", "DESCRIPTION", "ACTIVE", "CLIENT_ID",
            "CLIENT_NAME", "TYPE_DESCRIPTION", "LOCATION_TYPE_ID"};

        String query
                = "  SELECT LOC.ID,                          \n"
                + "  LOC.DESCRIPTION,                        \n"
                + "  LOC.ACTIVE,                             \n"
                + "  LOC.LOCATION_TYPE_ID,                   \n"
                + "  LST.DESCRIPTION TYPE_DESCRIPTION,       \n"
                + "  LOC.CLIENT_ID,                          \n"
                + "  CLT.DESCRIPTION CLIENT_NAME             \n"
                + "  FROM                                    \n"
                + Database.DCMS.location + "  LOC,           \n"
                + Database.DCMS.client + "  CLT,             \n"
                + Database.DCMS.definitionTypeDetail + " LST \n"
                + " WHERE CLT.ID =  LOC.CLIENT_ID            \n"
                + " AND LOC.LOCATION_TYPE_ID = LST.ID        \n";

        if (description.length() != 0) {
            query += " AND LOC.DESCRIPTION LIKE '%" + description + "%' ";
        }
        query += " ORDER BY LOC.ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            Location loc = new Location();
            loc.id = map.get("ID").toString();
            loc.description = map.get("DESCRIPTION").toString();
            loc.locationTypeId = map.get("LOCATION_TYPE_ID").toString();
            loc.locationTypeDescription = map.get("TYPE_DESCRIPTION").toString();
            loc.active = map.get("ACTIVE").toString();
            loc.clientId = map.get("CLIENT_ID").toString();
            loc.clientName = map.get("CLIENT_NAME").toString();
            list.add(loc);
        }
        return list;
    }

    public List<Location> getALlLocationId() {

        String[] columns = {"-", "ID"};
        String query = " SELECT ID  FROM " + Database.DCMS.location + " \n";
        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();
        for (int i = 0; i < li.size(); i++) {
            list.add(((HashMap) li.get(i)).get("ID").toString());
        }
        return list;
    }

    public static void main(String[] args) {
        LocationHandler h = new LocationHandler();

        Calendar now = Calendar.getInstance();   // Gets the current date and time
        System.out.println(now.get(Calendar.YEAR));

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.Location;
import BO.SetupColumnDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;

/**
 *
 * @author Sibtain
 */
public class SetupColumnDetailHandler  implements java.io.Serializable{

    GenerateKeys key = new GenerateKeys();
     
    
         public List<Location> searchLocationDetails(String id, String setupTableId) {

        String[] columns = {"-", "ID", "COLUMN_ID", "TABLE_ROW_ID", "PROPERTY",
            "DESCRIPTION"};

        String query
                = "SELECT 					\n"
                + " SCD.ID ,					\n"
                + " STC.ID COLUMN_ID , 				\n"
                + " SCD.TABLE_ROW_ID TABLE_ROW_ID,              \n"
                + " STC.PROPERTY , 				\n"
                + " NVL(SCD.DESCRIPTION,' ') DESCRIPTION        \n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC,      \n"
                + Database.DCMS.setupColumnDetail + "  SCD      \n"
                + " WHERE SETUP_ID = '" + setupTableId + "'     \n"
                + " AND STC.ID = SCD.TABLE_COLUMN_ID    \n"
                + " AND SCD.TABLE_ROW_ID = '" + id + "' \n"
                + " AND STC.ACTIVE = 'Y'                \n"
                + " ORDER BY SCD.ID ";

       

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            Location loc = new Location();
            loc.setupColumnDetailId = map.get("ID").toString();
            loc.tableColumnId = map.get("COLUMN_ID").toString();
            loc.tableRowId = map.get("TABLE_ROW_ID").toString();
            loc.property = map.get("PROPERTY").toString();
            loc.description = map.get("DESCRIPTION").toString();
            list.add(loc);
        }
        return list;
    }

    public List<SetupColumnDetail> searchProperty(String searchString,
            String setupTableId,String tableRowId) {

        String[] columns = {"-", "COLUMN_ID", "SETUP_ID", "ACTIVE" ,   "PROPERTY", "VALUE"};

        String query
                = " SELECT      				\n"
                + " STC.ID COLUMN_ID , 				\n"
                + " STC.SETUP_ID,                               \n"
                + " STC.ACTIVE,                                 \n"
                + " NVL(STC.DEFAULT_VALUE, ' ')VALUE,           \n"
                + " STC.PROPERTY 				\n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC       \n"
                + " WHERE SETUP_ID = '" + setupTableId + "'     \n";

        if (searchString.trim().length() != 0) {
            query += " AND UPPER(STC.PROPERTY) LIKE '%"+searchString+"%'  \n";
        }
        query += " ORDER BY STC.ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            SetupColumnDetail loc = new SetupColumnDetail();
            loc.setTableColumnId(map.get("COLUMN_ID").toString());
            loc.setTableRowId(tableRowId);
            loc.setDescription(map.get("VALUE").toString());
            loc.setProperty(map.get("PROPERTY").toString());
            loc.setActive(map.get("ACTIVE").toString());
            loc.setId(map.get("COLUMN_ID").toString());
            
            list.add(loc);
        }
        return list;
    }

    public List<Location> searchSetupTableFields(String setupTableId) {

        String[] columns = {"-", "ID", "PROPERTY", "ACTIVE", "SETUP_ID", "VALUE"};

        String query
                = " SELECT 					\n"
                + " STC.ID           ID,        		\n"
                + " STC.PROPERTY     PROPERTY,                  \n"
                + " NVL(STC.DEFAULT_VALUE , ' ')  VALUE,        \n"
                + " STC.ACTIVE       ACTIVE,                    \n"
                + " STC.SETUP_ID     SETUP_ID			\n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC       \n"
                + " WHERE STC.SETUP_ID = '" + setupTableId + "'   \n"
                + " ORDER BY ID   \n";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            Location loc = new Location();
            loc.setupTableColumnId = map.get("ID").toString();
            loc.property = map.get("PROPERTY").toString();
            loc.activeProperty = map.get("ACTIVE").toString();
            loc.propertyValue = map.get("VALUE").toString();
            loc.setupId = map.get("SETUP_ID").toString();
            list.add(loc);
        }
        return list;
    }
 
 
    public List<SetupColumnDetail> searchSetupColumDetails(String tableRowId, String setupId) {

        String[] columns = {"-",   "TABLE_COLUMN_ID", "TABLE_ROW_ID",
            "PROPERTY", "DESCRIPTION"};

        String query
                = " SELECT                           \n"
                + " SCD.TABLE_COLUMN_ID TABLE_COLUMN_ID,        \n"
                + " SCD.TABLE_ROW_ID TABLE_ROW_ID,              \n"
                + " STC.PROPERTY , 				\n"
                + " NVL(SCD.DESCRIPTION,' ') DESCRIPTION        \n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC,      \n"
                + Database.DCMS.setupColumnDetail + "  SCD      \n"
                + " WHERE SETUP_ID = '" + setupId + "'          \n"
                + " AND STC.ID = SCD.TABLE_COLUMN_ID            \n"
                + " AND SCD.TABLE_ROW_ID = '" + tableRowId + "' \n"
                + " AND STC.ACTIVE = 'Y'                        \n"
                + " ORDER BY ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();
        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            SetupColumnDetail loc = new SetupColumnDetail();
           // loc.setId(map.get("ID").toString());
            loc.setTableColumnId(map.get("TABLE_COLUMN_ID").toString());
            loc.setTableRowId(tableRowId);
            loc.setProperty(map.get("PROPERTY").toString());
            loc.setDescription(map.get("DESCRIPTION").toString());
            list.add(loc);
        }
        return list;
    }

    public static void main(String[] args) {
        SetupColumnDetailHandler h = new SetupColumnDetailHandler();
        
    }

}

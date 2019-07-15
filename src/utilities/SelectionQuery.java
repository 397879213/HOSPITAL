/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author pacslink
 */



public class SelectionQuery {

    public static String locationQuery(String description) {

        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.location + " LOC \n"
                + " WHERE ID IN (SELECT ATTACHED_LOCATION_ID FROM  "
                + Database.DCMS.locationWiseLocation + " LWL \n"
                + " WHERE LWL.LOCATION_ID = '" + Constants.userLocationId + "') \n"
                + " AND UPPER(DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'"
                + " ORDER BY LOC.ID ";
        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query
                    = "  SELECT ID , DESCRIPTION  FROM \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE ACTIVE = 'Y'"
                    + " AND UPPER(DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'"
                    + " ORDER BY LOC.ID ";
        }

        return query;
    }

    public static String selectAllLocation() {
        String query
                = " SELECT ID FROM \n"
                + Database.DCMS.location + " LOC    \n"
                + " WHERE ID IN (SELECT ATTACHED_LOCATION_ID FROM    "
                + Database.DCMS.locationWiseLocation + " LWL        \n"
                + " WHERE LWL.LOCATION_ID = '" + Constants.userLocationId + "') \n"
                + " AND ACTIVE = 'Y'";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = "  SELECT ID FROM \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE ACTIVE = 'Y'";
        }
        return query;
    }

    public static String departmentSearchQuery(String description) {

        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.department + " LOC \n"
                + " WHERE ID IN (SELECT DEPARTMENT_ID FROM  "
                + Database.DCMS.locationWiseDepartment + " LWD \n"
                + " WHERE LWD.LOCATION_ID = '" + Constants.locationId + "') \n"
                + " AND DEF_TYPE_ID = " + DefinitionTypes.department
                + " AND UPPER(DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query
                    = "  SELECT ID , DESCRIPTION  FROM \n"
                    + Database.DCMS.department + " LOC \n"
                    + " WHERE DEF_TYPE_ID = " + DefinitionTypes.department
                    + " AND UPPER(DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'"
                    + " AND ACTIVE = 'Y'";
        }
        return query;
    }

    public static String departmentSearchQuery(String locationId, String description) {

        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.department + " LOC \n"
                + " WHERE ID IN (SELECT DEPARTMENT_ID FROM  "
                + Database.DCMS.locationWiseDepartment + " LWD \n"
                + " WHERE LWD.LOCATION_ID = '" + locationId + "') \n"
                + " AND DEF_TYPE_ID = " + DefinitionTypes.department
                + " AND UPPER(DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query
                    = "  SELECT ID , DESCRIPTION  FROM \n"
                    + Database.DCMS.department + " \n"
                    + " WHERE DEF_TYPE_ID = " + DefinitionTypes.department
                    + " AND UPPER(DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'"
                    + " AND ACTIVE = 'Y'";
        }

        return query;
    }

    public static String selectAllUserDepartment() {

        String query
                = "  SELECT ID FROM \n"
                + Database.DCMS.department + " LOC \n"
                + " WHERE ID IN (SELECT DEPARTMENT_ID FROM  "
                + Database.DCMS.locationWiseDepartment + " LWD \n"
                + " WHERE LWD.LOCATION_ID = '" + Constants.userLocationId + "') \n"
                + " AND DEF_TYPE_ID = " + DefinitionTypes.department
                + " AND ACTIVE = 'Y'";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = "  SELECT ID FROM \n"
                    + Database.DCMS.department + " LOC \n"
                    + " WHERE DEF_TYPE_ID = " + DefinitionTypes.department
                    + " AND ACTIVE = 'Y'";
        }
        return query;
    }

    public static String selectUserDepartment() {

        String query
                = " SELECT ID FROM \n" + Database.DCMS.department
                + " WHERE ID IN (SELECT DEPARTMENT_ID FROM  "
                + Database.DCMS.users
                + " WHERE USER_NAME = '" + Constants.userId + "') \n";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = " SELECT ID FROM \n"
                    + Database.DCMS.department + " LOC \n"
                    + " WHERE DEF_TYPE_ID = " + DefinitionTypes.department
                    + " AND ACTIVE = 'Y'";
        }
        return query;
    }
    
    public static String userWiseLocationLOV() {
        
        
        String query = "  SELECT LOCATION_ID ID , DESCRIPTION   FROM  \n"
                + Database.DCMS.userWiseLocations + " UWL,       \n"
                + Database.DCMS.location + " LOC       \n"
                + " WHERE USER_ID  = '" + Constants.userId + "' \n"
                + " AND  UWL.LOCATION_ID =  LOC.ID  ";
        
        System.out.println(query);

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = "  SELECT ID, DESCRIPTION  FROM \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE ACTIVE = 'Y'";
        }
        return query;
    }


    public static String selectUserWiseLocation() {
        
        
        String query = "  SELECT LOCATION_ID ID   FROM              \n"
                + Database.DCMS.userWiseLocations + " LOC       \n"
                + " WHERE USER_ID  = '" + Constants.userId + "' \n";
        
      //  System.out.println(query);

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = "  SELECT ID FROM \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE ACTIVE = 'Y'";
        }
        return query;
    }

    public static String selectUserWiseDepartment() {

        String query = "  SELECT DEPARTMENT_ID  FROM          \n"
                + Database.DCMS.userWiseDepartment + " UWD       \n"
                + " WHERE USER_ID  = '" + Constants.userId + "' \n";

        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = "  SELECT ID FROM \n"
                    + Database.DCMS.department + " LOC \n"
                    + " WHERE ACTIVE = 'Y'";
        }
        return query;
    }

    public static String selectLocationWiseDepartment() {
        
        String query
                = "  SELECT DEPARTMENT_ID  FROM                         \n"
                + Database.DCMS.locationWiseDepartment + " LWD,         \n"
                + Database.DCMS.location + " LOC                        \n"
                + " WHERE LOCATION_ID  = '" + Constants.locationId + "' \n"
                + " AND LWD.LOCATION_ID = LOC.ID  \n"
                + " AND LOC.ACTIVE = 'Y' \n";
        if (Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            query = " SELECT ID FROM \n"
                    + Database.DCMS.department + " LOC \n"
                    + " WHERE DEF_TYPE_ID = " + DefinitionTypes.department
                    + " AND ACTIVE = 'Y'";
        }
        return query;
    }

}

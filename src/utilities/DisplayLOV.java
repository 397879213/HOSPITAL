package utilities;

import BO.LOV;
import BO.MedicineOrderEntry;

import BO.StudyData;

import LOV.CaseSenstiveLOV;
import LOV.GeneralLOV;

import LOV.LOVHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.JInternalFrame;

public class DisplayLOV {

    public static Vector orders = new Vector();
    public static Vector orderedCPT = new Vector();
    public static List Pharmacyorder = new ArrayList();

    LOVHandler hdlLOV = new LOVHandler();

    public void LOVSelection(String query, JInternalFrame t) {

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";

        String[] columns = {"-", "ID", "DESCRIPTION"};

        Vector hashLOV = Constants.dao.selectData(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get("ID"));
            lov.setDescription((String) mapLOV.get("DESCRIPTION"));
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    public void LOVTeleSelection(String query, JInternalFrame t) {

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";

        String[] columns = {"-", "ID", "DESCRIPTION"};

        List hashLOV = Constants.dao.selectTeleradiologyDatainList(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get("ID"));
            lov.setDescription((String) mapLOV.get("DESCRIPTION"));
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    public void LOVCaseSensitiveSelection(String query, JInternalFrame t) {

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";

        String[] columns = {"-", "ID", "DESCRIPTION"};

        Vector hashLOV = Constants.dao.selectData(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get("ID"));
            lov.setDescription((String) mapLOV.get("DESCRIPTION"));
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            CaseSenstiveLOV fm = new CaseSenstiveLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    public void LOVSpecializedSelection(String query, String table, JInternalFrame t, String[] columns) {

        System.out.println("Query =" + query);
        Vector hashLOV = Constants.dao.selectData(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get(columns[1]));
            //    lov.description = (String) mapLOV.get("DESCRIPTION");
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            // Constants.lovDescription = "DESCRIPTION";
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = "DESCRIPTION";
            Constants.lovID = lov.getId();
        }

    }

    public void LOVDefinitionSelection(String type, String search, JInternalFrame t) {

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query = " SELECT ID, UPPER(DESCRIPTION)DESCRIPTION FROM \n"
                + Database.DCMS.definitionTypeDetail + " \n"
                + "  WHERE DEF_TYPE_ID = " + type + " \n"
                + "  AND UPPER(DESCRIPTION) LIKE '%" + search.toUpperCase().trim() + "%'\n"
                + "  AND ACTIVE = 'Y' \n"
                + "  ORDER BY ID ";

        Vector hashLOV = Constants.dao.selectData(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get("ID"));
            lov.setDescription((String) mapLOV.get("DESCRIPTION"));
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    public void LOVGeneralSelection(String table, String search, JInternalFrame t) {

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";

        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query = " SELECT ID, DESCRIPTION FROM "
                + table
                + "  WHERE UPPER(DESCRIPTION) LIKE '%" + search.toUpperCase().trim() + "%'\n"
                + "  AND ACTIVE = 'Y' \n"
                + "  ORDER BY ID ";

        Vector hashLOV = Constants.dao.selectData(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get("ID"));
            lov.setDescription((String) mapLOV.get("DESCRIPTION"));
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    

   
  

   
 

    public void LOVSpecializedSelection(String query, JInternalFrame t) {

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";

        String[] columns = {"-", "USER_NAME", "NAME", "DESCRIPTION"};

        Vector hashLOV = Constants.dao.selectData(query, columns);
        Vector vecLOV = new Vector();
        for (int i = 0; i < hashLOV.size(); i++) {
            HashMap mapLOV = (HashMap) hashLOV.get(i);
            LOV lov = new LOV();
            lov.setId((String) mapLOV.get("USER_NAME"));
            lov.setDescription((String) mapLOV.get("NAME"));
            //Only use for description
            lov.setType((String) mapLOV.get("DESCRIPTION"));
            vecLOV.add(lov);
        }

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
            Constants.userDesignation = lov.getType();
        }

    }

   
    /**
     * Used for InMemory Selection Technique of PRev Medication Orders,Called
     * From OPD Consultancy Form
     *
     * @param listCollections Pass the Collections to the LOV on which Search is
     * Performed
     * @param t
     * @param search Search String used on Collections
     */
    public void LOVInvestigationOrder(Vector listCollections, String search, JInternalFrame t) {

        Set<LOV> hs = new HashSet<>();
        Vector vecLOV = new Vector();
        Vector hashLOV = new Vector();
        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";
        for (Iterator iterator = listCollections.iterator(); iterator.hasNext();) {
            LOV lov = new LOV();
            StudyData study = (StudyData) iterator.next();
            if (search.length() == 0) { //nothing mentioned
                lov.setId(study.getCptId());
                lov.setDescription(study.getCpt());

            } else if (study.getCpt().startsWith(search)) {
                lov.setId(study.getCptId());
                lov.setDescription(study.getCpt());
            }
            vecLOV.add(lov);
        }

        /**
         * just to remove the ordering of the data*
         */
        hs.addAll(vecLOV);
        vecLOV.clear();
        vecLOV.addAll(hs);

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    /* Used for InMemory Selection Technique of PRev Investigation Orders,Called From OPD Consultancy Form
     * @param listCollections Pass the Collections to the LOV on which Search is Performed
     * @param t 
     * @param search Search String used on Collections
     */
    public void LOVMedicationOrder(Vector listCollections, String search, JInternalFrame t) {

        Set<LOV> hs = new HashSet<>();
        Vector vecLOV = new Vector();
        Vector hashLOV = new Vector();
        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";
        for (Iterator iterator = listCollections.iterator(); iterator.hasNext();) {
            LOV lov = new LOV();
            MedicineOrderEntry medicationOrder = (MedicineOrderEntry) iterator.next();
            if (search.length() == 0) { //nothing mentioned
                lov.setId(medicationOrder.getItemId());
                lov.setDescription(medicationOrder.getItemDescription());

            } else if (medicationOrder.getItemDescription().startsWith(search)) {
                lov.setId(medicationOrder.getItemId());
                lov.setDescription(medicationOrder.getItemDescription());

            }
            vecLOV.add(lov);
        }

        /**
         * just to remove the ordering of the data*
         */
        hs.addAll(vecLOV);
        vecLOV.clear();
        vecLOV.addAll(hs);

        if (vecLOV.size() > 1) {
            GeneralLOV fm = new GeneralLOV(null, true);
            fm.setLov(vecLOV);
            fm.setLocationRelativeTo(t);
            fm.setVisible(true);
        } else if (vecLOV.size() == 1) {
            LOV lov = (LOV) vecLOV.get(0);
            Constants.lovDescription = lov.getDescription();
            Constants.lovID = lov.getId();
        }
    }

    

    /**
     * *****************************LOV STATIC QUERIES*************************
     */
    public static class Inventory {

        public static String storeSelection //select store from StoreWiseUsers
                = " SELECT S.ID,S.DESCRIPTION FROM "
                + Database.DCMS.storeWiseUser + "  ST ,"
                + Database.DCMS.store + " S "
                + "   WHERE ST.USER_ID='" + Constants.userId + "'"
                + "  AND S.ID=ST.STORE_ID "
                + "  AND S.ACTIVE= 'Y' "
                + "  AND ST.ACTIVE='Y' ";

        public static String userSelection //select store from StoreWiseUsers
                = "SELECT U.USER_NAME ID,U.NAME DESCRIPTION FROM "
                + Database.DCMS.users + " U "
                + "WHERE LOCATION_ID='" + Constants.locationId + "'";

        public static String genericSelection //select store from StoreWiseUsers
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.definitionTypeDetail + "   \n"
                + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.generic + "'  \n"
                + " AND ACTIVE = 'Y'";

        public static String itemTypeIdSelection //select store from StoreWiseUsers
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.definitionTypeDetail + "   \n"
                + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.medicineItemType + "'  \n"
                + " AND ACTIVE = 'Y'";

        public static String itemCategorySelection //select store from StoreWiseUsers
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.definitionTypeDetail + "   \n"
                + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.itemCategory + "'  \n"
                + " AND ACTIVE = 'Y'";

        public static String itemSpecialitySelection //select store from StoreWiseUsers
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.definitionTypeDetail + "   \n"
                + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.speciality + "'  \n"
                + " AND ACTIVE = 'Y'";

        public static String itemManufacturSelection //select store from StoreWiseUsers
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.Inventory.party + "   \n"
                + " WHERE ACTIVE = 'Y'";

        public static String itemRequestedSelection //select store from StoreWiseUsers
                = "  SELECT USER_NAME ID ,NAME DESCRIPTION  FROM \n"
                + Database.DCMS.users + "  USR \n"
                + " WHERE USR.DESIGNATION_ID = '" + Designations.doctor + "' \n"
                + " AND ACTIVE = 'Y'";

        public static String itemSelection //select store from StoreWiseUsers
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.item + "   \n"
                + "WHERE ACTIVE ='Y'";

    }
}

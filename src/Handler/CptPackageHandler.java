
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.OrderData;
import BO.Package;
import utilities.Constants;
import utilities.Database;
import java.util.HashMap;
import java.util.Vector;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author
 *
 */
public class CptPackageHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public boolean insertDefinitionType(Package definitionType) {
        String[] columns = {Database.DCMS.definitionType, "ID",
            "DESCRIPTION", "ACTIVE"};

        HashMap map = new HashMap();
        map.put("ID", "'" + definitionType.id + "'");
        map.put("DESCRIPTION", "'" + definitionType.description + "'");
        map.put("ACTIVE", "'" + definitionType.active + "'");
        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);
    }

    // insert new package
    public boolean insertDefinitionTypeDetail(Package packge) {
        String[] columns = {Database.DCMS.definitionTypeDetail, "ID", "DEF_TYPE_ID", "DESCRIPTION", "ACTIVE"};

        HashMap map = new HashMap();
        map.put("ID", "'" + packge.id + "'");
        map.put("DEF_TYPE_ID", "'" + packge.defTypeId + "'");
        map.put("DESCRIPTION", "'" + packge.description + "'");
        map.put("ACTIVE", "'" + packge.active + "'");
        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);
    }

    public boolean insertTestsInPackage(Package pacakge) {
        String[] columns = {Database.DCMS.cptPackageDetail,
            "PACKAGE_ID", "CPT_ID"};

        HashMap map = new HashMap();
        map.put("PACKAGE_ID", "'" + pacakge.id + "'");
        map.put("CPT_ID", "'" + pacakge.cptId + "'");
        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);
    }

    public boolean insertClientWisePackage(Package pacakge) {
        String[] columns = {Database.DCMS.clientWisePackage,
            "ID", "PACKAGE_ID", "CLIENT_ID", "LOCATION_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + key.generatePrimaryKey(Keys.clientWisePackage, false) + "'");
        map.put("PACKAGE_ID", "'" + pacakge.pacakgeId + "'");
        map.put("CLIENT_ID", "'" + pacakge.clientId + "'");
        map.put("LOCATION_ID", "'" + pacakge.locationId + "'");
        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);
    }

    public boolean deleteClientWisePackage(Package packge) {
        String query
                = " DELETE FROM " + Database.DCMS.clientWisePackage + " \n"
                + " WHERE CLIENT_ID ='" + packge.clientId + "' \n "
                + " AND PACKAGE_ID = '" + packge.pacakgeId + "' \n"
                + " AND LOCATION_ID = '" + packge.locationId + "' ";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean checkIfAlreadyClientWisePacakgeInserted(Package p) {
        String[] cols = {"ID"};
        String query
                = "SELECT ID FROM \n"
                + Database.DCMS.clientWisePackage + " \n"
                + " WHERE CLIENT_ID ='" + p.clientId + "' \n "
                + " AND PACKAGE_ID = '" + p.pacakgeId + "' \n"
                + " AND LOCATION_ID = '" + p.locationId + "' ";
        Vector hashRecords = Constants.dao.selectData(query, cols);

        if (hashRecords.size() < 1) {
            return true;
        } else {
            return false;
        }
    }

    public Vector selectClientPackageList(String pacakgeId) {

        String[] columns = {"", "CPT_ID", "CLIENT_ID", "CPT", "PACKAGE_ID",
            "CLIENT", "PACKAGE"};

        String query = "Select"
                + " CP.CPT_ID, "
                + " CL.ID CLIENT_ID,\n"
                + " CP.DESCRIPTION CPT  ,\n"
                + " CWP.PACKAGE_ID PACKAGE_ID      ,\n"
                + " CL.DESCRIPTION CLIENT  ,\n"
                + " DTD.DESCRIPTION PACKAGE     \n"
                + " FROM DEFINITION_TYPE_DETAIL DTD, \n"
                + " CPT CP, \n"
                + " CLIENT CL, \n"
                + " DEFINITION_TYPE DT,\n"
                + " CPT_PACKAGE_DETAIL CPD ,\n"
                + " CLIENT_WISE_PACAKGE CWP \n"
                + " WHERE CP.CPT_ID = CPD.CPT_ID \n"
                + " AND CPD.ACTIVE = '" + "Y" + "'\n"
                + " AND CPD.PACKAGE_ID = CWP.PACKAGE_ID \n"
                + " AND CWP.Client_Id = CL.ID "
                + " AND DTD.ID = CPD.PACKAGE_ID \n"
                + " AND DTD.DEF_TYPE_ID = DT.ID \n"
                + " AND DTD.ID = '" + pacakgeId + "'";

        System.out.println(query);

        Vector hashRecords = Constants.dao.selectData(query, columns);
        Vector<Package> listCptReports = new Vector();
        for (int i = 0; i < hashRecords.size(); i++) {
            HashMap hashreporting = (HashMap) hashRecords.get(i);
            Package report = new Package();
            report.cptId = (String) hashreporting.get("CPT_ID");
            report.cptDescription = (String) hashreporting.get("CPT");
            report.clientId = (String) hashreporting.get("CLIENT_ID");
            report.clientDescription = (String) hashreporting.get("CLIENT");
            report.pacakgeId = (String) hashreporting.get("PACKAGE_ID");
            report.packageName = (String) hashreporting.get("PACKAGE");
            listCptReports.add(report);
        }
        return listCptReports;
    }

    public Vector selectPacakgeCptList(String pacakgeId) {
        String[] columns = {"", "CPT_ID", "PACKAGE_ID", "CPT_DESCRIPTION", "PACKAGE_NAME"};

        String query = "Select"
                + " CP.CPT_ID, "
                + " CP.DESCRIPTION CPT_DESCRIPTION  ,\n"
                + " CPD.PACKAGE_ID       ,\n"
                + " DTD.DESCRIPTION PACKAGE_NAME     \n"
                + " FROM "
                + Database.DCMS.definitionTypeDetail + "  DTD,\n"
                + Database.DCMS.CPT + "  CP,\n"
                + Database.DCMS.definitionType + "  DT,\n"
                + Database.DCMS.cptPackageDetail + "  CPD \n"
                + " WHERE CP.CPT_ID = CPD.CPT_ID \n"
                + " AND DTD.ID = CPD.PACKAGE_ID \n"
                + " AND DTD.DEF_TYPE_ID = DT.ID \n"
                + " AND DTD.ID = '" + pacakgeId + "'";

        System.out.println(query);

        Vector hashRecords = Constants.dao.selectData(query, columns);
        Vector<Package> listCptReports = new Vector();
        for (int i = 0; i < hashRecords.size(); i++) {
            HashMap hashreporting = (HashMap) hashRecords.get(i);
            Package report = new Package();
            report.cptId = (String) hashreporting.get("CPT_ID");
            report.cptDescription = (String) hashreporting.get("CPT_DESCRIPTION");
            report.pacakgeId = (String) hashreporting.get("PACKAGE_ID");
            report.packageName = (String) hashreporting.get("PACKAGE_NAME");
            listCptReports.add(report);
        }
        return listCptReports;
    }

    public Vector selectPacakgeCptListForOrder(String pacakgeId) {
        String[] columns = {"", "CPT_ID", "COST", "SECTION_ID", "CPT_DESCRIPTION"};

        String query = "Select"
                + " CP.CPT_ID                       ,\n"
                + " CP.DESCRIPTION CPT_DESCRIPTION  ,\n"
                + " CP.SECTION_ID                   ,\n"
                + " CP.COST                          \n"
                + " FROM " + Database.DCMS.CPT + " CP   ,\n"
                + Database.DCMS.cptPackageDetail + " CPD \n"
                + " WHERE CPD.PACKAGE_ID = '" + pacakgeId + "' \n"
                + " AND CP.CPT_ID = CPD.CPT_ID \n"
                + " AND CPD.ACTIVE = '" + "Y" + "'\n";

        Vector hashRecords = Constants.dao.selectData(query, columns);
        Vector vecCptReports = new Vector();
        for (int i = 0; i < hashRecords.size(); i++) {
            HashMap hashreporting = (HashMap) hashRecords.get(i);
            OrderData order = new OrderData();
            order.setCptId((String) hashreporting.get("CPT_ID"));
            order.setCptDescription((String) hashreporting.get("CPT_DESCRIPTION"));
            order.setOriginalPrice((String) hashreporting.get("COST"));
            order.setSectionId((String) hashreporting.get("SECTION_ID"));
            vecCptReports.add(order);
        }
        return vecCptReports;
    }

    public Vector selectCptTests() {
        String[] columns = {"", "CPT_ID", "DESCRIPTION", "ACTIVE"};

        String query
                = "SELECT CPT_ID, DESCRIPTION,ACTIVE \n"
                + " FROM " + Database.DCMS.CPT
                + " WHERE ACTIVE = 'Y'";

        System.out.println(query);
        Vector hashRecords = Constants.dao.selectData(query, columns);
        Vector<Package> listCptReports = new Vector<>();
        for (int i = 0; i < hashRecords.size(); i++) {
            HashMap hashreporting = (HashMap) hashRecords.get(i);
            Package report = new Package();
            report.id = (String) hashreporting.get("CPT_ID");
            report.description = (String) hashreporting.get("DESCRIPTION");
            report.active = (String) hashreporting.get("ACTIVE");
            listCptReports.add(report);
        }
        return listCptReports;
    }

}

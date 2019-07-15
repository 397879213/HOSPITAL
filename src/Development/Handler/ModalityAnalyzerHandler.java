/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development.Handler;

import Development.BO.ModalityAnalyzer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author Danish
 */
public class ModalityAnalyzerHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public List<ModalityAnalyzer> selectMachine(String machineId, String locId,
            String deptId, String sectionId, String machineType) {

        String[] columns = {"-", "ID", "DESCRIPTION", "MODEL", "MANUFACTURER",
            "BAUDRATE", "DATABITS", "STOPBITS", "PARITY", "IP", "PORT",
            "STORE_AETITLE", "MWL_AETITLE", "DEPARTMENT_ID", "SECTION_ID",
            "ACTIVE", "LOCATION_ID", "TYPE", "STATION_NAME", "ORG_ID",
            "MACHINE_TYPE", "LOCATION", "SECTION", "DEPARTMENT", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID", "MANUAL_PATH"};

        String query = " SELECT                                              \n"
                + "MA.ID                         ID,                         \n"
                + "MA.DESCRIPTION                DESCRIPTION,                \n"
                + "MA.MODEL                      MODEL,                      \n"
                + "MA.MANUFACTURER               MANUFACTURER,               \n"
                + "NVL(MA.BAUDRATE, 0)           BAUDRATE,                   \n"
                + "NVL(MA.DATABITS, 0)           DATABITS,                   \n"
                + "NVL(MA.STOPBITS, 0)           STOPBITS,                   \n"
                + "NVL(MA.PARITY, ' ')           PARITY,                     \n"
                + "NVL(MA.IP, ' ')               IP,                         \n"
                + "NVL(MA.PORT, 0)               PORT,                       \n"
                + "NVL(MA.STORE_AETITLE, ' ')    STORE_AETITLE,              \n"
                + "NVL(MA.MWL_AETITLE, ' ')      MWL_AETITLE,                \n"
                + "MA.DEPARTMENT_ID              DEPARTMENT_ID,              \n"
                + "DEP.DESCRIPTION               DEPARTMENT,                 \n"
                + "MA.SECTION_ID                 SECTION_ID,                 \n"
                + "SEC.DESCRIPTION               SECTION,                    \n"
                + "MA.ACTIVE                     ACTIVE,                     \n"
                + "MA.LOCATION_ID                LOCATION_ID,                \n"
                + "LOC.DESCRIPTION               LOCATION,                   \n"
                + "NVL(MA.TYPE, 'GENERAL')       TYPE,                       \n"
                + "NVL(MA.STATION_NAME, ' ')     STATION_NAME,               \n"
                + "MA.ORG_ID                     ORG_ID,                     \n"
                + "MA.MACHINE_TYPE               MACHINE_TYPE,               \n"
                + "MA.CRTD_BY                    CRTD_BY,                    \n"
                + "TO_CHAR(MA.CRTD_DATE, 'DD-MON-YY')    CRTD_DATE,          \n"
                + "MA.CRTD_TERMINAL_ID           CRTD_TERMINAL_ID,           \n"
                + "NVL(MA.MANUAL_PATH , ' ')     MANUAL_PATH                 \n"
                + "FROM " + Database.DCMS.modalityAnalyzer + "   MA,         \n"
                + Database.DCMS.section + "   SEC ,                          \n"
                + Database.DCMS.definitionTypeDetail + "  DEP,               \n"
                + Database.DCMS.location + "              LOC                \n"
                + " WHERE MA.SECTION_ID =  SEC.SECTION_ID                    \n"
                + " AND MA.DEPARTMENT_ID  = DEP.ID                           \n"
                + " AND MA.LOCATION_ID  = LOC.ID                             \n";
        
        if(machineId.length()!=0) {
           query += " AND UPPER(MA.DESCRIPTION) LIKE '%"
                + machineId.toUpperCase() + "%'                              \n";
        }
         if (!locId.equalsIgnoreCase("")) {
            query += " AND MA.LOCATION_ID = '" + locId + "'                  \n";
        }
        if (!deptId.equalsIgnoreCase("")) {
            query += " AND MA.DEPARTMENT_ID = '" + deptId + "'               \n";
        }

        if (!sectionId.equalsIgnoreCase("")) {
            query += " AND MA.SECTION_ID = '" + sectionId + "'               \n";
        }
        if (!machineType.equalsIgnoreCase("")) {
            query += " AND MA.MACHINE_TYPE = '" + machineType + "'           \n";
        }
        
        //System.out.println("query"+ query);

        List list = Constants.dao.selectData(query, columns);
        List<ModalityAnalyzer> lisMod = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            ModalityAnalyzer mod = new ModalityAnalyzer();
            mod.setId(map.get("ID").toString());
            mod.setMachineName(map.get("DESCRIPTION").toString());
            mod.setModel(map.get("MODEL").toString());
            mod.setManufacturer(map.get("MANUFACTURER").toString());
            mod.setBaudrate(map.get("BAUDRATE").toString());
            mod.setDatabits(map.get("DATABITS").toString());
            mod.setStopbits(map.get("STOPBITS").toString());
            mod.setParity(map.get("PARITY").toString());
            mod.setIp(map.get("IP").toString());
            mod.setPort(map.get("PORT").toString());
            mod.setStoreAetitle(map.get("STORE_AETITLE").toString());
            mod.setMwlAetitle(map.get("MWL_AETITLE").toString());
            mod.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            mod.setDepartmentDescription(map.get("DEPARTMENT").toString());
            mod.setSectionId(map.get("SECTION_ID").toString());
            mod.setSectionDescription(map.get("SECTION").toString());
            mod.setActive(map.get("ACTIVE").toString());
            mod.setLocationId(map.get("LOCATION_ID").toString());
            mod.setLocationDescription(map.get("LOCATION").toString());
            mod.setType(map.get("TYPE").toString());
            mod.setStationName(map.get("STATION_NAME").toString());
            mod.setOrgId(map.get("ORG_ID").toString());
            mod.setMachineType(map.get("MACHINE_TYPE").toString());
            mod.setCrtdBy(map.get("CRTD_BY").toString());
            mod.setCrtdDate(map.get("CRTD_DATE").toString());
            mod.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            mod.setManualPath(map.get("MANUAL_PATH").toString());
            lisMod.add(mod);
        }
        return lisMod;
    }

    public List<ModalityAnalyzer> selectSectionWiseMachine(String machineId) {

        String[] columns = {"-", "ID", "MACHINE_ID", "DESCRIPTION",
            "MODEL", "MANUFACTURER", "DEPARTMENT_ID", "SECTION_ID", "LOCATION_ID",
            "LOCATION", "SECTION", "DEPARTMENT"};

        String query = "SELECT                                               \n"
                + "SM.ID                         ID,                         \n"
                + "MA.ID                         MACHINE_ID,                 \n"
                + "MA.DESCRIPTION                DESCRIPTION,                \n"
                + "MA.MODEL                      MODEL,                      \n"
                + "MA.MANUFACTURER               MANUFACTURER,               \n"
                + "SM.DEPARTMENT_ID              DEPARTMENT_ID,              \n"
                + "DEP.DESCRIPTION               DEPARTMENT,                 \n"
                + "SM.SECTION_ID                SECTION_ID,                  \n"
                + "SEC.DESCRIPTION               SECTION,                    \n"
                + "MA.LOCATION_ID                LOCATION_ID,                \n"
                + "LOC.DESCRIPTION               LOCATION                    \n"
                + "FROM " + Database.DCMS.modalityAnalyzer + "   MA,         \n"
                + Database.DCMS.sectionMachine + "   SM ,                    \n"
                + Database.DCMS.section + "   SEC ,                          \n"
                + Database.DCMS.definitionTypeDetail + "  DEP,               \n"
                + Database.DCMS.location + "              LOC                \n"
                + " WHERE SM.SECTION_ID =  SEC.SECTION_ID                    \n"
                + " AND MA.ID  = SM.MACHINE_ID                               \n"
                + " AND SM.DEPARTMENT_ID  = DEP.ID                           \n"
                + " AND MA.LOCATION_ID  = LOC.ID                             \n";

        if (!machineId.equalsIgnoreCase("")) {
            query += " AND SM.MACHINE_ID = '" + machineId + "'              \n";
        }

        List list = Constants.dao.selectData(query, columns);
        List<ModalityAnalyzer> lisMod = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            ModalityAnalyzer mod = new ModalityAnalyzer();
            mod.setId(map.get("ID").toString());
            mod.setMachineId(map.get("MACHINE_ID").toString());
            mod.setMachineName(map.get("DESCRIPTION").toString());
            mod.setModel(map.get("MODEL").toString());
            mod.setManufacturer(map.get("MANUFACTURER").toString());
            mod.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            mod.setDepartmentDescription(map.get("DEPARTMENT").toString());
            mod.setSectionId(map.get("SECTION_ID").toString());
            mod.setSectionDescription(map.get("SECTION").toString());
            mod.setLocationId(map.get("LOCATION_ID").toString());
            mod.setLocationDescription(map.get("LOCATION").toString());

            lisMod.add(mod);
        }
        return lisMod;
    }

    public boolean insertMachineRegister(ModalityAnalyzer pat) {

        GenerateKeys Key = new GenerateKeys();

        String[] columns = {Database.DCMS.modalityAnalyzer, "ID", "DESCRIPTION",
            "MODEL", "MANUFACTURER", "BAUDRATE", "DATABITS", "STOPBITS",
            "PARITY", "IP", "PORT", "STORE_AETITLE", "MWL_AETITLE",
            "DEPARTMENT_ID", "SECTION_ID", "ACTIVE", "LOCATION_ID",
            "TYPE", "STATION_NAME", "ORG_ID", "MACHINE_TYPE", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};


        HashMap map = new HashMap();
        
        map.put("ID", " (SELECT MAX(ID)+ 1 FROM " + Database.DCMS.modalityAnalyzer +")\n");
        map.put("DESCRIPTION", "'" + pat.getMachineName() + "'");
        map.put("MODEL", "'" + pat.getModel() + "'");
        map.put("MANUFACTURER", "'" + pat.getManufacturer() + "'");
        map.put("BAUDRATE", "'" + pat.getBaudrate() + "'");
        map.put("PARITY", "'" + pat.getParity() + "'");
        map.put("DATABITS", "'" + pat.getDatabits() + "'");
        map.put("STOPBITS", "'" + pat.getStopbits() + "'");
        map.put("IP", "'" + pat.getIp() + "'");
        map.put("PORT", "'" + pat.getPort() + "'");
        map.put("STORE_AETITLE", "'" + pat.getStoreAetitle() + "'");
        map.put("MWL_AETITLE", "'" + pat.getMwlAetitle() + "'");
        map.put("DEPARTMENT_ID", "'" + pat.getDepartmentId() + "'");
        map.put("SECTION_ID", "'" + pat.getSectionId() + "'");
        map.put("ACTIVE", "'" + pat.getActive() + "'");
        map.put("LOCATION_ID", "'" + pat.getLocationId() + "'");
        map.put("MACHINE_TYPE", "'" + pat.getMachineType() + "'");
        map.put("STATION_NAME", "'" + pat.getStationName() + "'");
        map.put("ORG_ID", "'" + pat.getOrgId() + "'");
        map.put("TYPE", "'" + pat.getType() + "'");
        map.put("CRTD_DATE", "" + Constants.today + "");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'"); 
        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    // INSERT FOR SECTION WISE
    public boolean insertSectionWiseMachine(ModalityAnalyzer pat) {

        GenerateKeys Key = new GenerateKeys();

        String[] columns = {Database.DCMS.sectionMachine, "SECTION_ID",
            "MACHINE_ID", "DEPARTMENT_ID", "ID"};

        String[] cols = {"", "NEW_ID"};
        String query = " SELECT MAX(ID)+1 NEW_ID FROM " + Database.DCMS.sectionMachine;
        String id = ((HashMap) Constants.dao.selectData(query, cols).get(0)).get("NEW_ID").toString();

        HashMap map = new HashMap();
        pat.setId(id);
        map.put("SECTION_ID", "'" + pat.getSectionId() + "'");
        map.put("MACHINE_ID", "'" + pat.getMachineId() + "'");
        map.put("DEPARTMENT_ID", "'" + pat.getDepartmentId() + "'");
        map.put("ID", "'" + pat.getId() + "'");
        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public boolean updateMachineInfo(ModalityAnalyzer objRv) {

        String query
                = " UPDATE " + Database.DCMS.modalityAnalyzer + "\n SET "
                + " DESCRIPTION = '" + objRv.getMachineName() + "',          \n"
                + " MODEL = '" + objRv.getModel() + "' ,                     \n"
                + " MANUFACTURER = '" + objRv.getManufacturer() + "',        \n"
                + " BAUDRATE = '" + objRv.getBaudrate() + "',                \n"
                + " DATABITS = '" + objRv.getDatabits() + "',                \n"
                + " STOPBITS= '" + objRv.getStopbits() + "',                 \n"
                + " PARITY = '" + objRv.getParity() + "',                    \n"
                + " IP = '" + objRv.getIp() + "',                            \n"
                + " PORT = '" + objRv.getPort() + "' ,                       \n"
                + " STORE_AETITLE = '" + objRv.getStoreAetitle() + "',       \n"
                + " MWL_AETITLE = '" + objRv.getMwlAetitle() + "',           \n"
                + " DEPARTMENT_ID = '" + objRv.getDepartmentId() + "',       \n"
                + " SECTION_ID = '" + objRv.getSectionId() + "',             \n"
                + " ACTIVE = '" + objRv.getActive() + "',                    \n"
                + " LOCATION_ID = '" + objRv.getLocationId() + "',           \n"
                + " MACHINE_TYPE = '" + objRv.getMachineType() + "',         \n"
                + " STATION_NAME = '" + objRv.getStationName() + "',         \n"
                + " ORG_ID = '" + objRv.getOrgId() + "',                     \n"
                + " TYPE = '" + objRv.getType() + "'                         \n"
                + " WHERE ID  = '" + objRv.getId() + "'                      \n";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean deleteSectionWiseMachine(ModalityAnalyzer objRv) {

        String query
                = " DELETE FROM " + Database.DCMS.sectionMachine + "\n  "
                + " WHERE ID  = '" + objRv.getId() + "'"
                + " AND  MACHINE_ID  = '" + objRv.getMachineId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

}

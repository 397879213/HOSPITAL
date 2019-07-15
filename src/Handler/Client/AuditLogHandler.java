/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Client;

import BO.AuditLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Dani
 */
public class AuditLogHandler {

    String[] AuditColumns = {"-", "PL_NUMBER", "FACTORY_ID", "DB_NAME",
        "DOB", "CONTACT_NO", "CNIC", "NAME", "RELATION", "CRTD_DATE",
        "ACTION", "ACTION_BY", "ACTION_DATE", "ACTION_TERMINAL_ID",
        "ROW_ID", "TABLE_NAME", "PATIENT_ID"};

    String generalQuery
            = " SELECT AU.PL_NUMBER,               PL_NUMBER,              \n"
            + " AU.FACTORY_ID                      FACTORY_ID,             \n"
            + " AU.DB_NAME                         DB_NAME,                \n"
            + " AU.DOB                             DOB,                    \n"
            + " AU.CONTACT_NO                      CONTACT_NO,             \n"
            + " AU.CNIC                            CNIC,                   \n"
            + " AU.NAME                            NAME,                   \n"
            + " AU.RELATION                        RELATION,               \n"
            + " AU.CRTD_DATE                       CRTD_DATE,              \n"
            + " AU.ACTION                          ACTION,                 \n"
            + " AU.ACTION_BY                       ACTION_BY,              \n"
            + " AU.ACTION_DATE                     ACTION_DATE,            \n"
            + " AU.ACTION_TERMINAL_ID              ACTION_TERMINAL_ID,     \n"
            + " AU.ROW_ID                          ROW_ID,                 \n"
            + " AU.TABLE_NAME                      TABLE_NAME              \n"
            + " FROM "
            + Database.DCMS.auditLog + " AU                                \n";
//
//    String generalJoin
//            = " AND AU.FACTORY_ID = '" + factoryId + "'                    \n";

    public List<AuditLog> selectEmployeeByFactory(String factoryId) {

        String query = generalQuery
                + " WHERE AU.FACTORY_ID = '" + factoryId + "' \n";

        return setAuditLog(Constants.dao.selectData(query, AuditColumns));
    }

    public List<AuditLog> selectEmployeeByPl(String plNumber) {

        String query = generalQuery
                + " WHERE AU.PL_NUMBER = '" + plNumber + "' \n";

        return setAuditLog(Constants.dao.selectData(query, AuditColumns));
    }

    public List setAuditLog(List list) {

        List<AuditLog> listLog = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(0);
            AuditLog obj = new AuditLog();
            obj.setPlNumber(map.get("PL_NUMBER").toString());
            obj.setFactoryId(map.get("FACTORY_ID").toString());
            obj.setDbName(map.get("DB_NAME").toString());
            obj.setDob(map.get("DOB").toString());
            obj.setContactNo(map.get("CONTACT_NO").toString());
            obj.setCnic(map.get("CNIC").toString());
            obj.setName(map.get("NAME").toString());
            obj.setRelation(map.get("RELATION").toString());
            obj.setCrtdDate(map.get("CRTD_DATE").toString());
            obj.setAction(map.get("ACTION").toString());
            obj.setActionBy(map.get("ACTION_BY").toString());
            obj.setActionTerminalId(map.get("ACTION_TERMINAL_ID").toString());
            obj.setRowId(map.get("ROW_ID").toString());
            obj.setTableName(map.get("TABLE_NAME").toString());
            listLog.add(obj);
        }
        return listLog;
    }

    public boolean updatePersonnelDb(AuditLog com) {
        String query
                = " UPDATE " + " PERSYS." + com.getTableName() + "\n"
                + " SET DOB  = '" + com.getDob().replaceAll("'", "''") + "',\n"
                + " CONTACT_NO  = '" + com.getContactNo().replaceAll("'", "''") + "', \n"
                + " CNIC  = '" + com.getCnic().replaceAll("'", "''") + "'  \n"
                + " WHERE TABLE_NAME = '" + com.getTableName() + "'"
                + " AND ROW_ID = '" + com.getRowId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updateEmr(AuditLog com) {
        String query
                = " UPDATE " + " EMR." + com.getTableName() + "\n"
                + " SET DOB  = '" + com.getDob().replaceAll("'", "''") + "',\n"
                + " CONTACT_NO  = '" + com.getContactNo().replaceAll("'", "''") + "', \n"
                + " CNIC  = '" + com.getCnic().replaceAll("'", "''") + "'  \n"
                + " WHERE TABLE_NAME = '" + com.getTableName() + "'"
                + " AND ROW_ID = '" + com.getRowId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

}

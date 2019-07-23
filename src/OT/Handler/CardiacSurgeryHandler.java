package OT.Handler;

import OT.BO.CardiacSurgery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class CardiacSurgeryHandler {
    
    public List<CardiacSurgery> selectSurgeryInfo(String con, String odi) {

        String[] col = {"-", "CON", "ODI", "PRIORITY", "ROLE_OF_ROBOT", 
            "FIRST_REDO", "CRTD_BY", "SURGERY_REMARKS_ID", "SURGERY_REMARKS",
            "CRTD_DATE", "CRTD_TERMINAL", 
            "CRTD_BY_NAME"};

    String query = " SELECT                                             \n"
            + "  SGI.CON                      CON,                      \n"
            + "  SGI.ODI                      ODI,                      \n"
            + "  SGI.PRIORITY,                                          \n"
            + "  SGI.ROLE_OF_ROBOT,                                     \n"
            + "  SGI.FIRST_REDO,                                        \n"
            + "  SGI.SURGERY_REMARKS_ID,                                \n"
            + "  RSN.DESCRIPTION              SURGERY_REMARKS,          \n"
            + "  SGI.CRTD_BY                  CRTD_BY,                  \n"
            + "  USR.NAME                     CRTD_BY_NAME,             \n"
            + "  SGI.CRTD_DATE                CRTD_DATE,                \n"
            + "  SGI.CRTD_TERMINAL            CRTD_TERMINAL             \n"
            + "  FROM                                                   \n"
            + Database.DCMS.surgeryInformation + " SGI,                 \n"
            + Database.DCMS.definitionTypeDetail + " RSN,               \n"
            + Database.DCMS.users + " USR                               \n"
            + " WHERE SGI.CON = '" + con + "'                           \n"
            + " AND SGI.ODI = '" + odi + "'                             \n"
            + " AND SGI.SURGERY_REMARKS_ID = RSN.ID                     \n"
            + " AND SGI.CRTD_BY = USR.USER_NAME                         \n";

        List<HashMap> listMap = Constants.dao.selectDatainList(query, col);
        List listOTProcedure = new ArrayList();
        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            CardiacSurgery otPro = new CardiacSurgery();
            otPro.setCompleteOrderNo(map.get("CON").toString());
            otPro.setOrderDetailId(map.get("ODI").toString());
            otPro.setPriority(map.get("PRIORITY").toString());
            otPro.setRoleofRobot(map.get("ROLE_OF_ROBOT").toString());
            otPro.setFirstRedo(map.get("FIRST_REDO").toString());
            otPro.setSurgeryRemarksId(map.get("SURGERY_REMARKS_ID").toString());
            otPro.setSurgeryRemarks(map.get("SURGERY_REMARKS").toString());
            otPro.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            otPro.setCrtdBy(map.get("CRTD_BY").toString());
            otPro.setCrtdDate(map.get("CRTD_DATE").toString());
            otPro.setCrtdTerminalId(map.get("CRTD_TERMINAL").toString());
            listOTProcedure.add(otPro);
        }
        return listOTProcedure;
    }
    
    public boolean insertSurgeryInfo(CardiacSurgery operate) {

        String[] columns = {Database.DCMS.surgeryInformation, "CON", "ODI", 
            "PRIORITY", "ROLE_OF_ROBOT", "FIRST_REDO", "CRTD_BY", "SURGERY_REMARKS_ID", 
            "CRTD_DATE", "CRTD_TERMINAL"};

        HashMap mapUsers = new HashMap();

        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
        mapUsers.put("PRIORITY", "'" + operate.getPriority()+ "'");
        mapUsers.put("ROLE_OF_ROBOT", "'" + operate.getRoleofRobot()+ "'");
        mapUsers.put("FIRST_REDO", "'" + operate.getFirstRedo()+ "'");
        mapUsers.put("SURGERY_REMARKS_ID", "'" + operate.getSurgeryRemarksId()+ "'");
        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
        mapUsers.put("CRTD_DATE",  Constants.today );
        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        List listUsers = new ArrayList();
        listUsers.add(mapUsers);
        return Constants.dao.insertData(listUsers, columns);
    }
    
    public List<CardiacSurgery> selectAccessInfo(String con, String odi) {

        String[] col = {"-", "CON", "ODI", "ACCESS_INFO", "IS_ELECTIVE", "ACCESS_REMARKS_ID", 
            "ACCESS_REMARKS", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL", 
            "CRTD_BY_NAME"};

    String query = " SELECT                                             \n"
            + "  AIN.CON                      CON,                      \n"
            + "  AIN.ODI                      ODI,                      \n"
            + "  AIN.ACCESS_INFO,                                        \n"
            + "  AIN.IS_ELECTIVE,                                        \n"
            + "  AIN.ACCESS_REMARKS_ID,                                  \n"
            + "  ARM.DESCRIPTION              ACCESS_REMARKS,            \n"
            + "  AIN.CRTD_BY                  CRTD_BY,                   \n"
            + "  USR.NAME                     CRTD_BY_NAME,              \n"
            + "  AIN.CRTD_DATE                CRTD_DATE,                 \n"
            + "  AIN.CRTD_TERMINAL            CRTD_TERMINAL              \n"
            + "  FROM                                                    \n"
            + Database.DCMS.accessInformation + " AIN,                   \n"
            + Database.DCMS.definitionTypeDetail + " ARM,                \n"
            + Database.DCMS.users + " USR                                \n"
            + " WHERE AIN.CON = '" + con + "'                            \n"
            + " AND AIN.ODI = '" + odi + "'                              \n"
            + " AND AIN.ACCESS_REMARKS_ID = ARM.ID                       \n"
            + " AND AIN.CRTD_BY = USR.USER_NAME                          \n";

        List<HashMap> listMap = Constants.dao.selectDatainList(query, col);
        List listOTProcedure = new ArrayList();
        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            CardiacSurgery otPro = new CardiacSurgery();
            otPro.setCompleteOrderNo(map.get("CON").toString());
            otPro.setOrderDetailId(map.get("ODI").toString());
            otPro.setAccess(map.get("ACCESS_INFO").toString());
            otPro.setIsElective(map.get("IS_ELECTIVE").toString());
            otPro.setElectiveRemarksId(map.get("ACCESS_REMARKS_ID").toString());
            otPro.setElectiveRemarks(map.get("ACCESS_REMARKS").toString());
            otPro.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            otPro.setCrtdBy(map.get("CRTD_BY").toString());
            otPro.setCrtdDate(map.get("CRTD_DATE").toString());
            otPro.setCrtdTerminalId(map.get("CRTD_TERMINAL").toString());
            listOTProcedure.add(otPro);
        }
        return listOTProcedure;
    }
    
    public boolean insertAccessInfo(CardiacSurgery operate) {

        String[] columns = {Database.DCMS.accessInformation, "CON", "ODI", 
            "ACCESS_INFO", "IS_ELECTIVE", "ACCESS_REMARKS_ID", "CRTD_BY", "CRTD_DATE", 
            "CRTD_TERMINAL"};

        HashMap mapUsers = new HashMap();

        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
        mapUsers.put("ACCESS_INFO", "'" + operate.getAccess()+ "'");
        mapUsers.put("IS_ELECTIVE", "'" + operate.getIsElective()+ "'");
        mapUsers.put("ACCESS_REMARKS_ID", "'" + operate.getElectiveRemarksId()+ "'");
        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
        mapUsers.put("CRTD_DATE",  Constants.today );
        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        List listUsers = new ArrayList();
        listUsers.add(mapUsers);
        return Constants.dao.insertData(listUsers, columns);
    }
    
    public List<CardiacSurgery> selectOtDetail(String con, String odi, String actionId) {

        String[] col = {"-", "ID", "CON", "ODI", "TYPE_DETAIL_ID",
        "DESCRIPTION", "ACTION_ID", "CRTD_BY", "REMARKS", "CRTD_DATE", "CRTD_TERMINAL"};

    String query = " SELECT                                             \n"
            + "  OSD.ID                       ID,                       \n"
            + "  OSD.CON                      CON,                      \n"
            + "  OSD.ODI                      ODI,                      \n"
            + "  DT.DESCRIPTION               DESCRIPTION,              \n"
            + "  OSD.TYPE_DETAIL_ID           TYPE_DETAIL_ID,           \n"
            + "  NVL(OSD.ACTION_ID, 0)        ACTION_ID,                \n"
            + "  NVL(OSD.REMARKS, ' ')        REMARKS,                  \n"
            + "  OSD.CRTD_BY                  CRTD_BY,                  \n"
            + "  OSD.CRTD_DATE                CRTD_DATE,                \n"
            + "  OSD.CRTD_TERMINAL            CRTD_TERMINAL             \n"
            + "  FROM                                                   \n"
            + Database.DCMS.otSetupDetail + "        OSD,               \n"
            + Database.DCMS.definitionTypeDetail + " DT                 \n"
            + " WHERE OSD.CON = '" + con + "'                           \n"
            + " AND OSD.ODI = '" + odi + "'                             \n"
            + " AND ACTION_ID = "+ actionId +"                          \n"
            + " AND OSD.TYPE_DETAIL_ID = DT.ID                          \n"
            + "ORDER BY ID                                              \n";

        List<HashMap> listMap = Constants.dao.selectDatainList(query, col);
        List listOTProcedure = new ArrayList();
        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            CardiacSurgery otPro = new CardiacSurgery();
            otPro.setId(map.get("ID").toString());
            otPro.setCompleteOrderNo(map.get("CON").toString());
            otPro.setOrderDetailId(map.get("ODI").toString());
            otPro.setDescription(map.get("DESCRIPTION").toString());
            otPro.setTypeDetailId(map.get("TYPE_DETAIL_ID").toString());
            otPro.setActionId(map.get("ACTION_ID").toString());
            otPro.setRemarks(map.get("REMARKS").toString());
            otPro.setCrtdBy(map.get("CRTD_BY").toString());
            otPro.setCrtdDate(map.get("CRTD_DATE").toString());
            otPro.setCrtdTerminalId(map.get("CRTD_TERMINAL").toString());
            listOTProcedure.add(otPro);
        }
        return listOTProcedure;
    }
    
    public boolean deleteOtDetail(String id) {
        String query
                = " DELETE   " + Database.DCMS.otSetupDetail + "\n"
                + " WHERE ID = '" + id + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertOperDetail(CardiacSurgery operate) {

        String[] columns = {Database.DCMS.otSetupDetail, "ID", "CON",
            "ODI", "TYPE_DETAIL_ID", "ACTION_ID", "REMARKS", "CRTD_BY", 
            "CRTD_DATE", "CRTD_TERMINAL"};

        HashMap mapUsers = new HashMap();

        mapUsers.put("ID", this.getId(Database.DCMS.otSetupDetail));
        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
        mapUsers.put("TYPE_DETAIL_ID", "'" + operate.getTypeDetailId() + "'");
        mapUsers.put("ACTION_ID", "'" + operate.getActionId()+ "'");
        mapUsers.put("REMARKS", "'" + operate.getRemarks().replaceAll("'", "''")+ "'");
        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
        mapUsers.put("CRTD_DATE",  Constants.today );
        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        List listUsers = new ArrayList();
        listUsers.add(mapUsers);
        return Constants.dao.insertData(listUsers, columns);
    }

    public boolean updateStatus(String id, CardiacSurgery card) {
        String query
                = " UPDATE   " + Database.DCMS.otSetupDetail + "\n"
                + " SET ACTION_ID = '" + card.getTypeDetailId() + "'        \n"
                + " WHERE ID = '" + card.getId() + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean deleteOperationDetail(String id) {
        String query
                = " DELETE   " + Database.DCMS.otSetupDetail + "\n"
                + " WHERE ID = '" + id + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    //CABG tables 
    String[] selectCabgAndValve = {"-", "CON", "ODI", "ID", "CABG_PROC_ID",
        "CRONARY_ARTERY_ID", "CONDUIT_ID", "DV_ID", "ENDART_ID", "PL", "FLOW",
        "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL"};

    String CabgQuery = " SELECT                                \n"
            + "  OC.CON                      CON,                        \n"
            + "  OC.ODI                      ODI,                        \n"
            + "  OC.ID                       ID,                         \n"
            + "  OC.CABG_PROC_ID             CABG_PROC_ID,               \n"
            + "  OC.CRONARY_ARTERY_ID        CRONARY_ARTERY_ID,          \n"
            + "  OC.CONDUIT_ID               CONDUIT_ID,                 \n"
            + "  OC.DV_ID                    DV_ID,                      \n"
            + "  OC.ENDART_ID                ENDART_ID,                  \n"
            + "  OC.PL                       PL,                         \n"
            + "  OC.FLOW                     FLOW,                       \n"
            + "  OC.CRTD_BY                  CRTD_BY,                    \n"
            + "  OC.CRTD_DATE                CRTD_DATE,                  \n"
            + "  OC.CRTD_TERMINAL            CRTD_TERMINAL               \n"
            + "  FROM                                                    \n"
            + Database.DCMS.otCabg + "        OC,                        \n"
            + Database.DCMS.definitionTypeDetail + " DT                  \n";

    public List<CardiacSurgery> selectCabgProc(String con, String odi) {

        String[] col = {"-", "CON", "ODI", "ID", "CABG_PROC_ID", "CABG_DESCRIPTION",
            "CRONARY_ARTERY_ID", "CORONARY_DESCRIPTION", "CONDUIT_ID", "CONDUIT_DESCRIPTION",
            "DV_ID", "DIS_VESS_DESCRIPTION", "ENDART_ID", "PL", "FLOW"};

        String query = " SELECT                                \n"
                + "  OC.CON                      CON,                        \n"
                + "  OC.ODI                      ODI,                        \n"
                + "  OC.ID                       ID,                         \n"
                + "  OC.CABG_PROC_ID             CABG_PROC_ID,               \n"
                + "  CBG.DESCRIPTION             CABG_DESCRIPTION,           \n"
                + "  OC.CRONARY_ARTERY_ID        CRONARY_ARTERY_ID,          \n"
                + "  CRO.DESCRIPTION             CORONARY_DESCRIPTION,       \n"
                + "  OC.CONDUIT_ID               CONDUIT_ID,                 \n"
                + "  CDT.DESCRIPTION             CONDUIT_DESCRIPTION,        \n"
                + "  OC.DV_ID                    DV_ID,                      \n"
                + "  DIV.DESCRIPTION             DIS_VESS_DESCRIPTION,       \n"
                + "  OC.ENDART_ID                ENDART_ID,                  \n"
                + "  OC.PL                       PL,                         \n"
                + "  OC.FLOW                     FLOW                        \n"
                + "  FROM                                                    \n"
                + Database.DCMS.otCabg + "        OC,                        \n"
                + Database.DCMS.definitionTypeDetail + " CBG,                \n"
                + Database.DCMS.definitionTypeDetail + " CRO,                \n"
                + Database.DCMS.definitionTypeDetail + " CDT,                \n"
                + Database.DCMS.definitionTypeDetail + " DIV                 \n"
                + " WHERE 1=1                                                \n"
                + "  AND OC.CON = '" + con + "'                              \n"
                + "  AND OC.ODI = '" + odi + "'                              \n"
                + "  AND OC.CABG_PROC_ID = CBG.ID                            \n"
                + "  AND OC.CRONARY_ARTERY_ID = CRO.ID                       \n"
                + "  AND OC.CONDUIT_ID = CDT.ID                              \n"
                + "  AND OC.DV_ID = DIV.ID  ";

        List<HashMap> listMap = Constants.dao.selectData(query, col);
        List<CardiacSurgery> listOTProcedure = new ArrayList();

        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            CardiacSurgery otPro = new CardiacSurgery();
            otPro.setCompleteOrderNo(map.get("CON").toString());
            otPro.setOrderDetailId(map.get("ODI").toString());
            otPro.setCabgId(map.get("ID").toString());
            otPro.setCabgProcId(map.get("CABG_PROC_ID").toString());
            otPro.setCabgProcDescription(map.get("CABG_DESCRIPTION").toString());
            otPro.setCronaryId(map.get("CRONARY_ARTERY_ID").toString());
            otPro.setCronaryDescription(map.get("CORONARY_DESCRIPTION").toString());
            otPro.setConduitId(map.get("CONDUIT_ID").toString());
            otPro.setConduitDescription(map.get("CONDUIT_DESCRIPTION").toString());
            otPro.setDistalVesselId(map.get("DV_ID").toString());
            otPro.setDistalVesselDescription(map.get("DIS_VESS_DESCRIPTION").toString());
            otPro.setEndart(map.get("ENDART_ID").toString());
            otPro.setPi(map.get("PL").toString());
            otPro.setFlow(map.get("FLOW").toString());
            listOTProcedure.add(otPro);
        }

        return listOTProcedure;

    }

    public boolean insertCabgProcedure(CardiacSurgery operate) {

        String[] columns = {Database.DCMS.otCabg, "CON", "ODI", "ID", "CABG_PROC_ID",
            "CRONARY_ARTERY_ID", "CONDUIT_ID", "DV_ID", "ENDART_ID", "PL", "FLOW",
            "CRTD_BY", "CRTD_TERMINAL"};

        HashMap mapUsers = new HashMap();

        mapUsers.put("ID", this.getId(Database.DCMS.otCabg));
        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
        mapUsers.put("CABG_PROC_ID", "'" + operate.getCabgProcId() + "'");
        mapUsers.put("CRONARY_ARTERY_ID", "'" + operate.getCronaryId() + "'");
        mapUsers.put("CONDUIT_ID", "'" + operate.getConduitId() + "'");
        mapUsers.put("DV_ID", "'" + operate.getDistalVesselId() + "'");
        mapUsers.put("ENDART_ID", "'" + operate.getEndart() + "'");
        mapUsers.put("PL", "'" + operate.getPi() + "'");
        mapUsers.put("FLOW", "'" + operate.getFlow() + "'");
        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        List listUsers = new ArrayList();
        listUsers.add(mapUsers);
        return Constants.dao.insertData(listUsers, columns);
    }

    public boolean deletecabgDetail(String id) {
        String query
                = " DELETE   " + Database.DCMS.otCabg + "\n"
                + " WHERE ID = '" + id + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertValSurgery(CardiacSurgery operate) {

        String[] columns = {Database.DCMS.otValveSurg, "ID", "CON", "ODI",
            "VAL_SUR_ID", "PROC_OPT_ID", "EXPLANT_ID", "IMPLANT_ID", "TYPE_ID",
            "VAL_SIZE", "SR_NO"};

        HashMap mapUsers = new HashMap();

        mapUsers.put("ID", this.getId(Database.DCMS.otValveSurg));
        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
        mapUsers.put("VAL_SUR_ID", "'" + operate.getValSurId() + "'");
        mapUsers.put("PROC_OPT_ID", "'" + operate.getProcOptId() + "'");
        mapUsers.put("EXPLANT_ID", "'" + operate.getExpId() + "'");
        mapUsers.put("IMPLANT_ID", "'" + operate.getImpId() + "'");
        mapUsers.put("TYPE_ID", "'" + operate.getTypeId() + "'");
        mapUsers.put("VAL_SIZE", "'" + operate.getValSize() + "'");
        mapUsers.put("SR_NO", "'" + operate.getValSrNo() + "'");
        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        List listUsers = new ArrayList();
        listUsers.add(mapUsers);
        return Constants.dao.insertData(listUsers, columns);
    }

    public List<CardiacSurgery> selectValSurgery(String con, String odi) {

        String[] col = {"-", "ID", "CON", "ODI", "VAL_SUR_ID", "VAL_SUR_DESCRIPTION",
            "PROC_OPT_ID", "PROC_OPT_DESCRIPTION", "EXPLANT_ID", "EXPLANT_DESCRIPTION",
            "IMPLANT_ID", "IMPLANT_DESCRIPTION", "TYPE_ID", "TYPE_DESCRIPTION",
            "VAL_SIZE", "SR_NO"};

        String query = " SELECT  OVS.ID          ID,                         \n"
                + "  OVS.CON                     CON,                        \n"
                + "  OVS.ODI                     ODI,                        \n"
                + "  OVS.ID                      ID,                         \n"
                + "  OVS.VAL_SUR_ID              VAL_SUR_ID,                 \n"
                + "  VS.DESCRIPTION              VAL_SUR_DESCRIPTION,        \n"
                + "  OVS.PROC_OPT_ID             PROC_OPT_ID,                \n"
                + "  POI.DESCRIPTION             PROC_OPT_DESCRIPTION,       \n"
                + "  OVS.EXPLANT_ID              EXPLANT_ID,                 \n"
                + "  EX.DESCRIPTION              EXPLANT_DESCRIPTION,        \n"
                + "  OVS.IMPLANT_ID              IMPLANT_ID,                 \n"
                + "  OVS.TYPE_ID                 TYPE_ID,                    \n"
                + "  IM.DESCRIPTION              IMPLANT_DESCRIPTION,        \n"
                + "  TYP.DESCRIPTION             TYPE_DESCRIPTION,           \n"
                + "  OVS.VAL_SIZE                VAL_SIZE,                   \n"
                + "  OVS.SR_NO                   SR_NO                       \n"
                + "  FROM                                                    \n"
                + Database.DCMS.otValveSurg + "        OVS,                  \n"
                + Database.DCMS.definitionTypeDetail + " VS,                 \n"
                + Database.DCMS.definitionTypeDetail + " POI,                \n"
                + Database.DCMS.definitionTypeDetail + " EX,                 \n"
                + Database.DCMS.definitionTypeDetail + " IM,                 \n"
                + Database.DCMS.definitionTypeDetail + " TYP                 \n"
                + " WHERE OVS.CON = '" + con + "'                            \n"
                + "  AND OVS.ODI = '" + odi + "'                             \n"
                + "  AND OVS.VAL_SUR_ID = VS.ID                              \n"
                + "  AND OVS.PROC_OPT_ID = POI.ID                            \n"
                + "  AND OVS.EXPLANT_ID = EX.ID                              \n"
                + "  AND OVS.IMPLANT_ID = IM.ID                              \n"
                + "  AND OVS.TYPE_ID = TYP.ID  "
                + "  ORDER BY OVS.ID DESC";

        List<HashMap> listMap = Constants.dao.selectData(query, col);
        List<CardiacSurgery> listOTProcedure = new ArrayList();

        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            CardiacSurgery otPro = new CardiacSurgery();
            otPro.setCompleteOrderNo(map.get("CON").toString());
            otPro.setOrderDetailId(map.get("ODI").toString());
            otPro.setId(map.get("ID").toString());
            otPro.setValSurId(map.get("VAL_SUR_ID").toString());
            otPro.setValSurDescription(map.get("VAL_SUR_DESCRIPTION").toString());
            otPro.setProcOptId(map.get("PROC_OPT_ID").toString());
            otPro.setProcOptDescription(map.get("PROC_OPT_DESCRIPTION").toString());
            otPro.setExpId(map.get("EXPLANT_ID").toString());
            otPro.setExpDescription(map.get("EXPLANT_DESCRIPTION").toString());
            otPro.setImpId(map.get("IMPLANT_ID").toString());
            otPro.setImpDescription(map.get("IMPLANT_DESCRIPTION").toString());
            otPro.setTypeId(map.get("TYPE_ID").toString());
            otPro.setTypeDescription(map.get("TYPE_DESCRIPTION").toString());
            otPro.setValSize(map.get("VAL_SIZE").toString());
            otPro.setValSrNo(map.get("SR_NO").toString());

            listOTProcedure.add(otPro);
        }

        return listOTProcedure;

    }

    public boolean deleteValveSurg(String id) {
        String query
                = " DELETE   " + Database.DCMS.otValveSurg + "\n"
                + " WHERE ID = '" + id + "'";
        return Constants.dao.executeUpdate(query, false);
    }

//    public boolean insertClosurePaceWire(CardiacSurgery operate) {
//
//        String[] columns = {Database.DCMS.otClosurePacingWire, "ID", "CON", "ODI",
//            "DEF_TYPE", "CLOSURE_ID", "PACING_WIRE_ID", "CRTD_BY", "CRTD_TERMINAL"};
//
//        HashMap mapUsers = new HashMap();
//
//        mapUsers.put("ID", this.getId(Database.DCMS.otClosurePacingWire));
//        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
//        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
//        mapUsers.put("DEF_TYPE", "'" + operate.getDefTypeId() + "'");
//        mapUsers.put("CLOSURE_ID", "'" + operate.getClosureId() + "'");
//        mapUsers.put("PACING_WIRE_ID", "'" + operate.getPaceWireId() + "'");
//        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
//        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
//        List listUsers = new ArrayList();
//        listUsers.add(mapUsers);
//        return Constants.dao.insertData(listUsers, columns);
//
//    }
    
    public boolean insertCabgsurgery(CardiacSurgery operate) {

        String[] columns = {Database.DCMS.cabgSurgery, "ID", "CON", "ODI",
            "SURGERY_DATE", "LA_LINE", "NON_CARDIAC_PROC", "USE_OF_SHUNT",
            "AORTIC_CLAMP_TIME", "THORACIC_AORTIC_REMARKS", "REMARKS",
                "CRTD_BY", "CRTD_DATE","CRTD_TERMINAL"};

        HashMap mapUsers = new HashMap();

        mapUsers.put("ID", this.getId(Database.DCMS.cabgSurgery));
        mapUsers.put("CON", "'" + operate.getCompleteOrderNo() + "'");
        mapUsers.put("ODI", "'" + operate.getOrderDetailId() + "'");
        mapUsers.put("SURGERY_DATE", "'" + operate.getSurgeryDate()+ "'");
        mapUsers.put("LA_LINE", "'" + operate.getLaLine()+ "'");
        mapUsers.put("NON_CARDIAC_PROC", "'" + operate.getNonCardiacProc()+ "'");
        mapUsers.put("USE_OF_SHUNT", "'" + operate.getUseOfShunt()+ "'");
        mapUsers.put("AORTIC_CLAMP_TIME", "'" + operate.getAorticClampTime()+ "'");
        mapUsers.put("THORACIC_AORTIC_REMARKS", "'" + operate.getThoracicAeroticRemarks()+ "'");
        mapUsers.put("REMARKS", "'" + operate.getRemarks()+ "'");
        mapUsers.put("CRTD_BY", "'" + Constants.userId + "'");
        mapUsers.put("CRTD_DATE",  Constants.today);
        mapUsers.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        List listUsers = new ArrayList();
        listUsers.add(mapUsers);
        return Constants.dao.insertData(listUsers, columns);
    }

    public List<CardiacSurgery> selectCabgSurgery(String con, String odi) {

        String[] col = {"-", "ID", "CON", "ODI", "SURGERY_DATE", "LA_LINE", 
            "NON_CARDIAC_PROC", "USE_OF_SHUNT", "AORTIC_CLAMP_TIME", "SURGERY_DAY",
            "THORACIC_AORTIC_REMARKS", "REMARKS", "CRTD_BY", "CRTD_BY_NAME",
            "CRTD_DATE", "CRTD_TERMINAL"};

        String query = " SELECT  CBS.ID          ID,                         \n"
                + "  CBS.CON                     CON,                        \n"
                + "  CBS.ODI                     ODI,                        \n"
                + "  TO_CHAR(CBS.SURGERY_DATE, 'DD-MON-YY')  SURGERY_DATE,   \n"
                + " ROUND(CBS.SURGERY_DATE - SYSDATE  )+1     SURGERY_DAY,     \n"
                + "  CBS.LA_LINE, CBS.NON_CARDIAC_PROC, CBS.USE_OF_SHUNT,   \n"
                + "  CBS.AORTIC_CLAMP_TIME,                                 \n"
                + "  CBS.THORACIC_AORTIC_REMARKS,                           \n"
                + "  NVL(CBS.REMARKS, ' ') REMARKS,                                           \n"
                + "  CBS.CRTD_BY,                                           \n"
                + "  USR.NAME                   CRTD_BY_NAME,               \n"
                + "  TO_CHAR(CBS.CRTD_DATE, 'DD-MON-YY')     CRTD_DATE,     \n"
                + "  CBS.CRTD_TERMINAL                                          \n"
                + "  FROM                                                    \n"
                + Database.DCMS.cabgSurgery + "        CBS,                  \n"
                + Database.DCMS.users + " USR                                \n"
                + " WHERE CBS.CON = '" + con + "'                            \n"
                + "  AND CBS.ODI = '" + odi + "'                             \n"
                + "  AND USR.USER_NAME = CBS.CRTD_BY  ";

        List<HashMap> listMap = Constants.dao.selectData(query, col);
        List<CardiacSurgery> listOTProcedure = new ArrayList();

        for (int i = 0; i < listMap.size(); i++) {
            HashMap map = (HashMap) listMap.get(i);
            CardiacSurgery otPro = new CardiacSurgery();
            otPro.setCompleteOrderNo(map.get("CON").toString());
            otPro.setOrderDetailId(map.get("ODI").toString());
            otPro.setId(map.get("ID").toString());
            otPro.setSurgeryDate(map.get("SURGERY_DATE").toString());
            otPro.setSurgeryDay(map.get("SURGERY_DAY").toString());
            otPro.setLaLine(map.get("LA_LINE").toString());
            otPro.setNonCardiacProc(map.get("NON_CARDIAC_PROC").toString());
            otPro.setUseOfShunt(map.get("USE_OF_SHUNT").toString());
            otPro.setAorticClampTime(map.get("AORTIC_CLAMP_TIME").toString());
            otPro.setThoracicAeroticRemarks(map.get("THORACIC_AORTIC_REMARKS").toString());
            otPro.setRemarks(map.get("REMARKS").toString());
            otPro.setCrtdBy(map.get("CRTD_BY").toString());
            otPro.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            otPro.setCrtdDate(map.get("CRTD_DATE").toString());
            otPro.setCrtdTerminalId(map.get("CRTD_TERMINAL").toString());

            listOTProcedure.add(otPro);
        }

        return listOTProcedure;

    }
    
    public String getId(String tbl) {

        String[] col = {"-", "ID"};

        String query = "SELECT NVL(MAX(ID+1),1) ID FROM " + tbl;
        List<HashMap> list = Constants.dao.selectData(query, col);

        return list.get(0).get("ID").toString();
    }

}

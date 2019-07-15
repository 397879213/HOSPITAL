/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Handler;

import BO.OnCallDoctor;
import OPD.BO.WardStatusBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Pacslink
 */
public class WardStatusHandler {

    public List<WardStatusBO> selectOnCallDoctor(String date) {

        String[] selectColumns = {"-", "STATUS_DATE", "WARD_ID", "WARD_DESCRIPTION",
            "TOTAL_BEDS",
            "PREV_ADMITTED", "NEW_ADMITTED", "TOTAL_DISCHARGE", "TRANSFER_IN",
            "TRANSFER_OUT", "DEATH", "TOTAL", "OFFICERS", "OFFICERS_FAMILY",
            "C1_1_SELF", "C1_1_EX", "C1_1_FAMILY", "C1_2_SELF", "C1_2_EX",
            "C1_2_FAMILY", "C1_3_SELF", "C1_3_EX", "C1_3_FAMILY", "ARMY", "CNE",
            "PNL", "VSIL", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        String selectOnCall
                = "SELECT TO_CHAR(WDS.STATUS_DATE, 'DD-MON-YY') STATUS_DATE, "
                + "WDS.WARD_ID, WRD.DESCRIPTION WARD_DESCRIPTION, \n"
                + "WDS.TOTAL_BEDS, NVL(WDS.PREV_ADMITTED, '0') PREV_ADMITTED,      \n"
                + "WDS.NEW_ADMITTED, WDS.TOTAL_DISCHARGE, WDS.TRANSFER_IN, WDS.TRANSFER_OUT,    \n"
                + "WDS.DEATH, WDS.TOTAL, WDS.OFFICERS, WDS.OFFICERS_FAMILY, WDS.C1_1_SELF, WDS.C1_1_EX, \n"
                + "WDS.C1_1_FAMILY, WDS.C1_2_SELF, WDS.C1_2_EX, WDS.C1_2_FAMILY, WDS.C1_3_SELF,     \n"
                + "WDS.C1_3_EX, WDS.C1_3_FAMILY, WDS.ARMY, WDS.CNE, WDS.PNL, WDS.VSIL, WDS.CRTD_DATE,       \n"
                + "WDS.CRTD_BY, WDS.CRTD_TERMINAL_ID                                    \n"
                + " FROM " + Database.DCMS.pofWardStatus + "  WDS,               \n"
                + Database.DCMS.ward + "   WRD                 \n"
                + "WHERE TO_CHAR(STATUS_DATE, 'DD-MON-YY') = '" + date + "'       \n"
                + " AND WDS.WARD_ID = WRD.ID       \n";

        List selectRoom = Constants.dao.selectDatainList(selectOnCall, selectColumns);
        List<WardStatusBO> list = new ArrayList();
        for (int i = 0; i < selectRoom.size(); i++) {
            HashMap map = (HashMap) selectRoom.get(i);
            WardStatusBO set = new WardStatusBO();
            
            if(i == 0){
                set.setStatusDate("Start Date");
            set.setWardId("Ward Id");
            set.setWardDescription("Ward Description");
            set.setTotalBeds("Totsl Beds");
            set.setPreviousAdmitted("Previous Admitted");
            set.setNewAdmitted("New Admitted");
            set.setTotalDischarge("Total Discharge");
            set.setTransferIn("Transfer In");
            set.setTransferOut("Transfer Out");
            set.setDeath("Death");
            set.setTotal("Total");
            set.setOfficers("Officers");
            set.setOfficersFamily("Officers Family");
            set.setC1Self("C1 Self");
            set.setC1Ex("C1 Ex");
            set.setC1Family("C1 Family");
            set.setC2Self("C2 Self");
            set.setC2Ex("C2 Ex");
            set.setC2Family("C2 Family");
            set.setC3Self("C3 Self");
            set.setC3Ex("C3 Ex");
            set.setC3Family("C3 Family");
            set.setArmy("Army");
            set.setCne("CNE");
            set.setPnl("Panel");
            set.setVsil(map.get("VSIL").toString());
            set.setCrtdDate(map.get("CRTD_DATE").toString());
            set.setCrtdBy(map.get("CRTD_BY").toString());
            set.setCrtdTerminal(map.get("CRTD_TERMINAL_ID").toString());
            } else{
                set.setStatusDate(map.get("STATUS_DATE").toString());
            set.setWardId(map.get("WARD_ID").toString());
            set.setWardDescription(map.get("WARD_DESCRIPTION").toString());
            set.setTotalBeds(map.get("TOTAL_BEDS").toString());
            set.setPreviousAdmitted(map.get("PREV_ADMITTED").toString());
            set.setNewAdmitted(map.get("NEW_ADMITTED").toString());
            set.setTotalDischarge(map.get("TOTAL_DISCHARGE").toString());
            set.setTransferIn(map.get("TRANSFER_IN").toString());
            set.setTransferOut(map.get("TRANSFER_OUT").toString());
            set.setDeath(map.get("DEATH").toString());
            set.setTotal(map.get("TOTAL").toString());
            set.setOfficers(map.get("OFFICERS").toString());
            set.setOfficersFamily(map.get("OFFICERS_FAMILY").toString());
            set.setC1Self(map.get("C1_1_SELF").toString());
            set.setC1Ex(map.get("C1_1_EX").toString());
            set.setC1Family(map.get("C1_1_FAMILY").toString());
            set.setC2Self(map.get("C1_2_SELF").toString());
            set.setC2Ex(map.get("C1_2_EX").toString());
            set.setC2Family(map.get("C1_2_FAMILY").toString());
            set.setC3Self(map.get("C1_3_SELF").toString());
            set.setC3Ex(map.get("C1_3_EX").toString());
            set.setC3Family(map.get("C1_3_FAMILY").toString());
            set.setArmy(map.get("ARMY").toString());
            set.setCne(map.get("CNE").toString());
            set.setPnl(map.get("PNL").toString());
            set.setVsil(map.get("VSIL").toString());
            set.setCrtdDate(map.get("CRTD_DATE").toString());
            set.setCrtdBy(map.get("CRTD_BY").toString());
            set.setCrtdTerminal(map.get("CRTD_TERMINAL_ID").toString());
            }
            list.add(set);
        }
        return list;
    }
}

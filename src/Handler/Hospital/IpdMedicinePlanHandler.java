/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;

import BO.Hospital.IpdMedicinePlanBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Adeel
 */
public class IpdMedicinePlanHandler {

    public List<IpdMedicinePlanBO> selectIpdMedcinePlan(String patientId,
            String admissionNo, String status) {

        String[] selectColumns = {"-", "PATIENT_ID", "FULL_NAME", "ADMISSION_NO",
            "DOB", "GENDER", "WARD_NAME", "WARD_ID", "CLIENT", "PRIMARY_PHYSICIAN",
            "BED_NAME", "ITEM_ID", "ITEM_NAME", "DOSE_ID", "DOSE_NAME",
            "INSTRUCTION", "ACTIVE", "DISCONTINUE_NAME", "DISCONTINUE_BY",
            "DISCONTINUE_DATE", "DISCONTINUE_TERMINAL", "CRTD_NAME", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL"};

        String query
                = " SELECT IMP.PATIENT_ID,PAT.FULL_NAME,IMP.ADMISSION_NO,   \n"
                + " PAT.DOB,GEN.DESCRIPTION GENDER,               \n"
                + " WRD.DESCRIPTION WARD_NAME,\n"
                + " CLI.DESCRIPTION CLIENT,\n"
                + " PRI.NAME PRIMARY_PHYSICIAN,\n"
                + " BED.DESCRIPTION BED_NAME,\n"
                + " IMP.ITEM_ID,\n"
                + " ITM.DESCRIPTION ITEM_NAME,\n"
                + " IMP.DOSE_TYPE_ID DOSE_ID,\n"
                + " DT.DESCRIPTION DOSE_NAME,\n"
                + " NVL(IMP.INSTRUCTION,' ') INSTRUCTION,\n"
                + " IMP.ACTIVE,\n"
                + " WRD.ID WARD_ID,\n"
                + " DIS.NAME DISCONTINUE_NAME,\n"
                + " NVL(IMP.DISCONTINUE_BY,' ') DISCONTINUE_BY,\n"
                + " NVL(TO_CHAR(IMP.DISCONTINUE_DATE, 'DD-MON-YY HH12:MM AM'),' ')DISCONTINUE_DATE,\n"
                + " NVL(IMP.DISCONTINUE_TERMINAL_ID,' ') DISCONTINUE_TERMINAL,\n"
                + " CRT.NAME CRTD_NAME,\n"
                + " IMP.CRTD_BY,\n"
                + " NVL(TO_CHAR(IMP.CRTD_DATE, 'DD-MON-YY HH12:MM AM'),' ') CRTD_DATE,\n"
                + " IMP.CRTD_TERMINAL_ID CRTD_TERMINAL\n"
                + "  FROM " + Database.DCMS.patientAdmission + "  PA,\n"
                + Database.DCMS.patient + " PAT,\n"
                + Database.DCMS.ward + " WRD,\n"
                + Database.DCMS.client + " CLI,\n"
                + Database.DCMS.bed + "BED,\n"
                + Database.DCMS.ipdMedicinePlan + "IMP,\n"
                + Database.DCMS.definitionTypeDetail + "DT,\n"
                + Database.DCMS.definitionTypeDetail + "GEN,\n"
                + Database.DCMS.item + "ITM,\n"
                + Database.DCMS.users + "DIS,\n"
                + Database.DCMS.users + "CRT,\n"
                + Database.DCMS.users + "PRI\n"
                + " WHERE IMP.PATIENT_ID = '" + patientId + "'\n"
                + "   AND IMP.ADMISSION_NO = '" + admissionNo + "'\n"
                + "   AND IMP.ACTIVE = '" + status + "'\n"
                + "   AND PA.PATIENT_ID = IMP.PATIENT_ID\n"
                + "   AND PAT.PATIENT_ID = IMP.PATIENT_ID\n"
                + "   AND CLI.ID = PAT.CLIENT_ID\n"
                + "   AND PA.WARD_ID = WRD.ID\n"
                + "   AND PA.ID = IMP.ADMISSION_NO\n"
                + "   AND BED.ID = PA.BED_ID\n"
                + "   AND ITM.ID = IMP.ITEM_ID\n"
                + "   AND PRI.USER_NAME = PA.PRIMARY_PHYSICIAN_ID\n"
                + "   AND DT.ID = IMP.DOSE_TYPE_ID\n"
                + "   AND PAT.GENDER_ID = GEN.ID\n"
                + "   AND NVL(DIS.USER_NAME,'GENERAL') = NVL(IMP.DISCONTINUE_BY,'GENERAL')\n"
                + "   AND CRT.USER_NAME = IMP.CRTD_BY";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<IpdMedicinePlanBO> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            IpdMedicinePlanBO setCompound = new IpdMedicinePlanBO();

            setCompound.setPatientId(map.get("PATIENT_ID").toString());
            setCompound.setFullName(map.get("FULL_NAME").toString());
            setCompound.setAdmissionNO(map.get("ADMISSION_NO").toString());
            setCompound.setAge(map.get("DOB").toString());
            setCompound.setGender(map.get("GENDER").toString());
            setCompound.setClient(map.get("CLIENT").toString());
            setCompound.setPrimaryPhysician(map.get("PRIMARY_PHYSICIAN").toString());
            setCompound.setWardId(map.get("WARD_ID").toString());
            setCompound.setBed(map.get("BED_NAME").toString());
            setCompound.setWardName(map.get("WARD_NAME").toString());
            setCompound.setItemId(map.get("ITEM_ID").toString());
            setCompound.setItemName(map.get("ITEM_NAME").toString());
            setCompound.setDoseId(map.get("DOSE_ID").toString());
            setCompound.setDoseDescription(map.get("DOSE_NAME").toString());
            setCompound.setInstruction(map.get("INSTRUCTION").toString());
            setCompound.setActive(map.get("ACTIVE").toString());
            setCompound.setDiscontinueBy(map.get("DISCONTINUE_BY").toString());
            setCompound.setDiscontinueUser(map.get("DISCONTINUE_NAME").toString());
            setCompound.setDiscontinueDate(map.get("DISCONTINUE_DATE").toString());
            setCompound.setDiscountinueTerminal(map.get("DISCONTINUE_TERMINAL").toString());
            setCompound.setCrtdBy(map.get("CRTD_BY").toString());
            setCompound.setCrtdUser(map.get("CRTD_NAME").toString());
            setCompound.setCrtdDate(map.get("CRTD_DATE").toString());
            setCompound.setCrtdTerminal(map.get("CRTD_TERMINAL").toString());
            list.add(setCompound);
        }
        return list;
    }

    public boolean insertIpdMedicinePlan(IpdMedicinePlanBO imp) {

        String[] columns = {Database.DCMS.ipdMedicinePlan,
            "PATIENT_ID", "ADMISSION_NO", "ITEM_ID", "DOSE_TYPE_ID",
            "INSTRUCTION", "ACTIVE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("PATIENT_ID", "'" + imp.getPatientId() + "'");
        map.put("ADMISSION_NO", "'" + imp.getAdmissionNO() + "'");
        map.put("ITEM_ID", "'" + imp.getItemId() + "'");
        map.put("DOSE_TYPE_ID", "'" + imp.getDoseId() + "'");
        map.put("INSTRUCTION", "'" + imp.getInstruction() + "'");
        map.put("ACTIVE", "'" + imp.getActive() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", "" + Constants.today + "");
        map.put("CRTD_TERMINAL_ID", "'" +Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateDiscontinueMedicine(List<String> listImp,
            IpdMedicinePlanBO objUpdate, String active) {
        boolean ret = true;
        for (int i = 0; i < listImp.size(); i++) {
            String itemId = listImp.get(i);
            String query
                    = " UPDATE " + Database.DCMS.ipdMedicinePlan + "        \n"
                    + " SET ACTIVE = '" + active + "',                                   \n"
                    + " DISCONTINUE_BY = '" +objUpdate.getDiscontinueBy()+"',        \n"
                    + " DISCONTINUE_DATE = " +objUpdate.getDiscontinueDate()+",       \n"
                    + " DISCONTINUE_TERMINAL_ID = '" + objUpdate.getDiscountinueTerminal()+ "'\n"
//                    + " CONTINUE_BY = '" +objUpdate.getContinueBy() + "',        \n"
//                    + " CONTINUE_DATE = " +objUpdate.getContinueDate() + ",       \n"
//                    + " CONTINUE_TERMINAL_ID = '" + objUpdate.getContinueTerminal() + "'\n"
                    + " WHERE  PATIENT_ID = '" + objUpdate.getPatientId() + "'\n"
                    + " AND  ADMISSION_NO = '" + objUpdate.getAdmissionNO() + "' \n"
                    + " AND  ITEM_ID  = '" + itemId + "' \n";
            System.out.println(query);
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
}

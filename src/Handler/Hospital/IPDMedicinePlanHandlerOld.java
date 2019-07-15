package Handler.Hospital;

import BO.Hospital.MedicineOrderEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class IPDMedicinePlanHandlerOld {

    public boolean saveIpdMedMaster(MedicineOrderEntry obj) {

        String[] columns = {Database.DCMS.ipdMedicinePlanMaster, "ID", "PATIENT_ID", "ADMISSION_NO", "TIME",
            "ITEM_ID", "STATUS_ID", "IS_ACTIVE", "QUANTITY_PER_DAY", "INTAKE_TYPE", "INSTRUCTIONS",
            "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();

        obj.setIpdMedPlanMasterId(this.getId(Database.DCMS.ipdMedicinePlanMaster));
        map.put("ID", obj.getIpdMedPlanMasterId());
        map.put("PATIENT_ID", "'" + obj.getPatientId() + "'");
        map.put("ADMISSION_NO", "'" + obj.getAdmissionNumber() + "'");
        map.put("ITEM_ID", "'" + obj.getItemId() + "'");
        map.put("STATUS_ID", "'" + obj.getOrderStatusId() + "'");
        map.put("QUANTITY_PER_DAY", "'" + obj.getQuantity() + "'");
        map.put("TIME", "'" + obj.getDoseTimeId() + "'");
        map.put("IS_ACTIVE", "'Y'");
        map.put("INTAKE_TYPE", "'" + obj.getIntakeTypeId() + "'");
        map.put("INSTRUCTIONS", "'" + obj.getDoseQtyId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        list.add(map);

        return Constants.dao.insertData(list, columns);

    }

    public List<MedicineOrderEntry> selectIPDMedMaster(String patientId, String admissionNo, String isActive) {

        String[] columns = {"-", "ID", "ITEM_ID", "ITEM_DESCRIPTION", "STATUS_ID", "STATUS_DESCRIPTION",
            "QUANTITY_PER_DAY", "DURATION", "TOTAL_QUANTITY", "INTAKE_TYPE_ID", "INTAKE_TYPE_DESCRIPTION",
            "START_BY", "START_DATE", "START_TERMINAL_ID", "END_BY", "END_DATE", "END_TERMINAL_ID",
            "IS_ACTIVE", "TIME", "INSTRUCTIONS"};

        String query = "SELECT IMP.ID, IT.ID ITEM_ID, IT.DESCRIPTION ITEM_DESCRIPTION , IMP.TIME,       \n"
                + " IMP.STATUS_ID STATUS_ID, STA.DESCRIPTION STATUS_DESCRIPTION, IMP.QUANTITY_PER_DAY,  \n"
                + " NVL(IMP.DURATION,0) DURATION, NVL(IMP.TOTAL_QUANTITY,0) TOTAL_QUANTITY,         \n"
                + " IMP.INTAKE_TYPE INTAKE_TYPE_ID, NVL(IMP.INSTRUCTIONS,' ')  INSTRUCTIONS,            \n"
                + " INTAKE.DESCRIPTION INTAKE_TYPE_DESCRIPTION, IMP.CRTD_BY START_BY,                   \n"
                + " TO_CHAR(IMP.CRTD_DATE,'DD-MON-YY HH:MI:SS AM') START_DATE,                          \n"
                + " IMP.CRTD_TERMINAL_ID START_TERMINAL_ID, NVL(IMP.END_BY,' ') END_BY,                 \n"
                + " NVL(TO_CHAR(IMP.END_DATE,'DD-MON-YY HH:MI:SS AM'),' ') END_DATE,                    \n"
                + " NVL(IMP.END_TERMINAL_ID,' ') END_TERMINAL_ID, IMP.IS_ACTIVE                         \n"
                + " FROM " + Database.DCMS.ipdMedicinePlanMaster + "  IMP,                              \n"
                + Database.DCMS.item + "  IT,                                                           \n"
                + Database.DCMS.definitionTypeDetail + "  STA,                                          \n"
                + Database.DCMS.definitionTypeDetail + "  INTAKE                                        \n"
                + " WHERE IMP.PATIENT_ID = '"+ patientId + "'                                           \n"
                + " AND IMP.ADMISSION_NO = '"+ admissionNo +"'                                          \n"
                + " AND IMP.ITEM_ID = IT.ID                                                             \n"
                + " AND IMP.STATUS_ID = STA.ID                                                          \n"
                + " AND IMP.INTAKE_TYPE = INTAKE.ID                                                     \n";

        if (isActive.equalsIgnoreCase("Y")) {
            query += " AND IMP.IS_ACTIVE = 'Y'";
        } else if (isActive.equalsIgnoreCase("N")) {
            query += " AND IMP.IS_ACTIVE = 'N'";
        }

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        List<MedicineOrderEntry> lstMed = new ArrayList();

        for (int i = 0; i < list.size(); i++) {

            HashMap map = list.get(i);
            MedicineOrderEntry med = new MedicineOrderEntry();

            med.setPatientId(patientId);
            med.setAdmissionNumber(admissionNo);
            med.setIpdMedPlanMasterId(map.get("ID").toString());
            med.setItemId(map.get("ITEM_ID").toString());
            med.setItemDescription(map.get("ITEM_DESCRIPTION").toString());
            med.setOrderStatusId(map.get("STATUS_ID").toString());
            med.setOrderStatusDescription(map.get("STATUS_DESCRIPTION").toString());
            med.setQuantity(map.get("QUANTITY_PER_DAY").toString());
            med.setDuration(map.get("DURATION").toString());
            med.setDoseTimeId(map.get("TIME").toString());
            med.setDoseQtyId(map.get("INSTRUCTIONS").toString());
            med.setTotalQty(map.get("TOTAL_QUANTITY").toString());
            med.setIntakeTypeId(map.get("INTAKE_TYPE_ID").toString());
            med.setIntakeTypeDescription(map.get("INTAKE_TYPE_DESCRIPTION").toString());
            med.setStartBy(map.get("START_BY").toString());
            med.setStartDate(map.get("START_DATE").toString());
            med.setStartTerminalId(map.get("START_TERMINAL_ID").toString());
            med.setEndBy(map.get("END_BY").toString());
            med.setEndDate(map.get("END_DATE").toString());
            med.setEndTerminalId(map.get("END_TERMINAL_ID").toString());
            med.setIsActive(map.get("IS_ACTIVE").toString());

            lstMed.add(med);
        }
        return lstMed;
    }

    public boolean saveIpdMedPlanDetail(MedicineOrderEntry med) {

        String[] columns = {Database.DCMS.ipdMedicinePlanDetail, "ID", "PLAN_MASTER_ID", "ADMISSION_NO",
            "ITEM_ID", "TIME_IN_TAKE"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();
        med.setIpdMedPlanDetailId(this.getId(Database.DCMS.ipdMedicinePlanDetail));
        map.put("ID", med.getIpdMedPlanDetailId());
        map.put("PLAN_MASTER_ID", med.getIpdMedPlanMasterId());
        map.put("ADMISSION_NO", med.getAdmissionNumber());
        map.put("ITEM_ID", med.getItemId());
        map.put("TIME_IN_TAKE", "TO_CHAR(SYSDATE + " + currentHr + "/24,'DD-MON-YY HH:MI:SS AM')");

        list.add(map);

        return Constants.dao.insertData(list, columns);
    }

    int currentHr = 0;

    public boolean GenerateAndSaveMedicinePlan(MedicineOrderEntry med) {

        int totalHrs = 24 * Integer.parseInt(med.getDuration());
        int doseTime = 24 / Integer.parseInt(med.getQuantity());
        currentHr = doseTime;

        boolean ret = true;

        while (currentHr <= totalHrs) {

            ret = this.saveIpdMedPlanDetail(med);
            currentHr = (currentHr + doseTime);
        }
        return ret;
    }

    public List<MedicineOrderEntry> selectMedPlanDetail(String admissionNo, String ipdMedPlanMasterId) {

        String[] col = {"-", "ID", "ITEM_ID", "ITEM_DESCRIPTION", "TIME_IN_TAKE", "REMARKS",
            "DISPENSE_BY", "DISPENSE_DATE", "DISPENSE_TERMINAL_ID", "IS_GIVEN", "IS_ACTIVE"};

        String query = "SELECT MPD.ID, MPD.ITEM_ID, IT.DESCRIPTION ITEM_DESCRIPTION,        \n"
                + " MPD.TIME_IN_TAKE,  NVL(MPD.REMARKS,' ') REMARKS, MPM.IS_ACTIVE,       \n"
                + "  NVL(MPD.DISPENSE_BY,' ') DISPENSE_BY,                                     \n "
                + " NVL(TO_CHAR(MPD.DISPENSE_DATE,'DD-MON-YY HH:MI:SS AM'),' ') DISPENSE_DATE,"
                + "NVL(MPD.DISPENSE_TERMINAL_ID,' ') DISPENSE_TERMINAL_ID, MPD.IS_GIVEN        \n"
                + " FROM " + Database.DCMS.ipdMedicinePlanDetail + "   MPD,                     \n"
                + Database.DCMS.ipdMedicinePlanMaster + "   MPM,                               \n"
                + Database.DCMS.item + " IT                                                    \n"
                + " WHERE MPD.ADMISSION_NO = '" + admissionNo + "'                             \n"
                + " AND MPD.PLAN_MASTER_ID = '" + ipdMedPlanMasterId + "'                      \n"
                + " AND MPD.ITEM_ID = IT.ID                                                    \n"
                + " AND MPM.IS_ACTIVE = 'Y'                                                    \n"
                + " AND MPD.PLAN_MASTER_ID = MPM.ID                                            \n"
                + " ORDER BY MPD.ID ASC                                                        \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, col);
        List<MedicineOrderEntry> listMed = new ArrayList();

        for (int i = 0; i < list.size(); i++) {

            HashMap map = list.get(i);
            MedicineOrderEntry med = new MedicineOrderEntry();

            med.setAdmissionNumber(admissionNo);
            med.setIpdMedPlanMasterId(ipdMedPlanMasterId);
            med.setIpdMedPlanDetailId(map.get("ID").toString());
            med.setItemId(map.get("ITEM_ID").toString());
            med.setItemDescription(map.get("ITEM_DESCRIPTION").toString());
            med.setTimeInTake(map.get("TIME_IN_TAKE").toString());
            med.setRemarks(map.get("REMARKS").toString());
            med.setDispenseBy(map.get("DISPENSE_BY").toString());
            med.setDispenseDate(map.get("DISPENSE_DATE").toString());
            med.setDispenseTerminalId(map.get("DISPENSE_TERMINAL_ID").toString());
            med.setIsGiven(map.get("IS_GIVEN").toString());
            med.setIsActive(map.get("IS_ACTIVE").toString());

            listMed.add(med);
        }
        return listMed;
    }

    public String getId(String table) {

        String[] columns = {"-", "ID"};
        String query = "SELECT NVL(MAX(ID+1),1) ID FROM " + table;

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);

        return list.get(0).get("ID").toString();
    }

    public boolean updateMedPlanDetail(MedicineOrderEntry med) {

        String query = "UPDATE " + Database.DCMS.ipdMedicinePlanDetail + "  IMP \n"
                + " SET IMP.DISPENSE_BY = '" + Constants.userId + "',                \n"
                + " IMP.DISPENSE_DATE = SYSDATE,                                     \n"
                + " IMP.DISPENSE_TERMINAL_ID = '" + Constants.terminalId + "',       \n"
                + " IMP.IS_GIVEN = 'Y',                                              \n"
                + " IMP.REMARKS = '" + med.getRemarks() + "'                         \n"
                + " WHERE IMP.ID = '" + med.getIpdMedPlanDetailId() + "'             \n";

        return Constants.dao.executeUpdate(query, true);
    }

    public boolean updateMedPlanMaster(MedicineOrderEntry med) {

        String query = "UPDATE " + Database.DCMS.ipdMedicinePlanMaster + " MPM \n"
                + " SET MPM.IS_ACTIVE = '" + med.getIsActive() + "',                   \n"
                + " MPM.END_DATE = SYSDATE,                                          \n"
                + " MPM.STATUS_ID = '" + med.getOrderStatusId() + "',                   \n"
                + " MPM.END_BY = '" + Constants.userId + "',                         \n"
                + " MPM.END_TERMINAL_ID = '" + Constants.terminalId + "'             \n"
                + " WHERE MPM.ID = '" + med.getIpdMedPlanMasterId() + "'              \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateMedPlanMasterStatus(MedicineOrderEntry med) {

        String query = "UPDATE " + Database.DCMS.ipdMedicinePlanMaster + " MPM \n"
                + " SET MPM.STATUS_ID = '" + med.getOrderStatusId() + "'                \n"
                + " WHERE MPM.ID = '" + med.getIpdMedPlanMasterId() + "'              \n";

        return Constants.dao.executeUpdate(query, true);
    }

    public boolean updateDuration(MedicineOrderEntry med) {

        String query = "UPDATE " + Database.DCMS.ipdMedicinePlanMaster + " MPM \n"
                + " SET MPM.DURATION = '" + med.getDuration() + "',            \n"
                + " MPM.TOTAL_QUANTITY = '" + med.getTotalQty() + "'           \n"
                + " WHERE MPM.ID = '" + med.getIpdMedPlanMasterId() + "'       \n";

        return Constants.dao.executeUpdate(query, true);
    }

    public boolean deleteOrder(MedicineOrderEntry med) {

        String query = "DELETE FROM " + Database.DCMS.opdCptMedOrders + " OC        \n"
                + " WHERE OC.CONSULTANCY_ID = '" + med.getAdmissionNumber() + "'    \n"
                + " AND OC.ITEM_ID = '" + med.getItemId() + "'                      \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean savOrder(MedicineOrderEntry obj) {

        String[] columns = {Database.DCMS.opdCptMedOrders, "CONSULTANCY_ID", "ITEM_ID", "ORDER_TYPE",
            "TIME", "INSTRUCTIONS", "DURATION", "CRTD_BY", "CRTD_TERMINAL_ID", "QUANTITY"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();

        map.put("CONSULTANCY_ID", "'" + obj.getAdmissionNumber() + "'");
        map.put("ITEM_ID", "'" + obj.getItemId() + "'");
        map.put("ORDER_TYPE", "'001'");
        map.put("TIME", "'" + obj.getDoseTimeId() + "'");
        map.put("INSTRUCTIONS", "'" + obj.getDoseQtyId() + "'");
        map.put("DURATION", "'" + obj.getDuration() + "'");
        map.put("QUANTITY", "'" + obj.getQuantity() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        list.add(map);

        return Constants.dao.insertData(list, columns);

    }

}

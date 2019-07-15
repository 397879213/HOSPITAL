/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author DANISH
 */
public class SharingProcessUpdated {

    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String userId = "";
    private String crtdDate = "";
    private String userName = "";
    private String sharingMonth = "";
    private String listDelete;
    private String price;
    private String totalRev;
    private String performingShare;
    private String sectionNo;
    private String totalCount;
    private String name;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalRev() {
        return totalRev;
    }

    public void setTotalRev(String totalRev) {
        this.totalRev = totalRev;
    }

    public String getPerformingShare() {
        return performingShare;
    }

    public void setPerformingShare(String performingShare) {
        this.performingShare = performingShare;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSharingMonth() {
        return sharingMonth;
    }

    public void setSharingMonth(String sharingMonth) {
        this.sharingMonth = sharingMonth;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public boolean selectPracticeIncome() {

        String[] columns = {"-", "USER_ID", "CRTD_DATE"};

        String query
                = "SELECT DISTINCT(USER_ID), TO_CHAR(PI.CRTD_DATE,'MON-YYYY') CRTD_DATE"
                + " FROM  "
                + Database.DCMS.practiceIncome + " PI                             \n"
                + "WHERE TRUNC(PI.CRTD_DATE) BETWEEN '01-JAN-17' AND '10-JAN-17'   \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, columns);

        List<SharingProcessUpdated> list = new ArrayList<>();
        for (HashMap map : lis) {
            SharingProcessUpdated objLate = new SharingProcessUpdated();
            objLate.setUserId(map.get("USER_ID").toString());
            objLate.setCrtdDate(map.get("CRTD_DATE").toString());
            list.add(objLate);
        }

        boolean ret = insertPracticeIncome(list);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    private boolean insertPracticeIncome(List<SharingProcessUpdated> vecDC) {

        String[] columns = {Database.DCMS.performingShareSummary, "USER_ID",
            "SHARE_MONTH"};

        List lis = new ArrayList<>();
        List<String> listDelete = new ArrayList<>();
        for (int i = 0; i < vecDC.size(); i++) {
            SharingProcessUpdated cps = vecDC.get(i);

            String delete = " DELETE FROM  " + Database.DCMS.performingShareSummary
                    + " WHERE USER_ID = '" + cps.getUserId() + "' "
                    + " AND SHARE_MONTH = '" + cps.getCrtdDate() + "'";

            listDelete.add(delete);

            HashMap email = new HashMap();
            email.put("USER_ID", "'" + cps.getUserId() + "'");
            email.put("SHARE_MONTH", "'" + cps.getCrtdDate() + "'");
            lis.add(email);
        }

        boolean ret = Constants.dao.executeUpdates(listDelete);

        if (ret) {
            ret = Constants.dao.insertData(lis, columns);
        }
        return ret;

    }

    public boolean selectPerformingShare() {

        String[] columns = {"-", "UPDATE_QUERY"};

        String query = "SELECT 'UPDATE " + Database.DCMS.performingShareSummary + " \n"
                + "SET OPD_GEN_COUNT = '||COUNT(IVD.SECTION_NO)||', OPD_GEN_REVENUE = '||SUM(IVD.PRICE)||', OPD_GEN_SHARE = '|| SUM(PI.PERFORMING_SHARE)\n"
                + "||' WHERE USER_ID = '''||PI.USER_ID||''' AND SHARE_MONTH = '''||'AUG-2016'';' UPDATE_QUERY\n"
                + " FROM  "
                + Database.DCMS.practiceIncome + " PI,                    \n"
                + Database.DCMS.invoiceDetail + " IVD,                    \n"
                + Database.DCMS.CPT + " CPT                               \n"
                + "WHERE PI.CRTD_DATE  BETWEEN  '01-AUG-2016'  AND '31-AUG-2016'\n"
                + "AND PI.COMPLETE_ORDER_NO = IVD.COMPLETE_ORDER_NO       \n"
                + "AND PI.ORDER_DETAIL_ID = IVD.ORDER_DETAIL_ID           \n"
                + "AND PI.USER_ID = IVD.PERFORMING_PHYSICIAN_ID           \n"
                + "AND CPT.SUB_SECTION_ID = 'GEN-OPD'                     \n"
                + "AND IVD.STATUS_ID = 5                                  \n"
                + "AND IVD.CPT_ID = CPT.CPT_ID                            \n";
        query += "GROUP BY PI.USER_ID                                     \n";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<String> list = new ArrayList<>();
        for (HashMap map : mapList) {
            list.add(map.get("UPDATE_QUERY").toString());
        }

        boolean ret = Constants.dao.executeUpdate(query, true);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public void PracticeIncome() {
        SharingProcessUpdated practiseIncome = new SharingProcessUpdated();
        practiseIncome.selectPracticeIncome();
        practiseIncome.selectPerformingShare();

    }

    public static void main(String[] args) {

        SharingProcessUpdated sharingProcess = new SharingProcessUpdated();
        sharingProcess.PracticeIncome();
    }
}

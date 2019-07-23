/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OT.Controller;

import BO.Order.CPTQuestionaire;
import Handler.Order.CPTQuestionaireHandler;
import OT.BO.CardiacSurgery;
import OT.Handler.CardiacSurgeryHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Danish
 */
public class CardiacController {

    CardiacSurgeryHandler hdlCardiacSurg = new CardiacSurgeryHandler();
    CPTQuestionaireHandler hdlQues = new CPTQuestionaireHandler();

    public List<CardiacSurgery> selectSurgeryInfo(String con, String odi) {
        return hdlCardiacSurg.selectSurgeryInfo(con, odi);
    }

    public List<CardiacSurgery> selectAccessInfo(String con, String odi) {
        return hdlCardiacSurg.selectAccessInfo(con, odi);
    }

    List<CardiacSurgery> listOtOperation = new ArrayList();

    public boolean insertSurgeryInfo(CardiacSurgery operate) {
        boolean ret = hdlCardiacSurg.insertSurgeryInfo(operate);

        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.commitTransaction();
        }
        return ret;
    }
    
    public boolean insertAccessInfo(CardiacSurgery operate) {
        boolean ret = hdlCardiacSurg.insertAccessInfo(operate);

        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.commitTransaction();
        }
        return ret;
    }
    
    public boolean deleteOtDetail(String id) {
        boolean ret = true;
        ret = hdlCardiacSurg.deleteOtDetail(id);

        if (ret) {
            Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.commitTransaction();
        }
        return ret;
    }

//    public List<CardiacSurgery> selectOTPendingAll(String con, String odi, 
//            String typeDetailId, String actionId) {
//        listOtOperation = hdlCardiacSurg.selectDetails(con, odi, typeDetailId, actionId);
//        System.err.println("Listttt" + listOtOperation.size());
//        return hdlCardiacSurg.selectDetails(con, odi, typeDetailId, actionId);
//        
//    }
    public List<CardiacSurgery> selectOtDetail(String con, String odi, String actionId) {
        return hdlCardiacSurg.selectOtDetail(con, odi, actionId);
    }

    public boolean insertOperDetail(List<CardiacSurgery> operate) {

        boolean ret = true;
        for (int i = 0; i < operate.size(); i++) {
            ret = hdlCardiacSurg.insertOperDetail(operate.get(i));

            if (ret) {
                Constants.dao.commitTransaction();
            }

            if (!ret) {
                Constants.dao.commitTransaction();
            }
        }
        return ret;
    }

    public boolean updateStatus(String typeDetailId, CardiacSurgery card) {

        boolean ret = true;
        {
            ret = hdlCardiacSurg.updateStatus(typeDetailId, card);

            if (ret) {
                Constants.dao.commitTransaction();
            }

            if (!ret) {
                Constants.dao.commitTransaction();
            }
        }
        return ret;
    }

    public boolean deleteOperationDetail(String id) {

        boolean ret = true;
        {
            ret = hdlCardiacSurg.deleteOperationDetail(id);

            if (ret) {
                Constants.dao.commitTransaction();
            }

            if (!ret) {
                Constants.dao.commitTransaction();
            }
        }
        return ret;
    }

    public List<CardiacSurgery> selectDescription(String deftypeid) {
        String[] columns = {"-", "ID", "DESCRIPTION"};
        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DTD      \n"
                + " WHERE DTD.DEF_TYPE_ID = '" + deftypeid + "'\n"
                + " ORDER BY ID";
        List<HashMap> listType = Constants.dao.selectDatainList(query, columns);
        List<CardiacSurgery> listq = new ArrayList<>();

        for (int i = 0; i < listType.size(); i++) {

            HashMap map = (HashMap) listType.get(i);
            CardiacSurgery objEch = new CardiacSurgery();
            objEch.setTypeDetailId(map.get("ID").toString());
            objEch.setDescription(map.get("DESCRIPTION").toString());
            listq.add(objEch);
        }

        return listq;
    }

    public boolean insertCabgProcedure(CardiacSurgery operate) {

        boolean ret = true;
        ret = hdlCardiacSurg.insertCabgProcedure(operate);

        if (ret) {
            Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.commitTransaction();
        }

        return ret;
    }

    public List<CardiacSurgery> selectCabgProcedure(String con, String odi) {
        return hdlCardiacSurg.selectCabgProc(con, odi);
    }

    public boolean insertValSurgery(CardiacSurgery operate) {

        boolean ret = true;
        ret = hdlCardiacSurg.insertValSurgery(operate);

        if (ret) {
            Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.commitTransaction();
        }

        return ret;
    }

    public List<CardiacSurgery> selectValSurgery(String con, String odi) {
        return hdlCardiacSurg.selectValSurgery(con, odi);
    }

    public boolean deletecabgDetail(String id) {

        boolean ret = true;
        {
            ret = hdlCardiacSurg.deletecabgDetail(id);

            if (ret) {
                Constants.dao.commitTransaction();
            }

            if (!ret) {
                Constants.dao.commitTransaction();
            }
        }
        return ret;
    }

    public boolean deleteValveSurg(String id) {

        boolean ret = hdlCardiacSurg.deleteValveSurg(id);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.commitTransaction();
        }
        return ret;
    }

    public boolean insertClosurePaceWire(CardiacSurgery operate) {

        boolean ret = true;
                //hdlCardiacSurg.insertClosurePaceWire(operate);

        if (ret) {
            Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.commitTransaction();
        }

        return ret;
    }

    public boolean updateQuestionaire(List<CPTQuestionaire> listDetail,
            CPTQuestionaire master) {

        boolean ret = hdlQues.saveCPTQuestionaireDetail(listDetail, master);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.rollBack();
        }

        return ret;

    }

    public boolean insertCabgsurgery(CardiacSurgery operate) {
        boolean ret = hdlCardiacSurg.insertCabgsurgery(operate);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.rollBack();
        }

        return ret;
    }

    public boolean insertInOTDetail(CardiacSurgery operate) {
        boolean ret = hdlCardiacSurg.insertOperDetail(operate);
        if (ret) {
            Constants.dao.commitTransaction();
        }

        if (!ret) {
            Constants.dao.commitTransaction();
        }
        return ret;
    }

    public List<CardiacSurgery> selectCabgSurgery(String con, String odi) {
        return hdlCardiacSurg.selectCabgSurgery(con, odi);
    }

    public List<CPTQuestionaire> selectQuestionaireMaster(String con, String odi, String orderStatusId) {
        return hdlQues.selectQuestionaireMaster(con, odi, orderStatusId);
    }

    public List<CPTQuestionaire> selectQuestionaireDetail(String con, String odi, String orderStatusId, String questionaireId) {
        return hdlQues.selectQuestionaireDetail(con, odi, orderStatusId, questionaireId);
    }

}

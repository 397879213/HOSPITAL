/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Controller;

import OPD.BO.WardStatusBO;
import OPD.Handler.WardStatusHandler;
import java.util.List;

/**
 *
 * @author Pacslink
 */
public class WardStatusController {
    
    WardStatusHandler hdlWardStatus = new WardStatusHandler();
    public List<WardStatusBO> selectOnCallDoctor(String date) {
        return hdlWardStatus.selectOnCallDoctor(date);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.ParameterResultsSearchBO;
import Handler.OPD.ParameterResultsSearchHandler;
import java.util.List;

/**
 *
 * @author raheelansari
 */
public class ParameterResultsSearchController {

    ParameterResultsSearchHandler hdlParameterResults = new ParameterResultsSearchHandler();

    public List<ParameterResultsSearchBO> patientPerformedParametersPRD(
            ParameterResultsSearchBO SearchObj) {
        return hdlParameterResults.patientPerformedParametersPRD(SearchObj);
    }
}

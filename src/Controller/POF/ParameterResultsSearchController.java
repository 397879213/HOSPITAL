/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.POF;

import BO.POF.ParameterResultsSearchBO;
import Handler.POF.ParameterResultsSearchHandler;
import java.util.List;

/**
 *
 * @author raheelansari
 */
public class ParameterResultsSearchController {

    ParameterResultsSearchHandler hdlParameterResults = new ParameterResultsSearchHandler();

    public List<ParameterResultsSearchBO> patientPerformedParametersPRD(
            String fromDate, String toDate, String fromResult, String toResult,
            String parameterId) {
        return hdlParameterResults.patientPerformedParametersPRD(fromDate, toDate,
                fromResult, toResult, parameterId);
    }
}

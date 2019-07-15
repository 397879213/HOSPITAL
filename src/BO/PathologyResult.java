/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class PathologyResult implements java.io.Serializable{

    private String parameterId = "";
    private String range = "";
    private String unit = "";
    private String result1 = "";
    private String result2 = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    
    public PathologyResult(String param , String range, String unit, String res1 , String res2){
        
        this.parameterId = param;
        this.range = range;
        this.unit = unit;
        this.result1 = res1;
        this.result2 = res2;
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    
}

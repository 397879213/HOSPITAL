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


public class PACSStudyStatus implements java.io.Serializable{

    public static String archived = "ARCHIVED";
    public static String reported = "REPORTED";
    public static String assigned = "ASSIGNED";
    public static String requested = "REQUESTED";
    public static String dictated = "DICTATED";
    public static String deleted =   "DELETED";
    public static String performed = "PERFORMED";
    public static String transferred = "TRANSFERRED";
    public static String transcribed = "TRANSCRIBED";
    public static String uploaded = "UPLOADED";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
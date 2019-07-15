/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class TerminalMacAddresses implements java.io.Serializable {

    private String terminalId = "";
    private String terminalName = "";
    private String macAddress = "";
    private String newMacAddress = "";

    private String IP = "";
    private String comments = "";
    private String active = "";
    private int rowIndex;

    private int getRowIndex() {
        return rowIndex;
    }

    private void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getNewMacAddress() {
        return newMacAddress;
    }

    public void setNewMacAddress(String newMacAddress) {
        this.newMacAddress = newMacAddress;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
    
    
    
    
}

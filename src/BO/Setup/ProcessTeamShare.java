/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Setup;

/**
 *
 * @author user
 */
public class ProcessTeamShare {

    private String teamId = "";
    private String id = "";
    private String userId = "";
    private String contractId = "";
    private String contractName = "";
    private String performingShare = "";
    private String performingPhysicianName = "";
    private String userName = "";
    private String cptId = "";
    private String physicianfee = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getPerformingPhysicianName() {
        return performingPhysicianName;
    }

    public void setPerformingPhysicianName(String performingPhysicianName) {
        this.performingPhysicianName = performingPhysicianName;
    }

    public String getPhysicianfee() {
        return physicianfee;
    }

    public void setPhysicianfee(String physicianfee) {
        this.physicianfee = physicianfee;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPerformingShare() {
        return performingShare;
    }

    public void setPerformingShare(String performingShare) {
        this.performingShare = performingShare;
    }
}

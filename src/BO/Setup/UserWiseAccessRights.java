/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Setup;

/**
 *
 * @author zain
 */
public class UserWiseAccessRights {

    private String id = "";
    private String UserId = "";
    private String ActionId = "";
    private String UserAccessRightsId = "";
    private String Crtd_By = "";
    private String Crtd_Date = "";
    private String Crtd_Terminal_Id = "";
    private String ActionType = "";
    private String selectUserAssignRightsquery = "";
    private String selectUserNotAssignRightsquery = "";
    private String searchAssignRightsQuery = "";
    private String searchNotAssignRightsQuery = "";

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getActionId() {
        return ActionId;
    }

    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    public String getUserAccessRightsId() {
        return UserAccessRightsId;
    }

    public void setUserAccessRightsId(String UserAccessRightsId) {
        this.UserAccessRightsId = UserAccessRightsId;
    }

    public String getCrtd_By() {
        return Crtd_By;
    }

    public void setCrtd_By(String Crtd_By) {
        this.Crtd_By = Crtd_By;
    }

    public String getCrtd_Date() {
        return Crtd_Date;
    }

    public void setCrtd_Date(String Crtd_Date) {
        this.Crtd_Date = Crtd_Date;
    }

    public String getCrtd_Terminal_Id() {
        return Crtd_Terminal_Id;
    }

    public void setCrtd_Terminal_Id(String Crtd_Terminal_Id) {
        this.Crtd_Terminal_Id = Crtd_Terminal_Id;
    }

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

   public String getSelectUserAssignRightsquery() {
        return selectUserAssignRightsquery;
    }

    public void setSelectUserAssignRightsquery(String selectUserAssignRightsquery) {
        this.selectUserAssignRightsquery = selectUserAssignRightsquery;
    }

    public String getSelectUserNotAssignRightsquery() {
        return selectUserNotAssignRightsquery;
    }

    public void setSelectUserNotAssignRightsquery(String selectUserNotAssignRightsquery) {
        this.selectUserNotAssignRightsquery = selectUserNotAssignRightsquery;
    }

    public String getSearchAssignRightsQuery() {
        return searchAssignRightsQuery;
    }

    public void setSearchAssignRightsQuery(String searchAssignRightsQuery) {
        this.searchAssignRightsQuery = searchAssignRightsQuery;
    }

    public String getSearchNotAssignRightsQuery() {
        return searchNotAssignRightsQuery;
    }

    public void setSearchNotAssignRightsQuery(String searchNotAssignRightsQuery) {
        this.searchNotAssignRightsQuery = searchNotAssignRightsQuery;
    }
    

}

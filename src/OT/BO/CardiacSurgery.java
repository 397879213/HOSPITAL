/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OT.BO;

/**
 *
 * @author Danish
 */
public class CardiacSurgery {

    private String id = "";
    private String typeDetailId = "";
    private String patientId = "";
    private String patientName = "";
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String cptDescription = "";
    private String performingPhysicianId = "";
    private String statusDescription = "";
    private String orderStatusId = "";
    private String wardId = "";
    private String bedId = "";
    private String wardDescription = "";
    private String bedDescription = "";
    private String crtdBy = "";
    private String crtdByName = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String age = "";
    private String gender = "";
    private String defTypeId = "";
    private String cabgProcId = "";
    private String cabgId = "";
    private String cabgProcDescription = "";
    private String cronaryId = "";
    private String cronaryDescription = "";
    private String conduitId = "";
    private String conduitDescription = "";
    private String distalVesselId = "";
    private String distalVesselDescription = "";
    private String Endart = "";
    private String pi = "";
    private String flow = "";
    private String valSurId = "";
    private String valSurDescription = "";
    private String procOptId = "";
    private String procOptDescription = "";
    private String expId = "";
    private String expDescription = "";
    private String impId = "";
    private String impDescription = "";
    private String typeId = "";
    private String typeDescription = "";
    private String valSize = "";
    private String valSrNo = "";
    private String closureId = "";
    private String closureDescription = "";
    private String paceWireId = "";
    private String paceWireDescription = "";
    private String type = "";
    
    private String surgeryDate = "";
    private String surgeryDay = "";
    private String laLine = "";
    private String nonCardiacProc = "";
    private String useOfShunt = "";
    private String aorticClampTime = "";
    private String thoracicAeroticRemarks = ""; 
    private String remarks = "";
    private String actionId = "";
    
    private String priority = "";
    private String roleofRobot = "";
    private String firstRedo = "";
    private String surgeryRemarksId = "";
    private String surgeryRemarks = "";
    private String access = "";
    private String isElective = "";
    private String electiveRemarksId = "";
    private String electiveRemarks = "";

    public String getElectiveRemarksId() {
        return electiveRemarksId;
    }

    public void setElectiveRemarksId(String electiveRemarksId) {
        this.electiveRemarksId = electiveRemarksId;
    }
    
    public String getSurgeryRemarksId() {
        return surgeryRemarksId;
    }

    public void setSurgeryRemarksId(String surgeryRemarksId) {
        this.surgeryRemarksId = surgeryRemarksId;
    }
    
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getRoleofRobot() {
        return roleofRobot;
    }

    public void setRoleofRobot(String roleofRobot) {
        this.roleofRobot = roleofRobot;
    }

    public String getFirstRedo() {
        return firstRedo;
    }

    public void setFirstRedo(String firstRedo) {
        this.firstRedo = firstRedo;
    }

    public String getSurgeryRemarks() {
        return surgeryRemarks;
    }

    public void setSurgeryRemarks(String surgeryRemarks) {
        this.surgeryRemarks = surgeryRemarks;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getIsElective() {
        return isElective;
    }

    public void setIsElective(String isElective) {
        this.isElective = isElective;
    }

    public String getElectiveRemarks() {
        return electiveRemarks;
    }

    public void setElectiveRemarks(String electiveRemarks) {
        this.electiveRemarks = electiveRemarks;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
    
    public String getSurgeryDay() {
        return surgeryDay;
    }

    public void setSurgeryDay(String surgeryDay) {
        this.surgeryDay = surgeryDay;
    }
    
    public String getCrtdByName() {
        return crtdByName;
    }

    public void setCrtdByName(String crtdByName) {
        this.crtdByName = crtdByName;
    }
    
    public String getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getLaLine() {
        return laLine;
    }

    public void setLaLine(String laLine) {
        this.laLine = laLine;
    }

    public String getNonCardiacProc() {
        return nonCardiacProc;
    }

    public void setNonCardiacProc(String nonCardiacProc) {
        this.nonCardiacProc = nonCardiacProc;
    }

    public String getUseOfShunt() {
        return useOfShunt;
    }

    public void setUseOfShunt(String useOfShunt) {
        this.useOfShunt = useOfShunt;
    }

    public String getAorticClampTime() {
        return aorticClampTime;
    }

    public void setAorticClampTime(String aorticClampTime) {
        this.aorticClampTime = aorticClampTime;
    }

    public String getThoracicAeroticRemarks() {
        return thoracicAeroticRemarks;
    }

    public void setThoracicAeroticRemarks(String thoracicAeroticRemarks) {
        this.thoracicAeroticRemarks = thoracicAeroticRemarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public String getDefTypeId() {
        return defTypeId;
    }

    public void setDefTypeId(String defTypeId) {
        this.defTypeId = defTypeId;
    }
    private String description = "";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(String typeDetailId) {
        this.typeDetailId = typeDetailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

    public String getCptDescription() {
        return cptDescription;
    }

    public void setCptDescription(String cptDescription) {
        this.cptDescription = cptDescription;
    }

    public String getPerformingPhysicianId() {
        return performingPhysicianId;
    }

    public void setPerformingPhysicianId(String performingPhysicianId) {
        this.performingPhysicianId = performingPhysicianId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public String getCabgId() {
        return cabgId;
    }

    public void setCabgId(String cabgId) {
        this.cabgId = cabgId;
    }

    public String getCabgProcId() {
        return cabgProcId;
    }

    public void setCabgProcId(String cabgProcId) {
        this.cabgProcId = cabgProcId;
    }

    public String getCabgProcDescription() {
        return cabgProcDescription;
    }

    public void setCabgProcDescription(String cabgProcDescription) {
        this.cabgProcDescription = cabgProcDescription;
    }

    public String getCronaryId() {
        return cronaryId;
    }

    public void setCronaryId(String cronaryId) {
        this.cronaryId = cronaryId;
    }

    public String getCronaryDescription() {
        return cronaryDescription;
    }

    public void setCronaryDescription(String cronaryDescription) {
        this.cronaryDescription = cronaryDescription;
    }

    public String getConduitId() {
        return conduitId;
    }

    public void setConduitId(String conduitId) {
        this.conduitId = conduitId;
    }

    public String getConduitDescription() {
        return conduitDescription;
    }

    public void setConduitDescription(String conduitDescription) {
        this.conduitDescription = conduitDescription;
    }

    public String getDistalVesselId() {
        return distalVesselId;
    }

    public void setDistalVesselId(String distalVesselId) {
        this.distalVesselId = distalVesselId;
    }

    public String getDistalVesselDescription() {
        return distalVesselDescription;
    }

    public void setDistalVesselDescription(String distalVesselDescription) {
        this.distalVesselDescription = distalVesselDescription;
    }

    public String getEndart() {
        return Endart;
    }

    public void setEndart(String Endart) {
        this.Endart = Endart;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getValSurId() {
        return valSurId;
    }

    public void setValSurId(String valSurId) {
        this.valSurId = valSurId;
    }

    public String getValSurDescription() {
        return valSurDescription;
    }

    public void setValSurDescription(String valSurDescription) {
        this.valSurDescription = valSurDescription;
    }

    public String getProcOptId() {
        return procOptId;
    }

    public void setProcOptId(String procOptId) {
        this.procOptId = procOptId;
    }

    public String getProcOptDescription() {
        return procOptDescription;
    }

    public void setProcOptDescription(String procOptDescription) {
        this.procOptDescription = procOptDescription;
    }

    public String getExpId() {
        return expId;
    }

    public void setExpId(String expId) {
        this.expId = expId;
    }

    public String getExpDescription() {
        return expDescription;
    }

    public void setExpDescription(String expDescription) {
        this.expDescription = expDescription;
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getImpDescription() {
        return impDescription;
    }

    public void setImpDescription(String impDescription) {
        this.impDescription = impDescription;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getValSize() {
        return valSize;
    }

    public void setValSize(String valSize) {
        this.valSize = valSize;
    }

    public String getValSrNo() {
        return valSrNo;
    }

    public void setValSrNo(String valSrNo) {
        this.valSrNo = valSrNo;
    }

    public String getClosureId() {
        return closureId;
    }

    public void setClosureId(String closureId) {
        this.closureId = closureId;
    }

    public String getClosureDescription() {
        return closureDescription;
    }

    public void setClosureDescription(String closureDescription) {
        this.closureDescription = closureDescription;
    }

    public String getPaceWireId() {
        return paceWireId;
    }

    public void setPaceWireId(String paceWireId) {
        this.paceWireId = paceWireId;
    }

    public String getPaceWireDescription() {
        return paceWireDescription;
    }

    public void setPaceWireDescription(String paceWireDescription) {
        this.paceWireDescription = paceWireDescription;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

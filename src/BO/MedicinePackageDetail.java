/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Objects;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class MedicinePackageDetail implements Serializable {

    private String medicinePackageDeatailId = "";
    private String medicinePackageId = "";
    private String medicinePackageDescription = "";
    private String medicineId = "";
    private String medicineDescription = "";
    private String DoseTimeId = "";
    private String DoseTimeDescription = "";
    private String DoseQtyId = "";
    private String DoseQtyDescription = "";
    private String duration = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getMedicinePackageDeatailId() {
        return medicinePackageDeatailId;
    }

    public void setMedicinePackageDeatailId(String medicinePackageDeatailId) {
        this.medicinePackageDeatailId = medicinePackageDeatailId;
    }

    public String getMedicinePackageId() {
        return medicinePackageId;
    }

    public void setMedicinePackageId(String medicinePackageId) {
        this.medicinePackageId = medicinePackageId;
    }

    public String getMedicinePackageDescription() {
        return medicinePackageDescription;
    }

    public void setMedicinePackageDescription(String medicinePackageDescription) {
        this.medicinePackageDescription = medicinePackageDescription;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineDescription() {
        return medicineDescription;
    }

    public void setMedicineDescription(String medicineDescription) {
        this.medicineDescription = medicineDescription;
    }

    public String getDoseTimeId() {
        return DoseTimeId;
    }

    public void setDoseTimeId(String DoseTimeId) {
        this.DoseTimeId = DoseTimeId;
    }

    public String getDoseTimeDescription() {
        return DoseTimeDescription;
    }

    public void setDoseTimeDescription(String DoseTimeDescription) {
        this.DoseTimeDescription = DoseTimeDescription;
    }

    public String getDoseQtyId() {
        return DoseQtyId;
    }

    public void setDoseQtyId(String DoseQtyId) {
        this.DoseQtyId = DoseQtyId;
    }

    public String getDoseQtyDescription() {
        return DoseQtyDescription;
    }

    public void setDoseQtyDescription(String DoseQtyDescription) {
        this.DoseQtyDescription = DoseQtyDescription;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.medicinePackageDeatailId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MedicinePackageDetail other = (MedicinePackageDetail) obj;
        if (!Objects.equals(this.medicinePackageDeatailId, other.medicinePackageDeatailId)) {
            return false;
        }
        return true;
    }

    
    
    
}

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




public class Medicine implements Serializable {

    private String medicineId = "";
    private String genericId = "";
    private String genericDescription = "";
    private String medicineDescription = "";
    private String medicineTypeId = "";
    private String medicineTypeDescription = "";
    private String specialityId = "";
    private String specialityDescription = "";
    private String menufacturorId = "";
    private String menufacturorDescription = "";
    private String definedBy = "";
    private String active = "";
    private String price = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGenericDescription() {
        return genericDescription;
    }

    public void setGenericDescription(String genericDescription) {
        this.genericDescription = genericDescription;
    }

    
    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getGenericId() {
        return genericId;
    }

    public void setGenericId(String genericId) {
        this.genericId = genericId;
    }

    public String getMedicineDescription() {
        return medicineDescription;
    }

    public void setMedicineDescription(String medicineDescription) {
        this.medicineDescription = medicineDescription;
    }

    public String getMedicineTypeId() {
        return medicineTypeId;
    }

    public void setMedicineTypeId(String medicineTypeId) {
        this.medicineTypeId = medicineTypeId;
    }

    public String getMedicineTypeDescription() {
        return medicineTypeDescription;
    }

    public void setMedicineTypeDescription(String medicineTypeDescription) {
        this.medicineTypeDescription = medicineTypeDescription;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getSpecialityDescription() {
        return specialityDescription;
    }

    public void setSpecialityDescription(String specialityDescription) {
        this.specialityDescription = specialityDescription;
    }

    public String getMenufacturorId() {
        return menufacturorId;
    }

    public void setMenufacturorId(String menufacturorId) {
        this.menufacturorId = menufacturorId;
    }

    public String getMenufacturorDescription() {
        return menufacturorDescription;
    }

    public void setMenufacturorDescription(String menufacturorDescription) {
        this.menufacturorDescription = menufacturorDescription;
    }

    public String getDefinedBy() {
        return definedBy;
    }

    public void setDefinedBy(String definedBy) {
        this.definedBy = definedBy;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.medicineId);
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
        final Medicine other = (Medicine) obj;
        if (!Objects.equals(this.medicineId, other.medicineId)) {
            return false;
        }
        return true;
    }
    
    
}

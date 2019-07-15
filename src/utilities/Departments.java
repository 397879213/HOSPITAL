/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Sibtain
 */
public class Departments {

    public static String opdDental = "126";
    public static String radiology = "127";
    public static String pathology = "128";
    public static String bloodBank = "1833";
    public static String inpatient = "33";
    public static String finance = "38";
    public static String opd = "129";
    public static String opdNide = "130";
    public static String emergency = "34";
    public static String NILGID = "35";
    public static String LiverTransplant = "36";
    public static String ophtomology = "37";
    public static String physiotherapy = "48";
    public static String anesthesiology = "1801";
    public static String occupationalTherapy = "1817";
    public static String physiology = "1820";
    public static String speechTherapy = "1821";
    public static String psychology = "1822";
    public static String prosthetistOrthtist = "1823";
    public static String dayCare = "1824";
    public static String ipmrOpd = "1825";
    public static String Pharmacy = "1830";
    public static String cardiology = "28";
    public static String nuclearMedicine = "29";
    public static String nursing = "2457";
    public static String notDefineDepartment = "31";
    public static String defualtDept = "127";
    public static String operationTheatre = "4863";
    public static String defualtDeptDescription = "RADIOLOGY";
    public static String pathologyName = "PATHOLOGY";

    public void selectSection(String departmentId) {

        String[] columns = {"-", "ID"};
        String query = "SELECT SECTION_ID ID  FROM "
                + Database.DCMS.section
                + " WHERE ACTIVE = 'Y' "
                + " AND DEPARTMENT_ID = '" + departmentId + "'";
        //+ " ORDER BY SECTION_ID ";

        Vector hashSections = Constants.dao.selectData(query, columns);

        Constants.sections = null;
        Constants.sections = new String[hashSections.size()];
        for (int i = 0; i < hashSections.size(); i++) {
            HashMap mapLOV = (HashMap) hashSections.get(i);
            Constants.sections[i] = (String) mapLOV.get("ID");
        }
        if (Constants.sections.length == 0) {
            Constants.sections = new String[1];
            Constants.sections[0] = "N/A";
            JOptionPane.showMessageDialog(null, "first define Section for this department to define CPT");
        }
    }
}

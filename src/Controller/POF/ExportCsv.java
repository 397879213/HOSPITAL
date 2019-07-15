/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.POF;

import java.io.*;
import java.sql.*;
import java.util.*;
import utilities.Database;
/**
 *
 * @author Pacslink
 */
public class ExportCsv {
    
    private static void generateCsvFile(String filename) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//10.14.10.195:1521/HMSDB",
                "EMR", "SIBTAINPASHA");
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            char qoute = '"';
            String query = "SELECT ' ' AS MRN,"
                    + " INITCAP(PA.FIRST_NAME)  " + qoute + "first_nam" + qoute + ",\n"
                    + " NVL(INITCAP(PA.LAST_NAME), ' ')  " + qoute + "last_name" + qoute + ",\n"
                    + " GEN.DESCRIPTION " + qoute + "gender" + qoute + ",\n"
                    + " TO_CHAR(DOB, 'DD') " + qoute + "birth_day, " + qoute + ",\n"
                    + " TO_CHAR(DOB, 'MM') " + qoute + "birth_month, " + qoute + ",\n"
                    + " TO_CHAR(DOB, 'YYYY') " + qoute + "birth_year, " + qoute + ",\n"
                    + "INITCAP(CI.DESCRIPTION) " + qoute + "city" + qoute + ",\n"
                    + " NVL(PA.CNIC, ' ') " + qoute + " patient_nic" + qoute + ",\n"
                    + " ' ' " + qoute + " guardian_relationship" + qoute + ",\n"
                    + " NVL(PA.GUARDIAN_NAME, ' ') " + qoute + "guardian_first_name" + qoute + ",\n"
                    + " ' ' " + qoute + "guardian_last_name" + qoute + ",\n"
                    + " ' ' " + qoute + "guardian_nic" + qoute + ",\n"
                    + " NVL(INITCAP(PA.ADDRESS), ' ') " + qoute + "state" + qoute + ",\n"
                    + " NVL(INITCAP(PA.ADDRESS), ' ') " + qoute + "city" + qoute + ",\n"
                    + " NVL(INITCAP(PA.ADDRESS), ' ') " + qoute + "near_by_city" + qoute + ",\n"
                    + " NVL(INITCAP(PA.ADDRESS), ' ') " + qoute + "Location" + qoute + ",\n"
                    + " TO_CHAR(PA.REGISTRATION_DATE, 'DD-MM-YYYY HH:MI:SS') " + qoute + "created_at" + qoute + ",\n"
                    + " ' ' " + qoute + "updated_at" + qoute + ",\n"
                    + " NVL(PA.CONTACT_NO, ' ') " + qoute + "phone1" + qoute + ",\n"
                    + " ' ' " + qoute + "phone1_type" + qoute + ",\n"
                    + " SUBSTR(PA.AGE,1,2) " + qoute + "age" + qoute + ",\n"
                    + " NVL(PA.FATHER_NAME, ' ') " + qoute + "father_name" + qoute + ",\n"
                    + " ' ' " + qoute + "barcode_url" + qoute + ",\n"
                    + " ' ' " + qoute + "qrcode_url" + qoute + ",\n"
                    + " '54' " + qoute + "medical_unit_id" + qoute + ",\n"
                    + " PA.PATIENT_ID " + qoute + "patient_id" + qoute + ",\n"
                    + " ' ' " + qoute + "user_id" + qoute + ",\n"
                    + " PA.PATIENT_ID " + qoute + "visit_number" + qoute + ",\n"
                    + " TO_CHAR(PA.REGISTRATION_DATE, 'DD-MM-YYYY HH:MI:SS') " + qoute + " created_at" + qoute + ",\n"
                    + " ' ' " + qoute + "updated_at" + qoute + ",\n"
                    + " NVL(LOC.DESCRIPTION, ' ') " + qoute + "current_ref_department" + qoute + ",\n"
                    + " ' ' " + qoute + "current_referred_to" + qoute + ",\n"
                    + " ' ' " + qoute + "is_active" + qoute + ",\n"
                    + " ' ' " + qoute + "department_id" + qoute + ",\n"
                    + " ' ' " + qoute + "doctor_id" + qoute + ",\n"
                    + " ' ' " + qoute + "ambulance_number" + qoute + ",\n"
                    + " ' ' " + qoute + "driver_name" + qoute + ",\n"
                    + " ' ' " + qoute + "mlc" + qoute + ",\n"
                    + " ' ' " + qoute + "policeman_name" + qoute + ",\n"
                    + " ' ' " + qoute + "belt_number" + qoute + ",\n"
                    + " ' ' " + qoute + "police_station_number" + qoute + "\n"
                    + " FROM " + Database.DCMS.patient + " PA, \n"
                    + Database.DCMS.definitionTypeDetail + " GEN, \n"
                    + Database.DCMS.city + " CI, \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE PA.GENDER_ID = GEN.ID"
                    + " AND PA.CITY_ID = CI.ID"
                    + " AND PA.LOCATION_ID = LOC.ID"
                    + " AND ROWNUM < 11"
                    + " ORDER BY PA.REGISTRATION_DATE";
            
            System.out.println(query);
            ResultSet rset = stmt
                    .executeQuery(query);
            ResultSetMetaData rsmd = rset.getMetaData();
            rset.next();
            FileWriter fname = new FileWriter(filename);
            BufferedWriter bwOutFile = new BufferedWriter(fname);
            StringBuffer sbOutput = new StringBuffer();
            sbOutput.append("MRN, first_nam, last_name, gender, birth_day, birth_month,"
                    + " birth_year, city, patient_nic, guardian_relationship, "
                    + " guardian_first_name, guardian_last_name, guardian_nic, state,"
                    + " city, near_by_city, Location, created_at, updated_at, phone1,"
                    + " phone1_type, age, father_name, barcode_url, qrcode_url, "
                    + " medical_unit_id, patient_id, user_id, visit_number, created_at,"
                    + " updated_at, current_ref_department, current_referred_to,"
                    + " is_active, department_id, doctor_id, ambulance_number,"
                    + " driver_name, mlc, policeman_name, belt_number, police_station_number");
            
            bwOutFile.append(sbOutput);
            bwOutFile.append(System.getProperty("line.separator"));
            System.out.println("No of columns in the table:"
                    + rsmd.getColumnCount());
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String  cname = rsmd.getColumnName(i);
                    
            }
             
            System.out.println();
            while (rset.next()) {
                System.out.println(rset.getString(1) + " " + rset.getString(2)
                        + " " + rset.getString(3) + " " + rset.getString(4) + " "
                        + rset.getString(5) + " " + rset.getString(6)
                        + " " + rset.getString(7) + " " + rset.getString(8) 
                        + " " + rset.getString(9) ); // + " " + rset.getString(10)
                
                bwOutFile.append(rset.getString(1) + "," + rset.getString(2) + ","
                        + rset.getString(3)  + "," + rset.getString(4)  + ","
                        + rset.getString(5)  + "," + rset.getString(6)  + ","
                        + rset.getString(7)  + "," + rset.getString(8)  + ","
                        + rset.getString(9)  + "," + rset.getString(10) + ","
                        + rset.getString(11) + "," + rset.getString(12) + ","
                        + rset.getString(13) + "," + rset.getString(14) + ","
                        + rset.getString(15) + "," + rset.getString(16) + ","
                        + rset.getString(17) + "," + rset.getString(18) + ","
                        + rset.getString(19) + "," + rset.getString(20) + ","
                        + rset.getString(21) + "," + rset.getString(22) + ","
                        + rset.getString(23) + "," + rset.getString(24) + ","
                        + rset.getString(25) + "," + rset.getString(26) + ","
                        + rset.getString(27) + "," + rset.getString(28) + ","
                        + rset.getString(29) + "," + rset.getString(30) + ","
                        + rset.getString(31) + "," + rset.getString(32) + ","
                        + rset.getString(33) + "," + rset.getString(34) + ","
                        + rset.getString(35) + "," + rset.getString(36) + ","
                        + rset.getString(37) + "," + rset.getString(38) + ","
                        + rset.getString(39) + "," + rset.getString(40) + ","
                        + rset.getString(41) + "," + rset.getString(42));  
                bwOutFile.append(System.getProperty("line.separator"));
                bwOutFile.flush();  
            }
            bwOutFile.close();
            stmt.close();
            System.out.println("Ok.");
        }
        catch (Exception e) {
            System.err.println("Unable to connect to database: " + e);
        }
    }
    
    public static void main(String[] args) {
        generateCsvFile("D:\\Code\\LGH PINS.csv");
 
    }
}

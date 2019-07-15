/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.POF;

import java.io.BufferedWriter;
import java.sql.*;
/* The class files under this package helps to pull data out from Oracle table */
import java.io.FileWriter;
import utilities.Database;

/* Required for the CSV output generation */
/**
 *
 * @author Pacslink
 */
public class ExportCsv1M {

    private static void generateCsvFile(String filename) {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//10.14.10.195:1521/HMSDB", "EMR", "SIBTAINPASHA");
            conn.setAutoCommit(false);
            Statement st = conn.createStatement();
            char qoute = '"';
            String query = "SELECT ' ' AS MRN,"
                    + " INITCAP(PA.FIRST_NAME)  " + qoute + "first_nam" + qoute + ",\n"
                            + " GEN.DESCRIPTION " + qoute + "gender" + qoute + ",\n"
                    + " TO_CHAR(DOB, 'DD') " + qoute + "birth_day, " + qoute + ",\n"
                    + " TO_CHAR(DOB, 'MM') " + qoute + "birth_month, " + qoute + ",\n"
                    + " TO_CHAR(DOB, 'YYYY') " + qoute + "birth_year, " + qoute + ",\n"
                    + "INITCAP(CI.DESCRIPTION) " + qoute + "city" + qoute + ",\n"
                    + " PA.CNIC " + qoute + " patient_nic" + qoute + ",\n"
                    + " ' ' " + qoute + " guardian_relationship" + qoute + ",\n"
                    + " PA.GUARDIAN_NAME " + qoute + " guardian_first_name" + qoute + ",\n"
                    + " ' ' " + qoute + " guardian_last_name" + qoute + ",\n"
                    + " ' ' " + qoute + " guardian_nic" + qoute + ",\n"
                    + " INITCAP(CI.DESCRIPTION) " + qoute + " state" + qoute + ",\n"
                    + " INITCAP(CI.DESCRIPTION) " + qoute + " city" + qoute + ",\n"
                    + " INITCAP(CI.DESCRIPTION) " + qoute + " near_by_city" + qoute + ",\n"
                    + " INITCAP(PA.ADDRESS) " + qoute + " Location" + qoute + ",\n"
                    + " PA.REGISTRATION_DATE " + qoute + " created_at" + qoute + ",\n"
                    + " PA.UPTD_DATE " + qoute + " updated_at" + qoute + ",\n"
                    + " PA.CONTACT_NO " + qoute + " phone1" + qoute + ",\n"
                    + " ' ' " + qoute + " phone1_type" + qoute + ",\n"
                    + " SUBSTR(PA.AGE,1,2) " + qoute + " age" + qoute + ",\n"
                    + " PA.FATHER_NAME " + qoute + " father_name" + qoute + ",\n"
                    + " ' ' " + qoute + " barcode_url" + qoute + ",\n"
                    + " ' ' " + qoute + " qrcode_url" + qoute + ",\n"
                    + " '54' " + qoute + " medical_unit_id" + qoute + ",\n"
                    + " PA.PATIENT_ID " + qoute + " patient_id" + qoute + ",\n"
                    + " ' ' " + qoute + " user_id" + qoute + ",\n"
                    + " PA.PATIENT_ID " + qoute + " visit_number" + qoute + ",\n"
                    + " PA.REGISTRATION_DATE " + qoute + " created_at" + qoute + ",\n"
                    + " ' ' " + qoute + " updated_at" + qoute + ",\n"
                    + " LOC.DESCRIPTION " + qoute + " current_ref_department" + qoute + ",\n"
                    + " ' ' " + qoute + " current_referred_to" + qoute + ",\n"
                    + " ' ' " + qoute + " is_active" + qoute + ",\n"
                    + " ' ' " + qoute + " department_id" + qoute + ",\n"
                    + " ' ' " + qoute + " doctor_id" + qoute + ",\n"
                    + " ' ' " + qoute + " ambulance_number" + qoute + ",\n"
                    + " ' ' " + qoute + " driver_name" + qoute + ",\n"
                    + " ' ' " + qoute + " mlc" + qoute + ",\n"
                    + " ' ' " + qoute + " policeman_name" + qoute + ",\n"
                    + " ' ' " + qoute + " belt_number" + qoute + ",\n"
                    + " ' ' " + qoute + " police_station_number" + qoute + "\n"
                    + " FROM " + Database.DCMS.patient + " PA, \n"
                    + Database.DCMS.definitionTypeDetail + " GEN, \n"
                    + Database.DCMS.city + " CI, \n"
                    + Database.DCMS.location + " LOC \n"
                    + " WHERE PA.GENDER_ID = GEN.ID"
                    + " AND PA.CITY_ID = CI.ID"
                    + " AND PA.LOCATION_ID = LOC.ID"
                    + " AND ROWNUM < 11"
                    + " ORDER BY PA.REGISTRATION_DATE";
            
            System.err.println(query);
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            FileWriter cname = new FileWriter(filename);
            BufferedWriter bwOutFile = new BufferedWriter(cname);
            StringBuffer sbOutput = new StringBuffer();
            sbOutput.append("MRN, first_nam, gender, birth_day, city, current_ref_department");
            bwOutFile.append(sbOutput);
            bwOutFile.append(System.getProperty("line.separator"));
            System.out.println("No of columns in the table:" + rsmd.getColumnCount());

            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String fname = rsmd.getColumnName(i);
            }

            System.out.println();

            while (rs.next()) {
                System.out.print(rs.getString(1));
                bwOutFile.append(rs.getString(1) + "," + rs.getString(2) + ","
                        + rs.getString(3) + "," + rs.getString(4) + ","
                        + rs.getString(5) + "," + rs.getString(6));
                bwOutFile.append(System.getProperty("line.separator"));
                bwOutFile.flush();
                System.out.println();
            }
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unable to connect to database" + e);
        }
        
    }
    public static void main(String[] args) {
        String filename = "D:\\LGH.csv";
        generateCsvFile(filename);
    }

}

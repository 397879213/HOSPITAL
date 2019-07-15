/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.POF;

import java.io.FileOutputStream;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Pacslink
 */
public class ExportExcel {

    public static void main(String[] args) throws Exception {

        /* Create Connection objects */
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//10.14.10.195:1521/HMSDB",
                "EMR", "SIBTAINPASHA");
        Statement stmt = conn.createStatement();
        /* Create Workbook and Worksheet objects */
        HSSFWorkbook new_workbook = new HSSFWorkbook(); //create a blank workbook object
        HSSFSheet sheet = new_workbook.createSheet("Patient Detail");  //create a worksheet with caption score_details
        /* Define the SQL query */
        ResultSet query_set = stmt.executeQuery("SELECT PA.PATIENT_ID MR_NO,"
                + "PA.FIRST_NAME, "
                + "PA.LAST_NAME, "
                + "GEN.DESCRIPTION GENDER,"
                + "TO_CHAR(DOB,'DD') BIRTH_DATE, "
                + "TO_CHAR(DOB,'MM') BIRTH_MONTH,"
                + "TO_CHAR(DOB,'YYYY') BIRTH_YEAR, "
                + "PA.CNIC, PA.GUARDIAN_RELATION_ID,"
                + "PA.GUARDIAN_NAME GUARDIAN_FIRST_NAME, "
                + " ' ' GUARDIAN_LAST_NAME,"
                + " ' ' GUARDIAN_NIC, "
                + "CI.DESCRIPTION STATE,"
                + "CI.DESCRIPTION CITY, "
                + "CI.DESCRIPTION near_by_city, "
                + "PA.ADDRESS LOCATION,"
                + "PA.REGISTRATION_DATE, "
                + "PA.UPTD_DATE UPDATED_AT, "
                + "PA.CONTACT_NO,"
                + " ' ' PHONE_TYPE, "
                + "PA.AGE, "
                + "PA.FATHER_NAME,"
                + " ' ' BARCODE_URL, "
                + " ' ' QRCODE_URL,"
                + "'54' MEDICAL_UNIT_ID, "
                + "PA.PATIENT_ID, "
                + "PA.REGISTERED_BY,"
                + "PA.PATIENT_ID VISIT_NO, "
                + "PA.REGISTRATION_DATE, "
                + "PA.UPTD_DATE,"
                + "LOC.DESCRIPTION current_ref_department,"
                + "' ' current_referred_to,"
                + "' ' is_active, "
                + "' ' Department_id,"
                + "' ' doctor_id, "
                + "' ' ambulance_number,"
                + "' ' driver_name,"
                + "' ' mlc,"
                + "' ' policeman_name,"
                + "' ' belt_number,"
                + "' ' police_station_number "
                + " FROM PATIENT PA,DEFINITION_TYPE_DETAIL GEN,CITY CI,LOCATION LOC"
                + " WHERE PA.GENDER_ID=GEN.ID "
                + " AND PA.CITY_ID=CI.ID "
                + " AND PA.LOCATION_ID=LOC.ID "
                + " AND ROWNUM < 10 ");
        /* Create Map for Excel Data */
        Map<String, Object[]> excel_data = new HashMap<String, Object[]>(); //create a map and define data
        int row_counter = 0;
        /* Populate data into the Map */
        while (query_set.next()) {
            row_counter = row_counter + 1;
            String pat_id = query_set.getString("MR_NO");
            String firstName = query_set.getString("FIRST_NAME");
            String lastName = query_set.getString("LAST_NAME");
            String gender = query_set.getString("GENDER");
            String birthDate = query_set.getString("BIRTH_DATE");
            String birthMonth = query_set.getString("BIRTH_MONTH");
            String birthYear = query_set.getString("BIRTH_YEAR");
            String cnic = query_set.getString("CNIC");
            String guardRelId = query_set.getString("GUARDIAN_RELATION_ID");
            String guardFname = query_set.getString("GUARDIAN_FIRST_NAME");
            String guardLname = query_set.getString("GUARDIAN_LAST_NAME");
            String guardCnic = query_set.getString("GUARDIAN_NIC");
            String state = query_set.getString("STATE");
            String city = query_set.getString("CITY");
            String nearByCity = query_set.getString("near_by_city");
            String location = query_set.getString("LOCATION");
            String regDate = query_set.getString("REGISTRATION_DATE");
            String updateAt = query_set.getString("UPDATED_AT");
            String contactNo = query_set.getString("CONTACT_NO");
            String phonetype = query_set.getString("PHONE_TYPE");
            String age = query_set.getString("AGE");
            String fatherName = query_set.getString("FATHER_NAME");
            String barcodeUrl = query_set.getString("BARCODE_URL");
            String qrCodeUrl = query_set.getString("QRCODE_URL");
            String medUnitId = query_set.getString("MEDICAL_UNIT_ID");
            String patientId = query_set.getString("PATIENT_ID");
            String regBy = query_set.getString("REGISTERED_BY");
            String visitNo = query_set.getString("VISIT_NO");
            String regisDate = query_set.getString("REGISTRATION_DATE");
            String updateDate = query_set.getString("UPTD_DATE");
            String refDep = query_set.getString("current_ref_department");
            String currentRefTo = query_set.getString("current_referred_to");
            String isActive = query_set.getString("is_active");
            String depId = query_set.getString("department_id");
            String docId = query_set.getString("doctor_id");
            String ambulanceNum = query_set.getString("ambulance_number");
            String driverName = query_set.getString("driver_name");
            String mlc = query_set.getString("mlc");
            String policeManName = query_set.getString("policeman_name");
            String beltNum = query_set.getString("belt_number");
            String policeStationNum = query_set.getString("police_station_number");
            excel_data.put(Integer.toString(row_counter),
                    new Object[]{pat_id, firstName, lastName,
                        gender, birthDate, birthMonth, birthYear, cnic,
                        guardRelId, guardFname, guardLname, guardCnic, state,
                        city, nearByCity, location, regDate, updateAt, contactNo,
                        phonetype, age, fatherName, barcodeUrl, qrCodeUrl,
                        medUnitId, patientId, regBy, visitNo, regisDate, updateDate,
                        refDep, currentRefTo, isActive, depId, docId, ambulanceNum,
                        driverName, mlc, policeManName, beltNum, policeStationNum});
        }
        /* Close all DB related objects */
        query_set.close();
        stmt.close();
        conn.close();

        /* Load data into logical worksheet */
        Set<String> keyset = excel_data.keySet();
        int rownum = 0;
        for (String key : keyset) { //loop through the data and add them to the cell
            Row row = sheet.createRow(rownum++);
            Object[] objArr = excel_data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof Double) {
                    cell.setCellValue((Double) obj);
                } else {
                    cell.setCellValue((String) obj);
                }
            }
        }

        FileOutputStream output_file = new FileOutputStream(new File("D:\\Exp Data\\PatInfo.xls")); //create XLS file
        new_workbook.write(output_file);//write excel document to output stream
        output_file.close(); //close the file

    }
}

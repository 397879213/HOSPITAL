package utilities;


import java.util.StringTokenizer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;

public class DateFunctions {

    public String getAge(String dob) {
        
        StringTokenizer tkn = new StringTokenizer(dob, "-");
        String day = tkn.nextToken();
        String month = tkn.nextToken();
        String year = tkn.nextToken();
        DateMidnight birthdate = new DateMidnight(Integer.parseInt(year), 
                Integer.parseInt(month), Integer.parseInt(day));
        DateTime now = new DateTime();
        return ""+Years.yearsBetween(birthdate, now).getYears();
    }

    public String getDateofBirth(int age) {

        DateTime dt = new DateTime();
        //DateMidnight dateTime = new DateMidnight(2012, 2, 29);
        LocalDate dateTime = dt.toLocalDate();
        
        dateTime.toString("dd-MM-yyyy");
        dateTime =dateTime.minusYears(age);
        return dateTime.toString("dd-MM-yyyy");
    }

    public static void main(String[] args) {

        DateFunctions dat = new DateFunctions();
        System.out.println(dat.getAge("12-10-1982"));
    }//
    
    public static void calculateDate(String d){
        
        
    } 
}


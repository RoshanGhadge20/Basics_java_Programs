package java_coding_questions;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class date_time {

    public static void main(String[] args) {

        LocalDate myobj = LocalDate.now();
        System.out.println(myobj);

        LocalTime my_time = LocalTime.now();
        System.out.println(my_time);

        // LocalDateTime date_time = LocalDateTime.now();
        // System.out.println(date_time);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

    }

}

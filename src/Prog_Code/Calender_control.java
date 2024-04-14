package Prog_Code;

import java.util.Calendar;

public class Calender_control {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        
        System.out.println("Printing day of week:- " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Printing day:- " + cal.get(Calendar.DATE));
    }
}

package Prog_Code;

import java.util.Calendar;

public class Date_time_prog {
	public static void main(String[] args) {
		/*
		 * Date d=new Date();
		 * System.out.println("Getting Todays Date & Time :- "+d.toString());
		 * 
		 * SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
		 * System.out.println("Printing date into the simplified format:- "+sdf.format(d
		 * ));
		 */
		
		Calendar calendar=Calendar.getInstance();
		System.out.println("Getting date & time" + calendar.getTime());
		
		
		
		
	}
}

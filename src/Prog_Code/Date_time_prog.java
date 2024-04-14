package Prog_Code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time_prog {
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println("Getting Todays Date & Time :- "+d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
		System.out.println("Printing date into the simplified format:- "+sdf.format(d));
		
		
	}
}

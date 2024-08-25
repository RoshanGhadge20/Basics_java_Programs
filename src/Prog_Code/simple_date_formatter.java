package Prog_Code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simple_date_formatter 
{
	public static void main(String[] args) 
	{
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println(sdf.format(11/10/2000));
		System.out.println(sdf.format(date));
		
	}
}

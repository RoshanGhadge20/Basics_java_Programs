package Practice_Program_Code;

import java.util.Iterator;

public class Reverse_Number 
{

	public static void main(String[] args) 
	{
		int num=123;
		System.out.println("Original Number :- "+ num);
		
		int rev=0;
		while (num>0) 
		{
			int rem=num%10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		System.out.println("Reverse Number of original Number is "+ rev);
	}
}

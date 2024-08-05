package Practice_Program_Code;

import java.util.Scanner;

public class palindrome_number 
{
	public static void main(String[] args) 
	{
		//Armstrong Number => When Number == Reverse Number
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int rev=0, rem ; 
		while (num>0) 
		{
			rem =num%10;
			rev=(rev*10)+rem;
			num= num/10;
		}
		if (num==rev)
		{
			System.out.println("Number is armstrong");
		}
		else 
		{
			System.out.println("Number is not armstrong");
		}
	}
}

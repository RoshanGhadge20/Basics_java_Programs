package Prog_Code;

import java.util.Scanner;

public class prime_number 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();
		System.out.println("You have entered "+ num);
		
		if(prime_number(num))
		{
			System.out.println("Its Prime Number");
		}
		else {
			System.out.println("Its Not prime number");
		}
		
		
			
		
	}
	public static boolean prime_number(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

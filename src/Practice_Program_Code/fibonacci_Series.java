package Practice_Program_Code;

import java.util.Scanner;

public class fibonacci_Series 
{
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		int first=0, second=1, next;
		System.out.println("Enter a number up to which we wants to check fibo series :- ");
		int num=scanner.nextInt();
		for( int i=1;i<num;i++)
		{
			System.out.println(first+"");
			next=first+second;
			first=second;
			second=next;
		}
		
		
	}
	
}

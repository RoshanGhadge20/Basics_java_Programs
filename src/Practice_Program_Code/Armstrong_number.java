package Practice_Program_Code;

public class Armstrong_number 
{
	public static void main(String[] args) 
	{
		// Armstrong Number :- An Armstrong number is a special kind of number in math. It's a number that equals the sum of its digits, each raised to a power. For example, if you have a number like 153, 
		 //it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.
		
		int num=153, rev=0, rem, a=153;
		while(num>0)
		{
			rem=num%10;
			rev=(rev+(rem*rem*rem));
			num=num/10;
		}
		
		if(a==rev)
		{
			System.out.println("Number is armstrong number");
		}
		else 
		{
			System.out.println("Number is not armstrong number");
		}
	}
}

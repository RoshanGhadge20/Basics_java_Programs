package Practice_Program_Code;

public class Sum_of_digits_of_number 
{
	public static void main(String[] args) 
	{
		//Sum of digits of number
		int num=123, sum=0, rem;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits are :- "+ sum);
	}
}

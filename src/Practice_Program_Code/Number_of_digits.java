
package Practice_Program_Code;

public class Number_of_digits 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int count=0;
		while(num>0)
		{
			
			count++;
			num=num/10;
			
		}
		
		System.out.println("Number of digits are :- "+ count);
		
	}

}

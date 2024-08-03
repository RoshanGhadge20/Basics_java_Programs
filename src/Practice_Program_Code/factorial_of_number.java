package Practice_Program_Code;

public class factorial_of_number 
{
	public static void main(String[] args) 
	{
		int num=5;
		//System.out.println();
		int factorial=1;
		for ( int i=1;i<=num;i++)
		{
			factorial=factorial*i;
			
		}
		System.out.println("Factorial of 5 is "+ factorial);
		
		System.out.println("End of program code execution");
	}
}

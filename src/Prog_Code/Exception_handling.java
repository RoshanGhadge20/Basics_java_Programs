package Prog_Code;

public class Exception_handling
{
	int a = 1;
	int b = 0;
	int c;

	void calculation() 
	{
		try {
			c = a / b;
			System.out.println("Value of c is:- " + c);
		} catch (Exception e) {
			System.out.println("Exception occurs at this block ");
		} finally {
			System.out.println("This finally block will execute evertime ");
		}

	}

	public static void main(String[] args) 
	{
		Exception_handling obj = new Exception_handling();
		obj.calculation();

	}
	
}

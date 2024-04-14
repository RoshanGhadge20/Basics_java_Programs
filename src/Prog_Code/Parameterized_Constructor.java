package Prog_Code;

public class Parameterized_Constructor {
	
	void demo()
	{
		System.out.println("Calling from demo method");
	}
	
	Parameterized_Constructor(int a, int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameterized_Constructor obj=new Parameterized_Constructor(1,8);
		obj.demo();
		System.out.println("End of program execution");
	}

}

package Prog_Code;

public class Default_Constructor {
	
	Default_Constructor(){
		System.out.println("Calling from default constructor");
	}
	
	void demo()
	{
		System.out.println("Calling from demo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default_Constructor obj=new Default_Constructor();
		obj.demo();
		System.out.println("End of program execution");

	}

}

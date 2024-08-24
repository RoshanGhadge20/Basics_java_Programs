package Prog_Code;

public class Final_key 
{
	
	//Final keyword
	final int a=1;
	
	//final method
	public final void getname()
	{
		System.out.println("Calling from final method");
	}
	
	//final class 
	/*
	 * final class class_name once class is declared as final we cannot extends it
	 * into another class
	 */
	
	public static void main(String[] args) 
	{
		Final_key obj=new Final_key();
		/*
		 * obj.a=2; once final variable/method is assigned we cannot change it/override
		 * it
		 */
		obj.getname();
	}
}

package Prog_Code;

public class  static_var_method_block {
	
	static String name="Roshan Ghadge";
	
	public static void getname()
	{
		System.out.println("RSG");
	}
	
	static {
		name="Ghadge";
		
	}
	
	public static void main(String[] args) {
		static_var_method_block obj=new static_var_method_block();
		static_var_method_block.getname();
		System.out.println(static_var_method_block.name);
		
	}
	
	/*
	 *  The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.
	 *  The static keyword is a non-access modifier in Java that is applicable for the following: 

		Blocks
		Variables
		Methods
		Classes
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	 
}

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
}

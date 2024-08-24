package Prog_Code;

public class abs_child_class extends abstraction_practice
{
	@Override
	public void jet() {
		System.out.println("calling u from jet method");
		
	}
	public static void main(String args[])
	{
		abs_child_class obj=new abs_child_class();
		obj.get();
		obj.set();
		obj.met();
		obj.jet();
		System.out.println("End of program execution");
	}
	

}

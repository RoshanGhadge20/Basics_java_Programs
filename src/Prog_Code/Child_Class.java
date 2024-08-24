package Prog_Code;

public class Child_Class extends Super_keyword 
{
	String name="Ghadge";
	Child_Class()
	{
		super();
		System.out.println("Calling from child class constructor");
	}
	public void getname() 
	{
		super.getname();
		System.out.println((super.name));
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		Child_Class obj=new Child_Class();
		obj.getname();
	}
}

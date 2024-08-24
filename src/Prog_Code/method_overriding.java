package Prog_Code;

class R 
{
	public void sample() 
	{
		System.out.println("This call is from the sample method- parent class");
	}
}

public class method_overriding
{
	public void sample() 
	{
		System.out.println("This call is from the sample method- child class");
	}

	public static void main(String[] args)
	{
		
		R obj = new R();
		obj.sample();
		method_overriding objMethod_overriding = new method_overriding();
		objMethod_overriding.sample();

	}

}

package Prog_Code;

abstract class example 
{
	abstract void show();
	
}

public class Abs_Class extends example {
	void input() {
		System.out.println("Input method of abs class");
	}

	void show() {
		// TODO Auto-generated method stub
		System.out.println("show methd of abs class");
	}

	public static void main(String[] args) {
		//example obExample=new Abs_Class();
		//obExample.show();
		Abs_Class objAbs_Class=new Abs_Class();
		objAbs_Class.input();
		objAbs_Class.show();
	}
}

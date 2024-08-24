package Prog_Code;

interface a
{
	public void show();
}

interface b
{
	public void msg(); 
}

public class Interfaces_example implements a,b 
{
	public void show() {
		System.out.println("this is the calling method for show");
	}
	
	public void msg() {
		System.out.println("this is the calling method for msg");
		
	}
	public static void main(String[] args) {
		Interfaces_example obj=new Interfaces_example();
		obj.show();
		obj.msg();
	}
}


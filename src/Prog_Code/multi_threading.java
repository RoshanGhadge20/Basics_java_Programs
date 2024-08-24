package Prog_Code;

public class multi_threading extends Thread
{
	public void run()
	{
		
		try 
		{
			System.out.println(" Thread "+ Thread.currentThread().getId()+" is running ");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception caught");
		}
		
}
	
	public static void main(String[] args) 
	{
		int n=8;
		for (int i=1;i<=n;i++)
		{
			Thread obj= new Thread(new multi_threading());
			obj.start();
		}
		
	}

}

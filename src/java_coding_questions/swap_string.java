
package java_coding_questions;

public class swap_string
{
	public static void main(String[] args) 
	{
		
		String s="Hello World";
		String revString;
		String Arr[]=s.split(" ");
		revString=Arr[1]+" "+Arr[0];
		System.out.println("Reverse of String:- "+revString);
		
	}
}

package java_coding_questions;

public class reverse_string_program_code 
{
	public static void main(String[] args) 
	{
		String s = "This is a string";
		StringBuilder sb = new StringBuilder(s);
		System.out.println("Reverse String:- " + sb.reverse().toString());

		//Reverse string with loops 
		for ( int i=s.length()-1 ; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	

}

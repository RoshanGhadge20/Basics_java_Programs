package java_coding_questions;

public class dup_char_from_string {
	public static void main(String[] args) {
		String strn="hackerearth";
		for(int i=1;i<strn.length();i++)
		{
			char c=strn.charAt(i);
			for (int j=2;j<strn.length();j++) {
			
			if (c==strn.charAt(j)) 
			{
				System.out.println(c);
				
			}
			}
			
		}
		
		
	}

}

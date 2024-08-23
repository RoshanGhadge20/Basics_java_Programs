package Practice_Program_Code;

import java.util.HashMap;
import java.util.Iterator;

public class count_occurance_of_word_in_string 
{
	public static void main(String[] args) 
	{
		String nameString="Test java java test automation";
		int count=0;
		for(int i=0;i<nameString.length();i++)
		{
			if ((nameString.charAt(i)==''))
			{
				count++;
			}
		}
		System.out.println("Counting the occurance of word into string "+count);
	}
}

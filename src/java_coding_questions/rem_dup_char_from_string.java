package java_coding_questions;

import java.util.Iterator;

public class rem_dup_char_from_string 
{
	public static void main(String[] args) 
	{
	
		String s="hackerearth";
		StringBuilder sb=new StringBuilder();
		boolean[] seen=new boolean[256]; 
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if (!seen[c]) 
			{
				sb.append(c);
				seen[c]=true;
			}
		}
		System.out.println(sb.toString());
		
	}

}

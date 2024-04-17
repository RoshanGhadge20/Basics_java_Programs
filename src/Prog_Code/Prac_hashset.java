package Prog_Code;

import java.util.HashSet;
import java.util.Iterator;

public class Prac_hashset {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Roshan");
		hs.add("Sanjay");
		hs.add("Ghadge");
		
		hs.contains("Ghadge");
		System.out.println(hs.size());
		//hs.clear();
		//System.out.println(hs);
		
		//Learning how the iterator is working 
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
	}

}

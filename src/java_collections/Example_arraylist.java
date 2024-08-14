package java_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collector;

public class Example_arraylist
{
	public static void main(String[] args) 
	{
		// Practice example of arraylist
		ArrayList<Integer> aobj=new ArrayList<Integer>();
		aobj.add(2);
		aobj.add(4);
		System.out.println(aobj);
		
		aobj.remove(1);
		System.out.println(aobj);
		
		System.out.println(aobj.isEmpty());
		
		System.out.println(aobj.size());
		
		//Iterating arraylist elements through iterator
		Iterator<Integer> iterator=aobj.iterator();
		System.out.println("Iterating arraylist elements through iterator while loop");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//Iterator arraylist elements through for loops 
		System.out.println("Iterating arraylist elements through iterator for loop");
		Iterator<Integer> iterator1=aobj.iterator();
		for(Integer i:aobj)
		{
			System.out.println(i);
		}
		
		//setting any element of arraylist at specific of index
		aobj.set(0, 5);
		
		//Sorting elements of arraylist 
		Collections.sort(aobj);	
		
		aobj.clear();
		
		
	}
}

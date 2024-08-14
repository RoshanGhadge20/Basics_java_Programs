package java_collections;

import java.util.HashSet;
import java.util.Iterator;

public class Example_Hashset 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(1);
		hset.add(2);
		hset.add(3);
		hset.add(4);

		System.out.println("Hashset Values:- "+ hset);

		//Iterating through hashset with while loops
		Iterator<Integer> it =hset.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		//Iterating through hashset with for loops
		Iterator<Integer> options=hset.iterator();
		for(Integer i: hset)
		{
			System.out.println(i);
		}
		
		hset.remove(2);
		
		hset.clear();
	}
}


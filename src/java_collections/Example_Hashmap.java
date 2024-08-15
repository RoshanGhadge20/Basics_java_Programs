package java_collections;

import java.util.HashMap;

public class Example_Hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1, "RG");
		hmap.put(2, "RSG");
		hmap.put(3, "SSG");
		
		
		System.out.println("Size of hashmap"+ hmap.size());
		System.out.println("Elements of hashmap "+ hmap);
		
		hmap.remove(1, "RG");
		
		System.out.println("Elements of hashmap "+ hmap);
		
		hmap.clear();
		
	
	}
}

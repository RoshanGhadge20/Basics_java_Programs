package Prog_Code;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Hash_map_Practice {
	public static void main(String[] args) 
	{
		HashMap<String, String> hs=new HashMap<String, String>();
		hs.put("Name", "RG");
		hs.put("lp", "hp");
		System.out.println("Hashmap after put method:- "+hs);
		
		//Accessing all the hashmap elements 
		System.out.println("fetching the records of name:- "+hs.get("Name"));
		
		//fetching the all keys 
		System.out.println("Fetching all the keys :- "+ hs.keySet());
		
		//fetching the all values 
		System.out.println("Fetching all the values :- "+ hs.values());
				
		
		//changing the value of any hashmap element 
		System.out.println("chaning the value of hashmap element:- "+ hs.replace("lp", "Dell"));
	
		//Remove element form hashmap 
		System.out.println("Remove any element form hashmap:- "+ hs.remove("lp"));
		
		//Access all element 
		System.out.println("Accss details :- "+ hs);
		
		System.out.println("End of program code");
	}
	

}

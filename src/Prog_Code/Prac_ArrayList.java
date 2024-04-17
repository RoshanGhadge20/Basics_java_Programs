package Prog_Code;

import java.util.ArrayList;

public class Prac_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Roshan");
		al.add("Sanjay");
		al.add("Ghadge");
		System.out.println(al.indexOf("Roshan"));
		al.contains("Ghadge");
		al.isEmpty();
		//al.iterator();
		System.out.println("Arraylist contains an elements:- "+ al);
		
	}

}

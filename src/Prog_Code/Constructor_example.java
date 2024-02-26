package Prog_Code;
// Simple Constructor 

import java.awt.DisplayMode;
import java.security.DomainCombiner;
import java.security.PublicKey;

import javax.sound.midi.MidiChannel;

/*
 * public class Constructor_examples { int a = 1; String n = "Roshan Ghadge";
 * 
 * public Constructor_examples() {
 * System.out.println("This call is from constructor");
 * 
 * }
 * 
 * public static void main(String[] args) { Constructor_examples
 * objConstructor_examples = new Constructor_examples();
 * System.out.println("EOD"); }
 * 
 * }
 */

// Parameterized constructor
/*
 * public class Constructor_example { int id; String name;
 * 
 * public Constructor_example(int a, String n) { id = a; name = n; }
 * 
 * public void display() { System.out.println(id + " " + name); }
 * 
 * public static void main(String[] args) { System.out.println("Hello");
 * Constructor_example ob = new Constructor_example(20, "RoshanGhadge");
 * ob.display(); }
 * 
 * }
 */


//Constructor overloading 
/*
 * public class Constructor_example { int id; String name; int d; public
 * Constructor_example(int a,int b) {
 * System.out.println("this call is from 2 arg constructor "); // TODO
 * Auto-generated constructor stub } Constructor_example(int a, int c, String n)
 * { System.out.println("this call is from 3 arg constructor "); }
 * 
 * public static void main(String[] args) { Constructor_example
 * objConstructor_example= new Constructor_example(10, 20); Constructor_example
 * objConstructor_example2=new Constructor_example(2, 5,"roshan_ghadge"); }
 * 
 * 
 * }
 */

// Copy constructor 

public class Constructor_example
{
	int a;
	String name;
	public Constructor_example(int b,String n) {
		a=b;
		name=n;
		System.out.println(a+" "+name);
		// TODO Auto-generated constructor stub
	}
	public Constructor_example(Constructor_example s1)
	{
		a=s1.a;
		name=s1.name;
		System.out.println(a+" "+name);
	}
	
	public static void main(String argss[])
			{
				Constructor_example s1=new Constructor_example(20,"roshanghadge");
				Constructor_example s2=new Constructor_example(s1);
				
				
			}
}




















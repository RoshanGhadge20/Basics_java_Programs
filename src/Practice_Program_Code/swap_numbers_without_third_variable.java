package Practice_Program_Code;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class swap_numbers_without_third_variable
{
	public static void main(String[] args) 
	{
		int a=5, b=10;
		System.out.println("Values before swapping of two variables :- "+ a +" & "+ b);
		
		a=a+b; // 15
		//System.out.println(a);
		b=a-b; //5
		//System.out.println(b);
		a=a-b; //10
		//System.out.println(a);
		
		System.out.println("Values after swapping of two variables :- "+ a +" & "+ b);
		
		System.out.println("End of program code execution");
	}
}

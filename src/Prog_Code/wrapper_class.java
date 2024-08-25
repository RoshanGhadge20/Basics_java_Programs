package Prog_Code;

import javax.lang.model.element.ModuleElement.ProvidesDirective;
import javax.naming.AuthenticationException;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicTextUI.BasicCaret;

public class wrapper_class
{

	public static void main(String[] args)
	{
		//Autoboxing
		int a=10; // This is the normal int datatype as we are declaring 
		System.out.println("int:- "+ a);

		Integer ab=Integer.valueOf(a);
		// Integer ab=a;
		System.out.println("Integer"+ab);

		// unboxing
		Integer j=new Integer(10);
		int abc=j.intValue();

		/*
		 * Basic Classes that are Provided int = Integer char= Character boolean =
		 * Boolean string = String short = Short double= Double float = Float
		 */

	}

}

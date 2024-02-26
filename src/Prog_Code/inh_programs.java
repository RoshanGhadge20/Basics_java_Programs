package Prog_Code;
// Single level Inheritance

/*
 * class simple { public void demo() {
 * System.out.println("This method is called from demo()"); } }
 * 
 * public class inh_programs extends simple { public static void main(String[]
 * args) { inh_programs objSimple = new inh_programs(); objSimple.demo();
 * System.out.println("End of program execution"); } }
 */

// Multi-level Inheritance 
/*
 * class simple { public void demo() {
 * System.out.println("This method is called from demo() from class 1"); } }
 * class abc extends simple { public void s() {
 * System.out.println("This method is called from the s() from class 2"); } }
 * public class inh_programs extends abc { public static void main(String[]
 * args) { inh_programs objSimple = new inh_programs(); objSimple.demo();
 * objSimple.s(); System.out.println("End of program execution"); } }
 */

// Hierarchial Inheritance 
class example {
	static void demo1() {
		System.out.println("This call is from class A, demo1 method");
	}
}

class example1 extends example {
	static void demo2() {
		System.out.println("This call is from class B, demo2 method");
	}
}

class example3 extends example {
	static void demo3() {
		System.out.println("This call is from class c, demo3 method");
	}
}

class inh_programs {
	public static void main(String[] args) {
		example1 objB = new example1();
		objB.demo2();
		example3.demo3();
	}
}
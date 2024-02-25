package Prog_Code;

public class class_and_objec extends B {
	public static void main(String[] args) {
		class_and_objec obj = new class_and_objec();
		obj.demo();
		A obj1 = new A();
		obj.demo();
	}
}
class A {
	public void demo() {
		System.out.println("This is the basic method call created from Class A");
	}
	public String example;
	
}

class B extends A {
	public void demo1() {
		System.out.println("This is the basic method created from Class B");
		
	}
	
}
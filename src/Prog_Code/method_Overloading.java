package Prog_Code;

public class method_Overloading {
	public void sample1(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void sample2(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public void sample3(String a, String b) {
		String c= a.trim()+b.trim();
		System.out.println("trimmed string "+c);
	}
	public static void main(String[] args) {
		method_Overloading objMethod_Overloading=new method_Overloading();
		objMethod_Overloading.sample1(5, 7);
		objMethod_Overloading.sample2(2, 3, 8);
		objMethod_Overloading.sample3(" roshan  ", "  ghadge    ");
	}
}

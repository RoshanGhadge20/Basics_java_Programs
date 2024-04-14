package Prog_Code;

public class This_key {

	int a = 1;

	public void getdata(int a) {
		
		System.out.println("Value of a with this keyword is:" + this.a);
		System.out.println("Value of a is:" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This_key obj = new This_key();
		obj.getdata(6);

	}

}

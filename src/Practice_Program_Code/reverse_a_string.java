package Practice_Program_Code;

public class reverse_a_string {
	public static void main(String[] args) {
		String name = "Roshan", rev_str = "";
		char c;
		for (int i = 0; i < name.length(); i++) {
			c = name.charAt(i);
			rev_str = c + rev_str;
			// rev_str=rev_str+c get string name with correct order

		}
		System.out.println(rev_str);

		for (int j = 0; j < name.length(); j++) {
			rev_str = name.charAt(j) + rev_str;
		}
	}
}

package java_coding_questions;

public class count_number_of_character {

	public static void main(String[] args) {

		String s = "This is a string";
		Integer countInteger = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				countInteger++;
			}

		}
		System.out.println("Total number of characters into the given string without couting the space are the :- "
				+ countInteger);
	}

}

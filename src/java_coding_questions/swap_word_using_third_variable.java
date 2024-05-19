package java_coding_questions;

public class swap_word_using_third_variable {
	public static void main(String[] args) {
		
		String s="Hello world";
		int spaceIndex=s.indexOf(' ');
		String firstword=s.substring(0,spaceIndex);
		String secondword=s.substring(spaceIndex+1);
		
		String tempString=firstword;
		firstword=secondword;
		secondword=tempString;
		
		System.out.println("Reverse string with the temp variable:- "+ firstword + " "+ secondword);
	}

}

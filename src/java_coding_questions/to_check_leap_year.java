package java_coding_questions;

public class to_check_leap_year {
	public static void main(String[] args) {

		int year = 2020;
		boolean isleapyear = (year % 4 == 0);

		isleapyear = isleapyear && (year % 100 != 0 || year % 400 == 0);
		if (isleapyear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");

		}

	}
}

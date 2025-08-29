package BasicPrograms;

public class CheckPalindromeNumber {

    public static void main(String[] args) {

        int numb = 121, digits = 0, reminder, reverse = 0, temp, userinput = numb;

        // First loop to get the count of digits
        temp = numb;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Second loop to get the rev number & compare it
        for (int i = 1; i <= digits; i++) {

            reminder = numb % 10;
            reverse = (reverse * 10) + reminder;
            numb = numb / 10;
        }

        if (userinput == reverse) {
            System.out.println("Entered Number is palindrome");
        } else {
            System.out.println("Entered Number is not palindrome");
        }

    }

}

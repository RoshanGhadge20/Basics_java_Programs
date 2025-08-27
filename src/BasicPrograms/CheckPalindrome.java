package BasicPrograms;

public class CheckPalindrome {

    public static void main(String[] args) {

        // Checking palindrome for string
        String exmple = "Roshan Ghadge";

        StringBuffer sb = new StringBuffer(exmple).reverse();
        System.out.println("Reversed String :- " + sb);

        if (exmple.equals(sb)) {
            System.out.println("Str is palindrome");
        } else {
            System.out.println("Str is not palindrome");
        }

        // Check palidrome for Number
        int digit = 1235;
        String numberofdigits = Integer.toString(digit);
        int r, d, sum = 0, reverse = 0;
        for (int i = numberofdigits.length() - 1; i >= 0; i--) {
            r = digit % 10;
            sum = sum + r;
            reverse = (reverse * 10) + r;
            digit = digit / 10;
        }
        System.out.println("Reverse of Numbers :-" + reverse);
        System.out.println("Sum of integers :- " + sum);
    }

}

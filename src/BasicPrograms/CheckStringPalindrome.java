package BasicPrograms;

public class CheckStringPalindrome {

    public static boolean check_palindrome(String sample) {
        int start = 0;
        int end = sample.length() - 1;

        while (start < end) {
            if (sample.charAt(start) != sample.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        // Check Palindrome of String with two pointers method
        String example = "Roshan";
        System.out.println("Given String is " + check_palindrome(example));

        // Check string is palindrome or not by reversing it
        String abc = "laptop";
        String revString = "";
        for (int i = abc.length() - 1; i >= 0; i--) {
            revString = revString + abc.charAt(i);
        }
        System.out.println("REversed of String:- " + revString);
        if (revString.equals(abc)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

        // With the help of string builder
        String str1 = "Roshan";
        StringBuilder sb = new StringBuilder(str1);
        String revStr1 = sb.reverse().toString();
        System.out.println(revStr1);
        if (str1.equals(revStr1)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

}

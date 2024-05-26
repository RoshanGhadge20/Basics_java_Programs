package java_coding_questions;

import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            // Ignore non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }
            
            // Compare characters ignoring case
            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}

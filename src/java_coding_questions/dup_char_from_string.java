package java_coding_questions;

public class dup_char_from_string {
    public static void main(String[] args) {
        String strn = "hackerearth";

        for (int i = 0; i < strn.length(); i++) {
            char c = strn.charAt(i);
            int count = 0;
            boolean alreadycount = false;

            // Check if the character has already been counted
            for (int j = 0; j < i; j++) {
                if (strn.charAt(j) == c) {
                    alreadycount = true;
                    break;
                }
            }

            // If the character has already been counted, skip it
            if (alreadycount) {
                continue;
            }

            // Count the occurrences of the character in the string
            for (int k = 0; k < strn.length(); k++) {
                if (strn.charAt(k) == c) {
                    count++;
                }
            }

            // Print the character if it appears more than once
            if (count > 1) {
                System.out.println(c);
            }
        }
    }
}

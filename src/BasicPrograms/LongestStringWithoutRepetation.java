package BasicPrograms;

import java.util.HashSet;

public class LongestStringWithoutRepetation {

    public static int length_of_longestString(String str) {

        HashSet<Character> hashset = new HashSet<>();
        int maxLength = 0, start = 0, end = 0;

        while (end < str.length()) {
            Character ch = str.charAt(end);

            if (!hashset.contains(ch)) {
                hashset.add(ch);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                hashset.remove(str.charAt(start));
                start++;
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {

        String s1 = "Roshan";
        String s2 = "RoshanGhadge";
        String s3 = "f";
        String s4 = "fadfadf dfa";

        System.out.println("Longest substring without repeating characters in s1: " + length_of_longestString(s1));
        System.out.println("Longest substring without repeating characters in s2: " + length_of_longestString(s2));
        System.out.println("Longest substring without repeating characters in s3: " + length_of_longestString(s3));
        System.out.println("Longest substring without repeating characters in s4: " + length_of_longestString(s4));

    }

}

package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {

    public static void main(String[] args) {

        // Finding the duplicate of characters into string with the help of arrys
        String example = "Learn Java Programming";
        example = example.toLowerCase();

        // creating an error to count the frequency of each characters
        int[] freq = new int[256];
        char c;
        for (int i = 0; i < example.length(); i++) {
            c = example.charAt(i);
            if (c != ' ') {
                freq[c]++;
            }
        }

        System.out.println("Printing the duplicate of characters from string ");

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }

        // With the help of Hashmap

        HashMap<Character, Integer> charcountmap = new HashMap<>();

        for (char a : example.toCharArray()) {
            if (a != ' ') {
                charcountmap.put(a, charcountmap.getOrDefault(a, 0) + 1);
            }
        }

        System.out.println("Printing the duplicate of values from the string");
        for (Map.Entry<Character, Integer> entry : charcountmap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

}

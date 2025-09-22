package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code CountCharacterOfEachLetter} class demonstrates two approaches to
 * count the occurrences of characters in a string.
 * <p>
 * The first approach compresses consecutive repeating characters in a string
 * and appends the character followed by its count.
 * The second approach uses a {@link java.util.HashMap} to count the frequency
 * of each character in a given string, regardless of their order or position.
 * <p>
 * Example usage:
 * 
 * <pre>
 * Input: "RRjafdjjjjs"
 * Output (compressed): "R2j1a1f1d1j4s1"
 *
 * Input: "ROSHAN"
 * Output (character counts):
 * R: 1
 * O: 1
 * S: 1
 * H: 1
 * A: 1
 * N: 1
 * </pre>
 */
public class CountCharacterOfEachLetter {

    public static void main(String[] args) {

        String str1 = "RRjafdjjjjs";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str1.charAt(i)).append(count); // Appending the character and its count
                count = 1;
            }
        }

        sb.append(str1.charAt(str1.length() - 1)).append(count);
        // System.out.println("Printing the result :- " + sb.toString());

        // With the help of HashMap
        String sample = "ROSHAN";
        HashMap<Character, Integer> count_character = new HashMap<Character, Integer>();
        for (char c : sample.toCharArray()) {
            count_character.put(c, count_character.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count_character.entrySet()) {
            System.out.println("Printing character:-  " + entry.getKey() + " Printing count of it" + entry.getValue());
        }
    }

}

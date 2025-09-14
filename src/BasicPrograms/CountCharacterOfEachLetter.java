package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOfEachLetter {

    public static void main(String[] args) {

        String str1 = "RRjafdjjjjs";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str1.charAt(i)).append(count);
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

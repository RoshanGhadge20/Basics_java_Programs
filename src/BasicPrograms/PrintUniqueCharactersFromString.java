package BasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintUniqueCharactersFromString {

    public static void printing_unique_character_fromstring(String s1) {

        boolean[] freq = new boolean[256];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!freq[c]) {
                freq[c] = true;
                System.out.println(c + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("Enter the String:- ");
        input = sc.nextLine();
        printing_unique_character_fromstring(input);

        // Printing the only unique characters from string with the help of hashmap
        String Name = "Programming";
        HashMap<Character, Integer> check_unique_chracter = new HashMap<Character, Integer>();
        for (char c : Name.toCharArray()) {
            check_unique_chracter.put(c, check_unique_chracter.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : check_unique_chracter.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Printing the unique character from string :- " + entry.getKey());
            }
        }
    }

}

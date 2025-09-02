package BasicPrograms;

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

    }

}

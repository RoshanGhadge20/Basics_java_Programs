package BasicPrograms;

import java.util.Scanner;

public class SplitCharacterAndDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        char ch;
        StringBuilder charcters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isAlphabetic(ch) || (Character.isSpaceChar(ch))) {
                charcters.append(ch);
            } else {
                System.out.println("Another content from expected of conditions");
            }
        }

        System.out.println("Characters into String:- " + charcters);
        System.out.println("Digits into String :- " + digits);
    }

}

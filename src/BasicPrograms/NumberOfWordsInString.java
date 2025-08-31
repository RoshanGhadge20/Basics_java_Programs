package BasicPrograms;

import java.util.Scanner;

public class NumberOfWordsInString {

    public static void main(String[] args) {

        String example = "Java is the most popular programming language";
        String[] words = example.split(" ");

        // Count the number of words in string based on the method of array
        System.out.println("Total Number of words in string based on spaces is :-" + words.length);

        // Count the number of words in string based on the user input & without system
        // method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :- ");
        String sample = sc.nextLine();
        char c;

        int count = 1; // Starting the count with the 1 because then at least if last word does not
                       // have space then it should get count

        for (int i = 0; i < sample.length() - 1; i++) {
            if ((sample.charAt(i) == ' ') && (sample.charAt(i + 1) != ' ')) {
                count++;
            }
        }

        System.out.println("Total Number of words into string are :- " + count);
    }

}

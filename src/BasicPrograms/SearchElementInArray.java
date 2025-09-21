package BasicPrograms;

import java.util.*;

public class SearchElementInArray {

    public static void main(String[] args) {

        int[] numbers = { 1, 6, 2, 4, 7, 3, 5, 9, 10 };

        // Taking input from Users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number from 1 to 10 to find out the index position in an array");
        int user_input = sc.nextInt();

        int count = 0;
        for (int num : numbers) {
            count = count + 1;
            if (num == user_input) {
                System.out.println(" User input number found in array at postion of :- " + (count));
            }
        }

    }

}

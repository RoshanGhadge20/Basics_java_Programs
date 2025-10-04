package Java_Coding_Interview_Questions_QA;

import java.util.ArrayList;
import java.util.Arrays;

public class KeepAllElementAtEnd {

    public static void main(String[] args) {

        int numbers[] = { 1, 0, 3, 5, 8, 0, 3, 5, 0, 4, 22 };

        // Printing the arrays with all the zeros will be keeping at end
        // System.out.println("Array of Numbers: -" + Arrays.toString(numbers));

        ArrayList<Integer> non_zeros = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int num : numbers) {
            if (num > 0) {
                non_zeros.add(num);
            } else {
                zeros.add(num);
            }
        }
        // System.out.println("Printing the all zeros at the end from arrays :- " +
        // non_zeros + zeros);

        // In the same arrays itself
        int input[] = { 1, 2, 0, 8, 0, 6, 0, 5, 3, 3, 0 };

        int index = 0;
        for (int j = 1; j < input.length; j++) {
            if (input[j] > 0) {
                input[index++] = input[j];
            }
        }

        while (index < input.length) {
            input[index++] = 0;
        }

        System.out.print("All the element are zeros position with :- " + Arrays.toString(input));
    }
}

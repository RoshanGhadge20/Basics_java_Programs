package BasicPrograms;

import java.util.HashSet;

public class CommonElementFromArray {

    public static void main(String[] args) {

        // With the help of loops
        int[] num1 = { 1, 2, 3, 4, 5 };
        int[] num2 = { 3, 4, 5, 6, 7 };

        if (num1.length == num2.length) {

            for (int i = 0; i < num1.length; i++) {
                for (int j = 0; j < num2.length; j++) {
                    if (num1[i] == num2[j]) {
                        // System.out.println("Common Element from array :- " + num1[i]);
                    }
                }
            }
        }

        // With the help of sets to compare the result
        int array1[] = { 1, 2, 5, 6, 8, 8 };
        int array2[] = { 1, 5, 6, 8, 9, 4 };

        HashSet<Integer> set_number = new HashSet<Integer>();
        for (int num : array1) {
            set_number.add(num);
        }
        for (int value : array2) {
            if (set_number.contains(value)) {
                System.out.println(value);
            }
        }

    }

}

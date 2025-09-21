package BasicPrograms;

import java.util.Arrays;

public class FindOutOddandEvenNumbersFromArray {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 2, 2, 3, 4, 5, 7, 8, 9, 11, 13, 15, 17, 19 };
        int[] even_numbers = new int[20];
        int[] odd_numbers = new int[20];

        int eindex = 0;
        int oindex = 0;

        // Identifying the odd and even numbers from arrays with the help of for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // System.out.println(arr[i] + " is Even Number");
                even_numbers[eindex] = arr[i];
                eindex++;
            } else {
                // System.out.println(arr[i] + " is Odd Number");
                odd_numbers[oindex] = arr[i];
                oindex++;
            }
        }

        System.out.println("Even Numbers from Array: " + Arrays.toString(Arrays.copyOf(even_numbers, eindex)));
        System.out.println("Odd Numbers from Array: " + Arrays.toString(Arrays.copyOf(odd_numbers, oindex)));
    }

}

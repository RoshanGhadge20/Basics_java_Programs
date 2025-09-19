package BasicPrograms;

public class FindTheMissingElementInArrays {

    public static void main(String[] args) {

        int[] array1 = { 21, 22, 23, 25, 26 };

        int array_length = array1.length + 1, arraysum = 0;
        int start = array1[0];
        int end = array1[array1.length - 1];
        int sumOfNumbers = array_length * (start + end) / 2; // same formula used to calculate the sum of natural
                                                             // numbers
        for (int num : array1) {
            arraysum += num;
        }

        System.out.println("Difference into element of array:- " + (sumOfNumbers - arraysum));

    }

}

package Java_Coding_Interview_Questions_QA;

public class FindOutMissinNumberFromArray {

    public static void main(String[] args) {
        int numbers[] = { 21, 22, 23, 25, 26, 27 };
        // Program to find out the missing numbers from arrays

        int count = numbers.length + 1;
        int start = numbers[0];
        int end = numbers[numbers.length - 1];

        System.out.println("Total number of element into the array :- " + count);
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }

        System.out.println("Sum of Arrays all elements are :- " + sum);
        int expected_sum = count * (start + end) / 2;
        System.out.println("Difference between the element of arrays is :- " + (expected_sum - sum));
    }

}

package BasicPrograms;

public class MinandMaxNumberFromArrays {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 7, 77 };
        int min_number = numbers[0];
        int max_number = numbers[0];

        for (int num : numbers) {
            if (num < min_number) {
                min_number = num;
            }
            if (num > max_number) {
                max_number = num;
            }
        }
        System.out.println("Minimum Number from arrays :- " + min_number);
        System.out.println("Maximum Number from arrays :- " + max_number);
    }
}

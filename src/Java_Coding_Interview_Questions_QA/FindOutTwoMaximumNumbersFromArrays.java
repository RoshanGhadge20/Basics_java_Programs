package Java_Coding_Interview_Questions_QA;

public class FindOutTwoMaximumNumbersFromArrays {

    public static void main(String[] args) {

        int[] number = { 1, 2, 3, 4, 5, 6, 7, 79, 9, 78 };

        int first_max_number = 0, second_max_number = 0;

        for (int i = 1; i < number.length; i++) {
            if (number[i] > first_max_number) {
                second_max_number = first_max_number;
                first_max_number = number[i];
            } else if (second_max_number < number[i]) {
                second_max_number = number[i];
            }

        }

        System.out.println("Printing both the numbers :- " + "first max number" + first_max_number + "second max number"
                + second_max_number);
    }

}

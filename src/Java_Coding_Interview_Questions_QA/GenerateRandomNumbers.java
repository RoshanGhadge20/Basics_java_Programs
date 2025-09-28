package Java_Coding_Interview_Questions_QA;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {

    public static void main(String[] args) {

        int min_number, max_number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Min Number:- ");
        min_number = sc.nextInt();

        System.out.println("Enter the Max Number:- ");
        max_number = sc.nextInt();

        Random rd = new Random();
        // Generating the random numbers with given range
        // int random_number = rd.nextInt(min_number, max_number);

        int random_number = rd.nextInt(max_number - min_number + 1) + min_number;
        System.out.println("Random Numbers:- " + random_number);

    }

}

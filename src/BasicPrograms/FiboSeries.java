package BasicPrograms;

import java.util.Scanner;

public class FiboSeries {

    public static void main(String[] args) {

        // Printing the fibo series
        int first = 0, second = 1, next, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(first + ",");
            next = first + second;
            first = second;
            second = next;

        sc.close();
        System.out.println("\n End with program execution");
    }
}

package BasicPrograms;

public class fibonacciSeries {

    public static void main(String[] args) {
        int first = 0, second = 1, n = 10, num;

        System.out.print("Fibonnacci Series :- " + first + "," + second);

        for (int i = 2; i <= n; i++) {
            num = first + second;
            System.out.print("," + num);
            first = second;
            second = num;
        }
    }
}

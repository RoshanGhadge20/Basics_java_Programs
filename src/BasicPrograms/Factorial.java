package BasicPrograms;

public class Factorial {

    public static void main(String[] args) {

        int fact = 1, num = 5;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number is :- " + fact);
    }
}

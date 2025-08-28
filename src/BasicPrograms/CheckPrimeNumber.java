public class CheckPrimeNumber {

    public static void main(String[] args) {

        int num = 80;

        if (num == 1) {
            System.out.println("Its Not Prime Number");
        }
        if (num == 2 || num == 3) {
            System.out.println("Its  Prime Number");
        }
        int d = num;
        for (int i = 2; i <= Math.sqrt(d); i++) {
            if (d % i == 0) {
                System.out.println("Its not prime Number");
            }
        }
    }
}

package BasicPrograms;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        int num = 123, digit, sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Printing the sum of digits:-" + sum);
    }

}

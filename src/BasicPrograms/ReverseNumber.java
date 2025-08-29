package BasicPrograms;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 123, rev = 0, d, rem;

        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        System.out.println("Reverse of Entered Number is :-" + rev);
    }

}

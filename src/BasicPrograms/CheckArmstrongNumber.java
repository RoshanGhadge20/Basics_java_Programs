package BasicPrograms;

public class CheckArmstrongNumber {

    public static void main(String[] args) {
        int num = 153, count = 0, d, rem = 0, Number = num, temp;

        // First loop to calculate the number of digits into number
        temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println("Total digits into the number are :- " + count);

        // Loop to calculate & check number is armstrong
        temp = num;
        while (num > 0) {
            d = num % 10;
            rem = (int) (rem + Math.pow(d, count));
            num = num / 10;
        }
        if (Number == rem) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }

    }
}

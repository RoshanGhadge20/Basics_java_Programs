package BasicPrograms;

public class SumOfOnlyIntegersFromArray {

    public static void main(String[] args) {

        String[] arr = { "1", "2", "3", "4", "5", "A", "!", "@" };
        int sum = 0;
        char ch;

        for (String element : arr) {
            ch = element.charAt(0);
            if (Character.isDigit(ch)) {
                sum = sum + Integer.parseInt(element);
            } else if (Character.isLetter(ch)) {
                // System.out.println("This is an Alphabet " + element);

            } else {
                // System.out.println("This is a Special Character " + element);
            }
        }

        System.out.println("Addition of Only Integers from arrays " + sum);
    }

}

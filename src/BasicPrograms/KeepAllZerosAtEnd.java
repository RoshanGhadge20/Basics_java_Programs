package BasicPrograms;

public class KeepAllZerosAtEnd {

    public static void main(String[] args) {

        String Str = "32400121200";

        StringBuilder nondigits = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (char ch : Str.toCharArray()) {
            if (ch != '0') {
                digits.append(ch);
            } else {
                nondigits.append(ch);
            }
        }

        System.out.println("Printing all the Zeros at end:- " + digits.toString() + nondigits.toString());
    }

}

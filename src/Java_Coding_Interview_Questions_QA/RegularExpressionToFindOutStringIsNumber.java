package Java_Coding_Interview_Questions_QA;

public class RegularExpressionToFindOutStringIsNumber {

    public static void main(String[] args) {

        // With the help of regex to find out whether the string is number or not
        String regex = "[0-9]+";
        String data = "1254";
        System.out.println("Verifying whether the string is number or not:- " + data.matches(regex));

    }

}

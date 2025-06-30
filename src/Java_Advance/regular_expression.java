package Java_Advance;

import java.util.regex.*;

public class regular_expression {

    public static void main(String[] args) {

        // Regular expression : - Its sequence of characters that it forms the search
        // patterns

        Pattern pattern = Pattern.compile("W3 school", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit to school");
        boolean matchfound = matcher.find();

        if (matchfound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match does not found");
        }
    }

}

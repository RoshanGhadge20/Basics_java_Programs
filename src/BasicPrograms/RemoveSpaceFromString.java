package BasicPrograms;

public class RemoveSpaceFromString {

    public static void main(String[] args) {

        String s1 = "Java Automation Testing with workaround";
        char c;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                result.append(s1.charAt(i));
            }
        }

        System.out.println(" String after removal of space :- " + result.toString());
    }

}

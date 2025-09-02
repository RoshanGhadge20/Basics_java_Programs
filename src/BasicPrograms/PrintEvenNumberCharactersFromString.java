package BasicPrograms;

public class PrintEvenNumberCharactersFromString {

    public static void main(String[] args) {

        String s1 = "RoshanGhadge";
        System.out.println("Printing the characters at even number position");

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s1.charAt(i));
            }
        }
    }

}

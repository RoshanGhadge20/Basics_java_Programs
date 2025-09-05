package BasicPrograms;

public class PrintEachLetterTwiceFromString {

    public static void main(String[] args) {
        String str = "RoshanGhadge";
        char c;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            sb.append(c).append(c).append(c);
        }
        System.out.println("Printing the string with duplicating the each character from it:- " + sb);
    }

}

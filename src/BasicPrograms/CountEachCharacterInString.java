package BasicPrograms;

public class CountEachCharacterInString {
    public static void main(String[] args) {

        String exmple = "Java is Programming language";
        exmple = exmple.toLowerCase();

        int[] freq = new int[256];
        char c;
        for (int i = 0; i < exmple.length(); i++) {
            c = exmple.charAt(i);
            if (c != ' ') {
                freq[c]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }

    }

}

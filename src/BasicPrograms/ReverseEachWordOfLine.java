package BasicPrograms;

public class ReverseEachWordOfLine {

    public static void main(String[] args) {

        String example = "Java is the Programming language";
        String[] words = example.split(" ");
        String revstring = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revStr = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revStr = revStr + word.charAt(j);
            }
            revstring = revstring + revStr + " ";
        }
        System.out.println("String with original input:-" + example);
        System.out.println("String with reverse string :- " + revstring.trim());

    }

}

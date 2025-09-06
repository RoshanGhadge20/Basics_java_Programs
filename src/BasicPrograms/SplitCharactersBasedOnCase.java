package BasicPrograms;

public class SplitCharactersBasedOnCase {

    public static void main(String[] args) {

        String str1 = "aAbBERDFDadfadE";

        StringBuilder lowercase = new StringBuilder();
        StringBuilder uppercase = new StringBuilder();

        for (char c : str1.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercase.append(c);
            } else {
                uppercase.append(c);
            }
        }

        System.out.println("Printing all the lowercase characters:- " + lowercase);
        System.out.println("Printing all the uppercase characters:- " + uppercase);
    }
}

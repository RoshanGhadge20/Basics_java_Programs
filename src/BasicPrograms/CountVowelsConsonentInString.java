package BasicPrograms;

public class CountVowelsConsonentInString {
    public static void main(String[] args) {

        String sample = "Test Automtionwith java";
        sample = sample.toLowerCase();

        Integer vowel = 0, consonent = 0;

        for (char c : sample.toCharArray()) {
            if (c >= 'a' & c <= 'z') {

                if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
                    vowel++;
                } else {
                    consonent++;
                }
            }
        }
        System.out.println("Count of Vowels :- " + vowel + "\n" + "Count of Consonents :- " + consonent);
    }
}

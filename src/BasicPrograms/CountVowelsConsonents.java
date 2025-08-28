package BasicPrograms;

public class CountVowelsConsonents {

    public static void main(String[] args) {

        String Example = "Automation";
        int count_vowels = 0, conso = 0;
        String vowels = "aeiouAEIOU";
        char c;

        for (int i = 0; i < Example.length(); i++) {
            c = Example.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count_vowels++;
            } else {
                conso++;
            }

        }
        System.out.println("Count of vowels & conso:- " + count_vowels + " " + conso);
    }

}

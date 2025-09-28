package Java_Coding_Interview_Questions_QA;

import Multithreading_Example.sample;

public class FindOutDuplicateWordFromString {

    public static void FindOutDuplicateWordFromString(String sample) {

        int count = 0;
        sample = sample.toLowerCase();
        String word[] = sample.split(" ");
        for (int i = 0; i < word.length; i++) {
            count = 1;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    word[j] = "0";
                }
            }

            if (count > 1 && word[i] != "0") {
                System.out.println("Printing the duplicate word :- " + word[i]);
            }
        }

    }

    public static void main(String[] args) {

        String sample = " Big black bug bit a big black dog on his big black nose";

        FindOutDuplicateWordFromString(sample);

    }

}

package BasicPrograms;

import java.util.HashSet;

public class RemoveDuplicateFromelementay {

    public static void main(String[] args) {

        int sample[] = { 1, 2, 3, 4, 5, 6, 5, 6, 4 };

        // with the helpf o set
        HashSet<Integer> element1 = new HashSet<>();
        for (int element : sample) {
            element1.add(element);
        }
        System.out.println("Printing all elements :- " + element1);

        // With the help of loops

    }

}

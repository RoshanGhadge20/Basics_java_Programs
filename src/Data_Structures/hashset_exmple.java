package Data_Structures;

import java.util.*;

public class hashset_exmple {

    public static void main(String[] args) {

        // Hashset
        /*
         * 1. no guranteee of order
         * 2. duplicate are not allowed
         * 3. faster in performance
         */

        HashSet<String> example = new HashSet<String>();

        example.add("volvo");
        example.add("dfad");
        example.add("dfad");
        example.add("rangerover");
        example.add("toyota");
        example.add("mahindra");
        example.add("lvo");
        example.add("vo");

        System.out.println(example);

        example.contains("vo");

        // Looping through the hashset
        for (String s : example) {
            System.out.println(s);
        }

        // example.removeAll(example);

    }

}

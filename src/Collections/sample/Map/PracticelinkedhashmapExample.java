package Collections.sample.Map;

import java.util.LinkedHashMap;

public class PracticelinkedhashmapExample {

    public static void main(String[] args) {

        // Practice set of linkedHashmap
        /*
         * 1 implements map interface
         * 2 stores the values but as per insertion order
         * 3 its slightly slower due to its order of preservance
         * 4 works on key & value pairs
         * 
         */

        LinkedHashMap<String, String> example = new LinkedHashMap<>();

        example.put("name", "roshan");
        example.put("std", "10");
        example.put("surname", "Ghadge");
        example.put("middle_name", "Sanjay");

        System.out.println(example);

        boolean test = example.containsKey("name");
        System.out.println(test);

        example.isEmpty();

        example.get("name");

        System.out.println(example.size());

        System.out.println(example.keySet());

        System.out.println(example.values());

        // Iterating through the key & value set
        for (String i : example.keySet()) {
            System.out.println(i);
        }

        for (String j : example.values()) {
            System.out.println(j);
        }

        example.clear();

    }
}

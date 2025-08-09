package Collections.sample.Map;

import java.util.HashMap;

public class PracticehashmapExample {
    public static void main(String[] args) {

        // Working with Hashmaps
        /*
         * 1. implements map interfaces
         * 2. works with key & value pairs
         * 3. fast & unordered in nature
         * 4. it allows the null values as well
         * 5. We cannot use the foreach loop with this
         */

        HashMap<String, String> example = new HashMap<String, String>();
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

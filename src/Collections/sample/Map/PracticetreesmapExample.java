package Collections.sample.Map;

import java.util.TreeMap;

public class PracticetreesmapExample {
    public static void main(String[] args) {

        // practice set with treeset
        /*
         * 1. implements map interface
         * 2. contains the key & value pair
         * 3. its in sorted order
         */

        TreeMap<String, String> example = new TreeMap<>();

        example.put("England", "London");
        example.put("India", "New Delhi");
        example.put("Austria", "Wien");
        example.put("Norway", "Oslo");
        example.put("USA", "Washington DC");

        System.out.println("Capital Cities: " + example);

        String capitalOfIndia = example.get("India");
        System.out.println("Capital of India: " + capitalOfIndia);

        example.remove("Norway");
        System.out.println("After removing Norway: " + example);

        example.get("India");

        Object example1 = example.clone();

        example.isEmpty();

        example.remove("United Kingdom");

        // Iterating through the items

        for (String element : example.keySet()) {
            System.out.println(element);
        }

        for (String elements : example.values()) {
            System.out.println(elements);
        }

        example.clear();

    }

}

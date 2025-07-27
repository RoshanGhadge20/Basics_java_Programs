package Data_Structures;

import java.util.LinkedHashMap;

public class linkedhashmap_example {

    public static void main(String[] args) {

        /*
         * 1. Insertion order preserved
         * 2. Slightly slower due to ordering
         * 3. Keys must be unique
         */
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

    }

}

package Data_Structures;

import java.util.TreeMap;

public class treemap_example {
    public static void main(String[] args) {

        /*
         * 1. Sorted by keys
         * 2. Does not allow null keys
         * 3. Slower (maintains sorted order)
         */

        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        // Rest all the methods & iteration is same

    }
}

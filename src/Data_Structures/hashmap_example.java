package Data_Structures;

import java.util.HashMap;

public class hashmap_example {

    public static void main(String[] args) {

        HashMap<String, String> capitalcities = new HashMap<>();
        capitalcities.put("England", "London");
        capitalcities.put("India", "New Dehli");
        capitalcities.put("Austria", "Wien");
        capitalcities.put("Norway", "Oslo");
        capitalcities.put("Norway", "Oslo"); // Duplicate
        capitalcities.put("USA", "Washington DC");

        System.out.println(capitalcities);

        capitalcities.get("Norways");
        capitalcities.remove("Norways");
        // capitalcities.clear();

        // Looping through the hashmap
        for (String i : capitalcities.values()) {
            System.out.println(i);
        }

    }

}

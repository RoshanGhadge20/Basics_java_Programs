package Data_Structures;

import java.util.LinkedHashSet;

public class linkedhashset_example {

    public static void main(String[] args) {

        // Linked Hash Set
        /*
         * 1. Remember the order of execution
         * 2. unique
         * 3. same methods as the set interface
         */

        LinkedHashSet<String> cars = new LinkedHashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate
        cars.add("Mazda");

        cars.contains("bmw");

        cars.remove("bmw");

        cars.clear();

        cars.size();

        for (String car : cars) {
            System.out.println(car);
        }
    }

}

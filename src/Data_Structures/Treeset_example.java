package Data_Structures;

import java.util.TreeSet;

public class Treeset_example {

    public static void main(String[] args) {

        // Treeset
        /*
         * 1. Keeps default elements are in sorted order
         * 2. duplicate are not allowed
         * 3. slower in performance
         */

        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate
        cars.add("Mazda");

        System.out.println(cars);

        cars.size();

        cars.remove("bmw");

        cars.clear();

        for (String i : cars) {
            System.out.println(i);
        }

        for (int i = 0; i <= cars.size(); i++) {
            System.out.println(i);
        }

    }
}

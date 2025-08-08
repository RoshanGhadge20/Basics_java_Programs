package Collections.sample.set;

import java.util.TreeSet;

public class PracticetreesetExample {

    public static void main(String[] args) {

        // Practice set with TreesetExample
        /*
         * 1. It contains only unique elements
         * 2. Its in sorted order of storing the elements
         * 3. It cannot be accessed via the index based position
         * 4. implementig the set interface
         * 5. Prints only unique elements
         */

        TreeSet<String> example = new TreeSet<String>();

        example.add("Roshan");
        example.add("ABCD");
        example.add("Ghadge");
        example.add("SSG");
        example.add("Roshan");

        System.out.println("Printing the elements of treeset:- " + example);

        Object example1 = example.clone();

        // example1.clear();

        boolean status = example.contains("Sample");

        example.isEmpty();

        example.remove("SSG");

        for (String element : example) {
            System.out.println(element);
        }

        example.clear();

    }

}

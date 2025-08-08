package Collections.sample.set;

import java.util.HashSet;
import java.util.Iterator;

public class PracticehashsetExample {

    public static void main(String[] args) {

        // Working with Hashset Examples
        /*
         * 1. Hashsets are fast & unordered set of data being stored
         * 2. Its implements set interface
         * 3. It contains only unique elements, even if we enter the same set of data
         * two times still it represents into single time only
         * 4. We cannot access this with the index based position directly
         * 5. It stores the element in which order they have added
         */

        HashSet<String> example = new HashSet<String>();
        example.add("Roshan");
        example.add("Sanjay");
        example.add("Ghadge");
        example.add("SSG");
        example.add("Roshan");

        System.out.println(example);

        // Index based accesss
        // for (int i = 0; i < example.size(); i++) {
        // System.out.println(i);
        // }

        // Iterating through the loops
        for (String i : example) {
            System.out.println(i);
        }

        boolean yes = example.contains("rohsan");
        System.out.println("Whether it is contains an roshan word :- " + yes);

        Object names[] = example.toArray();

        example.isEmpty();

        Iterator<String> it = example.iterator();
        while (it.hasNext()) {
            Object elem = it.next();
            System.out.println("Printing element :- " + elem);

        }

        Object sample = example.clone();

        boolean verify_its_empty = example.isEmpty();

        example.clear();

    }

}

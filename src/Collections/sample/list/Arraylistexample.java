package Collections.sample.list;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistexample {

    public static void main(String[] args) {

        // Arraylist is class which it implements the list interface
        /*
         * Features of arraylist
         * 1. Data is stored in ordered format
         * 2. May have duplicate values
         * 3. We can access it with index bases values
         * 4. It mainly used for the access & storing the data
         */
        ArrayList<String> example_ArrayList = new ArrayList<>();
        example_ArrayList.add("Roshan");
        example_ArrayList.add("Sanjay");
        example_ArrayList.add("Ghadge");
        example_ArrayList.add("Volvo");
        example_ArrayList.add("BMW");

        // iterating through the loops
        for (String e : example_ArrayList) {
            System.out.println("Printing the names of arraylist :- " + e);
        }

        Integer size = example_ArrayList.size();

        example_ArrayList.add(1, "Hello World");

        ArrayList<String> example1 = (ArrayList<String>) example_ArrayList.clone();

        System.out.println(example1);

        example_ArrayList.get(0);
        example_ArrayList.remove(1);

        example_ArrayList.clear();

        // To sort the elements of arraylist
        Collections.sort(example_ArrayList);

    }

}

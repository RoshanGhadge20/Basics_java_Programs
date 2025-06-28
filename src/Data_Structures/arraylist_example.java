package Data_Structures;

import java.util.*;

public class arraylist_example {
    public static void main(String[] args) {

        ArrayList<String> example = new ArrayList<String>();
        example.add("Demo");
        example.add("roshan");
        example.add("sanjay");
        example.add("ghadge");
        example.add("shubham");
        example.add(0, "ghadge");

        // System.out.println(example);
        // System.out.println(example.get(0));

        // Looping through the iterators
        Iterator it = example.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        example.set(0, "subhash");

        example.remove(1);

        Object obj = example.clone();
        System.out.println(obj);

        ArrayList<String> example1 = (ArrayList<String>) example.clone();

        System.out.println("Original ArrayList :- " + example);
        System.out.println("Cloned ArrayList :- " + example1);

        example.add("Lavanya");
        System.out.println("Original ArrayList1 :- " + example);
        System.out.println("Cloned ArrayList1 :- " + example1);

        // Looping through the foreeach loop
        for (String test : example) {
            System.out.println(test);
        }

        // Clearing all the elements from the arraylist
        example.clear();
        System.out.println(example);

        // Fetchig the size of the array
        System.out.println(example1.size());

    }
}

package Collections.sample.set;

import java.util.LinkedList;

public class PracticelinkedhashsetExample {
    public static void main(String[] args) {

        LinkedList<String> example = new LinkedList<String>();

        // Practice set with the linkedhashset
        /*
         * 1.it allows the duplicate of values
         * 2. it implements set interface
         * 3. it maintain the order of insertion of elements
         */

        example.add("Roshan");
        example.add("Sanjay");
        example.add("Lavanaya");
        example.add("SSG");
        example.add("Roshan");

        System.out.println(example);

        example.addFirst("RG");
        example.addLast("GR");
        example.removeFirst();
        example.removeLast();
        example.size();

        for (String element : example) {
            System.out.println("Printing the elements :-" + element);
        }

        example.clear();
    }
}

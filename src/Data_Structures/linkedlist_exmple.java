package Data_Structures;

import java.util.*;

public class linkedlist_exmple {
    public static void main(String[] args) {

        LinkedList<Integer> example = new LinkedList<Integer>();
        example.add(10);
        example.add(90);
        example.add(70);
        example.add(50);
        example.add(40);
        example.add(5);
        example.add(1);

        for (Integer i : example) {
            System.out.println(i);
        }

        example.addFirst(3);
        example.addLast(99);
        System.out.println(example.get(0));
        System.out.println(example.getLast());
        System.out.println(example.set(0, 25));

    }
}

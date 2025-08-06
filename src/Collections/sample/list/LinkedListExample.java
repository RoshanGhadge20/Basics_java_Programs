package Collections.sample.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> exampLinkedList = new LinkedList<String>();

        // LinkedList is the class which it implements the list interface
        /*
         * features of linkedlist
         * 1. It used for the manipulations into data
         * 2.
         */

        exampLinkedList.add("Roshan");
        exampLinkedList.add("Sanjay");
        exampLinkedList.add("Ghadge");

        exampLinkedList.remove("Roshan");

        exampLinkedList.addFirst("Ghadge");
        exampLinkedList.removeFirst();
        exampLinkedList.addLast("Eg");
        exampLinkedList.clear();

        exampLinkedList.size();

        // Iterating through the loops
        for (String i : exampLinkedList) {
            System.out.println(i);
        }

        exampLinkedList.getLast();

    }

}

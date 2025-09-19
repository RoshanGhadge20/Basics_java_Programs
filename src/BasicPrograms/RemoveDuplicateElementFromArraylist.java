package BasicPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElementFromArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list_element = new ArrayList<>();
        list_element.add(10);
        list_element.add(20);
        list_element.add(10);
        list_element.add(5);
        list_element.add(9);
        list_element.add(6);

        HashSet<Integer> numbers = new HashSet<Integer>(list_element);

        for (int num : numbers) {
            System.out.println("Printing the unique numbers from arraylist:- " + num);
        }
    }

}

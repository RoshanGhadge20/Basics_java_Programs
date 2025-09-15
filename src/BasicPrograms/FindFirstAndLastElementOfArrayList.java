package BasicPrograms;

import java.util.ArrayList;

public class FindFirstAndLastElementOfArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Roshan");
        names.add("RoshanS");
        names.add("RoshanG");
        names.add("RG");

        // By simple method
        System.out.println("First Position:- " + names.get(0));
        System.out.println("Last Position :- " + names.get(names.size() - 1));
    }

}

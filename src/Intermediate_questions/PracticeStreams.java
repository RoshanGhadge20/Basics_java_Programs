package Intermediate_questions;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PracticeStreams {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Roshan");
        names.add("Sanjay");
        names.add("Ghadge");
        names.add("Sam");
        names.add("Sample");
        names.add("Roshan");

        // Working with Streams

        // count the names
        long count_names = names.stream().filter(s -> s.startsWith("R")).count();
        System.out.println(count_names);

        // Print stream into sorted order
        System.out.println(names.stream().filter(s -> s.startsWith("S")).sorted());

        // print with foreach loops
        names.stream().forEach(a -> System.out.println(a));

        // map method
        long count = names.stream().map(z -> z.toUpperCase()).count();
        System.out.println("count of letters with marking it to the upppercase" + count);

        // to get only distinct elements
        names.stream().distinct();

        // to working with colllectors
        var example = names.stream().filter(a -> a.startsWith("s")).collect(Collectors.toList());
        System.out.println("Printing all the names which start with s");
        example.forEach(System.out::println);

    }
}

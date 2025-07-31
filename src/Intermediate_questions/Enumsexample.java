package Intermediate_questions;

import java.util.Enumeration;
import java.util.Vector;

public class Enumsexample {
    public static void main(String[] args) {

        Vector vc = new Vector();
        vc.add("Roshan");
        vc.add("Ghadge");
        vc.add(10);
        vc.add(10.5);

        // Enumeration is the cursor which it used to iterate through the element & it
        // works only with the older legacy of classes like vector & stacks
        Enumeration en = vc.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }
}

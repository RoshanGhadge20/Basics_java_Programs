package Intermediate_questions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization_Example {
    public static void main(String[] args) throws IOException {

        // Serialization is process of converting the object into byte code

        // String pah = "";
        demo objDemo = new demo(12, "Roshan");

        FileOutputStream fos = new FileOutputStream("E://Core java Practice//src//Files//file1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(objDemo);

        oos.close();
        fos.close();
        System.out.println("Completed with serialization");

    }
}

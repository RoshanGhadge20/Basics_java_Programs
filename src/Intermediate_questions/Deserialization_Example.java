package Intermediate_questions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization_Example {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Deserialization is process that it converts the byte code/ json into again
        // object

        FileInputStream fis = new FileInputStream("E://Core java Practice//src//Files//file1.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);
        ois.readObject();

        ois.close();
        fis.close();

        System.out.println("Deserialization completes ");

    }
}

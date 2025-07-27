package java_coding_questions;

import java.io.*;

public class file_handling {
    public static void main(String[] args) {

        try {

            File myfile = new File("path of file");
            if (myfile.canWrite()) {

                System.out.println("File having access of Writing ");
            } else if (myfile.canRead()) {
                System.out.println("File having access of Reading ");
            } else {
                System.out.println("No response");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();

        }

    }

}

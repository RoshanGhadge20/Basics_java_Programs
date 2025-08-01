package Intermediate_questions;

import java.io.FileInputStream;
import Custom_Exceptions.MyException;
import Custom_Exceptions.runtimecustom_exception;

public class samplecustom_exceptions {

    public static void main(String[] args) {

        /*
         * try {
         * throw new MyException("This issue is occurs because of file path is empty");
         *
         * } catch (MyException e) {
         * System.out.println(e.getMessage());
         * } finally {
         * System.out.println("Finally block executed");
         * }
         *
         */

        try {
            throw new runtimecustom_exception("New runtime exception occurs");
        } catch (runtimecustom_exception e) {
            System.out.print(e.getMessage());
        }

    }

}

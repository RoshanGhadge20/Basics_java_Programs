package Multithreading_Example;

public class sample implements Runnable {

    public sample() {
        System.out.println("Default constructor is being called");
    }

    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        } catch (Exception e) {

            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }

}

public class ExampleTest {

    public static void main(String[] args) {
        int n = 8; // Number of threads

        sample obj1 = new sample();

        for (int i = 0; i < n; i++) {
            Thread object = new Thread(obj1);
            object.start();
        }
    }

}

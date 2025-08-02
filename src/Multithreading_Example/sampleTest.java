package Multithreading_Example;

//  Multithreading by extending the thread class 

class mythread extends Thread {

    private String thread_name;

    public mythread(String name) {
        this.thread_name = name;
        System.out.println(" constructor is called" + thread_name);

    }

    public void run() {
        System.out.println("Running thread" + thread_name);
    }

}

public class sampleTest {

    public static void main(String[] args) {

        mythread obj = new mythread("Thread1");
        mythread obj2 = new mythread("Thread2");

        obj.run();
        obj2.run();
    }
}

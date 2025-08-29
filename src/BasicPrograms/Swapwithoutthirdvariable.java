package BasicPrograms;

public class Swapwithoutthirdvariable {

    public static void main(String[] args) {

        int a = 3, b = 8;

        System.out.println("Values Before Swapping the Numbers:- " + a + "," + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values After Swapping the Numbers:- " + a + "," + b);

    }

}

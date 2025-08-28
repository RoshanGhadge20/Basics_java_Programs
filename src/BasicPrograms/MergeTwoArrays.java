package BasicPrograms;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] simple1 = { 1, 6, 8, 2, 3, 4, 5 };
        int[] simple2 = { 1, 2, 3, 6, 1, 2, 3, 5 };

        // with system.arraycopy
        int[] mergedarray = new int[simple1.length + simple2.length];
        System.arraycopy(simple1, 0, mergedarray, 0, simple1.length);
        System.arraycopy(simple2, 0, mergedarray, simple1.length, simple2.length);
        System.out.println("Megerd array with system.arraycopy:- " + Arrays.toString(mergedarray));

        // With the for loops
        int[] mergearr = new int[simple1.length + simple2.length];
        for (int i = 0; i < simple1.length; i++) {
            mergearr[i] = simple1[i];
        }
        for (int j = 0; j < simple2.length; j++) {
            mergearr[simple1.length + j] = simple2[j];
        }

        System.out.println("Merged array with the loops:- " + Arrays.toString(mergearr));
    }

}

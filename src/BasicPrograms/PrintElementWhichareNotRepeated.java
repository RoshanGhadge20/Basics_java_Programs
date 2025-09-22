package BasicPrograms;

public class PrintElementWhichareNotRepeated {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3 };
        System.out.println("The non-repeated elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println(arr[i]);
            }
        }

    }

}

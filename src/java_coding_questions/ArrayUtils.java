package java_coding_questions;

public class ArrayUtils 
{
    // Method to find the maximum number in an array
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to find the minimum number in an array
    public static int findMin(int[] array)
    {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }

    // Main method to test the findMax and findMin methods
    public static void main(String[] args)
    {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        
        int max = findMax(array);
        int min = findMin(array);
        
        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nMaximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
        
    }
}


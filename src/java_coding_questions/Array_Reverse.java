package java_coding_questions;

public class Array_Reverse {

	public static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			// Swap the elements at start and end indices
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			// Move the pointers towards the center
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Original Array:");
		for (int i : array) {
			System.out.print(i + " ");
		}

		// Reverse the array
		reverseArray(array);

		System.out.println("\nReversed Array:");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}

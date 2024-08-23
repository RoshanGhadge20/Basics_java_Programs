package java_coding_questions;
public class Second_min_max_from_array {

	// Method to find the second maximum number in an array
	public static int findSecondMax(int[] array)
	{
		if (array == null || array.length < 2) 
		{
			throw new IllegalArgumentException("Array must contain at least two elements");
		}

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : array)
		{
			if (num > max) 
			{
				secondMax = max;
				max = num;
			} else if (num > secondMax && num < max)
			{
				secondMax = num;
			}
		}

		if (secondMax == Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException("Array does not contain enough distinct elements");
		}

		return secondMax;
	}

	// Method to find the second minimum number in an array
	public static int findSecondMin(int[] array)
	{
		if (array == null || array.length < 2) 
		{
			throw new IllegalArgumentException("Array must contain at least two elements");
		}

		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : array) 
		{
			if (num < min) 
			{
				secondMin = min;
				min = num;
			} else if (num < secondMin && num > min) 
			{
				secondMin = num;

			}
		}

		if (secondMin == Integer.MAX_VALUE) 
		{
			throw new IllegalArgumentException("Array does not contain enough distinct elements");
		}

		return secondMin;
	}

	// Main method to test the findSecondMax and findSecondMin methods
	public static void main(String[] args) 
	{
		int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};

		try {
			int secondMax = findSecondMax(array);
			int secondMin = findSecondMin(array);

			System.out.println("Array:");
			for (int num : array) 
			{
				System.out.print(num + " ");
			}

			System.out.println("\nSecond maximum number in the array: " + secondMax);
			System.out.println("Second minimum number in the array: " + secondMin);
		} catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

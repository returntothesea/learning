// Given five positive integers, find the minimum and maximum values that can be calculated by summing
// exactly four of the five integers. Then print the respective minimum and maximum values as a single line
// of two space-separated long integers.

import java.util.*;

public class MinMaxSum {

	public static void main(String[] args) {
		long arr[] = new long[5];							// Collect long integers in array

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextLong();
		}

		in.close();

		long min = addFirstFour(arr);						// Set the min and max equal to the sum of the first four
		long max = addFirstFour(arr);

		long n;

		for (int y = 0; y < 4; y++) {						// Do a circular rotation on the array and add the first four again
			circularRotation(arr);
			n = addFirstFour(arr);

			if (n > max)									// If the sum is greater than "max", max = the sum.
				max = n;
			if (n < min)									// If the sum is less than "min", min = the sum.
				min = n;
		}

		System.out.println(min + " " + max);

	}

	public static long addFirstFour(long[] a) {				// Method to add the first four numbers in the array
		long tempSum = 0;
		for (int x = 0; x < 4; x++) {
			tempSum += a[x];
		}
		return tempSum;
	}

	public static void circularRotation(long[] a) {			// Method to perform one circular rotation on the array
		long temp = a[4];

		System.arraycopy(a, 0, a, 1, 4);

		a[0] = temp;
	}

}

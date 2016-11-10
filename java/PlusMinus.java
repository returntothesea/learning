/* Given an array of integers, calculate which fraction
of its elements are positive, which fraction of its elements
are negative, and which fraction of its elements are zeroes,
respectively. Print the decimal value of each fraction
on a new line. */

// INPUT
// The first line contains an integer, N, denoting the size of the array
// The second line contains N space-separated integers describing an array of numbers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {
	public static void main(String[] args) {

		float positive = 0;
		float negative = 0;
		float zero = 0;

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i < n; i++) {
			arr[i] = in.nextInt();
			if (arr[i] > 0)
				positive += 1;
			else if(arr[i] < 0)
				negative += 1;
			else if(arr[i] == 0)
				zero += 1;
		}
		in.close();

		System.out.println(positive / n);
		System.out.println(negative / n);
		System.out.println(zero / n);
	}
}


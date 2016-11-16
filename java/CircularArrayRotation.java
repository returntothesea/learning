// John Watson performs an operation called a right circular rotation on
// an array of integers [a0, a1,...aN-1]. After performing one right circular
// rotation, the array is transformed into [aN-1, a0,...aN-2].

// Watson performs this operation k times. To test Sherlock's ability to identify
// the current element at a particular position in the rotated array, Watson asks q
// queries, where each query consists of a single integer, m, for which you must
// print the element at index m in the rotated array (the value of a[m]).

// Input Format:
// The first line contains three space-separated integers, n, k, and q.
// The second line contains n space-separated integers, where each integer i describes
// array element a[i].
// Each of the q subsequent lines contains a single integer denoting m.




import java.util.*;


public class CircularArrayRotation {

	public static void main(String[] args) {

       


		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int temp;

        // Circular rotation k times
        for (int i = 0; i < k; i++) {

            // Store the last index of a
            temp = a[n - 1];

            // Copy over a into itself but offset by one index
            System.arraycopy(a, 0, a, 1, n - 1);

            // First index of array = last index of former array
        	a[0] = temp;
        }

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();

            System.out.println(a[m]);
        }

        in.close();

	}

}
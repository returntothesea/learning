// Given a square matrix of size N x N, calculate the absolute difference
// between the sums of its diagonals.

// Input format:
// The first line contains a single integer, N. The next N lines denote the
// matrix's rows, with each line containing N space-separated integers
// describing the columns.

// Output format:
// Single integer. The absolute value of the difference of the sums of the
// diagonals of the matrix.



import java.util.*;


public class DiagonalDifference {

	public static void main(String[] args) {

		// Gather the matrix
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        in.close();

        // Running totals of the diagonal sums
        int primSum = 0;
        int secSum = 0;

        // Iterate through the matrix, adding to the sums as you go
        for (int i = 0; i < n; i++) {
        	primSum += a[i][i];
        	secSum += a[i][n - i - 1];
        }

        int dif = primSum - secSum;

        System.out.println(Math.abs(dif));



	}

}

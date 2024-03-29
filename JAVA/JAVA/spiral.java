package JAVA;

import java.io.*;

public class spiral {
    // Java program to print a given matrix in spiral form

    // Function print matrix in spiral form
    /**
     * @param m
     * @param n
     * @param a
     */
    static void spiralPrint(int m, int n, int a[][]) {
        int i, k = 0, l = 0;
        int m=matrix.length;
        int n=matrix[0].length;
        /*
         * k - starting row index
         * m - ending row index
         * l - starting column index
         * n - ending column index
         * i - iterator
         */
        if (m < 1) {
            return;
        }
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
             n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int R = 0;
        int C = 0;
        int a[][]=new int[R][C];

        // Function Call
        spiralPrint(R, C, a);
    }
}

// Contributed by Pramod Kumar

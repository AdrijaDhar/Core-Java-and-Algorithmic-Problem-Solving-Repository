package JAVA;

import java.util.Scanner;

public class merge {
    public static void sort(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int g = arr1.length + arr2.length;
        int arr3[] = new int[g];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];

            } else {
                arr3[k++] = arr2[j++];

            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        for (int l = 0; l < g; l++) {
            System.out.print(arr3[l] + " ");
        }

    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }

        sort(arr1, arr2);

    }

}

package JAVA;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = s.nextInt();
            }
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    System.out.print('-');
                } else {
                    System.out.print('+');
                }
            }
            System.out.println();
        }
    }
}
/*the above method is when the input is given as array not string input+-
 */
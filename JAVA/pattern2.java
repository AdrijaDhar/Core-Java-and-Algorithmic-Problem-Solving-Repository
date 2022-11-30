package JAVA;

import java.util.Scanner;

public class pattern2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int i = 1;
        /*
         * while (i <= n) {
         * int j = 1; // for inverted triangle j<=n-i+1,for mirror inverted pattern
         * while (j <= n - i + 1) {
         * System.out.print('*');
         * j++;
         * }
         * System.out.println();
         * i++;
         * }
         */
        /*
         * while(i<=n){
         * int spaces=1;
         * while(spaces<=n-i){
         * System.out.print(" ");
         * spaces++;
         * }
         * int stars=1;
         * while(stars<=i){
         * System.out.print(stars);
         * stars++;
         * }
         * System.out.println();
         * i++;
         * }
         */
        int spaces = n - 1;
        int j = 1;
        while (i <= n) {

            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            while (j <= i) {
                System.out.print('*');
                j++;
            }

            System.out.println();

            spaces--;

        }
        spaces = 0;
        while (i <= n) {

            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            while (j <= i) {
                System.out.print('*');
                j++;
            }

            System.out.println();

            spaces++;
            i++;
        }

    }
}

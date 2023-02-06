package JAVA;

import java.util.Scanner;

public class checkpermut {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = str1.length();
        int m = str2.length();
        int sum = 0;
        int diff = 0;
        if (n != m) {
            System.out.println("false");
        }

        for (int i = 0; i < n; i++) {
            diff = str2.charAt(i) - str1.charAt(i);
            sum = sum + diff;
        }

        if (sum != 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
    
}

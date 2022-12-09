package JAVA;

import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = n;
        int c=0;
        while (count != 0) {
            
            count = count / 10;
            
            c = c + 1;
        }
        
        count =n;
        double sum = 0;
        while (count > 0) {
            int rem = count % 10;

            sum = sum + Math.pow(rem, c);
            count = count / 10;

        }
      
        
        if (sum == n) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}

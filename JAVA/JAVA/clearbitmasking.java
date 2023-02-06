package JAVA;
import java.util.Scanner;
public class clearbitmasking {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n=s.nextInt();
            int pos=s.nextInt();
            int bitmask=1<<pos;
            int notbit=~bitmask;
            System.out.println(n&notbit);
        }

        
    }
}
/*
 * bitmask 1<<i
 * then perform not opearation of bitmask
 * then perform and opearaton of n and result of not opearation of bitmask
 * then we will get the ith bit of the n converted to 0.
 */
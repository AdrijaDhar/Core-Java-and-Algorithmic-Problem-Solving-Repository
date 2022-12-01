package JAVA;
import java.util.Scanner;
public class setbitmasking {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pos=s.nextInt();
        int bitmask=1<<pos;
        System.out.println((c));
    }
}
/*
 * bitmask : 1<<i
 * operation: OR operation between bitmask and n.
 * then print the value to see if the ith position is only converted to the 1 or not
 * set bit operation converts only ith bit into 1 keeping all other bits unchanged
 */
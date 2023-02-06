package JAVA;
import java.util.Scanner;
public class updatebitmasking {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pos=s.nextInt();
        int bitmask=1<<pos;
        int b=~bitmask;
        int intit=(n&b);
        System.out.println(intit);
        System.out.println(intit|bitmask);
    }
}

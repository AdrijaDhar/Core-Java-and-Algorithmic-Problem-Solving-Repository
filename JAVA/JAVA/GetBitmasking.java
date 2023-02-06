package JAVA;
import java.util.Scanner;


public class GetBitmasking {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pos=s.nextInt();
        int bitmask=1<<pos;
        if((bitmask&n)==0){
            System.out.println("The ith bit is"+" "+0);

        }else{
            System.out.println("The ith bit is"+" "+1);
        }
    }
}
/* 1. bitmask :1<<i  where i is the position of th bit to determine
 * 2.perform and operarion with given binary and the bitmask
 * 3, if and result is non zero then ith bit is one ,else the ith bit is zero.
 * getbit opearation determines whether ith bit is 0 or 1.
 */
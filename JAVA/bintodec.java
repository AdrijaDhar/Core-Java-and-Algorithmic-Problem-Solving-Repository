package JAVA;
import java.util.Scanner;
import java.lang.Math;
public class bintodec {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        double num=0;
        int i=0;
        while(n!=0){
            
            
            int rem=n%10;
            num=num+rem*(Math.pow(2,i));
            ++i;
            n=n/10;
        }
        System.out.println((int)(num));
    }
}

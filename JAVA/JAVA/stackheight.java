package JAVA;
import java.util.Scanner;
public class stackheight {
    public static int power(int x,int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpow1=power(x, n-1);
        int xpow=x*xpow1;
        return xpow;
    }
    public static int power1(int x,int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
       if(n%2==0){
        return power1(x, n/2)*power1(x, n/2);
       }else{
        return  power1(x, n/2)*power1(x, n/2)*x;
       }
    }
    public static void main(String args[]) {
        int x;
        int n;
        Scanner s=new Scanner(System.in);
		
        x=s.nextInt();
        n=s.nextInt();
        int l=power(x, n)       ;
        System.out.println(l);
        int m=power1(x, n)       ;
        System.out.println(m);
    }
}

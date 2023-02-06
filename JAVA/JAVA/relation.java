package JAVA;
import java.util.Scanner;

public class relation {
    public static void main(String[] args) {
        /*int x = 15;
        if(x <= 15){
            System.out.print("Inside if  ");
        }else if(x == 15){
            System.out.print("Inside else if  ");
        }
        System.out.println(x);
        */
        /*int a=50;
        int b=Integer.MIN_VALUE;
        if(a/0==b)
        {
    
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }
        */

        
        try (Scanner s = new Scanner(System.in)) {
            int n;
            n=s.nextInt();
            int div=2;
            boolean isPrime=true;
            while(div<=n-1){
                if(n%div==0){
                  isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("Prime");
            }else{
                System.out.println("composite");
            }
        }
        

    }
}

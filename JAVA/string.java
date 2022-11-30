package JAVA;
import java.util.Scanner;
public class string{
   
   /*public static void main (String[] args) {
    int i=0;
    while(i<10)
    {
        i=i+1;
        System.out.print(i);
        i=i+1;
    }
 }*/
 public static void main (String[] args) {
    try (/*int x=5;
        int y=5;
        while(x==y)
        {
            System.out.println("Hello");
            x++;
            y++;
        }\*/
    Scanner s = new Scanner(System.in)) {
        int n;
        n=s.nextInt();
        int div=2;
       // boolean isPrime=true;
        while(div<=n-1){
            if(n%div==0){
                System.out.println("composite"); 
              //isPrime=false;
              return;
            }
            div++;
        }
    }
        System.out.println("Prime");
        
}
}
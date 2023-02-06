package JAVA;
import java.util.Scanner;
public class scope {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Write your code here
        /*Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        */
        Scanner s=new Scanner(System.in);
         int x=s.nextInt();
         int n=s.nextInt();
         int power=x;
         for(int i=1;i<n;i++){
             power=power*x;
         }
         System.out.println(power);
        
        
    }
}

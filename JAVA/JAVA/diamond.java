package JAVA;
import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
           for(j=1;j<=n-i;j++){
                System.out.print(" ");
                
            }
            for(int l=1;l<=2*i-1;l++){
                System.out.print("*");

            }
            
            System.out.println();
            i++;
            
        }
        for(i=n;i>=1;i--){
            int j=1;
           for(j=1;j<=n-i;j++){
                System.out.print(" ");
                
            }
            for(int l=1;l<=2*i-1;l++){
                System.out.print("*");

            }
            
            System.out.println();
           
            
        }

    }
}

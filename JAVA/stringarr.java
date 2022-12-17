package JAVA;
import java.util.Scanner;
public class stringarr {
   
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=65;
        for(int i=0;i<n;i++){
            System.out.print((char)(c+i));
        }
    }
}

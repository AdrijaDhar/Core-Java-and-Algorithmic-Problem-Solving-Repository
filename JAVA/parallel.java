package JAVA;
import java.util.Scanner;
public class parallel {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++){
        int sp=1;
        while(sp<=i-1){
            System.out.print(" ");
            sp++;
        }
        int j=1;
        while(j<=n){
            System.out.print('*');
        j++;    
        }
        
        System.out.println();
    }
    }
    
}

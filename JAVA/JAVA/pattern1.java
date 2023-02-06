package JAVA;
import java.util.Scanner;
public class pattern1 {
    /**
     * @param args
     */
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
           // int p=i;
           char p=(char)('A'+i-1);
            int j=1;
            while(j<=i){
               // char jcol=(char)('A'+i-1);
                System.out.print(p);
                p=(char)(p+1);
                
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

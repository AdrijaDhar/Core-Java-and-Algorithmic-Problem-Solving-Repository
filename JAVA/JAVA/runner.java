package JAVA;
import java.util.Scanner;
public class runner {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        for(i=1;i<=n;i++){
            for(int j=n;j>=i+1;j--){
                System.out.print(j);
            }
            System.out.print('*');
            
            for(int k=i;k>=1;k--){
                int p=k-1;
                if(p==0){
                    break;
                }
                System.out.print(p);

            }
            System.out.println();
        }
        

    }
}
//number palindrome
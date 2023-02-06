package JAVA;
import java.util.Scanner;
public class halfdiamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int d=n/2+1;
        System.out.println('*');
       
        /*while(i<=d){
            int j=1;
            System.out.print('*');
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int k=j-2;
            while(k>=1){
                System.out.print(k);
                k--;
            }
            System.out.print('*');
            System.out.println();
            i++;
        }
        i=i-2;
        while(i>=1){
            int j=1;
            System.out.print('*');
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int k=j-2;
            while(k>=1){
                System.out.print(k);
                k--;
            }
            System.out.print('*');
            System.out.println();
            i--;
        }*/
        
      
       for( i=1;i<=n;i++){
        System.out.print('*');
        int j=1;
        for( j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=j-2;k>=1;k--){
            System.out.print(k);
        }
        System.out.print('*');
        System.out.println();
       }
       for(int l=n-1;l>=1;l--){
        System.out.print('*');
        int m=1;
        for( m=1;m<=l;m++){
            System.out.print(m);
        }
        for(int f=m-2;f>=1;f--){
            System.out.print(f);
        }
        System.out.print('*');
        System.out.println();
       }


      
        System.out.print('*');

    }
}

package JAVA;
import java.util.Scanner;
public class arrangenum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        int n=sp.nextInt();
        
        int arr[]=new int[n];
        
        int val=1;
       int s=0;
       int e=n-1;
       while(s<=e){
           arr[s]=val;
           val++;
           arr[e]=val;
           val++;
           s++;
           e--;
           if(s==e){
               val--;
           }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

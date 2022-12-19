package JAVA;
import java.util.Scanner;
public class pairprint {

   public static void pair(int[] array) {
    int n=array.length;
        for(int k=0;k<n-1;k++){
            for(int j=k+1;j<n;j++){
                System.out.println("("+array[k]+" ,"+array[j]+")");
            }
        }
        
   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        pair(arr);

    }
}

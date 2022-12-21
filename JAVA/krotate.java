package JAVA;
import java.util.Scanner;

public class krotate {

    public static void solution(int arr[],int x) {
       
        for(int i=1;i<=x;i++){
            int s=0;
            int e=arr.length-1;
            while(s<e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                e--;

            }
        }
        
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int x=s.nextInt();
        solution(arr,x);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

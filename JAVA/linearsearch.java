package JAVA;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);

        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.println(i);
                return;

            }
        }
        System.out.println("-1");
    }
}

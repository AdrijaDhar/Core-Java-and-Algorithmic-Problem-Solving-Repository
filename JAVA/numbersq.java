package JAVA;
import java.util.Scanner;
public class numbersq {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
        arr [i] = s.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<n-2;i++){
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                flag=false;
                break;
            }
        }
        System.out.println(flag);

    }
}

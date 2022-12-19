package JAVA;
import java.util.Scanner;
public class sort01 {
    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int s=0;
        int e=arr.length-1;
        
        int i = 1;
        int temp = 0;
        while (i < arr.length) {
            if (arr[i] == 0 && i > s) {
                temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
            } else if (arr[i] == 1 && i < e) {
                temp = arr[i];
                arr[i] = arr[e];
                arr[e] = temp;
                e--;
            } else
                i++;
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        sortZeroesAndOne(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

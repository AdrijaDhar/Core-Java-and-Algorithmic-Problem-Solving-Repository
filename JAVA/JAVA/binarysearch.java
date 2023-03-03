package JAVA;
import java.util.Scanner;

public class binarysearch {

    /**
     * @param arr
     * @param x
     * @return
     */
    public static int solution(int arr[],int x) {
        int s=0;
        int e=arr.length-1;
        int mid;
        int c=0;
        while(s<=e){
            mid=(s+e)/2;
            if(x>arr[mid]){
                s=mid+1;
            }else if(x<arr[mid]){
                e=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int Binarysearch(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int mid=(si+ei)/2;
         if(mid<x){
            return Binarysearch(a, mid+1, ei, x);
        }else{
            return Binarysearch(a, si, mid-1, x);
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
        int f;
        f=solution(arr,x);
        int g=Binarysearch(arr,0,n-1,x);

        System.out.println(f);
        System.out.println(g);
    }
}

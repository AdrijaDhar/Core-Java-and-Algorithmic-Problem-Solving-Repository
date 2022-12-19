package JAVA;

public class swapfunc {
     public static void swapAlternate(int arr[]) {
        //Your code goes here
        int n=arr.length;
        int temp;
        if(n%2==0){
            for (int i = 1; i <= n; i += 2) {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        else{
            for (int i = 1; i < n; i += 2) {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        for(int f=0;f<n;f++){
            System.out.println(arr[f]);
        }
    } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,6};
        swapAlternate(arr);
        
        

    }
}

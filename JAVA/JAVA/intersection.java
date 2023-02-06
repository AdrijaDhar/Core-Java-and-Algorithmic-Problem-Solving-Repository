package JAVA;

import java.util.*;
import java.util.Scanner;
class intersection{
    /*long approach */
    public static int[] intersect(int[] arr1, int[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]>arr2[j]) j++;
            else{
                arr1[k++]=arr1[i];
                ++i;++j;
            }
        }
        
        int ans[]=new int[k];
        for(i=0;i<k;i++){
            ans[i]=arr1[i];
        }
        return ans;    
    }
    /*a little better approach */
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
      
        
        int i=0,j=0;
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    
                    arr2[j]=Integer.MIN_VALUE;
                    break;

                }
            }
        }
        
        
           
    }
    
  public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }

    int[] ans=intersect(arr1,arr2);
    intersections(arr1,arr2);

        
    
    }
}

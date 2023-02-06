package JAVA;

public class sort012 {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
        int n=arr1.length;
        int m=arr2.length;
      
        int i = n - 1, j = m - 1;
     
        int carry = 0, s = 0;
     
       
         int k = Math.max(arr1.length, arr2.length);
        while(i >= 0 && j >= 0)
        {
           s = arr1[i] + arr2[j] + carry;
            output[k] = s % 10;
            carry = s / 10;
            i -= 1;
            j -= 1;
            k -= 1;
        } 
        
        while (i >= 0)
        {
           
            s = arr1[i] + carry;
            output[k] = (s % 10);
            carry = s / 10;
     
            i--;
            k--;
        }
        while(j >= 0)
        {
            int sum = arr2[j] + carry; output[k] = sum % 10;
            carry = sum / 10;
            j -= 1;
            k -= 1;
        }
        output[0] = carry;
     
       
        
     
    }
}

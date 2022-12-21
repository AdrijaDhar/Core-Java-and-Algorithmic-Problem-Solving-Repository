package JAVA;

public class checkrotation {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
     /*    int min = arr[0], min_index = 0,n=arr.length;
         if(n==1){
            return 0;

        }else{
 for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        
        return min_index;
        }
       */
      int check=0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i-1]<arr[i])
            {
                if (check==0){
                    check++;
                }
                check++;
            }
            else
            {
                break;
            }
        }
        if (check==arr.length)check=0;
        return check; 
    }

}

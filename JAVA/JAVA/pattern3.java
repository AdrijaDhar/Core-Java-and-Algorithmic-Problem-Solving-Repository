package JAVA;

import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 int i=1;
             int s=1;
			 while(i<=n){
				 int j=1;
				 while(j<=2*n+1){
					 if(s==i && s==j){
						 System.out.print('*');
						 s++;
					 }else if(j==n+1||j==2*n+2-i){
						 System.out.print('*');
					 }else{
						 System.out.print("0");
					 }
					 
					 j++;
                     
				 }
                 System.out.println();
                 i++;
			 }
		
	}	


}


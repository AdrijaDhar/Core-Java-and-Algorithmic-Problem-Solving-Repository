package JAVA;



import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		if(n==0){
			System.out.print(0);
			return;
		}
      int rev=0;
		while(n>0){
			
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	System.out.println(rev);

	}
}




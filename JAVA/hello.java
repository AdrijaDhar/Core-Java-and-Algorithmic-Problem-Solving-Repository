package JAVA;
import java.util.Scanner;
public class hello {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	Scanner s = new Scanner(System.in)) {
		String str=s.next();
		char ch=str.charAt(0);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int avg=(a+b+c)/3;
		System.out.println(ch);
		System.out.println(avg);
	}
	System.out.println('a' + 1);
		
	}



}
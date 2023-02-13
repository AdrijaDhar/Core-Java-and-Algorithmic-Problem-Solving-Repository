package JAVA;
import java.util.Scanner;
public class Search {
    public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0){
			return false;
		}
		if(input[0]==x){
			return true;
		}
		int[] smallArr=new int[input.length-1];
		for(int i=1;i<input.length;i++){
			smallArr[i-1]=input[i];
		}
		boolean found=checkNumber(smallArr, x);
		return found;
	}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(Search.checkNumber(input, x));
	}
}

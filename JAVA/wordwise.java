package JAVA;

import java.util.Scanner;
import java.util.StringTokenizer;


public class wordwise {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       /* method 1
        if(str==null || str.isEmpty()){
            System.out.print(str);
            return;

        }
        StringTokenizer tokens=new StringTokenizer(str) ;
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        System.out.print(str1);
        whole reverese
        */
        /*second method
         * int lastIndex = 0;
		String ans = "";
		int i = 0;
		for (; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				int currIndex = i;
				String rev = "";
				for (int j = currIndex; j >= lastIndex; j--) {
					rev = input.charAt(j) + rev;
				}
				ans = rev + ans;
				lastIndex = i + 1;
			}
		}

		int currIndex = i;
		String rev = "";
		for (int j = currIndex - 1; j >= lastIndex; j--) {
			rev = input.charAt(j) + rev;

		}
		rev = rev + " ";
		ans = rev + ans;

		return ans;
        word reverse
         */
    }
}

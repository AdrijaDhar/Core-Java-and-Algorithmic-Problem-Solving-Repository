package JAVA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class consequentelement {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		
		
		/*if (str.length() < 2) {
            return str;
        }
		if(str.charAt(0)==str.charAt(1)){
			return removeConsecutiveDuplicates( str.substring(1));
		}else{
			return (str.charAt(0)+removeConsecutiveDuplicates( str.substring(1)));
		}
		*/
		String str1="";
		int i=0;
		char curr=str.charAt(0);
		str1+=curr;
		while(i<str.length()){
			if(curr!=str.charAt(i)){
				curr=str.charAt(i);
				str1+=curr;
			}
			i++;
		}
		return str1;
	}
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = consequentelement.removeConsecutiveDuplicates(str);

		System.out.println(ans);
		
	}
}

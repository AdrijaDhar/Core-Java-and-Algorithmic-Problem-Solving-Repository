package JAVA;

import java.util.*;
public class highestoccur {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);
		String s = new String(tempArray);
		int n = s.length();
		int max_count = 0;
		int count = 1;
		char ans = '-';
		for (int i = 1; i <= n; i++) {
			if ((i == n) || (s.charAt(i) != s.charAt(i - 1))) {
				if (max_count < count) {
					max_count = count;
					ans = s.charAt(i - 1);
				}
				count = 1;
			} else {
				count++;
			}
		}
	return ans;
	}

}

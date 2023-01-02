package JAVA;

import java.util.Scanner;

public class eachrev {
    /**
     * @param args
     */
    /*
     * public static void main(String[] args) {
     * Scanner s = new Scanner(System.in);
     * String str = s.nextLine();
     * 
     * String ans = "";
     * int curr = 0;
     * int i = 0;
     * String reverse = "";
     * for (i = 0; i < str.length(); i++) {
     * 
     * if (str.charAt(i) == ' ') {
     * int currend = i - 1;
     * 
     * for (int j = curr; j <= currend; j++) {
     * reverse += str.charAt(j);
     * }
     * ans += reverse + " ";
     * curr = i + 1;
     * }
     * 
     * 
     * }
     * int currend = i - 1;
     * 
     * for (int j = curr; j <= currend; j++) {
     * reverse += str.charAt(j);
     * }
     * ans += reverse;
     * System.out.println(ans);
     * }
     */
    public static String reverseEachWord(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                // Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                // Add it final String(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }

    public static void main(String args[]) {
        String str = "abc def ghi jkl";
        System.out.println(reverseEachWord(str));
    }

}

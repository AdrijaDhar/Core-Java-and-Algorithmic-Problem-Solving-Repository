
package JAVA;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    // Write your code here
    Scanner s = new Scanner(System.in);
    int n;
    n = s.nextInt();
    int i = 1;
    while (i <= n) {
      int j = 1;
      while (j <= n - i) {
        System.out.print(" ");
        j++;
      }
      int k = 1;
      int p = i;
      for (k = 1; k <= i; k++) {
        System.out.print(p);
        p++;
      }
      j = 1;
      p = 2 * i - 2;
      while (j <= i - 1) {
        System.out.print(p);
        p--;
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
package JAVA;

import java.util.Scanner;
import java.util.StringTokenizer;
import Bank;
public class codeforcesk {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /*
         * String a="coding",b="ninjas";
         * if(a.contains("ing"))
         * {
         * a+=b;
         * }
         * else
         * {
         * b+="ing";
         * }
         * System.out.print(b+a);
         * }
         * 
         */
        
        String str=s.nextLine();
        if(str==null|| str.isEmpty()){
            System.out.println("0");
        }
        StringTokenizer tokens=new StringTokenizer(str);
        System.out.println(tokens.countTokens());

    }
}

package JAVA;
import java.util.Scanner;
public class bitwiseop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int n=s.nextInt();
        /*the &(AND) bitwise operator
         *     1   1   1
         *     1   0   0
         *     0   1   0
         *     0   0   0
         */
        System.out.println(a&b);
        /*the |(OR) bitwise operator
         *     1   1   1
         *     1   0   1
         *     0   1   1
         *     0   0   0
         */
        System.out.println(a|b);
        /*the ^(XOR) bitwise operator
         *     1   1   0
         *     1   0   1
         *     0   1   1
         *     0   0   0
         */
        System.out.println(a^b);
        System.out.println(~((a&b)+(a|b)+(a^b)));
        /*left shift operators
         * a>>n => a*pow(2,n),it means a is multiplied with 2 raise to the power n 
         * where n is the value which shifts the bits by n positions
         */
        
        System.out.println(a<<n);
        /*right shift operators
         * a<<n => a/pow(2,n),it means a is divided by 2 raise to the power n
         * where n is the input by which bits are shifted n positions
         */
        System.out.println(a>>n);
        
       int f = ~a;
       System.out.println(a + " " + f);
    }
}

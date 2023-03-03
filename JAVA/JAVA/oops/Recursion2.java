package JAVA.oops;
import java.util.Scanner;
public class Recursion2{
    /**
     * @param s
     * @param a
     * @param b
     * @return
     */
    public static String replace(String s,char a,char b){
        if(s.length()==0){
            return s;
        }
        String smalloutput=replace(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+smalloutput;
        }else{
            return s.charAt(0)+smalloutput;
        }
    }
    public static String replacePi(String s) {
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p'&& s.charAt(1)=='i'){
            String smallOutput=replacePi(s.substring(2,s.length()-1));
            return "3.14"+smallOutput;
        }else{
            String smallOutput=replacePi(s.substring(1,s.length()-1));
            return s.charAt(0)+smallOutput; 
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char a=s.next().charAt(0);
        char b=s.next().charAt(0);
        String str1=replace(str,a, b);
        String str2=replacePi(str);
        System.out.println(str1);
        System.out.println(str2);

    }
    
}
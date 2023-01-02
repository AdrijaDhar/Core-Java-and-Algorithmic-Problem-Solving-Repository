package JAVA;
import java.util.Scanner;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str==null||str.isEmpty()){
            System.out.println("True");
        }
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        
        System.out.println(str.equals(str1));
        
    }
}

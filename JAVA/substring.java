package JAVA;
import java.util.Scanner;
public class substring {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int s=0;
        int e=0;
        while(s<=str.length()){
            e=s;
            while(e<=str.length()){
                System.out.print(str.substring(s, e)+"\n");
                e++;
            }
            
            s++;
        }
        

        

    }
}

package JAVA.oops;
import java.util.Scanner;
public class allprime {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        for(i=2;i<=n;i++){
			int prime=1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					prime=0;
					break;
				}
			}
			if(prime==1){
				System.out.println(i);
			}
		}
    }
}

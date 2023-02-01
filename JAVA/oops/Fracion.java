package JAVA.oops;
import java.util.Scanner;
import java.lang.Math;
class FractionUse{
    private int numerator;
    private int denominator;
    public FractionUse(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        Simplify();
    }
    private void Simplify(){
        int gcd=1;
        int smaller=Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0&& denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;

    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void increment(){
        numerator=numerator+denominator;
        Simplify();
    }
}
public class Fracion {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        FractionUse f1=new FractionUse(n,m);
        f1.print();
        f1.increment();
        
         int n1=s.nextInt();
         int m1=s.nextInt();
        FractionUse f2=new FractionUse(n1,m1);
        f2.print();

    }
}

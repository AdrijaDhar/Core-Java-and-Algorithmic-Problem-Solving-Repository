package JAVA;
public class Recursion {
    public static int Factorial(int n) {
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        int small=Factorial(n-1);
        int fact=n*small;
        return fact;
    }
    public static int Sum(int n){
        if(n<=0){
            return 0;
        }
        int sum=Sum(n-1);
        int totSum=n+sum;
        return totSum;
    }
    public static void main(String[] args){
        System.out.println(Factorial(6));
        System.out.println(Sum(6));
    }
}

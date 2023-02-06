package JAVA.oops;

import java.util.Scanner;
import java.lang.Math;

public class Fraction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        FractionUse f1 = new FractionUse(n, m);
        f1.print();
        f1.increment();

        int n1 = s.nextInt();
        int m1 = s.nextInt();
        FractionUse f2 = new FractionUse(n1, m1);
        f2.print();

        FractionUse f3 = FractionUse.add(f1, f2);
        f3.print();

    }
}

class FractionUse {
    public static FractionUse add(FractionUse f1, FractionUse f2) {
        int newnum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDeno = f1.denominator + f2.denominator;
        FractionUse f3 = new FractionUse(newnum, newDeno);
        return f3;
    }

    private int numerator;

    private int denominator;

    public FractionUse(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        Simplify();
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void increment() {
        numerator = numerator + denominator;
        Simplify();
    }

    private void Simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;

    }
}

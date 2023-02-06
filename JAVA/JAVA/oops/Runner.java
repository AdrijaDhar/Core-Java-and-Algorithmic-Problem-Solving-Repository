package JAVA.oops;

import java.util.Scanner;

class ComplexNumbers {
	// Complete this class
	 private int real;
    private int imaginary;

    public  ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
	public int getImag() {
		return imaginary;
	}
	
	public int getReal() {
		return real;
	}
	
	public void setImag(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void setReal(int real) {
		this.real = real;
	}

    

    public  void plus(ComplexNumbers c2) {
       int real=this.real + c2.real;
		int imag=this.imaginary+c2.imaginary;
		this.real=real;
		this.imaginary=imag;
		

    }
	public void multiply(ComplexNumbers c2){
		int real = this.real * c2.real - this.imaginary * c2.imaginary;
		int imaginary = this.real * c2.imaginary + c2.real * this.imaginary;
		this.real = real;
		this.imaginary= imaginary;
	}
	public static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2){
		 int real=c1.real + c2.real;
		int imaginary=c1.imaginary+c2.imaginary;
		ComplexNumbers c3=new ComplexNumbers(real, imaginary);
		return c3;
	}
	public static ComplexNumbers multiply(ComplexNumbers c1,ComplexNumbers c2){
		int real = c1.real * c2.real - c1.imaginary * c2.imaginary;
		int imaginary = c1.real * c2.imaginary + c2.real * c1.imaginary;
		ComplexNumbers c4 = new ComplexNumbers(real, imaginary);
		return c4;
	}
	
	public void print() {
		System.out.println(this.real + " + i" + this.imaginary);
	}
	
}
public class Runner{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }
    }
}

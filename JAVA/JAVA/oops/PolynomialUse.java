package JAVA.oops;

import java.util.Scanner;

/* 
class Polynomial {
		private int[] coeff;
		private int degree;
		public Polynomial(){
			coeff=new int[5];
			degree=-1;
		}
	
	 * This function sets coefficient for a particular degree value, if degree is
	 * not there in the polynomial
	 * then corresponding term with specified degree and value is added int the
	 * polynomial. If the degree
	 * is already present in the polynomial then previous coefficient is replaced by
	 * new coefficient value passed as function argument
	 
	public void setCoefficient(int degree, int coefficient) {
			if(degree>=coeff.length){
				restructure(degree);
			}
			coeff[degree]=coefficient;
			if(degree>=this.degree){
				this.degree=degree;
			}
			
	}
	private void restructure(int degree){
		int[] temp=coeff;
		coeff=new int[degree+1];
		for(int i=0;i<temp.length;i++){
			coeff[i]=temp[i];
		}
	}
	// Prints all the terms(only terms with non zero coefficients are to be printed)
	// in increasing order of degree.
	public void print() {
		for(int i=0;i<coeff.length;i++){
			if(coeff[i]!=0){
				System.out.print( coeff[i]  +"x"+ i +" ");
			}
		}

	}

	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p) {
		Polynomial p1=new Polynomial();
		int i=0,j=0,k=0;
		while(i<p.coeff.length&&j<this.coeff.length){
			p1.setCoefficient(k, p.coeff[i]+this.coeff[i]);
			i++;
			j++;
			k++;

		}
		while(i<p.coeff.length){
			p1.setCoefficient(k, p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			p1.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}
		return p1;
	}

	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p) {
		Polynomial p2=new Polynomial();

		int i=0,j=0,k=0;
		while(i < p.coeff.length && j < this.coeff.length) {
			p2.setCoefficient(k,  this.coeff[i] - p.coeff[i] );
			i++;
			j++;
			k++;
		}
		while(i<p.coeff.length) {
			p2.setCoefficient(k, -p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			p2.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}


		return p2;

	}

	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p) {
		Polynomial p3=new Polynomial();

		int i=0,j=0,k=0;
		while(i < p.coeff.length && j < this.coeff.length) {
			p3.setCoefficient(k,  this.coeff[i] - p.coeff[i] );
			i++;
			j++;
			k++;
		}
		while(i<p.coeff.length) {
			p3.setCoefficient(k, -p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			p3.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}


		return p3;

	}

}
*/
class Polynomial {
	/*
	 * This function sets coefficient for a particular degree value, if degree is
	 * not there in the polynomial
	 * then corresponding term(with specified degree and value is added int the
	 * polynomial. If the degree
	 * is already present in the polynomial then previous coefficient is replaced by
	 * new coefficient value passed as function argument
	 */
	private int[] poly;
	private int maxDegree;

	public Polynomial() {
		poly = new int[10];
		maxDegree = 0;
	}

	public Polynomial(int degree) {
		poly = new int[degree];
		maxDegree = degree - 1;
	}

	public void setCoefficient(int degree, int coeff) {

		while (degree > poly.length - 1) {
			doubleCapacity();
		}
		if (maxDegree < degree) {
			maxDegree = degree;
		}
		poly[degree] = coeff;

	}

	// Prints all the terms(only terms with non zero coefficients are to be printed)
	// in increasing order of degree.
	public void print() {
		for (int i = 0; i <= maxDegree; i++) {
			if (poly[i] != 0) {
				System.out.print(poly[i] + "x" + i + " ");
			}
		}

	}

	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p) {

		int degree1 = this.maxDegree;
		int degree2 = p.maxDegree;
		int limit;
		if (degree1 > degree2) {
			limit = degree1;
		} else {
			limit = degree2;
		}

		Polynomial polysum = new Polynomial(limit + 1);

		for (int i = 0; i <= limit; i++) {
			int sum = 0;
			if (i <= degree1) {
				sum = sum + (this.poly[i]);
			}
			if (i <= degree2) {
				sum = sum + (p.poly[i]);
			}
			polysum.setCoefficient(i, sum);
		}

		return polysum;

	}

	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p) {

		int degree1 = this.maxDegree;
		int degree2 = p.maxDegree;
		int limit;
		if (degree1 > degree2) {
			limit = degree1;
		} else {
			limit = degree2;
		}

		Polynomial polydiff = new Polynomial(limit + 1);

		for (int i = 0; i <= limit; i++) {
			int diff = 0;
			if (i <= degree1) {
				diff = diff + (this.poly[i]);
			}
			if (i <= degree2) {
				diff = diff - (p.poly[i]);
			}
			polydiff.setCoefficient(i, diff);
		}

		return polydiff;

	}

	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p) {

		int limit = this.maxDegree + p.maxDegree;
		Polynomial polymul = new Polynomial(limit + 1);

		for (int i = 0; i <= this.maxDegree; i++) {
			int product = 0;
			for (int j = 0; j <= p.maxDegree; j++) {
				product = polymul.poly[i + j];
				product = product + (this.poly[i] * p.poly[j]);
				polymul.setCoefficient(i + j, product);
			}

		}

		return polymul;

	}

	private void doubleCapacity() {
		int[] temp = poly;
		poly = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			poly[i] = temp[i];
		}
	}

}

public class PolynomialUse {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for (int i = 0; i < n; i++) {
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for (int i = 0; i < n; i++) {
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for (int i = 0; i < n; i++) {
			first.setCoefficient(degree1[i], coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for (int i = 0; i < n; i++) {
			degree2[i] = s.nextInt();
		}
		int coeff2[] = new int[n];
		for (int i = 0; i < n; i++) {
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for (int i = 0; i < n; i++) {
			second.setCoefficient(degree2[i], coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch (choice) {
			// Add
			case 1:
				result = first.add(second);
				result.print();
				break;
			// Subtract
			case 2:
				result = first.subtract(second);
				result.print();
				break;
			// Multiply
			case 3:
				result = first.multiply(second);
				result.print();
				break;
		}

	}
}

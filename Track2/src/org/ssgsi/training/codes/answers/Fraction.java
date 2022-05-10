package org.ssgsi.training.codes.answers;

public class Fraction {
	//public SampleArrays sample = new SampleArrays();
	
	public static long id = 90L;
	
	public int numerator;
	public int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void toFractionString() {
		//Overflow over = new Overflow();
		System.out.println(numerator + "/" + denominator);
	}
	
	public Fraction add(Fraction summand) {
		String result = numerator + "'" + denominator;
		Fraction f = new Fraction();
		
		f.numerator = numerator * summand.denominator + summand.numerator * denominator;
		f.denominator = denominator * summand.numerator;
		
		return f;
	}
	
//	public Fraction multiply(Fraction factor) {
//		String result = numerator + "'" + denominator;
//		Fraction f = new Fraction();
//		
//		f.numerator = numerator * summand.denominator + summand.numerator * denominator;
//		f.denominator = denominator * summand.numerator;
//		
//		return f;
//	}
}

package org.ssglobal.training.codes.operators;

public class TestMathOps {

	public static void main(String[] args) {
		MathOps mo = new MathOps();
		// Testing divide()
		System.out.println(mo.divide(10, 3));
		// Testing callRemainder()
		System.out.println(mo.calRemainder(10, 3));
		// Resting divideNum()
		System.out.println(mo.divideNum(10, 3));
		// Testing divideNumParams()
		System.out.println(mo.divideNumParams(10, 3));
		// Testing divideNumCustom()
		System.out.println(mo.divideNumParams(10, 3));
	}

}

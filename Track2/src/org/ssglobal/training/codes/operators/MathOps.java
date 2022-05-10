package org.ssglobal.training.codes.operators;

public class MathOps {

	public int divide(final int x, final int y) {
		return x / y;
	}
	
	public int calRemainder (final int x, final int y) {
		return x % y;
	}
	
	public double divideNum(final int x, final int y) {
		double xdbl = (double) x;
		double ydbl = (double) y;
		return xdbl / ydbl;
	}
	
	public double divideNumParams(final double x, final double y) {
		return x / y;
		
	}
	
	public double divideNumCustom(final int x, final int y) {
		double q = 1.0 * x / y;
		return q;
	}
}

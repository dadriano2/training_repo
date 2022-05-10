package org.ssglobal.training.codes.declaration;

public class TestNumDiff {
	public static void main(String[] param) {
		String num = param[0];
		int numVal = Integer.parseInt(num);
		
		NumDiff diff = new NumDiff(); // constructor
		int result = diff.calculateNumDiff(numVal);
		System.out.println(result);
		
	}
}

package org.ssgsi.training.codes.answers;

public class TestCompareVariables {
	
	public static void main(String[] param) {
		CompareVariables cv = new CompareVariables();
		// Primitive VAr
		int testX = 10;
		
		System.out.format("This is the original num: %d.\n", testX);
		cv.comparePrimitive(testX);
		
		// Reference Var
		StringBuilder sb = new StringBuilder("Manila");
		System.out.println(sb.getClass());
	}
}

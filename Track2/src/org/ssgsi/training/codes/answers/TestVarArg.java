package org.ssgsi.training.codes.answers;

import javax.print.attribute.IntegerSyntax;

public class TestVarArg {

	public static void main(String[] params) {
		VarArg var = new VarArg();
		
		var.printNums(1, 2, 3);
		var.printNums();
		var.printNums(10, 11, 12, 13, 14, 15);
		
		int[] array = new int[10];
	}
}

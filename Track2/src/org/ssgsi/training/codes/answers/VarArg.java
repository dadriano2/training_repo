package org.ssgsi.training.codes.answers;

public class VarArg {

	public void printNums(int... nums) {
		for (int lookup : nums) {
			System.out.println(lookup);
		}
	}
}

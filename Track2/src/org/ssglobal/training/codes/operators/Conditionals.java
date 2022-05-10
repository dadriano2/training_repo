package org.ssglobal.training.codes.operators;

public class Conditionals {
	
	public void createCondition() {
		float amount1 = 100.2F;
		float amount2 = 56.5F;
		boolean ce1 = amount1 == amount2 - 5;
		
		if (ce1) {
			System.out.println("amount1 is equal to amount2");
		} else {
			System.out.println("amount2 is equal to amount1");
		}
		
		char test1 = 'a';
		char test2 = 'b';
		boolean ce2 = test1 > test2; // test1 should come after test2
		if(ce2) {
			System.out.println("test1 comes after test2");
		} else {
			System.out.println("test1 comes before test2");
		
		// <, >=, <=, != (for primitive only)
		}
	}
	
	public void createComplexCondition() {
		byte data = 10; // within 50 and 100
		boolean le1 = data >= 50 && data <= 100; //bitwise-AND - derived from typical truth table

		if (le1) {
			System.out.println("within the range");
		} else {
			System.out.println("invalid data");
		}
		
		// Problem: sickLeave (boolean) rednerOT (boolean)
		char sickLeave = 'S'; //S-sickLeave, V-vacation leave, X-No leave
		char withOT = 'N'; // Y-OT, N-no OT
		int approval = 0;
		boolean le2 = sickLeave == 'S' | withOT++ == 'Y' | approval++ < -1;
		System.out.println(withOT);
		System.out.println(approval);
		System.out.println(le2);
		
		// bitwise OR |
		// short-circuit OR ||
		// bitwise AND &
		// short-circuit &&
		// not - !
	}
	
	public void createTernary() {
		int choice = 15;
		// [0 - 10] -> RED 
		// [10 - 20] -> BLUE
		// [20 - 30] -> GREEN
		// OTHERWISE -> COLORLESS
		
		String color = (choice >= 0 & choice <= 10) ? "RED" : 
					   (choice >= 10 & choice <= 20) ? "BLUE" : 
					   (choice >= 20 & choice <= 30) ? "GREEN" : "COLORLESS";
		
		System.out.println(color);
	}
	
	public void applyShiftOps() {
		// << left shift ops
		
		int counter = 1;
		int se1 = counter << 2;
		
		// 1 = 	0001
		// 2 = 	0010
		// 4 = 	0010
		// 8 = 	1000
		// 16 = 0001 0000
		// 32 = 0010 0000
		
		System.out.println(se1);
		
		counter = se1;
		
		// >> right shift op
		int se2 = counter >> 5;
		
		// 16 - 32 / 2^5 = 01 0000
		//  8 - 32 / 2^4 = 00 1000
		//	4 - 32 / 2^3 = 00 0100
		//	2 - 32 / 2^2 = 00 0010
		//	1 - 32 / 2^1 = 00 0001
		
		System.out.println(se2);
	}
}








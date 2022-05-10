package org.ssgsi.training.codes.modifiers;

public class TestStaticMembers extends FinalMembers{

	public static void main(String[] args) {
		
		StaticMembers sm1 = new StaticMembers();
		StaticMembers sm2 = new StaticMembers();
		StaticMembers sm3 = new StaticMembers();
		
		sm1.e = 3.17;
		System.out.println(sm1.e);
		sm2.e = 4.17;
		System.out.println(sm2.e);
		sm3.e = 5.17;
		System.out.println(sm3.e);
		
		sm1.pie = 4.141717;
		System.out.println(StaticMembers.pie);
		System.out.println(StaticMembers.pie);
		System.out.println(sm3.pie);
		
		// instance methods
		sm1.isZero(0);
		sm2.isZero(100);
		sm3.isZero(-1);
		
//		sm1.isEven(0);
//		sm2.isEven(100);
//		sm3.isEven(-1);
	}

}

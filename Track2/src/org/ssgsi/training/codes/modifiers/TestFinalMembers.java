package org.ssgsi.training.codes.modifiers;

public class TestFinalMembers extends FinalMembers {
	
	public static void main(String...strings) {
		FinalMembers fm = new FinalMembers();
		System.out.println(fm.PIE);
		
		fm.accessWithoutOverride(strings);
		fm.accessPoint();
		
	}
	
	
	public void accessPoint() {
	
		
		accessWithoutOverride();
	}
	
}

package org.ssgsi.training.codes.answers;

import org.ssgsi.training.codes.modifiers.ClassMembers;

public class TestClassMembers extends ClassMembers{
	
	public static void main(String[] args) {
	
		ClassMembers cm = new ClassMembers();
		cm.id = 4L;
		cm.showData();
		
	}
	
	public void accessPoint() {
		key = 8000;
		authenticate();
	}
}
	

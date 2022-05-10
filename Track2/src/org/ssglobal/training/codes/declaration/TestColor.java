package org.ssglobal.training.codes.declaration;

public class TestColor {

	public static void main(String[] args) {
		
		String color = args[0];
		int colorNum = Integer.parseInt(color);
		
		Color c = new Color();
		c.guessColor(colorNum);
		

	}

}


class Color {
	
	public void guessColor(int color) {
		
		if (color > 0 & color <= 10) {
			System.out.println("Blue");
		}else if (color > 10 & color <= 20) {
			System.out.println("Red");
		}else if (color > 20 & color <= 30) {
			System.out.println("Green");
		}else {
			System.out.println("Apple");
		}
	}
	
}
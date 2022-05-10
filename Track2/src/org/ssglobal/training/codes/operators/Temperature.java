package org.ssglobal.training.codes.operators;


public class Temperature {
	
	public float chooseTemperature (int option) {
		
		float temperature = 0.0F;
		if (option == 0) {
			temperature = 50.0F;
		} else if (option == 1) {
			temperature = 60.0F;
		} else if (option == 2) {
			temperature = 70.0F;
		} else if (option == 3) {
			temperature = 70.0F;
		} 
		
		return temperature;
	}
	
	public float chooseTemeperatureSwitch(int option) {
		float temperature = 0.0f;
		
		switch (option) {
			case 0:
				temperature = 00.0F;
				break;
			case 1:
				temperature = 50.0F;
				break;
			case 2:
				temperature = 60.0F;
				break;
			case 3:
				temperature = 70.0F;
				break;
			default:
				break;					
		}
		
		return temperature;
	}
	
	public String chooseColor(int option) {
		String color = "";
		
		switch (option) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				color = "RED";
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				color = "BLUE";
				break;
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
				color = "GREEN";
				break;
			default:
				color = "COLORLESS";
				
		}
		
		
		return color;
	}
}

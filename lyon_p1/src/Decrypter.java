/*
 * 
 * Takes input from application
 * Reverses the encryption math
 * Adds leading numbers if less than 999, 99, or 9
 * 
 */

public class Decrypter {
	
	
public static class decrypt {



public static String readUserInput(int fourDigit) {
	
	int digitOne;
	int digitTwo;
	int digitThree;
	int digitFour;
	int decryptNum;
	String decryptString;

	digitOne = (fourDigit/1000+3)%10;
	digitTwo = (fourDigit%1000/100+3)%10;
	digitThree = (fourDigit%100/10+3)%10;
	digitFour = (fourDigit%10+3)%10;

	decryptNum = digitOne*10+digitTwo+digitThree*1000+digitFour*100;

	if (9 >= decryptNum) {
		decryptString = String.format("%04d", decryptNum);
		return decryptString;
	}
	else if (99 >= decryptNum) {
		decryptString = String.format("%04d", decryptNum);
		return decryptString;
	}
	else if (999 >= decryptNum) {
		decryptString = String.format("%04d", decryptNum);
		return decryptString;
	}
	else {
		decryptString = ""+decryptNum;
		return decryptString;
	}
	

}
			
			
}
			
			
			
			
			
			
			
			
}


/*
 * 
 * Takes in user input from application 
 * Encrypts the information
 * Adds leading numbers if less than 999, 99, 9
 * 
 */

public class Encrypter {
//take four digit int from application
//add 7 to each individual digit
//get remainder after dividing each digit by 10
//swap first digit with third
//swap second digit with fourth

public static class encrypt {



public static String readUserInput(int fourDigit) {
	int digitOne;
	int digitTwo;
	int digitThree;
	int digitFour;
	int encryptNum;
	String encryptString;
	
	
	digitOne = (fourDigit/1000+7)%10;
	digitTwo = (fourDigit%1000/100+7)%10;
	digitThree = (fourDigit%100/10+7)%10;
	digitFour = (fourDigit%10+7)%10;

	encryptNum = digitOne*10+digitTwo+digitThree*1000+digitFour*100;
	
	if (9 >= encryptNum) {
		encryptString = String.format("%04d", encryptNum);
		return encryptString;
	}
	else if (99 >= encryptNum) {
		encryptString = String.format("%04d", encryptNum);
		return encryptString;
	}
	else if (999 >= encryptNum) {
		encryptString = String.format("%04d", encryptNum);
		return encryptString;
	}
	else {
		encryptString = ""+encryptNum;
		return encryptString;
	}


	
}
	
	
}
	
	
	
	
	
	
	
	
	
}

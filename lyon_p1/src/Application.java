/*
 * 
 * Takes in input on whether to encrypt or decrypt
 * User enters in number
 * Program prints out the number in standard output
 * 
 */
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select an option:\n1 for encrypt\n2 for decrypt");
		int num = input.nextInt();
		
		if (num == 1) {
		System.out.println("Enter your 4 digit number to encrypt: ");
		int fourDigit = input.nextInt();
		System.out.println("Your encrypted number is: "+ Encrypter.encrypt.readUserInput(fourDigit));
		}
		
		else if (num == 2)
		{
		System.out.println("Enter your 4 digit number to decrypt: ");
		int fourDigit = input.nextInt();
		System.out.println("Your decrypted number is: "+ Decrypter.decrypt.readUserInput(fourDigit));
		}
		else {
		System.out.println("Enter a valid value.");
		main(args);
		}
		
		input.close();
	}
	

}

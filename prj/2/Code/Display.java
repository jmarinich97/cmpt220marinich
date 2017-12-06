package finalProject;

import java.io.File;

import java.util.Scanner;

public class Display {
	
	// Check to make sure the offset value is a positive integer
	public static boolean validateOffset(String offset) {
		boolean isValid = true;
		offset = offset.toLowerCase();
		if (offset.length() > 0) {
			for (char ch : offset.toCharArray()) {
				if (Character.isDigit(ch)) {
					continue;
				}
				else {
					isValid = false;
					break;
				}	
			}
		}
		else {
			isValid = false;
		}
		return isValid;
	}
	
	// Check to make the the user enters either <e> or <d> when asked to encrypt/decrypt (not case sensitive)
	public static boolean validateEnOrDec(String enOrDec) {
		enOrDec = enOrDec.toLowerCase();
		boolean isValid = false;
		if (enOrDec.length() == 1) {
			char enOrDecChar = enOrDec.charAt(0);
			if (enOrDecChar == 'e' || enOrDecChar == 'd') {
				isValid = true;
			}
		}
		return isValid;
	}
	
	// Check to make sure the file name entered contains no spaces and is a text file
	public static boolean validateFileName(String fileName) {
		return fileName.endsWith(".txt") && !fileName.contains(" ");
	}
	
	// Prompt the user to enter the name of the text file that they want to cipher
	public static String promptForFileName() {
		Scanner input = new Scanner(System.in);
		String fileLoc = "";
		File file;
		String path = "/Users/joemarinich/Documents/workspace/Project/src/finalProject/";
					   
		do{
			System.out.println("Enter the text file:  ");
			fileLoc = path + input.nextLine();
			if (!(validateFileName(fileLoc))) {
				System.out.println("Error. Please enter a text file in the valid format.");
			}
			else {
				file = new File(fileLoc);
				if (!file.exists())
					System.out.println("Error. Please enter an existing file.");				
			}
		} while (!(validateFileName(fileLoc)) || !new File(fileLoc).exists());
		
		return fileLoc;
		
	}
	
	// Prompt the user to enter the offset value
	public static int promptForOffset() {
		Scanner input = new Scanner(System.in);
		int offset = 0;
		String offsetVal = null;
		boolean isValid = true;
		int offsetValInt = 0;
		do {
			System.out.println("Enter an offset value: ");
			offsetVal = input.nextLine();
			if (!(validateOffset(offsetVal))) {
				isValid = false;
				System.out.println("Error. Enter a positive integer.");
			}
			else {
				offsetValInt = Integer.parseInt(offsetVal);
				isValid = true;
			}
		} while (!isValid);
		
		return offsetValInt;
	}
	
	// Prompt the user to enter whether they would like to encrypt or decrypt the file
	public static boolean promptForEncrypt() {
		Scanner input = new Scanner(System.in);
		boolean isValid = true;
		String enOrDec = "";
		boolean encrypt = false;
		do {
			System.out.println("Encrypt <e> or decrypt <d> the file?  ");
			enOrDec = input.nextLine();
			if (!(validateEnOrDec(enOrDec))) {
				System.out.println("Error. Please enter either <e> or <d>");
				isValid = false;
			}
			
			else {
				isValid = true;
			}
			
		} while (!isValid);
		enOrDec = enOrDec.toLowerCase();
		if (enOrDec.equals("e")) {
			encrypt = true;
		}
		return encrypt;
	}
	
	// Print the newly ciphered file to the console
	public static void printCiphFile(File file) {
		Scanner reader = null;
		try {
			reader = new Scanner(file);
		} catch(Exception ex) {
			System.out.println("Error. File not found when trying to print.");
		}
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(line);
		}	
	}
}

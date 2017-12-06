package finalProject;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		// *****************************************************************************************************************************
		// NOTE THAT IF THERE IS AN ERROR, THE STRING "PATH" IN THE DISPLAY CLASS MAY NEED TO BE CHANGED TO THE PROPER FILE PATH,
		//	AS IT MAY BE CALLING FROM THE WRONG DIRECTORY SINCE IT IS ON A DIFFERENT MACHINE
		// *****************************************************************************************************************************
		
		// Prompt for variables needed to create Logic object that will cipher the text file
		String fileName = Display.promptForFileName();
		boolean encrypt = Display.promptForEncrypt();
		int offset = Display.promptForOffset();
		
		// Create object to cipher the text file
		Logic logic = new Logic(fileName, encrypt, offset);
		
		File file = null;
		
		// Call the method that will cipher the file
		try {
			file = logic.cipherFile();
			System.out.println("Done!");
		} catch (Exception ex) {
			System.out.println("Error. Try again.");
		}
		
		// Print the ciphered file to the console
		Display.printCiphFile(file);
	}

}

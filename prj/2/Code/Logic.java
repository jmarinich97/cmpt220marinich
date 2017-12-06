package finalProject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Logic {
	
	private static String fullFile;
	private static String fileNoTXT;
	private static boolean encrypt;
	private static int offset;
	
	// Constructor method. Sets the file name, whether to encrypt or decrypt, and the offset value
	public Logic(String fileWithTXT, boolean encrypt, int offset) {
		this.fullFile = fileWithTXT;
		this.fileNoTXT = fileWithTXT.replace(".txt", "");
		this.encrypt = encrypt;
		this.offset = offset;
	}
	
	// Open the file that is to be ciphered
	public static File openOrigFile() {
		File origFile = new File(fullFile);
		return origFile;
	}
	
	// Create a new file to write the ciphered text to. Assigns name of the file based on whether it is being encrypted or
	// decrypted, and the offset value
	public static File createNewFile() {
		File newFile;
		
		try {
			if (encrypt){
				newFile = new File(fileNoTXT + "_e" + offset + ".txt");
				newFile.createNewFile();	
				return newFile;
			}
			else {
				newFile = new File(fileNoTXT + "_d" + offset + ".txt");
				newFile.createNewFile();	
				return newFile;
			}
		} catch (IOException ex) {
			System.out.println("Error creating file.");
			newFile = null;
			return newFile;
		}
}
	
	// Ciphers the file. Takes each line and sends it to cipherLine() to cipher the file line by line
	public static File cipherFile() {
		File origFile = new File(fullFile);
		File cipheredFile = createNewFile();
		Scanner reader = null;
		PrintWriter writer = null;
		try {
			reader = new Scanner(origFile);
			writer = new PrintWriter(cipheredFile);
		} catch (Exception ex) {
			System.out.println("Error. File not found.");
		}

		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			String lineCiphered = cipherLine(line, offset);
			writer.write(lineCiphered);
			writer.write("\n");
		}
		reader.close();
		writer.close(); 
		return cipheredFile;
	}
	
	// Ciphers a line of text
	public static String cipherLine(String line, int offset) {
		String cipheredLine = "";
		char[] lineArray = line.toCharArray();
		if (encrypt) {
			for (char symbol : lineArray) {
				symbol += offset;
				cipheredLine += symbol;
			}
		}
		else {
		    for (char symbol : lineArray) {
				symbol -= offset;
				cipheredLine += symbol;
		    }
		}
		return cipheredLine;
	}
}

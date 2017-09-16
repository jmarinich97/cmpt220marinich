package cmpt220;

import java.util.Scanner;

public class Problem4Point13 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
    String vowelList = "AEIOUaeiou";
    boolean isVowel = false;
    System.out.println("Enter a letter:  ");
    char myChar = input.next().charAt(0);
    
    if (!Character.isLetter(myChar)) {
    	  System.out.printf("%c is an invalid input", myChar);
    	  System.exit(1);
    }
    
    for  (char vowel : vowelList.toCharArray()) {
    	  if (myChar == vowel) {
    	    isVowel = true;
    	    break;
    	  }
    }
    
    if (isVowel) {
      System.out.printf("%c is a vowel", myChar);
    }
    else {
	  System.out.printf("%c is a consonant", myChar);
    }
   }

}

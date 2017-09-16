package cmpt220;

import java.util.Scanner;

public class Problem4Point21 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter SSN (DDD-DD-DDDD):  ");
    String ssn = input.nextLine();
    String ssnPart1 = "";
    char ssnDash1;
    String ssnPart2 = "";
    char ssnDash2;
    String ssnPart3 = "";
    
    if (ssn.length() == 11) {
    	  ssnPart1 = ssn.substring(0,2);
    	  ssnDash1 = ssn.charAt(3);
    	  ssnPart2 = ssn.substring(4,5);
    	  ssnDash2 = ssn.charAt(6);
    	  ssnPart3 = ssn.substring(7,10);
    	  if (ssnDash1 == '-' && ssnDash2 == '-') {
    	    for (char num1 : ssnPart1.toCharArray()) {
    	    	  if (!Character.isDigit(num1)) {
    	    	    System.out.printf("%s is an invalid social security number", ssn);
    	    	    System.exit(1);
    	    	  }
    	    }  
    	    	for (char num2 : ssnPart2.toCharArray()) {
        	  if (!Character.isDigit(num2)) {
        	    System.out.printf("%s is an invalid social security number", ssn);
        	    System.exit(1);
        	  }
    	    	}
        	for (char num3 : ssnPart3.toCharArray()) {
          if (!Character.isDigit(num3)) {
            	System.out.printf("%s is an invalid social security number", ssn);
            	System.exit(1);
          }
    	    }
        	System.out.printf("%s is a valid social security number", ssn);
    	  }
    	  else {
    	    System.out.printf("%s is an invalid social security number", ssn);
    	  }
    	  

    }
    else {
        System.out.printf("%s is an invalid social security number", ssn);
    	 
    	  }
	}
}

  

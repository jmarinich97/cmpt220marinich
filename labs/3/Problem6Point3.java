package cmpt220;

import java.util.Scanner;

public class Problem6Point3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
    System.out.println("Enter an integer to be reversed:  ");
    int origNumber = input.nextInt();
    int reversedNumber = reverse(origNumber);
    
    if (isPalindrome(reversedNumber)) {
    	  System.out.println("The number is a palindrome.");
    }
    else {
    	  System.out.println("The number is NOT a palindrome");
    }
    
  }
  
  public static int reverse(int number) {
   String reverseNum = "";
   int rightMost;
   String numberStr = Integer.toString(number);
   for ( int i = 0; i < numberStr.length(); i++) {
     rightMost = number % 10;
     number = (number * 10);
     number /= 100;
     reverseNum += rightMost;
   }
   return Integer.parseInt(reverseNum);
  }
  
  public static boolean isPalindrome(int number) {
    return (number == reverse(number));
  }

}

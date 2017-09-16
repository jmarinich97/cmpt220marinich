package cmpt220;

import java.util.Scanner;

public class Problem4Point9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a char:  ");
    char myChar = input.next().charAt(0);
    
    int myCharInt = myChar;
    
    System.out.printf("%c in Unicode is %d", myChar, myCharInt);
    
    
    
  }

}

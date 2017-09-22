package cmpt220;

import java.util.Scanner;

public class Problem5Point16 {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  System.out.println("Enter an integer:  ");
  int number = input.nextInt();
  int counter = 2;
  
  while ((number / counter) != 1) {
    if (number % counter == 0) {
    	  System.out.print(counter + ", ");
    	  number = number / counter;
    }
    else {
    	  counter++;
    }
  }
  System.out.print(number);
  }
}

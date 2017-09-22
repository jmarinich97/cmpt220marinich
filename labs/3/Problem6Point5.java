package cmpt220;

import java.util.Scanner;
public class Problem6Point5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three numbers to be sorted:  ");
	double num1 = input.nextDouble();
	double num2 = input.nextDouble();
	double num3 = input.nextDouble();
    displaySortedNumber(num1, num2, num3);
  }
  public static void displaySortedNumber(double num1, double num2, double num3) {
    while (num1 > num2 || num2 > num3 || num1 > num3) {
	  if (num1 > num2) {
    	    double temp = num1;
    	    num1 = num2;
    	    num2 = temp;
      }
      if (num2 > num3) {
  	    double temp = num2;
  	    num2 = num3;
  	    num3 = temp;
      }
    }
    System.out.printf("The number in sorted order are %.2f, %.2f, %.2f", num1, num2, num3);
  }

}

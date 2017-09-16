package cmpt220;

import java.util.Scanner;

public class Problem4Point23 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter name:  ");
	  String name = input.nextLine();
	  System.out.println("Enter number of hours worked in a week:  ");
	  double hours = input.nextInt();
	  System.out.println("Enter hourly pay rate:  ");
	  double payRate = input.nextDouble();
	  System.out.println("Enter federal tax withholding rate:  ");
	  double fedTax = input.nextDouble();
	  System.out.println("Enter state tax withholding rate:  ");
      double stateTax = input.nextDouble();
      double grossPay = payRate * hours;
      double fedHolding = ((fedTax * 100) * grossPay) / 100;
      double stateHolding = ((stateTax * 100) * grossPay) / 100;
      double deduction = fedHolding + stateHolding;
      double netPay = grossPay - deduction;
      
      System.out.printf("Employee Name: %s%n", name);
      System.out.printf("Hours worked: %.2f%n", hours);
      System.out.printf("Pay rate: $%.2f%n", payRate);
      System.out.printf("Gross pay: $%.2f%n", grossPay);
      System.out.printf("Deductions:\n\tFederal Withholding (%.2f): $%.2f\n\tState Withholding (%.2f): $%.2f\n\tTotal Deduction: $%.2f\nNet Pay: $%.2f", fedTax, fedHolding,stateTax,stateHolding, deduction,netPay);



  }

}

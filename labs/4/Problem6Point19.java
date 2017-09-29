package cmpt220;

import java.util.Scanner;

public class Problem6Point19 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the sides of a triangle:  ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    
    if (isValid(side1, side2, side3)) {
    	  System.out.printf("The area of the triangle is %.2f", area(side1, side2, side3));
    }
    else {
    	  System.out.println("The input is invalid.");
    }
  }
  // Return true if the sum of every two sides is greater than the third side
  public static boolean isValid(double side1, double side2, double side3) {
    return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
  }
  // Return the area of the triangle
  public static double area(double side1, double side2, double side3) {
    double s = (side1 + side2 + side3)/2;
    return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
  }
}

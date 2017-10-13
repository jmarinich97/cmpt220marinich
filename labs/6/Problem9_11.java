package cmpt220;

import java.util.Scanner;

public class Problem9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a, b, c, d, e & f:  ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation eq = new LinearEquation(a, b, c, d, e, f);
		
		if (!eq.isSolvable()) {
			System.out.println("The equation as no solution");
		}
		
		else {
			System.out.println("The x value is " + eq.getX() + "\nThe y value is " + eq.getY());
		}
	}

}

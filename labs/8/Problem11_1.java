package cmpt220;

import java.util.Scanner;

public class Problem11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter triangle side 1: ");
		double side1 = input.nextDouble();
		System.out.println("Enter triangle side 2: ");
		double side2 = input.nextDouble();
		System.out.println("Enter triangle side 3: ");
		double side3 = input.nextDouble();
		input.nextLine();
		System.out.println("Enter a color for the triangle:  ");
		String color = input.nextLine();
		System.out.println("Is the triangle filled?  ");
		boolean isFilled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		
		System.out.println(triangle.toString());
		
		System.out.printf("The area is %.2f\n", triangle.getArea());
		System.out.printf("The perimeter is %.2f\n", triangle.getPerimeter());

		
		if (triangle.isFilled()) {
			System.out.println("Triangle is filled");
		} else {
			System.out.println("Triangle is not filled");
		}
		
		System.out.println("Triangle is " + triangle.getColor());
		
		
		
	}

}

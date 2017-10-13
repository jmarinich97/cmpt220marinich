package cmpt220;

public class Problem9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.printf("The width of rectangle 1 is %.1f\nThe height of rectangle 1 is %.1f\n"
				+ "The area of rectangle 1 is %.1f\nThe perimeter of rectangle 1 is %.1f\n\n"
				, rect1.width, rect1.height, rect1.getArea(), rect1.getPerimeter());
		System.out.printf("The width of rectangle 2 is %.1f\nThe height of rectangle 2 is %.1f\n"
				+ "The area of rectangle 2 is %.1f\nThe perimeter of rectangle 2 is %.1f\n\n"
				, rect2.width, rect2.height, rect2.getArea(), rect2.getPerimeter());
	}

}



package cmpt220;

public class Problem10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area of c1: " + c1.getArea());
		System.out.println("Perimeter of c1: " + c1.getPerimeter());
		System.out.println("Contains (3, 3): " + c1.contains(3, 3));
		System.out.println("Contains new circle(4, 5, 10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Overlap new circle(3, 5, 2.3): " + c1.overlaps(new Circle2D(3, 5, 2.3)));

	}

}
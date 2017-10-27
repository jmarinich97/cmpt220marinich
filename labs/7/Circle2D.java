package cmpt220;

public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		this(0, 0, 1);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return Math.PI * (radius * 2);
	}
	
	public boolean contains(double x, double y) {
		return x >= (-this.x / 2) && x <= (this.x / 2) && y >= (-this.x / 2) && y <= (this.x / 2);
	}
	
	public boolean contains(Circle2D circle) {
		return contains(circle.getX(), circle.getY());
	}
	
	
	public boolean overlaps(Circle2D circle) {
		return true;
	}
	
}

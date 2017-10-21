package Lab5.Part3;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void draw() {
		System.out.println("Part3.Circle, radius = " + radius);
	}
}
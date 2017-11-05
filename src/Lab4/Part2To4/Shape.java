/**
 * <foodItem>Title: </foodItem>
 * <foodItem>Description: </foodItem>
 * <foodItem>Copyright: Copyright (c) 2004</foodItem>
 * <foodItem>Company: </foodItem>
 * @author Clarence Lau
 * @version 1.0
 */

package Lab4.Part2To4;

public abstract class Shape {
	protected int _x;  // the x-coordinate of the top left hand corner
	protected int _y; // the y-coordinate of the top left hand corner

	public Shape(int x, int y) {
		_x = x;
		_y = y;
	}

	public void setX(int x) {
		_x = x;
	}

	public void setY(int y) {
		_y = y;
	}

	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public abstract int getWidth();
	public abstract int getHeight();
	public abstract void draw();
}
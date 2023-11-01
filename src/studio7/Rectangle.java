package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int actualLength, int actualWidth) {
		length = actualLength;
		width = actualWidth;		
	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * length + 2 * width;
	}

	public boolean smaller(Rectangle nnn) {
		int firstArea = area();
		int secondArea = nnn.area();
		if (firstArea < secondArea) {
			return true;
		} else {
			return false;
		}
	}
	public boolean square() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle og = new Rectangle(3,4);
		Rectangle notOg = new Rectangle (5,7);
		System.out.println(og.square());
	}
}

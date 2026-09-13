
class Rectangle {
	private int length;
	private int breadth;
	
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea() {
		System.out.println("Area: " + (length*breadth));
	}
	
	public void printParimeter() {
		System.out.println("Area: " + (2*(length+breadth)));
	}
}

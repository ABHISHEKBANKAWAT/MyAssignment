package Oops_Assignment;

abstract class Shape{
	abstract void draw();
}

class Line extends Shape{
	public void draw() {
		System.out.println("Drawing Line");
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Cube extends Shape{
	public void draw() {
		System.out.println("Drawing Cube");
	}
}

public class Question_5 {

	public static void main(String[] args) {
		
		Line l = new Line();
		l.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Cube c = new Cube();
		c.draw();
	}

}
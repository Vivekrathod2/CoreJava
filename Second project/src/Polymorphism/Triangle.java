package Polymorphism;

public class Triangle extends Shape {
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		return 0.5 * base * height;
	}
	/*
public static void main(String[] args) {
	Shape t1 = new Triangle();
	
	Triangle d = new Triangle();
	d.setBase(10);
	d.setHeight(20);
	d.area();

	System.out.println("Base" + d.getBase());
	System.out.println("height" + d.getHeight());
	System.out.println("area of triangle" + d.area());

}*/
}

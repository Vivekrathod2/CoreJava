package Polymorphism;

public class Rectangle extends Shape {

	private int length ;
	private int width ;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		return length * width;
	}
	/*
public static void main(String[] args) {
	Shape t = new Rectangle();
	t.setBorderwidth(6);
	t.setColor("red");
    
	Rectangle r =new Rectangle();
	r.setLength(4);
	r.setWidth(2);
	
	System.out.println("area of rectyangle: "+r.area());
	System.out.println("Color :" + t.getColor());
	System.out.println("width :" + t.getBorderwidth());
	
	
}*/
}
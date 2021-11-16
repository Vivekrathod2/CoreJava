package Inheritance;

public class Triangle extends Shape
{
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
	
	public double area()
	{
		return 0.5*base*height;
	}
	public static void main(String[] args) {
		Triangle t = new Triangle ();
		
		t.setColor("blue");
		t.setBorderwidth(5);
		t.setBase(4);
		t.setHeight(8);
		
		System.out.println("color of triangle is " +t.getColor());
		System.out.println("border of triangle is " +t.getBorderwidth());
		System.out.println("base of triangle is " +t.getBase());
		System.out.println("height of triangle is " +t.getHeight());
		
		
		
	}

}

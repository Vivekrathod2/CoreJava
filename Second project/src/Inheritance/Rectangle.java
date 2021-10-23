package Inheritance;

public class Rectangle extends Shape
{

	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public double area()
	{
		return length*width;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(10);
		r.setWidth(7);
	
		r.setColor("red");
		r.setBorderwidth(2);
		
		System.out.println("length of triangle"+ r.getLength());
		System.out.println("borderwidth of triangle"+r.getBorderwidth());
		System.out.println("");
	
	}
	
}

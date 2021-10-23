package Polymorphism;

public class Shape {

	private String color = null;
	private int Borderwidth = 0;
	public static final double PI = 3.14;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwidth() {
		return Borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		Borderwidth = borderwidth;
	}

	public double area() {
		return 0;
	}

}

package Polymorphism;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area(int radius) {
		return 3.14 * radius * radius;
	}
	/*public static void main(String[] args) {

		Shape t = new Circle();
		t.setColor(" red");
		t.setBorderwidth(10);
		
		Circle c = new Circle();
		c.setRadius(1000);
		c.area(10);
		

		System.out.println("Color" + t.getColor());
		System.out.println("width" + t.getBorderwidth());
		System.out.println("radius of circle" +c.getRadius());
		System.out.println("area of circle :"+c.area(10));

}
*/
}
package Inheritance;

public class TestCircle extends Shape
{
	
private int radius;

public int getRadius()
{
	return radius;
}
public void setRadius(int radius)
{
	this.radius = radius;
}
public double area()
{
	return 3.14*radius*radius;
}
public static void main(String[] args) {
	
	TestCircle c = new TestCircle();
	c.setColor("Red");
	c.setRadius(2);
	c.setBorderwidth(5);
	
	System.out.println(c.getColor());
	System.out.println(c.getBorderwidth());
	System.out.println(c.getRadius());
	System.out.println(c.area());
}

}

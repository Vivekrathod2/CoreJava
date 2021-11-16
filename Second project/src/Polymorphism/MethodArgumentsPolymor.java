package Polymorphism;

public class MethodArgumentsPolymor {
public static void main(String[] args) {
	Shape [] s = new Shape[3];
	s[0] = new Rectangle();
	s[1] = new Circle(5);
	s[2] = new Triangle(3,4);
	
	double  totalArea = calcArea(s);
	
	//char[] toatalArea = null;
	System.out.println(toatalArea);
}
public static double calcArea(Shape[] s)
{
	double totalArea = 0;
	
	for(int i=0; i<s.length; i++)
	{
		totalArea += s[i].area();
	}
	return totalArea;
}


}
}



public class Compiletimepoly {
	public void subject()
	{
		System.out.println("maths");
	}
	public void subject(int i)
	{
		System.out.println("first" +i);
	}
public void subject(int i, int j)

{
System.out.println("second"+i +j);	
}
public static void main(String[] args) {
	Compiletimepoly p = new Compiletimepoly();
	p.subject();
	p.subject(10);
	p.subject(20,30);
}
}

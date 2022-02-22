

public class Polymorphism {
	public void demo()
	{
		System.out.println("bytecoder");
	}
	public void demo(int i)
	{
		System.out.println("first"+i);
	}
	
	public void demo(float i, int j)
	{
		System.out.println("second:"+i+"and"+j);
	}
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.demo();
		p.demo(10);
		p.demo(9.2f,30);
	

		
	}

}

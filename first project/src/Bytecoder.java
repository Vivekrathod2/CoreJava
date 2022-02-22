
public class Bytecoder {   
	public void demo() {
		System.out.println("demo without any parameter");
	}
	public void demo(int i)
	{
		System.out.println("demo with int type parameter");
	}
public void demo(float i)
{
System.out.println("demo with float type parameter");	
}
public static void main(String[] args) {
	Bytecoder b= new Bytecoder();
	b.demo();
	b.demo(6);
	b.demo(11.9f);
}
}















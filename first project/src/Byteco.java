
public class Byteco {
	
		public void temp()
		{
			System.out.println("computer");
		}
	
	public void temp(int i)
	{
		System.out.println("int type:"+i);
	}
	public void temp(float a, double b ) {
		System.out.println("float and double:"+a+"and"+b);
	}
	public static void main(String[] args) {
		Byteco b = new Byteco();
		b.temp();
		b.temp(10);
		b.temp(3.5f,2.5);
	}
}

package Constructor;

public class Employee3 extends Person3 {

	public void ChangeAddress()
	
	{
		System.out.println("indoreess");
		super.ChangeAddress();
		System.out.println("employe change add");
		
	}
	public static void main(String[] args) {
		Employee3 e =new Employee3();
		e.ChangeAddress();
	}
}

package Constructor;

public class Employee2 extends Person2 {

	private String designation;
	
	public Employee2()
	{
		System.out.println("default constructor");
	}
	public Employee2(String fn, String ln , String des )
	{
		super(fn,ln);
		designation= des;
		System.out.println("3parameter");
		
	}
	public static void main(String[] args) {
		 Employee2 e = new Employee2("viv", "rathod","student");
		System.out.println(e.designation);
		System.out.println(e.firstName);
		System.out.println(e.lastName);
		 
	}
	

}

package Constructor;

public class Person2 {

	protected String firstName;
	protected String lastName;
	public Person2()
	{
		System.out.println("default");
	}
	public Person2(String fn, String ln)
	{
		 firstName =fn;
		 lastName = ln;
		System.out.println("2para");
	}
	public static void main(String[] args) {
		Person2 p = new Person2("vivek","rathore");
		System.out.println(p.firstName);
		System.out.println(p.lastName);
		
	}

	}
	

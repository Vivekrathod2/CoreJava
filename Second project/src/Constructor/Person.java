
package Constructor;

public class Person {

	protected String firstName ;
	protected String lastName;
	protected String address;
	
	public Person ()
	{
		System.out.println("person Default Constructor");
	}
	
	public Person(String fn , String ln) 
	{
		this();
		firstName = fn;
		lastName = ln;
		
			}
	public Person (String fn, String ln, String ad )
	{
		this(fn,ln);
		address= ad;
			}
	public static void main(String[] args) {
		
		Person p = new Person("vivek","rathod","Indore");
		System.out.println("default:"+p.address);
		System.out.println("2parameter:"+p.firstName);
		 System.out.println("3parameter:"+p.lastName); 	
		 
	}
}

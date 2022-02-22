package Polymorphism;
class B
{/*
	private  int rollno;
	public void setrollno(int rollno)
	{
		this.rollno = rollno;
	}
	public int getrollno()
	{
		return rollno;
		}
}
public class Encapsulation 
{
	public static void main(String[] args) {
B a= new B();

	a.setrollno(100);
	int k=a.getrollno();
	System.out.println(k);
}
}
*/
	private int id;
	private String name;
	public void setid( int id)
	{
		this.id =id;
		
	}
	public void setname(String name)
	{
		this.name =name;
	}
	public int getid()

{
		return id;
		}
	public String getname()
	{
		return name;
	}
	}
public class Encapsulation
{
	public static void main(String[] args) {
		B b = new B();
		b.setid(101);
		b.setname("samsung");
		
		int i = b.getid();
		
String j= b.getname();
		System.out.println("id="+i);
		System.out.println("name="+j);
		
	}
}
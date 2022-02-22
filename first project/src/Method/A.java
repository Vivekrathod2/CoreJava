package Method;

public class A {
public void getname()
{
	System.out.println("hello");
}
public void getinfo()
{
	System.out.println("this is my info");
}
public static void main(String[] args) {
	A a = new A();
	a.getname(); //nonstatic call by object 
	a.getinfo();   // static call by classname
}
}

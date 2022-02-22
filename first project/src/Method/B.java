package Method;

public class B {
public void getname(String name)
{
	System.out.println(name);
}public void getinfo(int rollno)
{
	System.out.println(rollno);
}
public static void main(String[] args) {
	B tt = new B();
	tt.getname("vivek");
	tt.getinfo(101);
}

}

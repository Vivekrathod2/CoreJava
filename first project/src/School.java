
public class School {
public void test()
{
	System.out.println("vivek");
}

public void test1(int i)
{
	System.out.println("rathod:"+i);
}

public void demo(float a, double d)
{
	System.out.println("float and double:"+a+"and" +d);
}
public static void main(String[] args) {
	School s = new School();
	s.test();
	s.test1(20);
	s.demo(2.5f, 3.6);
}
}

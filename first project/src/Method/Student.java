package Method;

public class Student {
public void getinfo()
{
	System.out.println("without return type without parameter");
}
public void getname(String name)
{
System.out.println(name);
System.out.println("without return type with parameter");
}
public int getRollno()
{
	return 11234;
}
public int getMarks(int a, int b)
{
	return a+b;
}
public static void main(String[] args) {
	Student s = new Student();
	s.getinfo();
	s.getname("oshi");
	int roll = s.getRollno();
	System.out.println(roll);
	int marks = s.getMarks(20, 30);
	System.out.println(marks);
}
}


package Constructor;

 class Student {
	 public Student()
	 {
		 System.out.println("default");
	 }
public Student (int i)
{
	System.out.println("para"+i);
}
public static void main(String[] args) {
	Student s1 =new Student();
	Student s2 = new Student(10);
}
 }

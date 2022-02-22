package Constructor;
interface MyInterface
{
	int a=10, b=20;
	int c=a+b;
	void sum();
}
 class E implements MyInterface
 {
		public void sum()
		{
			
 }
public static void main(String[] args) {
	MyInterface i = new E();
	i.sum();
	System.out.println(c);
}
}

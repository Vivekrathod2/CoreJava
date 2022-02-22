package Constructor;

 class B1
{
	 B1()
	{	
		System.out.println("default");
	}
	B1(int i)
	{
		System.out.println("parameterized");

	}
}
	class A extends B1
	{
		 A()
		{
			super(10);
			System.out.println("class child");
		}
		A(int j)
		{
		//	super(15);
			System.out.println("child"+j);
		}
		
		public static void main(String[] args) 
		{
		A b= new A();
	
	}
}
b
package Nested;
class Outer
{
	private int id=175;
	public class MemberInner
	{
		protected int usePrivateDataOfOuter()
		{
			return id;
		}
	}
}
public class Innerclass1 {
public static void main(String[] args) {
	Outer outer = new Outer();   //first creat class object of outer class
	
	Outer.MemberInner inner = outer.new MemberInner();
	System.out.println(inner.usePrivateDataOfOuter());
}
}

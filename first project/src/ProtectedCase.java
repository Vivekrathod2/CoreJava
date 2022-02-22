
public class ProtectedCase {
	protected int i = 100;
	protected void demo()
	{
		System.out.println(" inside demo method ");
	}
public static void main(String[] args) {
	ProtectedCase obj  = new ProtectedCase();
	obj.demo();
	System.out.println(obj.i);
}
}

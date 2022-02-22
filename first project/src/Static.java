
public class Static {
	/* int i= 10;
	static int j =20;
	
	public static void main(String[] args) {
		Static a1 = new Static();
		Static a2 = new Static();
		a2.i=50;
	System.out.println(a1.i);
	System.out.println(Static.j);
	System.out.println(a1.j);
	System.out.println(a2.j);
	a1.j =100;
	System.out.println(a2.j);
	System.out.println(Static.j);
	System.out.println(a1.j);
	System.out.println(a2.j);
*/
	int i = 20;
	static int j= 25;
	public static void main(String[] args) {
		Static a = new Static();
		Static b = new Static();
		a.i=30;
		b.j =50;
		{
			System.out.println(a.i);
			{
				System.out.println(b.j);
			}
		}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

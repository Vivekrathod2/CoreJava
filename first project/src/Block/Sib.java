package Block;

public class Sib {
public static void main(String[] args) {
	System.out.println("main start");
	
	Sib s = new Sib();
	Sib s1 = new Sib();
	System.out.println("end");
}
{
	System.out.println("lib 1");
}
{
	System.out.println("lib 2");
}

static
{
	System.out.println("1 sib");
}
static 
{
	System.out.println("2 sib");
}
static
{
	System.out.println("3 sib");
}
}

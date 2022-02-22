package Method;

public class Apple {
public float sum (float aF,float bF)
{
	float d = aF+bF;
	return d;
}
public static void main(String[] args) {
	Apple a= new Apple();
	float r= a.sum(20.1f, 30.2F);
	System.out.println(r);
}
}

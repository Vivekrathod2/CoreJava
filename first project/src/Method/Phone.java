package Method;

public class Phone {
public void subtract (float aF, float bF)
{
	System.out.println(aF-bF);
}
public void sum(float cF,float dF)
{
	System.out.println(cF+dF);
}
public void multiply(int i, int j)
{
	System.out.println(i*j);
}
public static void main(String[] args) {
	Phone p = new Phone();
	p.subtract(10f, 5F);
	p.sum(10.2f,  3.5f);
	p.multiply(13, 14);
}
}

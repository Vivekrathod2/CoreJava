package www.raystech.java;

public class LargestnoinArray15 {
public static void main(String[] args) {
	int [] a = {10,15,23,25,20};
	int high = a [0];
	
	{
		for(int i=0; i<a.length; i++)
		{
			if (a[i]>high)
			{
				high = a[i];
			}
		}
		System.out.println("Highest Number");
		System.out.println(high);
	}
} 
}

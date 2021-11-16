package www.Array.java;

public class SortingArrayInAscendingOrder {
public static void main(String[] args) {
	int []a = new int[] {20,10,5, 15,13};
	int temp;
	{
		for(int i= 0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j])
				{
					temp =  a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
				for(int i=0; i<a.length; i++)
				{
					System.out.println(a[i]);
				}
	}
}
}

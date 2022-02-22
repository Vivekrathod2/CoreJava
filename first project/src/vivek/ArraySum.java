package vivek;

public class ArraySum {
    public static void main(String[] args) {
		int [ ]a = new int[] {20,25,35,30};
		int []b = new int[] {15,5,10,20};
		int size = a.length+b.length;
		int []c = new int[size];
		int dummy = size-a.length;
		int dummy2 = a.length;
		int j=0;
		for (int i=0; i<size; i++)
		{
			if(dummy2>i)
			{
				c[i]=a[i];
				
			}
			else if(i>dummy)
			{
				c[i-1]=b[j];
				j++;
			}
		}
		for(int i=0; i<size; i++)
		{
			System.out.println(c[i]);
		}
	}

}

package vivek;

public class Sumof2Array {
	public static void main(String[] args) {
		int []a= {15,5,20,4};
		int []b= {10,13,14,9};
		int size = a.length+b.length;
		int[]c =new int[size];
	int dummy = size-a.length;
		int dummy2 = a.length;
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
			}
		int j=0;
		for(int i=a.length; i<size; i++, j++)
		{
			c[i]=b[j];
			}
		for( int i=0; i<size; i++)
			
		{		System.out.println(c[i]);
}
	
}

}
package vivek;

public class Sortingdescending {
	public static void main(String[] args) {
		int[]a = new int []{20,15,5,25,10};
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length; i++)
		{
			
			System.out.println(a[i]+"");
		}
	}



}

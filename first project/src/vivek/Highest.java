package vivek;

public class Highest {
	public static void main(String[]args)
	{
		int arr[]= {20,45,15,16,10};
		int high = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>high)
			{
				high = arr[i];
			}
		}
		System.out.println("highest no");
		System.out.println(high);
	}

}

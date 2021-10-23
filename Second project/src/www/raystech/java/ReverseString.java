package www.raystech.java;

public class ReverseString {
public static void main(String[] args) {
	String name = "Vijay Dinanath Chouhan";
	char[] a = name.toCharArray();
	for(int i=a.length-1; i>=0; i--)
	{
		System.out.print(a[i]);
	}
}
}

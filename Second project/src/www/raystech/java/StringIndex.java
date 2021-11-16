package www.raystech.java;

public class StringIndex {
public static void main(String[] args) {
	String name = "subhash sahu";
	char[] c = name.toCharArray();
	
	for(int i=0; i<=name.length()-1; i++)
		if (name.charAt(i) == 'a')
		{
			System.out.println(i+ " " +c[i]);
		}
}
}







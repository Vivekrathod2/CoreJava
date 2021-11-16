package www.raystech.java;

public class Reversenumber {
public static void main(String[] args) {
	int n = 854278 , rev=0 ;
	while(n != 0)
		
	{
		int r1= n%10;
		rev = rev*10+r1;
		n=n/10;
		
		}
	System.out.println("the reverse f given no is " +rev);
	}
	}		
package www.raystech.java;

import java.util.Scanner;

public class Harmonics {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter your value");
	int n = sc.nextInt();
	float sum = 0.0f;
	for(int i=1; i<=n; i++)
	{
		sum = sum + (float)1/i;
		System.out.println("Sum :" +sum);
	}
}
}

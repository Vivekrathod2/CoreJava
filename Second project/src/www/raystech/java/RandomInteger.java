package www.raystech.java;

import java.util.Random;

public class RandomInteger {
public static void main(String[] args) {
	Random random = new Random();
	for(int i=0; i<5; i++)
	{
		int randomInteger = random.nextInt();
		System.out.println("Random integer in java " +randomInteger);
	}
}
}

package www.raystech.java;

public class TwoDimensionA8 {
	public static void main(String[] args) {

		int[][] a = new int[1][10];

		a[0][1] = 11;
		a[0][2] = 8;
		a[0][3] = 15;
		a[0][4] = 17;
		a[0][5] = 14;
		a[0][6] = 19;
		a[0][7] = 16;
		a[0][8] = 26;
		a[0][9] = 23;

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 10; j++)

				System.out.print(a[i][j] + " ");

		}
		
	}
}

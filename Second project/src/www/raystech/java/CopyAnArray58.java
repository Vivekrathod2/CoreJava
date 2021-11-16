package www.raystech.java;

public class CopyAnArray58 {
public static void main(String[] args) {
	char [] copyFrom = {'a','s','d','f','g','h','l','k','j','a','e','b'};
	char [] copyTo = new char[7];
	System.arraycopy(copyFrom,2 , copyTo, 0, 7);
	System.out.println(copyTo);
}
}

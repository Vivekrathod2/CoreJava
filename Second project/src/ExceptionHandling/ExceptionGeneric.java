package ExceptionHandling;

public class ExceptionGeneric {
	public static void main(String[] args) {
		String name = "vivek";
		try {
			System.out.println("length of name:" + name.length());
			System.out.println("charcter on 7 index:" + name.charAt(6));
		} catch (RuntimeException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
}

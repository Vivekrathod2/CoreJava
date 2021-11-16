package www.raystech.java;

public class SwitchCaseAge {
public static void  main(String[] args) {
	int age = 18;
	switch (age)
	{
	case (16): 
		System.out.println(" you are under 18");
		break;
	case (18):
	
		System.out.println(" you are eligible for marrige");
		break;
		 
	case (40):
		System.out.println("you are over age");
	break;
	default:
		System.out.println("invalid age");
		
		
	}
	
}
}

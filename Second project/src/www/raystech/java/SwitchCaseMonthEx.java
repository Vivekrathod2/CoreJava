package www.raystech.java;

public class SwitchCaseMonthEx {
	public static void main(String[] args) {
		int month = 7;
		String monthString = "9-September";

		switch (month) {

		case 1:
			monthString = "1-January";
			System.out.println("j");
			break;
		case 2:
			monthString = "2-February";
			System.out.println("f");
			break;
		case 3:
			monthString = "3-March";
			System.out.println("m");
			break;
		case 4:
			monthString = "4-April";
			System.out.println("A");
	break;
		case 5:
			monthString = "5-May";
			System.out.println("m");
	break;
		case 6:
			monthString = "6-june";
			System.out.println("j");
break;
		case 7:
			monthString = "7-July";
			System.out.println("7-July");

			break;
		case 8:
			monthString = "8-August";
			System.out.println("a");
break;
		case 9:
			monthString = "9-September";
			System.out.println("s");
break;
		case 10:
			monthString = "10-October";
			System.out.println("o");
	break;
		

		case 11:
			monthString = "11-November";
			System.out.println("N");
	break;
		case 12:
			monthString = "12-December";
			System.out.println("D");
	break;

		default:
			System.out.println("invlid month!");
			break;
		}
	}
}

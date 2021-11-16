package www.raystech.java;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateAndTimeFormat {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	
	Date today = new Date();
	SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyy");
	String strDate = format1.format(today);
	System.out.println("Format#1 : "+strDate);       //String--->to Date
	
	SimpleDateFormat format2 = new SimpleDateFormat("MMM/dd/yy");
	strDate = format2.format(today);
	System.out.println("Format#2 :"+strDate);			//String--->to Date
	
	Date pDate = format1.parse("04/05/2015");
	System.out.println(pDate);                        //Date----->.to string
}
}

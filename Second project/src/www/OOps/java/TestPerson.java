package www.OOps.java;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
public static void main(String[] args) throws Exception 
{
	
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Person p = new Person();
	p.setName("amn");
	p.setDob(sdf.parse("25/06/1999"));
	p.setAdress("madumilan");
	System.out.println(p.getName());
	System.out.println(p.getDob());
	System.out.println(p.getAdress());
	
}
}
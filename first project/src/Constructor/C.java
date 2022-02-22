
package Constructor;

public class C {
private int id;
private String name;
public void setId (int id ) 
{
this.id=id;
}

public int getId() {
	return id;
}
public void setName( String name)
{
this.name =name;	
}
public String getName() {
	return name;
}
public static void main(String[] args) {
	C d =new C();
	d.setId(20);
int k=	d.getId();
	d.setName("vivek");
String j =	d.getName();

System.out.println(k+"and"+j);
}

}


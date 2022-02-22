package Collection;

import java.util.HashSet;

class Command
{
	private int id=10;
	String name = "vivek";
public Command() //default constructor
{
	
}
public Command(int id, String name)
{
	super();
	this.id=id;
	this.name=name;
}
public int getId()
{
 return id;
}
public void setId(int id)
{
	this.id =id;
}
public String getname()
{
	return name;
}
public void setname( String name)
{
	this.name= name;
}

public String toString()
{
	return "name=" +name+" "+"id="+id;
}
public int hashCode()
{
	return (" "+id+name).hashCode();
}
public boolean equals(Object obj)
{
	if(this.hashCode()== obj. hashCode())
		return true;
	else
		return false;	

}

}
public class MapExample {
	public static void main(String[] args) {
		Command c1 = new Command(101,"vivek");
		Command c2 = new Command(102,"dawer");
		Command c3 = new Command(103,"sharma");
		
		HashSet hs = new HashSet();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		System.out.println(hs);
			
	}
}



package Collection;

import java.util.HashSet;

//import javax.swing.plaf.synth.SynthSeparatorUI;

//import java.util.HashSet;

class Computer
{
	int id;
	String city= "indore";
	public Computer()//default constructor
	{
	
	}
	public Computer(int id , String city)
	{
		super();
		this.id=id;
	    this.city=city;	
	}
public int getid()
{
	return id;
}
	public void setid(int id)
	{
		 this.id=id; 
		
	}

public String getCity()
{
	return city;
			
}
public void setCity()
{
	this.city=city;
}
public String toString()
{
	return "id="+id+ " "+"city"+city;
}
public int hashCode()
{
	int h = ( id+" "+city).hashCode();
	return h;
}
 public boolean equals(Object obj)
{
	if (this.hashCode()== obj.hashCode())
return true;
else
	return false;
		
}
 }
public class SetEx2 
{
	public static void main(String[] args)
	{
		Computer  s= new Computer(10, "vivek");
		Computer s1= new Computer(320, "school");
		Computer s2= new Computer(20, "laptop");

		HashSet<Computer> hs = new HashSet<Computer>();
	    hs.add(s);
		hs.add(s1);
		hs.add(s2);
		
		for(Computer emp: hs)
		{
			System.out.println(emp.getid()+ " " + emp.getCity());

		}
}
}

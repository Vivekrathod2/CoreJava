package Collection;

import java.util.HashSet;

class Employee
{
	private int rollno;
	private String sname;
	public Employee()
	{
		
	}
	public Employee(int rollno, String sname) 
	{
		super();
		this.rollno=rollno;
		this.sname=sname;
	}
public int getRollno()
{
	return rollno;
}
public void setRollno(int rollno)
{
	this.rollno=rollno;
}
public String getSname()
{
	return sname;
}
public void setSname(String sname)
{
	this.sname=sname;
}
@Override
public String toString()
{
	return "Employee [rollno" +rollno+ ",  sname=" + sname +"]";
		}
public int hashCode()
{
	return (""+rollno+sname).hashCode();
}
@Override
public boolean equals(Object obj)
{
	if(this.hashCode()== obj. hashCode())
		return true;
	else
		return false;	
}
}
public class SetEx1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "rits");
		Employee e2 = new Employee(101, "rits");
		Employee e3= new Employee(102, "kush");

		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		for(Employee emp:hs)
		{
			System.out.println(emp.getRollno()+ " " + emp.getSname());
		}
		
		
	}

}

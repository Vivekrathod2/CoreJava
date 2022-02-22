package Constructor;

import vivek.Main;

public class D {
	public void name(String n) 
	{
		String name = "Nidhi";
		System.out.println(name);
	//	return name;
	}
	
	public String nam() 
	{
		
		return "nidhi";
	}
	public static void main(String[] args) {
		D d = new D();
	 d.name("harsh");
		//System.out.println(s);
		String s1 = d.nam();
		System.out.println(s1);
		//System.out.println(d.name());
	}
}
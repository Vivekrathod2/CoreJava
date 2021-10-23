package Abstraction;

public class Businessman extends Person  implements Richman , SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("hello");
	}

	@Override
	public void earnMoney() {
System.out.println("earn");		
	}

	@Override
	public void donation() {
	System.out.println("donation");	
	}

	@Override
	public void party() {
		System.out.println("party");		
	}
	public static void main(String[] args) {
		Businessman b= new Businessman();
		b.party();
		b.setAddress("khargone");
		b.setName("vivek");
		System.out.println("Address:"+b.getAddress());
		System.out.println("Name:"+b.getName());
		
	}
}

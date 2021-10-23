package Constructor;

public class Test1 {
public static void main(String[] args) {
	SavingAccount1 s =new SavingAccount1();
	Account1 a = new Account1();
	Account1 sa = new SavingAccount1();
	
	System.out.println(s.getAmount());
	System.out.println(a.getAmount());
	System.out.println(sa.getAmount());
}
}

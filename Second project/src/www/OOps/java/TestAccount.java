package www.OOps.java;

public class TestAccount {

	public double fundTransfer(double ac1, double ac2) {
		return ac1 - ac2;

	}

	public double withDrawal(double ac1, double ac2) {
		return ac1 - ac2;

	}

	public static void main(String[] args) {

		int mainBalance = 100000;
		Account account1 = new Account();
		Account account2 = new Account();

		account1.setBalance(mainBalance);
		account2.setBalance(1000);

		TestAccount account = new TestAccount();
		double remainingBalance = account.fundTransfer(account1.getBalance(), account2.getBalance());

		double Balance = account.withDrawal(account1.getBalance(), account2.getBalance());

		System.out.println(remainingBalance);
		System.out.println(Balance);

	}

}
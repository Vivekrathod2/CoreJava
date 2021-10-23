package Constructor;

public class SavingAccount1 extends Account1 
{
	public int getAmount()
	{
		int i = super.getAmount()+10;
		return i;
					}
}
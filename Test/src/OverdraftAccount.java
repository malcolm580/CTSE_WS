public class OverdraftAccount extends Account {
	protected double odLimit;
	
	public OverdraftAccount(int accNo, double bal, double limit) {
		super(accNo, bal); // call superclass constructor
		odLimit = limit;
	}

	public boolean withdraw(double amt) { // override debit method of the superclass
		if (amt <= (balance+odLimit))
		{
			balance = balance - amt;
			return true;
		} else
			return false;
	}
	
	public void printRepaymentNotice() {
		System.out.println("Account No: " + accountNumber);
		System.out.println("Repayment Amount: " + (0 - balance));
	}
}
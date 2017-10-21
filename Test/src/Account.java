public class Account {
	protected int accountNumber;
	protected double balance;
	
	public Account(int accNo, double bal) {
		accountNumber = accNo;
		balance = bal;
	}
	public int getAccountNumber() { return accountNumber; }
	
	public double getBalance() { return balance; }
	
	public boolean withdraw(double amt) {
		if (amt <= balance) 
		{
			balance = balance - amt;
			return true;
		} else
			return false;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}
	
	public String toString() {
		return "Accoun No:" + accountNumber + ",  balance = " + balance;
	}
}
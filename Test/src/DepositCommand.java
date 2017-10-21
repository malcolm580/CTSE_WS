public class DepositCommand implements Command {
	Account acc;
	double amount;
	public DepositCommand(Account account, double amt) {
		this.acc = account;
		this.amount = amt;
	}
	
	public void execute() {
		System.out.println("---Deposit Transaction---");
		System.out.println(acc);
		System.out.println("Deposit Amount = " + amount);
		acc.deposit(amount);
		System.out.println("After deposit, balance = " + acc.getBalance());
		System.out.println("----End------");
	}
	
	public void undo() {
		System.out.println("---Undo Deposit Transaction---");
		System.out.println(acc);
		System.out.println("Deposit Amount = " + amount);
		acc.withdraw(amount);
		System.out.println("After undo deposit, balance = " + acc.getBalance());
		System.out.println("----End------");
		
	}
}
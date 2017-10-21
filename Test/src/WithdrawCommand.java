public class WithdrawCommand implements Command {
	Account acc;
	double amount;
	public WithdrawCommand(Account account, double amt) {
		this.acc = account;
		this.amount = amt;
	}
	
	public void execute() {
		System.out.println("---Withdraw Transaction---");
		System.out.println(acc);
		System.out.println("Withdraw Amount = " + amount);
		acc.withdraw(amount);
		System.out.println("After uithdraw, balance = " + acc.getBalance());
		System.out.println("----End------");
	}
	
	public void undo() {
		System.out.println("---Undo Withdraw Transaction---");
		System.out.println(acc);
		System.out.println("Withdraw Amount = " + amount);
		acc.deposit(amount);
		System.out.println("After undo uithdraw, balance = " + acc.getBalance());
		System.out.println("----End------");
		
	}
}
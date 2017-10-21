import java.util.Stack;

public class MainNoCommand {
	public static void main(String[] args) {
		double [] balance = {100.0, 200.0};

		double amount;
		
		Account acc[] = new Account[2];

		Stack commandStack = new Stack();
		
		for (int i = 0; i < acc.length; i++) {
			acc[i] = new Account(i, balance[i]);
		}

		// execute the commands in order
		System.out.println("Execute Comannds Begin");

		amount = 30.0;
		
		// deposit command
		System.out.println("---Deposit Transaction---");
		System.out.println(acc[0]);
		System.out.println("Deposit Amount = " + amount);
		acc[0].deposit(amount);
		System.out.println("After deposit, balance = " + acc[0].getBalance());
		System.out.println("----End------");
		
		
		// save the deposit command in the stack for undo
		commandStack.push(new Double(amount));
		commandStack.push(acc[0]);
		commandStack.push("deposit");
		
		amount = 40.0;
		
		// withdraw command
		System.out.println("---Withdraw Transaction---");
		System.out.println(acc[1]);
		System.out.println("Withdraw Amount = " + amount);
		acc[1].withdraw(amount);
		System.out.println("After uithdraw, balance = " + acc[1].getBalance());
		System.out.println("----End------");
		
	
		// save the withdraw command in the stack for undo
		commandStack.push(new Double(amount));
		commandStack.push(acc[1]);
		commandStack.push("withdraw");	
		
		System.out.println();
		System.out.println("Undo Commands Begin");
		// undo the commands
		while (!commandStack.empty()) {
			// get the latest command in the stack
			String c = (String) commandStack.pop();
			if (c.equals("deposit")) {
				Account account = (Account) commandStack.pop();
				amount = ((Double) commandStack.pop()).doubleValue();
				System.out.println("---Undo Deposit Transaction---");
				System.out.println(account);
				System.out.println("Deposit Amount = " + amount);
				account.withdraw(amount);
				System.out.println("After undo deposit, balance = " + account.getBalance());
				System.out.println("----End------");			
			} else if (c.equals("withdraw")) {
				Account account = (Account) commandStack.pop();
				amount = ((Double) commandStack.pop()).doubleValue();
				System.out.println("---Undo Withdraw Transaction---");
				System.out.println(account);
				System.out.println("Withdraw Amount = " + amount);
				account.deposit(amount);
				System.out.println("After undo withdraw, balance = " + account.getBalance());
				System.out.println("----End------");
			}

		}
	}

}
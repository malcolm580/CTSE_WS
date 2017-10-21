import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		double [] balance = {100.0, 200.0};
		
		double [] amt = {50.0, 20.0};
		
		Account acc[] = new Account[2];
		Command[] com = new Command[4];
		Stack commandStack = new Stack();
		
		for (int i = 0; i < acc.length; i++) {
			acc[i] = new Account(i, balance[i]);
		}
		
		com[0] = new DepositCommand(acc[0], 30.0);
		com[1] = new WithdrawCommand(acc[1], 40.0);
		com[2] = new WithdrawCommand(acc[0], 20.0);
		com[3] = new DepositCommand(acc[1], 30.0);
		
		// execute the commands in order
		System.out.println("Execute Comannds Begin");
		for (int i = 0; i < com.length; i++) {
			com[i].execute();
			commandStack.push(com[i]); // add the command in the stack
		}
		System.out.println();
		System.out.println("Undo Commands Begin");
		// undo the commands
		while (!commandStack.empty()) {
			// get the latest command in the stack
			Command c = (Command) commandStack.pop();
			// undo the latest command
			c.undo();
		}
	}

}
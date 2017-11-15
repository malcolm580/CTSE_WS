package Lab6.Part2;

public class Account {

     Customer customer;
     String accountNumber;
     double balance;

    public Account(  String accountNumber , double balance ){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void increase ( double amount ){
        this.balance += amount;
        System.out.println("--- account number:" + this.accountNumber + " increase amount" + amount );
    }

    public void decrease ( double amount){
        this.balance -= amount;
        System.out.println("--- account number:" + this.accountNumber + " decrease amount" + amount );
    }

    @Override
    public String toString() {
        return "Account number :" + this.accountNumber+ " has balance " + this.balance;
    }
}

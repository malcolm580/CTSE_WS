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
        this.balance -= amount;
    }

    public void decrease ( double amount){
        this.balance += amount;
    }

}

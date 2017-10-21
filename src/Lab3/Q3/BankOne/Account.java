package Lab3.Q3.BankOne;

public class Account {

    private Customer customer;
    private String accountNumber;
    private double balance;

    public Account(  String accountNumber , double balance ){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void debit ( double amount ){
        this.balance -= amount;
    }

    public void credit ( double amount){
        this.balance += amount;
    }

}

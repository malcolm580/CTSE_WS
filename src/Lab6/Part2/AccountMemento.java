package Lab6.Part2;

public class AccountMemento implements Memento{

    private Account memAccount;
    private Customer memCustomer;
    private String memAccountNumber;
    private double memBalance;

    public AccountMemento(Account acct){
        memAccount = acct;
        memCustomer = acct.customer;
        memAccountNumber = acct.accountNumber;
        memBalance = acct.balance;
    }

    @Override
    public void restore() {
        memAccount.customer =  memCustomer;
        memAccount.accountNumber =  memAccountNumber;
        memAccount.balance =  memBalance;
    }
}

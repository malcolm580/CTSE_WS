package Lab3.Q3.KWBank;

//Account = InternationalAccount

public class InternationalAccount {

    private Client client;
    private String accountNumber;
    private double balance;
    private String currency;
    private ForeignExchangeCalculator FEC;

    public InternationalAccount(String accountNumber, double balance, String currency){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public void setCalculator(  ForeignExchangeCalculator calculator ){
        this.FEC = calculator;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double showBalance() {
        return balance;
    }

    public double showBalanceInUSD() {
        if (this.currency.equals("USD")){
            return this.balance;
        }else{
            return FEC.HKD2USD(this.balance);
        }

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void increase ( double amount ){
        this.balance -= amount;
    }

    public void decrease ( double amount){
        this.balance += amount;
    }
}

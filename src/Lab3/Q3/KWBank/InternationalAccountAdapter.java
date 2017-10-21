// Adapter = InternationalAccountAdapter
// Target = InternationalAccount
// Adaptee = Account
// request() = Target's method = InternationalAccount's method

package Lab3.Q3.KWBank;

import Lab3.Q3.BankOne.Account;
import Lab3.Q3.BankOne.Customer;

public class InternationalAccountAdapter extends InternationalAccount {

    Account account;
    ForeignExchangeCalculator FEC;

    public InternationalAccountAdapter(Account a) {
        super(a.getAccountNumber(), a.getBalance(), "HKD");
        this.FEC =new ForeignExchangeCalculator();
        this.account = a;
    }

    public Account getAccount() {
        return account;
    }

    public void increase ( double amount ){
        account.debit(amount);
    }

    public void decrease ( double amount){
        account.credit(amount);
    }

    public double showBalance() {
        return account.getBalance();
    }

    public double showBalanceInUSD() {
        return FEC.HKD2USD(account.getBalance());
    }

    public Client getClient() {
        // get Customer form account
        // cast customer to client by adapter
        Customer c = account.getCustomer();
        return new ClientAdapter(c.getName(),c.getAddress(),c);
    }

    public void setClient(Client client) {
        // check if c is ClientAdapter
        // cast c to ClientAdapter type
        // get customer object form c
        // call account.setCustomer()
        if(client instanceof ClientAdapter){
            ClientAdapter ca = (ClientAdapter) client;
            Customer customer = ca.getCustomer();
            account.setCustomer(customer);
        }
    }
}

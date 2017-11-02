package Lab6.Part2;

import java.util.Enumeration;
import java.util.Vector;

//Class A = customer
//Class B = account


public class Customer {
     String name;
     String address;

     Vector<Account> Accounts;

    public Customer(String name , String address) {
        Accounts = new Vector();
        this.name = name;
        this.address = address;
        System.out.println("Customer: " + this.name + "is created.");
    }

    // Methods for vector
    public Enumeration getAccounts() {
        return(Accounts.elements());
    }
    public void removeAccount (Account b) {
        Accounts.remove(b);
    }
    public void addAccount(Account b) {
        Accounts.add(b);
        System.out.println("--- add account : " + b.accountNumber);
    }

    @Override
    public String toString() {
        String message = "\"SuperBank Customer :\" + this.name + \" at address: \" +this.address";
        for ( Account acct : Accounts) {
            message += "\n" + acct ;
        }
        return message ;
    }
}



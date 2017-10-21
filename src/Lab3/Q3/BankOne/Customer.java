package Lab3.Q3.BankOne;

import java.util.Enumeration;
import java.util.Vector;

//Class A = customer
//Class B = account


public class Customer {
    private String name;
    private String address;

    private Vector Accounts;

    public Customer(String name , String address) {
        Accounts = new Vector();
        this.name = name;
        this.address = address;
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
    }

    // Get set method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}



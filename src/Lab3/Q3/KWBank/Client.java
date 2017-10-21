package Lab3.Q3.KWBank;

import java.util.Enumeration;
import java.util.Vector;

//Class A = customer
//Class B = account


public class Client {
    private String name;
    private String address;

    private Vector Accounts;

    public Client(String name, String address) {
        Accounts = new Vector();
        this.name = name;
        this.address = address;
    }

    // Methods for vector
    public Enumeration getInternationalAccounts() {
        return (Accounts.elements());
    }

    public void removeInternationalAccount(InternationalAccount b) {
        Accounts.remove(b);
    }

    public void addInternationalAccount(InternationalAccount b) {
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



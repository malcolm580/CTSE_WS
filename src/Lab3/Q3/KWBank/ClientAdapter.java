// Adapter = ClientAdapter
// Target = client;
// Adaptee = customer;
// request() = client's method = removeInternationalAccount / addInternationalAccount / get set methods

package Lab3.Q3.KWBank;

import java.util.Enumeration;
import java.util.Vector;

import Lab3.Q3.BankOne.Account;
import Lab3.Q3.BankOne.Customer;


class ClientAdapter extends Client {

    Customer customer;

    public ClientAdapter(String name, String address , Customer customer) {
        super(name , address);
        this.customer = customer;
    }
    // Methods for vector
    public Enumeration getInternationalAccounts() {
        // use IAadater to change the accounts get type
        // use whileloop for Enumeration to save into vector
        // return by vector.elements
        Enumeration accounts = customer.getAccounts();
        Vector result = new Vector();
        while (accounts.hasMoreElements()){
            Account a = (Account) accounts.nextElement();
            InternationalAccount ia = new InternationalAccountAdapter(a);
            result.add(ia);
        }
        return result.elements();
    }

    public void removeInternationalAccount(InternationalAccount b) {
        // ask the para is the IAadapter or not --> true --> do
        // cast the para to IAA
        // delete the account for customer (e.g not client)
        if( b instanceof InternationalAccountAdapter ){
            InternationalAccountAdapter iaa = (InternationalAccountAdapter)b;
            Account account = iaa.getAccount();
            customer.removeAccount(account);
        }
    }

    public void addInternationalAccount(InternationalAccount b) {
        //...
        if( b instanceof InternationalAccountAdapter ){
            InternationalAccountAdapter iaa = (InternationalAccountAdapter)b;
            Account account = iaa.getAccount();
            customer.addAccount(account);
        }
    }

    public String getName() {
        return customer.getName();
    }

    public void setName(String name) {
        customer.setName(name);
    }

    public String getAddress() {
        return customer.getAddress();
    }

    public void setAddress(String address) {
        customer.setAddress(address);
    }

    public Customer getCustomer(){
        return customer;
    }
}

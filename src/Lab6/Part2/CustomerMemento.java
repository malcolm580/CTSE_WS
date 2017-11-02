package Lab6.Part2;

import java.util.Vector;

public class CustomerMemento implements Memento{

    private Customer custMem;
    private String memName;
    private String memAddress;
    private Vector<Account> memAccounts;

    public CustomerMemento( Customer cust){
        custMem = cust;
        memName = cust.name;
        memAddress = cust.address;
        memAccounts = new Vector<Account>();
        memAccounts.addAll(cust.Accounts);
    }

    @Override
    public void restore() {
        custMem.Accounts = memAccounts;
        custMem.name = memName;
        custMem.address = memAddress;
    }
}

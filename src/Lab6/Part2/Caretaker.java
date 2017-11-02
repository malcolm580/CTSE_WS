package Lab6.Part2;

import java.util.Vector;

public class Caretaker {

    private Vector<Memento> undoList;

    public Caretaker(){
        undoList = new Vector<>();
    }

    public void saveAccount(Account acct){
        Memento add = new AccountMemento(acct);
        undoList.addElement(add);
    }

    public void saveCustomer (Customer cust){
        Memento add = new CustomerMemento(cust);
        undoList.addElement(add);
    }

    public void undo(){
        Memento undoMememto = (Memento) undoList.remove(undoList.size()-1);
        undoMememto.restore();
    }

}

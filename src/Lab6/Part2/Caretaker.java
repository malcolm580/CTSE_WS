package Lab6.Part2;

import java.util.Vector;

public class Caretaker {

    private Vector<Memento> undoList;

    public Caretaker(){
        undoList = new Vector<>();
    }

    public void saveMyAccount(Account acct){
        Memento add = new AccountMemento(acct);
        undoList.addElement(add);
    }

    public void undo(){
        Memento undoMememto = (Memento) undoList.remove(undoList.size()-1);
        undoMememto.restore();
    }

}

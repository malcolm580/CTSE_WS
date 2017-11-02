package Lab6.Part1;


import java.util.Vector;

public class Caretaker {

    private Vector<Memento> undoList;

    public Caretaker(){
        undoList = new Vector<>();
    }

    public void saveMyClass(MyClass mc){
        Memento add = new Memento(mc);
        undoList.addElement(add);
    }

    public void undo(){
        Memento undoMememto = (Memento) undoList.remove(undoList.size()-1);
        undoMememto.restore();
    }

}

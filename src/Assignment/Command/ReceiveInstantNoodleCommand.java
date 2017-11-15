package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.InstantNoodle;
import Assignment.Stock.InstantNoodleMemento;
import Assignment.Stock.Memento;

public class ReceiveInstantNoodleCommand implements Command {

    protected Memento memento;
    protected InstantNoodle noodle;
    protected int recValue;

    public ReceiveInstantNoodleCommand(FoodItem edited, int recValue) {
        this.noodle = (InstantNoodle) edited;
        this.recValue = recValue;
        this.memento = new InstantNoodleMemento(noodle, noodle.getBalance() , noodle.getWeight() );
    }

    @Override
    public void run(AppData data) {
        noodle.setBalance(noodle.getBalance() + recValue);
    }


    @Override
    public void undo(AppData data) {
        memento.restore();
    }


    public String toString() {
        return "Receive "+ recValue +" "+ noodle.getItemID() + " " + noodle.getName();
    }

}

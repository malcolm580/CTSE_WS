package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.*;

public class DistributeInstantNoodleCommand implements Command {

    protected Memento memento;
    protected InstantNoodle noodle;
    protected int disValue;

    public DistributeInstantNoodleCommand(FoodItem edited, int disValue) {
        this.noodle = (InstantNoodle) edited;
        this.disValue = disValue;
        this.memento = new InstantNoodleMemento(noodle, noodle.getBalance() , noodle.getWeight() );
    }

    @Override
    public void run(AppData data) {
        noodle.setBalance(noodle.getBalance()-disValue);
        System.out.println("Distributed " + disValue + " packs of "+ noodle.getName() +". Currect quantity is " + noodle.getBalance());
    }


    @Override
    public void undo(AppData data) {
        memento.restore();
    }


    public String toString() {
        return "Distribute "+disValue+" "+ noodle.getItemID() + " " + noodle.getName();
    }

}

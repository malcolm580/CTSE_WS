package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Memento;
import Assignment.Stock.Rice;
import Assignment.Stock.RiceMemento;

public class DistributeRiceCommand implements Command {

    protected Memento memento;
    protected Rice rice;
    protected int disValue;

    public DistributeRiceCommand(FoodItem edited, int disValue) {
        this.rice = (Rice) edited;
        this.disValue = disValue;
        this.memento = new RiceMemento(rice, rice.getBalance(), rice.getType());
    }

    @Override
    public void run(AppData data) {
        rice.setBalance(rice.getBalance() - disValue);
        System.out.println("Distributed " + disValue + " packs of " + rice.getName() + ". Currect quantity is " + rice.getBalance());
    }


    @Override
    public void undo(AppData data) {
        memento.restore();
    }


    public String toString() {
        return "Distribute " + disValue + " " + rice.getItemID() + " " + rice.getName();
    }

}

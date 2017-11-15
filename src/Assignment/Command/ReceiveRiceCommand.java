package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Memento;
import Assignment.Stock.Rice;
import Assignment.Stock.RiceMemento;

public class ReceiveRiceCommand implements Command {

    protected Memento memento;
    protected Rice rice;
    protected int recValue;

    public ReceiveRiceCommand(FoodItem edited, int recValue) {
        this.rice = (Rice)edited;
        this.recValue = recValue;
        this.memento = new RiceMemento(rice, rice.getBalance() , rice.getType() );
    }

    @Override
    public void run(AppData data) {
        rice.setBalance(rice.getBalance() + recValue);
    }


    @Override
    public void undo(AppData data) {
        memento.restore();
    }


    public String toString() {
        return "Receive "+ recValue +" "+ rice.getItemID() + " " + rice.getName();
    }

}

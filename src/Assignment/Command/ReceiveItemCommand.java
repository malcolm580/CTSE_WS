package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Memento;

public class ReceiveItemCommand implements Command {

    protected Memento memento;
    protected FoodItem edited;
    protected int recValue;

    public ReceiveItemCommand(Memento memento, FoodItem edited, int recValue) {
        this.memento = memento;
        this.edited = edited;
        this.recValue = recValue;
    }

    @Override
    public void run(AppData data) {
        edited.setBalance(edited.getBalance()+ recValue);
    }

    @Override
    public void undo(AppData data) {
        memento.restore();
    }

    @Override
    public String toString() {
        return "Receive "+ recValue +" "+ edited.getItemID() + " " + edited.getName();
    }
}

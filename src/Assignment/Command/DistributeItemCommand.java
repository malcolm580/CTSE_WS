package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class DistributeItemCommand implements Command {

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected Memento memento;
    protected FoodItem edited;
    protected int disValue;

    public DistributeItemCommand(Memento memento, FoodItem edited, int disValue) {
        this.memento = memento;
        this.edited = edited;
        this.disValue = disValue;
    }

    @Override
    public void run(AppData data) {
        edited.setBalance(edited.getBalance()-disValue);
    }


    @Override
    public void undo(AppData data) {
        memento.restore();
//        data.addRedo(this);
    }


    public String toString() {
        return "Distribute "+disValue+" "+ edited.getItemID() + " " + edited.getName();
    }
}

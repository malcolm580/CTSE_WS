package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class ShowCommand implements Command {

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;

    @Override
    public abstract void run(AppData data);

    @Override
    public void undo(AppData data) {

    }


}



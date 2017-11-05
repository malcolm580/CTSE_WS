package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CreateCommand implements Command{

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected FoodItem p;

    public void run(AppData data){
        p = factoryMethod();
        data.addFood(p);
        data.addUndo(this);
    }

    public abstract FoodItem factoryMethod( );

    @Override
    public void undo(AppData data) {
        data.removeFood(p);
    }

}

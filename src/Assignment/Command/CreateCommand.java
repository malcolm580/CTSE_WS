package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class CreateCommand implements Command{

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected FoodItem foodItem;

    public void run(AppData data){
        foodItem = factoryMethod();
        data.addFood(foodItem);
        data.addUndo(this);
    }

    public abstract FoodItem factoryMethod( );

    @Override
    public void undo(AppData data) {
        data.removeFood(foodItem);
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void redo(AppData data){
        data.addFood(foodItem);
    }


    @Override
    public String toString() {
        return foodItem.toString();
    }

}

package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class CreateCommand implements Command{

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected FoodItem p;

    public abstract FoodItem factoryMethod();

    public void run(AppData data){
        p = factoryMethod();
        data.addFood(p);
    }

    @Override
    public void undo(AppData data) {
        data.removeFood(p);
    }

}

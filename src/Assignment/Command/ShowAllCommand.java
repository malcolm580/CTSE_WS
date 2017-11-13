package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class ShowAllCommand extends ShowCommand {

    @Override
    public void run(AppData data) {
        Vector items = data.getFoodItems();
        if(items.size() == 0){
            System.out.println("No food item at stock");
        }else{
            System.out.println("Food item information");
            System.out.println("ID \t Name \t Quantity \t Other Info");
            for (Object item: items ) {
                System.out.print(item);
            }
        }
    }

}


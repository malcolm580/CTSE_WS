package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShowAllCommand extends ShowCommand {

    @Override
    public void run(AppData data) {
        System.out.println("Food item information");
        System.out.println("ID \t Name \t Quantity \t Other Info");
        for (Object item: data.getFoodItems() ) {
            System.out.print(item);
        }
    }

}


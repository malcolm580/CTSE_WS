package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Rice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowRiceCommand extends ShowCommand {

    private int id;

    public ShowRiceCommand(String id){
        this.id = Integer.parseInt(id);
    }

    @Override
    public void run(AppData data) {
        FoodItem target = null;
        target = data.findFood(id);
        Rice rice = (Rice)target;
        if (target == null){
            System.out.println("No item with this ID");
        }else{
            System.out.println("Food item information");
            System.out.println("ID: " + rice.getItemID());
            System.out.println("Name: " + rice.getName());
            System.out.println("Quantity: " + rice.getBalance());
            System.out.println("Type: " + rice.getType() );
        }
    }

}



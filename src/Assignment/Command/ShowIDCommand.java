package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowIDCommand extends ShowCommand {

    private int id;

    public ShowIDCommand(String id){
        this.id = Integer.parseInt(id);
    }

    @Override
    public void run(AppData data) {
        FoodItem target = null;
        target = data.findFood(id);
        if (target == null){
            System.out.println("No item with this ID");
        }else{
            System.out.println("Food item information");
            target.showInfo();
        }
    }

}



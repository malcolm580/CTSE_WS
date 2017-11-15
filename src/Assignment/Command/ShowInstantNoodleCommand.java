package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.InstantNoodle;
import Assignment.Stock.Rice;

public class ShowInstantNoodleCommand extends ShowCommand {

    private int id;

    public ShowInstantNoodleCommand(String id){
        this.id = Integer.parseInt(id);
    }

    @Override
    public void run(AppData data) {
        FoodItem target = null;
        target = data.findFood(id);
        InstantNoodle noodle = (InstantNoodle)target;
        if (target == null){
            System.out.println("No item with this ID");
        }else{
            System.out.println("Food item information");
            System.out.println("ID: " + noodle.getItemID());
            System.out.println("Name: " + noodle.getName());
            System.out.println("Quantity: " + noodle.getBalance());
            System.out.println("Weight: " + noodle.getWeight() );
        }
    }

}



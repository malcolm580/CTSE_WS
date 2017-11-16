package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Rice;

import java.io.IOException;

public class RiceCreateCommand extends CreateCommand {

    @Override
    public FoodItem factoryMethod() {

        // Ask for  rice's id , name , type to be created
        System.out.println("Enter (integer) id , (String) name , (String) type:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        inputSpilt = line.split(",");

        // Parse the string input to integer for the food item initiation
        try {
            int id = Integer.parseInt(inputSpilt[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Please input Integer as ItemID");
        }

        return new Rice(inputSpilt);
    }
}

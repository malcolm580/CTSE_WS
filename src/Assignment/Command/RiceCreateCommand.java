package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Rice;

import java.io.IOException;

public class RiceCreateCommand extends CreateCommand {

    @Override
    public FoodItem factoryMethod() {

        System.out.println("Enter (integer) id , (String) name , (String) type:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        inputSpilt = line.split(",");

        try{
            int id = Integer.parseInt(inputSpilt[0]);
        }catch (NumberFormatException ex){
            System.out.print("Please input Integer as ItemID");
        }

        return new Rice(inputSpilt);
    }
}

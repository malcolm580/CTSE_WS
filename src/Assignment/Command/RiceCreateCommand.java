package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.Rice;

import java.io.IOException;

public class RiceCreateCommand extends CreateCommand {

    @Override
    public FoodItem factoryMethod() {

        System.out.println("Enter id , name , type:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] inputSpilt = line.split(",");

        try{
            int id = Integer.parseInt(inputSpilt[0]);
        }catch (NumberFormatException ex){
            System.out.print("Please input Integer as ItemID");
        }


        return new Rice(inputSpilt);
    }
}

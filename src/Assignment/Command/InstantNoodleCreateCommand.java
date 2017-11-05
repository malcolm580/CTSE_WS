package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;
import Assignment.Stock.InstantNoodle;

import java.io.IOException;

public class InstantNoodleCreateCommand extends CreateCommand {

    public FoodItem factoryMethod( ) {

        System.out.println("Enter id , name , weight:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] inputSpilt = line.split(",");

        try{
            int id = Integer.parseInt(inputSpilt[0]);
            int weight = Integer.parseInt(inputSpilt[2]);
        }catch (NumberFormatException ex){
            System.out.print("Please input Integer as ItemID");
        }

        return new InstantNoodle(inputSpilt);
    }


}
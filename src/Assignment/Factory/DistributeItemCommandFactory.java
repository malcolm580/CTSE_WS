package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Stock.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class DistributeItemCommandFactory extends Factory {

    public DistributeItemCommandFactory(){
        // insert a String index array for user option
        commandMap = new HashMap();
        commandMap.put("Rice","Assignment.Command.DistributeRiceCommand");
        commandMap.put("InstantNoodle","Assignment.Command.DistributeInstantNoodleCommand");
    }

    @Override
    public Command create() throws Exception {
        Memento memento = null;
        FoodItem edited;
        int disValue;
        Command command;

        //Enter ID for the food to be distribute
        System.out.println("Enter id code;");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        edited = data.findFood(Integer.parseInt(line));

        //Enter quantity for the food to be distribute
        System.out.println("Quantity to distribute;");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        disValue = Integer.parseInt(line);

        //Create a new distribute command instance for user input
        Constructor c = Class.forName( (String) commandMap.get( edited.getClass().getSimpleName() ) ).getConstructor(FoodItem.class , Integer.TYPE);
        command  = (Command) c.newInstance(edited , disValue);
        data.addUndo(command);
        return command ;
    }
}

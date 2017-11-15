package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Stock.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class ReceiveItemCommandFactory extends Factory {

    public ReceiveItemCommandFactory() {
        commandMap = new HashMap();
        commandMap.put("Rice" , "Assignment.Command.ReceiveRiceCommand");
        commandMap.put("InstantNoodle" , "Assignment.Command.ReceiveInstantNoodleCommand");
    }

    @Override
    public Command create() throws Exception {
        Memento memento = null;
        FoodItem edited;
        int recValue;
        Command command = null;

        System.out.println("Enter id code;");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        edited = data.findFood(Integer.parseInt(line));

        System.out.println("Quantity to Receive;");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        recValue = Integer.parseInt(line);

       try{
           Constructor c = Class.forName( (String) commandMap.get( edited.getClass().getSimpleName() ) ).getConstructor(FoodItem.class , Integer.TYPE);
           command  = (Command) c.newInstance(edited , recValue);
           data.addUndo(command);

       }catch (Exception ex){
           ex.printStackTrace();
       }
        return command ;
    }
}

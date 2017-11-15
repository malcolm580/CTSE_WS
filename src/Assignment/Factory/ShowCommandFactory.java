package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Stock.FoodItem;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;


public class ShowCommandFactory extends Factory {

    public ShowCommandFactory(){
        commandMap = new HashMap();
        commandMap.put("*","Assignment.Command.ShowAllCommand");
        commandMap.put("Rice","Assignment.Command.ShowRiceCommand");
        commandMap.put("InstantNoodle","Assignment.Command.ShowInstantNoodleCommand");
    }

    @Override
    public Command create() throws Exception {
        System.out.println("Enter ID (* to show all):");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(line.equals("*")){
            command = (Command) Class.forName((String) commandMap.get("*")).newInstance();
        }else{
            FoodItem item  = data.findFood(Integer.parseInt(line));
            Constructor c = Class.forName( (String) commandMap.get( item.getClass().getSimpleName() ) ).getConstructor(String.class);
            command  = (Command) c.newInstance(line);
        }
        return command ;
    }
}

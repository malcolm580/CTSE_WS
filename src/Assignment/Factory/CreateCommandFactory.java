package Assignment.Factory;

import Assignment.AppData;
import Assignment.Command.Command;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class CreateCommandFactory extends Factory {

    public CreateCommandFactory (){
        // insert a String index array for user option
        commandMap = new HashMap();
        commandMap.put("ri","Assignment.Command.RiceCreateCommand");
        commandMap.put("in","Assignment.Command.InstantNoodleCreateCommand");
    }

    @Override
    public Command create() throws Exception {

        //Ask for which type of food item to be create
        System.out.println("Enter food type (ri = rice / in = instant noodle):");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String input = line;
        String foodType = (String) commandMap.get(input);

        //Create responding create item by the user input
        try{
            command = (Command) Class.forName(foodType).newInstance();
        }catch (ClassNotFoundException | NullPointerException ex){
            System.out.println("Command not found");
        }
        data.addUndo(command);
        return command ;
    }
}

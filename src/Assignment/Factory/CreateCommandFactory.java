package Assignment.Factory;

import Assignment.Command.Command;

import java.io.IOException;
import java.util.HashMap;

public class CreateCommandFactory extends Factory {

    public CreateCommandFactory (){
        commandMap = new HashMap();
        commandMap.put("ri","Assignment.Command.RiceCreateCommand");
        commandMap.put("in","Assignment.Command.InstantNoodleCreateCommand");
    }

    @Override
    public Command create() throws Exception {
        System.out.println("Enter food type (ri = rice / in = instant noodle):");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String input = line;
        String foodType = (String) commandMap.get(input);
        try{
             command = (Command) Class.forName(foodType).newInstance();
        }catch (ClassNotFoundException ex){
            System.out.print("Class not found");
        }
        return command ;
    }
}

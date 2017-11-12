package Assignment.Factory;

import Assignment.Command.Command;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;


public class ShowCommandFactory extends Factory {

    public ShowCommandFactory(){
        commandMap = new HashMap();
        commandMap.put("*","Assignment.Command.ShowAllCommand");
        commandMap.put("id","Assignment.Command.ShowIDCommand");
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
            Class<?> cl = Class.forName((String) commandMap.get("id"));
            Constructor<?> cons = cl.getConstructor(String.class);
            command = (Command) cons.newInstance(line);
        }
        return command ;
    }
}

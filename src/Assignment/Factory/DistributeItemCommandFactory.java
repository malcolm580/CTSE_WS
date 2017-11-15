package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.DistributeItemCommand;
import Assignment.Stock.*;

import java.io.IOException;
import java.util.Objects;

public class DistributeItemCommandFactory extends Factory {


    @Override
    public Command create() throws Exception {
        Memento memento = null;
        FoodItem edited;
        int disValue;
        Command command;

        System.out.println("Enter id code;");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        edited = data.findFood(Integer.parseInt(line));

        if(Objects.equals(edited.mementoName(), "RiceMemento")){
            Rice rice = (Rice)edited;
            edited = rice;
            memento = new RiceMemento(rice, rice.getBalance() , rice.getType());
        }else if(Objects.equals(edited.mementoName(), "InstantNoodleMemento")){
            InstantNoodle instantNoodle = (InstantNoodle) edited;
            edited = instantNoodle ;
            memento = new InstantNoodleMemento(instantNoodle, instantNoodle.getBalance() , instantNoodle.getWeight());
        }

        System.out.println("Quantity to distribute;");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.print("Please input correct format");
        }
        disValue = Integer.parseInt(line);
        command = new DistributeItemCommand(memento,edited,disValue);
        data.addUndo(command);
        return command ;
    }
}

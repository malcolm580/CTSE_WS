package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class DistributeItemCommand implements Command {

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected Memento memento;
    protected FoodItem edited;
    protected int disValue;

    @Override
    public void run(AppData data) {
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
        edited.setBalance(edited.getBalance()-disValue);

        data.addUndo(this);
    }


    @Override
    public void undo(AppData data) {
        memento.restore();
    }

    @Override
    public void redo(AppData data) {

    }

    public String toString() {
        return "Distribute "+disValue+" "+ edited.getItemID() + " " + edited.getName();
    }
}

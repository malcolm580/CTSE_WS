package Assignment;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

public class AppData {

    private Stack undoStack;
    private Stack redoStack;
    private Vector foodItems;
    private HashMap commandMap;

    public String  CreateCommandMessage = "Enter food type (ri=rice / in=instance noodle)";

    public AppData() {
        this.undoStack = new Stack();
        this.redoStack = new Stack();
        this.foodItems = new Vector();
        this.commandMap = new HashMap();
        commandMap.put("c","Command");
        commandMap.put("ri","RiceCreateCommand");
        commandMap.put("in","InstantNoodleCreateCommand");
    }

    public Stack getUndoStack() {
        return undoStack;
    }

    public Stack getRedoStack() {
        return redoStack;
    }


    public Vector getFoodItems() {
        return foodItems;
    }

    public HashMap getCommandMap() {
        return commandMap;
    }

    public void addUndo(Command undo){
        this.undoStack.push(undo);
    }

    public Object removeUndo(){
        return this.undoStack.pop();
    }

    public void addRedo(Command redo){
        this.redoStack.push(redo);
    }

    public Object removeRedo(){
        return this.redoStack.pop();
    }

    public void addFood( FoodItem food ){
         this.foodItems.add(food);
    }

    public void removeFood ( FoodItem food){
        this.foodItems.remove(food);
    }

}

package Assignment;

import java.util.Stack;
import java.util.Vector;

public class AppData {

    private Stack undoStack;
    private Stack redoStack;
    private Vector foodItems;

    public AppData() {
        this.undoStack = new Stack();
        this.redoStack = new Stack();
        this.foodItems = new Vector();
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

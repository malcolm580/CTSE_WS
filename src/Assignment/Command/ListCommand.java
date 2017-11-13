package Assignment.Command;

import Assignment.AppData;

import java.util.EmptyStackException;
import java.util.Stack;

public class ListCommand implements Command {
    @Override
    public void run(AppData data) {
        Stack undo = data.getUndoStack();
        System.out.println("Undo");
        for(int i=undo.size()-1; i>=0;i--){

            System.out.println(undo.get(i));
        }

        Stack redo = data.getRedoStack();
        System.out.println("Redo");
        for(int i=redo.size()-1; i>=0;i--){

            System.out.println(redo.get(i));
        }
    }

    @Override
    public void undo(AppData data) {

    }

}

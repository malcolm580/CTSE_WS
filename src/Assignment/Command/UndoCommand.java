package Assignment.Command;

import Assignment.AppData;

import java.util.EmptyStackException;
import java.util.Stack;

public class UndoCommand implements Command {

    @Override
    public void run(AppData data) {
        try{
            Command command = (Command) data.removeUndo();
            command.undo(data);
            data.addRedo(command);
        }catch (EmptyStackException ex){
            System.out.println("No more undo stack");
        }
    }

    @Override
    public void undo(AppData data) {

    }

    @Override
    public void redo(AppData data) {

    }
}

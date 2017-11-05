package Assignment.Command;

import Assignment.AppData;

import java.util.Stack;

public class UndoCommand implements Command {
    @Override
    public void run(AppData data) {
        Command command = (Command) data.removeUndo();
        if (command instanceof CreateCommand){
            command.undo(data);
            data.addRedo(command);
        }
    }

    @Override
    public void undo(AppData data) {

    }

    @Override
    public void redo(AppData data) {

    }
}

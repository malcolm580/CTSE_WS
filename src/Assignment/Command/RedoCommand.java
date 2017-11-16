package Assignment.Command;

import Assignment.AppData;

import java.util.EmptyStackException;

public class RedoCommand implements Command {
    @Override
    public void run(AppData data) {
        try {
            Command command = (Command) data.removeRedo();
            command.run(data);
            data.addUndo(command);
            System.out.println("Redo Complete");
        } catch (EmptyStackException ex) {
            System.out.println("No more redo stack");
        }
    }

    @Override
    public void undo(AppData data) {

    }

}

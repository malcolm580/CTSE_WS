package Assignment.Command;

import Assignment.AppData;

public class RedoCommand implements Command {
    @Override
    public void run(AppData data) {
        Command command = (Command) data.removeRedo();
        if (command instanceof CreateCommand){
            command.redo(data);
            data.addUndo(command);
        }
    }

    @Override
    public void undo(AppData data) {

    }

    @Override
    public void redo(AppData data) {

    }
}

package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.UndoCommand;

public class UndoCommandFactory extends Factory {
    @Override
    public Command create() throws Exception {
        return new UndoCommand();
    }
}

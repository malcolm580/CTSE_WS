package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.RedoCommand;

public class RedoCommandFactory extends Factory {
    @Override
    public Command create() throws Exception {
        return new RedoCommand();
    }
}

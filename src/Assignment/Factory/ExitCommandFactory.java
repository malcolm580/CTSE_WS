package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.ExitCommand;

public class ExitCommandFactory extends Factory {
    @Override
    public Command create() throws Exception {
        return new ExitCommand();
    }
}

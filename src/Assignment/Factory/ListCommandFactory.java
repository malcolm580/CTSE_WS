package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.ListCommand;

public class ListCommandFactory extends Factory {
    @Override
    public Command create() throws Exception {
        return new ListCommand();
    }
}

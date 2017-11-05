package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.ReceiveItemCommand;

public class ReceiveItemCommandFactory extends Factory {
    @Override
    public Command create() throws Exception {
        return new ReceiveItemCommand();
    }
}

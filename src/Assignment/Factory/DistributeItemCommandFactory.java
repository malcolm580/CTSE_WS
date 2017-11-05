package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.DistributeItemCommand;

public class DistributeItemCommandFactory extends Factory {
    @Override
    public Command create() throws Exception {
        return new DistributeItemCommand();
    }
}

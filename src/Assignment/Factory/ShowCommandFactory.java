package Assignment.Factory;

import Assignment.Command.Command;
import Assignment.Command.ShowCommand;


public class ShowCommandFactory extends Factory {


    @Override
    public Command create() throws Exception {
        return new ShowCommand() ;
    }
}

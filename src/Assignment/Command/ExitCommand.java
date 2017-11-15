package Assignment.Command;

import Assignment.AppData;

import java.util.Stack;

public class ExitCommand implements Command {
    @Override
    public void run(AppData data) {
        System.out.println("Leaving System");
        System.exit(0);
    }

    @Override
    public void undo(AppData data) {

    }

}

package Lab5.Part1;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayList<Command> commands = new ArrayList<>();
        Stack commandStack = new Stack();

        commands.add(new Command1(1));
        commands.add(new Command2(2));
        commands.add(new Command1(3));
        commands.add(new Command2(4));

        for (Command command : commands) {
            command.execute();
            commandStack.push(command);
        }

        while (!commandStack.empty()){
            Command c = (Command)commandStack.pop();
            c.undo();
        }

    }
}

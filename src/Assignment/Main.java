package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import Assignment.Command.Command;
import Assignment.Factory.*;

public class Main {

    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        HashMap FactoryMap = new HashMap();
        AppData data = new AppData();
        Factory factory = null;
        Command command = null;
        String line;

        initMap(FactoryMap);

        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("Advanced Inventory Management System");
            System.out.println("Please enter command: [c | s | g | d | u | r | l | x]");
            System.out.println("c = create item, s = show item , g = receive item , d = distribute item,");
            System.out.println("u = undo , r =redo , l = list undo/redo , x = exit system");

            line = null;
            try {
                line = br.readLine();
            } catch (IOException e) {
                System.out.println("Please enter correct command name");
            }
            String input = line;
            String factoryTarget = (String) FactoryMap.get(input);
            try {
                factory = (Factory) Class.forName(factoryTarget).newInstance();
                factory.setData(data);
                command = factory.create();
                command.run(data);
            } catch (Exception e) {
                System.out.println("Class not found");
            }

        }

    }

    public static void initMap(HashMap FactoryMap) {
        FactoryMap.put("c", "Assignment.Factory.CreateCommandFactory");
        FactoryMap.put("u", "Assignment.Factory.UndoCommandFactory");
        FactoryMap.put("r", "Assignment.Factory.RedoCommandFactory");
        FactoryMap.put("s", "Assignment.Factory.ShowCommandFactory");
        FactoryMap.put("g", "Assignment.Factory.ReceiveItemCommandFactory");
        FactoryMap.put("d", "Assignment.Factory.DistributeItemCommandFactory");
        FactoryMap.put("l", "Assignment.Factory.ListCommandFactory");
        FactoryMap.put("x", "Assignment.Factory.ExitCommandFactory");
    }
}

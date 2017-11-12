package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

import Assignment.Command.Command;
import Assignment.Factory.*;

public class Main {

    public static void main(String [] args){

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        HashMap FactoryMap = new HashMap();
        AppData data = new AppData();
        Factory factory = null;
        Command command = null;
        String line;

        initMap(FactoryMap);

        while (true){
            System.out.println("");
            System.out.println("");
            System.out.println("Advanced Inventory Management System");
            System.out.println("Please enter command: [c | s | g | d | u | r | l | x]");
            System.out.println("c = create item, s = show item , g = receive item , d = distribute item,");
            System.out.println("u = undo . r =redo , l = list undo/redo , x=exit system");

            line = null;
            try {
                line = br.readLine();
            } catch (IOException e) {
                System.out.println("Please enter correct command name");
            }
            String input = line;
            String factoryTarget = (String) FactoryMap.get(input);
            try{
                factory = (Factory) Class.forName(factoryTarget).newInstance();
                command = factory.create();
                command.run(data);

                Vector get = data.getFoodItems();
                System.out.println("FoodItems");
                for ( Object item : get ) {
                    System.out.println(item);
                }

                Stack undo = data.getUndoStack();
                System.out.println("Undo");
                for(int i=undo.size()-1; i>=0;i--){

                    System.out.println(undo.get(i));
                }

                Stack redo = data.getRedoStack();
                System.out.println("Redo");
                for(int i=redo.size()-1; i>=0;i--){

                    System.out.println(redo.get(i));
                }
            } catch (Exception e) {
//                System.out.println("Class not found");
                e.printStackTrace();
            }

        }

    }

    public static void initMap(HashMap FactoryMap){
        FactoryMap.put("c","Assignment.Factory.CreateCommandFactory");
        FactoryMap.put("u","Assignment.Factory.UndoCommandFactory");
        FactoryMap.put("r","Assignment.Factory.RedoCommandFactory");
        FactoryMap.put("s","Assignment.Factory.ShowCommandFactory");
        FactoryMap.put("g","Assignment.Factory.ReceiveItemCommandFactory");
        FactoryMap.put("d","Assignment.Factory.DistributeItemCommandFactory");
    }
}

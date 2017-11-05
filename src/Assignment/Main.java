package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Vector;

import Assignment.Command.Command;
import Assignment.Factory.*;
import Assignment.Stock.FoodItem;

public class Main {

    public static void main(String [] args){

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        HashMap FactoryMap = new HashMap();
        AppData data = new AppData();
        Factory factory = null;
        Command command = null;
        String line;

        FactoryMap.put("c","Assignment.Factory.CreateCommandFactory");

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
                e.printStackTrace();
            }
            String input = line;
            String factoryTarget = (String) FactoryMap.get(input);
            try{
                factory = (Factory) Class.forName(factoryTarget).newInstance();
                command = factory.create();
                command.run(data);
                Vector get = data.getFoodItems();
                for ( Object item : get ) {
                    System.out.print(item);
                }
            }catch (ClassNotFoundException ex){
                System.out.print("Class not found");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.FoodItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowCommand implements Command {

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;

    @Override
    public void run(AppData data) {
        FoodItem target = null;
        int id = 0;
        System.out.println("Enter ID (* to show all):");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(line.equals("*")){
            System.out.println("Food item information");
            System.out.println("ID \t Name \t Quantity \t Other Info");
            for (Object item: data.getFoodItems() ) {
                System.out.print(item);
            }
        }else{
            try{
                id = Integer.parseInt(line);
            }catch (NumberFormatException ex){
                System.out.println("Please enter integer");
            }
            target = data.findFood(id);
            if (target == null){
                System.out.println("No item with this ID");
            }else{
                System.out.println("Food item information");
                target.showInfo();
            }
        }
    }

    @Override
    public void undo(AppData data) {

    }

    @Override
    public void redo(AppData data) {

    }
}

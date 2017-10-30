package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateCommand implements Command{

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected FoodItem p;

    public void run(AppData data) {
        System.out.print(data.CreateCommandMessage);
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String type = (String) data.getCommandMap().get(line);
        try {
            CreateCommand SubCreateCommand = (CreateCommand) Class.forName(type).newInstance();
            SubCreateCommand.run(data);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo(AppData data) {
        data.removeFood(p);
    }

}

package Lab5.Part3;

import java.io.IOException;

public class CreateRectangleFactory extends CommandFactory {
    @Override
    public Command create(){
        System.out.print("Enter width: ");
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int width = Integer.parseInt(line);
        System.out.print("Enter height: ");
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int height = Integer.parseInt(line);
        return new CreateRectangle(shapes,width ,height);
    }
}

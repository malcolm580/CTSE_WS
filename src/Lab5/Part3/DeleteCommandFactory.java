package Lab5.Part3;

import java.io.IOException;

public class DeleteCommandFactory extends CommandFactory {

    @Override
    public DeleteCommand create() throws Exception {
        System.out.print("Enter index of the shape: ");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = Integer.parseInt(line);
        if (index < 0 || index >= shapes.size()) throw new Exception("Out of Range");
        return new DeleteCommand(shapes,index);
    }
}

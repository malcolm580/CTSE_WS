package Lab5.Part3;

import java.io.IOException;

public class CreateCircleFactory extends CommandFactory {
    @Override
    public Command create(){
        System.out.print("Enter radius: ");
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int radius = Integer.parseInt(line);
        return new CreateCircle(shapes,radius);
    }
}

package Lab4.Part2To4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleFactory implements ShapeFactory {

    //Copy form main
    private InputStreamReader is = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(is);

    @Override
    public Shape createShape() {
        //return null;
        //Copy from main
        System.out.println("Enter radius:");
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int r = Integer.parseInt(line);
        System.out.println("New Circle: radius("+r+")");
        // Retrun the product
        return new Circle(0, 0, r);
    }
}

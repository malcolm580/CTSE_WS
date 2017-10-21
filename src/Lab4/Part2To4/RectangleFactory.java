package Lab4.Part2To4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleFactory implements ShapeFactory {

    //Copy form main
    private InputStreamReader is = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(is);
    private String line;
    @Override
    public Shape createShape() {
        //return null;
        //Copy from main
        System.out.println("Enter width:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int width = Integer.parseInt(line);
        System.out.println("Enter height:");
        line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int height = Integer.parseInt(line);
        Shape s = new Rectangle(0, 0, width, height);
        System.out.println("New Rectangle: width("+width+"),Height("+height+")");
        // Retrun the product
        return s;
    }
}

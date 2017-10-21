/*
* *
* <p>Title: </p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2004</p>
* <p>Company: </p>
* @author Clarence Lau
* @version 1.0
*/
package Lab4.Part2To4;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Vector _shapes = new Vector();
        boolean cont = true;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        //add for class.forname
        String[] factories = {"Part2To4.CircleFactory", "Part2To4.RectangleFactory"};

        try {
            while (cont) {
                System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
                String line = br.readLine();
                int command = Integer.parseInt(line);
                if (command == 0)
                    cont = false;
                else if (command == 1) {
                    for (int i = 0; i < _shapes.size(); i++)
                        ((Shape) _shapes.elementAt(i)).draw();
                } else {
                    ShapeFactory factory = (ShapeFactory) Class.forName(factories[command - 2]).newInstance();
                    Shape s = factory.createShape();
                    _shapes.add(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
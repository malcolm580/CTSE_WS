package Lab5.Part3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import java.io.IOException;

public abstract class CommandFactory {

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected Vector<Shape> shapes;
    protected String line;

    public abstract Command create() throws Exception;

    public Vector<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(Vector<Shape> shapes) {
        this.shapes = shapes;
    }
}

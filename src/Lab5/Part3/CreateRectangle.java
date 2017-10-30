package Lab5.Part3;

import java.util.Vector;

public class CreateRectangle implements Command {

    private int width;
    private int height;
    private Vector<Shape> shapes;
    private Shape shape;

    public CreateRectangle(Vector shapes , int width , int height){
        this.width = height;
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        shape = new Rectangle(width , height);
        shapes.add(shape);
    }

    @Override
    public void undo() {
        shapes.remove(shape);
    }



}

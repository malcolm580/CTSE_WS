package Lab5.Part3;

import java.util.Vector;

public class CreateCircle implements Command {

    private int radius;
    private Vector<Shape> shapes;
    private Shape shape;

    public CreateCircle(Vector shapes , int radius){
        this.radius = radius;
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        shape = new Circle(radius);
        shapes.add(shape);
    }

    @Override
    public void undo() {
        shapes.remove(shape);
    }



}

package Lab5.Part3;

import java.util.Vector;

public class DeleteCommand implements Command {

    private Vector<Shape> shapes;
    private int index;
    private Shape shape;

    public DeleteCommand(Vector shapes, int index) {
        this.shapes = shapes;
        this.index = index;
    }

    @Override
    public void execute() {
        shape = shapes.get(index);
        shapes.remove(shape);
    }

    @Override
    public void undo() {
        shapes.add(shape);
    }


}

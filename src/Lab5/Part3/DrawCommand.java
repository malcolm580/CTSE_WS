package Lab5.Part3;

import java.util.Vector;

public class DrawCommand implements Command {

    private Vector<Shape> shapes;

    public DrawCommand(Vector shapes){
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        for (int i = 0; i < shapes.size(); i++)
            ( (Shape) shapes.elementAt(i)).draw();
    }

    @Override
    public void undo() {

    }

}

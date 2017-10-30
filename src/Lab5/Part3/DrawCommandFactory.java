package Lab5.Part3;

public class DrawCommandFactory extends CommandFactory {
    @Override
    public Command create(){
        return new DrawCommand(shapes);
    }
}

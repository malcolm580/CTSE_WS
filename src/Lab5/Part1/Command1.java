package Lab5.Part1;

public class Command1 implements Command {

    private int id;

    public Command1( int id){
        this.id =id;
    }

    @Override
    public void execute() {
        System.out.println(id+ "Part1.NewLab5.Part1.Command1:execute()");
    }

    @Override
    public void undo() {
        System.out.println(id+ "Part1.NewLab5.Part1.Command1:undo()");
    }
}

package Lab5.Part1;

public class Command2 implements Command {

    private int id;

    public Command2(int id){
        this.id =id;
    }

    @Override
    public void execute() {
        System.out.println(id+ "Part1.Command2:execute()");
    }

    @Override
    public void undo() {
        System.out.println(id+ "Part1.Command2:undo()");
    }
}

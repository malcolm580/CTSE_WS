package Assignment;

public interface Command {

    public void run(AppData data);


    public void undo(AppData data);

}

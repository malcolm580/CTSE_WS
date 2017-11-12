package Assignment.Command;

import Assignment.AppData;

public interface Command {

    public void run(AppData data);


    public void undo(AppData data);



}

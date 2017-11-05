package Assignment.Command;

import Assignment.AppData;
import Assignment.Stock.Memento;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReceiveItemCommand implements Command {

    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected Memento memento;

    @Override
    public void run(AppData data) {

    }

    @Override
    public void undo(AppData data) {

    }

    @Override
    public void redo(AppData data) {

    }
}

package Assignment.Factory;

import Assignment.Command.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public abstract class Factory {
    HashMap commandMap;
    protected InputStreamReader is = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(is);
    protected String line;
    protected Command command;

    public abstract   Command create() throws Exception;

}

package Lab1.Q3;

import java.io.*;
public class Cal2 extends Cal {

    FileWriter outputFile;
    PrintWriter out;

    public Cal2() {
        try {
            outputFile = new FileWriter("log.txt");
            out = new PrintWriter(outputFile);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void log(String message) {
        out.println(message);
        out.flush();
    }

    protected void finalize() {
        out.close();
    }
}
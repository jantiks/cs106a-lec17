/*
this class maked histogram from midterm results
 */

import acm.program.*;
import java.io.*;

public class Histogram extends ConsoleProgram {
    public void run() {
        readFile();
    }

    // reads the file
    private void readFile() {
        try {
            BufferedReader rd = new BufferedReader(new FileReader("ffgfg.txt"));
            String line = rd.readLine();
            rd.close();
        } catch (Exception ex) {
            println("error");
        }
    }

    // instance variables

}

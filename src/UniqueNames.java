/*
this class cheks if users inputed names are unique
 */

import acm.program.*;

import java.util.ArrayList;

public class UniqueNames extends ConsoleProgram {
    public void run() {
        while(true) {
            String line = readLine("Enter name ");
            if (line.equals("")) break;
            names.add(line);
        }

        deleteNotUniqueNames();
        showNames();
    }

    private void deleteNotUniqueNames() {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            for (int j = i+1; j < names.size(); j++) {
                String otherName = names.get(j);
                if (name.equals(otherName)) {
                    names.remove(j);
                }
            }
        }
    }

    private void showNames() {
        println("unique name list");
        for (int i = 0; i < names.size(); i++) {
            println(names.get(i));
        }
    }



    //instance variables
    ArrayList<String> names = new ArrayList<String>();
}

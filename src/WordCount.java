import acm.program.*;
import acm.util.*;

import java.util.ArrayList;

public class WordCount extends ConsoleProgram {
    public void run() {
        ArrayList<String> lines = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Character> chars = new ArrayList<Character>();

        makeLines(lines);
        makeWords(words);
        makeChars(chars);

    }

    private void makeLines(ArrayList list) {
        String[] lines = str.split("\n");
        for (int i = 0 ; i < lines.length; i++) {
            list.add(lines[i]);
        }
        println("lines = " + list.size());
    }

    private void makeWords(ArrayList list ) {
        String[] lines = str.split("\n");

        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");
            for (int j = 0; j < words.length; j ++) {
                list.add(words[j]);
            }

        }
        println(list.size());
    }

    private void makeChars(ArrayList list) {
        for (int i = 0; i < str.length(); i ++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }
        println(list.size());
    }

    // constants
    private static final String str = "Poor naked wretches, wheresoe'er you are,\n" +
            "That bide the pelting of this pitiless storm, \n" +
            "ow shall your houseless heads and unfed sides, \n" +
            "Your loop'd and window'd raggedness, defend you \n" +
            "From seasons such as these? O, I have ta'en \n" +
            "Too little care of this!";

}

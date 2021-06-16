package oop.assignment3.ex45.base;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordReplacer {

    public String readInput(File input) throws IOException {
        //  scan the input file
        Scanner scan = new Scanner(input);
        //  initialize empty string for the input
        String ret = "";

        //  scans input file until there are no new lines
        while(scan.hasNextLine()) {
            //  concatenates every line of the input into the string
            ret = ret.concat(scan.nextLine() + "\n");
        }
        return ret;
    }

    public String replaceWords(String text) {
        //  replaces the word "utilize" with "use"
        text = text.replace("utilize", "use");
        return text;
    }
}

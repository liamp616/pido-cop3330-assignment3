package oop.assignment3.ex46.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindWords {
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

    public List<String> wordsToList(File input) throws IOException {
        FindWords fw = new FindWords();

        //  turn the input text into a string
        String string = fw.readInput(input);
        //  places all the words separated by a space into the array
        String[] words = string.split("\\W+");
        //  converts string array into string list
        List<String> ret = new ArrayList<String>(Arrays.asList(words));

        return ret;
    }
}

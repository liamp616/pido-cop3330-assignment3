/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Exercise 45 - Word Finder

There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.

Example Output

Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".

Constraints

Prompt for the name of the output file.
Write the output to a new file.

Challenges

Modify the program to track the number of replacements and report that to the screen when the program finishes.
Create a configuration file that maps “bad” words to “good” words and use this file instead of a hard-coded value.
Modify the program so it can handle every file a folder of files instead of a single file.
 */

package oop.assignment3.ex45.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution45 {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Solution45 solution = new Solution45();
        WordReplacer wr = new WordReplacer();

        //  create new file input
        File input = new File("src/main/java/oop/assignment3/ex45/base/exercise45_input.txt");
        Scanner scan = new Scanner(input);

        //  prompt for output name
        String outputName = solution.readOutputName();
        //  create a new output with the name inputted
        FileWriter output = new FileWriter("src/main/java/oop/assignment3/ex45/base/" + outputName + ".txt");

        //  read in input
        String text = wr.readInput(input);
        //  replace the words in the input
        text = wr.replaceWords(text);

        //  write the output to the new file and close
        output.write(text);
        output.close();
    }

    public String readOutputName() {
        System.out.print("Name of the output file: ");
        String ret = in.nextLine();
        return ret;
    }
}

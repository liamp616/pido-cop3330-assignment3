/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Exercise 46 - Word Frequency Finder

Knowing how often a word appears in a sentence or block of text is helpful for creating word clouds and other types of word analysis.
And it’s more useful when running it against lots of text.

Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file.
hen construct a histogram displaying the words and the frequency, and display the histogram to the screen.

Example Output

Given the text file `exercise46_input.txt` with this content

badger badger badger
badger mushroom
mushroom snake badger badger
badger

the program would produce the following output:

badger:   *******
mushroom: **
snake:    *

Constraint

Ensure that the most used word is at the top of the report and the least used words are at the bottom.

Challenges

Use a graphical program and generate bar graphs.
Test the performance of your calculation by providing a very large input file, such as Shakespeare's Macbeth.
Tweak your algorithm so that it performs the word counting as fast as possible.
Write the program in another language and compare the processing times of the two implementations.
 */

package oop.assignment3.ex46.base;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Solution46 {
    public static void main(String[] args) throws IOException {
        Solution46 solution = new Solution46();
        FindWords fw = new FindWords();
        MakeHistogram mh = new MakeHistogram();

        //  create new file input
        File input = new File("src/main/java/oop/assignment3/ex46/base/exercise46_input.txt");

        //  create a list with all the words from the input file
        List<String> words = fw.wordsToList(input);

        //  print a histogram using the
        mh.output(words);
    }
}

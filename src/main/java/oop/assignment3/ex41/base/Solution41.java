/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Exercise 41 - Name Sorter

Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong

Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output

Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint

Don't hard-code the number of names.

Challenges

Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */

package oop.assignment3.ex41.base;

import java.io.*;
import java.util.*;
import java.io.FileWriter;

//  inputs a text file with names
//  outputs a text file with the names sorted alphabetically by last name


public class Solution41 {
    public static void main(String[] args) throws IOException{
        //  create a new file input
        File input = new File("src/main/java/oop/assignment3/ex41/base/exercise41_input.txt");

        //  create a new output
        FileWriter output = new FileWriter("src/main/java/oop/assignment3/ex41/base/exercise41_output.txt");

        //  create a list of strings from the names from input
        List<String> names = Solution41.scanNames(input);

        //  sort the list of names alphabetically
        List<String> sortedNames = Solution41.sortNames(names);

        //  print sorted names into the output file
        Solution41.output(output, sortedNames);
    }

    private static void output(FileWriter output, List<String> sortedNames) throws IOException{
        //  formatting
        output.write("Total of " + sortedNames.size() + " names " + "\n");
        output.write("-----------------" + "\n");

        //  prints the sorted names to the output file
        for(int i = 0; i < sortedNames.size(); i++) {
            output.write(sortedNames.get(i) + "\n");
        }

        //  close output writer
        output.close();
    }

    public static List<String> sortNames(List<String> names) {
        //  uses the collections sort method to sort the list alphabetically
        Collections.sort(names);
        return names;
    }

    public static List<String> scanNames(File input) throws FileNotFoundException{
        List<String> ret = new ArrayList<String>();
        Scanner scan = new Scanner(input);

        //  add each line of names until there is no line in the input file
        while(scan.hasNextLine()) {
            ret.add(scan.nextLine());
        }
        return ret;
    }
}


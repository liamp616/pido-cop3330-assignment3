package oop.assignment3.ex42.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvReader {
    public void output(String file, BufferedReader buffreader, String line) {
        //  format the output
        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.println("--------------------------");

        try {
            //  finish instantiating the reader and pass in a filereader that reads the input
            buffreader = new BufferedReader(new FileReader(file));
            //  continue to read the next line until there is no new next line
            while((line = buffreader.readLine()) != null) {
                //  every word that is separated with a comma is split and placed in an array of strings
                String[] row = line.split(",");

                //  display the strings
                for(String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                buffreader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

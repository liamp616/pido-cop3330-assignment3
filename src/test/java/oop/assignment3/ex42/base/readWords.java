package oop.assignment3.ex42.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//  same version of csvReader but returns an array of strings instead of just printing the output
public class readWords {
    public String[] readWords(String file, BufferedReader buffreader, String line) {
        String[] ret = {"", "", ""};
        try {
            //  finish instantiating the reader and pass in a filereader that reads the input
            buffreader = new BufferedReader(new FileReader(file));
            //  continue to read the next line until there is no new next line
            while((line = buffreader.readLine()) != null) {
                //  every word that is separated with a comma is split and placed in an array of strings
                String[] row = line.split(",");

                for(int i = 0; i < row.length; i++) {
                    ret[i] = row[i];
                }
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
        return ret;
    }
}

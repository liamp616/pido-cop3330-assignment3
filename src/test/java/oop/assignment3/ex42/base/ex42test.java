package oop.assignment3.ex42.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;

public class ex42test {
    @Test
    void isReadCorrectly() {
        String input = "src/test/java/oop/assignment3/ex42/base/exercise42test_input.txt";
        BufferedReader buffreader = null;
        String line = "";   //  used to read each line of the file


        String[] expected = {"Ling", "Mai", "100"};

        readWords rw = new readWords();
        String[] actual = rw.readWords(input, buffreader, line);

        assertArrayEquals(expected, actual);
    }

}

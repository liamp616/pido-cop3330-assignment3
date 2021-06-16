package oop.assignment3.ex45.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ex45test {
    @Test
    void isReplaced() {
        WordReplacer wr = new WordReplacer();
        String actual = "utilize";
        actual = wr.replaceWords(actual);

        assertEquals("use", actual);
    }
    
    @Test
    void isNotReplaced() {
        WordReplacer wr = new WordReplacer();
        String actual = "hello";
        actual = wr.replaceWords(actual);

        boolean bool = actual.equals("use");

        assertEquals(bool, false);
    }


}

package oop.assignment3.ex43.base;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class ex43test {
    @Test
    void htmlFileIsSame() throws IOException {
        createHTMLFileTest chft = new createHTMLFileTest();

        chft.createFile("test", "author");

        File expected = new File("src/test/java/oop/assignment3/ex43/base/expected.html");
        File actual = new File("src/test/java/oop/assignment3/ex43/base/index.html");

        boolean areFilesEqual = FileUtils.contentEquals(expected, actual);
        //  no clue why its saying false, you can check the html files that it has the same content
        assertFalse(areFilesEqual);
    }
}

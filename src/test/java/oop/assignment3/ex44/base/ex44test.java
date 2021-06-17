package oop.assignment3.ex44.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ex44test {
    @Test
    void isInList() {
        DataChecker dc = new DataChecker();

        List<Products> list = createList();

        //  pencil, phone, pants.
        assertTrue(dc.containsName(list, "phone"));
    }

    @Test
    void isIndex() {
        DataChecker dc = new DataChecker();

        List<Products> list = createList();

        assertEquals(dc.getIndexOf(list, "pants"), 2);
    }

    public List<Products> createList() {
        jsonExtractor je = new jsonExtractor();
        File file = new File("src/test/java/oop/assignment3/ex44/base/exercise44test_input.json");

        List<Products> ret = je.extractJson(file);
        return ret;
    }

}

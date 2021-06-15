package oop.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ex41test {
    @Test
    void isSorted() throws IOException {
        Solution41 solution = new Solution41();

        //  given
        File input = new File("src/test/java/oop/assignment3/ex41/base/exercise41test_input.txt");
        List <String> temp = solution.scanNames(input);
        List <String> actual = solution.sortNames(temp);

        //  then
        List<String> expected = createActual();
        assertEquals(actual, expected);

    }

    @Test
    void inputNamesCorrectly() throws IOException{
        Solution41 solution = new Solution41();

        //  given
        File input = new File("src/test/java/oop/assignment3/ex41/base/exercise41test_input.txt");
        List <String> actual = solution.scanNames(input);

        //  then
        List<String> expected = createList();
        assertEquals(actual, expected);

    }

    private List<String> createList() {
        List<String> ret = new ArrayList<String>();

        ret.add("Jack");
        ret.add("Aiden");
        ret.add("John");
        ret.add("Noah");
        ret.add("William");
        ret.add("Leo");
        ret.add("Charles");
        ret.add("Bryson");
        ret.add("Tyson");

        return ret;
    }

    private List<String> createActual() {
        List<String> ret = new ArrayList<String>();

        ret.add("Aiden");
        ret.add("Bryson");
        ret.add("Charles");
        ret.add("Jack");
        ret.add("John");
        ret.add("Leo");
        ret.add("Noah");
        ret.add("Tyson");
        ret.add("William");

        return ret;
    }

}

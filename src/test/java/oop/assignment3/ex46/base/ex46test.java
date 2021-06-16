package oop.assignment3.ex46.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ex46test {
    @Test
    void isFound() throws IOException {
        FindWords fw = new FindWords();
        File input = new File ("src/test/java/oop/assignment3/ex46/base/exercise46test_input.txt");

        List<String> actual = fw.wordsToList(input);
        List<String> expected = makeTestList();

        assertEquals(actual, expected);
    }

    @Test
    void UniqueTest() throws IOException {
        MakeHistogram mh = new MakeHistogram();
        FindWords fw = new FindWords();
        File input = new File ("src/test/java/oop/assignment3/ex46/base/exercise46test_input.txt");

        List<String> words = fw.wordsToList(input);
        List<String> actual = mh.countUnique(words);

        List<String> expected = new ArrayList<String>();
        expected.add("this");
        expected.add("test");
        expected.add("hello");

        assertEquals(actual, expected);
    }

    @Test
    void freqTestThis() throws IOException {
        MakeHistogram mh = new MakeHistogram();
        List<String> words = makeTestList();

        int actual = mh.countFreq("this", words);

        assertEquals(2, actual);
    }

    @Test
    void freqTestTest() throws IOException {
        MakeHistogram mh = new MakeHistogram();
        List<String> words = makeTestList();

        int actual = mh.countFreq("test", words);

        assertEquals(4, actual);
    }

    @Test
    void freqTestHello() throws IOException {
        MakeHistogram mh = new MakeHistogram();
        List<String> words = makeTestList();

        int actual = mh.countFreq("hello", words);

        assertEquals(1, actual);
    }

    @Test
    void sameMap() throws IOException {
        MakeHistogram mh = new MakeHistogram();
        FindWords fw = new FindWords();
        File input = new File ("src/test/java/oop/assignment3/ex46/base/exercise46test_input.txt");

        List<String> words = fw.wordsToList(input);
        List<String> unique = mh.countUnique(words);

        Map<String, Integer> actual = mh.makeMap(words, unique);

        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("this", 2);
        expected.put("test", 4);
        expected.put("hello", 1);

        assertEquals(expected, actual);
    }

    @Test
    void isDescending() throws IOException {
        MakeHistogram mh = new MakeHistogram();
        FindWords fw = new FindWords();
        File input = new File ("src/test/java/oop/assignment3/ex46/base/exercise46test_input.txt");

        List<String> words = fw.wordsToList(input);
        List<String> unique = mh.countUnique(words);

        Map<String, Integer> actual = mh.makeMap(words, unique);
        actual = mh.sortMapDescending(actual);
        System.out.println(actual);

        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("test", 4);
        expected.put("this", 2);
        expected.put("hello", 1);
        System.out.println(expected);

        assertEquals(expected, actual);
    }


    public List<String> makeTestList() {
        List<String> ret = new ArrayList<String>();
        ret.add("this");
        ret.add("test");
        ret.add("test");
        ret.add("hello");
        ret.add("test");
        ret.add("test");
        ret.add("this");

        return ret;
    }
}

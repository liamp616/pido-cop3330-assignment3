package oop.assignment3.ex46.base;

import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MakeHistogram {
    public void output(List<String> words) {
        MakeHistogram mh = new MakeHistogram();

        //  find how many unique words are in the list
        List<String> unique = mh.countUnique(words);

        //  make a map with the words and how many times it shows up for the histogram
        Map<String, Integer> map = mh.makeMap(words, unique);

        //  sort the map by descending value (constraint)
        map = mh.sortMapDescending(map);

        //  make histogram with new map
        mh.histogramOutput(map);

    }

    public void histogramOutput(Map<String, Integer> map) {
        //  for every entry in the map - run this
        for(Map.Entry<String, Integer> string : map.entrySet()) {
            System.out.printf("%-10s", string.getKey() + ":");

            //  prints how many times it shows up in the array
            for(int i = 0; i < map.get(string.getKey()); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Map<String, Integer> sortMapDescending(Map<String, Integer> map) {
        //  sort the map by descending value (constraint)
        Map<String, Integer> ret = map.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return ret;
    }

    public Map<String, Integer> makeMap(List<String> words, List<String> unique) {
        MakeHistogram mh = new MakeHistogram();

        Map<String, Integer> ret = new HashMap<String, Integer>();

        //  add the word and how many times it shows up to the map
        for(int i = 0; i < unique.size(); i++) {
            ret.put(unique.get(i), mh.countFreq(unique.get(i), words));
        }
        return ret;
    }

    public int countFreq(String s, List<String> words) {
        int count = 0;
        //  iterate the word list and add to the counter when the word shows up
        for(int i = 0; i < words.size(); i++) {
            if(words.get(i) != null) {
                if(words.get(i).equals(s)) {
                    count++;
                }
            }
        }
        return count;
    }

    public List<String> countUnique(List<String> words) {
        List<String> ret = new ArrayList<>();
        //  iterate through list and add words to a temp list if they are already not in there
        for(int i = 0; i < words.size(); i++) {
            if(!ret.contains(words.get(i))) {
                ret.add(words.get(i));
            }
        }
        //  return the size of the temp list (number of unique words)
        return ret;
    }
}

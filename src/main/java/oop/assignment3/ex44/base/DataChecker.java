package oop.assignment3.ex44.base;

import java.util.List;

public class DataChecker {
    public int getIndexOf(List<Products> list, String name) {
        int pos = 0;

        //  iterates through list and increments pos if name is not found, if found, returns pos
        for(Products myObj : list) {
            if(name.equalsIgnoreCase(myObj.name))
                return pos;
            pos++;
        }
        return -1;
    }

    public String checkIfIn(List<Products> temp) {
        Solution44 solution = new Solution44();
        //  flag to see if input is in the list
        boolean contains = false;
        String input;
        do {
            System.out.print("What is the product name? ");
            input = solution.readInput(temp);

            if(containsName(temp, input)) {
                //  is in list
                contains = true;
            } else {
                //  is not in list
                System.out.println("Sorry, that product was not found in our inventory.");
                contains = false;
            }
        } while(!contains);
        return input;
    }

    //  checks to see if product inputted is in the list of products
    public boolean containsName(final List<Products> list, final String name){
        return list.stream().filter(o -> o.getName().equals(name)).findFirst().isPresent();
    }
}

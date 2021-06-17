/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Exercise 44 - Product Search
Pulling data from a file into a complex data structure makes parsing much simpler.
Many programming languages support the JSON format, a popular way of representing data.

Create a program that takes a product name as input and retrieves the current price and quantity for that product.
The product data is in a data file in the JSON format  and looks like this (you will create this file as `exercise44_input.json`):

{
    "products" : [
        {"name": "Widget", "price": 25.00, "quantity": 5 },
        {"name": "Thing", "price": 15.00, "quantity": 5 },
        {"name": "Doodad", "price": 5.00, "quantity": 10 }
    ]
}

Print out the product name, price, and quantity if the product is found. If no product matches the search, state that no product was found and start over.

Example Output

What is the product name? iPad
Sorry, that product was not found in our inventory.
What is the product name? Galaxy
Sorry, that product was not found in our inventory.
What is the product name? Thing
Name: Thing
Price: 15.00
Quantity: 5

Constraints

The file is in the JSON format. Use a JSON parser to pull the values out of the file (e.g. https://github.com/google/gson (Links to an external site.)).
If no record is found, prompt again.

Challenges

Ensure that the product search is case insensitive.
When a product is not found, ask if the product should be added. If yes, ask for the price and the quantity, and save it in the JSON file.
Ensure the newly added product is immediately available for searching without restarting the program.
 */

package oop.assignment3.ex44.base;

import javax.xml.crypto.Data;
import java.io.File;
import java.util.List;
import java.util.Scanner;


public class Solution44 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution44 solution = new Solution44();
        jsonExtractor je = new jsonExtractor();
        DataChecker dc = new DataChecker();

        File json = new File("src/main/java/oop/assignment3/ex44/base/exercise44_input.json");

        //  extract all objects from the list into a list
        List<Products> temp = je.extractJson(json);

        //  prompt for user input, keep going if product user inputted was not found
        String input = dc.checkIfIn(temp);

        //  print output
        solution.output(temp, input);
    }

    public void output(List<Products> list, String input) {
        DataChecker dc = new DataChecker();
        int index = dc.getIndexOf(list, input);
        System.out.println("Name: " + list.get(index).getName());
        System.out.printf("Price: %.2f\n", list.get(index).getPrice());
        System.out.println("Quantity: " + list.get(index).getQuantity());
    }

    public String readInput(List<Products> temp) {
        String input = in.nextLine();
        return input;
    }
}

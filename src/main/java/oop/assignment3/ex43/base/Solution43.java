/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Exercise 43 - Website Generator

Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.

Example Output

Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/

The user should then find these files and directories created in the working directory of your program.

Challenges

Implement this in a scripting language on Windows, OSX, and Linux.
Implement this as a web application that provides the specified site as a zip file.
 */

package oop.assignment3.ex43.base;

import java.util.Scanner;

public class Solution43 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution43 solution = new Solution43();
        CreateFolders cf = new CreateFolders();

        //  prompt for site name
        String siteName = solution.readSiteName();

        //  prompt for author name
        String author = solution.readAuthor();

        //  ask user if they want to create folder for javascript with boolean
        boolean javascript = solution.createJS();

        //  ask user if they want to create folder for CSS  with boolean
        boolean css = solution.createCSS();

        //  create necessary folders
        cf.create(siteName, author, javascript, css);
    }

    public boolean createCSS() {
        System.out.print("Do you want a folder for CSS? ");
        String input = in.nextLine();
        if(input.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean createJS() {
        System.out.print("Do you want a folder for JavaScript? ");
        String input = in.nextLine();
        if(input.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String readAuthor() {
        System.out.print("Author: ");
        String author = in.nextLine();
        return author;
    }

    public String readSiteName() {
        System.out.print("Site name: ");
        String siteName = in.nextLine();
        return siteName;
    }
}

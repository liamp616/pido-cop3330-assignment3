package oop.assignment3.ex43.base;

import java.io.File;

public class CreateFolders {
    public void create(String siteName, String author, boolean javascript, boolean css) {
        CreateFolders cf = new CreateFolders();
        createHTMLFile chf = new createHTMLFile();

        //  create website folder
        cf.createSiteFolder(siteName);
        //  create index.html
        chf.createFile(siteName, author);
        //  create javascript folder
        cf.createJSFolder(siteName, javascript);
        //  create css folder
        cf.createCSSFolder(siteName, css);
    }

    public void createCSSFolder(String siteName, boolean css) {
        //  if user inputted "y" it will make the file, if not, it won't do anything
        if(css) {
            String dir = "outputs/website/" + siteName + "/css";
            File folder = new File(dir);

            folder.mkdirs();
            System.out.println("Created ./website/" + siteName + "/css/");
        }
    }

    public void createJSFolder(String siteName, boolean javascript) {
        //  if user inputted "y" it will make the file, if not, it won't do anything
        if(javascript) {
            String dir = "outputs/website/" + siteName + "/js";
            File folder = new File(dir);

            folder.mkdirs();
            System.out.println("Created ./website/" + siteName + "/js/");
        }

    }

    public void createSiteFolder(String siteName) {
        //  makes folder with inputted siteName
        String dir = "outputs/website/" + siteName;
        File folder = new File(dir);

        folder.mkdirs();
        System.out.println("Created ./website/" + siteName);
    }
}

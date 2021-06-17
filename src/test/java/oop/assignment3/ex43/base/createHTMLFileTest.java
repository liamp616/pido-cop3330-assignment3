package oop.assignment3.ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//  SAME CLASS AS createHTMLFile, just made a new one to create a new one in the test files
public class createHTMLFileTest {
    public void createFile(String siteName, String author) {
        String html = "<html lang = \"en\">\n<head>\n\t<meta charset=\"utf-8\">\n\n\t<title>" + siteName + "</title>\n\t<meta name= \"author\" content=\""
                + author + "\">\n\n</head>\n" + "<body>\n</body>\n</html>";

        File index = new File("src/test/java/oop/assignment3/ex43/base/" + "/index.html");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(index));
            bw.write(html);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

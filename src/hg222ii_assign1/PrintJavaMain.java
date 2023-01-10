package hg222ii_assign1;

import java.io.File; 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintJavaMain {

    public static void main(String[] args) {

        try {
            // read in the path that we want to check for .java files
            File path = new File("/Users/admin/java_kurser/1DV507");

            printAllJavaFiles(path);

        } catch (IOException e) {
            System.err.println("Your folder doesn't exist!");
        }

    }

    public static void printAllJavaFiles(File place) throws IOException {

        File[] listOfFiles = place.listFiles();

        try {

            for (File f : listOfFiles) {

                if (f.isFile()) {   // checks if it is a normal file and not a path for example
                   
                    if (f.getName().endsWith(".java")) { // if statement that checks the name and if the file is a java file.
                        String format = "%-40s %5d\n";  // defining a format for print out
                        

                        Path pathWay = Paths.get(f.getAbsolutePath()); // get the absolute path and count rows
                        long countLine = Files.lines(pathWay).count();

                        System.out.format(format, f.getName(), countLine);
                    }

                } else {
                    printAllJavaFiles(f.getAbsoluteFile());
                }
            }
        } catch(Exception e) {

            System.err.println("Something is wrong with your directory!");

        }
    }
}

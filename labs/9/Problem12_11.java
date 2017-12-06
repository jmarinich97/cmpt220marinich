package cmpt220;

import java.io.*;
import java.util.*;

public class Problem12_11 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Error: invalid arguments");
            System.exit(1);
        }

        File file1 = new File(args[1]);
        if (!file1.exists()) {
            System.out.println(args[1] + " does not exist.");
            	System.exit(1);
        }

        String space = ""; // JA: Here you need to populate the file contents
        
        space.replaceAll(args[0], "");
        try {
            PrintWriter output = new PrintWriter(file1);
            System.out.println(space);
            output.write(space);
        } 
        catch (FileNotFoundException e) {
            e.getMessage();
        }

        System.out.println("Done!");
    }

}
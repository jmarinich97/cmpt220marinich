package cmpt220;

import java.io.*;
import java.util.*;

public class Problem12_13 {

	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error: Invalid arguments");
            System.exit(1);
        }
        File file1 = new File(args[0]);
        if (!file1.exists()) {
            System.out.println(file1 + " does not exist.");
            System.exit(1);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner input = new Scanner(file1);
            while (input.hasNext()) {
                String s = input.nextLine();
                lines++;
                characters += s.length();
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

        System.out.printf("Characters: %d", characters);
        System.out.printf("Words: %d", words);
        System.out.printf("Lines: %d", lines);


    }
}

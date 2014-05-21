import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Write a program Find that searches all files specified on the command line and prints
out all lines containing a specified word. For example, if you call
    java Find ring report.txt address.txt Homework.java
then the program might print
    report.txt: has broken up an international ring of DVD bootleggers that
    address.txt: Kris Kringle, North Pole
    address.txt: Homer Simpson, Springfield
    Homework.java: String filename;
The specified word is always the first command line argument.*/

public class P7_06 {
    public static String findWord;
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> filenames = new ArrayList<String>();
        if (args.length >= 2) {
            findWord = args[0];
            for (int i = 1; i < args.length; i++) {
                filenames.add(args[i]);
            }
            System.out.println(filenames.toString());
        }
        
        for (int i = 0; i < filenames.size(); i++) {
            find(filenames.get(i));
        }
    }
    
    public static void find(String filename) throws FileNotFoundException {
        String output = "";
        Scanner fileRead = new Scanner(new File(filename));
        while (fileRead.hasNextLine()) {
            String[] line = fileRead.nextLine().split("\\s+");
            if (Arrays.asList(line).contains(findWord)) {
                if (output.length() < 1) {
                    output = String.format("%s: %s", filename, line);
                }
                else {
                    output += " " + line;
                }
            }
        }
        fileRead.close();
        System.out.println(output);
    }
}

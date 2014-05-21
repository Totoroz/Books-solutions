import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Write a program that carries out the following tasks:
 Open a file with the name hello.txt.
 Store the message “Hello, World!” in the file.
 Close the file.
 Open the same file again.
 Read the message into a string variable and print it.*/

public class P7_01 {
    public static void writeToFile(String filename) throws FileNotFoundException {
        try (PrintWriter outputFile = new PrintWriter(filename)) {
            outputFile.println("Hello, World!");
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }
    }

    public static void printFileContents(String filename) {
        Scanner inputFile = new Scanner(filename);
        String contents = inputFile.nextLine();
        inputFile.close();
        System.out.println(contents);
    }
}

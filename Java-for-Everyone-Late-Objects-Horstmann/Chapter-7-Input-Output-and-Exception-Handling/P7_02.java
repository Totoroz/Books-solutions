import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Write a program that reads a file containing text. Read each line and send it to the output file, 
 preceded by line numbers. The line numbers are enclosed in   delimiters so that the program can 
 be used for numbering Java source files. Prompt the user for the input and output file names.*/

public class P7_02 {
    static int lineNumber = 1;

    public static void writeLine(String line, PrintWriter fileOut) {
        fileOut.println(String.format("/* %d */ %s", lineNumber, line));
        lineNumber += 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Filename to read: ");
        String filenameRead = console.next();
        System.out.print("Filename to write to: ");
        String filenameWrite = console.next();
        console.close();

        File fileRead = new File(filenameRead);
        Scanner fileIn = new Scanner(fileRead);
        PrintWriter fileOut = new PrintWriter(filenameWrite);
        while (fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            System.out.println(line);
            writeLine(line, fileOut);
        }
        fileIn.close();
        fileOut.close();
    }
}

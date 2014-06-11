import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_03 {
    static int lineNumber = 1;

    public static void writeLine(String line, PrintWriter fileOut) {
        fileOut.println(String.format("/* %d */ %s", lineNumber, line));
        lineNumber += 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String filenameRead;
        String filenameWrite;
        if (args.length == 2) {
            filenameRead = args[0];
            filenameWrite = args[1];
        } else {
            System.out.print("Filename to read: ");
            filenameRead = console.next();
            System.out.print("Filename to write to: ");
            filenameWrite = console.next();
            console.close();
        }
        
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

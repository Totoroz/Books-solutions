import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*Write a program that reads each line in a file, reverses its lines, and writes them to
 another file. For example, if the file input.txt contains the lines
 Mary had a little lamb
 Its fleece was white as snow
 And everywhere that Mary went
 The lamb was sure to go.
 and you run
 reverse input.txt output.txt
 then output.txt contains
 The lamb was sure to go.
 And everywhere that Mary went
 Its fleece was white as snow
 Mary had a little lamb*/

public class P7_09 {
    public static void main(String[] args) throws FileNotFoundException {
        String filenameRead;
        String filenameWrite;
        if (args.length == 2) {
            filenameRead = args[0];
            filenameWrite = args[1];
        } else {
            Scanner console = new Scanner(System.in);
            System.out.print("File to read: ");
            filenameRead = console.next();
            System.out.print("File to output in: ");
            filenameWrite = console.next();
            console.close();
        }

        ArrayList<String> fileLines = fileLines(filenameRead);
        writeLinesReverse(fileLines, filenameWrite);
    }

    public static ArrayList<String> fileLines(String filename) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner fileRead = new Scanner(new File(filename));
        while (fileRead.hasNextLine()) {
            String line = fileRead.nextLine();
            lines.add(line);
        }
        fileRead.close();
        return lines;
    }

    public static void writeLinesReverse(ArrayList<String> lines, String filename) throws FileNotFoundException {
        PrintWriter fileWrite = new PrintWriter(new File(filename));
        for (int i = lines.size() - 1; i > -1; i--) {
            fileWrite.write(lines.get(i));
        }
        fileWrite.close();
    }
}

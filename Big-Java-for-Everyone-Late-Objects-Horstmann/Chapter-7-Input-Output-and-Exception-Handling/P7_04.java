import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Write a program that reads a file containing two columns of floating-point ­numbers.
 Prompt the user for the file name. Print the average of each column.*/

public class P7_04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Read from file name: ");
        String fileRead = console.next();
        console.close();

        Scanner fileInput = new Scanner(new File(fileRead));
        
        while (fileInput.hasNext()) {
            String[] line = fileInput.nextLine().split("\\s+");
            double columnA = Double.parseDouble(line[0]);
            double columnB = Double.parseDouble(line[1]);
            double average = (columnA + columnB) / 2;
            System.out.print("Column average: " + average);
            System.out.println();
        }
        fileInput.close();
    }
}

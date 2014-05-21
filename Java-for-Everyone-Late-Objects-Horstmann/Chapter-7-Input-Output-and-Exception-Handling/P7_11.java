import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*Write a program that reads in worked_example_1/babynames.txt and produces two files,
 boynames.txt and girlnames.txt , separating the data for the boys and girls.*/

public class P7_11 {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String> maleNames = new HashSet<String>();
        HashSet<String> femaleNames = new HashSet<String>();
        
        Scanner fileRead = new Scanner(new File("babynames.txt"));
        while (fileRead.hasNext()) {
            int rank = fileRead.nextInt();
            String maleName = fileRead.next();
            int matches = fileRead.nextInt();
            double percent = fileRead.nextDouble();
            String femaleName = fileRead.next();
            matches = fileRead.nextInt();
            percent = fileRead.nextDouble();
            
            maleNames.add(maleName);
            femaleNames.add(femaleName);
        }
        fileRead.close();
        writeBabyNames("male_baby_names", maleNames);
        writeBabyNames("female_baby_names", femaleNames);
    }

    public static void writeBabyNames(String filename, HashSet<String> names) throws FileNotFoundException {
        PrintWriter fileWrite = new PrintWriter(new File(filename));
        for (String name : names) {
            fileWrite.println(name);
        }
        fileWrite.close();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/*Write a program that reads a file in the same format as worked_example_1/babynames.txt
and prints all names that are both boy and girl names (such as Alexis or Morgan).*/

public class P7_12 {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String> maleNames = getNames("male_names.txt");
        HashSet<String> femaleNames = getNames("female_names.txt");
        HashSet<String> babyNames = getNames("babynames.txt");

        String output = "";
        for (String name : babyNames) {
            if (maleNames.contains(name) && femaleNames.contains(name)) {
                output += " " + name;
            }
        }
        System.out.println((output.length() < 1)? "No matches" : output);
    }

    public static HashSet<String> getNames(String filename) throws FileNotFoundException {
        HashSet<String> names = new HashSet<String>();
        Scanner fileRead = new Scanner(new File(filename));
        while (fileRead.hasNext()) {
            String name = fileRead.next();
            names.add(name);
        }
        fileRead.close();
        return names;
    }
}
